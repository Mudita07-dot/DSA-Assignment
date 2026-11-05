package array_and_string_operation.strings.level1;

public class NullPointerDemo {

    static void generateException() {
        String text = null;

        System.out.println(text.length());
    }

    static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated and caught in main");
        }

        handleException();
    }
}