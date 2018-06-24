package dp19_nullObject;


public class Main {
    public static void main(String[] args) {


        AbstractEncType utf8 = EncTypeFactory.get("UTF8");
        AbstractEncType gbk = EncTypeFactory.get("GBK");
        AbstractEncType utf16 = EncTypeFactory.get("UTF16");
        AbstractEncType utf32 = EncTypeFactory.get("UTF16");

        System.out.println(utf8.getName()+"__"+utf8.isNil());
        System.out.println(gbk.getName()+"__"+gbk.isNil());
        System.out.println(utf16.getName()+"__"+utf16.isNil());
        System.out.println(utf32.getName()+"__"+utf32.isNil());


    }
}

/*

UTF8__false
GBK__false
Not available __true
Not available __true

 */