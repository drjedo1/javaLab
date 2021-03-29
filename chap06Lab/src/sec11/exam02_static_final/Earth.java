package sec11.exam02_static_final;



public class Earth {
//	 »ó¼ö
	//The blank final field EARTH_SURFACE_AREA may not have been initialized
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA; 
	
	//
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	
	
}
