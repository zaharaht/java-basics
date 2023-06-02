public class Question5 {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of array elements is: " + sum);
    }
}
