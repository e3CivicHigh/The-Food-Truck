/*
 * Represents a cookie that can be sold at a food truck
 * Cookie is a type of Dessert
 */
public class Cookie extends Dessert {

    private boolean isChewy;   // Whether or not a cookie is chewy

    /*
     * Sets isChewy to true
     */
    public Cookie() {
        isChewy = true;
    }

    /*
     * Sets the flavor to the specified flavor, the price to the
     * specified price, and isChewy to the specified status
     */
    public Cookie(String flavor, double price, boolean isChewy) {
        super(flavor, price);
        this.isChewy = isChewy;
    }

    /*
     * Returns the value assigned to isChewy
     */
    public boolean getIsChewy() {
        return isChewy;
    }

    /*
     * Sets isChewy to newIsChewy
     */
    public void setIsChewy(boolean newIsChewy) {
        isChewy = newIsChewy;
    }

    /*
     * Returns a String containing the flavor and price of the cookie
     * and whether it is chewy
     */
    public String toString() {
        return super.toString() + "\nIs Chewy? " + isChewy;
    }
}
