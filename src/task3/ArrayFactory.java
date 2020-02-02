package task3;

import java.util.Scanner;

public class ArrayFactory {

    private int[] array = new int[5];

    public void fulfillArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę do tablicy: ");
        array[0] = scan.nextInt();
        System.out.println("Podaj drugą liczbę do tablicy: ");
        array[1] = scan.nextInt();
        System.out.println("Podaj trzecią liczbę do tablicy: ");
        array[2] = scan.nextInt();
        System.out.println("Podaj czwartą liczbę do tablicy: ");
        array[3] = scan.nextInt();
        System.out.println("Podaj piątą liczbę do tablicy: ");
        array[4] = scan.nextInt();

    }
    public void displaylArray(){
        System.out.println("Moja tablica: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
    }

    public int[] getArray() {
        return array;
    }

    public int sumArray(int[] array){
        int sum = 0;
        sum = array[0] +  array [2] + array[4];
        return sum;
    }

}
