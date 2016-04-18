package fdeb;

import java.util.ArrayList;

public class Edge {
    public double lineLength;
    public double lineX;
    public double lineY;
    public int numSegments = 4;
    public double differenceX;
    public double differenceY;
    public double difference;
    public double stepX = 0;
    public double stepY = 0;
    public Point pointA;
    public Point pointB;
    public int globalSpringConst = 1;
    public ArrayList<SubPoint> subpoints;
    public double localSpringConst;
    public double springForces;
    public Edge (Point a, Point b)
    {
        pointA = a;
        pointB = b;
        lineX = b.xCoord - a.xCoord;
        lineY = b.yCoord - a.yCoord;
        lineLength = Math.pow(lineX,2) + Math.pow(lineY,2);
        lineLength = Math.sqrt(lineLength);
        System.out.println(lineLength);
        stepX = pointA.xCoord;
        stepY = pointA.yCoord;
        subpoints = new ArrayList<>(numSegments-1);
        makePoints();
        
    }
    
    public void makePoints()
    {
        differenceX = lineX / numSegments;
        differenceY = lineY / numSegments;
        difference = Math.pow(differenceX,2) + Math.pow(differenceY,2);
        difference = Math.sqrt(difference);
        for (int segments = 1; segments < numSegments; segments++)
        {
            stepX += differenceX;
            stepY += differenceY;
            SubPoint s = new SubPoint(stepX, stepY);
            subpoints.add(s);
        }
        calcSpringForce();
    }
    
    public double calcSpringForce()
    {
        Point firstSP = subpoints.get(0);
        localSpringConst = globalSpringConst / lineLength;
        springForces = localSpringConst * difference * 2;
        System.out.println(springForces);
        return springForces;
    }
    
    public void calcElectroStaticForces()
    {
        
    }
    
}
