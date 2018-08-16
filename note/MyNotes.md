Note: this is not a tutorial, just record some difficulties that I met

It's easy to use IDEA to new a SpringBoot, so first you need to add the dependencies you need.

##dependency version take mysql as example	
A database is always needed. It's not that your mysql version should be the same mysql-connector-java. For example, I use 5.7 but for the mysql-connector-java, there's no such version. But I can still use 5.1.46

## mysql config
- config in src/main/resources/application.properties, if your mysql version is 5.5+, append '?useSSL=false' or '?useSSL=true' with adding ssl
- don't forget to create a database to connector-java
- if mysql version is 6+, the tomcat url has been changed to "com.mysql.cj.jdbc.driver" instead of "com.mysql.jdbc.driver"

## mysql can not access
A very common problem by seeing "mysql access denied for user 'root'@'localhost'"
https://stackoverflow.com/questions/41645309/mysql-error-access-denied-for-user-rootlocalhost

##Tomcat can't connect port 8080
**"Failed to initialize end point associated with ProtocolHandler ["http-bio-8080"]"**	
- check whether your firewall block 8080
- I check that tomcat take this port and still can't connect...the reason is that before I corrected some error and have already run it, it started and could not work
To solve that 
```
netstat -ano|findstr 8080
taskkill /f /pid PID
```
PID is the number that you found. And then restart

### When create a bean like HandlerInterceptor don't forget to inject it ```@Component```

## How to map the database with java
- create database and table in mysql
- create entity in your pj
- create DAO to map which should ```extends JpaRepository``` . That defines how to index the data

#continue to update..