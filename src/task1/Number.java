package task1;

public class Number {
    private int input1;
    private int input2;


    public int checkNumber(int input1, int input2){
        int result = 0;
        if(input1 > input2) {
            result = input1 + input2;
            System.out.println("pierwsza wieksza od drugiej wiec dodaje");
        } else if(input1 < input2){
            result = input1*input2;
            System.out.println("pierwsza mniejsza od drugiej wiec mnożę");
        } else if( input1 == input2) {
            result = input1*input1;
            System.out.println("są równe więc potęguję");
        }
        return result;
    }


}
