
package javaapplication6;



  import java.util.*;
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name ");
        String name = sc.nextLine();
        System.out.print("Enter subject name ");
        String subject = sc.nextLine();
        System.out.print("Enter "+subject +" mark 01 " );
        float mark1 = sc.nextFloat();
        System.out.print("Enter "+subject +" mark 02 " );
        float mark2 = sc.nextFloat();
          System.out.print("Enter "+subject +" mark 03 " );
        float mark3 = sc.nextFloat();
        
        if(mark1<0 || mark1>100){
            System.out.println("Invalid mark1");
            System.out.print("Enter valid mark 01 ");
            mark1 = sc.nextFloat();
        }
         if(mark2<0 || mark2>100){
            System.out.println("Invalid mark2");
            System.out.print("Enter valid mark 02 ");
            mark2 = sc.nextFloat();
        }
 if(mark3<0 || mark3>100){
            System.out.println("Invalid mark3");
            System.out.print("Enter valid mark 03 ");
            mark3 = sc.nextFloat();
        }
        
        studentDetails std = new studentDetails();
        std.setName(name);
        std.setSubject(subject);
std.setMark1(mark1);
std.setMark2(mark2);
std.setMark3(mark3);

calculation cal = new calculation();
        float total = cal.totalcal(std.getMark1(),std.getMark2(), std.getMark3());
        float average = cal.averagecal(std.getMark1(),std.getMark2(), std.getMark3());
        
        checkgrade chkG = new checkgrade();
        String grade = chkG.grade(average);
        System.out.println();
        System.out.println("---Display student Details---");
        System.out.println();
        System.out.println("Student name : "+std.getName());
         System.out.println("Subject name : "+std.getSubject());
         System.out.println("Mark 01 : "+std.getMark1());
System.out.println("Mark 02 : "+std.getMark2());
 System.out.println("Mark 03 : "+std.getMark3());
        System.out.println(total);
        System.out.println(average );
        System.out.println("Grade is "+grade);
        
    }
}

class studentDetails{
    private String name;
    private String subject;
    private float mark1, mark2, mark3, total, average;
    public String getName(){
        return name;
    }
         
public String getSubject(){
        return subject;
    }
    
public float getMark1(){
        return mark1;
    }
    
public float getMark2(){
        return mark2;
    }
    
    public float getMark3(){
        return mark3;
    }
    
    public float getTotal(){
        return total;
    }
    
    public float getAverage(){
        return average;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public void setMark1(float mark1){
        this.mark1 = mark1;
    }
    
    public void setMark2(float mark2){
        this.mark2 = mark2;
    }
    
    public void setMark3(float mark3){
        this.mark3 = mark3;
    }
    
public void setFloat(float total){
        this.total = total;
    }
    
public void setAverage(float average){
        this.average = average ;
    }
    
}

class calculation{
    public float totalcal(float mark1, float mark2, float mark3){
        return (mark1+mark2+mark3); 
    }
    public float averagecal(float mark1, float mark2, float mark3){
        return (mark1+mark2+mark3)/3; 
    }
    
}

class checkgrade{
    public String grade(float average){
        String gradeVal = " ";
        if(average>75){
            gradeVal = "A";
        }else if(average>65){
            gradeVal = "B";
        } else if(average>55){
gradeVal = "C";
        }else if(average>35){
gradeVal = "S";
        }else {
gradeVal = "Fail";
        }
        
        return gradeVal;
    }
}  

