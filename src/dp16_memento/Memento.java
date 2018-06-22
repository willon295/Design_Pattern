package dp16_memento;

/**
 * 用于存储备忘信息的 封装类
 */
public class Memento {
    //与Originator 需要备忘的属性相同
    private  int id ;
    private String  state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Memento(int id, String state) {
        this.id = id;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
