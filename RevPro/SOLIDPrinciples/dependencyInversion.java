class OrderProcessor{
    private PaymentGateway payment;

    public OrderProcessor(PaymentGateway payment){
      this.payment=payment;
    }

    public void processOrder(){
        payment.processPayment();
    }
}

interface PaymentGateway{
    public void processPayment();
}

class DebitCard implements PaymentGateway{
    public void processPayment(){
        System.out.print("Payment using debit");
    };
}

class CreditCard implements PaymentGateway{
    public void processPayment(){
         System.out.println("Payment using credit");
    };
}

public class dependencyInversion{
    public static void main(String[]args){
    PaymentGateway paymentMethod=new DebitCard();
    PaymentGateway paymentMethod2=new CreditCard();
    OrderProcessor processOrder1=new OrderProcessor(paymentMethod);
    OrderProcessor processOrder2=new OrderProcessor(paymentMethod2);
    processOrder1.processOrder();
    processOrder2.processOrder();
}
}
