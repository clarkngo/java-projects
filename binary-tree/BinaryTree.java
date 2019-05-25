import java.awt.SystemColor;

class BinaryTree {

  Node root;

  public BinaryTree() {
    Node newNode = new Node();
    newNode.data = 0;
    newNode.left = null;
    newNode.right = null;
    root = newNode;
  }

  public void preorder(Node root) {
    if (root == null) {
      return;
    }
    else {
      System.out.print(root.data + " ");
      preorder(root.left);
      preorder(root.right);
    }
  }

  public void inorder(Node root) {
    if (root == null) {
      return;
    }
    else {
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }
  }  

  public void postorder(Node root) {
    if (root == null) {
      return;
    }
    else {
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data + " ");
    }
  }    
}
