package com.mycompany.bank_management_system;

public class Log_In extends Register
{
    
    Log_In()
    {
        System.out.print("Enter Your Phone Number   : ");
        PhoneNumber = input.nextInt();
                
                
        System.out.println();
                
                
        System.out.print("Enter Your Password       : ");
        Password = input.nextLine();
    }
    
}
