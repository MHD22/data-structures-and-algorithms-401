package graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BFT_Test {

    @Test
    public void testBFT_InNormalCase() {
        try {
            Graph <String> graph1 = new Graph();

            graph1.addNode("Pandora");
            graph1.addNode("Arendelle");
            graph1.addNode("Metroville");
            graph1.addNode("Monstroplolis");
            graph1.addNode("Narnia");
            graph1.addNode("Naboo");

            graph1.addEdge("Pandora","Arendelle",0);
            graph1.addEdge("Arendelle","Metroville",0);
            graph1.addEdge("Arendelle","Monstroplolis",0);

            graph1.addEdge("Metroville","Narnia",0);
            graph1.addEdge("Metroville","Naboo",0);
            graph1.addEdge("Metroville","Monstroplolis",0);

            graph1.addEdge("Monstroplolis","Naboo",0);
            graph1.addEdge("Narnia","Naboo",0);
            List<String> bft = graph1.BFT("Pandora");
            String expected = "[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]";
            assertEquals(expected, bft.toString());
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testBFT_OnEmptyGraph() {
        Graph <String> graph1 = new Graph();

        try {
            List<String> bft = graph1.BFT("Pandora");
        }
        catch(NodeNotFoundException ex){
            assertEquals("Node not found..( Pandora )!",ex.getMessage());
        }
    }

    @Test
    public void testBFT_OnGraphHasNoEdges() {
        Graph <String> graph1 = new Graph();

        graph1.addNode("Pandora");
        graph1.addNode("Arendelle");
        graph1.addNode("Metroville");
        graph1.addNode("Monstroplolis");
        graph1.addNode("Narnia");
        graph1.addNode("Naboo");

        try {
            List<String> bft = graph1.BFT("Pandora");
            String expected = "[Pandora]";
            assertEquals(expected, bft.toString());
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testBFT_OnConnectedPartOfTheGraph() {
        Graph <String> graph1 = new Graph();

        graph1.addNode("Pandora");
        graph1.addNode("Arendelle");
        graph1.addNode("Metroville");
        graph1.addNode("Monstroplolis");
        graph1.addNode("Narnia");
        graph1.addNode("Naboo");

        try {
            graph1.addEdge("Pandora","Arendelle",0);
            graph1.addEdge("Arendelle","Metroville",0);
            graph1.addEdge("Arendelle","Monstroplolis",0);

            List<String> bft = graph1.BFT("Pandora");
            String expected = "[Pandora, Arendelle, Metroville, Monstroplolis]";
            assertEquals(expected, bft.toString());
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }



}
