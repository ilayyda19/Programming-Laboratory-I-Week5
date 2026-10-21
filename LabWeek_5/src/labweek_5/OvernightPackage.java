package labweek_5;


public class OvernightPackage extends Package {
    
    double additionalFee;

    public OvernightPackage(double additionalFee, String sName, String sAddress, String sCity, String sState, String sZipCode, String rName, String rAddress, String rCity, String rState, String rZipCode, double weight, double cost) {
        super(sName, sAddress, sCity, sState, sZipCode, rName, rAddress, rCity, rState, rZipCode, weight, cost);
        this.additionalFee = additionalFee;
    }
    
    @Override
    public double calculateCost(){
        return super.calculateCost() + weight * additionalFee;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n Additional Fee: " + additionalFee ;
    }
    
}
