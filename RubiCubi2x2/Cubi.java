import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.*;
import javax.vecmath.*;
import javax.media.j3d.Shape3D;
/**
 * Write a description of class Cubi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Cubi
{  int nr =1000;
   int id=1000;
   int place=1000;
   
   static double paramDouble=0.194;
   Shape3D shape=null;
   double scale;
    
    public int getNr()
   { return this.nr;}
   public int getId()
   { return this.id;}
   public void reset()
   { place=0;id=0;}
   public int getPlace()
    { return this.place;}
        
   public void setId(int id)
    {
     this.id =id;
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
   
   
    /**
     * Constructor for objects of class Cubi
     */
   
  
  static Shape3D makeShape(int id,int position,float[][] colors)
  {Shape3D shape =new Shape3D();
    QuadArray quadArray = new QuadArray(24, 5);   
    float[] arrayOfFloat = new float[verts.length];
    for (byte b = 0; b < verts.length; b++) {
     arrayOfFloat[b] = verts[b] * (float)paramDouble;
    }
    quadArray.setCoordinates(0, arrayOfFloat);
    quadArray.setColors(0, colors[id]); // hier geht id ein position immer 0
    //quadArray.setColors(0, colors[place]); // hier geht id ein
    shape.setGeometry((Geometry)quadArray);
    //this.scale = paramDouble;
    return shape;
    } 
    
    static Shape3D makeShape(int id,float[][] colors)
  {Shape3D shape =new Shape3D();
    QuadArray quadArray = new QuadArray(24, 5);   
    float[] arrayOfFloat = new float[verts.length];
    for (byte b = 0; b < verts.length; b++) {
     arrayOfFloat[b] = verts[b] * (float)paramDouble;
    }
    quadArray.setCoordinates(0, arrayOfFloat);
    quadArray.setColors(0, colors[id]); // hier geht id ein position immer 0
    //quadArray.setColors(0, colors[place]); // hier geht id ein
    shape.setGeometry((Geometry)quadArray);
    //this.scale = paramDouble;
    return shape;
    } 
  
    /*
      
    static public BranchGroup getCubiBranchGroup(int id,int place,int position,float[][] colors) 
   { int i=0;
    int j=0;
    int k=0;
     //branchGroup=new BranchGroup();
      	       
        switch(place)
      { case 0: {i=1;j=0;k=1; break;}
        case 1: {i=1;j=0;k=0;break;}
        case 2: {i=0;j=0;k=0;break;}
        case 3: {i=0;j=0;k=1;break;}
        case 4: {i=1;j=1;k=1;break;}
        case 5: {i=1;j=1;k=0;break;}
        case 6: {i=0;j=1;k=0;break;}
        case 7: {i=0;j=1;k=1;break;}
        default: System.out.println("place < 0 or place > 7 ");
        }
    
    float x=0.4f*(i)-0.2f;
    float y=0.4f*(j)-0.2f;
    float z=0.4f*(k)-0.2f;
    final TransformGroup tg = new TransformGroup();
    final Transform3D transform = new Transform3D();
    final Vector3f vector = new Vector3f(x, y,z);
     transform.setTranslation(vector);
     tg.setTransform(transform);
     System.out.println("i="+i+" j="+j+" k="+k+" id="+id+" place="+place+ " x="+x+" y="+ y+" z="+z);
     tg.addChild(makeShape(id,position,colors));
     
     cubibranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     cubibranchGroup.addChild(tg);
     cubibranchGroup.setUserData( "Cubi0" );
     return cubibranchGroup; 
    }
    */
 
    public Cubi(BranchGroup branchGroup,int nr,int place,int id,int position,double paramDouble) {
        //this.cubibranchGroup=branchGroup;
        //this.nr=nr;
        //this.id=id;
        //this.place=place;
        //this.paramDouble=paramDouble;
       
       
  }
  
  public Cubi(BranchGroup branchGroup,int nr,int place,int id,double paramDouble) {
        //this.cubibranchGroup=branchGroup;
        //this.nr=nr;
        //this.id=id;
        //this.place=place;
        //this.paramDouble=paramDouble;
       
       
  }

    
}
