package dp21_template;

/**
 * 篮球游戏
 */
public class Basketball extends Game {
    @Override
    void prepare() {
        System.out.println("10 People ready ...");
    }

    @Override
    void startPlay() {

        System.out.println("playing ...");
    }

    @Override
    void endPlay() {

        System.out.println("Basketball game end !");
    }
}
