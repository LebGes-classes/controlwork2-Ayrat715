public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(0.0, 1.0, 2.0, 8.0); // создаем овцу
        Wolf wolf = new Wolf(2.0, 3.0, 4.0, 15.0); // создаем волка
        double timeOfDeath = wolf.calculateTimeOfDeath(sheep); // расчет времени до убийства овцы
        System.out.println("До убийства овцы осталось " + timeOfDeath + " секунд");
    }
}
