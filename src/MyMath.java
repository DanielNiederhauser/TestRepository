public class MyMath {

    //statische Members (MMethoden Felder)
    public static final double MyPi = 3.1415;
    //würde man so nicht machen (unten)
    public final double MyPi_NonStatic = 3.1415;

    //statische Methoden

    public static double DegreeToRadiant(double degree){
        return degree * 2 * Math.PI / 360;
    }
    
    public static double RadiantToDegree(double radiant){
        return radiant * 360 / (2*Math.PI);
    }


}
