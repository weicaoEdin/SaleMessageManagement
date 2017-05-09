/*
 * Mosaic
 *
 * Copyright 2011 Corelogic Ltd All Rights Reserved.
 */

import java.util.HashMap;

public class SaleDataManager {

    private HashMap<String, ProductSalesData> salesData;

    public SaleDataManager(HashMap<String, ProductSalesData> salesData) {
        this.salesData = salesData;
    }

    public void updateProductSaleData(SaleMessage message){

        String productType = message.getProductType();
        ProductSalesData data = salesData.get(productType);


        if(data == null){
            ProductSalesData newProduct = new ProductSalesData(message.getProductType(),message.getProductValue(),1,message.getProductValue());
            salesData.put(message.getProductType(),newProduct);
            data = newProduct;
        }

        if(message.getAdjustment() != null){
            data.getValueAdjustmentHistory().add(message.getAdjustment());
            switch (message.getAdjustment().getAdjustmentType()){
                case "add": data.setTotalSaleValue(data.getTotalSaleNumber() *
                        (data.getProductValue() + message.getAdjustment().getValue()));
                    break;
                case"subtract": data.setTotalSaleValue(data.getTotalSaleNumber() *
                        (data.getProductValue()) - message.getAdjustment().getValue());
                    break;
                case"multiply": data.setTotalSaleValue(data.getTotalSaleNumber() *
                        (data.getProductValue() * message.getAdjustment().getValue()));
                    break;
            }
        }

        data.setTotalSaleValue(data.getTotalSaleValue() + message.getProductValue());
        data.setTotalSaleNumber(data.getTotalSaleNumber() + 1);


    }

    public HashMap<String, ProductSalesData> getSalesData() {
        return salesData;
    }


}
