import java.util.*;

public class _124_BinaryTreeMaximumPathSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int max=Integer.MIN_VALUE;
    public static int postorder(TreeNode root){
        if(root==null){
            return 0;
        }
       int hl=0;
       int hr=0;
        if(root.left!=null){
             hl=postorder(root.left);
        }
        
        if(root.right!=null){
            hr=postorder(root.right);
        }
        max=Math.max(max,hl+hr+root.val);
        int curr=Math.max(hl,hr)+root.val;
         return curr>0?curr:0;
    }

    public int maxPathSum(TreeNode root) {
       max=Integer.MIN_VALUE;
        postorder(root);
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}