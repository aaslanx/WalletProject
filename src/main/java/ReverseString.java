public class ReverseString {

    public static void main(String[] args) {

        String name = "alper Ulku meryem";

        String reverseName = new StringBuilder(name).reverse().toString().toUpperCase();

        System.out.println(reverseName);
    }
}
