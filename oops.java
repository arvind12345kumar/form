package src;

class pen {
    String type;
    String color;

    public void writen() {
        System.out.println("please notice your work first.");
    }

    public void coluo() {
        System.out.print("pen color is:");
        System.out.println(this.color);
    }

pen(){
    system.out.println("this is constructer");
}
};

class Student {
    String name;
    int age;

    public void info() {
        System.out.println("Student name is : " + name);
        System.out.println("Student age is : " + age);
    }
};

public class oops {
    
    public static void main(String[] args) {
        pen x = new pen();
        x.color = "blue";
        x.type = "gel";
        x.writen();
        x.coluo();
        Student a = new Student();
        a.name = "arvind";
        a.age = 20;
        a.info();
    }
}
