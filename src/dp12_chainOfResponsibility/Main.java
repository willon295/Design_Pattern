package dp12_chainOfResponsibility;

public class Main {
    public static void main(String[] args) {


        String  msg = "6666, 真厉害，敏感信息，<html>";
        FilterChain filterChain = new FilterChain();

        filterChain.addFilter(new HTMLFilter()).addFilter(new SenstiveFilter());

        String s = filterChain.doFilter(msg);
        System.out.println(s);

        //6666, 真厉害，**信息，html
    }
}
