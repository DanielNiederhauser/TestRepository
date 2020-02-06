public class MyMath {

    
    //Test-Conflict-Local
    //asdf
    //Wichtig
    /*
    statische Members (Felder und Methoden) können im Hauptprogramm
    oder in anderen Klassen ohhne Erzeugung einer Instanz verwendet werden
     - es muss nur der Klassenname und durch Punkt getrennt der Membername
     angeg. werden

     statische Members werden nur ein einziges mal erzeugt
        werden im Hauptprogramm z.B. 10 Instanzen einer Klasse mit statischen
        Feldern erzeugt, exisitiert dieses Feld nur ein einziges Mal für alle
        Instanzen

        normale Members (Felder) werden pro Instanz erzeugt; bei 10 Inatanzen
        existiert dieses Feld (z.B Firstname) 10 mal im Speicher



      */

    //statische Members (MMethoden Felder)
    public static final double MyPi = 3.1415;
    //würde man so nicht machen (unten)
    public final double MyPi_NonStatic = 3.1415;

    public double wert;

    //statische Methoden

    public static double DegreeToRadiant(double degree){
        //WICHTIG: In einer statischen Methode darf man nur auf statische
        //  Members (Felder, Methoden) zugreifen
        //z.B. Wert darf in dieser Methode nicht verwendet werden, da sie
        //  statisch ist nicht statisch
        return degree * 2 * Math.PI / 360;
    }

    public static double RadiantToDegree(double radiant){
        return radiant * 360 / (2*Math.PI);
    }

    //nicht statische Methode
    public double NonStatic(){
        //WICHTIG: in einer nichtstatischen Methode dürfen normale und
        //statische Members verwendet werden
        return wert * MyPi * RadiantToDegree(wert);
    }


}
