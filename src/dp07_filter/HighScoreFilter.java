package dp07_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author willon
 * @version 0.1.1-SNAPSHOT
 * @since 18-6-20
 */
public class HighScoreFilter implements Filter {
    @Override
    public List<Student> doFilter(List<Student> students) {

        ArrayList<Student> highs = new ArrayList<>();

        for (Student student : students) {

            if (student.getScore() >= 580) {
                highs.add(student);
            }
        }
        return highs;
    }
}
