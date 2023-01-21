public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim",1000,"tim@email.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditlimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditlimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("loe", "loe@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditlimit());
        System.out.println(customer.getEmail());

    }
}
