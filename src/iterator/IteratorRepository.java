package iterator;

public class IteratorRepository implements Container {
    String[] arrays = {"李浩", "是", "魔鬼"};

    @Override
    public Iterator getIterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index<arrays.length?true:false;
        }

        @Override
        public Object next() {
            if (index < arrays.length)
                return arrays[index++];
            return null;
        }
    }
}
