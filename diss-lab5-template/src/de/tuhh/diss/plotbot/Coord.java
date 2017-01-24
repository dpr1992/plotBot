package de.tuhh.diss.plotbot;
/*coordinate class*/
public class Coord {
	public double X;
	public double Y;
	public double angle;
	public double[] angleTOXY(int angle){
		X=Math.cos(angle);
		Y=Math.sin(angle);
        double[] xyCoord={X,Y};
		return xyCoord;
	}
	public double xyToAngle(int xCoord, int yCoord){
		angle=Math.toDegrees(Math.atan(yCoord)/xCoord);
		return angle;
	}

}
