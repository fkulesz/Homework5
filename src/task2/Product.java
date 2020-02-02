package task2;

public class Product {
    private String name;
    private String description;

    private double netPrice;
    private String category;

    public Product(String name, String description, double netPrice, String category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    public double getNetPrice() {
        return netPrice;
    }
}
