public class ClassAndObjects {
    int x = 10;

    public static void main(String[] args) {
        ClassAndObjects myObj1 = new ClassAndObjects;
        ClassAndObjects myObj2 = new ClassAndObjects;
        myObj2.x = 30;

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}