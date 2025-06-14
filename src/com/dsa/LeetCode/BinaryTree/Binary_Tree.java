package com.dsa.LeetCode.BinaryTree;

class Binary_Tree
{
    Node root;
    int size = 0;

    // add Nodes to Tree
    Node insert(Node root, int data)
    {
        if (root == null)
        {
            root = new Node(data);
            return root;
        }
        else if (data < root.data)
        {
            root.left = insert(root.left, data);
        }
        else if (data > root.data)
        {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // pre-order is Root -> Left -> Right.
    int Pre_Order(Node node)
    {
        if (node != null)
        {
            size++;
            System.out.print(node.data + "  ");
            this.Pre_Order(node.left);
            this.Pre_Order(node.right);
        }
        return size;
    }

    // In-order is Left -> Root -> Right. Values are sorted.
    int In_Order(Node node)
    {
        if (node != null)
        {
            size++;
            this.In_Order(node.left);
            System.out.print(node.data + "  ");
            this.In_Order(node.right);
        }
        return size;
    }

    // Post-Order is Right -> Left -> Root.
    int Post_Order(Node node)
    {
        if (node != null)
        {
            this.Post_Order(node.left);
            this.Post_Order(node.right);
            System.out.print(node.data + "  ");
        }
        return size;
    }

    // Max depth of the Tree
    int maxDepth(Node root)
    {
        if (root==null)
        {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args)
    {
        Binary_Tree bt = new Binary_Tree();
        int ctr = 0;

        bt.root = bt.insert(bt.root, 8);
        bt.insert(bt.root, 7);
        bt.insert(bt.root, 12);
        bt.insert(bt.root, 15);
        bt.insert(bt.root, 2);
        bt.insert(bt.root, 5);

        ctr = bt.Pre_Order(bt.root);
        System.out.println();
        System.out.println("Pre-order Traversal (Root -> Left -> Right).");

        ctr = bt.In_Order(bt.root);
        System.out.println();
        System.out.println("In-order Traversal (Left -> Root -> Right).");

        ctr = bt.Post_Order(bt.root);
        System.out.println();
        System.out.println("Post-order Traversal (Left -> Right -> Root).");

        System.out.println();
        System.out.println("Max Depth of the Tree = " + bt.maxDepth(bt.root));
    }
}
