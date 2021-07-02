import java.util.*;

public class StudentIDArray {

    Scanner scn = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<Student>();

//    public StudentIDArray(ArrayList<Student> studentList) {
//        this.studentList = studentList;
//    }

    public void add() {
        System.out.print("student id = ");
        int id = Integer.parseInt(scn.nextLine());

        System.out.print("input name ");
        String name = scn.nextLine();

        System.out.print("input mark ");
        double mark = Double.parseDouble(scn.nextLine());

        Student student =  new Student(id, name, mark);
        studentList.add(student);
    }

    public void show_all() {

        for(Student ele : studentList){
            System.out.println(ele.getID());
            System.out.println(ele.getName());
            System.out.println(ele.getMark());
        }

    }

    public static void main(String[] args) {
        var object = new StudentIDArray();
        object.add();
        object.add();
        object.add();
        object.show_all();
    }


}
