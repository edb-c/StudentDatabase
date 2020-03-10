package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int currentGrade;
    private int studentID;
    private String courses;
    private int tutitionBalance;
    private int costOfCourse;

    //CONSTRUCTOR - Prompt user for student name and current grade level
    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter Student's First Name:");
        this.firstName = in.nextLine();

        System.out.print("Please enter Student's Last Name:");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student's Grade Level: ");
        this.currentGrade = in.nextInt();

        System.out.println(firstName + " " + lastName + " " + currentGrade);



    }//end Student()


}//end Class
