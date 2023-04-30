package QueueCode;

import java.util.*;

public class priorityQueue {

    int heapSize = 0;
    int heapCapacity = 0;

    private List<Integer> heap = null;

    private Map<Integer, TreeSet<Integer>>map = new HashMap<>();

    public priorityQueue(){
        this(1);
    }

    public priorityQueue(int size){
        heap = new ArrayList<>(size);
    }

    public priorityQueue(Integer[] elements){
        heapSize = heapCapacity = elements.length;
        heap = new ArrayList<>(heapCapacity);

        for (int i = 0; i< heapSize; i++){
            mapAdd(elements[i], i);
            heap.add(elements[i]);
        }
        
        for (int i = Math.max(0, (heapSize/2) -1); i >=0; i-- )
        sink(i);
    }

    
    public priorityQueue(Collection<Integer> elements){
        this(elements.size());
        for (int a: elements){
            add(elements);
        }
    }

    public boolean isEmpty(){
        return heapSize ==0;
    }

    public void clear(){
        for (int i = 0; i < heapCapacity; i++)
            heap.set(i, null);
        heapSize = 0;
        map.clear();
    }

    public int size(){
        return heapSize;
    }

    public int peek(){
        if (isEmpty()) return Integer.parseInt(null);
        return heap.get(0);
    }

    public int poll(){
        return removeAt(0);
    }

    public boolean contains(Integer[] elements){
        if (elements == null) return false;
        return map.containsKey(elements);
    }
    private void add(Collection<Integer> elements) {

    if (elements == null) throw new IllegalArgumentException();

    if (heapSize < heapCapacity){
        heap.set(heapSize, elements.size());
    }
    else {
        heap.add(elements.size());
    }
    }

    private void sink(int i) {
    }

    private void mapAdd(Integer element, int i) {
    }
}
