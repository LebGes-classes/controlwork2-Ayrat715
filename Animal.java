abstract class Animal {
    protected double x, y, z; // координаты животного
    protected double health; // здоровье животного
    public Animal(double x, double y, double z, double health) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.health = health;
    }
    public abstract double calculateTimeOfDeath(Animal target); // метод для расчета времени до убийства овцы
}
