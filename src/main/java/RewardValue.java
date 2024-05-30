public class RewardValue {
    double cashValue;
    double miles;
    RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    RewardValue(double miles){
        this.miles=miles;
    }
    public double getCashValue(){
        return miles/0.0035
    }

    public double getMilesValue(){
        return 0.0035*cashValue;
    }

}
