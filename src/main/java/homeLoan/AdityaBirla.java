package homeLoan;

public class AdityaBirla extends PolicyBazar {

    @Override
    public void ROI() {
        System.out.println("Aditya Birla offers 8.99% ROI on Home Loan");
    }

    public static void main(String[] args) {
        AdityaBirla adityaBirla = new AdityaBirla();
        adityaBirla.ROI();
    }
}
