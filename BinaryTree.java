// Node class representing each node in the tree
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

// BinaryTree class with basic operations
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Insert a new node in the binary tree
    public void insert(int value) {
        root = a(root, value);
    }

    // Recursive helper function for insertion
    private Node a(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = a(current.left, value);
        } else if (value > current.value) {
            current.right = a(current.right, value);
        }

        return current;
    }

    // In-order traversal to display tree nodes
    public void b(Node node) {
        if (node != null) {
            b(node.left);
            System.out.print(node.value + " ");
            b(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the tree
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        // Display the nodes using in-order traversal
        System.out.print("In-order Traversal: ");
        tree.b(tree.root); // Output should be sorted: 3 5 7 10 12 15 18
    }
}
