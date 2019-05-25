class Source {
  public static void main(String[] args) {
    BinaryTree Tree = new BinaryTree();
    Tree.root.data = 10;

    Node firstNode = new Node();
    firstNode.data = 1;
    Tree.root.left = firstNode;

    Node secondNode = new Node();
    secondNode.data = 3;
    Tree.root.right = secondNode;

    Node thirdNode = new Node();
    thirdNode.data = 7;
    Tree.root.left.left = thirdNode;

    Node fourthNode = new Node();
    fourthNode.data = 6;
    Tree.root.left.right = fourthNode;

    Node fifthNode = new Node();
    fifthNode.data = 2;
    Tree.root.right.left = fifthNode;

    Node sixthNode = new Node();
    sixthNode.data = 4;
    Tree.root.right.right = sixthNode;

    Node seventhNode = new Node();
    seventhNode.data = 5;
    Tree.root.left.left.left = seventhNode;

    System.out.println(Tree.root.right.left.data);

    Tree.preorder(Tree.root);
    System.out.println();  
    Tree.inorder(Tree.root);
    System.out.println();    
    Tree.postorder(Tree.root);
    System.out.println();        
  }
}
