import React from 'react'

export default function Scorebelow70(props) {
  return (
    props.players.map((item) => {
        if (item.score <= 70) {
            return (
                 <div>
            <li>Mr. {item.name}<span> {item.score} </span></li>
            </div>
            );
        }
    })
  )
}
