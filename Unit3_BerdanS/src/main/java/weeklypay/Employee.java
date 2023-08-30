/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeklypay;

/**
 *
 * @author berd1810
 */
public class Employee {
    
    private String fullName;
    private int type;
    private double rate;
    int hours;
    
    
    
    
    public Employee(){

       
    }
    
    public String getNameRules(){
    return "nonblank";
    }
    
    public String getTypeRules(){
    return "nonblank";
    }
    
    public String getRateRules(){
    return "nonblank";
    }
    public String getHoursRules(){
    return "nonblank";
    }
    
    
    public boolean setName(String nm){
        if(nm!=null){
        fullName = nm;
        return true;
        }
        
        else{
        return false;
        }
        }
    
    
    public boolean setType(int tp){
        
        
        
        
        if(tp ==1){
        type=1;
        return true;
        }
        else if(tp==2){
        type=2;
        return true;
        }
        
        else{
        return false;
        }
        
    }
    
   public boolean setRate(double rt){
   
       if(rt <6.75 || rt>30.50) return false;
       
       else{ 
           
           rate = rt;
           return true;}
   }
   
   public boolean setHours(int hrs){
   
   if(hrs<1 || hrs >60) return false;
   else{ 
       hours = hrs;
       return true;
   }
   }
   
   public String getName(){
   return fullName;
   }
   public double getPay(){
   
       int overtimeHours;
       double employeePay;
       
       
       
       
       
       
       if(type==2){
       overtimeHours = hours-40;
       hours = hours - overtimeHours;
       
       employeePay = (hours * rate) + (overtimeHours*rate*2);
       
       
       
       return employeePay;
       
       }
       
       else if(type==1){
       
       employeePay = rate* hours;
       
       return employeePay;
       
       }
       
       
       else{
       return 0;
       }
       
       
   }
   
   
    
    
    
    
    
    
    
    
    
    
}
