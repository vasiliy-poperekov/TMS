package homework.number4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter

public class Auto implements Serializable {
    private String brand;
    private double price, speed;

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
