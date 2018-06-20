package dp07_filter;

import java.util.List;

/**
 * 通用的过滤接口
 */
public interface Filter {
     List<Student> doFilter(List<Student> students);
}
