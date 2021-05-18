package HomeworkDay4.InterfaceAbstractDemo.adapters;

import HomeworkDay4.InterfaceAbstractDemo.MernisService.VWFKPSPublicSoap;
import HomeworkDay4.InterfaceAbstractDemo.abstracts.CustomerCheckService;
import HomeworkDay4.InterfaceAbstractDemo.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

    public boolean checkIfRealPerson(Customer customer) throws Exception {
        // mernise baglanma kodlari
        VWFKPSPublicSoap client = new VWFKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthOfDay().getYear());

    }
}
