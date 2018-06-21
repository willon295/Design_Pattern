package dp11_flyWeight;

/**
 * 一个实体类
 */
public class DBConnection {

    private String name;

    public DBConnection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
