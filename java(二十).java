public class DLinkedList {
    DListNode head = new DListNode(-1);

    public void addFirst(int elem){
        DListNode node = new DListNode(elem);
        DListNode next = head.next;

        head.next = node;
        node.prev = head;

        node.next = next;
        next.prev = node;
    }

    public void addLast(int elem){
        DListNode node = new DListNode(elem);
        DListNode prev = head.prev;

        head.prev = node;
        node.next = head;

        node.prev = prev;
        prev.next = node;
    }

    public void addIndex(int index,int elem){
        if(index < 0 || index > size()){
            return;
        }
        if(index == 0) {
            addFirst(elem);
        }else if (index == size()) {
            addLast(elem);
        }else {
            DListNode prev = head;
            for(int i = 0; i < index - 1; ++i,prev = prev.next);
            DListNode next = prev.next;

            DListNode node = new DListNode(elem);
            prev.next  = node;
            node.prev = prev;

            next.prev = node;
            node.next = next;
        }
    }

    public boolean contains(int key){
        DListNode cur = head.next;
        while(cur != head){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void remove(int toRemove){
        if(!contains(toRemove)){
            return;
        }
        DListNode cur = head.next;
        DListNode prev = head;
        while(cur != head ){
            if(cur.data == toRemove){
                DListNode next = cur.next;
                prev.next = next;
                next.prev = prev;
                break;
            }
            prev = cur;
            cur = cur.next;
        }
    }

    public void removeAllKey(int key){
        while(true){
            if(!contains(key)){
                return;
            }
            remove(key);
        }
    }

    public int size(){
        int size  = 0;
        for(DListNode cur = head.next; cur != head; cur = cur.next,++size);
        return size;
    }

    public void clear(){
        head.next = head;
        head.prev = head;
    }


    public void display(){
        System.out.print("正向： [");
        for(DListNode cur = head.next; cur != head; cur = cur.next){
            System.out.print(cur.data);
            if(cur.next != head ){
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("反向：[");
        for(DListNode cur = head.prev; cur != head; cur = cur.prev){
            System.out.print(cur.data);
            if(cur.prev != head){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }


}

class DListNode{
    public int data = 0;
    public DListNode prev = this;
    public DListNode next = this;

    public DListNode(int data) {
        this.data = data;
    }
}
