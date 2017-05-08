

public class Adjustment {

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public double getValue() {
        return value;
    }

    private String adjustmentType;
    private double value;


    public Adjustment(String adjustmentType, double value) {
        this.adjustmentType = adjustmentType;
        this.value = value;
    }


    public String getInfo(){
        return "adjustment has been make to " + adjustmentType + " " + value + " to each product";
    }
}
