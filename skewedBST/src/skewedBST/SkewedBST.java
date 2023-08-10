package skewedBST;

public class SkewedBST {
	TreeNode root;

    // Function to convert BST into a skewed tree (left nodes only)
    public TreeNode modifyBST(TreeNode root) {
        if (root == null) {
            return null;
        }
   // recursively modify the right subtree
        root.right = modifyBST(root.right);
        
   // perform skew operation on the current root     
        root = skew(root);
        return root;
    }

   // Skew operation to transform a node's left subtree 
    private TreeNode skew(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }

        TreeNode left = root.left;
        root.left = left.right;
        left.right = root;
        return left;
    }

    // Function to print node values in ascending order
    public void printAscending(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        printAscending(root.right);
     

       

}
}
