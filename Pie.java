/*
 * Represents a pie that can be sold at a food truck
 * Pie is a type of Dessert
 */
public class Pie extends Dessert {

    private int diameter;      // The diameter of a pie

    /*
     * Sets the diameter to 6
     */
    public Pie() {
        diameter = 6;
    }

    /*
     * Sets the flavor to the specified flavor, the price to the
     * specified price, and the diameter to the specified diameter
     */
    public Pie(String flavor, double price, int diameter) {
        super(flavor, price);
        this.diameter = diameter;
    }

    /*
     * Returns the value assigned to diameter
     */
    public int getDiameter() {
        return diameter;
    }

    /*
     * Sets diameter to newDiameter
     */
    public void setDiameter(int newDiameter) {
        diameter = newDiameter;
    }

    /*
     * Returns a String containing the flavor, price,
     * and diameter of the pie
     */
    public String toString() {
        return super.toString() + "\nDiameter: " + diameter;
    }

}
