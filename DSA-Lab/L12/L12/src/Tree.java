public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node root) {
        if (root == null)
            return;

        System.out.print(root.value + " ");
        preorderTraversal(root.leftChild);
        preorderTraversal(root.rightChild);
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.leftChild);
        System.out.print(root.value + " ");
        inorderTraversal(root.rightChild);
    }

    public void inorderTraversalDesc() {
        inorderTraversalDesc(root);
    }

    private void inorderTraversalDesc(Node root) {
        if (root == null)
            return;

        inorderTraversalDesc(root.rightChild);
        System.out.print(root.value + " ");
        inorderTraversalDesc(root.leftChild);
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node root) {
        if (root == null)
            return;

        postorderTraversal(root.leftChild);
        postorderTraversal(root.rightChild);
        System.out.print(root.value + " ");
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        else if (root.leftChild == null && root.rightChild == null)
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }
}
