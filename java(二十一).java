创建一个MyString类，模拟实现字符串的基本操作
1.equals
2.compareTo
3.toCharArray
4.contains
5.indexOf
6.lastIndexOf
7.replaceAll
8.repalceFirst
9.split
10.subString
11.trim
12.isEmpty
13.length

未完成


import java.awt.*;

public class MyString {
    char[] list = new char[40];
    int size = 0;
    public boolean Equals(MyString str) {
        if(this.size == 0 && str.size == 0) {
            return true;
        }
        if(this.size != str.size ) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if(this.list[i] != str.list[i]) {
                return false;
            }
        }
        return true;
    }

    public int CompareTo(MyString str) {
        int size1 = this.size;
        int size2 = str.size;
        int min = size1 < size2 ? size1 : size2;
        int k = 0;
        while(k < min) {
            if(this.list[k] != str.list[k]){
                return this.list[k] - str.list[k];
            }
            k++;
        }
        return size1 - size2;
    }

    public char[] ToCharArray(){
        return this.list;
    }

    public boolean Contains(char ch) {
        if(this.size == 0) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if(this.list[i] == ch) {
                return  true;
            }
        }
        return false;
    }

    public Character IndexOf(int index) {
        if(index < 0 || index >= this.size) {
            return  null;
        }
        return this.list[index];
    }

    public Character LastIndexOf(int index) {
        if(index < 0 || index >= this.size) {
            return null;
        }
        return this.list[size - 1 - index];
    }

    public void ReplaceAll (MyString reg,MyString placement) {

    }

    public void ReplaceFirst() {

   }

    public MyString[] Split(Character reg) {
      
    }

    public MyString SubString(int beginIndex) {
        if(beginIndex < 0 || beginIndex >= this.size) {
            return null;
        }
        MyString strings = new MyString();
        for (int i = 0; i < this.size - beginIndex; i++) {
            strings.list[i] = this.list[beginIndex + i];
        }
        return strings;
    }

    public MyString Trim() {
        MyString strings = new MyString();
        int i = 0;
        for (; this.list[i] == ' '; i++);
        for (int j = 0; j < this.size - i; j++,++i) {
            strings.list[j] = this.list[i];
        }
        int k = strings.size - 1;
        for(; strings.list[k] == ' '; --k) ;
        for (int j = strings.size - k - 1; j >= 0; j--,--k) {
            strings.list[j] = strings.list[k];
        }
        return strings;
    }

    public boolean IsEmpty() {
        return this.size == 0;
    }

    public int Length() {
        return this.size;
    }
}
