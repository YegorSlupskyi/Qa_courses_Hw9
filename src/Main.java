package src;

public class Main {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.getShortName());
        System.out.println("The full name of the size you've selected is " + Size.staticGetFullSizeName(Size.MEDIUM));
        System.out.println("You've just used static method above");
        System.out.println();
        System.out.println("The full name of the size you've selected is " + Size.SMALL.getFullSizeName());
        System.out.println("Length = " + Size.SMALL.getLength());
        System.out.println("Width = " + Size.SMALL.getWidth());
    }
}
