public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("partX");
    }

    @Override
    public void buildPartB() {
        product.add("partY");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
