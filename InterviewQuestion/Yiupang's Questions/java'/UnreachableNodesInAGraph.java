/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
	private static class Node{
		int value;
		boolean isVisited = false;
		ArrayList<Node> adjacentList = new ArrayList<Node>();
		
		public Node(int value)
		{
			this.value = value;
		}
	}

	private static int DFS(Node[] graph, int head)
	{
		int traversalNumber = 0;
		if(graph[head] == null)
			return traversalNumber;
			
		traversalNumber = 1;
		graph[head].isVisited = true;
		
		for(int i = 0; i < graph[head].adjacentList.size(); i++)
		{
			int tmp = graph[head].adjacentList.get(i).value;
			if(graph[tmp] != null && !graph[tmp].isVisited)
				traversalNumber += DFS(graph, tmp);
		}
		
		return traversalNumber;
	}
	
    public static void main(String args[] ) throws Exception {
        int numNodes, numEdges;
        int head;
        int valA, valB;
        int i = 0;
        Scanner s = new Scanner(System.in);
        Node[] graph;
        
        numNodes = s.nextInt();
        numEdges = s.nextInt();
        graph = new Node[numNodes + 1];
        
        while(i < numEdges)
        {
        	valA = s.nextInt();
        	if(graph[valA] == null)
        	{
        		graph[valA] = new Node(valA);
        		//System.out.println(valA);
        	}
        	valB = s.nextInt();
        	graph[valA].adjacentList.add(new Node(valB));
        	if(graph[valB] == null)
        	{
        		graph[valB] = new Node(valB);
        	}
        	graph[valB].adjacentList.add(new Node(valA));
        	i++;
        }
      
        head = s.nextInt();
         //System.out.println("h: " + graph[head]);
		System.out.print(numNodes - DFS(graph, head));
    }
}
