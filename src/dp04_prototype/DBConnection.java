package dp04_prototype;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection implements Cloneable {


    private String url = "jdbc:mysql://localhost";
    private String username = "root";
    private String driver = "com.mysql.jdbc.Driver";
    private String password = "root";

    private Connection conn;

    public DBConnection() throws Exception {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
    }

    @Override
    protected Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
        }
        return o;
    }

}



