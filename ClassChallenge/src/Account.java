import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Account {

    private  String number;
    private  double balence;
    private  String customerName;
    private  String customerEmail;
    private  String customerPhone;

    public Account(){
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balence, String customerName, String Email, String Phone){
        System.out.println(" Account constructor with parameters called ");
        this.number = number;
        this.balence = balence;
        this.customerName = customerName;
//        customerEmail = email;
//        customerPhone = phone;
    }

    public void depositeFound(double depositeAmount){
        balence += depositeAmount;
        System.out.println("Deposite of $" + depositeAmount + "made , new balence is  $" + this.balence);
    }

    public void withdrawalFund(double withdrawalAmount){
        if (balence - withdrawalAmount < 0){
            System.out.println("Insufficient fund! You only have $ " + balence +
                    "in your account");
        }else {
            balence -= withdrawalAmount;
            System.out.println("withdrawal of $ " + withdrawalAmount +
                    "proccesed, Remaining balence is $ " + balence);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalence() {
        return balence;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
