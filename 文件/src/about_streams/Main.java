package about_streams;

import java.io.*;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/29 20:33
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\GitHub\\JavaSE\\测试目录\\测试文件.txt");
        OutputStream os = new FileOutputStream(file);//写文件
        os.write('a');
        os.write('b');
        os.write("我是中国人".getBytes("UTF-8"));//默认字符集编码是UTF-8，国标系统一个汉字占两个字节，UTF-8占三个字节
        BufferedReader readers = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), "GB18030")
        );
//        InputStream is = new FileInputStream(file);//读文件
//        int b ;
//        while((b = is.read()) != -1){
//            System.out.println(b);
//        }
    }
}
