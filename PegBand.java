import java.util.*;

public class PegBand
{
    public static void main(String[] args)
    {
        Graph thisGraph = new Graph();
        improverOne(thisGraph);
        
    }
    
    public int CalculateCost(int[] position, int[][] adjacencyList)
    {
        //The cost of the permutation in its entirety.
        int totalCost = 0;

        //Traverse the entire adjacency list to identify each pair of pegs bounded by a band.
        for(int i = 1; i < adjacencyList.length; i++)
        {
            for(int j = 1; j < adjacencyList[i].length; j++)
            {
                //Store both pegs in the pair.
                int firstPeg = adjacencyList[i];
                Int secondPeg = adjacencyList[i][j];

                //Compare the positions of the pegs. Add the difference between them to the cost 
                //of the permutation.
                if(position[firstPeg] > position[secondPeg])
                    totalCost += (position[firstPeg] - position[secondPeg]);
                else
                    totalCost += (position[secondPeg] - position[firstPeg]);
            } 
        }   
     }
     
     public int[] improverOne(int[] position)
     {
        
     } 
}
