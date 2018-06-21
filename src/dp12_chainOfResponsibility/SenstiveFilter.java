package dp12_chainOfResponsibility;

/**
 * 敏感字过滤器
 */
public class SenstiveFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace("敏感","**");
    }
}
