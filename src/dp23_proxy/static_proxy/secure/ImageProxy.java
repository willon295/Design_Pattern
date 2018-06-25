package dp23_proxy.static_proxy.secure;


public class ImageProxy implements Image {

    private String name;
    private Image image;

    public ImageProxy(String name) {
        this.name = name;
        image = new GIFImage(this.name);
    }

    public String getName() {
        return name;
    }


    /**
     * 代理功能，屏蔽加载的细节
     */
    @Override
    public void display() {
        image.display();
    }
}
