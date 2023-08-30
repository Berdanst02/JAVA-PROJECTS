import java.lang.Math;
class insidePond{

ArrayList<Fish> Fishes;
int amountofFish = 25;
ArrayList<Fish> toRemove;


public insidePond(){

  Fishes = new ArrayList<Fish>();



}


public void spawnFish(){

  for(int i=0;i<amountofFish;i++){
    Fishes.add(new Fish());
    
  }
    System.out.println(Fishes.size());
      for(int i=0;i<Fishes.size();i++){
       
        PShape tempfish = Fishes.get(i).getFish();
        shape(tempfish);
}

}

public void moveFish(){

for(int i=0;i<Fishes.size();i++){

  Fishes.get(i).physicsFish();
  shape(Fishes.get(i).getFish());
  
  
  
  
}






}

public void checkCollision(){

toRemove = new ArrayList<Fish>();
   float distBetween;
   for(int j=0;j<Fishes.size();j++){ 
   int fishTemp = j;
  for(int i=0;i<Fishes.size();i++){
  
   
    distBetween = (dist(Fishes.get(fishTemp).getX(),Fishes.get(fishTemp).getY(), Fishes.get(i).getX(),Fishes.get(i).getY()));
   
    //if(distBetween<Fishes.get(i).getSize()){
    
      if(Fishes.get(fishTemp).getSize() > Fishes.get(i).getSize() && distBetween <Fishes.get(i).getSize() ){
          
        Fishes.get(fishTemp).increaseSize(Fishes.get(i).getSize());
        toRemove.add(Fishes.get(i));
          
      }
      
      else if(Fishes.get(i).getSize() > Fishes.get(fishTemp).getSize() && distBetween <Fishes.get(fishTemp).getSize()){
        Fishes.get(i).increaseSize(Fishes.get(fishTemp).getSize());
        toRemove.add(Fishes.get(fishTemp));
       
    }
    
    //}
    
    
  
  System.out.println(distBetween);
  }
  Fishes.removeAll(toRemove);
  
    
   }
   
   
   
   
   
}






}
