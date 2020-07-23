package interfaces.compare;

import interfaces.Gin;

import java.util.Arrays;

public class WatchPawnshop {

    public static void main(String[] args) throws CloneNotSupportedException {
        Watch gshock = new Watch("G-shok", true, 100.0);
        Watch seiko = new Watch("Seiko", false, 120.0);
        Watch swatch = new Watch("Swatch", false, 60.0);


//        System.out.println("gshock.compareTo(seiko) = " + gshock.compareTo(seiko));

        Watch[] watches = {gshock, seiko, swatch};
        System.out.println(Arrays.toString(watches));
        Arrays.sort(watches); //сортировка массива
        System.out.println(Arrays.toString(watches));


        Watch seiko2 = (Watch) seiko.clone();
        System.out.println("seiko2 = " + seiko2);


    }
}
