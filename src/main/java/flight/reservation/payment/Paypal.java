package flight.reservation.payment;

import java.util.HashMap;
import java.util.Map;

public class Paypal implements PaymentStrategy{
    public static final Map<String, String> DATA_BASE = new HashMap<>();

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment using PayPal");
    }
}
