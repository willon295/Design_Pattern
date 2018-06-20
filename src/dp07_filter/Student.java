package dp07_filter;


public class Student {
    private String name;
    private int score;
    private String gender;

    public Student(String name, String gender, int score) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", gender='" + gender + '\'' +
                '}';
    }
}
