import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.*;
import javax.vecmath.*;
import javax.media.j3d.Shape3D;
/**
 * Write a description of class Cubi here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
abstract class Cubi
{  
    
   static double paramDouble=0.194;
   private int nr =4711;
   int id=0;
   int place=0;
   int idmem=0;
   
   public int getNr()
   { return this.nr;}
   public int getId()
   { return idmem;}
   public void reset()
   { place=0;id=0;idmem=0;}
   public int getPlace()
    { return this.place;}
        
   public void setId(int id)
    {this.idmem =id;
     this.id =id/2;
    }
    public void setPlace(int place)
    {this.place =place;
    }  
   
   
   
  static final float[] verts = new float[] 
   { 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F,
   -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 1.0F,
   -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, -1.0F, 
   1.0F, 1.0F, 1.0F, 1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, -1.0F,
   1.0F, 1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, -1.0F, 1.0F, 1.0F,
   1.0F, 1.0F, 1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F,
   -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F,
   -1.0F, 1.0F };
   
   
     /* Constructor for objects of class Cubi
     */
 
    static Shape3D makeShape(int id,float[][] colors)
  {Shape3D shape =new Shape3D();
    QuadArray quadArray = new QuadArray(24, 5);   
    float[] arrayOfFloat = new float[verts.length];
    for (byte b = 0; b < verts.length; b++) {
     arrayOfFloat[b] = verts[b] * (float)paramDouble;
    }
    quadArray.setCoordinates(0, arrayOfFloat);
    quadArray.setColors(0, colors[id]); // hier geht id ein position immer 0
    shape.setGeometry((Geometry)quadArray);
    //this.scale = paramDouble;
    return shape;
    } 
  
 
  public Cubi(BranchGroup branchGroup,int nr,int place,int id,double paramDouble) {
        
       
       
       
  }

    
}
