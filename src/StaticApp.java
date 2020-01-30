import java.util.*;
public class StaticApp {

    public static void main(String[] args) {
        //verwenden der statischen Konstante MyPI
        System.out.printf("MyPi: %.2f\n", MyMath.MyPi);
        //verwenden der nicht statischen Konstante MyPi_NonStatic
        MyMath myM = new MyMath();
        System.out.printf("MyPi_NonStatic = %.2f\n", myM.MyPi_NonStatic);
    }
}
