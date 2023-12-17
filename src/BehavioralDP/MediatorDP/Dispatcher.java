package BehavioralDP.MediatorDP;

//sadece dağıtım işini yapacaktır
public interface Dispatcher {
    void dispatch(String topic, String message);
}
