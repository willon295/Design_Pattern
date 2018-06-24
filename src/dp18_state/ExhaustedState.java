package dp18_state;


/**
 * 疲惫状态
 */
public class ExhaustedState  implements State{

    //疲惫状态的行为
    @Override
    public void getScore(Athlete athlete) {
        athlete.setState(this);
        System.out.println(5);
    }

    @Override
    public String toString() {
        return "ExhaustedState";
    }
}
