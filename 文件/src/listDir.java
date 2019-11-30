import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/29 19:45
 **/
//递归打印所有目录 —— 树结构
public class listDir {
    public static List<File> list = new ArrayList<>();
    public static void listDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {// 现在给定的file对象属于目录
                listDir(file);
            } else {
                System.out.println(file.getAbsolutePath() + ": " + file.length());
            }
        }
    }
    public static void main(String[] args) {
        listDir(new File("F:\\比特\\课件\\3.JavaWeb"));
    }
}
