package dp12_chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 */
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();

    /**
     * 添加过滤器
     * @param filter 被添加的过滤器
     * @return 过滤链
     */
    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }


    @Override
    public String doFilter(String msg) {

        for (Filter filter : filters) {
            msg = filter.doFilter(msg);
        }
        return msg;
    }
}
