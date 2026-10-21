package labweek_5;


public class Package {
    
    String sName;
    String sAddress;
    String sCity;
    String sState;
    String sZipCode;
    
    String rName;
    String rAddress;
    String rCity;
    String rState;
    String rZipCode;
    
    double weight;
    double cost;

    public Package(String sName, String sAddress, String sCity, String sState, String sZipCode, String rName, String rAddress, String rCity, String rState, String rZipCode, double weight, double cost) {
        this.sName = sName;
        this.sAddress = sAddress;
        this.sCity = sCity;
        this.sState = sState;
        this.sZipCode = sZipCode;
        this.rName = rName;
        this.rAddress = rAddress;
        this.rCity = rCity;
        this.rState = rState;
        this.rZipCode = rZipCode;
        this.weight = weight;
        this.cost = cost;
    }
    
    
    public double calculateCost(){
        
        return weight * cost;
    }
    
    @Override
    public String toString(){
        return "Sender Name: " + sName + " Address:" +sAddress + " City: " +sCity + " State: " +sState + " Zip Code: " +sZipCode + 
                "\nReceiver Name: "  + rName + " Address:" +rAddress + " City: " +rCity + " State: " +rState + " Zip Code: " +rZipCode +
                "\n Weight: " + weight + " Cost: " + cost +
                "\nTotal Cost: " + calculateCost();
                
    }
    
}
