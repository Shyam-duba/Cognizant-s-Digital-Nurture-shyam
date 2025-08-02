import React from 'react'

export default function DisplaySpaces(props) {

  return (
    props.spaces.map((space) => {
        return (
            <div>
                <h1>{space.element} , at Affordable Range</h1>
                <img src={space.img} width={"25%"} height={"25%"} alt="Office Space" />

                <h1>Name: {space.name}</h1>
                <h3 style={{color: space.rent < 60000 ? "Red" : "Green"}}>Rent: Rs. {space.rent}</h3>
                <h3>Address: {space.address}</h3>
            </div>
        )
    })
  )
}
