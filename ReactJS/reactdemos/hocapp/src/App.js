/*import React,{Component} from "react";
 
import ParentComponent from "./components/ParentComponent";
 
class App extends Component{
 
  render()
  {
    return(
      <div>
        <h4>Higher Order component Example!!</h4>
        <p>Main App Content</p>
      </div>
    )
  }
}
App=ParentComponent(App);
export default App;*/

import React,{Component} from "react";
 
import ParentComponent from "./components/ParentComponent";
 
class App extends Component{
  title ="New title" ;
 
 
  render()
  {
    return(
      <div>
        <h4>Higher Order component Example!!</h4>
        <p>Main App Content</p>
        {this.title}
      </div>
    )
  }
}
App=ParentComponent(App);
export default App;