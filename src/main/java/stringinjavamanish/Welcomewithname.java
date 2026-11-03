package stringinjavamanish;

public class Welcomewithname {
        public static void main(String[] args) {
            String name = "Manish";
            String course = "Java Programming";

            String message = "Welcome ".concat(name).concat(" to ").concat(course);

            System.out.println(message);
        }
    }
