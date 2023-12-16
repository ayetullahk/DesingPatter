package CreationalDP.BuilderDP;

public class BuilderRun {
    public static void main(String[] args) {

//        // bu uzun çözüm tavsiye edilmez 40 adet variable olsa yazmak zorlasır.
//        Product product1=new Product();
//        product1.setId(12L);
//        product1.setName("name");
//        product1.setPrice(100);

        //BuilderDP ile obje oluşturalım
        Product product2=new Product.ProductBuilder().id(12L).name("name").description("decr").price(100).build();
        System.out.println("************Product2**************");
        System.out.println(product2);
    }
}
