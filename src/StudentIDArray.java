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

        System.out.print("input age");
        int age = Integer.parseInt(scn.nextLine());

        System.out.print("input mark ");
        double mark = Double.parseDouble(scn.nextLine());

        Student student =  new Student(id, name, age, mark);
        studentList.add(student);
    }

    public void show_all() {
        for(Student ele : studentList){
            System.out.println(ele);
        }
    }

    public void sortById(){
        for(int i = 0; i < studentList.size(); i++){
            for(int j = i + 1; j < studentList.size(); j++){
                if (studentList.get(i).getID() > studentList.get(j).getID()) {
                    Student current = studentList.get(i);
                    studentList.set(i,studentList.get(j));
                    studentList.set(j,current);
                }


            }
        }
    }

    public static void main(String[] args) {
        var object = new StudentIDArray();
        object.add();
        object.add();
        object.add();
        object.show_all();
        object.sortById();
        System.out.println("sau khi sort");
        object.show_all();
    }


}
