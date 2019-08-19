package test;


import java.sql.*;

public class DatabaseExample {
    public static void main(String[] args) throws SQLException {
        //ec2-52-15-54-39.us-east-2.compute.amazonaws.com
        //username:hr

        //password:hr


        String oracleUrl="jdbc:oracle:thin:@ec2-52-15-54-39.us-east-2.compute.amazonaws.com:1521:xe";
        String oracleUsername="hr";
        String oraclePassword="hr";
try {
    Connection connection = DriverManager.getConnection(oracleUrl, oracleUsername, oraclePassword);
    Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    ResultSet resultSet=statement.executeQuery("select first_name,last_name from employees");

    while(resultSet.next()){
        System.out.println("Firstname: "+resultSet.getObject(1)+"Firstname: "+resultSet.getObject(2));
    }





} catch (SQLException e){
    System.out.println("Failed to open connection!");
}







    }
}
