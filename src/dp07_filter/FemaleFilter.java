package dp07_filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author willon
 * @version 0.1.1-SNAPSHOT
 * @since 18-6-20
 */
public class FemaleFilter implements Filter {
    @Override
    public List<Student> doFilter(List<Student> students) {

        ArrayList<Student> females = new ArrayList<>();

        for (Student student : students) {
            if (Objects.equals("female", student.getGender())) {
                females.add(student);
            }
        }
        return females;

    }
}
