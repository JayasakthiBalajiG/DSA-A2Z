public class TreeTraversal {
     public static void main(String[] args) {
        Traversal tr = new Traversal();
        tr.root = new Node('A');
        tr.root.left = new Node('B');
        tr.root.right = new Node('C');
        tr.root.left.left = new Node ('D');
        tr.root.left.right = new Node ('E');
        tr.root.right.left = new Node ('F');
        tr.root.right.right = new Node('G');
        tr.preorderTraversal(tr.root);
        System.out.println();
        tr.postorderTraversal(tr.root);
        System.out.println();
        tr.inorderTraversal(tr.root);
     }
}

class Node{
    char key;
    Node left;
    Node right;
    Node(char key){
        this.key = key;
    }
}

class Traversal{
    Node root;
    void preorderTraversal( Node n){
        if(n!= null){
            System.out.print(n.key + " ");
            preorderTraversal(n.left);
            preorderTraversal(n.right);
        }
    }
    void postorderTraversal(Node n){
        if(n!= null){
            preorderTraversal(n.left);
            preorderTraversal(n.right);
            System.out.print(n.key + " ");
        }
    }
    void inorderTraversal(Node n){
        preorderTraversal(n.left);
        System.out.print(n.key + " ");
        preorderTraversal(n.right);
    }
}