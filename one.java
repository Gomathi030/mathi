class Product {
void showProduct() {
System.out.println("Product: Laptop");
System.out.println("Price: Rs. 45000");
}
}

class Order {
void placeOrder() {
System.out.println("Order placed successfully!");
}
}

class ShoppingApp {
public static void main(String[] args) {
Product p = new Product();
Order o = new Order();

    p.showProduct();
    o.placeOrder();

    System.out.println("Thank you for shopping!");
}

}
