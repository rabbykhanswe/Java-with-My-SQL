package com.mycompany.bank_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register 
{
    String FirstName;
    String LastName;
    String Email;
    int PhoneNumber;
    String Address;
    String Password;
    String DateOfBirth;
    long NIDNumber;
    float FirstDeposit;
    
    Scanner input = new Scanner(System.in);
    
    Register()
    {
        System.out.print("\nEnter Your First Name                : ");
        FirstName = input.nextLine();
        
        System.out.print("\nEnter Your Last Name                 : ");
        LastName = input.nextLine();
        
        System.out.print("\nEnter Your E-mail Address            : ");
        Email = input.nextLine();
        
        System.out.print("\nEnter Your Phone Number              : +88 ");
        PhoneNumber = input.nextInt();
        
        input.nextLine();
        
        System.out.print("\nEnter Your Living Address            : ");
        Address = input.nextLine();
        
        System.out.print("\nEnter Your Password                  : ");
        Password = input.nextLine();
        
        System.out.print("\nEnter Your Date of Birth (DD/MM/YY)  : ");
        DateOfBirth = input.nextLine();
        
        System.out.print("\nEnter Your NID Number                : ");
        NIDNumber = input.nextLong();
        
        System.out.print("\nEnter Your First Deposite Amount     : ");
        FirstDeposit = input.nextFloat();
        input.nextLine();
        System.out.println("\n\n\n<< << << Account Registration Successful >> >> >>");
        
        try 
        { 
            RegisterDatabase(); 
        } 
        
        catch (SQLException ex) 
        { 
            System.out.println("<< Unable to Start DB Try Sometimes Later >>");; 
        }
        
    }
    
    public void RegisterDatabase() throws SQLException
    {
        String url = "jdbc:mysql://localhost/phpmyadmin/index.php?route=/database/structure&db=bank_management_system";
        String user = "root";
        String password = " ";
        
        String query = "INSERT INTO users (FirstName, LastName, Email, PhoneNumber, Address, Password, DateOfBirth, NIDNumber, FirstDeposit) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try(Connection connection = DriverManager.getConnection(url, user, password);
                    PreparedStatement post = connection.prepareStatement(query))
        {
            post.setString(2, FirstName);
            post.setString(3, LastName);
            post.setString(4, Email);
            post.setInt(5, PhoneNumber);
            post.setString(6, this.Password);
            post.setString(7, Address);
            post.setString(8, DateOfBirth);
            post.setLong(10, NIDNumber);
            post.setFloat(11, FirstDeposit);
            post.executeUpdate();
        }
        
        catch(SQLException ex)
                {
                   System.out.println("Error: Unable to insert data into the database.");
                   
                    
                }
    }
}






