/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/1 9:41
 **/
class Base {
    Base() {
        System.out.println("Base");
    }
}
public class Alpha extends Base{
    public static void main(String[] args) {
        new Alpha();
        new Base();
    }

}
