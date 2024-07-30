import { useState } from 'react'
import FirstComponent from './components/FirstComponent'
 
function App(this: any) {
  //const [count, setCount] = useState(0)
 
  return (
    <>
    <div>
 
    <FirstComponent/>
   
        <label htmlFor={'data'}>Data</label>
       
     </div>
    </>
  )
}
 
export default App