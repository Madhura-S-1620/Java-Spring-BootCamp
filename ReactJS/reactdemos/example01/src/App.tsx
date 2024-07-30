import Heading from "./components/Heading"
import {Section} from "./components/Section"
import Counter from "./components/Counter"
import list from "./components/list"
import List from "./components/list"
 
function App() {
 

     return(
      <>
      <Heading title={"Krishna"}/>
      <Section title={"section"}>This is section tag of HTML!</Section>
      <Counter></Counter>
      <List items = {["Mango","Apple","Watermelon","Banana"]} render={(item:string)=> <span className="gold">{item}</span>}/>

      </>
     )  

}
 
export default App