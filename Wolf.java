class Wolf extends Animal {
    private final double hf = 20.0; // константа полного здоровья у волка
    private final double d = 4.0; // константа урона волка
    public Wolf(double x, double y, double z, double health) {
        super(x, y, z, health);
    }
    // переопределение метода для расчета времени до убийства овцы
    @Override
    public double calculateTimeOfDeath(Animal target) {
        double r = Math.sqrt(Math.pow(target.x - this.x, 2) + Math.pow(target.y - this.y, 2) + Math.pow(target.z - this.z, 2));
        double time = (this.health / hf) * d / Math.pow(r, 2);
        return time;
    }
}
