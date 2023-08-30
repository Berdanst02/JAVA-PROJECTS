/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAssignment;

/**
 *
 * @author berd1810
 */
public class ISSStudent {
    private String name;
    private String address;
    private int id;
    
    public ISSStudent(String n, String a, int i){
        this.name = n;
        this.address = a;
        this.id = i;
    }
    
    public String toString(){
        return "Name: \t\t" + name + "\nAddress:\t" + address + "\nID: \t\t" + id;
    }
    
    public int getID(){
        return id;
    }
    
    public int compareTo(int searchValue){
        if(this.id > searchValue)
            return 1;
        else if(this.id < searchValue)
            return -1;
        else
            return 0;
    }
    
    
   
    
    
}
