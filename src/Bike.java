public class Bike extends Vehicle {
    Bike(int id) {
        super(id);
    }

    @Override
    int entrancePrice() {
        return 30000;
    }

    @Override
    int hourPrice() {
        return 10000;
    }
}
