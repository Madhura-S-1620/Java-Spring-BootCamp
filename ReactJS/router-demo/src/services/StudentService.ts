import { IStudent } from "../models/IStudent";
 
export class StudentService{
    private static students: IStudent[]=[
        {rno:1,stname:"Ankita",course:"Java",age:22},
        {rno:2,stname:"Samiksha",course:"React",age:22},
        {rno:3,stname:"Nupur",course:"Mysql",age:22},
        {rno:4,stname:"Madhura",course:"Angular",age:22}
    ]
 
    public static getAllStudents()
    {
        return this.students;
    }
}