package dp07_filter;

import java.util.List;

/**
 * 联合过滤器
 */
public class AndFilter implements Filter {

    //持有两个过滤器
    private Filter filter;
    private Filter filter2;

    public AndFilter(Filter filter, Filter filter2) {
        this.filter = filter;
        this.filter2 = filter2;
    }

    @Override
    public List<Student> doFilter(List<Student> students) {

        //联合过滤
        List<Student> students1 = filter.doFilter(students);
        return filter2.doFilter(students1);
    }
}
