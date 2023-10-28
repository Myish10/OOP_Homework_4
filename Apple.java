public class Apple extends Fruit{

    public Apple() {
        super(1.0f);
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public String toString() {
        return String.format("яблоко(вес 1шт. %.2f усл.ед.)", getWeight());
    }
}
