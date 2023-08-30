import java.util.Random;
class Fish{

  
  float fishSpeedx,fishSpeedy, fishSize,fishColor;
  PVector spawnLoc;
  float r,g,b;
  boolean strong;
  
  public Fish(){
    Random rand = new Random();
    fishSize = rand.nextFloat(5f,20f);
    adjustFishSpeed();
    strong = false;

spawnLoc = new PVector(rand.nextInt(0,600),(rand.nextInt(100,500))+100);
   r = rand.nextFloat(0,256);
g = rand.nextFloat(0,256);
 b = rand.nextFloat(0,256);
    
    
 
  
  
  
  
  }

  
//  public void drawFish(){
//  Random rand = new Random();
//float r = rand.nextFloat(0,256);
//float g = rand.nextFloat(0,256);
//float b = rand.nextFloat(0,256);
    
    
//    fish = createShape(ELLIPSE, spawnLoc.x,spawnLoc.y, fishSize,fishSize);
//    fill(r,g,b);
    
//  }
  
  public PShape getFish(){
   fill(r,g,b);    
   PShape grp = createShape(GROUP);
   
   PShape fish = createShape(ELLIPSE, spawnLoc.x,spawnLoc.y, fishSize,fishSize);
   PShape teeth = createShape(ELLIPSE,spawnLoc.x,spawnLoc.y,fishSize/3,fishSize/3);
   PShape mouth = createShape(ELLIPSE,spawnLoc.x,spawnLoc.y,fishSize/4,fishSize/4);
   teeth.setFill(color(255,255,255));
   mouth.setFill(color(255,0,0));
   
   grp.addChild(fish);
   grp.addChild(teeth);
   grp.addChild(mouth);
    
  return grp;
  }
  
  public void increaseSize(float otherfishSize){
  fishSize+= otherfishSize;
  
  
  
  fishSpeedx = (fishSpeedx+(otherfishSize*2))/((otherfishSize));
  fishSpeedy = (fishSpeedy+(otherfishSize*2))/((otherfishSize));


  
  //max size;
  if(fishSize > 100){
  fishSize=100;
  strong=true;
}

  
  }
  
  public void strongFish(){
    Random rand = new Random();
     r = rand.nextFloat(0,256);
g = rand.nextFloat(0,256);
 b = rand.nextFloat(0,256);
  
  }
  
  
  
  public float getSize(){
  return fishSize;
  }
  
  public void adjustFishSpeed(){
  
  fishSpeedx = fishSize/40f;
  fishSpeedy =  fishSize/40f;
  
  
  }
  
  public float getX(){
  return spawnLoc.x;
  }
  
  public float getY(){
  return spawnLoc.y;
  }
  //public void changeLoc(float amountxLoc, float amountyLoc){
    
  //  spawnLoc.x = spawnLoc.x + amountxLoc;
  //  spawnLoc.y = spawnLoc.y + amountyLoc;
  
  
  //}
  
  
  public void physicsFish(){
  
  if(strong==true)strongFish();
    
    
    
  this.spawnLoc.x += fishSpeedx;
  this.spawnLoc.y += fishSpeedy;
  
  
  if(this.spawnLoc.x > width|| this.spawnLoc.x < 0){
    
    fishSpeedx = fishSpeedx * -1;
    
    
  }
  
  if(this.spawnLoc.y > height || this.spawnLoc.y < 80){
  
  fishSpeedy = fishSpeedy * -1;
  }
  
    
    
  }
  
  




}
