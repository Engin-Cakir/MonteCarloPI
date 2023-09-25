package arraylist_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Engin", "ÇAKIR"));
        customers.add(new Customer(1, "Ahmet", "ÇAKIR"));
        customers.add(new Customer(1, "Salih", "ÇAKIR"));
        customers.add(new Customer(1, "Hüseyin", "ÇAKIR"));
        customers.add(new Customer(1, "Mehmet", "ÇAKIR"));
        customers.add(new Customer(1, "Abuzittin", "ÇAKIR"));


        customers.remove(new Customer(1, "Engin", "ÇAKIR")); // Listeden herhangi bir eleman silinmez. Çünkü burada referans numarası farklı. Bir değere atasaydık silinirdi.

        Customer ayse = new Customer(1,"Ayşe","ÇAKIR");
        customers.add(ayse);

        customers.remove(ayse); //Bu şekilde ise elemanı çıkarır.

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }


    }

}
