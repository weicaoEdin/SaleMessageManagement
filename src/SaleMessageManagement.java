

import java.util.ArrayList;
import java.util.HashMap;

public class SaleMessageManagement {

    private Reporter reporter;
    private SaleDataManager saleDataManager;
    private HashMap<String, ProductSalesData> productSalesData;
    private int totalMessagae;

    public SaleMessageManagement() {
        this.productSalesData = new HashMap<>();
        this.reporter = new Reporter(productSalesData);
        this.saleDataManager = new SaleDataManager(productSalesData);

    }

    public void processMessage(ArrayList<SaleMessage> mesgs){

        try {
            for(SaleMessage mesg: mesgs){

                for(int i = 0 ;i < mesg.getQuantity(); i++){
                    saleDataManager.updateProductSaleData(mesg);
                    totalMessagae++;
                    if(totalMessagae == 10){
                        reporter.reportEveryTenthMessage();
                    }
                    if(totalMessagae == 50){
                        reporter.reportFiftyMessageReceived();
                    }
                }
            }
        }catch (Exception e){
            e.toString();
        }


    }


    public static  void main(String[] args){
        SaleMessageManagement saleMessageManagement = new SaleMessageManagement();

        SaleMessage mesg1 = new SaleMessage("apple",10,1,"add",10);
        SaleMessage mesg2 = new SaleMessage("apple",10,1,"add",10);
        SaleMessage mesg3 = new SaleMessage("apple",10,1,"add",10);
        SaleMessage mesg4 = new SaleMessage("banana",10,1,"subtract",5);
        SaleMessage mesg5 = new SaleMessage("banana",10,1);
        SaleMessage mesg6 = new SaleMessage("orange",10,1,"multiply",2);
        SaleMessage mesg7 = new SaleMessage("orange",10,1);
        SaleMessage mesg8 = new SaleMessage("pear",10,1);
        SaleMessage mesg9 = new SaleMessage("pear",10,1);
        SaleMessage mesg10 = new SaleMessage("apple",10,1);
        SaleMessage mesg11 = new SaleMessage("apple",10,1);

        ArrayList saleMessages = new ArrayList();

        saleMessages.add(mesg1);
        saleMessages.add(mesg2);
        saleMessages.add(mesg3);
        saleMessages.add(mesg4);
        saleMessages.add(mesg5);
        saleMessages.add(mesg6);
        saleMessages.add(mesg7);
        saleMessages.add(mesg8);
        saleMessages.add(mesg9);
        saleMessages.add(mesg10);
        saleMessages.add(mesg11);


        saleMessageManagement.processMessage(saleMessages);
    }





}
