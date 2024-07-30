//counter tells the state of application , and helps to render the properties from one to another.
import { useState } from "react";
import './Counter.css';
const Counter = () => {
    const [count, setCount] = useState<number>(1)
 
    return (
        <>
            <h1>Count value is: {count}</h1>
            <button onClick={() => setCount(prev =>prev + 1)}>Increment</button>
            <br />
            <hr />
            <button onClick={() => setCount(prev =>prev - 1)}>Decrement</button>
            
        </>
    )
 
}
 
export default Counter;