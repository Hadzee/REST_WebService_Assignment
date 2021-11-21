import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public final class Car {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private String id;
    @JacksonXmlProperty(localName = "manufacturer")
    private String manufacturer;
    @JacksonXmlProperty(localName = "production-year")
    private int production_year;
    @JacksonXmlProperty(localName = "horsepower")
    private int horsepower;
    @JacksonXmlProperty(localName = "consumption")
    private double consumption;
    @JacksonXmlProperty(localName = "price")
    private int price;

    public Car() {
    }

    public Car(String id, String manufacturer, int production_year, int horsepower, double consumption, int price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.production_year = production_year;
        this.horsepower = horsepower;
        this.consumption = consumption;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProduction_year() {
        return production_year;
    }

    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", production_year=" + production_year +
                ", horsepower=" + horsepower +
                ", consumption=" + consumption +
                ", price=" + price +
                '}';
    }
}
