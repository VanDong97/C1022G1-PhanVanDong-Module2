package ss10_DSA_DanhSach.bai_tap.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * số lượng phần tử có tron MyArrayList
     */
    private int size = 0;

    /**
     * sức chứa của MyArrayList
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * mảng chứa các phần tử
     */
    Object elements[];

    /**
     * sức chứa mặc định khi khởi tạo constructor không tham số
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * phương thức constructor với sức chứa được tham số truyền vào.
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity : " + capacity);
        }
    }

    /**
     * phương thức trả về số lượng phần tử.
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * phương thức clear ArrayList.
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * phương thức add 1 phần tử vào ArrayList
     *
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(2);
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * phương thức add 1 phần tử tại 1 vị trí chỉ định.
     *
     * @param element
     * @param index
     */
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index :" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    /**
     * phương thức tăng kích thước của ArrayList
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity :" + minCapacity);
        }
    }

    /**
     * phương thức lấy 1 element tại ví trị index.
     *
     * @param index
     * @return
     */
    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * phương thức lấy index của 1 phần tử
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    /**
     * kiểm tra 1 phần tử có trong mảng hay không.
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    /**
     * phương thức tạo ra 1 bản sao của MyArrayList.
     *
     * @return
     */
    public MyArrayList<E> clone() {
        MyArrayList<E> newArr = new MyArrayList<>();
        newArr.elements = Arrays.copyOf(this.elements, this.size);
        newArr.size = this.size;
        return newArr;
    }

    /**
     * phương thức xóa 1 phần tử trong MyArrayList.
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index : " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
