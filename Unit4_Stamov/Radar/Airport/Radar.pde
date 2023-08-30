




class Radar{

ArrayList<Aircraft> Aircrafts; 
 
float radius,angle=0;
PVector sweeperEndPoint;

float tolerance = 0.001f;
PVector endpointloc;

  
 public Radar(PVector endPoint){
  
  Aircrafts = new ArrayList<Aircraft>();
  angle=0;
  radius=width/2;
  sweeperEndPoint = endPoint;
  //airportLoc = AirportLoc;
  
  
  }
  
 public PShape GetSweeperLine(PVector airportLoc){
 
 // call rotate sweeper
this.RotateSweeper(airportLoc, sweeperEndPoint);
 PShape Line = createShape(LINE, airportLoc.x,airportLoc.y,this.sweeperEndPoint.x,this.sweeperEndPoint.y);
 stroke(100);
 
 
 return Line;
 
 }
 
 public void RotateSweeper(PVector airportloc, PVector endpointLoc){
   endpointloc = endpointLoc;
   ArrayList<Aircraft> toRemove; 
   Random r = new Random();

   angle+=1;
   
   //randomly add a new aircraft
   
   
 toRemove = new ArrayList<Aircraft>();   
   if(r.nextInt(100)==1){
   //aircraft = new Aircraft(airportLoc, sweeperEndPoint);

   Aircrafts.add(new Aircraft(airportloc, endpointloc));  
   System.out.println("Aircraft generated");
   }
  
   //create a temporary toRemove aircraft collection
   // iterate through the aircraft collection
    
   for(int i=0;i<Aircrafts.size();i++){
   
   if(isAircraftScanned(Aircrafts.get(i).getCoordinates(),airportloc)){
       if(Aircrafts.get(i).moveAircraft()==false){
         toRemove.add(Aircrafts.get(i)); 
       
       }
       
       }
       
       //call isAircraftScanned - if it returns true:
          
           //if it returns false add the aircraft to toRemove arraylist
           
           
           //call moveAirCraft
        Aircrafts.get(i).setBlip();
     
        //setBlip for each aircraft
   
   //remove all aircraft in toRemove from the master aircraft collection (removeAll) method for arraylists 
 }

   Aircrafts.removeAll(toRemove); 
    
  
   
   
   
   endpointloc.x = radius*cos(radians(angle))+ airportloc.x;
   endpointloc.y = radius*sin(radians(angle))+ airportloc.y;
   
   sweeperEndPoint = endpointloc;
   
   if(angle>359){
   angle=0;
   System.out.println("full rotation complete");
   }

 
   
 
 
 }
 
 
 public boolean isAircraftScanned(PVector aircraftLocation, PVector airportloc){
 
   
   
 ////calc distance between line segments AC and BC
 float AC = PVector.dist(airportloc, endpointloc);
 float BC = PVector.dist(airportloc, aircraftLocation);
 float AB = (width/2);
 if(AC + BC - AB< tolerance) return true;
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
