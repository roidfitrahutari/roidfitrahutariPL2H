package Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] myArray = {2, 4, 6, 8};
        double sum = 0.0;

        for (int x = 0; x < 4; x++) {

            sum += myArray[x];
        }

        System.out.println(sum);
    }
}
