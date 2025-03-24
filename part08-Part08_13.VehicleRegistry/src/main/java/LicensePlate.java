
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof LicensePlate)){
            return false;
        }

        //Convert comapred object to LicensePlate Object
        LicensePlate comparedLicensePlate = (LicensePlate) compared;
        if(this.liNumber.equals(comparedLicensePlate.liNumber) && this.country == comparedLicensePlate.country){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.liNumber, this.country);
    }

}
