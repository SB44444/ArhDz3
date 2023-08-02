package solid_P4;

public class RobotWorker implements Worker, Maintenance{
    public void work() {
        System.out.println("Робот работает");
    }
    public void maintenance() {
        System.out.println("Робот на техоблуживании");
    }
}
