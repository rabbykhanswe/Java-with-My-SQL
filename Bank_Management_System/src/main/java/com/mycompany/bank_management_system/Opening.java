package com.mycompany.bank_management_system;

public class Opening {
    
     Opening() {
        // The "open" and "end" strings
        String open = ">>>";
        String end = ">>>";

        // Length of the strings
        int length1 = open.length();
        int length2 = end.length();

        // Print initial line with >>> and then opening
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\t\t\t>>> ");

        // Loop through each character in the "open" string and print with delay
        for (int i = 0; i < length1; i++) {
            System.out.print(open.charAt(i));
             try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }

        // Print the " O P E N I N G " text
        System.out.print(" O P E N I N G  ");

        // Loop through each character in the "end" string and print with delay
        for (int j = 0; j < length2; j++) {
            System.out.print(end.charAt(j));
             try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final part with ">>>" and a formatted number
        System.out.println(">>>\n\n\t\t\t\t    99%...");
    }

}




