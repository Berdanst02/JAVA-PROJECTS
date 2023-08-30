class Snowflake{

  float flakeSize;
  PShape flake;
  PVector location;
  PVector movement;
  int maxFlakeSize=4;
  
  
  public Snowflake(){ //constructor
  
     this.flakeSize = random(2,maxFlakeSize);
     this.location = new PVector(random(0,width),random(0,height));
     this.movement = new PVector(0,random(0.1,0.5));
     fill(255,255,255);
     
     float number = random(1,3);
     
     if(number == 1){
       this.flake = createShape(ELLIPSE, location.x, location.y-maxFlakeSize,flakeSize, flakeSize);   
       
     }
     
     else if(number == 2){
       this.flake = createShape(RECT, location.x, location.y-maxFlakeSize,flakeSize, flakeSize);   
       
     }
      else if(number == 3){
       this.flake = createShape(TRIANGLE, location.x, location.y-maxFlakeSize,flakeSize, flakeSize);   
       
     }
     
     else{
      
       this.flake = createShape(ELLIPSE, location.x, location.y-maxFlakeSize,flakeSize, flakeSize);  
     }
     
     
    
  
  
  
  }
  
  
  public PShape getSnowflake(){
  
    return this.flake;
    
  }
  
  public boolean isGrounded(){
  
    boolean grounded;
    grounded = (location.y >= height+maxFlakeSize)? true: false; 
    return grounded;
  
  }
  
  
  
  public void move(){
     
    this.movement.x = random(0,0.2);
    this.location.add(this.movement);
    
    
    
    if(this.isGrounded()){
    this.location =  new PVector(random(0,width),0);
    this.flake = createShape(ELLIPSE, location.x,location.y-maxFlakeSize,flakeSize,flakeSize);
    
    }
    
    else{
    flake.translate(movement.x,movement.y);    
   
    }
    

    shape(flake); //draw the flake on the screen
  
  
  }
  
  
  
  


}
