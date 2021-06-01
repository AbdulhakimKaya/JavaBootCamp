package interfaces;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);
        Customer abdulhakim = new Customer(1,"Abdulhakim","KAYA");
        customerManager.add(abdulhakim);
    }
}
