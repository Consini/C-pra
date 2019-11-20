/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/17 19:28
 **/
public class GrayCode {
    public static final int convertIntCodeToGrayCode(int nCode) {
        return nCode ^ (nCode >>> 1);
    }

    public static void main(String[] args) {
        System.out.println(convertIntCodeToGrayCode(3));
    }
}
