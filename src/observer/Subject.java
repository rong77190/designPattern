package observer;

/**
 * 抽象目标类
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void Notify();
}
