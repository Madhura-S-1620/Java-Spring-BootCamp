import React,{useRef} from "react";
 
 
 
const FirstComponent : React.FC = () =>{
    const inputRef = useRef<HTMLInputElement>(null);
 
    const handleClick = () =>{
        if(inputRef.current){
            console.log("Input value is:",inputRef.current.value);
            inputRef.current.focus();
        }
    };
    return (
        <div>
            <input type="text" ref={inputRef} />
            <button onClick={handleClick}>Enter</button>
        </div>
    );
};
export default FirstComponent;