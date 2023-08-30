




class Radar{

ArrayList<Aircraft> Aircrafts; 
 
float radius,angle=0f;
PVector sweeperEndPoint, airportloc;
float tolerance = 0.001f;

 public Radar(PVector endPoint, PVector airportLoc){
  
  Aircrafts = new ArrayList<Aircraft>();
  angle=0;
  radius=width/2;
  sweeperEndPoint = endPoint;
  airportloc = airportLoc;
  
  
  }

public PShape GetSweeperLine(PVector airportLoc){
 
 // call rotate sweeper
this.RotateSweeper(airportLoc);
 PShape Line = createShape(LINE, airportloc.x,airportloc.y,this.sweeperEndPoint.x,this.sweeperEndPoint.y);
 stroke(100);
 
 
 return Line;
 
 }

 public void RotateSweeper(PVector airportloc){
   Random r = new Random();
   ArrayList<Aircraft> toRemove; 
      angle++;   
   
    toRemove = new ArrayList<Aircraft>(); 
   if(r.nextInt(100)==1){
   //aircraft = new Aircraft(airportLoc, sweeperEndPoint);

   Aircrafts.add(new Aircraft(airportloc, sweeperEndPoint));  
   System.out.println(Aircrafts.size());
   }
   
    for(int i=0;i<Aircrafts.size();i++){
    
    if(isAircraftScanned(Aircrafts.get(i).getCoordinates(),airportloc)){
       if(Aircrafts.get(i).moveAircraft()==false){
         toRemove.add(Aircrafts.get(i)); 
       
       }
       
       
       }
       
    Aircrafts.get(i).setBlip();
    
    
    }
    Aircrafts.removeAll(toRemove);  
  sweeperEndPoint.x = radius*cos(radians(angle))+ airportloc.x;
  sweeperEndPoint.y = radius*sin(radians(angle))+ airportloc.y;
 
 
 }
 
 
  public boolean isAircraftScanned(PVector aircraftLocation, PVector airportloc){
 
   
   
 ////calc distance between line segments AC and BC
 float AC = PVector.dist(airportloc, aircraftLocation);
 float BC = PVector.dist(sweeperEndPoint, aircraftLocation);
 float AB = (width/2);
 if(AC + BC - AB < tolerance) return true;
 else return false;
 
 ////add line segment values together
 //// if added lengths == sweeper length(within tolerance
 //  //return true
 //  //otherwise return false
   
   
 
 }
 
 public float getAngle(){
 return angle;
 
 }
 



}
