SME Explanation Points:
 What happens in the controller method?
@RequestMapping("/country") maps the /country GET request to the getCountryIndia() method.

Inside the method:

ClassPathXmlApplicationContext loads the XML configuration.

The country bean is retrieved using its ID.

The bean is returned by the method.

 How is the bean converted to JSON response?
Spring Boot auto-configures Jackson (a JSON library).

Since the controller is annotated with @RestController, and the return type is a POJO, Spring:

Uses MappingJackson2HttpMessageConverter

Automatically converts the Country object into JSON.

 In Chrome (Network Tab):
Open Dev Tools (Right-click → Inspect → Network tab).

Visit http://localhost:8080/country.

Click the request:

General:

Request Method: GET

Status Code: 200 OK

Response Headers:

Content-Type: application/json

Request Headers:

User-Agent, Accept, etc.

 In Postman:
Method: GET

URL: http://localhost:808/country

Click Headers tab after sending request:

Request Headers:

Accept: */*

User-Agent: PostmanRuntime/...

Response Headers:

Content-Type: application/json

Content-Length: 37 (or similar)