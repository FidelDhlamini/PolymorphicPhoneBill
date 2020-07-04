package phone;

public class SMSBundle implements BillAction {

    private double costOfSMS;
    private int Qty;

    public SMSBundle(double costOfSMS,int Qty) {
        this.costOfSMS = costOfSMS;
        this.Qty = Qty;
    }

    @Override
    public double totalCost() {


        return  Qty * costOfSMS;

    }
}
