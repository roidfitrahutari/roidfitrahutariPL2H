package ClassandObject;
import java.util.Scanner;

class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}

class Converter{
    public static String toBinary(int num){
        String binary="";
        while(num > 0) {
            binary = (num%2)+binary;
            num /= 2;
        }
        return binary;
    }
}