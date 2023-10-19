/*
 * Represents a dessert that can be sold at a food truck
 */
public class Dessert {

    private String flavor;    // The flavor of a dessert
    private double price;     // The price of a dessert

    /*
     * Sets flavor to "plain" and price to 0.50
     */
    public Dessert() {
        this("plain", 0.50);
    }

    /*
     * Sets flavor to the specified flavor and
     * price to the specified price
     */
    public Dessert(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    /*
     * Returns the value assigned to flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /*
     * Returns the value assigned to price
     */
    public double getPrice() {
        return price;
    }

    /*
     * Sets flavor to newFlavor
     */
    public void setFlavor(String newFlavor) {
        flavor = newFlavor;
    }

    /*
     * Sets price to newPrice
     */
    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            price = 0;
        }
        else {
            price = newPrice;
        }
    }

    /*
     * Returns a String containing the flavor and price of the dessert
     */
    public String toString() {
        return "Flavor: " + flavor + "\nPrice: " + price;
    }

}
