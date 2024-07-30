import React, {useState} from "react";
 
// eslint-disable-next-line @typescript-eslint/no-unused-vars
interface IState{
    name : string;
    title : string;
}
 
const About : React.FC = () => {
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    const [state,setState] = useState<IState>({
        name : "AksharInfo",
        title: "Boot Camp",
    });
 
    return(
        <>
        <h1 className="bg-success p-1 text-white text-center">
            Functional Component
        </h1>
        <div className="border px-4 bg-light mb-4"></div>
        <div className="col-md4 card p-2">
            <h1>Values from State</h1>
            <h4>Name: {state.name}</h4>
            <h4>Title: {state.title}</h4>
 
        </div>
        </>
    );
};
export default About;