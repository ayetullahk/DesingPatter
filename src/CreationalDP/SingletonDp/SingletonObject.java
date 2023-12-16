package CreationalDP.SingletonDp;

public class SingletonObject {

    String message = "Merhaba";

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return instance;
    }

    public void showMessage() {
        this.message = this.message + "  Batch 82-83";
        System.out.println(this.message);
    }
}
//SingletonObject obje1=new SingletonObject();