package HomeworkDay4.InterfaceAbstractDemo.concretes;

import HomeworkDay4.InterfaceAbstractDemo.abstracts.BaseCustomerManager;
import HomeworkDay4.InterfaceAbstractDemo.abstracts.CustomerCheckService;
import HomeworkDay4.InterfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService ;
    private Object Customer;

    public StarbucksCustomerManager (CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public StarbucksCustomerManager() {

    }

    public void checkIfRealPerson(Customer customer) {

    }
    @Override
    public void save(Customer customer) {
        if (CustomerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        }
        else {
            System.out.println("not a valid person.");
        }
     }
}
