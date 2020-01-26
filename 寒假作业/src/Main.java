import java.util.*;

/**
 * @Description TODO
 * @Author K
 * @Date 2020/1/8 20:10
 **/
public class Main {
    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<>();
        for(int i = 0;i < magazine.length();i++){
            list.add(magazine.charAt(i));
        }
        for(int i = 0;i < ransomNote.length();i++){
            if(!list.contains(ransomNote.charAt(i))){
                return false;
            }
            list.remove(list.indexOf(ransomNote.charAt(i)));
        }
        return true;
    }
    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if(strings.length == 0){
            return 0;
        }
        return strings[strings.length-1].length();
    }
    /*nums1 = [1,2,3,0,0,0], m = 3
      nums2 = [2,5,6],       n = 3
输出: [1,2,2,3,5,6]
*/
    private static void move(int[] nums1, int i, int j){

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0,j = 0;
        while(i < m-n && j < n){
            while(i < m-n && nums1[i] <= nums2[j]){
                i++;
            }
            if(i < m-n) {
                move(nums1, i, nums2[j]);
                j++;
            }
        }
        if(i == m-n){

        }
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0;i < nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)){
            return true;
        }
        int i =0,j = 0;
        for(i = 0;i < name.length();i++){
            while(name.charAt(i) == typed.charAt(j)){
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "aa";
//        String c = "ab";
//        System.out.println(canConstruct(s,c));

//        while(true) {
//            System.out.println(lengthOfLastWord(sc.nextLine()));
//        }

         int x=10;

    }
}
