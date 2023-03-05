package ArrayCode;

public class ArrayData <T>{

    private T [] array;
    private int length =0;
    private int capacity = 0;

    public ArrayData(){
        this(16);
    }

    public ArrayData(int capacity){
        if(capacity < 0) throw new IllegalArgumentException("Exception");
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return size() == 0;
    }
    public T getData(int index){
        return array[index];
    }
    public void setData(int index, T element){
        array[index] = element;
    }
    public void clear(){
        for (int i = 0; i < capacity; i++) array[i] = null;
        length = 0;

    }

    public void addData (T element){
        if(length+1 >= capacity){
            if(capacity == 0) capacity =1;
            else  capacity *=2;
            T[] arraystwo= (T[]) new Object[capacity];

            for (int i = 0; i < length; i++) arraystwo[i] = array[i];
            array = arraystwo;
        }
        array[length++] = element;
    }
}
