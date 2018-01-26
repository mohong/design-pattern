public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.constructor(builder1);
        Product product1 = builder1.getProduct();
        product1.show();

        director.constructor(builder2);
        Product product2 = builder2.getProduct();
        product2.show();
    }
}
