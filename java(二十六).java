实现优先队列：
入队
出队
取队首元素


public class Priority_Queue {
    private int[] array = new int[100];
    private int size = 0;

    public void offer(int val) {
        if(size >= array.length) {
            return;
        }
        array[size] = val;
        size++;
        shiftUp(array,size - 1);
    }

    private void shiftUp(int[] array,int index) {
        int child = index;
        int parent = (child - 1) / 2;
        while(child > 0) {
            if(array[child] > array[parent]) {
                swap(array,child,parent);
            }else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    private void shiftDown(int[] array,int size,int index) {
        int parent = index;
        int child =  parent * 2 + 1;
        while(child < size) {
            if(child + 1 < size && array[child + 1] > array[child]) {
                child = child + 1;
            }
            if(array[parent] < array[child]) {
                swap(array,parent,child);
            }else {
                break;
            }
            parent = child;
            child  = parent * 2 + 1;
        }
    }

    public Integer poll() {
        if(size == 0) {
            return null;
        }
        int ret = array[0];
        array[0] = array[size - 1];
        shiftDown(array,size,0);
        return ret;
    }

    public Integer peek() {
        if(size == 0) {
            return null;
        }
        return array[0];
    }

    private void swap(int[] array,int x, int y) {
        int tem = array[x];
        array[x] = array[y];
        array[y] = tem;
    }
}
