package JumpStatement;

public class ShoppingCart {

    public static void main(String[] args) {

        String[] products = {"Laptop", "Mobile", "Headphones", "Keyboard"};
        boolean[] inStock = {true, false, true, false};

        for (int i = 0; i < products.length; i++) {

            // Skip the product if it is out of stock
            if (!inStock[i]) {
                continue;
            }

            System.out.println("Adding to cart: " + products[i]);
        }
    }
}