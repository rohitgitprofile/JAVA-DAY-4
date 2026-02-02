package outside;
import am.pubc.*;
import prot.*;

public class out {
    public static void main(String[] args){
        Pub obj3 = new Pub();
        System.out.println("Outside the package, non child class " + obj3.str1);
        Pub3 obj4 = new Pub3();
        obj4.printFromOutsidePackageChild();
        Protec obj5 = new Protec();
        //System.out.println("Outside the package, non child class " + obj5.str1);
        Protec3 obj7 = new Protec3();
        obj7.printFromOutsidePackageChild();
    }
}
class Pub3 extends Pub{
    void printFromOutsidePackageChild(){
        Pub3 obj = new Pub3();
        System.out.println("Outside package child " + obj.str1);
    }
}
class Protec3 extends Protec{
    void printFromOutsidePackageChild(){
        Protec3 obj6 = new Protec3();
        System.out.println("Outside package child " + obj6.str1);
    }
}