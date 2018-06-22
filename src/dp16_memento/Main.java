package dp16_memento;

public class Main {
    public static void main(String[] args) {

        CareTaker taker = new CareTaker();


        Originator o1 = new Originator(1001);
        o1.setState("#1");
        o1.setState("#2");
        taker.add(o1.saveState2Memento());
        o1.setState("#3");


        Originator o2 = new Originator(2002);
        o2.setState("#1");
        taker.add(o2.saveState2Memento());
        o2.setState("#2");

        System.out.println("================");


        o1.getStateFromMemento(taker.get(o1.getId()));
        o2.getStateFromMemento(taker.get(o2.getId()));

    }
}
