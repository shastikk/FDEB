package fdeb;
public class FDEB {
    public static void main(String[] args) {
        Point a = new Point (100.0, 270.0);
        Point b = new Point (200.0, 270.0);
        Point c = new Point (100.0, 250.0);
        Point d = new Point (200.0, 250.0);
        Edge edge1 = new Edge (a, b);
        Edge edge2 = new Edge (c, d);
        Edge edge3 = new Edge (a,d);
        Edge edge4 = new Edge (b, c);
        Edge edge5 = new Edge (a,c);
        Edge edge6 = new Edge (b, d);
    }
    
}
