package models;

public class TieredCake extends Cake{

    private int tiers;
    private int candles;

    public TieredCake(String cakeName, String baseFlavour, int tiers, int candles){
        super(cakeName, baseFlavour);
        this.tiers = tiers;
        this.candles = candles;
    }

//    method to add candles to my cake
    public void addCandles(int candleNumber){
        this.candles += candleNumber;
    }

//    method to add tiers
    public void addTiers(int tiersNumber){
        this.tiers += tiersNumber;
    }

//    method to remove tiers, but cannot remove more tiers if the current tier number is 1, as there will be no cake left
//    standard cake size is 2 tiers
//    i don't think that this is necessary
    public void removeTiers(int tiersNumber){
        if(this.tiers > 1){
            this.tiers -= tiersNumber;
        } else {
            System.out.println("Cannot remove anymore tiers!");
        }
    }

//    method to add message to the traybake:
    public String cakeMessage(String message){
        return  "Print on largest tier: " + message;
    }

    // method to change flavour: but can only be changed to strawberry and pumpkin spice
    //    does this work??
    public void changeFlavour(String newFlavour) {
        if (newFlavour.equals("strawberry") || (newFlavour.equals("pumpkin spice"))) {
            setBaseFlavour(newFlavour);
        }
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}



