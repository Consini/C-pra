/**
 * @ClassName Article
 * @Author: K
 * @create: 2019/9/10-20:38
 **/

public class Article {
    String title;
    String author;
    String content;
    String publishedAt;

    public boolean equals(Object o){
        //如果o为null或者o与Card不是一个类型，直接返回false
        if(null == o || !(o instanceof Card)){
            return false;
        }
        //如果o与this指向同一块区域返回true
        if(this == o){
            return true;
        }
        Article a = (Article)o;
        if(title.equals(a.title) && author.equals(a.author) && content.equals(a.content) && publishedAt.equals(a.publishedAt)){
            return true;
        }
       return false;

    }
}
