import java.util.ArrayList;
import java.util.Scanner;
class Student{
    int id;
    String name;
    int marks;
    Student(int id, String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;

    }
}

public class StudentManagement{
    public static void main(String[] args) {
        ArrayList<Student>students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n---Student Manaagement Menu---");

            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Delete Student");
            System.out.println("4.Exit");

            int choice = sc.nextInt();
            switch(choice) {

                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(id,name,marks));
                    System.out.println("Student added succesfully!");
                    break;

                case 2:
                   System.out.println("\nStudent List:");
                   for (Student s : students) {
                        System.out.println("ID: " + s.id +" Name: "+s.name+ " Marks: " +s.marks);
                    }
                   break;   
                
                case 3:
                    System.out.println("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    students.removeIf(s -> s.id == deleteId);
                    System.out.println("Student removed!");
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                    
                    default:
                        System.out.println("Invalid choice");
            }
        }
    }
}