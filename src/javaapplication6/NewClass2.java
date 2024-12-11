
package javaapplication6;

import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        System.out.println("Age is:"+age);
        System.out.println("Name is:"+name);
        System.out.println("price is:"+price);
    */
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Input Number :");
        int number = sc.nextInt();
        
        if(number<=0){
        System.out.println("negetive :"+number);
        
    }else{
            System.out.println("positive :"+number);
        }*/
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your name :");
        sc.nextLine();
        System.out.print("Enter Your age :");
        int age = sc.nextInt();
        if (age%2==0){
            System.out.println("Even");
            
        }else{
            System.out.println("Odd");
        }
        
        
    
}
}

