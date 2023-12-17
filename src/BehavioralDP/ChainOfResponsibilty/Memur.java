package BehavioralDP.ChainOfResponsibilty;

public class Memur extends Approver{

    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<100){
            System.out.println("memur onayladı");
            System.out.println("------------------");
        } else if (chief!=null) {
            System.out.println("miktar memurun onaylaması dışında şefe yönlendiriliyor");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
