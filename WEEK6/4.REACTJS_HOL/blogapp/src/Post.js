import React from "react";
class Post{
    constructor(id, title, body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
}

class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            Posts :[],
            hasError:false,
            error:'',
        };
        
    }
    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((response) => response.json())
        .then((data) => {
            const Posts = data.map(post => ({
                id: post.id,
                title: post.title,
                body: post.body
            }));


            this.setState({Posts});
        })
        .catch((error) =>{
            console.error('error fetching posts:', error);

            this.setState({hasError:true, error:error.message});
        });

    }
    componentDidMount(){
        this.loadPosts();
    }

    render(){
        return (
  <div className="container">
    <h2>Posts</h2>
    <ul style={{ listStyleType: 'none', padding: 0 }}>
      {this.state.Posts.map((post) => (
        <li
          key={post.id}
          style={{
            border: '1px solid #ccc',
            borderRadius: '8px',
            padding: '10px',
            marginBottom: '15px',
            boxShadow: '0 2px 4px rgba(0,0,0,0.1)'
          }}
        >
          <h3 style={{ color: '#2a7ae2' }}>{post.title}</h3>
          <p style={{ fontFamily: 'Georgia, serif' }}>{post.body}</p>
        </li>
      ))}
    </ul>
  </div>
);

    }
    componentDidCatch(error, info){
        console.error('error caught by componentDidCatch:', error);
        this.setState({
            hasError:true,
            error:error.toString()
        });

    }
}

export default Posts;