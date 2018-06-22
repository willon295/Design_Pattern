package dp16_memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个容器，用于存储和获取 备忘实例
 */
public class CareTaker {

    private Map<Integer, Memento> map = new HashMap<>();

    /**
     * 存储保存备忘对象
     * @param memento 备忘实例
     */
    public void add(Memento memento) {

        System.out.println(memento.getId()+"_备忘:     "+memento.getState());

        map.put(memento.getId(), memento);
    }


    /**
     *  获取备忘对象
     * @param id id
     * @return 备忘实例
     */
    public Memento get(int id) {
        return map.get(id);
    }
}
