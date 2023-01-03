# Spring Guides from spring.io
## Spring Guides

- [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)

To run this guide in Windows Powershell first run the `cmd.exe` 

## Testing the Application

````bash
$ curl http://localhost:8080
{
"_links" : {
"people" : {
"href" : "http://localhost:8080/people{?page,size,sort}",
"templated" : true
}
}
}
````

````bash
$ curl http://localhost:8080/people
{
"_embedded" : {
"people" : []
},
"_links" : {
"self" : {
"href" : "http://localhost:8080/people{?page,size,sort}",
"templated" : true
},
"search" : {
"href" : "http://localhost:8080/people/search"
}
},
"page" : {
"size" : 20,
"totalElements" : 0,
"totalPages" : 0,
"number" : 0
}
}

````
````bash
$ curl -i -H "Content-Type:application/json" -d '{"firstName": "Frodo", "lastName": "Baggins"}' http://localhost:8080/people
````
````bash
$ curl http://localhost:8080/people/1
````
````bash
$ curl http://localhost:8080/people/search
````

````bash
$ curl http://localhost:8080/people/search/findByLastName?name=Baggins
````

````bash
$ curl -X PUT -H "Content-Type:application/json" -d '{"firstName": "Bilbo", "lastName": "Baggins"}' http://localhost:8080/people/1
````

````bash
$ curl -X PATCH -H "Content-Type:application/json" -d '{"firstName": "Bilbo Jr."}' http://localhost:8080/people/1
````

````bash
$ curl -X DELETE http://localhost:8080/people/1
````