import React from 'react'

export default function ListofIndianPlayers(props) {
  return (
      props.IndianPlayers.map((item) => {
        return (
            <div>
                <li>Mr. {item}</li>
            </div>
        );
    })
  )
}
