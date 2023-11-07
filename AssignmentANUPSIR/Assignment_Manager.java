
package AssignmentANUPSIR;

import java.time.LocalDate;
import java.util.*;
public class Assignment_Manager {
  class Student {

    String name;
    int prnNo;

    public void Student(String name, int prnNo) {
        this.name = name;
        this.prnNo = prnNo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Student name");
        
        
    }

    class Trainer {

        String name;
    }

    class Assignment {

        private String title;
        private Date date;
        private String description;
        private String assignee;

        private Student s;
        private Trainer t;

        public Assignment(String title, String date, String description, String assignee, Student s, Trainer t) {
            this.title = title;
            this.description = description;
            this.assignee = assignee;
            this.date=this.date;
            this.s = s;
            this.t = t;
        }

    }

}


    //static HashMap<String, Integer> hm = new HashMap<>();
    void createassignment() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a title");
        String t = sc.nextLine();
        
        LocalDate date = LocalDate.now();
        

        System.out.println("Enter a description");
        String desc = sc.nextLine();
       

        System.out.println("Enter assignee name");
        String assign = sc.nextLine();
        
       System.out.println("***************************************");
        System.out.println("Title " + t);
        System.out.println("date is  " + date);
        System.out.println("Description " + desc);
        System.out.println("Assignee name   " + assign);
    }

    void addassignment() 
    {
         
       
    }

    void saveassignment() 
    {

        
    }

    void liadassignment()
    {

        
    }

    public static void main(String[] args) {
        
        Assignment_Manager am = new Assignment_Manager();
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i != 5){
        System.out.println( "1.create Assignment\n  "
                           +"2.Add Assignment\n"
                            + "3.Save Assignment\n "
                           +"4.LoadAssignment");
        System.out.println("Enter any one option ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                am.createassignment();
                break;
            case 2:
                am.addassignment();
                break;
            case 3:
               am.saveassignment();
                break;
            case 4:
                 am.liadassignment();
                break;
            default:
                System.out.println("please enter the number between 1 to 4");

        }

    }
    }
}
