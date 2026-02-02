import java.util.Scanner;
class Addition{
    int sum(int a, int b){
        return a+b;
    }
}
public class MethodAddition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        Addition add = new Addition();
        System.out.println("Addition of the given two numbers is " + add.sum(a,b));
    }
} 