package phone;


interface BillAction{
    double totalCost();
}


public class PhoneBill {
    double costTotal;

    public void accept(BillAction billAction){
        costTotal += billAction.totalCost();
    }

    public double total(){
        return costTotal;
    }




}