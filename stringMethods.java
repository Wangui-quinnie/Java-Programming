public class Strings {
    public static void main(String[] args) {
        String greetings = "Hello World";
        String txt = "I am Winnie!";
        String quote = "I love \"Java\" programming";

        System.out.println("The length of the string is: " + greetings.length()); //11 including the whitespace
        System.out.println(greetings.toUpperCase());
        System.out.println(greetings.toLowerCase());
        System.out.println(greetings.indexOf("World")); //6 begins to count from zero
        System.out.println(greetings.concat(txt));
        System.out.println(quote); // the escape character \ turns double quotes(special characters) to string characters 
    }
}