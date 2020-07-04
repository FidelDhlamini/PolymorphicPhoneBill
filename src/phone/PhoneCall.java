package phone;

public class PhoneCall implements BillAction {
    private double costOfCall;

    public PhoneCall(double costOfCall) {
        this.costOfCall = costOfCall;
    }

    @Override
    public double totalCost() {

        return costOfCall;

    }

}
