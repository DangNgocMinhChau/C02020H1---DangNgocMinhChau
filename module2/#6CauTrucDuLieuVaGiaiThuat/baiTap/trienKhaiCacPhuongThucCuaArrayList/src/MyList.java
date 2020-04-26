import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if(capacity >=0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

    }

    public int size(){
        return this.size;
    }

    public void clear(){
        size = 0;
        for(int i = 0; i<elements.length ; i++){
            elements[i] = null;
        }
    }

    public boolean add(E e){
        if(elements.length == size){
            this.ensurecapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    private void ensurecapacity(int minCapacity){
        if(minCapacity >=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);

        }else {
            throw new IllegalArgumentException("minCapacity :" + minCapacity);
        }
    }

    public void add(E e , int index){
        if(index > elements.length){
            throw new IllegalArgumentException("index : " + index );
        }else if (elements.length == size){
            this.ensurecapacity(5);
        }
        if(elements[index] == null){
            elements[index] = e;
            size++;

        }else {
            for (int i = size + 1 ; i >= index ; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }
    }

    public E get(int index){
        return (E) elements[index];
    }

    public int indexOf(E element){
        int index = -1;
        for (int i = 0 ; i <size ; i++){
            if(this.elements[i].equals(element)){
                return 1;
            }
        }
        return index;
    }

    public boolean contains(E e){
        return this.indexOf(e) >=0;
    }

    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements,size);
        v.size = this.size;
        return v;
    }

    public E remove(int index){
        if(index <0 || index > elements.length){
            throw new IllegalArgumentException("index:  " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1 ; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }


}




