import static Math.pow.pow;

public class CreditPaymentService {
    public int calculate(int amount, double rate, int month) {

        double monthRate = rate / 12 / 100;
        double coefficient = monthRate + (monthRate / (pow((1 + monthRate), month) - 1));

        double payment;
        payment = amount * coefficient;

        return (int) payment;
    }
}
