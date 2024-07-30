import React,{Component} from "react";
import { useState } from "react";
interface IState{
    bookname: String;
    author : String;
}
interface IProps{
    empname : String;
    age : number ;
}
export default class ClassComp extends Component<IProps,IState>{
 
   constructor(props:IProps){
    super(props);
    this.state={
        bookname:"React Js",
        author: "Orielly"
 
    }
 
}
   render(){
 
    const { empname, age} = this.props;
    const { bookname,author }= this.state;
    return(
        <>
        <h1 className="bg-dark p-1 text-white text-center"> This is Class Component!!!</h1>
        <div className="border px-4 bg-light mb-4">
            <h3>
             Employee Name is:<strong>{empname}</strong>  <br/>
             Employee Age is:<strong>{age}</strong>  <br/>
 
            </h3>
 
        </div>
        <div className="card bg-light p-3">
            <h2>Class Component State values are:</h2>
            <h3>Book Name is: {bookname}</h3>
            <h3>Author is: {author}</h3>
 
        </div>
       
        </>
    );
   }
       
   }
 