

import java.util.HashMap;
import java.util.Map;

public class Reporter {

    private HashMap<String, ProductSalesData> salesData;

    public Reporter(HashMap<String, ProductSalesData> salesData) {
        this.salesData = salesData;
    }


    public void reportEveryTenthMessage(){
        for(Map.Entry<String, ProductSalesData> entry : salesData.entrySet()){
            String product = entry.getKey();
            ProductSalesData saleData = entry.getValue();

            System.out.println(product + ", total sale number: "
                    + saleData.getTotalSaleNumber()
                    + "; total sale value:: " + saleData.getTotalSaleValue());
        }
    }

    public void reportFiftyMessageReceived(){
        String text = "50 message have been received, system is not pausing and stopping accept new messages.";
            for(Map.Entry<String, ProductSalesData> entry : salesData.entrySet()){
                String product = entry.getKey();
                ProductSalesData saleData = entry.getValue();

                System.out.println(text);
                System.out.println(product + " adjustment details: ");

                for(Adjustment adjustment : saleData.getValueAdjustmentHistory()){
                    System.out.println(adjustment.getInfo());
                }
            }
        Thread.currentThread().suspend();
    }



}
