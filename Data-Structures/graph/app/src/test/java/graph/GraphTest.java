package graph;

import org.junit.Test;
import static org.junit.Assert.*;
public class GraphTest {
    @Test
    public void testAddNodeToGraph(){
        Graph <String> graph1 = new Graph();
        graph1.addNode("Amman");
        String expected = "Node: --{  value: Amman ,  Neighbors: []  }-- \n";
        assertEquals(expected, graph1.toString());
    }

    @Test
    public void testAddEdgeToNodes() throws NodeNotFoundException {
        Graph <String> graph1 = new Graph();
        graph1.addNode("Amman");
        graph1.addNode("Zarqa");
        graph1.addEdge("Amman","Zarqa",10);

        String expected = "Node: --{  value: Amman ,  Neighbors: [ ( Zarqa , 10 ) ]  }-- \n" +
                          "Node: --{  value: Zarqa ,  Neighbors: [ ( Amman , 10 ) ]  }-- \n";

        assertEquals(expected, graph1.toString());
    }

    @Test
    public void testRetrieveAllNodes(){
        Graph <String> graph1 = new Graph();
        graph1.addNode("Amman");
        graph1.addNode("Zarqa");
        graph1.addNode("Irbid");
        graph1.addNode("Salt");


        String expected = "[ value: Amman ,  Neighbors: [] ,  value: Zarqa ,  Neighbors: [] ,  value: Irbid ,  Neighbors: [] ,  value: Salt ,  Neighbors: [] ]";

        assertEquals(expected, graph1.getNodes().toString());
    }

    @Test
    public void testRetrieveNeighborsWithWeight() throws NodeNotFoundException {
        Graph <String> graph1 = new Graph();
        graph1.addNode("Amman");
        graph1.addNode("Zarqa");
        graph1.addNode("Irbid");
        graph1.addNode("Salt");

        graph1.addEdge("Amman","Zarqa",10);
        graph1.addEdge("Amman","Irbid",13);

        String expected = "[ ( Zarqa , 10 ) ,  ( Irbid , 13 ) ]";

        assertEquals(expected, graph1.getNeighbors("Amman").toString());
    }

    @Test
    public void testRetrieveProperSizeOfTheGraph() {
        Graph <String> graph1 = new Graph();
        graph1.addNode("Amman");
        graph1.addNode("Zarqa");
        graph1.addNode("Irbid");
        graph1.addNode("Salt");


        assertEquals(4, graph1.getSize());
    }

    @Test
    public void testRetrieveNullWithEmptyGraph() {
        Graph <String> graph1 = new Graph();

        assertEquals("null",graph1.toString());
    }
}
