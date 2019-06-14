package com.choices;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public String value;
    public Node next;
    public Node(String value){
        this.value=value   ;
        this.next=null;
    }

    //Reverse the node using constant space and linear time proportional to the length of the single-linked list
    public Node reverseNode(){

        return null;
    }

    public Node(){
        this("New Node");
    }


    //Print Node in the format of 0->1->2->3
    public static void printNode(Node a){
        while (a!=null){
            System.out.println(a.value );
            a=a.next;
        }
    }

    public List<Node> getList(){
        List<Node> list=new ArrayList<Node>();
        Node a=this;
        while (a!=null){
            list.add(a);
            a=a.next;
        }
        return list;
    }


}
