package reflection;

public class Student {
    private int age;
    private String Name;
    public Student(){}
    public Student(int age){};
    protected Student(String name){};
    private Student(int age,String name){};
    public int getAge() {
        return age;
    };
    public void setAge(int age) {
        this.age = age;
    };
    public String getName() {
        return Name;
    };
    public void setName(String name) {
        Name = name;
    };
}
