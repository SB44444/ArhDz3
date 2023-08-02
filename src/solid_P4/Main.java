package solid_P4;

public class Main {
    public static void main(String[] args) {
        Worker worker = new RobotWorker();
        Maintenance maintenance = new RobotWorker();
        worker.work();
        maintenance.maintenance();
        Worker work = new HumanWorker();
        Eater eater = new HumanWorker();
        work.work();
        eater.eat();

    }
}
