import java.util.logging.Logger;

public class BinaryTree {

    Node root;

    private static final Logger LOGGER = Logger.getLogger(BinaryTree.class.getName());

    public static void main(String[] args) {

        LOGGER.info("\n" + formAnswer(createTree(), new TraversalTypes()));
    }

    BinaryTree() {
        root = null;
    }

    public static BinaryTree createTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(21);
        tree.root.left.right = new Node(22);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(32);
        tree.root.left.left.left = new Node(211);
        tree.root.right.left.right = new Node(312);
        tree.root.left.left.right = new Node(212);
        tree.root.left.right.left = new Node(221);
        tree.root.right.left.left = new Node(311);
        tree.root.right.right.right = new Node(322);
        return tree;
    }

    private static String formAnswer(BinaryTree tree, TraversalTypes traversalTypes) {

        StringBuilder result = new StringBuilder();

        result.append("Inorder traversal:\n");
        result.append(traversalTypes.inorderToString(tree.root));

        result.append("\nPreorder traversal:\n");
        result.append(traversalTypes.preorderToString(tree.root));

        result.append("\nPostorder traversal:\n");
        result.append(traversalTypes.postorderToString(tree.root));

        return result.toString();

    }
}
