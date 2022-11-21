public class SimpleCar implements Car{
    private int speed = 200;
    private int baggageWeight = 80;
    private int seat = 4;
    @Override
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public int getBaggageWeight() {
        return this.baggageWeight;
    }
    @Override
    public int getSeat() {
        return this.seat;
    }
}
