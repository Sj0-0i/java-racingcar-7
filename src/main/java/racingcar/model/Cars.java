package racingcar.model;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(List<Car> cars) {
        return new Cars(cars);
    }

    public void moveAll() {
        for (Car car : cars) {
            car.generateSpeed();
            if (car.isMoveable()) {
                car.move();
            }
        }
    }
}