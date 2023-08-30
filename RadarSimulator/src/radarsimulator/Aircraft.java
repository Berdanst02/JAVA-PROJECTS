
package radarsimulator;


import java.awt.Point;
import java.util.*;
import java.awt.geom.Ellipse2D;

public class Aircraft {
    
    private Point.Double coordinates = new Point.Double(); 
    
    private int airSpeed; 
    
    Ellipse2D radarBlip = new Ellipse2D.Double();
    
    Random r = new Random();
    
    ////////constructor//////// 
    public Aircraft(double x, double y){
        setCoordinates(x, y);
        setRadarBlip();
        
        this.airSpeed = r.nextInt(20)+4;
    }
    
    ////////accessors////////
    public Point.Double getCoordinates(){
        return coordinates; 
    }
    
    public Ellipse2D getBlip(){
        return radarBlip; 
    }
    
    ////////mutators////////
    public void setCoordinates(double x, double y){
        coordinates.x = x;
        coordinates.y = y; 
    }

    private void setRadarBlip(){    //only calling from within the class 
        int dotSize = 6; //stores the size of the aircraft dots 
        radarBlip.setFrame(coordinates.x, coordinates.y, dotSize, dotSize); //ellipse 'box' characteristics
    }
    
    public boolean moveAircraft(){
        double tx = coordinates.x - 200; //difference between aircraft location and airport 
        double ty = coordinates.y - 200;
        double length = Math.sqrt(tx*tx+ty*ty); //calculate distance between aircraft and airport 
        
        if(length > airSpeed){
            //move object towards the airport
             coordinates.x = coordinates.x - airSpeed * tx / length;
             coordinates.y = coordinates.y - airSpeed * ty / length; 
             
        }
        else{ 
            //go to airport 
            this.coordinates.x = 200; 
            this.coordinates.y = 200; 
            return true;
        }
        
        setRadarBlip(); //move the ellipse to new location 
        
        return false; //aircraft is not at airport 
    }
}
