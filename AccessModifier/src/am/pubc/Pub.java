package am.pubc;

public class Pub {
    public String str1="I am a public member";
    void printFromClass(){
        System.out.println("Within pacakge and within class " + str1);
    }
    public static void main(String[] args){
        Pub obj1 = new Pub();
        obj1.printFromClass();
        Pub2 obj2 = new Pub2();
        obj2.printFromOutsideClass();
    }
}
class Pub2{
    void printFromOutsideClass(){
        Pub obj = new Pub();
        System.out.println("Within package and outside class " + obj.str1);
    }
}
