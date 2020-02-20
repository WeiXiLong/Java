写博客总结
1.插入排序
2.希尔排序
3.选择排序

基本思想、性能分析、并编写代码实现

//插入排序
public void insertSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int val = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > val; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = val;
        }
}

//希尔排序
 public void shellSort(int[] array) {
        int gap = array.length;
        while (gap > 1){
            shellSortHelper(array,gap);
            gap = gap / 2;
        }
        shellSortHelper(array,1);
    }

    private void shellSortHelper(int[] array,int gap) {
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            int j = i - gap;
            for (; j >= 0 && array[j] > val; j -= gap){
                array[j + gap] = array[j];
            }
            array[j + gap] = val;
        }
}

//选择排序
public void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - i; j++) {
                if(array[i] > array[j]) {
                    swap(array,i,j);
                }
            }
        }
    }
    private void swap(int[] array,int x,int y) {
        int tem = array[x];
        array[x] = array[y];
        array[y] = tem;
    }

