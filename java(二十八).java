实现
堆排序
冒泡排序
快速排序[递归+ 非递归]
归并排序[递归+ 非递归]

//堆排序
public void heapSort(int[] array) {
        createHeap(array);
        for (int i = 0; i < array.length - 1; i++) {
            swap(array,0,array.length - i - 1);
            shiftDown(array,array.length - 1 - i,0);
        }
    }

    private void createHeap(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0 ; i--) {
            shiftDown(array,array.length,i);
        }
    }

    private void shiftDown(int[] array,int size,int index) {
        int parent = index;
        int child  = parent * 2 + 1;
        while (child < size){
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

    private void swap(int[] array,int x,int y) {
        int tem = array[x];
        array[x] = array[y];
        array[y] = tem;
    }
}

//冒泡排序
public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i ; j--) {
                if(array[j - 1] > array[j]) {
                    swap(array,j - 1,j);
                }
            }
        }
    }

    private void swap(int[] array,int x,int y){
        int tem = array[x];
        array[x] = array[y];
        array[y] = tem;
    }
}

//快速排序[递归]
public void quickSort(int[] array) {
        quickSortHelper(array,0,array.length - 1);
    }

    public void quickSortHelper(int[] array,int left,int right){
        if(left >= right) {
            return;
        }
        int index = partition(array,left,right);
        quickSortHelper(array,left,index - 1);
        quickSortHelper(array,index + 1,right);
    }

    public int partition(int[] array,int left,int right) {
        int BaseIndex = left;
        while (left < right){
            while (left < right && array[right] >= array[BaseIndex]){
                right--;
            }
            while (left < right && array[left] <= array[BaseIndex]){
                left++;
            }
            swap(array,left,right);
        }
        swap(array,left,BaseIndex);
        return left;
    }
    private void swap(int[] array,int x,int y) {
        int tem = array[x];
        array[x] = array[y];
        array[y] = tem;
    }

//快速排序[非递归]
public void quickSortByLoop(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length - 1);
        stack.push(0);
        while (!stack.isEmpty()){
            int left = stack.pop();
            int right = stack.pop();
            if(left >= right) {
                continue;
            }
            int index = partition(array,left,right);

            stack.push(right);
            stack.push(index + 1);

            stack.push(index - 1);
            stack.push(left);
        }
    }

    private int partition(int[] array, int left, int right) {
        int index = right;
        while (left < right) {
            while (left < right && array[left] <= array[index]){
                left++;
            }
            while (left < right && array[right] >= array[index]){
                right--;
            }
            swap(array,left,right);
        }
        swap(array,left,index);
        return left;
    }

    private void swap(int[] array,int x,int y) {
        int tem = array[x];
        array[x] = array[y];
        array[y] = tem;
    }

//归并排序[递归]
 public void mergeSort(int[] array) {
        mergeSortHelper(array,0,array.length);
    }

    public void mergeSortHelper(int[] array,int left,int right) {
        int length = right - left;
        if(left >= right || length == 1){
            return;
        }
        int mid = (left + right) / 2;
        mergeSortHelper(array,left,mid);
        mergeSortHelper(array,mid,right);
        merge(array,left,mid,right);
    }

    private void merge(int[] array,int left,int mid,int right) {
        int i = left;
        int j = mid;
        int length = right - left;
        int[] newArray = new int[length];
        int outputIndex = 0;
        while (i < mid && j < right){
            if(array[i] <= array[j]) {
                newArray[outputIndex++] = array[i++];
            }else {
                newArray[outputIndex++] = array[j++];
            }
        }
        while (i < mid) {
            newArray[outputIndex++] = array[i++];
        }
        while (j < right){
            newArray[outputIndex++] = array[j++];
        }
        for (int k = 0; k < newArray.length; k++) {
            array[left + k] = newArray[k];
        }
    }

//归并排序[非递归]
public void mergeSortByLoop(int[] array){
        for (int gap = 1; gap < array.length; gap *= 2) {
            for (int i = 0; i < array.length; i += 2 * gap) {
                int left = i;
                int mid = i + gap;
                int right = mid + gap;
                if(mid > array.length) {
                    mid = array.length;
                }
                if(right > array.length) {
                    right = array.length;
                }
                merge(array,left,mid,right);
            }
        }
    }
    
    private void merge(int[] array,int left,int mid,int right) {
        int length = right - left;
        int[] newArray = new int[length];
        int outIndex = 0;
        int i = left;
        int j = mid;
        while (i < mid && j < right){
            if(array[i] <= array[j]) {
                newArray[outIndex++] = array[i++];
            }else {
                newArray[outIndex++] = array[j++];
            }
        }
        while (i < mid){
            newArray[outIndex++] = array[i++];
        }
        while (j < right){
            newArray[outIndex++] = array[j++];
        }
        for (int k = 0; k < length; k++) {
            array[left + k] = newArray[k];
        }
    }
