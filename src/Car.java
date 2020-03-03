public class Car extends Vehicle {
    Car(int id) {
        super(id);
    }

    @Override
    int entrancePrice() {
        return 50000;
    }

    @Override
    int hourPrice() {
        return 20000;
    }
}
