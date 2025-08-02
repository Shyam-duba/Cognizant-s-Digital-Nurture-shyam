import DisplaySpaces from "./components/DisplaySpaces";

function App() {
  const spaces = [
    {
      element: "Office Space",
      img: "https://th.bing.com/th/id/OIP.oRtnfh0IJ49Md65Fe2-AIwHaFj?w=244&h=183&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3",
      name: "DBS",
      rent: 15000,
      address: "Hyderabad"
    },
    {
      element: "Co-working Space",
      img:"https://i.pinimg.com/originals/d2/9c/91/d29c91e64d6213471b26aa7edcc14b52.jpg",
      name: "WORKSPACE",
      rent: 100000,
      address: "Bangalore"
    }
  ]
  return (
  <>
  
  <DisplaySpaces spaces={spaces} />
  </>
  );
}

export default App;
