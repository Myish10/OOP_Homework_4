public class Program {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        Orange orange1 = new Orange();
        System.out.println(orange1);

        Apple apple1 = new Apple();
        System.out.println(apple1);

        System.out.println("-".repeat(18));

        orangeBox.addFruit(orange1);
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getWeight());
        orangeBox.infoBox();

        System.out.println("-".repeat(18));

        appleBox.addFruit(apple1);
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.infoBox();
        System.out.println("-".repeat(18));
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox1.compare(orangeBox));
        System.out.println("-".repeat(18));


        appleBox.pourFromBox(appleBox1);
        appleBox1.infoBox();
        appleBox.infoBox();

    }
}
