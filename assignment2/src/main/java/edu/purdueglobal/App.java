package edu.purdueglobal;


import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;


public class App
{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;database=Northwind;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String password = "JessiBear1995*"; //password here
        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connected to SQL Server");
        } catch (Exception e) {
            System.out.println("OOOps, there's an error:");
            e.printStackTrace();
        }
    }
}
