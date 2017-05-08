

import java.util.ArrayList;
import java.util.List;

public class ProductSalesData {

    private String productType;
    private Double productValue;

    private long totalSaleNumber;
    private double totalSaleValue;
    private List<Adjustment> valueAdjustmentHistory;

    public ProductSalesData(String productType, Double productValue, long totalSaleNumber, double totalSaleValue) {
        this.productType = productType;
        this.productValue = productValue;
        this.totalSaleNumber = totalSaleNumber;
        this.totalSaleValue = totalSaleValue;
        this.valueAdjustmentHistory = new ArrayList<>();
    }


    public long getTotalSaleNumber() {
        return totalSaleNumber;
    }

    public void setTotalSaleNumber(long totalSaleNumber) {
        this.totalSaleNumber = totalSaleNumber;
    }

    public double getTotalSaleValue() {
        return totalSaleValue;
    }

    public void setTotalSaleValue(double totalSaleValue) {
        this.totalSaleValue = totalSaleValue;
    }

    public List<Adjustment> getValueAdjustmentHistory(){
        return valueAdjustmentHistory;
    }


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getProductValue() {
        return productValue;
    }

    public void setProductValue(Double productValue) {
        this.productValue = productValue;
    }


}
