/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pootify;

import java.nio.file.Path;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.nio.file.Paths;  
import  java.io.*;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.HashSet;
import java.util.Random;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.DataLine;

/**
 *
 * @author berd1810
 */
public class Music{
    public Clip clip;
    AudioInputStream sound;
    String fileLoc;
    long clipTime;
    
    
    public Music(String fileName){
    fileLoc = fileName;
    //the parameter is the directory in whihc the file is in and the processing for that happens in the Pootify.java file   
    try {
        //the directory will be what the AudioInputStream library plays    
        File file = new File(fileName);
            sound = AudioSystem.getAudioInputStream(file);
            
            
            
            AudioFormat format = sound.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        clip = (Clip) AudioSystem.getLine(info);
        //wav formatting needed to be able to play sound    
            
            
            //format end
            clip.open(sound);
        } catch (Exception e) {
        }
       
      
    } 
    
    
    
   
    public void playMusic(){
        clip.setMicrosecondPosition(0);
        clip.start();
        //reset to microsecondpositon 0 and start playing
        
        
     
        
    }
    
    public void stopMusic() throws IOException {
    sound.close();
    clip.stop();
    clip.setMicrosecondPosition(0);
    //stop music and close it and set the microsecond position to 0 for next time.
    }
    
    public void pauseMusic(){
    

clipTime= clip.getMicrosecondPosition();

clip.stop();
//save the microsecond position and use that to resume music next time

//When you want to resume the clip from the last position
    }
    
    
    public void resumeMusic(){
    
    clip.setMicrosecondPosition(clipTime);

clip.start();
    
    
    }
    
    public String getMusicName(){
         Path path = Paths.get(fileLoc);
         String filename;
         Path fileName = path.getFileName();
         filename = fileName.toString();
         return filename;
         
    
    }
    public String getFile(){
    return fileLoc;
    }
    
  
    public long musicProgress(){
    return clip.getMicrosecondPosition();
    }
    public long getMaxMicroSecondPos(){
    return clip.getMicrosecondLength();
    }
    public void setMusicPos(long pos){
    clip.setMicrosecondPosition(pos);
        
    }
    
    
    
}
