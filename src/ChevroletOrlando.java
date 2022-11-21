public class ChevroletOrlando extends CarDecorator{
    private Car car;
    public ChevroletOrlando(Car car) {
        this.car = car;
    }
    @Override
    public int getSpeed() {
        return 240;
    }
    @Override
    public int getBaggageWeight() {
        return 100;
    }
    @Override
    public int getSeat() {
        return 7;
    }
}
