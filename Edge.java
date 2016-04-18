package fdeb;
public class Edge {
    public double lineLength;
    public double lineX;
    public double lineY;
    public Edge (Point a, Point b)
    {
        lineX = a.xCoord - b.xCoord;
        lineY = a.yCoord - b.yCoord;
        lineLength = Math.pow(lineX,2) + Math.pow(lineY,2);
        lineLength = Math.sqrt(lineLength);
        System.out.println(lineLength);
    }
}
