package models;

import interfaces.ISell;

public class BakingItem implements ISell {

    public String sell(){
        return "Sold a baking item";
    }

}
