package creational.protype;

import org.junit.Assert;
import org.junit.Test;

import creational.prototype.Car;
import creational.prototype.CarI;

public class PrototypeTest {

    @Test
    public void prototypeTest() {
        CarI car = new Car("vitz", "Toyota");

        CarI car2 = car.cloneCar();

        Assert.assertEquals(car.toString(), car2.toString());
    }
}
