package dp20_strategy;


public class Main {

    public static void main(String[] args) {


        String txt = "Text Message!";
        Context context = new Context(new TextParser());
        context.parse(txt);


        String json="{name:'Li',age:23}";
        context=new Context(new JSONParser());
        context.parse(json);

        String  xml = "<name>Li</name>";
        context= new Context(new XMLParser());
        context.parse(xml);

    }
}
/*

Text Message!
JSON_{name:'Li',age:23}
XML__<name>Li</name>

 */