package com.choices;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NodeTest {

    Node nodeA;
    @Before
    public void setup(){
        nodeA=new Node("A");
        Node nodeB=new Node("B");
        Node nodeC=new Node("C");
        Node nodeD=new Node("D");
        nodeA.next=nodeB;
        nodeB.next =nodeC;
        nodeC.next=nodeD;
    }
    @Test
    public void testReverseNode(){
        List<Node> listBeforeReverse=nodeA.getList();
        Node.printNode(nodeA);
        Node nodeD=nodeA.reverseNode();
        List<Node> listAfterReverse=nodeD.getList();
        System.out.println("Reversing node ...");
        Node.printNode(nodeD);

        assert listBeforeReverse.containsAll(listAfterReverse);

    }

}
