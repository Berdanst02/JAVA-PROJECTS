
import java.util.Random;



class Aircraft {


  float airSpeed;
  PVector coordinates;
  PShape blip;
  PVector airportLoc, endPointLoc, aircraftLoc;
  Random r = new Random();
  //declare aircraft size


  public Aircraft(PVector airportloc, PVector endpointloc) {

    airportLoc=airportloc;
    endPointLoc= endpointloc ;

    //blip = new PShape(ELLIPSE,r.nextInt(0,600),r.nextInt(0,600),r.nextInt(1,3),r.nextInt(1,3));
    airSpeed = r.nextFloat(0, (float) 0.9);
    //call setCoordinates

    //call setBlip
    this.setCoordinates();
    this.setBlip();
  }

  //method: PVector getCoordinates
  //return coordinates

  public PVector getCoordinates() {

    return aircraftLoc;
  }






  //method: void setCoordinates(endpoint coords)
  // set the starting coordinates to endPoint
  public void setCoordinates() {

    aircraftLoc = endPointLoc;
  }




  //method: void setBlip
  //create an ellipse at the  aircraft location of aircraft size
  //draw the ellipse

  public void setBlip() {

    float sizeofAircraft = r.nextInt(5, 20);
    PShape aircraftshape = createShape(ELLIPSE, aircraftLoc.x, aircraftLoc.y, sizeofAircraft, sizeofAircraft);
    // set col to black;
    shape(aircraftshape);
  }



  //method: boolean moveAircraft(airport location)
  //find distance from airport to aircraft


  public boolean moveAircraft() {

    if (PVector.dist(airportLoc, endPointLoc)< airSpeed) {

      aircraftLoc = airportLoc;
      return false;
    }

    aircraftLoc.x = this.endPointLoc.x - ((airSpeed*(endPointLoc.x-airportLoc.x))/PVector.dist(airportLoc, coordinates));
    aircraftLoc.y = this.endPointLoc.y - ((airSpeed*(endPointLoc.y-airportLoc.y))/PVector.dist(airportLoc, coordinates));




    return true;
  }




  //if distance is less than airspeed, set coords to airport location and return false

  //calc new coordinates
  //return true
}
