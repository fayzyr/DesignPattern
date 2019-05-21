package iterator;


public class ClientTest {
    /**
     * 观察者模式又发布/订阅模式
     * @param args
     */
    public static void main(String[] args) {
       IteratorRepository repository = new IteratorRepository();
        Iterator iterator = repository.getIterator();
        while (iterator.hasNext()){
            System.out.println(""+iterator.next());
        }
    }
}
