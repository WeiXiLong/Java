顺序表相关方法代码

public class SeqList {
    public void display(){
        //System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for(int i = 0; i < this.size; ++i){
            System.out.print(arr[i]);
            if(i != size - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void add(int pos,int data){
        if(pos  > this.size || pos < 0){
            return;
        }
        if(this.size >= this.arr.length){
            extend();
        }
        if(pos == this.size) {
            arr[pos] = data;
            this.size++;
        }else {
            for(int i = this.size; i > pos; --i){
                arr[i] = arr[i - 1];
            }
            arr[pos] = data;
            this.size++;
        }
    }

    public boolean contains(int toFind){
        return search(toFind) != -1;
    }

    public int search(int toFind){
        for(int i = 0;i < this.size; ++i){
            if(this.arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public  int getPos(int pos){
       return this.arr[pos];
    }

    public void setPos(int pos,int value){
        this.arr[pos] = value;
    }

    public void removeByPos(int pos){
        if(pos >= this.size || pos < 0){
            return;
        }
        if(pos == this.size - 1){
            --this.size;
        }else {
            for(int i = pos; i < this.size - 1; ++i){
                arr[i] = arr[i + 1];
            }
            --this.size;
        }
    }

    public void removeByValue(int value){
        if(contains(value) == false){
            return;
        }
        if(value == arr[this.size - 1]) {
            --this.size;
        }else{
            int i = search(value);
            for(int j = i; i < this.size - 1; ++j){
                this.arr[j] = this.arr[j+1];
            }
            --this.size;
        }
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        this.size = 0;

    }

    private void extend(){
        int[] newArr = new int[2 * this.arr.length];
        for(int i = 0; i < this.size; ++i){
            newArr[i] = arr[i];
        }
        this.arr = newArr;
    }


    private int[] arr = new int[10];
    private int size = 0;
}
