
 public static PVector airportloc, endPointLoc;
 int angle=0;
 
  Radar radar; 
void setup(){  // runs once
  size(600, 600);
  noStroke();
   
 
 endPointLoc = new PVector(width,0);
 airportloc = new PVector(width/2,width/2);
  radar = new Radar(endPointLoc);
 
 
 
 
}


void draw(){

  background(0,0,0);
  PShape airport = createShape(ELLIPSE,airportloc.x , airportloc.y, 5, 5); 
  PShape greenCircle = createShape(ELLIPSE, airportloc.x,airportloc.y,width,height);
  
  
  //PShape sweeperLine
  
  greenCircle.stroke(0,255,0);
  greenCircle.setFill(color(0,255,0));
  
  airport.setFill(color(0));
  shape(greenCircle);
  shape(airport);

  PShape Line = radar.GetSweeperLine(airportloc);
 // radar.RotateSweeper(airportloc, endPointLoc);
    shape(Line);


}
