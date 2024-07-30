import React ,{useState}from "react";
 
interface IState{
    bookname:String;
    author:String;
}
 
interface IProps{
    stname:string;
    age:number;
}
let FunctionComp:React.FC<IProps> = ({stname,age})=>{
 
    const [state,setState] = useState<IState>({bookname:"Complete Reference",author:"Herbert Shield"})
    return (
        <>
        <h1 className="bg-success p-1 text-white text-center">
            This is Functional Component Area!!!
 
        </h1>
        <div className="border px-4 bg-light mb-4">
        <h3>
            Student Name is : <strong>{stname}</strong>
            Student Age is : <strong>{age}</strong>
 
        </h3>
        </div>
        <div className="col-md-4 bg-success">
        <h1>Values which are accessed from State are:</h1>
        <h3>BookName is :{state.bookname}</h3>
        <h3>Author is :{state.author}</h3>
 
        </div>
        </>
    );
};
export default FunctionComp;