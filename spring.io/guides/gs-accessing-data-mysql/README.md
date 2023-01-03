# Spring Guides from spring.io
## Spring Guides

- [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

## Create a database
````roomsqlsql
mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
````

To run this guide in Windows Powershell first run the `cmd.exe` 

## Testing the Application

````bash
$ curl localhost:8080/demo/add -d name=First -d email=someemail@someemailprovider.com
````

```bash
$ curl 'localhost:8080/demo/all'
```