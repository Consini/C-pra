import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Book
 * @Author: K
 * @create: 2019/9/28-16:27
 **/
class TitleComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
}
class AuthorComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }
}
class PriceComparator implements Comparator<Book>{
    boolean asc;

    public PriceComparator(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(Book o1, Book o2) {
        if(asc){
            return o1.price - o2.price;
        }else{
            return o2.price - o1.price;
        }
    }
}
class SaleComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.sale - o2.sale;
    }
}
class CommentComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.comment - o2.comment;
    }
}
public class Book implements Comparable<Book> {
    public String ISBN;
    public String author;
    public String title;
    public int price;
    public int sale;
    public int comment;
    @Override
    public int compareTo(Book o) {
        return ISBN.compareTo(o.ISBN);
    }
    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", book='" + title + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", comment=" + comment +
                '}';
    }
    public Book(String ISBN, String author, String book, int price, int sale, int comment) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = book;
        this.price = price;
        this.sale = sale;
        this.comment = comment;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add( new Book("001","东野圭吾","白夜行",30,200,1000));
        books.add(new Book("002","余华","活着",25,160,1047));
        List<Book> copy;

        System.out.println("按 ISBN 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy);
        System.out.println(copy);

        System.out.println("按 书名 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new TitleComparator());
        System.out.println(copy);

        System.out.println("按 作者 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new AuthorComparator());
        System.out.println(copy);

        System.out.println("按 价格升序 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new PriceComparator(true));
        System.out.println(copy);

        System.out.println("按 价格降序 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new PriceComparator(false));
        System.out.println(copy);

        System.out.println("按 销售量 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new SaleComparator());
        System.out.println(copy);

        System.out.println("按 评论数 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy,new CommentComparator());
        System.out.println(copy);
    }
}
