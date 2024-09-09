public class Reduce {
    public static void main(String[] args) {
        //a method for printing the number of steps it takes from a certain number
        //to reach 0 using the reduce loop
        //100 --> 50 --> 25 --> 24 --> 12 --> 6 --> 3 --> 2 --> 1 --> 0 (answer = 9)
        int num_steps = 0;
        int n = 100;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n/2;
            }
            else {
                n = n-1;
            }
            num_steps++;
        }
        System.out.println(num_steps);
    }
}
