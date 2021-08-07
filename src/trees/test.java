package trees;

public class test {
    public static void main(String[] args) {
        BInaryTree obj=new BInaryTree();
        obj.createBinaryTree();
        System.out.println("Pre Order Traversal Using Recursion");
        obj.preOrder(obj.root);
    }
}
