package solid_P4;

public class HumanWorker implements Worker, Eater{
    public void work() {
        System.out.println("Человек работает");
    }
    public void eat() {
        System.out.println("Человек ест");
    }
}
