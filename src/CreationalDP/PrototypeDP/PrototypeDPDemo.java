package CreationalDP.PrototypeDP;

public class PrototypeDPDemo {
    public static void main(String[] args) {
        Soldier availableSoldier=new Soldier(100,45,20,50,60,
                5,"Kılıç",true);

        //clone özelliği ile asker üretelim
        Soldier notAvailableSoldier=availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);
    }
}
