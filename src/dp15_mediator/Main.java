package dp15_mediator;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        QQUser mike = new QQUser("Mike");
        mike.sendMessage("Good morning !");

        Thread.sleep(5000L);

        QQUser lucy = new QQUser("Lucy");
        lucy.sendMessage("Morning");

        /*
          Mike	2017-10-11 10:31:34
          Good morning !
          Lucy	2017-10-11 10:31:39
          Morning
        * */
    }
}
