package StructuralDP.ProxyDP;

public class RealClass implements ImageGenerator {

    private String fullPath;

    public RealClass(String fullPath){
        this.fullPath=fullPath;
    }
    @Override
    public void showImage() {
        System.out.printf("resim gösteriliyor"+ fullPath);
    }
    public void getName(){
        System.out.printf(",,,,");
    }
    public void getLastName(){
        System.out.printf(",,,,");
    }
}
