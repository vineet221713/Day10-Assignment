package Day10.Assigment.Qustion2;

import java.util.Scanner;

public class AllStudents {
    public static void main(String[] args) {
        Student scince=new ScienceStudent();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ScienceStudent student name");
        scince.setName(sc.next());
        System.out.println("Enter student address");
        scince.setAddress(sc.next());
        System.out.println("Enter physics marks");
        ((ScienceStudent)scince).setPhisicsMarks(sc.nextInt());
        System.out.println("Enter chemistryMarks marks");
        ((ScienceStudent)scince).setChemistryMarks(sc.nextInt());
        System.out.println("Enter mathsMarks marks");
        ((ScienceStudent)scince).setMathsMarks(sc.nextInt());

        Student history=new HistoryStudent();
        System.out.println("Enter HistoryStudent student name");
        history.setName(sc.next());
        System.out.println("Enter student address");
        history.setAddress(sc.next());
        System.out.println("Enter historyMarks marks");
       ((HistoryStudent)history).setHistoryMarks(sc.nextInt());
        System.out.println("Enter civicsMarks marks");
        ((HistoryStudent)history).setCivicsMarks(sc.nextInt());

        ((ScienceStudent) scince).details();
        System.out.println( scince.getPercentage());
        ((HistoryStudent) history).details();
        System.out.println(history.getPercentage());
    }
}
