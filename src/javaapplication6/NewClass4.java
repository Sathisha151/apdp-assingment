
package javaapplication6;

import java.util.Scanner;


public class NewClass4 {
    public static void main(String[] args) {
        /* String ar[] = {"name 1","name 2", "name 3", "name"};
         for (int i = 0; i < ar.length; i++) {
             System.out.print(ar[i]);
        */
        /* int arr[] = {11,12,13,14};
         for (int i = 0; i < arr.length; i++) {
             System.out.println("arr["+i+"]="+arr[i]);
           
        }*/
             Scanner sc = new Scanner(System.in); 
             
             int arr[] = new int[4];
             for (int i = 0; i < 4; i++) {
                 System.out.println("");
                   arr[i] = sc.nextInt();
                    }
             System.out.print("Array is :");
             for (int j = 0; j < 4; j++) {
                 System.out.print(arr[j]+"  ");
                
           
        }
    }
    
}
