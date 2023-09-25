package collections;

import java.util.ArrayList;

public class ArrayListExample01 {
    public static void main(String[] args) {
       /* int[] sayilar = new int[]{1, 2, 3};
        //sayilar[3]=4;  ArrayIndexOutOfBoundsException hatası alınır.

        System.out.println(sayilar[0]);*/

        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(61);
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        sayilar.set(0, 100);// 0. eleman 100 olsun.
        System.out.println(sayilar.get(0));
        //sayilar.set(20,100); hata alınır çünkü 20. indekste eleman yok.
        //sayilar.remove(1); // liste silinen yere doğru kayar. İlk eleman artık önceki ikinci eleman olmuştur.
        System.out.println(sayilar.get(1));//Ankara olacaktır çıktı. Bİr geriye kaydı liste.
        //sayilar.clear();
        for (Object i : sayilar) {
            System.out.println(i);

        }


    }
}
