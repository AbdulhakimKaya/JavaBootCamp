package HomeworkDay4.InterfaceAbstractDemo.adapters;


import HomeworkDay4.InterfaceAbstractDemo.MernisService.OQEKPSPublicSoap;
import HomeworkDay4.InterfaceAbstractDemo.abstracts.CustomerCheckService;
import HomeworkDay4.InterfaceAbstractDemo.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

    public boolean checkIfRealPerson(Customer customer) throws Exception {
        // mernise baglanma kodlari
        OQEKPSPublicSoap client = new OQEKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthOfDay().getYear());

    }
}
