package models;

public class TraybakeCake extends Cake {

    private int slices;

    public TraybakeCake(String cakeName, String baseFlavour, int slices) {
        super(cakeName, baseFlavour);
        this.slices = slices;
    }

    //    method to increase tray bake size: the total number of slices must be a multiple of 4
//    4 8 12 16 20
    public void addSlices(int slices) {
        if (this.slices + slices % 4 == 0) {
            this.slices += slices;
        } else {
            System.out.println("The total number of slices must be a multiple of 4");
        }
    }

    //    remove slices: number of slices must be 4 (or greater) and a multiple of 4
    public void removeSlices(int slices) {
        if ((this.slices - slices % 4 == 0) && (this.slices - slices > 4)) {
            this.slices -= slices;
        } else {
            System.out.println("The remaining number of slices are either: not a multiple of 4 or less than 4");
        }
    }

    //    method for message to be added to traybake:
    public String cakeMessage(String message) {
        return "Print on traybake: " + message;
    }

    // method to change flavour: but can only be changed to red velvet and coffee
    //    does this work??
    public void changeFlavour(String newFlavour) {
        if (newFlavour.equals("red velvet") || (newFlavour.equals("coffee"))) {
            setBaseFlavour(newFlavour);
        }
    }

    public int getSlices() {
        return this.slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }
}
