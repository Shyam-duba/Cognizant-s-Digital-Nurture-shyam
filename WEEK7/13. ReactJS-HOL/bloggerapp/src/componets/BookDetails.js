import React from 'react'

export default function BookDetails(props) {
  return (
    <ul>
        {props.books.map((book) => (
            <div key={book.id}>
                <h3>{book.name}</h3>
                <h4>Price: {book.price}</h4>
            </div>
        ))}
    </ul>
  )
}
