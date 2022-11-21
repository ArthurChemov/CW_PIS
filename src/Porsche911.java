public class Porsche911 extends CarDecorator{
    private Car car;
    public Porsche911(Car car) {
        this.car = car;
    }
    @Override
    public int getSpeed() {
        return this.car.getSpeed()+100;
    }
    @Override
    public int getBaggageWeight() {
        return this.car.getBaggageWeight()-50;
    }
    @Override
    public int getSeat() {
        return this.car.getSeat()-2;
    }
}
