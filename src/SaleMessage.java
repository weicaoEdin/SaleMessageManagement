
public class SaleMessage {

    private String productType;
    private double productValue;
    private long quantity;
    private Adjustment adjustment;

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Adjustment getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(Adjustment adjustment) {
        this.adjustment = adjustment;
    }


    public SaleMessage(String productType, double productValue, long quantity) {
        this.productType = productType;
        this.productValue = productValue;
        this.quantity = quantity;
    }

    public SaleMessage(String productType, double productValue,  long quantity, String adjustment, double changeValue) {
        this.productValue = productValue;
        this.productType = productType;
        this.quantity = quantity;
        this.adjustment = new Adjustment(adjustment, changeValue);
    }


    public String getProductType() {
        return productType;
    }


    public double getProductValue() {
        return productValue;
    }


}
