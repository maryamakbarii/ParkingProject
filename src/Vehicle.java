abstract class Vehicle {
    private int id;
    private int exitHour;
    private int entryHour;

    abstract int entrancePrice();

    abstract int hourPrice();

    Vehicle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getExitHour() {
        return exitHour;
    }

    public int setExitHour(int exitHour) {
        this.exitHour = exitHour;
        return 0;
    }

    public int getEntryHour() {
        return entryHour;
    }

    public int setEntryHour(int entryHour) {
        this.entryHour = entryHour;
        return 0;
    }

    public int getCost() {
        return entrancePrice() + hourPrice() * (Math.abs(exitHour - entryHour));
    }
}
