package com.bridgelabz;

public class MyBinaryNode<k extends Comparable> {
    k key;
    MyBinaryNode<k> left;
    MyBinaryNode<k> right;

    public MyBinaryNode(k key){
        this.key=key;
        this.left=null;
        this.right=null;
    }
}
