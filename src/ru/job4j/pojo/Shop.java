package ru.job4j.pojo;

public class Shop {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 9);
        products[4] = new Product("Sandwich", 8);

        Shop.delete(products, 3);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;

        for (int i = 0; i < products.length - 1; i++) {
            if (i >= index) {
                products[i] = products[i + 1];
            }
        }

        products[products.length - 1] = null;

        return products;
    }
}