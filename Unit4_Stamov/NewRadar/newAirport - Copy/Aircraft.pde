
import java.util.Random;



class Aircraft {
  float airSpeed;
  PShape blip;
  PVector airportloc, endpointloc, aircraftLoc;
  Random r = new Random();
  //declare aircraft size


  public Aircraft(PVector airportLoc, PVector endpointLoc) {
    aircraftLoc = new PVector();
    airportloc=airportLoc;
    endpointloc = new PVector(endpointLoc.x, endpointLoc.y);

    //blip = new PShape(ELLIPSE,r.nextInt(0,600),r.nextInt(0,600),r.nextInt(1,3),r.nextInt(1,3));
    airSpeed = r.nextFloat(0, 10f);
    //call setCoordinates

    //call setBlip
    this.setCoordinates();
    this.setBlip();
  }



  public PVector getCoordinates() {

    return aircraftLoc;
  }

  public void setCoordinates() {
    aircraftLoc = endpointloc;
  }


  public void setBlip() {

    float sizeofAircraft = 10;
    PShape aircraftshape = createShape(ELLIPSE, aircraftLoc.x, aircraftLoc.y, sizeofAircraft, sizeofAircraft);
    // set col to black;
    shape(aircraftshape);
  }

  public boolean moveAircraft() {

    if (PVector.dist(airportloc, endpointloc)< airSpeed) {
      aircraftLoc = airportloc;
      return false;
    }

    float tempx =this.aircraftLoc.x - ((airSpeed*(aircraftLoc.x-airportloc.x))/PVector.dist(airportloc, this.getCoordinates()));
    //aircraftLoc.x = this.aircraftLoc.x - ((airSpeed*(aircraftLoc.x-airportloc.x))/PVector.dist(airportloc, this.getCoordinates()));
    float tempy =  this.aircraftLoc.y - ((airSpeed*(aircraftLoc.y-airportloc.y))/PVector.dist(airportloc, this.getCoordinates()));
    //aircraftLoc.y = this.aircraftLoc.y - ((airSpeed*(aircraftLoc.y-airportloc.y))/PVector.dist(airportloc, this.getCoordinates()));
    //println(aircraftLoc);
    this.aircraftLoc.x = tempx;
    this.aircraftLoc.y = tempy;

    return true;
  }
}
