//HAPI 1. Importimi i paketave
import java.sql.*;
public class Db_classicmodels {
// JDBC driver dhe database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost:3306/";
// Kredencialet ne database
static final String USER = "viktor";
static final String PASS = "viktor";
public static void main(String[] args) {
Connection conn = null;
Statement stmt = null;
try{
//HAPI 2: Registrimi i JDBC driver
Class.forName("com.mysql.jdbc.Driver");
//HAPI 3: Krijimi i connection
System.out.println("Lidhja me database...");

conn = DriverManager.getConnection(DB_URL, USER, PASS);
//HAPI 4: Ekzekutimi i query
System.out.println("Krijimi i database...");
stmt = conn.createStatement();
String sql = "CREATE DATABASE classicmodels";
stmt.executeUpdate(sql);
System.out.println("Database u krijua me sukses...");
}catch(SQLException se){
//Trajtimi i perjashtimit te JDBC
se.printStackTrace();
}catch(Exception e){
//Trajtimi i perjashtimit te Class.forName
e.printStackTrace();
}finally{
//blloku finally qe mbyll resurset
try{
if(stmt!=null)
stmt.close();
}catch(SQLException se2){
}
try{
if(conn!=null)
conn.close();
}catch(SQLException se){
se.printStackTrace();
}
}
System.out.println("Dalje....");
}}

