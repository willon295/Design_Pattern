package dp11_flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个工厂类
 */
public class DBConnFactory {


    private static final Map<String, DBConnection> map = new HashMap<>();

    /**
     * 获取对象，存在则直接返回，不存在则创建并且加进map中
     * @param type 连接的名字
     * @return 连接对象
     */
    public static DBConnection getDBConnection(String type) {

        DBConnection dbConnection = map.get(type);
        if (dbConnection == null) {
            dbConnection = new DBConnection(type);
            System.out.println("create new "+type);
            map.put(type, dbConnection);
        }

        return dbConnection;
    }

    /**
     * 获取map保存对象的大小
     * @return 对象的个数
     */
    public static int getSize(){
        return map.size();
    }

}
