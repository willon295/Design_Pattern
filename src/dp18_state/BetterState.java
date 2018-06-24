package dp18_state;


/**
 * 超常状态
 */
public class BetterState implements State {

    //超常状态的行为
    @Override
    public void getScore(Athlete athlete) {
        athlete.setState(this);
        System.out.println(15);
    }

    @Override
    public String toString() {
        return "Better";
    }
}
