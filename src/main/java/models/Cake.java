package models;

import interfaces.ISell;

public abstract class Cake implements ISell {

    private String cakeName;
    private String baseFlavour;


    public Cake(String cakeName, String baseFlavour){
        this.cakeName = cakeName;
        this.baseFlavour = baseFlavour;

    }

//    method for writing on the cake:
    public String cakeMessage(String message){
        return message;
    }

//    method for changing flavour of cake:
//    I need to get the current flavour of the cake and then somehow change it
//    I think the following is right?
    public void changeFlavour(String newFlavour){
        getBaseFlavour().replaceAll(baseFlavour, newFlavour);
    }

    public String sell(){
        return "I sold a cake";
    }

//    getters:

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }
}
