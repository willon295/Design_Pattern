package dp23_proxy.dynamic_proxy;

public class Main {

    public static void main(String[] args) {

        TrainTicket trainTicket = new TrainTicket(110.5);
        AirTicket airTicket = new AirTicket(750);

        DynamicProxy dynamicProxy = new DynamicProxy();

        Ticket p1 = dynamicProxy.getProxy(trainTicket);
        p1.sell();


        Ticket p2 = dynamicProxy.getProxy(airTicket);
        p2.sell();
    }
}
/*
代理$Proxy0
火车票：110.5
代理$Proxy0
飞机票： 750.0
 */