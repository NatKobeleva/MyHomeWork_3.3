public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int myPayment = service.calculate(1_000_000, 9.99, 12);

        System.out.println(myPayment);
    }
}
