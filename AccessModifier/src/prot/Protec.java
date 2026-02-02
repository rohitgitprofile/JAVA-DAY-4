package prot;

public class Protec {
    protected String str1="I am a protected member";
    void printFromClass(){
        System.out.println("Within pacakge and within class " + str1);
    }
    public static void main(String[] args){
        Protec obj1 = new Protec();
        obj1.printFromClass();
        Protec2 obj2 = new Protec2();
        obj2.printFromOutsideClass();
    }
}
class Protec2{
    void printFromOutsideClass(){
        Protec obj = new Protec();
        System.out.println("Within package and outside class " + obj.str1);
    }
}

