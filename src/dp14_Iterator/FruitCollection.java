package dp14_Iterator;

/**
 * 一个水果的容器
 */
public class FruitCollection  implements Container{

    private String [] fruits={"Apple","Banana","Orange","Watermelon"};

    @Override
    public Iterator getIterator() {
        return new FruitIterator();
    }

    /**
     * 内部类，用于返回迭代器
     */
    private class FruitIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            return index < fruits.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return fruits[index++];
            }
            return null;
        }
    }
}
