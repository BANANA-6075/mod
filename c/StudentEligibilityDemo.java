/* 7.	Write a java program to find the details of the students eligible to enroll for the examination (Students, Department combinedly give the eligibility criteria for the 
enrollement class) using interfaces.

student
sno:
sname:
class:
getvale()

Department
sno:
attendense:
getattendense()

exam
calattendense()
bool eligible() */


import java.io.*;

// Interface Student
interface Student {
    void getValue() throws IOException;
}

// Interface Department
interface Department {
    void getAttendance() throws IOException;
}

// Interface Exam
interface Exam {
    void calcAttendance();
    boolean eligible();
}

// Class implementing all interfaces
class Enroll implements Student, Department, Exam {
    private int sno;
    private String sname;
    private String sclass;
    private double attendance; // percentage

    BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));

    // Input student details
    public void getValue() throws IOException {
        System.out.print("Enter student number: ");
        sno = Integer.parseInt(dis.readLine());
        System.out.print("Enter student name: ");
        sname = dis.readLine();
        System.out.print("Enter class: ");
        sclass = dis.readLine();
    }

    // Input attendance
    public void getAttendance() throws IOException {
        System.out.print("Enter attendance %: ");
        attendance = Double.parseDouble(dis.readLine());
    }

    // Calculate/check attendance (here we just display)
    public void calcAttendance() {
        System.out.println("\nStudent Details:");
        System.out.println("Student No: " + sno);
        System.out.println("Name      : " + sname);
        System.out.println("Class     : " + sclass);
        System.out.println("Attendance: " + attendance + "%");
    }

    // Check eligibility
    public boolean eligible() {
        if (attendance >= 75)
            return true;
        else
            return false;
    }
}

// Main class
public class StudentEligibilityDemo {
    public static void main(String[] args) throws IOException {
        Enroll e = new Enroll();

        e.getValue();        // input student details
        e.getAttendance();   // input attendance
        e.calcAttendance();  // display info

        if (e.eligible())
            System.out.println("Status    : Eligible to enroll for examination");
        else
            System.out.println("Status    : Not eligible to enroll for examination");
    }
}
