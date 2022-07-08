import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double kenar1, kenar2, hipo, alan, cevre;

        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci kenari giriniz = ");

        kenar1 = inp.nextDouble();

        Scanner inp2 = new Scanner(System.in);

        System.out.println("Ikinci kenari giriniz = ");

        kenar2 = inp2.nextDouble();

        hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        //Ucgen olma kurallarına uygun girilen degerlerin kontrolu

        boolean control1 = (kenar1 + kenar2) > hipo;
        boolean control2 = (kenar1 + hipo) > kenar2;
        boolean control3 = (kenar2 + hipo) > kenar1;

        boolean triagleControl = control1 && control2 && control3;

        String str = triagleControl ? "Girilen degerler ucgen icin uygun" : "Girilen degerler ucgen icin uygun degil";

        System.out.println(str);

        System.out.println("Hipotenus degeri = " + hipo);

        cevre = kenar1 + kenar2 + hipo;

        System.out.println("Ucgen cevre degeri = " + cevre);

        alan = (kenar1 * kenar2)/2;

        System.out.println("Ucgen alan degeri = " + alan);









    }

}
