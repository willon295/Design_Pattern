package dp07_filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 男生信息过滤器
 */
public class MaleFilter implements Filter {


    @Override
    public List<Student> doFilter(List<Student> students) {

        ArrayList<Student> males = new ArrayList<>();

        for (Student student : students) {
            if (Objects.equals("male", student.getGender())) {
                males.add(student);
            }
        }
        return males;
    }
}
