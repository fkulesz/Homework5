package task3;

public class MainArray {
    public static void main(String[] args) {
        ArrayFactory arrayFactory = new ArrayFactory();
        arrayFactory.fulfillArray();
        arrayFactory.displaylArray();
        System.out.println("Suma 1 3 5 liczby: " +  arrayFactory.sumArray(arrayFactory.getArray()));

    }
}
