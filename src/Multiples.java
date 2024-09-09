public class Multiples {
    public static void main(String[] args) {
        //function for writing the number of multiples of 3 and 5 which are below 1000
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
