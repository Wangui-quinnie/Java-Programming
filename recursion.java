/* Using recursion (technique that makes a function call itself) to add all the numbers upto 10 */
public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result); //output 55
    }
    public static int sum(int x) {
        if (x > 0) {
            return x + sum(x - 1);
        } else {
            return 0;
        }
    }
}


