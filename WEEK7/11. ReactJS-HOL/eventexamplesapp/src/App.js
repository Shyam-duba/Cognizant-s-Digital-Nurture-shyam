import { useState } from "react";
import CurrencyConverter from "./components/CurrencyConverter";

function App() {
  const [counter,setCounter] = useState(0);


  const increment = () =>{
    if (counter === 0){
      alert("Hello! Member!");
    }
    setCounter(counter + 1);

  }

  const decrement = () =>{
    setCounter(counter - 1);
  }

  const SayWelcome = () =>{
    alert("Welcome");
  }

  const clickOnMe = () => {
    alert("I am clicked");
  }

  
  return (
    <>
    <h1>{counter}</h1>
    <button onClick={increment}>Increment</button><br />
    <button onClick={decrement}>Decrement</button><br />
    <button onClick={SayWelcome}>Say Welcome</button><br />
    <button onClick={clickOnMe}>Click on Me</button><br />

    <CurrencyConverter />
    </>
  );
}

export default App;
