package dp08_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author willon
 * @since 18-6-20
 */
public class Directory {

    private String name;

    private List<Directory> subDirs;

    public Directory(String name) {
        this.name = name;
        subDirs = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Directory> getSubDirs() {
        return subDirs;
    }

    public void setSubDirs(List<Directory> subDirs) {
        this.subDirs = subDirs;
    }


    /**
     * 添加子目录，对用户屏蔽细节
     * @param d 子目录
     */
    public void add(Directory d) {
        subDirs.add(d);
    }

    /**
     * 删除子目录，对用户屏蔽细节
     * @param d 子目录
     */
    public void delete(Directory d) {
        subDirs.remove(d);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                '}';
    }
}
