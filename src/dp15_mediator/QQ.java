package dp15_mediator;


import java.text.SimpleDateFormat;
import java.util.Date;

public class QQ {


    public static void  showMessage(QQUser user,String  msg){


        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        System.out.println(user.getName()+"\t"+date);
        System.out.println(msg);

    }
}
