package inheritance;

public class Main {

    public static void main(String[] args) {
        IndividualCustomer kaya = new IndividualCustomer();
        kaya.customerNumber = "1234";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "5678";

        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber = "1011";

        CustomerManager customerManager = new CustomerManager();
        /* customerManager.add(kaya);
        customerManager.add(hepsiBurada);
        customerManager.add(abc); */
        Customer[] customers = {kaya,hepsiBurada,abc};
        customerManager.addMultiple(customers);
    }
}
