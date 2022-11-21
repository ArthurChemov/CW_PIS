public class ModernizationSpeed extends CarDecorator{
    private Car car;
    public ModernizationSpeed(Car car) {
        this.car = car;
    }
    @Override
    public int getSpeed() {
        return this.car.getSpeed()+50;
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
