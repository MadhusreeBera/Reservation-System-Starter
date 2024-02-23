package flight.reservation.payment;

public interface PaymentStrategy {
    public boolean pay(double amount);
}
