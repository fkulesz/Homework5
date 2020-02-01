package task1;

import java.util.Scanner;

public class Calculator {
    public void startCalculator(){
        Number number = new Number();
        Scanner scan = new Scanner(System.in);
        int var1;
        int var2;
        int result;
        System.out.println("Podaj pierwszą liczbę: ");
        var1 = scan.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        var2 = scan.nextInt();
        result =  number.checkNumber(var1,var2);
        System.out.println("Wynik : " + result);
    }

}
