/**
 * 
 */
package mikeisgo.RangeWalker.LocSets;

import java.util.ArrayList;

import android.location.Location;

/**
 * @author mike k.
 *
 */
public class EdgeSet {

	private ArrayList<Location> locs = new ArrayList<Location>();
	
	public void addLoc(Location loc) {
		locs.add(loc);
	}
	
	//give this method an integer indicating which edges distance you want in this set.
	//an edge is from one location pt. to another.  If the edge # given is negative or higher
	//than the # of edges, this method will return -1.0 .
	public Double getDistance(int edge) {
		Location start = null, 
				 stop = null;
		
		Double dist = 0.0;
		
		//make sure its a valid edge, if not, return 0.0
		if((locs.size() < 2) || (edge >= locs.size())) {
			dist = -1.0;
		}
		else {
			start = locs.get(edge - 1);
			float meters = start.distanceTo(stop);
			dist = meters * 1.0936133;
		}
		
		return dist;
	}
	
	//number of edges is 1 less than number of locations in list.
	public int getNumEdges() {
		int num = locs.size() - 1;
		return num;
	}
}
