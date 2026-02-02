import java.util.Scanner;
public class Constructor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Algebra obj1 = new Algebra(3, 1);
        System.out.println(obj1.add());
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());
        Algebra obj2 = new Algebra(6,2);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
    }
} 
class Algebra{
    int a,b;
    Algebra(int x, int y){
       System.out.println("Constructor of Algebra class called");
        a=x;
        b=y;
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}