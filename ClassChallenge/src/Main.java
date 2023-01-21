public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalence(1000.00);
        bobsAccount.setCustomerName("Bob brown");
        //bobsAccount.getCustomerEmail("myemail@bob.com");
        //bobsAccount.getCustomerPhone("087)123-456");


        bobsAccount.withdrawalFund(100.0);
        bobsAccount.depositeFound(250);
        bobsAccount.withdrawalFund(50);

        bobsAccount.withdrawalFund(200);
        bobsAccount.depositeFound(100);
        bobsAccount.withdrawalFund(45.55);
        bobsAccount.withdrawalFund(54.46);
        bobsAccount.withdrawalFund(45.46);
    }
}
