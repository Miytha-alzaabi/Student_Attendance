import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        student s = new student();
        //List<student> students = new ArrayList<>();
        boolean isExists;
        //= students.contains(s);


        System.out.println("Welcome to Our Attendance System");

        do{
            int choice ;

            System.out.println("Select Your Choice:\n 1. New Registration.\n 2. Attend Detais.\n 3. Exit");
            choice = read.nextInt();
            List<student> students = new ArrayList<>();
            isExists = students.contains(s);
            students.add(s);

            if(choice == 1)
            {

                s.sInfo();
                //List<student> students = new ArrayList<>();
                students.add(s);

            }else if(choice == 2)
            {


                s.sInfoPrint();

            }
            else{

                read.close();
            }
            s.id++;
        }while(!isExists);


    }
}
class student{

    int id;
    String name;
    Scanner read = new Scanner(System.in);

    void sInfo(){
        System.out.println("Please Enter Your ID: ");
        id = read.nextInt();
        System.out.println("Please Enter Your Name: ");
        name = read.next();
    }

    void sInfoPrint(){


        System.out.println("******************* ");
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("********************* ");

    }

}
class classAttend{
    boolean isExists;


    void print(){
        student s = new student();
        List<student> students = new ArrayList<>();
        isExists = students.contains(s);
        students.add(s);
        for (int i = 0; i < students.size();i++)
        {
            System.out.println(students.get(i));
        }
    }

}