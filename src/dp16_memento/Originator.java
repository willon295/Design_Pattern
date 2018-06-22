package dp16_memento;

/**
 * 内部状态  需要被备忘的  实体类
 */
public class Originator {

    //这个属性需要被备忘
    private String state;
    private int id;


    public Originator(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println(id+"_当前： "+state);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 将自身状态 封装成 一个 Memento 对象
     * @return Memento备忘实例
     */
    public Memento saveState2Memento() {
        return new Memento(id,state);
    }

    /**
     *从备忘实例中获取状态信息， 并恢复
     * @param memento 备忘实例
     */
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println(id+"_恢复至： "+state);
    }

}
