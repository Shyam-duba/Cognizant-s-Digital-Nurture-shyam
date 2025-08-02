import React from 'react'

export default function courseDetails(props) {
  return (
    <ul>
        {props.courses.map((course) => (
            <div key={course.id}>
                <h3>{course.name}</h3>
                <h4> {course.date}</h4>
            </div>
        ))}
    </ul>
  )
}
