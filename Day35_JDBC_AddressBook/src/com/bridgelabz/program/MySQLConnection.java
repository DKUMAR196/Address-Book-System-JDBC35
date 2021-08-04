package com.bridgelabz.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	/**
    CREATE CONNECTION ONLY ONE TIME & USE EVERYWHERE
    */

   String url = "jdbc:mysql://localhost:3306/addressbookservice";
   String username ="root";
   String password ="dpkaryan1996#";

   public Connection getConnection(){
       Connection connection = null;
       try {
           connection =  DriverManager.getConnection(url,username,password);
           return connection;

       }catch (SQLException e ){
           e.printStackTrace();
       }
       return null;
   }

}


