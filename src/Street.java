import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class Street {
    private String name;
    private ArrayList<String> buildings;

    public Street() {
    }

    public Street(String name, ArrayList<String> buildings) {
        this.name = name;
        this.buildings = buildings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "building")
    public ArrayList<String> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<String> buildings) {
        this.buildings = buildings;
    }
}
