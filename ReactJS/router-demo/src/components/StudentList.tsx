import React, { useState } from "react";
import { StudentService } from "../services/StudentService";
import { IStudent } from "./../models/IStudent";
 
interface IState {
  students: IStudent[];
}
 
const StudentList: React.FC = () => {
  const [state, setState] = useState<IState>({
    students: StudentService.getAllStudents(),
  });
  return (
<>
<div className="container">
<div className="row w-50 mt-4">
<h1>Looping / Iteration</h1>
<table className="table">
<thead>
<tr>
<th scope="col">	
no</th>
<th scope="col">Student Name</th>
<th scope="col">Course</th>
<th scope="col">Age</th>
</tr>
</thead>
<tbody>
              {state.students.length > 0 &&
                state.students.map((student) => (
<tr key={student.rno}>: 
<td>{student.rno}</td>
<td>{student.stname}</td>
<td>{student.course}</td>
<td>{student.age}</td>
</tr>
                ))}
</tbody>
</table>
</div>
</div>
</>
  );
};
 
export default StudentList;
