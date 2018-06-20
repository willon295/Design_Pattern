package dp07_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willon on 18-19-06
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
