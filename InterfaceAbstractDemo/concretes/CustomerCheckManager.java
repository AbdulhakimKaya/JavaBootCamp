package HomeworkDay4.InterfaceAbstractDemo.concretes;

import HomeworkDay4.InterfaceAbstractDemo.abstracts.CustomerCheckService;
import HomeworkDay4.InterfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    public boolean checkIfRealPerson(Customer customer) {

        return true;
    }
}
