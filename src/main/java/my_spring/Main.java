package my_spring;

import lombok.SneakyThrows;


public class Main {
    @SneakyThrows
    public static void main(String[] args) throws InterruptedException {

//        ApplicationContext context = new ApplicationContext(new JavaConfig("my_spring"));
//        context.getBean(IRobot.class).cleanRoom();
//        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
//        iRobot.cleanRoom();
        WorkerImpl worker = ObjectFactory.getInstance().createObject(WorkerImpl.class);
        while (true) {
            worker.work();
            worker.drinkBeer();
            Thread.sleep(1000);
        }
    }
}
