import java.io.File;
import java.io.PrintStream;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/1 11:26
 **/
public class scanner {
    public static void scannerDirectory(TreeNode node){
        File[] files = node.file.listFiles();
        if(files == null){
            return;
        }
        for(File file : files){
            TreeNode child = new TreeNode();
            child.file = file;
            if(file.isDirectory()){
                scannerDirectory(child);
            }else{
                child.totalLength = file.length();
            }
            node.totalLength += child.totalLength;
            node.children.add(child);
        }
    }

    public static void main(String[] args) {
        PrintStream out;
    }
}
