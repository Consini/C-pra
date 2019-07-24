/**
 * @ClassName SequenceList
 * @Description:
 * @Author:
 * @Date: 2019/7/24
 * @Time: 14:01
 * @Version 1.0
 **/
public class SequenceList {//顺序表
    private int[] array;//数组容量为array.length
    private int size;//现有数据个数

    public SequenceList(){//申请空间，初始化数据个数为0
        array = new int[5];
        size = 0;
    }

    private void ensureCapacity(){//确定数组容量是否足够，不够扩充
        if(size < array.length){
            return ;
        }
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        for(int i = 0;i < size;i++){
            newArray[i] = array[i];
        }
        array = newArray;//新的引用
    }

    public void print(){//打印顺序表
        System.out.print("顺序表为： ");
        for(int i = 0;i < size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void headInsert(int element){//头插
        ensureCapacity();
        // for(int i = size - 1;i >= 0; i--){
        // array[i+1] = array[i];
        // }
        for(int i = size;i > 0;i--){
            array[i] = array[i - 1];
        }
        array[0] = element;
        size++;
    }

    public void tailInsert(int element){//尾插
        ensureCapacity();
        array[size++] = element;
    }

    public void insert(int index,int element){//指定下标插入
        if (index < 0 || index > size) {
            System.err.println("下标不符合！");
            return;
        }
        ensureCapacity();
        // for(int i = size; i > index ; i--){
        // array[i] = array[i - 1];
        // }
        for(int i = size - 1;i >= index;i--){
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public void headDelect(){//头删
        if (size <= 0) {
            System.err.println("顺序表为空");
            return;
        }

        for(int i = 1;i < size;i++){
            array[i - 1] = array[i];
        }
        array[--size] = 0;
    }

    public void tailDelect(){//尾删
        if (size <= 0) {
            System.err.println("顺序表为空");
            return;
        }
        array[--size] = 0;
    }

    public void delect(int index){//删除
        if (size <= 0) {
            System.err.println("顺序表为空");
            return;
        }
        if (index < 0 || index >= size) {
            System.err.println("下标错误");
            return;
        }

        for(int i = index + 1;i < size;i++){
            array[i - 1] = array[i];
        }
        array[--size] = 0;
    }

    public int getIndex(int element){//查找某个元素在顺序表中的位置
        for(int i = 0;i < array.length;i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public void delectElement(int element){//删除某个元素，若该元素多次出现，删除第一次出现的位置
        int index = getIndex(element);
        if(index != -1){
            delect(index);
        }
        return;
    }

    public void delectElementAll(int element){
        //删除表中所有element元素
        /*时间O(n^2)    空间O(n)
        int index;
        while((index = getIndex(element)) != -1){
            delect(index);
        }*/
         /*时间O(n)   空间O(n)
         int[] newArray = new int[array.length];
         int j = 0;
         for(int i = 0;i < size; i++){
            if(array[i] != element){
                newArray[j++] = array[i];
            }
         }
         arrar = newArray;
         size = j;
          */
         //时间O(n）   空间O(1)
        int j = 0;
        for(int i = 0;i < size; i++){
            if(array[i] != element){
                array[j++] = array[i];
            }
        }
        size = j;
    }

    public int search(int element){//查找
        for(int i = 0;i < size;i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public void modify(int index,int element){//修改
        if (index < 0 || index > size) {
            System.err.println("下标错误");
            return;
        }
        array[index] = element;
    }
    public static void main(String[] args){
        SequenceList list = new SequenceList();
        list.print();
        list.tailInsert(12);//12
        list.tailInsert(20);//12 20
        list.headInsert(10);//10 12 20
        list.insert(2,34);//10 12 34 20
        list.print();
        list.insert(5,1);//error
        list.print();
        list.headDelect();//12 34 20
        list.tailDelect();//12 34
        list.print();
        list.search(12);//0
        list.print();
        list.delectElement(12);//34
        list.print();
        list.modify(0,1);
        list.print();
        list.tailDelect();
        list.print();
        list.headDelect();
    }
}
