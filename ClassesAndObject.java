import java.util.Scanner;
public class ClassesAndObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person Rohan = new Person();
        Person Sohan = new Person();
        Person Mohan = new Person();
        Rohan.age=55;
        Mohan.age=31;
        System.out.println(Rohan.age);
        System.out.println(Sohan.age);
        System.out.println(Mohan.age)
    }
}
class Person {
        int age = 20;
    }