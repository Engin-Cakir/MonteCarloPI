package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample02 {
    //Tip güvenli...
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(); //Genericler String tipinde veri alır.
        arrayList.add("Ankara");
        arrayList.add("İstanbul");
        arrayList.add("İzmir");
        arrayList.add("Aydın");

        arrayList.remove("İstanbul");

        Collections.sort(arrayList);

        for (String array : arrayList) {
            System.out.println(array);
        }


    }
}
