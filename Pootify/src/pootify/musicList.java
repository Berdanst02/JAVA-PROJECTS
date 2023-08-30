/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pootify;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author darkb
 */
public class musicList {
    
    public musicList(){
    
       
    
    }
    
    
      public ArrayList<Music> shuffleMusic(ArrayList<Music> musicList){
        Random r = new Random();
        ArrayList<Music> shuffledMusic = new ArrayList<>();
        
        //make a new array and place random songs from the old array  until there are no more songs left. Then return the new songs array.
        while(musicList.size()>0){
            
            int randIndex = r.nextInt(0,musicList.size());
            shuffledMusic.add(musicList.get(randIndex));
            musicList.removeAll(shuffledMusic);
            
            
            
        }
        
        return shuffledMusic;
    }
      
}
