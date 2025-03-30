package Constructor;

public class Product {
    String name;
    int price;
    private Product(String name,Integer price){
        this.name=name;
        this.price=price;
    }

//    Product (String name, int price){
//        this.name=name;
//        this.price=price;
//    }
void display() {
    System.out.println("name = " + name);
    System.out.println("price = " + price);


}

    public static Product setProductNameAndPrice(String name,Integer price){
        return new Product(name,price);
    }

}
