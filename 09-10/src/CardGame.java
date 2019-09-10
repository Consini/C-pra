
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName CardGame
 * 扑克牌游戏，不包含大小王
 * @Author: K
 * @create: 2019/9/10-18:47
 **/
/*List的方法：
boolean add(E e) 尾插 e
void add(int index, E element) 将 e 插入到 index 位置
boolean addAll(Collection<? extends E> c) 尾插 c 中的元素
E remove(int index) 删除 index 位置元素
boolean remove(Object o) 删除遇到的第一个 o
E get(int index) 获取下标 index 位置元素
E set(int index, E element) 将下标 index 位置元素设置为 element
void clear() 清空
boolean contains(Object o) 判断 o 是否在线性表中
int indexOf(Object o) 返回第一个 o 所在下标
int lastIndexOf(Object o) 返回最后一个 o 的下标
List<E> subList(int fromIndex, int toIndex) 截取部分 list,左闭右开
*/
public class CardGame {
    private static final String[] SUIT = {"♠","♥","♣","♦"};

    // 买牌
    public static List<Card> buyDeck(){
        List<Card> deck = new ArrayList<>(52);// 52 代表牌的容量
        for(int i = 0;i < 4;i++){//外层循环花色
            for(int j = 1;j < 14;j++) {//内层循环代表数值
                Card card = new Card(j,SUIT[i]);//保存一组牌值
                deck.add(card);//将这个牌插入到顺序表中
            }
        }
        return deck;
    }

    // 洗牌
    public static void shuffle(List<Card> deck){
        for (int i = deck.size() - 1; i > 0; i--) {//从最后一张牌开交换
            int r = new Random().nextInt(i);//产生从 0 到待交换的牌，每次产生不同的随机数
            swap(deck, i, r);//交换
        }
    }

    // 交换，注意 Card 里面有两个内容
    private static void swap(List<Card> deck, int i, int j){
        Card tmp = deck.get(i);
        deck.set(i,deck.get(j));
        deck.set(j,tmp);
    }

    // 抓牌
    public static void send(List<List<Card>> hands,List<Card> deck,int numOfPerson,int numOfCard){
    // 调用 get（）之前保证元素是存在的
        for(int k = 0;k <numOfPerson;k++) {
            hands.add(new ArrayList<>());
        }
        //双重循环玩家一次取牌，取出后则代表这个牌已经不在牌堆中，因此用 remove 删除
        for(int i = 0;i < numOfCard;i++) {
            for(int j = 0;j < numOfPerson;j++) {
                Card card = deck.remove(0);//从整副牌中移除第一个
                hands.get(j).add(card);//第 j 个人拿到的牌插入到自己的手中
            }
        }
    }

    // 判断玩家手中是否有某张牌
    public static void play(List<List<Card>> hands ){
        Card card = new Card(1,"♥");
        System.out.println(hands.size());
        for(int i = 0;i < hands.size();i++){
            if(hands.get(i).contains(card)){
                System.out.println("第"+(++i)+"位玩家输了！");
            }
        }
        System.out.println("没有玩家输哦！");
        return ;
    }

    public static void main(String[] args) {
        List<Card> deck = buyDeck();//买牌
        System.out.println("初始的牌"+deck);
        shuffle(deck);//洗牌
        System.out.println("洗牌后："+deck);
        List<List<Card>> hands = new ArrayList<>();// 抓牌
        send(hands,deck,3,5);
        System.out.println("一号玩家手中的牌为："+hands.get(0));// 输出玩家手中的牌
        System.out.println("二号玩家手中的牌为："+hands.get(1));
        System.out.println("三号玩家手中的牌为："+hands.get(2));
        System.out.println("牌堆中剩余的牌为："+deck);// 输出现在牌堆中的牌
        play(hands);
    }
}
