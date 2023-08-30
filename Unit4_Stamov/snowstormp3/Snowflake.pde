
class Snowflake {
 
  float flakeSize; // members
  PShape flake;
  PVector location;
  PVector movement;
  int maxFlakeSize = 5;
  
  public Snowflake(){  // constructor
    this.flakeSize = random(2, maxFlakeSize);
    this.location = new PVector(random(0, width), random(0, height));
    this.movement = new PVector(0, random(0.1, 0.5));
    fill(255, 255, 255);
    this.flake = createShape(ELLIPSE, location.x, location.y-maxFlakeSize, flakeSize, flakeSize);    
  }
  
  public PShape getSnowflake(){
    return this.flake;
  }
  
  public boolean isGrounded(){
    boolean grounded;
    grounded = (location.y >= height+maxFlakeSize) ? true : false;
    return grounded;
  }
  
  public boolean isOffSide(){
  boolean offside;
  offside = (location.x > width + maxFlakeSize || location.x < 0 - maxFlakeSize) ? true : false;
  
  return offside;
  
  }
  
  
  //public boolean isOffRightSide(){
  //boolean rightoffside;
  //rightoffside = (location.x > width + maxFlakeSize || location.x > width - maxFlakeSize) ? true : false;
  
  //return rightoffside;
  //}
  
  
  public void move(){
    float xMove = map(mouseX,0,width, -0.5,0.5);
    this.movement.x = xMove;
    this.location.add(this.movement);  // store the new location
    
    if(this.isGrounded()){
      this.location = new PVector(random(0, width), 0);
      this.flake = createShape(ELLIPSE, location.x, location.y-maxFlakeSize, flakeSize, flakeSize);
    } 
    else if(this.isOffSide()){
    
      if(xMove > 0){
      
      this.location = new PVector(0,random(0,height));
      }
      else{
          this.location = new PVector(width+maxFlakeSize, random(0,height));  
      }
      
      
    
    this.flake = createShape(ELLIPSE, location.x, location.y-maxFlakeSize, flakeSize, flakeSize);
    
    
    }
    
    
    //else if(this.isOffRightSide()){
    //this.location = new PVector(width,random(0,height));
    //this.flake = createShape(ELLIPSE, location.x, location.y-maxFlakeSize, flakeSize, flakeSize);
    
    //}
    
    
    else {
      flake.translate(movement.x, movement.y); // move the flake to the new location
    }
         
    shape(flake);  // draw the flake on the screen
    
  }
}
