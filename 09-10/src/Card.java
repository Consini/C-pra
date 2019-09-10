/**
 * @ClassName Card
 * 扑克牌
 * @Author: K
 * @create: 2019/9/10-18:42
 **/

public class Card {
    public int rank;//数值
    public String suit;//花色

    public Card(int rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString(){
        if (rank == 1){
            return String.format("[%s %c]", suit, 'A');
        }else if(rank == 11){
            return String.format("[%s %c]", suit, 'J');
        }else if(rank == 12){
            return String.format("[%s %c]", suit, 'Q');
        }else if(rank == 13){
            return String.format("[%s %c]", suit, 'K');
        }
        return String.format("[%s %d]", suit, rank);
    }

    @Override
    public boolean equals(Object o){
        //如果o为null或者o与Card不是一个类型，直接返回false
        if(null == o || !(o instanceof Card)){
            return false;
        }
        //如果o与this指向同一块区域返回true
        if(this == o){
            return true;
        }
        //否则，进行判断，需要向下转型。this.rank = o.rank
        Card obj = (Card)o;
        //判断rank直接用==号，判断suit（字符串）应该使用equals方法
        return obj.rank == rank && suit.equals(obj.suit);
    }
}
