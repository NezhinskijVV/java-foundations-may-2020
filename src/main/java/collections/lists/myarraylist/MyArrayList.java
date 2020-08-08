package collections.lists.myarraylist;


public class MyArrayList {
    public final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize >= array.length) {
            Object[] resArray = new Object[array.length / 2 * 3 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        if (contains(o)) {
            int removeElemIndex;

            for (removeElemIndex = 0; removeElemIndex < realSize; removeElemIndex++) {
                if (array[removeElemIndex].equals(o)) {
                    break;
                }
            }

            for (int i = removeElemIndex; i < realSize - 1; i++) {
                array[i] = array[i + 1];
            }

            array[realSize - 1] = null;
            realSize--;
            return true;
        }
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        if ((index >= realSize) && (index >= 0)) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }
}
