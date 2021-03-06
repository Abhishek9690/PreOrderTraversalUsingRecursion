package trees;

public class BInaryTree {
    public TreeNode root;
    public void createBinaryTree(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);
        TreeNode sixth=new TreeNode(6);
        TreeNode seventh=new TreeNode(7);
        root=first;
        first.left=second;
        first.right=third;
        second.left= fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;
    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
