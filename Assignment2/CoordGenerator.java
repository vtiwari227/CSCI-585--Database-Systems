import java.math.*;

public class CoordGenerator  {
	public static void main (String[] args) {
  		double a = 0.0014;
  		double tx = -118.288890;
  		double ty = 34.022127;

		for (int i=0; i<360; i+=3) {
			double x = ((2*a*Math.cos(Math.toRadians(i))) + (a*Math.cos(Math.toRadians(2*i)))) + tx;
			double y = ((2*a*Math.sin(Math.toRadians(i))) - (a*Math.sin(Math.toRadians(2*i)))) + ty;


			System.out.println(x +","+y+","+0);
		}
	}
}
