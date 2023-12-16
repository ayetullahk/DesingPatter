package CreationalDP.Abstract_FactoryDp;

public class AbstractFactoryPatterDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");

        //circle objesi oluşturuldu
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();
        //rengtangle objesi oluşturuldu
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //color fabrikasını oluşturalım
        AbstractFactory colorFActory=FactoryProducer.getFactory("COLOR");

        //red objesi oluşturalım
        Color color1= colorFActory.getColor("RED");
        color1.fill();
    }
}
