import React from 'react'

export default function ListofPlayers(props) {
  return (
   props.players.map((item) => {
    return (
        <div>
            <li>Mr. {item.name}<span> {item.score} </span></li>
        </div>
    )
   })
  )
}
