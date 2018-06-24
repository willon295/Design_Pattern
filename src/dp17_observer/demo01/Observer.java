package dp17_observer.demo01;


public  class Observer {

    private String name;

    private Subject subject;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 添加新的订阅号
     * @param subject 订阅的项目
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }


    /**
     * 不再订阅
     */
    public void  removeSubject(){
        subject.unAttach(this);
        subject=null;
    }

    public void update() {
        System.out.println(name+" 收到推送 :  " + subject.getMessage());
    }

}
