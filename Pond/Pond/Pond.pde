
insidePond ipond = new insidePond();
void setup(){


size(600,600);
noStroke();

//PShape grass = createShape(RECT, 0,0,600,100);
//fill(12, 242, 223);
//shape(grass);
//background(12, 242, 223);

ipond.spawnFish();


}

void draw(){
background(12, 242, 223);
fill(0, 255, 0);
rect(0,0, 600, 60);    
  //fill(12, 242, 223);
  //shape(bluepond);
  ipond.moveFish();
  ipond.checkCollision();
  
  
}
