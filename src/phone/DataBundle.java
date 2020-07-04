package phone;

public class DataBundle implements BillAction {
    private double megabytes;
    private double costOfMegabytes;

    public DataBundle(double megabytes) {
        this.megabytes = megabytes;

        if(this.megabytes < 500){
            costOfMegabytes = this.megabytes * 0.75;
        }
        if(this.megabytes > 500){
            costOfMegabytes = this.megabytes * 0.55;
        }

        else if (this.megabytes > 1000){
            costOfMegabytes = this.megabytes * 0.35;
        }
    }

    @Override
    public double totalCost() {

        return costOfMegabytes;

    }
}
