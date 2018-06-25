package dp21_template;

/**
 * 游戏规则
 */
public abstract class Game {

     abstract void prepare();

     abstract void startPlay();

     abstract void endPlay();

    //制定游戏规则，必须遵从这个步骤
     void play() {
        prepare();
        startPlay();
        endPlay();
    }
}
