import './App.css';
import BookDetails from './componets/BookDetails';
import CourseDetails from './componets/CourseDetails';
import BlogDetails from './componets/BlogDetails';

export const books = [
  { id: 1, name: 'Master React', price: 670 },
  { id: 2, name: 'Deep Dive into Angular 11', price: 800 },
  { id: 3, name: 'Mongo Essentials', price: 450 }
];

export const courses = [
  { id: 1, name: 'Angular', date: '4/5/2021' },
  { id: 2, name: 'React', date: '6/3/2021' }
];

export const blogs = [
  { id: 1, title: 'React Learning', content: 'Welcome to learning React!', author: 'Stephen Biz' },
  { id: 2, title: 'Installation', content: 'You can install React from npm', author: 'Schewzdenier' }
];

function App() {
  return (
    <div className="main-layout">
      <div className="mystyle1">
        <h1>Course Details</h1>
        <CourseDetails courses={courses} />
      </div>
      <div className="st2">
        <h1>Book Details</h1>
        <BookDetails books={books} />
      </div>
      <div className="v1">
        <h1>Blog Details</h1>
        <BlogDetails blogs={blogs} />
      </div>
    </div>
  );
}

export default App;
