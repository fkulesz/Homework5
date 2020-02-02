package task2;

public class Price {

    public double calculateGrossPrice(Product product){
        double grossPrice;
        int vat = getVat(product.getCategory());
        grossPrice = product.getNetPrice() + product.getNetPrice()*vat/100;
        return grossPrice;
    }

    public int getVat(String categoryName){
        int vat = 0;
        switch (categoryName) {
            case "category1":
                vat = 10;
                break;
            case "category2":
                vat = 20;
                break;
            case "category3":
                vat = 22;
                break;
            default:
                vat = 23;
                break;
        }
        return vat;
    }

}
