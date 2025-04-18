package app;
//Створюємо клас для розрахунку базової ціни товару (без доставки)
public class CalcCostBase {
    //Базовий розрахунок вартості товару
    //Метод приймає товар Product і повертає: кількість * одиницю
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice();
    }
}
