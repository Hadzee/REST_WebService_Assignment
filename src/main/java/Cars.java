import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;

@JacksonXmlRootElement(localName = "cars") public final class Cars {

    @JacksonXmlElementWrapper(localName = "car", useWrapping = false)
    private Car[] car;

    public Cars() {
    }

    public Cars(Car[] car) {
        this.car = car;
    }

    public Car[] getCar() {
        return car;
    }

    public void setCar(Car[] car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "car=" + Arrays.toString(car) +
                '}';
    }

}

