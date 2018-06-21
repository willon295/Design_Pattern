package dp12_chainOfResponsibility;

/**
 * Html 字符过滤器
 */
public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace("<", "").replace(">", "");
    }
}
