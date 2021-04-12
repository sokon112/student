package ch5;

public class Earth {
	final static double EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*EARTH_RADIUS*EARTH_RADIUS*Math.PI;
	}
	
}
