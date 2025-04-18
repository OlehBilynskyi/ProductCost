package app;
//Створюємо клас, який рахує повну ціну з доставкою
// Клас успадковує клас CalcCostBase.
public class CalcCostDelivery {
    // Додаємо фіксовану вартість доставки
    private final static double deliveryPrice = 7.0;

    //Додаємо метод для розрахунку вартості товару, з урахуванням вартості доставки
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice() + deliveryPrice;
    }
}
