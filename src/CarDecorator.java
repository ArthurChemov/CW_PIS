public abstract class CarDecorator implements Car {
    private Car car;
    @Override
    public int getSpeed() {
        return this.car.getSpeed();
    }
    @Override
    public int getBaggageWeight() {
        return this.car.getBaggageWeight();
    }
    @Override
    public int getSeat() {
        return this.car.getSeat();
    }
}
