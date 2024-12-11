package javaapplication6;

import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name = sc.nextLine();
        System.out.print("Enter subject name : ");
        String subject = sc.nextLine();
        System.out.print("Enter student mark 1 : ");
        float mark1 = sc.nextInt();
        if (mark1 < 0 || mark1 > 100) {
            System.out.println("your invalid mark");

            System.out.print("Enter mark now :");
            mark1 = sc.nextInt();
        }

        System.out.print("Enter student mark 2 : ");
        float mark2 = sc.nextInt();
        if (mark1 < 0 || mark1 > 100) {
            System.out.println("your invalid mark");
            System.out.print("Enter mark now :");
            mark1 = sc.nextInt();
        }

        System.out.print("Enter student mark 3 : ");
        float mark3 = sc.nextInt();
        if (mark1 < 0 || mark1 > 100) {
            System.out.println("your invalid mark");
            System.out.print("Enter mark now :");
            mark1 = sc.nextInt();
        }

        marks mk = new marks();
        mk.setName(name);
        mk.setSubject(subject);
        mk.setMark1(mark1);
        mk.setMark2(mark2);
        mk.setMark3(mark3);
    }

}

class marks {

    private String name;
    private String subject;
    private float mark1, mark2, mark3, total, avrag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getMark1() {
        return mark1;
    }

    public void setMark1(float mark1) {
        this.mark1 = mark1;
    }

    public float getMark2() {
        return mark2;
    }

    public void setMark2(float mark2) {
        this.mark2 = mark2;
    }

    public float getMark3() {
        return mark3;
    }

    public void setMark3(float mark3) {
        this.mark3 = mark3;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getAvrag() {
        return avrag;
    }

    public void setAvrag(float avrag) {
        this.avrag = avrag;
    }

}

