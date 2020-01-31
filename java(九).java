链表相关方法

public class LinkedList {
    private LinkNode head = null;

    public void addFirtst(int data){
        LinkNode node = new LinkNode();
        node.data = data;
        if(this.head == null){
            this.head = node;
        }else{
            node.next = head;
            this.head = node;
        }
    }

    public void addLast(int data){
        LinkNode node = new LinkNode();
        node.data = data;
        if(this.head == null) {
           this.head = node;
        }else {
            LinkNode cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
            //LinkNode prev = this.searchLast();
            //prev.next = node;
        }
    }

    public void addIndex(int index,int data){
        if(index < 0 || index > size()){
            return;
        }else if (index == 0){
            addFirtst(data);
        }else if (index == size()){
            addLast(data);
        }else {
            LinkNode node = new LinkNode();
            node.data = data;

            LinkNode prev = searchPos(index - 1);
            node.next = prev.next;
            prev.next = node;
//            LinkNode prev = new LinkNode();
//            prev = searchPos(index - 1);
//            LinkNode nodeNext = new LinkNode();
//            nodeNext = prev.next;
//            prev.next = node;
//            node.next = nodeNext;

        }
    }

    public boolean contains(int toFind){
        if(this.head == null){
            return false;
        }

        for(LinkNode cur = this.head; cur != null; cur = cur.next){
            if(cur.data == toFind ){
                return true;
            }
        }
        return false;
    }

    public void remove(int toRemove){
        if(this.head == null){
            return;
        }
        if(toRemove == this.head.data) {
            this.head = this.head.next;
        }
//        }else if (toRemove  == searchPos(size() - 1).data){
//            searchPos(size() - 2).next = null;
//        }
        else{
            LinkNode prev = searchPrev(toRemove);
            prev.next = prev.next.next;
            //LinkNode prev = searchPrev(searchData(toRemove));
        }
    }


    private int size(){
        int count = 0;
        for(LinkNode cur = this.head; cur != null; cur = cur.next){
            count++;
        }
        return count;
    }

    private LinkNode searchPos(int pos){
        if(pos < 0 || pos > size() - 1){
            return null;
        }
        LinkNode node = this.head;
        for(int i = 0; i < pos; ++i,node = node.next);
        return node;
    }
//        LinkNode node = new LinkNode();
//        node = this.head;

//        for(int i = 0; i < size(); ++i){
//            if(pos == i){
//                return node;
//            }
//            node = node.next;
//        }
//        return null;


//    private LinkNode searchPrev(LinkNode node){
//        if(this.head == null){
//            return null;
//        }
//        LinkNode cur = this.head;
//        while(cur.next != null){
//            if(cur.next == node){
//                return cur;
//            }
//            cur = cur.next;
//        }
//        return null;
//    }

    private LinkNode searchPrev(int toFind){
        if(this.head == null){
            return null;
        }
        LinkNode cur = this.head;
        while(cur.next != null){
            if(cur.next.data == toFind){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

//    public  LinkNode searchData(int data){
//        if(this.head == null){
//            return null;
//        }else if (contains(data)) {
//            LinkNode cur = new LinkNode();
//            cur = this.head;
//            while(cur != null){
//                if(cur.data == data){
//                    return cur;
//                }
//                cur = cur.next;
//            }
//        }
//        return null;
//    }

    public void removeAllKey(int data){
        if(this.head == null){
            return;
        }else {
            while(contains(data)){
                remove(data);
            }
        }
    }

//    private LinkNode searchLast(){
//        if(this.head == null){
//            return null;
//        }else{
//            LinkNode cur = new LinkNode();
//           for(cur = this.head; cur.next != null; cur = cur.next);
//           return cur;
//        }
//    }

    public void display(){
        System.out.print("[");
        for(LinkNode cur = this.head; cur != null; cur = cur.next){
            System.out.print(cur.data);
            if(cur.next != null){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void clear(){
        this.head = null;
    }
}

class LinkNode{
    protected int data;
    protected LinkNode next = null;
}
