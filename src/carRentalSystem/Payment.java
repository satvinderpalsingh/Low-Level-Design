package carRentalSystem;

public class Payment {
    private Double amount;
    private String paymentMethod;
    private String paymentStatus;
    private Bill bill;

    public Payment(Double amount, String paymentMethod, String paymentStatus, Bill bill) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.bill = bill;
    }

    public Double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
    public Bill getBill() {
        return bill;
    }
    

}
