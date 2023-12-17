package BehavioralDP.ChainOfResponsibilty;

public class GenelMudur extends Approver{
    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("Genel müdür onayladı");
        System.out.println("----------------------");
        return true;
    }
}
