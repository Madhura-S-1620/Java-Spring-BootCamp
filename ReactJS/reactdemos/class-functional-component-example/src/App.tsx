
import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ClassComp from './components/ClassComp'
import FunctionComp from './components/FunctionComp'
 
function App() {
 
 
  return (
   <>
   <div className="container"></div>
      <ClassComp empname="Suraj Sharma" age={30} />
      <FunctionComp stname="Adil Nath" age={28} />
 
   </>
  )
}
 
export default App
 