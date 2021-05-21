package HomeworkDay4.InterfaceAbstractDemo;

import HomeworkDay4.InterfaceAbstractDemo.abstracts.BaseCustomerManager;
import HomeworkDay4.InterfaceAbstractDemo.adapters.MernisServiceAdapter;
import HomeworkDay4.InterfaceAbstractDemo.concretes.NeroCustomerManager;
import HomeworkDay4.InterfaceAbstractDemo.concretes.StarbucksCustomerManager;
import HomeworkDay4.InterfaceAbstractDemo.entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        try {
            customerManager.save(new Customer(1,"Abdulhakim","KAYA", LocalDate.of(2021,5,18),"12345678910"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();


    }
}



