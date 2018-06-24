package dp18_state;


//不写具体状态的具体行为
public class Athlete {

    //持有一个状态实例
    private State state;

    public Athlete() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
