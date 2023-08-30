package arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author berd1810
 */
public class arraysandmethods {

    /**
     * @param args the command line arguments
     */
    
    
    public static int[] findInteriorAngles(int angle1, int angle2){
    
    int angle3 = 180-(angle1+angle2);
    
    int angles[] = {angle1,angle2,angle3};
    
    
    
    return angles;
        
    }
    
    
    public static int[] findExteriorAngles(int[] interiorAngles){
        
        int[] exteriorAngles = new int[3];
        
        exteriorAngles[0] = interiorAngles[1] + interiorAngles[2]; 
    
        exteriorAngles[1] = interiorAngles[0] + interiorAngles[2]; 
        
        exteriorAngles[2] = interiorAngles[0] + interiorAngles[1]; 
    
    
        return exteriorAngles;
    }
    
    
    
    
    public static void main(String[] args) {
        int[] interior = findInteriorAngles(45, 45);
        
        System.out.printf("Al: %d\t A2:%d\t A3: %d\n",interior[0],interior[1],interior[2]);
        
        
        int[] exterior = findExteriorAngles(interior);
        
        
        System.out.printf("Al: %d\t A2:%d\t A3: %d\n",exterior[0],exterior[1],exterior[2]);
        
        
        
        
    }
    
}
