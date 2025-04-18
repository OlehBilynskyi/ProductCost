package app;
// Клас-модель товару
public class Product {
    //Додаємо змінні, які зберігають інформацію про товар
    String name;
    int quota;
    double price;
//Додаємо конструктор (він викликається автоматично коли ми створюємо новий товар)
    //Product має ті самі параметри, що й поля класу
    public Product(String name, int quota, double price) {
        //this означає, що ми звертаємось до змінної в класі, а не до параметра
        this.name = name;
        this.quota = quota;
        this.price = price;
    }
// Додаємо гетери, які дозволяють отримати значення кожного поля
    public String getName() {
        return name;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

    @Override
    //метод toString() повертає рядок, який описує товар
    public String toString() {
        return "Product: " + name + ", quota is " + quota + " " + Constants.MEASURE +
                ", price is " + Constants.CURRENCY + " " + price + ".";
    }
}
