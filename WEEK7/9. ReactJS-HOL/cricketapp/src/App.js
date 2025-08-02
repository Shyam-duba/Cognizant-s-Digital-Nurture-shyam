import ListofPlayers from "./components/ListofPlayers";
import Scorebelow70 from "./components/Scorebelow70";
import ListofIndianPlayers from "./components/ListofIndianPlayers";

const T20Players = ['First Player','Second Player','Third Player'];
const RanjiTrophyPlayers = ['Forth Player','Fifth Player', 'Sixth Player'];

export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];


const players = [
  {name:'Jack', score: 50},
  {name:'Michael', score: 70},
  {name:'John', score: 40},
  {name:'Ann', score: 6},
  {name:'Elisabeth', score: 61},
  {name:'Sachin', score: 95},
  {name:'Dhoni', score: 100},
  {name:'Virat', score: 84},
  {name:'Jadeja', score: 64},
  {name:'Raina', score: 75},
  {name:'Rohit', score: 80},
]

function OddPlayers({first, third, fifth}){
  return (
    <div>
      <li>First: {first}</li>
      <li>Third: {third}</li>
      <li>Fifth: {fifth}</li>
    </div>
  )
}

function EvenPlayers({second,fourth, sixth}){
  return (
    <div>
      <li>Second: {second}</li>
      <li>Fourth: {fourth}</li>
      <li>Sixth: {sixth}</li>
    </div>
  )
}

function App() {
  const IndianTeam = {first: 'Sachin1', second: 'Dhoni2', third: 'Virat3', fourth: 'Rohit4',  fifth:'Yuvaraj5', sixth:'Raina6'};
  var flag = false;

  if (flag === true) {
    return(
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr/>
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    )
  }
  else {
    return (
      <div>
      <div>
      <h1>Odd Players</h1>
      {OddPlayers(IndianTeam)}
      <hr/>
      <h1>Even Players</h1> 
      {EvenPlayers(IndianTeam)}
      </div>
      <hr/>
      <div>
      <h1>List of Players Merged:</h1>
      <ListofIndianPlayers IndianPlayers={ IndianPlayers } />
      </div>
      </div>

  )
  }
  
}

export default App;
