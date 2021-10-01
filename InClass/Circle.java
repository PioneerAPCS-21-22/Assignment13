/**
 * This is a class to represent a circle.
 *
 * @author Mr. King
 * @version 9/29/2021
 */

public class Circle {
    private double radius;
    
    public Circle(double r) {
        setRadius(r);
    }

    /**
     * Set the value of the radius. Radius is a private
     * instance variable, so this method must be used in
     * order to change the value. Also, it will not change
     * the value unless it is valid (greater than 0).
     *
     * @param r - the new radius
     * @return none
     */
    public void setRadius(double r) {
        if(r > 0) {
            radius = r;
        }
    }

    /**
     * Calculates the area of this Circle.
     *
     * @param none
     * @return the area of this Circle
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
