/**
 * @author Created by Kateryna Maksymenko <kateryna.maksimenko@tonicforhealth.com> on 11/20/16.
 */
public abstract class Beverage {
    String description = "Undefined";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
