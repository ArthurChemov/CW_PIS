public class Main {
    public static void main(String[] args) {
        Car car = new SimpleCar();
        car = new Porsche911(car);
        System.out.println("Максимальна швидкість Porsche 911 - " + car.getSpeed());
        System.out.println("Максимальна можливість заповнення багажника Porsche 911 - " + car.getBaggageWeight());
        System.out.println("Кількість місць Porsche 911 - " + car.getSeat());

        Car car1 = new SimpleCar();
        car1 = new ChevroletOrlando(car1);
        System.out.println("\nМаксимальна швидкість Chevrolet Orlando - " + car1.getSpeed());
        System.out.println("Максимальна можливість заповнення багажника Chevrolet Orlando - " + car1.getBaggageWeight());
        System.out.println("Кількість місць Chevrolet Orlando - " + car1.getSeat());

        System.out.println("\nПісля модернізації двигуна\n");

        car = new ModernizationSpeed(car);
        System.out.println("Максимальна швидкість Porsche 911 - " + car.getSpeed());
        System.out.println("Максимальна можливість заповнення багажника Porsche 911 - " + car.getBaggageWeight());
        System.out.println("Кількість місць Porsche 911 - " + car.getSeat());

        car1 = new ModernizationSpeed(car1);
        System.out.println("\nМаксимальна швидкість Chevrolet Orlando - " + car1.getSpeed());
        System.out.println("Максимальна можливість заповнення багажника Chevrolet Orlando - " + car1.getBaggageWeight());
        System.out.println("Кількість місць Chevrolet Orlando - " + car1.getSeat());
    }
}