public class Main {
    public static void main(String[] args) {
        CreditPaymentService monthPayment = new CreditPaymentService();
        double monthPayment1 = CreditPaymentService.calculate(1000000, 9.99, 1);
        System.out.println((int) monthPayment1);
        double monthPayment2 = CreditPaymentService.calculate(1000000, 9.99, 2);
        System.out.println((int) monthPayment2);
        double monthPayment3 = CreditPaymentService.calculate(1000000, 9.99, 3);
        System.out.println((int) monthPayment3);
    }
}
