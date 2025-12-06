abstract class Payment {
    abstract void payment(double amount);
}
class MasterCard extends Payment {
    void payment(double amount) {
        System.out.println("Paid " + amount + " MasterCard Foundation.");
    }
}
class Paypal extends Payment {
    void payment(double amount) {
        System.out.println("Paid " + amount + " paypal.");
    }
}
class MoMo extends Payment {
    void payment(double amount) {
        System.out.println("Paid " + amount + " MoMo.");
    }
}
class PaymentProcessor{
    Payment pay;
    PaymentProcessor(Payment p){
        this.pay = p;
    }
    public void processPayment(double amount){
        pay.payment(amount);
    }
    
}

public class Abstraction {
    public static void main(String[] args) {
        PaymentProcessor pp = new PaymentProcessor(new MasterCard());
        pp.processPayment(5000);
        pp = new PaymentProcessor(new Paypal());
        pp.processPayment(3000);
        pp = new PaymentProcessor(new MoMo());
        pp.processPayment(2000);
    }
}