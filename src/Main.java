import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> building1 = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
                add("5");
            }
        };
        ArrayList<String> building2 = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
            }
        };
        ArrayList<String> building3 = new ArrayList<String>() {
            {
                add("1");
            }
        };
        ArrayList<String> building4 = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
                add("5");
                add("6");
            }
        };
        ArrayList<String> building5 = new ArrayList<String>() {
            {
                add("10");
                add("5");
                add("157");
                add("89");
            }
        };
        ArrayList<String> building6 = new ArrayList<String>() {
            {
                add("100");
            }

        };

        ArrayList<Street> srtreetsKyiv = new ArrayList<Street>() {
            {
                add(new Street("Peremogy", building1));
                add(new Street("General Zaluzhny", building2));
                add(new Street("Antonovich", building3));
            }
        };
        ArrayList<Street> srtreetsDnipro = new ArrayList<Street>() {
            {
                add(new Street("Poly", building3));
                add(new Street("Kozakiv", building4));
            }
        };
        ArrayList<Street> srtreetsKharkiv = new ArrayList<Street>() {
            {
                add(new Street("Geroiv Kharkiva", building5));
                add(new Street("Sportivna", building6));
            }
        };

        ArrayList<City> cities = new ArrayList<City>() {
            {
                add(new City("Kyiv", 850, srtreetsKyiv));
                add(new City("Dnipro", 405, srtreetsDnipro));
                add(new City("Kharkiv", 350, srtreetsKharkiv));
            }
        };
        CityCatalog cityCatalog = new CityCatalog(cities);

        dataToXml(cityCatalog, "C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\JAXB\\src\\FileRecorded.xml");
    }


    public static void dataToXml(Object objectToMarshal, String filePath) {
        try {
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(objectToMarshal.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(objectToMarshal, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
