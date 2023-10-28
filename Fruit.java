public abstract class Fruit {

    private final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Фрукт весит %.2f усл.ед.", weight);
    }
}
