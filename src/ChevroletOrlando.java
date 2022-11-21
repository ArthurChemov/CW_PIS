public class ChevroletOrlando extends CarDecorator{
    private Car car;
    public ChevroletOrlando(Car car) {
        this.car = car;
    }
    @Override
    public int getSpeed() {
        return this.car.getSpeed()+40;
    }
    @Override
    public int getBaggageWeight() {
        return this.car.getBaggageWeight()+20;
    }
    @Override
    public int getSeat() {
        return this.car.getSeat()+3;
    }
}
