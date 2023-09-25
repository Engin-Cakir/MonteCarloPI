package hashmap_example;

import java.util.HashMap;

public class HashMapExample01 {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        sozluk.put("unprecedented", "eşi benzeri görülmemiş");

        System.out.println(sozluk);

        System.out.println(sozluk.get("book"));// key verip value elde edilir.


        //sozluk.clear();// tüm elemanları temizler.

        System.out.println(sozluk);
        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()) {// tüm keyleri verir.
            System.out.println("Eleman:" + item + " Değer:" + sozluk.get(item));
        }

    }
}
