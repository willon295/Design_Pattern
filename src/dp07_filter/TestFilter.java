package dp07_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author willon
 * @version 0.1.1-SNAPSHOT
 * @since 18-6-20
 */
public class TestFilter {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 530; i < 600 ; i++) {
            students.add(new Student("stu_"+i,i%2==0?"male":"female",i));
        }


        MaleFilter maleFilter = new MaleFilter();
        FemaleFilter femaleFilter = new FemaleFilter();
        HighScoreFilter highScoreFilter = new HighScoreFilter();


        List<Student> males = maleFilter.doFilter(students);
        System.out.println(males);

        List<Student> females = femaleFilter.doFilter(students);
        System.out.println(females);

        List<Student> highs = highScoreFilter.doFilter(students);

        System.out.println(highs);


        AndFilter andFilter = new AndFilter(femaleFilter, highScoreFilter);
        List<Student> and = andFilter.doFilter(students);
        System.out.println(and);


    }
}
