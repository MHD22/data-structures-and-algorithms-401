package graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetEdgesTest {

    @Test
    public void testGetEdgeInNormalCase() {
        try {
            Graph <String> graph1 = new Graph();

            graph1.addNode("Pandora");
            graph1.addNode("Arendelle");
            graph1.addNode("Metroville");
            graph1.addNode("Monstroplolis");
            graph1.addNode("Narnia");
            graph1.addNode("Naboo");

            graph1.addEdge("Pandora","Arendelle",150);
            graph1.addEdge("Pandora","Metroville",82);
            graph1.addEdge("Arendelle","Metroville",99);
            graph1.addEdge("Arendelle","Monstroplolis",42);

            graph1.addEdge("Metroville","Narnia",37);
            graph1.addEdge("Metroville","Naboo",26);
            graph1.addEdge("Metroville","Monstroplolis",105);

            graph1.addEdge("Monstroplolis","Naboo",73);
            graph1.addEdge("Narnia","Naboo",250);

            String[] nodes = {"Metroville", "Pandora"};
            String output = graph1.getEdges(nodes);
            String expected = "True, $82";
            assertEquals(expected,output);
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testGetEdge_OnEmptyGraphAndEmptyNodesArray() {
        Graph <String> graph1 = new Graph();

        try {
            String[] nodes = {};
            String output = graph1.getEdges(nodes);
            String expected = "False, $0";
            assertEquals(expected,output);
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testGetEdge_OnEmptyGraphAndNonEmptyNodesArray() {
        Graph <String> graph1 = new Graph();

        try {
            String[] nodes = {"Pandora", "Metroville"};
            String output = graph1.getEdges(nodes);
            String expected = "False, $0";
            assertEquals(expected,output);
        }
        catch(NodeNotFoundException ex){
            assertEquals("Node not found..( Pandora )!",ex.getMessage());
        }
    }


    @Test
    public void testGetEdge_OnGraphHasNoEdges() {
        Graph <String> graph1 = new Graph();

        graph1.addNode("Pandora");
        graph1.addNode("Arendelle");
        graph1.addNode("Metroville");
        graph1.addNode("Monstroplolis");
        graph1.addNode("Narnia");
        graph1.addNode("Naboo");

        try {
            String[] nodes = {"Pandora", "Metroville"};
            String output = graph1.getEdges(nodes);
            String expected = "False, $0";
            assertEquals(expected,output);
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testGetEdges_InNoRouteExistCase() {
            Graph <String> graph1 = new Graph();

            graph1.addNode("Pandora");
            graph1.addNode("Arendelle");
            graph1.addNode("Metroville");
            graph1.addNode("Monstroplolis");
            graph1.addNode("Narnia");
            graph1.addNode("Naboo");
        try {

            graph1.addEdge("Pandora","Arendelle",150);
            graph1.addEdge("Pandora","Metroville",82);
            graph1.addEdge("Arendelle","Metroville",99);
            graph1.addEdge("Arendelle","Monstroplolis",42);

            graph1.addEdge("Metroville","Narnia",37);
            graph1.addEdge("Metroville","Naboo",26);
            graph1.addEdge("Metroville","Monstroplolis",105);

            graph1.addEdge("Monstroplolis","Naboo",73);
            graph1.addEdge("Narnia","Naboo",250);

            String[] nodes = {"Pandora", "Naboo"};
            String output = graph1.getEdges(nodes);
            String expected = "False, $0";
            assertEquals(expected,output);
        }
        catch(NodeNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }




}
