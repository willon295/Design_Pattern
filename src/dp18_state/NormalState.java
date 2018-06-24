package dp18_state;


/**
 * 正常状态
 */
public class NormalState implements State {

    //正常状态的行为
    @Override
    public void getScore(Athlete athlete) {
        athlete.setState(this);
        System.out.println(10);
    }

    @Override
    public String toString() {
        return "Normal";
    }
}
