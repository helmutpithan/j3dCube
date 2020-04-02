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
 * @author (your name)
 * @version (a version number or a date)
 */
public class J3dFrame extends  Frame
{static long milis =150;
 static int zuege=0;
	
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
     
     static boolean showCubi0=true;
     static boolean showCubi1=true;
     static boolean showCubi2=true;
     static boolean showCubi3=true;
     static boolean showCubi4=true;
     static boolean showCubi5=true;
     static boolean showCubi6=true;
     static boolean showCubi7=true;
    
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
    } 
    /**
     * Constructor for objects of class J3dFrame   0.0f, (float) Math.PI/2
     */
    
    /**
     * Constructor for objects of class J3dFrame
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
      plainU.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainU.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainD.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainD.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);       
      plainD.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainD.setCapability( Group.ALLOW_CHILDREN_READ );
      plainD.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainD.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainD.setCapability( BranchGroup.ALLOW_DETACH );
	 
      plainL.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainL.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainL.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainL.setCapability( Group.ALLOW_CHILDREN_READ );
      plainL.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainL.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainL.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainR.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainR.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainR.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainR.setCapability( Group.ALLOW_CHILDREN_READ );
      plainR.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainR.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainR.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainF.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainF.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainF.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainF.setCapability( Group.ALLOW_CHILDREN_READ );
      plainF.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainF.setCapability( Group.ALLOW_CHILDREN_WRITE );
      plainF.setCapability( BranchGroup.ALLOW_DETACH );
      
      plainB.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      plainB.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
      plainB.setCapability( Group.ALLOW_CHILDREN_EXTEND );
      plainB.setCapability( Group.ALLOW_CHILDREN_READ );
      plainB.setCapability( Group.ALLOW_CHILDREN_WRITE );
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
    
    
    //public Cubi0(int nr,int id,int place,int position,double paramDouble)
   
     cubi0 = new Cubi0(cubi0BranchGroup,0,0,0,0.194);//nr=0,place=0,id=0, 
     cubi0BranchGroup=cubi0.getCubi0BranchGroup(cubi0BranchGroup,0,0,J3dFrame.cubi0.colors);
     cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
    
     cubi1 = new Cubi1(cubi1BranchGroup,1,0,0,0.194);//nr=1,id=0,place=0,     
     cubi1BranchGroup=cubi1.getCubi1BranchGroup(cubi1BranchGroup,1,1,J3dFrame.cubi1.colors);//id=1,place=1
     cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi2 = new Cubi2(cubi2BranchGroup,2,0,0,0.194);//nr=2     
     cubi2BranchGroup=cubi2.getCubi2BranchGroup(cubi2BranchGroup,2,2,J3dFrame.cubi2.colors);//id=2,place=2
     cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi3 = new Cubi3(cubi3BranchGroup,3,0,0,0.194);    
     cubi3BranchGroup=cubi3.getCubi3BranchGroup(cubi3BranchGroup,3,3,J3dFrame.cubi3.colors);//id=3,place=3
     cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH ); 
     
     cubi4 = new Cubi4(cubi4BranchGroup,4,0,0,0.194); 
     cubi4BranchGroup=cubi4.getCubi4BranchGroup(cubi4BranchGroup,4,12,J3dFrame.cubi4.colors);//id=4,place=4,
     cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi5 = new Cubi5(cubi5BranchGroup,5,0,0,0.194); 
     cubi5BranchGroup=cubi5.getCubi5BranchGroup(cubi5BranchGroup,5,13,J3dFrame.cubi5.colors);//id=5,place=5,
     cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     cubi6 = new Cubi6(cubi6BranchGroup,6,0,0,0.194);
     cubi6BranchGroup=cubi6.getCubi6BranchGroup(cubi6BranchGroup,6,14,J3dFrame.cubi6.colors);//id=6,place=6,
     cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     
     cubi7 = new Cubi7(cubi7BranchGroup,7,0,0,0.194);
     cubi7BranchGroup=cubi7.getCubi7BranchGroup(cubi7BranchGroup,7,15,J3dFrame.cubi7.colors);//id=7,place=7,
     cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
     cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
     cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
     cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
     
     if(J3dFrame.showCubi0) sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup);
     if(J3dFrame.showCubi1) sceneBranchGroup.addChild(cubi1BranchGroup);
     if(J3dFrame.showCubi2) sceneBranchGroup.addChild(cubi2BranchGroup);
     if(J3dFrame.showCubi3) sceneBranchGroup.addChild(cubi3BranchGroup);
     if(J3dFrame.showCubi4) sceneBranchGroup.addChild(cubi4BranchGroup);
     if(J3dFrame.showCubi5) sceneBranchGroup.addChild(cubi5BranchGroup);
     if(J3dFrame.showCubi6) sceneBranchGroup.addChild(cubi6BranchGroup);
     if(J3dFrame.showCubi7) sceneBranchGroup.addChild(cubi7BranchGroup);
     
    
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
       Vector3d eta = new Vector3d(-0.5 ,-0.5 ,-0.5);
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
