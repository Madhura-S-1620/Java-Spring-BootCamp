/*import React,{Component} from "react"
export default function ParentComponent(ParentComponent)
{
    return class extends Component{
        render(){
            return(
                <div>
                    <ParentComponent></ParentComponent>
                </div>
            );
        }
    }
 
 
}*/


import React,{Component} from "react"
export default function ParentComponent(ParentComponent)
{
    // eslint-disable-next-line no-unused-expressions
    title: String;
    return class extends Component{
        render(){
            this.title="PC title"
            return(
                <div>
                    <ParentComponent><h1>{this.title}</h1></ParentComponent>
                </div>
            );
        }
    }
 
 
}