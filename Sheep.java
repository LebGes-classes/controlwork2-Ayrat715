class Sheep extends Animal {
    public Sheep(double x, double y, double z, double health) {
        super(x, y, z, health);
    }
    // переопределение метода для расчета времени до убийства овцы
    @Override
    public double calculateTimeOfDeath(Animal target) {
        double r = Math.sqrt(Math.pow(target.x - this.x, 2) + Math.pow(target.y - this.y, 2) + Math.pow(target.z - this.z, 2));
        double time = (this.health / 8.0) / r;
        return time;
    }
}
