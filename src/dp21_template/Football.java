package dp21_template;


/**
 * 足球
 */
public class Football extends Game {
    @Override
    void prepare() {
        System.out.println("22 people ready");
    }

    @Override
    void startPlay() {

        System.out.println("playing...");
    }

    @Override
    void endPlay() {

        System.out.println("Football game end !");
    }
}
