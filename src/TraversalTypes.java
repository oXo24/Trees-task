public class TraversalTypes {

    public String postorderToString(Node node) {
        if (node == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(postorderToString(node.left));
        result.append(postorderToString(node.right));
        result.append(node.item).append(" ");

        return result.toString();
    }

    public String inorderToString(Node node) {
        if (node == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(inorderToString(node.left));
        result.append(node.item).append(" ");
        result.append(inorderToString(node.right));

        return result.toString();
    }

    public String preorderToString(Node node) {
        if (node == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(node.item).append(" ");
        result.append(preorderToString(node.left));
        result.append(preorderToString(node.right));

        return result.toString();
    }
}
