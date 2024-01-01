package com.github.serenerd.interview.algorithms.binarytree;

import lombok.Data;

public class BinaryTreeSolutions {

    public class BinaryTreeSolution {

        public class BinaryTree<T> {

            private Node<T> root;

            private class Node<T> {
                private Node<T> leftNode;
                private Node<T> rightNode;
                private T value;
            }

            public boolean isPresent(T value) {
                if (root == null) {
                    return false;
                }
                return isPresent(value, root);
            }

            public boolean isPresent(T value, Node<T> node) {
                if (node == null) {
                    return false;
                }
                if (value.equals(node.value)) {
                    return true;
                }
                return isPresent(value, node.leftNode) || isPresent(value, node.rightNode);
            }
        }
    }

    public class BinaryTreeSolution1 {

        @Data
        public class Node {
            private int value;
            private Node left;
            private Node right;
        }

        public Node search(Node root, int value) {
            if (root == null) {
                return null;
            }

            int rootValue = root.getValue();
            if (value == rootValue) {
                return root;
            }
            if (value < rootValue) {
                return search(root.getLeft(), value);
            }
            return search(root.getRight(), value);
        }
    }
}