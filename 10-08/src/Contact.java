/**
 * @ClassName Contact
 * 电话本,姓名不允许重复，电话允许重复 。Key - Value 模型
 * @Author: K
 * @create: 2019/10/8-19:33
 **/
public class Contact {
    public static class Node{
        String name;
        String phone;
        Node left;
        Node right;

        public Node(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
    private Node root = null;
    // 查找,没有找到返回 null，否则返回这个人的电话
    public String search(String name){
        Node cur = root;
        while(cur != null){
            if(name == cur.name){
                return cur.phone;
            }else if(name.compareTo(cur.name) > 0){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return null;
    }
    // 插入，若不存在则插入，若存在则插入失败
    public boolean insert(String name, String phone){
        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(name == cur.name){
                return false;
            }else if(name.compareTo(cur.name) > 0){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
        Node node = new Node(name,phone);
        if(parent.name.compareTo(name) > 0){
            parent.left = node;
        }else{
            parent.right = node;
        }
        return true;
    }
    // 更新电话本，若存在该用户更新他的电话，不存在返回 false
    public boolean update1(String name,String phone){
        Node cur = root;
        while(cur != null){
            if(name == cur.name){
                cur.phone = phone;
                return true;
            }else if(name.compareTo(cur.name) > 0){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return false;
    }
    // 更新电话本，若存在该用户更新他的旧电话，否则返回 null
    public String update2(String name,String phone){
        Node cur = root;
        while(cur != null){
            if(name == cur.name){
                String oldPhone = cur.phone;
                cur.phone = phone;
                return oldPhone;
            }else if(name.compareTo(cur.name) > 0){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return null;
    }

}
