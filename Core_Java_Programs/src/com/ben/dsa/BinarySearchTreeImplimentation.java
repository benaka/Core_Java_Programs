package com.ben.dsa;

 // Binary Search Tree Implementation in Java
    class BinarySearchTreeImplimentation {

        // Node structure
        class Node {
            int key;
            Node left, right;

            public Node(int item) {
                key = item;
                left = right = null;
            }
        }

        // Root node
        Node root;

        // Constructor
        BinarySearchTreeImplimentation() {
            root = null;
        }

        // Insert a new key
        void insert(int key) {
            root = insertRec(root, key);
        }

        // Recursive insert function
        Node insertRec(Node root, int key) {
            // If the tree is empty, return a new node
            if (root == null) {
                root = new Node(key);
                return root;
            }

            // Otherwise, recur down the tree
            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);

            // Return the unchanged node pointer
            return root;
        }

        // Search for a key
        boolean search(int key) {
            return searchRec(root, key);
        }

        boolean searchRec(Node root, int key) {
            if (root == null)
                return false;
            if (root.key == key)
                return true;
            return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
        }

        // Delete a key
        void deleteKey(int key) {
            root = deleteRec(root, key);
        }

        Node deleteRec(Node root, int key) {
            if (root == null)
                return root;

            // Traverse the tree
            if (key < root.key)
                root.left = deleteRec(root.left, key);
            else if (key > root.key)
                root.right = deleteRec(root.right, key);
            else {
                // Node with only one child or no child
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;

                // Node with two children:
                // Get the inorder successor (smallest in the right subtree)
                root.key = minValue(root.right);

                // Delete the inorder successor
                root.right = deleteRec(root.right, root.key);
            }

            return root;
        }

        int minValue(Node root) {
            int minv = root.key;
            while (root.left != null) {
                minv = root.left.key;
                root = root.left;
            }
            return minv;
        }

        // Inorder traversal
        void inorder() {
            inorderRec(root);
            System.out.println();
        }

        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }

        // Main method to test the BST
        public static void main(String[] args) {
            BinarySearchTreeImplimentation tree = new BinarySearchTreeImplimentation();

            // Insert elements
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

            // Print inorder traversal
            System.out.print("Inorder traversal: ");
            tree.inorder();

            // Search for a key
            System.out.println("Search 40: " + tree.search(40));
            System.out.println("Search 100: " + tree.search(100));

            // Delete a key
            System.out.println("Deleting 20...");
            tree.deleteKey(20);
            System.out.print("Inorder after deletion: ");
            tree.inorder();
        }
    }

