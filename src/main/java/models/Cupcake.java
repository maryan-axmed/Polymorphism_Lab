package models;

import java.util.ArrayList;

public class Cupcake extends Cake{

    private String buttercream;
    private ArrayList<Topping> toppings;

    public Cupcake(String cakeName, String baseFlavour, String buttercream){
        super(cakeName, baseFlavour);
        this.buttercream = buttercream;
        this.toppings = new ArrayList<>();
    }

//    method to add toppings
    public void addToppings(Topping choiceOfTopping){
        toppings.add(choiceOfTopping);
    }

//    method to add a cake message
    public String cakeMessage(String message){
        return  "Print across cupcakes: " + message;
}

// method to change flavour: but can only be changed to vanilla and chocolate
//    does this work??
    public void changeFlavour(String newFlavour){
        if (newFlavour.equals("vanilla") || (newFlavour.equals("chocolate"))) {
            setBaseFlavour(newFlavour);
        }
        }

//        getters:

    public String getButtercream() {
        return buttercream;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setButtercream(String buttercream) {
        this.buttercream = buttercream;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }
}
