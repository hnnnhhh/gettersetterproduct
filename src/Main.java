public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setId(1);
        product.setName("Gadget");
        product.setCategory("Electronics");
        product.setPrice("860");

        System.out.println("PRODUCT NAME: " + product.getName());
        System.out.println("CATEGORY: " + product.getCategory());
        System.out.println("PRICE: " + product.getPrice());

        Product product2 = new Product();

        product2.setId(2);
        product2.setName("Pen");
        product2.setCategory("Stationery");
        product2.setPrice("20");

        System.out.println("PRODUCT NAME: " + product2.getName());
        System.out.println("CATEGORY: " + product2.getCategory());
        System.out.println("PRICE: " + product2.getPrice());
    }
}