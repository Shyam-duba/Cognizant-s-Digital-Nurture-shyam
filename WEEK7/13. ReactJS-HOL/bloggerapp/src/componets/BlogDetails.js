import React from 'react'

export default function BlogDetails(props) {
  return (
    <ul>
        {props.blogs.map((blog) => (
            <div key={blog.id}>
                <h3>{blog.title}</h3>
                <p>{blog.content}</p>
                <h4>Author: {blog.author}</h4>
            </div>
        ))}
    </ul>
  )
}

