import React,{createRef} from "react";
 
interface MessageProps{
 
}
function SecondComponent(props:MessageProps){
    const inputRef = createRef<HTMLInputElement>();
    return (
        <div>
            <input type="text" ref={inputRef} />
        </div>
    );
 
};
 
export default SecondComponent;
