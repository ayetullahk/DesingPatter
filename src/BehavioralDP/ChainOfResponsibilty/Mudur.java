package BehavioralDP.ChainOfResponsibilty;

import java.util.Queue;

public class Mudur extends Approver {
    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 500) {
            System.out.println("Mudur onayladı");
            System.out.println("------------------");
        } else if (chief != null) {
            System.out.println("miktar mudurun onaylaması dışında şefe yönlendiriliyor");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
