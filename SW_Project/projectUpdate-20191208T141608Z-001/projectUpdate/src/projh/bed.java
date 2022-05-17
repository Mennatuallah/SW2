/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;
import static projh.ResidentPatient.residentPatients;

public class bed implements Serializable{
    
    protected int id;
    protected int numberOfRoom;
    private final String BedFileName = "bed.bin";
    public static ArrayList<bed> beds = new ArrayList<bed>();
    filemanger FManger = new filemanger();
    
    public bed (){
        
    }
    
    
    public bed(int id ,int numberOfRoom){
        this.id=id;
        this.numberOfRoom=numberOfRoom;               
    }
    
    
     public boolean addbed() {
        loadFromFile();
        beds.add(this);
        return commitToFile();
    }
     
      public void loadFromFile() {
     if((FManger.read(BedFileName))!=null)
          beds = (ArrayList<bed>) FManger.read(BedFileName);
    }
     
     public boolean commitToFile() {
        return FManger.write(BedFileName,beds);
    }
    
    public static void  bookbed(int myBedId,int myRoomNumber)
    {
        bed beds =new bed(myBedId,myRoomNumber);
        if(beds.addbed())
        {
            System.out.println("added bed Successfully ");
        }
        else{
            System.out.println("Failed to insert ... !");
        }  
    
    }
    
}
