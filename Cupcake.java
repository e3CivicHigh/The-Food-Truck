/*
 * Represents a cupcake that can be sold at a food truck
 * Cupcake is a type of Dessert
 */
public class Cupcake extends Dessert {

    private boolean isMini;   // Whether or not a cupcake is a miniature cupcake

    /*
     * Sets isMini to true
     */
    public Cupcake() {
        isMini = true;
    }

    /*
     * Sets the flavor to the specified flavor, the price to the
     * specified price, and isMini to the specified status
     */
    public Cupcake(String flavor, double price, boolean isMini) {
        super(flavor, price);
        this.isMini = isMini;
    }

    /*
     * Returns the value assigned to isMini
     */
    public boolean getIsMini() {
        return isMini;
    }

    /*
     * Sets isMini to newIsMini
     */
    public void setIsMini(boolean newIsMini) {
        isMini = newIsMini;
    }

    /*
     * Returns a String containing the flavor and price of a cupcake
     * and whether the cupcake is a mini cupcake
     */
    public String toString() {
        return super.toString() + "Is Mini? " + isMini;
    }

}
