public class CreditPaymentService {
    public static double calculate(double amount, double percent, int years) {
        double monthPercent = percent / 100 / 12; // Ежемесячная процентная ставка
        int months = (years * 12); // Месяцев, необходимый для погашения
        double pow = Math.pow(1 + monthPercent, months); //Функция возведения в степень
        return amount * (monthPercent * pow) / (pow - 1); // Расчет ежемесячного платежа
    }
}