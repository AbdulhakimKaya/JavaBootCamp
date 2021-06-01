package oopIntro;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",10); // ornek olusturma, referans olusturma, instance olusturma


        Product product2 = new Product(); // ornek olusturma, referans olusturma, instance olusturma
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setUnitPrice(16000);
        product2.setDetail("16 Gb Ram");
        product2.setDiscount(10);

        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1 = new Category(1,"icecek");
        category1.setId(1);
        category1.setName("icecek");

        Category category2 = new Category(2,"yiyecek");
        category2.setId(2);
        category2.setName("yiyecek");

        System.out.println(category1.getId());
        System.out.println(category1.getName());


    }
}
