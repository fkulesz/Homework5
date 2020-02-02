package task2;

public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Mleko", "dobre mleko", 10.00, "category1");
        Product product2 = new Product("Chleb", "dobry chleb", 10.00, "category2");
        Product product3 = new Product("Cola", "dobra cola", 10.00, "category3");
        Product product4 = new Product("Czipsy", "dobre czipsy", 10.00, "category4");

        Price price = new Price();
        double grossPrice1 =  price.calculateGrossPrice(product1);
        System.out.println("cena brutto dla " + product1.getName() + " "+  grossPrice1 );
        double grossPrice2 =  price.calculateGrossPrice(product2);
        System.out.println("cena brutto dla " + product2.getName() + " "+ grossPrice2 );
        double grossPrice3 =  price.calculateGrossPrice(product3);
        System.out.println("cena brutto dla " + product1.getName() + " "+ grossPrice3 );
        double grossPrice4 =  price.calculateGrossPrice(product4);
        System.out.println("cena brutto dla " + product4.getName() + " "+ grossPrice4 );

    }
}
