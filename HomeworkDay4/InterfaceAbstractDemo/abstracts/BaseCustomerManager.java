package HomeworkDay4.InterfaceAbstractDemo.abstracts;

import HomeworkDay4.InterfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    public void save(Customer customer){
        System.out.println("Saved to db : " + customer.getFirstName());
    }
}
