import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class City {
    private String name;
    private int area;
    private ArrayList<Street> streets;

    public City() {
    }

    public City(String name, int area, ArrayList<Street> streets) {
        this.name = name;
        this.area = area;
        this.streets = streets;
    }

    @XmlAttribute(name = "area")
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @XmlElement(name = "street")
    public ArrayList<Street> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<Street> streets) {
        this.streets = streets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
