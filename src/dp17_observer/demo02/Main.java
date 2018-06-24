package dp17_observer.demo02;


public class Main {
    public static void main(String[] args) {

        JavaItem javaItem = new JavaItem();
        PythonItem pythonItem = new PythonItem();


        NormalUser u1 = new NormalUser("u1");
        NormalUser u2 = new NormalUser("u2");
        NormalUser u3 = new NormalUser("u3");
        NormalUser u4 = new NormalUser("u4");


        u1.follw(javaItem);
        u1.follw(pythonItem);
        u2.follw(pythonItem);
        u3.follw(javaItem);
        u4.follw(javaItem);


        javaItem.postNewMessage("java 8 have released");
        pythonItem.postNewMessage("python 4.0 released");


        System.out.println();

        u1.unFollw(pythonItem);


        javaItem.postNewMessage("java 10 have released");
        pythonItem.postNewMessage("python 5.0 released");

    }
}

/*

u1 Get Message java 8 have released From JavaItem
u3 Get Message java 8 have released From JavaItem
u4 Get Message java 8 have released From JavaItem
u1 Get Message python 4.0 released From PythonItem
u2 Get Message python 4.0 released From PythonItem

u1 Get Message java 10 have released From JavaItem
u3 Get Message java 10 have released From JavaItem
u4 Get Message java 10 have released From JavaItem
u2 Get Message python 5.0 released From PythonItem

 */