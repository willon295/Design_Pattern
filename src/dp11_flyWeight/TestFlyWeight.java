package dp11_flyWeight;

/**
 * @author willon
 * @since 6/21/18
 */
public class TestFlyWeight {
    public static void main(String[] args) {
        DBConnection mysql = DBConnFactory.getDBConnection("mysql");
        DBConnection oracle = DBConnFactory.getDBConnection("oracle");
        DBConnection mysql2 = DBConnFactory.getDBConnection("mysql");
        DBConnection habse = DBConnFactory.getDBConnection("hbase");
        DBConnection mysql3 = DBConnFactory.getDBConnection("mysql");

        System.out.println(mysql==mysql2);
        System.out.println(mysql.equals(mysql3));
        System.out.println(DBConnFactory.getSize());


        /*
        create new mysql
        create new oracle
        create new hbase
        true
        true
        3
        * */

    }
}
