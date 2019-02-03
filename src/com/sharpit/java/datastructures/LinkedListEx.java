package com.sharpit.java.datastructures;


public class LinkedListEx {

    Node root;

    private static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        private void setData(int data){
            this.data = data;
        }

        private int getData(){
            return data;
        }

        private void setNext(Node next){
            this.next = next;
        }

        private Node getNext(){
            return next;
        }
    }


    private  void addNode(Node tmp){
        if(root == null){
            root = tmp;
        }else{
            Node node = root;
            while(node.next != null){
                System.out.println("adding a value here");
                node = node.next;
            }
            node.next = tmp;
        }

    }

    private Node reverse(Node node){
        Node prevNode = null;
        Node nextNode = null;
        Node currNode = root;

        while(currNode != null ){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;

    }

    private  void traverse(Node root){
        Node node = root;
        int i = 1;
        while (node != null){

            System.out.println("Node at "+i+" is "+node.data);
            node = node.next;
            i++;
        }
    }

    public static void main(String args[]) {
        LinkedListEx ex = new LinkedListEx();
        Node root=new Node(0);
        ex.addNode(root);
        ex.addNode(new Node(1));
        ex.addNode(new Node(2));
        ex.addNode(new Node(3));


        ex.traverse(root);

        Node reverse =  ex.reverse(root);

        System.out.println(" reverse ");
        ex.traverse(reverse);


    }
}

