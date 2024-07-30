/*import { Routes, Route } from "react-router-dom";
import "./App.css";
import About from "./components/About";
import StudentList from "./components/StudentList";
import Students from "./components/Students";
 
import Login from "./components/Login";
import Navabr from "./components/Navbar";
import StudentDetail from "./components/StudentDetail";
 
function App() {
  return (
<>
<Navabr />
<Routes>
<Route path="/" element={<Students />} />
<Route path="/Students/:id" element={<StudentDetail />} />
<Route path="/about" element={<About />} />
<Route path="/login" element={<Login />} />
</Routes>
</>
  );
}
 
export default App;*/

import { Routes, Route } from "react-router-dom";
import "./App.css";
import About from "./components/About";
import StudentList from "./components/StudentList";
import Students from "./components/Students";
import Login from "./components/Login";
import Navbar from "./components/Navbar"; // Fixed typo
import StudentDetail from "./components/StudentDetail";

function App() {
  return (
    <>
      <Navbar /> {/* Fixed typo */}
      <Routes>
        <Route path="/" element={<Students />} />
        <Route path="/students/:id" element={<StudentDetail />} /> {/* Consistent path */}
        <Route path="/about" element={<About />} />
        <Route path="/login" element={<Login />} />
      </Routes>
    </>
  );
}

export default App;
