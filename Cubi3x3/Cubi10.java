import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.*;
import javax.vecmath.*;
import javax.media.j3d.Shape3D;
/**
 * Write a description of class Cubi1 here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
// rot -blau-gelbe Ecke 
public class Cubi10  extends Cubi
{ static BranchGroup branchGroup=null;
   private int nr =10;
   int id=1;
   int place=10;
   int idmem=2;
   double paramDouble=1;
   public void Ausgabe()
   { System.out.println("nr="+nr+" place="+place+" id="+id+" idmem="+idmem+" getId():"+getId());
    } 
   public void reset()
   { place=10;id=1;idmem=2;}
   public int getNr()
   { return this.nr;}
   public int getId()
   { return idmem;}


   public int getPlace()
    { return this.place;}
    
    
    
   public void setId(int id)
    {this.idmem=id;
        id=id/2;
       this.id =id;
    }
    public void setPlace(int place)
    {this.place =place;
    }

  
   
        static final float[][] colors = new float[][]{ 
                                                 //   platz 0,1,2,3 einmal im Uhrzeigersinn Downebene , gelb bleibt unten
                                                 //   id 0,1,2,3
                                                 //   position 0,1,2 für die untere Ebene
                                                    //id=0,place=0 ,mode=0,LEFT:red, RIGHT:black, FRONT:blue, BACK:black,TOP:black BOTTOM:yellow  

{//id=0,place=0 ,mode=0,LEFT:green, RIGHT:black, FRONT:red, BACK:black,TOP:black BOTTOM:yellow  
      //Farben LEFT=green,FRONT=red,Bottom=yellow                                                //LEFT
                                                      1.0F,0.0F, 0.0F,//red
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
   { //id=1, place=1 ,mode=0 ,LEFT:black, RIGHT:red, FRONT:green, BACK:black, TOP:black BOTTOM:yellow  
                                                      //LEFT
                                                      0.0F,0.0F, 0.0F,//black
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //FRONT
                                                      1.0F,0.0F, 0.0F,//red
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
{ //id=2,place=2 ,mode=0,LEFT:black, RIGHT:green, FRONT:black, BACK:red, TOP:black, BOTTOM:yellow 
                                                      //LEFT
                                                      0.0F,0.0F, 0.0F,//black
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      1.0F,0.0F, 0.0F,//red
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
{ //id=3 ,place=3 mode=0,LEFT:red,RIGHT:black,FRONT:black,BACK:green,TOP:black BOTTOM:yellow                                                     
                                                      //LEFT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      1.0F,0.0F, 0.0F,//red
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                      1.0F,0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
                         // einmal F
    { //id=4 ,place=4 mode=0,LEFT:yellow,RIGHT:black,FRONT:red,BACK:black,TOP:green BOTTOM:black                               
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
{ //id=5, place=5 ,mode=0,LEFT:black, RIGHT:red, FRONT:yelloew, BACK:black,TOP:green, BOTTOM:black                   
                                                       // platz=7, id 5 
                                                      //LEFT
                                                      0.0F,0.0F, 0.0F,//black
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //Front
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
{ //id=6, place=6,mode=0 ,LEFT:black, RIGHT:yellow, FRONT:black, BACK:red,TOP:green, BOTTOM:black     
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //TOP
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
                       
                                  
                                                      
                                
        { //id=7, place=7,mode=0 ,LEFT:red, RIGHT:black, FRONT:black, BACK:yellow,TOP:green, BOTTOM:black
                                                      //LEFT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,  //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
 { //Farben verdrehen u,l
   //LEFT=green,FRONT=red,Bottom=yellow -->LEFT=red,FRONT=yellow,Bottom=green
     //id=0, place=0,mode=1 ,LEFT:red, RIGHT:black, FRONT:yellow, BACK:black,TOP:black, BOTTOM:green
   //gleich LU                                       // platz=6 ,id =8 
                                                      //LEFT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F
                                                    },
 { //id=1, place=1, mode=1 ,LEFT:black, RIGHT:yellow, FRONT:red, BACK:black,TOP:black, BOTTOM:green
                                                  
                                                      //LEFT
                                                      0.0F,0.0F, 0.0F,//black
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F
                                                    },
                       //# next  id=1 , platz=1# ,FRONT:green, RIGHT:red ,BOTTOM:yellow 
                
                 
       {//id=2, place=2, mode=1 ,LEFT:black, RIGHT:red, FRONT:black, BACK:yellow,TOP:black, BOTTOM:green
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F
                                                    },
                                                    
                                                   
          {//id=3, place=3, mode=1 ,LEFT:yellow, RIGHT:black, FRONT:black, BACK:red,TOP:black, BOTTOM:green
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F
                                                    },
                       // einmal F
                    { //id=4, place=4, mode=1 ,LEFT:green, RIGHT:black, FRONT:yellow, BACK:black,TOP:red, BOTTOM:black          
                                                      //Left
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                     //Right
                                                      0.0F, 0.0F, 0.0F,  //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //Top
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BottomPosition
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
                                                       
                  { //id=5, place=5, mode=1 ,LEFT:black, RIGHT:yellow, FRONT:green, BACK:black,TOP:red, BOTTOM:black    
                                                        //LEFT
                                                      0.0F,0.0F, 0.0F,//black
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                       
                                                    },
            { //id=6, place=6, mode=1 ,LEFT:black, RIGHT:green, FRONT:black, BACK:yellow,TOP:red, BOTTOM:black 
                                                      
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                     //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
           {   //id=7, place=7, mode=1 ,LEFT:yellow, RIGHT:black, FRONT:black, BACK:green,TOP:red, BOTTOM:black 
                                                      //Left
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
           // Farben (des ursprüglichen Würfels vertauschen)
           //jetz LU
           //LEFT=green,FRONT=red,Bottom=yellow -->LEFT=yellow,FRONT=green,Bottom=red                             
          {//id=0, place=0,mode=2 ,LEFT:yellow, RIGHT:black, FRONT:green, BACK:black,TOP:black, BOTTOM:red
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //Right
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F
                                                    },
        { //id=1, place=1,mode=2, LEFT:black, RIGHT:green, BACK:black,FRONT:yellow,TOP:black, BOTTOM:red
                                                      //LEFT
                                                      0.0F,0.0F, 0.0F,//black
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,// black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BottomPosition
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F
                                                    },
                                                    
            { //id=18, place=2,mode=0, LEFT:black, RIGHT:yellow, BACK:green,FRONT:black,TOP:black, BOTTOM:red
                                                      //LEFT
                                                      0.0F,0.0F, 0.0F,//black
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                      0.0F,0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F
                                                    },
                                                      
         { //id=19, place=3,mode=0, LEFT:green, RIGHT:black, BACK:yellow,FRONT:black,TOP:black, BOTTOM:red
                                                      //LEFT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F
                                                    },
    { //einmal F
     //id=20, place=4,mode=0, LEFT:red, RIGHT:black,FRONT:green, BACK:black ,TOP:yellow, BOTTOM:black    
                                                      //LEFT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
       {//id=21, place=5,mode=0, LEFT:black, RIGHT:green,FRONT:red, BACK:black ,TOP:yellow, BOTTOM:black    
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
  {//id=22, place=6,mode=0, LEFT:black, RIGHT:red,FRONT:black, BACK:green ,TOP:yellow, BOTTOM:black    
                                                      //LEFT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    },
  {//id=23, place=7,mode=0, LEFT:green, RIGHT:black,FRONT:black, BACK:red ,TOP:yellow, BOTTOM:black    
                                                      //LEFT
                                                      1.0F, 0.0F, 0.0F,//red
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                      1.0F, 0.0F, 0.0F,
                                                     //RIGHT
                                                      0.0F, 0.0F, 0.0F, //black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //FRONT
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BACK
                                                      0.0F, 0.0F, 1.0F,//blue
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      0.0F, 0.0F, 1.0F,
                                                      //TOP
                                                      0.0F, 0.0F, 0.0F,//yellow
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      //BOTTOM
                                                      0.0F, 0.0F, 0.0F,//black
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F,
                                                      0.0F, 0.0F, 0.0F
                                                    } 
                                                };
   
   public BranchGroup getCubi10BranchGroup(BranchGroup branchGroup,int place,int id,float[][] colors) 
   {   this.place=place;
       this.idmem=id;//<-- wegen 3x3
       id=id/2;
       this.id=id;//<--
     
     
      int i=0;
      int j=0;
      int k=0;
     BranchGroup branchgroup=new BranchGroup();
    	       
       switch(place)
      { case 0: {i=2;j=0;k=2; break;}
        case 1: {i=2;j=0;k=1;break;}
        case 2: {i=2;j=0;k=0;break;}
        case 3: {i=1;j=0;k=0;break;}
        case 4: {i=0;j=0;k=0;break;}
        case 5: {i=0;j=0;k=1;break;}
        case 6: {i=0;j=0;k=2;break;}
        case 7: {i=1;j=0;k=2;break;}
        case 8: {i=2;j=1;k=2; break;}
        case 9: {i=2;j=1;k=1;break;}
        case 10: {i=2;j=1;k=0;break;}
        case 11: {i=1;j=1;k=0;break;}
        case 12: {i=0;j=1;k=0;break;}
        case 13: {i=0;j=1;k=1;break;}
        case 14: {i=0;j=1;k=2;break;}
        case 15: {i=1;j=1;k=2;break;}
        case 16: {i=2;j=2;k=2; break;}
        case 17: {i=2;j=2;k=1;break;}
        case 18: {i=2;j=2;k=0;break;}
        case 19: {i=1;j=2;k=0;break;}
        case 20: {i=0;j=2;k=0;break;}
        case 21: {i=0;j=2;k=1;break;}
        case 22: {i=0;j=2;k=2;break;}
        case 23: {i=1;j=2;k=2;break;}
        case 24: {i=1;j=0;k=1;break;}
        case 25: {i=1;j=2;k=1;break;}
        default: System.out.println("place < 0 or place > 25 "+" cubiNr="+nr+" place="+place+" id="+id);    
        }
    
    float x=0.4f*(i)-0.4f;
    float y=0.4f*(j)-0.4f;
    float z=0.4f*(k)-0.4f;
    final TransformGroup tg = new TransformGroup();
    final Transform3D transform = new Transform3D();
    final Vector3f vector = new Vector3f(x, y,z);
     transform.setTranslation(vector);
     tg.setTransform(transform);
     //System.out.println("i="+i+" j="+j+" k="+k+" id="+id+" place="+place+ " x="+x+" y="+ y+" z="+z);
     tg.addChild(makeShape(id,colors));
     branchgroup.addChild(tg);
    //Ausgabe();
     return branchgroup; 
    } 
  
    public Cubi10(BranchGroup brauchGroup,int nr,int place,int id,double paramDouble)
    
    {
       super(branchGroup,nr,place,id,paramDouble);
       this.branchGroup=branchGroup;
       this.place=place;
       this.nr=nr;
       this.idmem=id;
       id=id/2;
       this.id=id;
       this.paramDouble=paramDouble;
       
    }

    
}
