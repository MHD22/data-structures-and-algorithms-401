package graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DFT_Test {

    @Test
    public void testDFT_InNormalCase() {
        try {
            Graph <String> graph1 = new Graph();

            graph1.addNode("A");
            graph1.addNode("B");
            graph1.addNode("C");
            graph1.addNode("D");
            graph1.addNode("E");
            graph1.addNode("F");
            graph1.addNode("G");
            graph1.addNode("H");

            graph1.addEdge("A","B",0);
            graph1.addEdge("A","D",0);
            graph1.addEdge("B","C",0);
            graph1.addEdge("B","D",0);
            graph1.addEdge("C","G",0);
            graph1.addEdge("D","E",0);
            graph1.addEdge("D","H",0);
            graph1.addEdge("D","F",0);
            graph1.addEdge("F","H",0);

            List<String> dft = graph1.DFT("A");
            String expected = "[A, B, C, G, D, E, H, F]";
            assertEquals(expected, dft.toString());
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testDFT_OnEmptyGraph() {
        Graph <String> graph1 = new Graph();

        try {
            List<String> dft = graph1.BFT("A");
        }
        catch(NodeNotFoundException ex){
            assertEquals("Node not found..( A )!",ex.getMessage());
        }
    }

    @Test
    public void testDFT_OnGraphHasNoEdges() {
        Graph <String> graph1 = new Graph();

        graph1.addNode("A");
        graph1.addNode("B");
        graph1.addNode("C");
        graph1.addNode("D");
        graph1.addNode("E");
        graph1.addNode("F");
        graph1.addNode("G");
        graph1.addNode("H");

        try {
            List<String> dft = graph1.DFT("A");
            String expected = "[A]";
            assertEquals(expected, dft.toString());
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testDFT_OnConnectedPartOfTheGraph() {
        Graph <String> graph1 = new Graph();

        graph1.addNode("A");
        graph1.addNode("B");
        graph1.addNode("C");
        graph1.addNode("D");
        graph1.addNode("E");
        graph1.addNode("F");
        graph1.addNode("G");
        graph1.addNode("H");



        try {
            graph1.addEdge("A","B",0);
            graph1.addEdge("A","D",0);
            graph1.addEdge("B","C",0);
            graph1.addEdge("B","D",0);
            graph1.addEdge("C","G",0);

            List<String> dft = graph1.DFT("A");
            String expected = "[A, B, C, G, D]";
            assertEquals(expected, dft.toString());
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }


}
