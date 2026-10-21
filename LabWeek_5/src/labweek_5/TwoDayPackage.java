package labweek_5;


public class TwoDayPackage extends Package{
    
    double flatFee;

    public TwoDayPackage(double flatFee, String sName, String sAddress, String sCity, String sState, String sZipCode, String rName, String rAddress, String rCity, String rState, String rZipCode, double weight, double cost) {
        super(sName, sAddress, sCity, sState, sZipCode, rName, rAddress, rCity, rState, rZipCode, weight, cost);
        this.flatFee = flatFee;
    }
    
    @Override
    public double calculateCost(){
        return super.calculateCost() + flatFee;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nFlat Fee: " + flatFee ;
    }
}
