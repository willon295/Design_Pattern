package dp23_proxy.static_proxy.secure;

/**
 * 具体实现类
 */
public class GIFImage  implements Image{

    private String  name;

    public GIFImage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    /**
     * 这个功能安全级别很高，不能被外部访问
     */
    private  void load(){
        System.out.println("私密加载。。");
    }

    /**
     * 显示图片
     */
    @Override
    public void display() {
        load();
        System.out.println("显示图片 : "+name);
    }
}
