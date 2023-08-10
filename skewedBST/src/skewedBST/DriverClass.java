package skewedBST;

public class DriverClass {
	public static void main(String[] args) {
	 // Create an instance of the SkewedBST class
        SkewedBST tree = new SkewedBST();
     // Create the nodes of the tree and construct the initial BST
        tree.root = new TreeNode(50);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(60);
        tree.root.left.left = new TreeNode(10);
        tree.root.right.left = new TreeNode(55);
     // Convert the BST into a skewed tree
        tree.root = tree.modifyBST(tree.root);
     // Print the node values in ascending order
        tree.printAscending(tree.root);
    }

}
