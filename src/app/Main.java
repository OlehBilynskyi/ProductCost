package app;

public class Main {

    public static void main(String[] args) {
//Отримуємо вхідні дані з методу getData()
        String[] data = getData();
//Формуємо об'єкт з вхідних даних
        Product product = new Product(data[0],
                Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));
//Створюємо об'єкт, що рахує базову ціну і викликає метод calcCost()
        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);
//Розраховуємо вартість товару, з урахуванням доставки
        CalcCostDelivery costDelivery = new CalcCostDelivery();
        double deliveryCost = costDelivery.calcCost(product);
//Формуємо текст виводу для базової ціни
        String baseOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + baseCost + ".";
        //Формуємо текст виводу для ціни з доставкою
        String deliveryOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + deliveryCost + ".";
//Виводимо результати у консоль
        getOutput(baseOutput);
        getOutput(deliveryOutput);
    }
    //Набір вхідних даних
    //Метод getData повертає вхідні дані
    public static String[] getData() {
        return new String[] {"abc", "5", "2.5"};
    }
//Метод getOutput() просто виводить текст на екран
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
