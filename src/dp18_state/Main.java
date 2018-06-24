package dp18_state;


public class Main {

    public static void main(String[] args) {



        Athlete athlete = new Athlete();


        NormalState normalState = new NormalState();
        BetterState betterState = new BetterState();

        State curState;

        normalState.getScore(athlete);
        curState = athlete.getState();
        System.out.println("Current State: "+curState+"\n");


        betterState.getScore(athlete);
        curState = athlete.getState();
        System.out.println("Current State: "+curState+"\n");

        ExhaustedState exhaustedState = new ExhaustedState();
        exhaustedState.getScore(athlete);
        curState=athlete.getState();
        System.out.println("Current State: "+curState+"\n");
    }
}
/*运行结果

10
Current State: Normal

15
Current State: Better

5
Current State: ExhaustedState
*/
