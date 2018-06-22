package dp14_Iterator;


public class Main {


    public static void main(String[] args) {

        FruitCollection fruitCollection = new FruitCollection();
        Iterator iterator = fruitCollection.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /*
    Apple
    Banana
    Orange
    Watermelon

    */
}
