package dp17_observer.demo02;


import java.util.ArrayList;
import java.util.List;

public class NormalUser {

    private String name;
    private List<Item> items;


    public NormalUser(String name) {
        items = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 订阅
     * @param item 订阅的话题
     */
    public void follw(Item item) {
        items.add(item);
        item.attach(this);
    }

    public void unFollw(Item item) {
        if (items != null) {
            items.remove(item);
        }
        item.unAttach(this);
    }

    /**
     * 更新话题
     * @param item 更新的话题
     */
    public void update(Item item){
        System.out.println(name+" Get Message "+item.getMessage()+" From "+item.getClass().getSimpleName());
    }
}
