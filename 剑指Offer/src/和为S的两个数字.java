import java.util.ArrayList;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/23 22:29
 **/
public class 和为S的两个数字 {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0,j = array.length-1;i < j;){
            if(array[i]+array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                i++;
                j--;
            }else if(array[i]+array[j] < sum){
                i++;
            }else{
                j--;
            }
        }
        ArrayList<Integer> ret = new ArrayList<>();
        int minIndex = 0;
        if(list.size()==2 || list.isEmpty()){
            return list;
        }else{
            int[] mul = new int[list.size()/2];
            for(int i = 0,j = 0;i < list.size()-1;i+=2,j++){
                int num = list.get(i)*list.get(i+1);
                mul[j] = num;
            }
            int min = Integer.MAX_VALUE;
            for(int i = 0;i < mul.length;i++){
                if(mul[i] < min){
                    min = mul[i];
                    minIndex = 2*i;
                }
            }
        }
        ret.add(list.get(minIndex));
        ret.add(list.get(minIndex+1));
        return ret;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7};
        ArrayList<Integer> list = FindNumbersWithSum(a,7);
        System.out.println(list);
    }
}
