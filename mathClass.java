public class Main {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 201); // 0 to 200
        int myAge = 45;
        int votingAge = 21;

        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.abs(-2.2));
        System.out.println(randomNum);
        System.out.println(Math.random());
        
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote!");
        }
    }
}