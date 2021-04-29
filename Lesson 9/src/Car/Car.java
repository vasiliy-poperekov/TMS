package Car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor

public class Car implements Start {
    private String brand;
    private double speed, price;

    @Override
    public void start() throws CarNotStartException {
        Random random = new Random();
        if (random.nextInt(21) % 2 == 0) {
            throw new CarNotStartException("Машина марки " + brand + " не завелась");
        } else {
            System.out.println("Машина марки " + brand + " завелась");
        }
    }
}
