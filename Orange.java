public class Orange extends Fruit{

    public Orange() {
        super(1.5f);
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public String toString() {
        return String.format("апельсин(вес 1шт. %.2f усл.ед.)", getWeight());
    }
}
