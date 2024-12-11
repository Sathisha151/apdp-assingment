package javaapplication6;

import java.util.Scanner;


   

public class main {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in) ;
System.out.print("Enter product name : ") ;
String name = sc.nextLine();
System.out.print("Enter product Quantity as integer : ") ;
int qty = sc.nextInt();
System.out.print("Enter product price  : ") ;
float price = sc.nextFloat();

product pt = new product() ;
pt.setName(name);
pt.setQty(qty);
pt.setPrice(price);

total tt = new total() ;
float totalN = tt.total1(pt.getQty(), pt.getPrice());
pt.setTotal(totalN);

checkdiscount chk = new checkdiscount();
float discount = chk.dis(pt.getTotal());
float newTotal  = totalN - discount;

System.out.println("Product name is " + pt.getName());
System.out.println("Product Quantity is "+ pt.getQty());
System.out.println("product price is " +pt.getPrice());
System.out.println("product total is " +pt.getTotal());
System.out.println("Discount amount " +discount);
System.out.println("New Total " +newTotal);
}
} 

class product{
 private String name;
 private int qty;
 private float price;
 private float total;

public String getName() {
return name;
} 
public int getQty() {
return qty;
} 
public float getPrice() {
return price;
} 
public float getTotal() {
return total;
} 

public void setName(String name) {
this.name = name;
} 
public void setQty(int qty) {
this.qty = qty;
}  
public void setPrice(float price) {
this.price = price;
} 
public void setTotal(float total) {
this.total = total;
} 

}

class total{
 public float total1(int qty, float price) {
 return qty*price;
} 

}

class checkdiscount{
public float dis(float total) {
float discount = 0;
if(total>=1000){
 discount = total * 0.15f;
}else{
 discount = total * 0.05f;
}

return discount;
} 
}
  

