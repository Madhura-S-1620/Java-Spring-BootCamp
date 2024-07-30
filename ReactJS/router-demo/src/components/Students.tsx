import React, { useState, useEffect } from "react";
import { StudentsService } from "../services/StudentsService";
import { Link } from "react-router-dom";
import { Istudents } from "../models/IStudents"; // Make sure this import is correct

interface IState {
  loading: boolean;
  students: Istudents[];
  errorMsg: string;
}

const Students: React.FC = () => {
  const [state, setState] = useState<IState>({
    loading: false,
    students: [] as Istudents[],
    errorMsg: "",
  });

  // Network request
  useEffect(() => {
    const fetchData = async () => {
      setState((prevState) => ({ ...prevState, loading: true }));
      try {
        const res = await StudentsService.getAllStudents();
        setState((prevState) => ({
          ...prevState,
          loading: false,
          students: res.data,
        }));
      } catch (err: any) { // Adjusted to handle different error structures
        let errorMessage = "An error occurred";
        if (err.response && err.response.data && err.response.data.message) {
          errorMessage = err.response.data.message;
        } else if (err.message) {
          errorMessage = err.message;
        }
        setState((prevState) => ({
          ...prevState,
          loading: false,
          errorMsg: errorMessage,
        }));
      }
    };

    fetchData();
  }, []);

  const { loading, students, errorMsg } = state;

  return (
    <div className="container">
      <h1>Data From APIs</h1>
      {errorMsg && <p>{errorMsg}</p>}
      {loading && <h1>Loading...</h1>}
      <table className="table table-striped">
        <thead>
          <tr>
            <td>Id</td>
            <td>Name</td>
            <td>User Name</td>
            <td>Email</td>
          </tr>
        </thead>
        <tbody>
          {students.length > 0 &&
            students.map((student) => (
              <tr key={student.id}>
                <td>{student.id}</td>
                <td>
                  <Link to={`students/${student.id}`} className="text-decoration-none">
                    {student.name}
                  </Link>
                </td>
                <td>{student.username}</td>
                <td>{student.email}</td>
              </tr>
            ))}
        </tbody>
      </table>
    </div>
  );
};

export default Students;
