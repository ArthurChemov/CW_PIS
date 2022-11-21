public class Porsche911 extends CarDecorator{
    private Car car;
    public Porsche911(Car car) {
        this.car = car;
    }
    @Override
    public int getSpeed() {
        return 300;
    }
    @Override
    public int getBaggageWeight() {
        return 30;
    }
    @Override
    public int getSeat() {
        return 2;
    }
}
