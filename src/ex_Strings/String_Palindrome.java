package ex_Strings;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        String user_input = sc.next();

        String reversed_string = "";

        for(int i =user_input.length()-1; i>=0;i--){
            reversed_string=reversed_string +user_input.charAt(i);
        }

        //equalIgnoreCase() method compares two strings.
        //It ignores uppercase and lowercase differences.

        if(reversed_string.equalsIgnoreCase(user_input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome!");
        }
    }
}
