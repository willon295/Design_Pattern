package dp03_builder;

import java.util.Date;

public class SmartPhone {

    //手机编号
    private int ime;
    //手机型号
    private String name;
    //生产日期
    private Date date;


    /**
     * 该类实例只能 通过建造者生成
     *
     * @param builder 建造器
     */
    private SmartPhone(Builder builder) {
        this.ime = builder.ime;
        this.name = builder.name;
        this.date = builder.date;
    }

    public int getIme() {
        return ime;
    }

    public void setIme(int ime) {
        this.ime = ime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ime=" + ime +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    //内部建造者
    public static class Builder {
        private int ime;
        private String name;
        private Date date;

        public Builder setIme(int ime) {
            this.ime = ime;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        //提供build()方法，将自身作为参数传递
        public SmartPhone build() {
            return new SmartPhone(this);
        }
    }

}
