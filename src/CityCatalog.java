import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


@XmlRootElement(name = "City_catalog")
public class CityCatalog {
    private ArrayList<City> cities;

    public CityCatalog() {
    }

    public CityCatalog(ArrayList<City> cities) {
        this.cities = cities;
    }

    @XmlElement(name = "city")
    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
}
