public class HamiltonianCycle {

  private int numOfVertexes;
  private int[] hamiltonianPath;
  private int[][] adjacencyMatrix;

  public HamiltonianCycle(int[][] adjacencyMatrix) {
    this.adjacencyMatrix = adjacencyMatrix;
    this.hamiltonianPath = new int[adjacencyMatrix.length]; //adjacencyMatrix is a square matrix and the sides represent the nodes
    this.numOfVertexes = adjacencyMatrix.length;

    this.hamiltonianPath[0] = 0; //we start the cycle from node 0
  }

  public void solve() {
    if (finSolution(1)) { //start from vertex 1 because we already added vertex 0
      shouHamiltonianPath();
    } else {
      System.out.println("There is no solution.");
    }
  }

  private void shouHamiltonianPath() {
    System.out.print("Solution: ");

    for (int i = 0; i < numOfVertexes; i++) {
      System.out.print(hamiltonianPath[i] + " ");
    }


    System.out.print(hamiltonianPath[0]); //hamiltonian path starts and ends with the same node
  }

  private boolean finSolution(int position) {
    if (position == numOfVertexes) { //we reached the last vertex
      return adjacencyMatrix[position - 1][hamiltonianPath[0]] == 1;
      //check if the last vertex of the path is connected to the first vertex. TRUE = we found a solution
    }

    //we start from vertex 1 because we already started from vertex 0
    for (int vertexIndex = 1; vertexIndex < numOfVertexes; vertexIndex++) {
      if (isFeasible(position, vertexIndex)) {

        hamiltonianPath[position] = vertexIndex;

        if (finSolution(position + 1)) {
          //if we find a solution for the next positions we return true, if not we continue over the next vertexes
          return true;
        }
      }
    }

    return false;
  }

  private boolean isFeasible(int actualPosition, int vertexIndex) {
    //check if vertexIndex is connected to the actual position and we have not visited it yet
    if (adjacencyMatrix[actualPosition - 1][vertexIndex] == 0) {
      return false;
    }

    for (int i = 0; i < actualPosition; i++) {
      if(hamiltonianPath[i] == vertexIndex) {
        return false;
      }
    }

    return true;
  }


}
