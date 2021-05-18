package HomeworkDay4.InterfaceAbstractDemo.abstracts;

import HomeworkDay4.InterfaceAbstractDemo.entities.Customer;

public interface CustomerCheckService {
    static boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
