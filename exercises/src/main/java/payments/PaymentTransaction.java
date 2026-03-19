package payments;

import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class PaymentTransaction {

    private static final List<String> ALLOWED_CURRENCIES = Arrays.asList("PLN", "GUY", "BRE", "CFD", "EUR");
    private int amount;
    private String currency;
    private String status;

    public PaymentTransaction(int amount, String currency) {
        if (amount >= 0 && ALLOWED_CURRENCIES.contains(currency) && currency.length() == 3) {
            this.amount = amount;
            this.currency = currency;
            this.status = "PENDING";
        } else {
            throw new IllegalArgumentException("Invalid transaction data");
        }
    }

    public static void main(String[] args) {
        //tests for constructor
        Object[][] testCases = {
                {-1, null, false},
                {0, null, false},
                {1, null, false},
                {-1, "PL", false},
                {0, "DE", false},
                {1, "BR", false},
                {-1, "PLN", false},
                {0, "GUY", true},
                {1, "BRE", true}
        };

        for (int i = 0; i < testCases.length; i++) {
            try {
                int amount = (Integer) testCases[i][0];
                String currency = (String) testCases[i][1];
                PaymentTransaction pt = new PaymentTransaction(amount, currency);
                Assert.assertEquals((Boolean) testCases[i][2], true);
                System.out.println("Test " + (i + 1) + " Object created as expected");
            } catch (IllegalArgumentException e) {
                Assert.assertEquals((Boolean) testCases[i][2], false);
                System.out.println("Test " + (i + 1) + " Illegal arguments as expected");
            }
        }

        // tests for process
        PaymentTransaction pt1 = new PaymentTransaction(0, "CFD");
        Assert.assertEquals(pt1.getStatus(), "PENDING");
        pt1.process();
        Assert.assertEquals(pt1.getStatus(), "FAILED");

        PaymentTransaction pt2 = new PaymentTransaction(1, "EUR");
        Assert.assertEquals(pt2.getStatus(), "PENDING");
        pt2.process();
        Assert.assertEquals(pt2.getStatus(), "COMPLETED");
        pt2.process();
        Assert.assertEquals(pt2.getStatus(), "COMPLETED");

        // tests for getMaskedDetails
        PaymentTransaction pt3 = new PaymentTransaction(1, "EUR");
        Assert.assertEquals(pt3.getMaskedDetails().replace("Payment: ***", "").length(), 3);
        Assert.assertTrue(pt3.getMaskedDetails().startsWith("Payment: ***"));
        Assert.assertFalse(pt3.getMaskedDetails().contains("1"));

        // test for isValid
        PaymentTransaction pt4 = new PaymentTransaction(1, "GUY");
        Assert.assertEquals(pt4.isValid(), true);
        PaymentTransaction pt5 = new PaymentTransaction(0, "GUY");
        Assert.assertEquals(pt5.isValid(), false);

    }

    public void process() {
        if (this.amount == 0) {
            this.status = "FAILED";

        } else if (this.amount > 0) {
            this.status = "COMPLETED";
        }
    }

    public String getMaskedDetails() {
        return "Payment: ***" + this.currency;
    }

    public boolean isValid() {
        return this.amount > 0 && ALLOWED_CURRENCIES.contains(this.currency);
    }

    public String getStatus() {
        return this.status;
    }
}
