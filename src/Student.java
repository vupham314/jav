public class Student {
    private int ID;
    private String name;
    private double mark;

    public Student(){
        // overloading
    }

    public Student(int ID, String name, double mark){
        this.ID = ID;
        this.name = name;
        this.mark = mark;
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


}
