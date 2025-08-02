import React from 'react'

export default function CurrencyConverter() {
    const [amount, setAmount] = React.useState("");
  return (
    <div>
      <h1 style={{color:"green"}}>Currency Converter</h1>
      <label>Amount</label>
      <input type="text" placeholder="" value={amount} onChange={(e) => setAmount(e.target.value)} /><br />
      <label>Currency</label>
      <input type="text" placeholder="Converted Amount" />

      <button onClick={() => {
        const euro = parseFloat(amount) *0.0099;

        alert(`Converting to Euro Amount is ${euro}`)
      }}>submit</button>
    </div>
  )
}
