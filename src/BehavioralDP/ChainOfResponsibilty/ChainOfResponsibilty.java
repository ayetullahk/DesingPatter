package BehavioralDP.ChainOfResponsibilty;

public class ChainOfResponsibilty {
    public static void main(String[] args) {
        ChainOfResponsibilty cor=new ChainOfResponsibilty();
        cor.chainOfResponsibilityDemo();
    }
    void chainOfResponsibilityDemo(){
        Approver genelMudur=new GenelMudur();
        Approver mudur=new Mudur(genelMudur);
        Approver memur=new Memur(mudur);

        System.out.println("müşteri memurdan talebi : 50");
        memur.approveLoan(50);
        System.out.println("Müşterinin memurdan talebi : 450");
        memur.approveLoan(450);
        System.out.println("Müşterinin memurdan talebi : 1050");
        memur.approveLoan(1050);
    }
}
