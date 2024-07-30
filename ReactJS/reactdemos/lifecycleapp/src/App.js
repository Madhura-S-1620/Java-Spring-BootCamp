import React from 'react';
import CheckDate from './component/CheckDate';

const App = () => {
  return (
    <div className="container">
      <h1>Welcome to the Date Checker App</h1>
      <CheckDate />
    </div>
  );
};

export default App;

/*import React from "react";
import SimpleComponent from "./component/SimpleComponent";
 
class App extends React.Component{
  state = {display:true};
  remove = () =>{
    this.setState({display:false});
  }
  render(){
    let component;
    if(this.state.display){
      component = <SimpleComponent />;
    }
   
    return (
      <div>
        {component}
        <button onClick={this.remove}>remove the component</button>
 
      </div>
 
    );
 
  }
}
export default App;*/

