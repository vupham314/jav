public class Student {
    private int ID;
    private String name;
    private double mark;
    private int age;
    public Student(){
        // overloading
    }
    public Student(int ID, String name, int age, double mark){
        this.ID = ID;
        this.name = name;
        this.mark = mark;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return String.format("%3d %10s %3d %3f", this.ID, this.name, this.age, this.mark);
    }
}
