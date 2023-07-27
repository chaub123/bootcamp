package shapes;

public class Square {

  private final Edge[] edges;

    public Square(double length){
    edges = new Edge[4];
    edges[0] = new Edge(length, "RED");
    edges[1] = new Edge(length, "YELLOW");
    edges[2] = new Edge(length, "BLACK");
    edges[3] = new Edge(length, "BLUE");   
  }

    public void getInfo(){
      for(Edge e: this.edges){
        e.getInfo();
      }
    }

    public void update(int index, int length){
      this.edges[index].setLength(length);
    }

    public void replaceEdge(int index, int length, String color){
      // this.edges[index].setAll(length, color);
      this.edges[index] = new Edge(length, color);
    }
}
