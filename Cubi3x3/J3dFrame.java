import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.BorderLayout;
import javax.media.j3d.Alpha;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.Canvas3D;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import com.sun.j3d.utils.behaviors.mouse.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;

import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

/**
 * Write a description of class J3dFrame here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
public class J3dFrame extends  Frame
{    static long milis =200;
     static float Uwinkel=0f;
     static float Dwinkel=0f;
     static float Lwinkel=0f;
     static float Rwinkel=0f;
     static float Fwinkel=0f;
     static float Bwinkel=0f;
     static Cubi0 cubi0;
     static Cubi1 cubi1;
     static Cubi2 cubi2;
     static Cubi3 cubi3;
     static Cubi4 cubi4;
     static Cubi5 cubi5;
     static Cubi6 cubi6;
     static Cubi7 cubi7;
     static Cubi8 cubi8;
     static Cubi9 cubi9;
     static Cubi10 cubi10;
     static Cubi11 cubi11;
     static Cubi12 cubi12;
     static Cubi13 cubi13;
     static Cubi14 cubi14;
     static Cubi15 cubi15;
     static Cubi16 cubi16;
     static Cubi17 cubi17;
     static Cubi18 cubi18;
     static Cubi19 cubi19;
     static Cubi20 cubi20;
     static Cubi21 cubi21;
     static Cubi22 cubi22;
     static Cubi23 cubi23;
     static Cubi24 cubi24;
     static Cubi25 cubi25;
     
     
    static boolean stop=false;
     
    
     // alle
    
     static boolean showCubi0=true;
     static boolean showCubi1=true;
     static boolean showCubi2=true;
     static boolean showCubi3=true;
     static boolean showCubi4=true;
     static boolean showCubi5=true;
     static boolean showCubi6=true;
     static boolean showCubi7=true;
     static boolean showCubi8=true;
     static boolean showCubi9=true;
     static boolean showCubi10=true;
     static boolean showCubi11=true;
     static boolean showCubi12=true;
     static boolean showCubi13=true;
     static boolean showCubi14=true;
     static boolean showCubi15=true;
     static boolean showCubi16=true;
     static boolean showCubi17=true;
     static boolean showCubi18=true;
     static boolean showCubi19=true;
     static boolean showCubi20=true;
     static boolean showCubi21=true;
     static boolean showCubi22=true;
     static boolean showCubi23=true;
     static boolean showCubi24=true;
     static boolean showCubi25=true;
  
    
     //Kanten
   /*
     static boolean showCubi0=false;
     static boolean showCubi1=true;
     static boolean showCubi2=false;
     static boolean showCubi3=true;
     static boolean showCubi4=false;
     static boolean showCubi5=true;
     static boolean showCubi6=false;
     static boolean showCubi7=true;
     static boolean showCubi8=true;
     static boolean showCubi9=false;
     static boolean showCubi10=true;
     static boolean showCubi11=false;
     static boolean showCubi12=true;
     static boolean showCubi13=false;
     static boolean showCubi14=true;
     static boolean showCubi15=false;
     static boolean showCubi16=false;
     static boolean showCubi17=true;
     static boolean showCubi18=false;
     static boolean showCubi19=true;
     static boolean showCubi20=false;
     static boolean showCubi21=true;
     static boolean showCubi22=false;
     static boolean showCubi23=true;
     static boolean showCubi24=false;
     static boolean showCubi25=false;
  */
    //Ecken 
  /*
     static boolean showCubi0=true;
     static boolean showCubi1=false;
     static boolean showCubi2=true;
     static boolean showCubi3=false;
     static boolean showCubi4=true;
     static boolean showCubi5=false;
     static boolean showCubi6=true;
     static boolean showCubi7=false;
     static boolean showCubi8=false;
     static boolean showCubi9=false;
     static boolean showCubi10=false;
     static boolean showCubi11=false;
     static boolean showCubi12=false;
     static boolean showCubi13=false;
     static boolean showCubi14=false;
     static boolean showCubi15=false;
     static boolean showCubi16=true;
     static boolean showCubi17=false;
     static boolean showCubi18=true;
     static boolean showCubi19=false;
     static boolean showCubi20=true;
     static boolean showCubi21=false;
     static boolean showCubi22=true;
     static boolean showCubi23=false;
     static boolean showCubi24=false;
     static boolean showCubi25=false;
   */  
     //Achsen
     /*
     static boolean showCubi0=false;
     static boolean showCubi1=false;
     static boolean showCubi2=false;
     static boolean showCubi3=false;
     static boolean showCubi4=false;
     static boolean showCubi5=false;
     static boolean showCubi6=false;
     static boolean showCubi7=false;
     static boolean showCubi8=false;
     static boolean showCubi9=false;
     static boolean showCubi10=false;
     static boolean showCubi11=true;
     static boolean showCubi12=false;
     static boolean showCubi13=true;
     static boolean showCubi14=false;
     static boolean showCubi15=true;
     static boolean showCubi16=false;
     static boolean showCubi17=false;
     static boolean showCubi18=false;
     static boolean showCubi19=false;
     static boolean showCubi20=false;
     static boolean showCubi21=false;
     static boolean showCubi22=false;
     static boolean showCubi23=false;
     static boolean showCubi24=true;
     static boolean showCubi25=true;
   */
     
   /*
     static boolean showCubi0=false;
     static boolean showCubi1=false;
     static boolean showCubi2=false;
   
     static boolean showCubi3=false;
     
     static boolean showCubi4=false;
     static boolean showCubi5=false;
     static boolean showCubi6=false;
     static boolean showCubi7=false;
     static boolean showCubi8=false;
     static boolean showCubi9=false;
     static boolean showCubi10=false;
     static boolean showCubi11=false;
     static boolean showCubi12=false;
     static boolean showCubi13=false;
     static boolean showCubi14=false;
     static boolean showCubi15=false;
     static boolean showCubi16=false;
     static boolean showCubi17=false;
     static boolean showCubi18=false;
     static boolean showCubi19=false;
     static boolean showCubi20=false;
     static boolean showCubi21=false;
     static boolean showCubi22=false;
     static boolean showCubi23=false;
     static boolean showCubi24=false;
     static boolean showCubi25=false;
     */
      
    SimpleUniverse u=null ;//=new SimpleUniverse();
    BranchGroup scene = null;
    //für Kordinatensystem
    static BranchGroup sceneBranchGroup = null;
    static BranchGroup cubi0BranchGroup = null;
    static BranchGroup cubi1BranchGroup = null;
    static BranchGroup cubi2BranchGroup = null;
    static BranchGroup cubi3BranchGroup = null;
    static BranchGroup cubi4BranchGroup = null;
    static BranchGroup cubi5BranchGroup = null;
    static BranchGroup cubi6BranchGroup = null;
    static BranchGroup cubi7BranchGroup = null;
    static BranchGroup cubi8BranchGroup = null;
    static BranchGroup cubi9BranchGroup = null;
    static BranchGroup cubi10BranchGroup = null;
    static BranchGroup cubi11BranchGroup = null;
    static BranchGroup cubi12BranchGroup = null;
    static BranchGroup cubi13BranchGroup = null;
    static BranchGroup cubi14BranchGroup = null;
    static BranchGroup cubi15BranchGroup = null;  
    static BranchGroup cubi16BranchGroup = null;
    static BranchGroup cubi17BranchGroup = null;
    static BranchGroup cubi18BranchGroup = null;
    static BranchGroup cubi19BranchGroup = null;
    static BranchGroup cubi20BranchGroup = null;
    static BranchGroup cubi21BranchGroup = null;
    static BranchGroup cubi22BranchGroup = null;
    static BranchGroup cubi23BranchGroup = null;
    static BranchGroup cubi24BranchGroup = null;
    static BranchGroup cubi25BranchGroup = null;
    
    TransformGroup objTransform=null;
    
   // Transform3D transformation; befindet sich im Augenblick in createSceneGraph
    //für Kordinatensystem
    
   //static TransformGroup group = new TransformGroup();
    
    static TransformGroup  plainU = new TransformGroup();
    static TransformGroup  plainD = new TransformGroup();
    static TransformGroup  plainL = new TransformGroup();
    static TransformGroup  plainR = new TransformGroup();
    static TransformGroup  plainF = new TransformGroup();
    static TransformGroup  plainB = new TransformGroup();
     
     
    
    
     static Alpha Ualpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator URotationInterpolator=createURotationInterpolator(Ualpha, plainU,0f,0f);
     
     static Alpha ualpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator uRotationInterpolator=createuRotationInterpolator(ualpha, plainU,0f,0f);
     
     static Alpha Dalpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator DRotationInterpolator=createDRotationInterpolator(Dalpha, plainD,0f,0f);
     
     static Alpha dalpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator dRotationInterpolator=createdRotationInterpolator(dalpha, plainD,0f,0f);
     
    static Alpha Lalpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator LRotationInterpolator=createLRotationInterpolator(Lalpha, plainL ,0f,0f);
    
    static Alpha lalpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator lRotationInterpolator=createlRotationInterpolator(lalpha, plainL ,0f,0f);
     
     static Alpha Ralpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator RRotationInterpolator=createRRotationInterpolator(Ralpha, plainR ,0f,0f);
    
    static Alpha ralpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator rRotationInterpolator=createrRotationInterpolator(ralpha, plainR ,0f,0f);
     
     static Alpha Falpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
     static RotationInterpolator FRotationInterpolator=createFRotationInterpolator(Falpha, plainF ,0f,0f);
    
    static Alpha falpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
    static RotationInterpolator fRotationInterpolator=createfRotationInterpolator(falpha, plainF ,0f,0f);
    
    static Alpha Balpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
    static RotationInterpolator BRotationInterpolator=createBRotationInterpolator(Balpha, plainB ,0f,0f);
    
    static Alpha balpha = new Alpha(1, Alpha.INCREASING_ENABLE,0, 0, milis, 0, 0, 0, 0, 0);
    static RotationInterpolator bRotationInterpolator=createbRotationInterpolator(balpha, plainB ,0f,0f);
    
   
     
     
 
    
   static public RotationInterpolator createURotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotY(Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
  static public RotationInterpolator createuRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotY(Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
    static  public RotationInterpolator createDRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotY(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
  static  public RotationInterpolator createdRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotY(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
     
   static public RotationInterpolator createLRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotX(Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
  static public RotationInterpolator createlRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotX(Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
   static public RotationInterpolator createRRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotX(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
   static public RotationInterpolator createrRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotX(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
    static public RotationInterpolator createFRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotZ(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
  static public RotationInterpolator createfRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotZ(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
  
    
  static  public RotationInterpolator createBRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotZ(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
    
  static  public RotationInterpolator createbRotationInterpolator(Alpha alpha,TransformGroup group,float startangle,float stopangle)
  {Transform3D transform = new Transform3D();
   transform.rotZ(-Math.PI/2.0d);
   RotationInterpolator r = new RotationInterpolator(alpha, group, transform, startangle, stopangle );
   r.setSchedulingBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
   return r;
    }
 
   static public void showCubisVisible()
    { System.out.println("showCubi0="+showCubi0);
      System.out.println("showCubi1="+showCubi1);
      System.out.println("showCubi2="+showCubi2);
      System.out.println("showCubi3="+showCubi3);
      System.out.println("showCubi4="+showCubi4);
      System.out.println("showCubi5="+showCubi5);
      System.out.println("showCubi6="+showCubi6);
      System.out.println("showCubi7="+showCubi7);
      System.out.println("showCubi8="+showCubi8);
      System.out.println("showCubi9="+showCubi9);
      System.out.println("showCubi10="+showCubi10);
      System.out.println("showCubi11="+showCubi11);
      System.out.println("showCubi12="+showCubi12);
      System.out.println("showCubi13="+showCubi13);
      System.out.println("showCubi14="+showCubi14);
      System.out.println("showCubi15="+showCubi15);      
      System.out.println("showCubi16="+showCubi16);
      System.out.println("showCubi17="+showCubi17);
      System.out.println("showCubi18="+showCubi18);
      System.out.println("showCubi19="+showCubi19);
      System.out.println("showCubi20="+showCubi20);
      System.out.println("showCubi21="+showCubi21);
      System.out.println("showCubi22="+showCubi22);
      System.out.println("showCubi23="+showCubi23);
      System.out.println("showCubi24="+showCubi24);
      System.out.println("showCubi25="+showCubi25);
    } 
     public boolean axesReady()
    {boolean value=false;
    int cubi9place =this.cubi9.getPlace();
    int cubi9id=this.cubi9.getId();
    int cubi13place =this.cubi13.getPlace();
    int cubi13id=this.cubi13.getId();   
  	int cubi25place =this.cubi25.getPlace();
    int cubi25id=this.cubi25.getId();
         value=(cubi9place==9&&cubi9id==1) &&
               (cubi13place==13&&cubi13id==5) &&
               (cubi25place==25&&cubi25id==25);
               return value;
    }
   public boolean whiteCrossReady()
    {boolean value=false;
     int place16 =this.cubi16.getPlace();
     int id16=this.cubi16.getId();
     int place18 =this.cubi18.getPlace();
     int id18=this.cubi18.getId();
     int place20 =this.cubi20.getPlace();
     int id20=this.cubi20.getId();
     int place22 =this.cubi22.getPlace();
     int id22=this.cubi22.getId();
   	
     int place17 =this.cubi17.getPlace();
     int id17=this.cubi17.getId();
     int place19 =this.cubi19.getPlace();
     int id19=this.cubi19.getId();
     int place21 =this.cubi21.getPlace();
     int id21=this.cubi21.getId();
     int place23 =this.cubi23.getPlace();
     int id23=this.cubi23.getId();    
     value= (place17==17&&id17==25) &&
            (place19==19&&id19==27) &&
            (place21==21&&id21==29) &&
            (place23==23&&id23==31) ;
         return value;
    }
    
    public boolean upCornersReady()
    {boolean value=false;
     int place16 =this.cubi16.getPlace();
     int id16=this.cubi16.getId();
     int place18 =this.cubi18.getPlace();
     int id18=this.cubi18.getId();
     int place20 =this.cubi20.getPlace();
     int id20=this.cubi20.getId();
     int place22 =this.cubi22.getPlace();
     int id22=this.cubi22.getId();                 
     value= (place16==16&&id16==24) &&
            (place18==18&&id18==26) &&
            (place20==20&&id20==28) &&
            (place22==22&&id22==30) ;           
         return value;
    }
    
   public boolean middlePlainReady()
    {int place8 =this.cubi8.getPlace();
     int id8=this.cubi8.getId();
     int place10 =this.cubi10.getPlace();
     int id10=this.cubi10.getId();
     int place12 =this.cubi12.getPlace();
     int id12=this.cubi12.getId();
     int place14 =this.cubi14.getPlace();
     int id14=this.cubi14.getId();
     
     int place9 =this.cubi9.getPlace();
     int id9=this.cubi9.getId();
     int place11 =this.cubi11.getPlace();
     int id11=this.cubi11.getId();
     int place13 =this.cubi13.getPlace();
     int id13=this.cubi13.getId();
     int place15 =this.cubi15.getPlace();
     int id15=this.cubi15.getId();
          
    return 	(place8==8&&id8==0) &&
       (place10==10&&id10==2) &&
       (place12==12&&id12==4) &&
       (place14==14&&id14==6) &&
       (place9==9&&id9==1) &&
       (place11==11&&id11==3) &&
       (place13==13&&id13==5) &&
       (place15==15&&id15==7) ;          	
    }
  public boolean yellowCrossReady()
    {boolean value=false;
     int place1 =this.cubi1.getPlace();
     int id1=this.cubi1.getId();
     int place3 =this.cubi3.getPlace();
     int id3=this.cubi3.getId();
     int place5 =this.cubi5.getPlace();
     int id5=this.cubi5.getId();
     int place7 =this.cubi7.getPlace();
     int id7=this.cubi7.getId();       
   	
    value=  (place1==1&&id1==1) &&
       		(place3==3&&id3==3) &&
       		(place5==5&&id5==5) &&
       		(place7==7&&id7==7) ;
          return value;
    }
    
 public boolean downPlainReady()
    {boolean value=false;
     int place0 =this.cubi0.getPlace();
     int id0=this.cubi0.getId();
     int place2 =this.cubi2.getPlace();
     int id2=this.cubi2.getId();
     int place4 =this.cubi4.getPlace();
     int id4=this.cubi4.getId();
     int place6 =this.cubi6.getPlace();
     int id6=this.cubi6.getId();
    	
     int place1 =this.cubi1.getPlace();
     int id1=this.cubi1.getId();
     int place3 =this.cubi3.getPlace();
     int id3=this.cubi3.getId();
     int place5 =this.cubi5.getPlace();
     int id5=this.cubi5.getId();
     int place7 =this.cubi7.getPlace();
     int id7=this.cubi7.getId();
              
     value= (place0==0&&id0==0) &&
            (place2==2&&id2==2) &&
            (place4==4&&id4==4) &&
            (place6==6&&id6==6) && // place6==14???
            (place1==1&&id1==1) &&
            (place3==3&&id3==3) &&
            (place5==5&&id5==5) &&
            (place7==7&&id7==7) ;        
         return value;
    }
    /**
     * Constructor for objects of class J3dFrame   0.0f, (float) Math.PI/2
     */
    
   public J3dFrame(String title)
    { 
      setBounds(520,340,480,480);
      setTitle(title);
      setLayout(new BorderLayout());
       //setLayout(null);
      WindowAdpt WAdapter=new WindowAdpt();
      this.addWindowListener(WAdapter);
      
     GraphicsConfiguration config =SimpleUniverse.getPreferredConfiguration();
     Canvas3D canvas3D = new Canvas3D(config);   
     u = new SimpleUniverse(canvas3D);
     //add("Center",canvas3D);
     add(canvas3D);
     sceneBranchGroup = new BranchGroup( );
     sceneBranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     sceneBranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     sceneBranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     sceneBranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     scene = createSceneGraph(sceneBranchGroup);
     u.getViewingPlatform().setNominalViewingTransform();
     //u.addBranchGraph(scene);
      
    { //to enable rotation
      plainU.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainU.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainU.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainU.setCapability( Group.ALLOW_CHILDREN_READ );
      plainU.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainU.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainD.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainD.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);       
      plainD.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainD.setCapability( Group.ALLOW_CHILDREN_READ );
      plainD.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainD.setCapability( BranchGroup.ALLOW_DETACH );
	 
      plainL.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainL.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainL.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainL.setCapability( Group.ALLOW_CHILDREN_READ );
      plainL.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainL.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainR.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainR.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainR.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainR.setCapability( Group.ALLOW_CHILDREN_READ );
      plainR.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainR.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainF.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainF.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainF.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainF.setCapability( Group.ALLOW_CHILDREN_READ );
      plainF.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainF.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainB.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainB.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainB.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainB.setCapability( Group.ALLOW_CHILDREN_READ );
      plainB.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainB.setCapability( BranchGroup.ALLOW_DETACH );
      
    }
   
    Koordinatensystem koordinatensystem=new Koordinatensystem();
    sceneBranchGroup.addChild(koordinatensystem);
      
    sceneBranchGroup.addChild(plainU);
    sceneBranchGroup.addChild(plainD);
   
    sceneBranchGroup.addChild(plainL);
    sceneBranchGroup.addChild(plainR);
    
    sceneBranchGroup.addChild(plainF);
    sceneBranchGroup.addChild(plainB);
    
     cubi0 = new Cubi0(cubi0BranchGroup,0,0,0,0.194);//nr=0,place=0,id=0, 
     cubi0BranchGroup=cubi0.getCubi0BranchGroup(cubi0BranchGroup,0,0,J3dFrame.cubi0.colors);
     cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
    
     cubi1 = new Cubi1(cubi1BranchGroup,1,0,0,0.194);//nr=1,place=1,id=1,     
     cubi1BranchGroup=cubi1.getCubi1BranchGroup(cubi1BranchGroup,1,1,J3dFrame.cubi1.colors);//id=1,place=1
     cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi2 = new Cubi2(cubi2BranchGroup,2,0,0,0.194);//nr=2,place=2,id=2     
     cubi2BranchGroup=cubi2.getCubi2BranchGroup(cubi2BranchGroup,2,2,J3dFrame.cubi2.colors);//id=2,place=2
     cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
    
     cubi3 = new Cubi3(cubi3BranchGroup,3,0,0,0.194); //nr=3,place=3,id=3   
     cubi3BranchGroup=cubi3.getCubi3BranchGroup(cubi3BranchGroup,3,3,J3dFrame.cubi3.colors);//id=3,place=3
     cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH ); 
     
     cubi4 = new Cubi4(cubi4BranchGroup,4,0,0,0.194); //nr=4,place=4,id=4
     cubi4BranchGroup=cubi4.getCubi4BranchGroup(cubi4BranchGroup,4,4,J3dFrame.cubi4.colors);//id=4,place=4,
     cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi5 = new Cubi5(cubi5BranchGroup,5,0,0,0.194);//nr=5,place=5,id=5 
     cubi5BranchGroup=cubi5.getCubi5BranchGroup(cubi5BranchGroup,5,5,J3dFrame.cubi5.colors);//id=5,place=5,
     cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
    
     cubi6 = new Cubi6(cubi6BranchGroup,6,0,0,0.194);//nr=6,place=6,id=6
     cubi6BranchGroup=cubi6.getCubi6BranchGroup(cubi6BranchGroup,6,6,J3dFrame.cubi6.colors);//id=6,place=6,
     cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
      
     cubi7 = new Cubi7(cubi7BranchGroup,7,0,0,0.194);//nr=7,place=7,id=7
     cubi7BranchGroup=cubi7.getCubi7BranchGroup(cubi7BranchGroup,7,7,J3dFrame.cubi7.colors);//id=7,place=7,
     cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi8 = new Cubi8(cubi8BranchGroup,8,0,0,0.194);//nr=8,place=8,id=0, 
     cubi8BranchGroup=cubi8.getCubi8BranchGroup(cubi8BranchGroup,8,0,J3dFrame.cubi8.colors);//
     cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi9 = new Cubi9(cubi9BranchGroup,9,0,0,0.194);//nr=9,place=9,id=1, 
     cubi9BranchGroup=cubi9.getCubi9BranchGroup(cubi9BranchGroup,9,1,J3dFrame.cubi9.colors);//
     cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi10 = new Cubi10(cubi10BranchGroup,10,0,0,0.194);//nr=10,place=10,id=2, 
     cubi10BranchGroup=cubi10.getCubi10BranchGroup(cubi10BranchGroup,10,2,J3dFrame.cubi10.colors);//
     cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi11 = new Cubi11(cubi11BranchGroup,11,0,0,0.194);//nr=11,place=11,id=3, 
     cubi11BranchGroup=cubi11.getCubi11BranchGroup(cubi11BranchGroup,11,3,J3dFrame.cubi11.colors);//
     cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi12 = new Cubi12(cubi12BranchGroup,12,0,0,0.194);//nr=12,place=12,id=4, 
     cubi12BranchGroup=cubi12.getCubi12BranchGroup(cubi12BranchGroup,12,4,J3dFrame.cubi12.colors);//
     cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi13 = new Cubi13(cubi13BranchGroup,13,0,0,0.194);//nr=13,place=13,id=5, 
     cubi13BranchGroup=cubi13.getCubi13BranchGroup(cubi13BranchGroup,13,5,J3dFrame.cubi13.colors);//
     cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi14 = new Cubi14(cubi14BranchGroup,14,0,0,0.194);//nr=14,place=14,id=6, 
     cubi14BranchGroup=cubi14.getCubi14BranchGroup(cubi14BranchGroup,14,6,J3dFrame.cubi14.colors);//
     cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
 
     cubi15 = new Cubi15(cubi15BranchGroup,15,0,0,0.194);//nr=15,place=15,id=7, 
     cubi15BranchGroup=cubi15.getCubi15BranchGroup(cubi15BranchGroup,15,7,J3dFrame.cubi15.colors);//
     cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
               
     cubi16 = new Cubi16(cubi16BranchGroup,16,0,0,0.194);//nr=16,place=16,id=24, 
     cubi16BranchGroup=cubi16.getCubi16BranchGroup(cubi16BranchGroup,16,24,J3dFrame.cubi16.colors);//
     cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi17 = new Cubi17(cubi17BranchGroup,17,0,0,0.194);//nr=17,place=17,id=25, 
     cubi17BranchGroup=cubi17.getCubi17BranchGroup(cubi17BranchGroup,17,25,J3dFrame.cubi17.colors);//
     cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi18 = new Cubi18(cubi18BranchGroup,18,0,0,0.194);//nr=18,place=18,id=26, 
     cubi18BranchGroup=cubi18.getCubi18BranchGroup(cubi18BranchGroup,18,26,J3dFrame.cubi18.colors);//
     cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi19 = new Cubi19(cubi19BranchGroup,19,0,0,0.194);//nr=19,place=19,id=27, 
     cubi19BranchGroup=cubi19.getCubi19BranchGroup(cubi19BranchGroup,19,27,J3dFrame.cubi19.colors);//
     cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi20 = new Cubi20(cubi20BranchGroup,20,0,0,0.194);//nr=20,place=20,id=28, 
     cubi20BranchGroup=cubi20.getCubi20BranchGroup(cubi20BranchGroup,20,28,J3dFrame.cubi20.colors);//
     cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi21 = new Cubi21(cubi21BranchGroup,21,0,0,0.194);//nr=21,place=21,id=29, 
     cubi21BranchGroup=cubi21.getCubi21BranchGroup(cubi21BranchGroup,21,29,J3dFrame.cubi21.colors);//
     cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi22 = new Cubi22(cubi22BranchGroup,22,0,0,0.194);//nr=22,place=22,id=30, 
     cubi22BranchGroup=cubi22.getCubi22BranchGroup(cubi22BranchGroup,22,30,J3dFrame.cubi22.colors);//
     cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi23 = new Cubi23(cubi23BranchGroup,23,0,0,0.194);//nr=23,place=23,id=31, 
     cubi23BranchGroup=cubi23.getCubi23BranchGroup(cubi23BranchGroup,23,31,J3dFrame.cubi23.colors);//
     cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi24 = new Cubi24(cubi24BranchGroup,24,0,0,0.194);//nr=24,place=24,id=0, 
     cubi24BranchGroup=cubi24.getCubi24BranchGroup(cubi24BranchGroup,24,0,J3dFrame.cubi24.colors);//
     cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi25 = new Cubi25(cubi25BranchGroup,25,0,0,0.194);//nr=25,place=25,id=25, 
     cubi25BranchGroup=cubi25.getCubi25BranchGroup(cubi25BranchGroup,25,25,J3dFrame.cubi25.colors);//
     cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi25BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     
     
     if(J3dFrame.showCubi0) sceneBranchGroup.addChild(cubi0BranchGroup);
     if(J3dFrame.showCubi1) sceneBranchGroup.addChild(cubi1BranchGroup);
     if(J3dFrame.showCubi2) sceneBranchGroup.addChild(cubi2BranchGroup);
     if(J3dFrame.showCubi3) sceneBranchGroup.addChild(cubi3BranchGroup);
     if(J3dFrame.showCubi4) sceneBranchGroup.addChild(cubi4BranchGroup);
     if(J3dFrame.showCubi5) sceneBranchGroup.addChild(cubi5BranchGroup);
     if(J3dFrame.showCubi6) sceneBranchGroup.addChild(cubi6BranchGroup);
     if(J3dFrame.showCubi7) sceneBranchGroup.addChild(cubi7BranchGroup);
     if(J3dFrame.showCubi8) sceneBranchGroup.addChild(cubi8BranchGroup);
     if(J3dFrame.showCubi9) sceneBranchGroup.addChild(cubi9BranchGroup);
     if(J3dFrame.showCubi10) sceneBranchGroup.addChild(cubi10BranchGroup);
     if(J3dFrame.showCubi11) sceneBranchGroup.addChild(cubi11BranchGroup);
     if(J3dFrame.showCubi12) sceneBranchGroup.addChild(cubi12BranchGroup);
     if(J3dFrame.showCubi13) sceneBranchGroup.addChild(cubi13BranchGroup);
     if(J3dFrame.showCubi14) sceneBranchGroup.addChild(cubi14BranchGroup);
     if(J3dFrame.showCubi15) sceneBranchGroup.addChild(cubi15BranchGroup);     
     if(J3dFrame.showCubi16) sceneBranchGroup.addChild(cubi16BranchGroup);
     if(J3dFrame.showCubi17) sceneBranchGroup.addChild(cubi17BranchGroup);
     if(J3dFrame.showCubi18) sceneBranchGroup.addChild(cubi18BranchGroup);
     if(J3dFrame.showCubi19) sceneBranchGroup.addChild(cubi19BranchGroup);
     if(J3dFrame.showCubi20) sceneBranchGroup.addChild(cubi20BranchGroup);
     if(J3dFrame.showCubi21) sceneBranchGroup.addChild(cubi21BranchGroup);
     if(J3dFrame.showCubi22) sceneBranchGroup.addChild(cubi22BranchGroup);
     if(J3dFrame.showCubi23) sceneBranchGroup.addChild(cubi23BranchGroup);
     if(J3dFrame.showCubi24) sceneBranchGroup.addChild(cubi24BranchGroup);
     if(J3dFrame.showCubi25) sceneBranchGroup.addChild(cubi25BranchGroup);
     
    
    plainU.addChild(URotationInterpolator);
    plainU.addChild(uRotationInterpolator);
     
    plainD.addChild(DRotationInterpolator);
    plainD.addChild(dRotationInterpolator);
   
    plainF.addChild(FRotationInterpolator);
    plainF.addChild(fRotationInterpolator);
   
    plainB.addChild(BRotationInterpolator);
    plainB.addChild(bRotationInterpolator);
  
    plainL.addChild(LRotationInterpolator);
    plainL.addChild(lRotationInterpolator);
   
    plainR.addChild(RRotationInterpolator);
    plainR.addChild(rRotationInterpolator);
    
    
    u.addBranchGraph(scene);
    setVisible(true);
    }
    
  public BranchGroup createSceneGraph(BranchGroup sceneBranchGroup)
    {  BranchGroup objRoot = new BranchGroup();
     
    objRoot.setCapability(BranchGroup.ALLOW_DETACH);
    
    //Transformationsinfos generieren
        Transform3D rot_X = new Transform3D();
        Transform3D rot_Y = new Transform3D();
        Transform3D rot_Z = new Transform3D();
  
      //Rotationsansicht, fuer Erstdarstellung
      
        rot_X.rotX(Math.PI/8.0d);
        rot_Y.rotY(-Math.PI/4.0d);
        rot_Z.rotZ(-Math.PI/8.0d);
        
        Transform3D transformation;
        // Transform3D für objTransform
        transformation = new Transform3D();
        transformation.rotY(-Math.PI/4.0d);
        transformation.mul(rot_Z);
        transformation.mul(rot_X);
        // Meine Tests
       
        // meine Tests Ende
   //Verschiebung
       Vector3d eta = new Vector3d(-0.7 ,-0.7 ,-0.7);//0.5
       Transform3D t1 = new Transform3D();
       t1.setTranslation(eta) ;
       transformation.mul(t1);
  //erzeuge einen Transform GruppenKnoten
  //System.out.println("transformation:"+transformation.toString());
         objTransform = new TransformGroup(transformation);

        //Erlaubt das Transformieren des Objektes, f�r Maus
	  objTransform.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
	  //objTransform.clearCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
	  objTransform.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);

// Maus kann mit 1.Button Objekte rotieren lassen
		MouseRotate myMouseRotate=new MouseRotate();
		myMouseRotate.setTransformGroup(objTransform);
		myMouseRotate.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(myMouseRotate);

		MouseTranslate myMouseTranslate = new MouseTranslate();
		myMouseTranslate.setTransformGroup(objTransform);
		myMouseTranslate.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(myMouseTranslate);

		MouseZoom myMouseZoom = new MouseZoom();
		myMouseZoom.setTransformGroup(objTransform);
		myMouseZoom.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(myMouseZoom);
	
	
      
      //       Define colors
        Color3f white = new Color3f(1.0f, 1.0f, 1.0f);
        Color3f black = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f red   = new Color3f(0.80f, 0.20f, 0.2f);
        Color3f blue   = new Color3f(0.20f, 0.20f, 0.8f);
        Color3f green   = new Color3f(0.20f, 0.80f, 0.2f);
        Color3f ambientRed = new Color3f(0.2f, 0.05f, 0.0f);
        Color3f ambientBlue = new Color3f(0.0f, 0.05f, 0.2f);
        Color3f ambientGreen = new Color3f(0.0f, 0.2f, 0.05f);
        Color3f ambient = new Color3f(0.3f, 0.3f, 0.3f);
        Color3f diffuse = new Color3f(0.7f, 0.7f, 0.7f);
        Color3f specular = new Color3f(0.7f, 0.7f, 0.7f);
        
       // Create the bounding leaf node
          BoundingSphere bounds =
	  new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
	  BoundingLeaf boundingLeaf = new BoundingLeaf(bounds);
	  objRoot.addChild(boundingLeaf);
	 
      // Create the ambient light
      AmbientLight ambLight = new AmbientLight();
      ambLight.setInfluencingBounds(bounds);
      objRoot.addChild(ambLight);

      // Create the directional light
      Vector3f dir1 = new Vector3f(0.0f, 0.0f, -1.0f);
      DirectionalLight dirLight1 = new DirectionalLight(white, dir1);
      dirLight1.setInfluencingBounds(bounds);
      objRoot.addChild(dirLight1);
      
     /*Vector3f dir2 = new Vector3f(0.0f, 0.0f, 1.0f);
      DirectionalLight dirLight2 = new DirectionalLight(white, dir2);
      dirLight2.setInfluencingBounds(bounds);
      objRoot.addChild(dirLight2);*/
      
    
    //Background
     Background background = new Background(0.98f, 0.96f, 0.9f);
     background.setApplicationBounds(new BoundingSphere());
     objRoot.addChild(background);
       //Koordinantensystem
      //objTransform.addChild(new Koordinatensystem()); //<____________________------------
      
      //sceneBranchGroup = new BranchGroup( );//<------------------

		// allow the BranchGroup to have children added at runtime 
		sceneBranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
		sceneBranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
		sceneBranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
		sceneBranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
		// Mein Test
		
                
                //
		objTransform.addChild(sceneBranchGroup);
	        objRoot.addChild(objTransform);
      //objRoot.compile();
    return objRoot;
    }
    

     class WindowAdpt extends java.awt.event.WindowAdapter
        {
        public void windowClosing(java.awt.event.WindowEvent event)
       {
       //setVisible(false); 
       //dispose();
       }
    }
}
