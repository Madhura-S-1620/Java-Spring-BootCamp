/* eslint-disable prefer-const */
import axios from "axios"
export class StudentsService{
 
    private static URL:string = "https://github.com/Madhura-S-1620/JSON-FILES/student.json"
 
    public static getAllStudents(){
 
        // eslint-disable-next-line @typescript-eslint/no-unused-vars
        let StudentURL:string = `${this.URL}/students`
        return axios.get(StudentURL)
    }
}