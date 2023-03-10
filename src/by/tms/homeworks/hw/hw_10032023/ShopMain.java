package by.tms.homeworks.hw.hw_10032023;

public class ShopMain {
    public static void main(String[] args) throws EmptyNotFoundException, EmptyProductListException, EntityAlreadyExistsException {
        Product product1 = new Product(1, "Cыр", 5);
        Product product2 = new Product(2, "Хлебушек", 2);
        Product product3 = new Product(3, "Чипсики", 4);
        Shop shop = new Shop();
        try {
            shop.addProduct(product1);
            shop.addProduct(product2);
            shop.addProduct(product3);
            Product[] products;
            products = bubbleSort(shop.printProductList());
            for (Product product : products) {
                System.out.println(product.toString());
            }
            shop.deleteProduct(3);
            shop.changeProduct(2, "Кефир", 10);
            products = shop.printProductList();
            System.out.println("--------");
            for (Product product : products) {
                System.out.println(product.toString());
            }
        } catch (EmptyProductListException | EntityAlreadyExistsException e) {
            System.out.println(e);
        }
    }

    public static Product[] bubbleSort(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].getPrice() > products[j + 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
        return products;
    }
}
