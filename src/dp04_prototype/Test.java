package dp04_prototype;

public class Test {
    public static void main(String[] args) throws Exception {

        //获取这个类的实例  是一个非常消耗资源的操作，所以一般会克隆
        DBConnection dbConnection = new DBConnection();

        for (int i = 0; i < 20; i++) {

            DBConnection c = (DBConnection) dbConnection.clone();

        }

    }

}
