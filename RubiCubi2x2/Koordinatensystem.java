import java.awt.*;
import java.awt.event.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import javax.media.j3d.GeometryStripArray.*;
import java.awt.event.*;
/**
 * Write a description of class Koordinatensystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Koordinatensystem extends BranchGroup
{   double k1min=-5;
    double k1max=5;
    double k2min=-5;
    double k2max=5;
    double k3min=-5;
    double k3max=5;
    double xyEinheit=1;
    double zEinheit=1;
  
    TransformGroup TGK = new TransformGroup();
    
    public Koordinatensystem(double k1min,double k1max,double k2min,double k2max,double k3min,double k3max,double xyEinheit,double zEinheit)
    {   this.k1min=k1min;
	    this.k1max=k1max;
	    this.k2min=k2min;
	    this.k2max=k2max;
	    this.k3min=k3min;
	    this.k3max=k3max;
	    this.xyEinheit=xyEinheit;
	    this.zEinheit=zEinheit;
      TGK.addChild(xText());
      TGK.addChild(xAchse());
      TGK.addChild(yText());
      TGK.addChild(yAchse());
      TGK.addChild(zText());
      TGK.addChild(zAchse());
      TGK.addChild(xyGitternetz());
      TGK.addChild(xzGitternetz());
      TGK.addChild(yzGitternetz());
      this.setCapability( BranchGroup.ALLOW_DETACH );
      this.addChild(TGK);
      this.setUserData( "Koordinatensystem" );
    }
     public Koordinatensystem()
    {   
      TGK.addChild(xText());
      TGK.addChild(xAchse());
      TGK.addChild(yText());
      TGK.addChild(yAchse());
      TGK.addChild(zText());
      TGK.addChild(zAchse());
      TGK.addChild(xyGitternetz());
      TGK.addChild(xzGitternetz());
      TGK.addChild(yzGitternetz());
      this.setCapability( BranchGroup.ALLOW_DETACH );
      this.addChild(TGK);
      this.setUserData( "Koordinatensystem" );
    }
    
    TransformGroup zText()
     { TransformGroup TG5 = new TransformGroup();
       Font3D f3d = new Font3D(new Font("Helvetica", Font.PLAIN, 1), new FontExtrusion());
       Text3D text = new Text3D(f3d, "z"/*+10*zEinheit*/, new Point3f(1.0f, 21.0f, 0.0f)) ;
       text.setCapability(Geometry.ALLOW_INTERSECT);
       text.setCapability(Text3D.ALLOW_STRING_READ);
       Appearance app=new Appearance();
       app.setColoringAttributes(new ColoringAttributes(new Color3f(Color.RED), ColoringAttributes.NICEST));  
       Transform3D skal = new Transform3D();
       skal.setScale(0.05);
       TransformGroup stext3d = new TransformGroup(skal);
       Shape3D sph = new Shape3D(text,app);
       stext3d.addChild(sph);
       TG5.addChild(stext3d);
      // objTransform.addChild(TG5);
       return TG5;
        }

      TransformGroup yText()
     { TransformGroup TG5 = new TransformGroup();
       Font3D f3d = new Font3D(new Font("Helvetica", Font.PLAIN, 1), new FontExtrusion());
       Text3D text = new Text3D(f3d, "y"/*+10*xyEinheit*/, new Point3f(21.0f, 1.0f, 0.0f)) ;
       text.setCapability(Geometry.ALLOW_INTERSECT);
       text.setCapability(Text3D.ALLOW_STRING_READ);
       Appearance app=new Appearance();
       app.setColoringAttributes(new ColoringAttributes(new Color3f(Color.RED), ColoringAttributes.NICEST));  
       Transform3D skal = new Transform3D();
       skal.setScale(0.05);
       TransformGroup stext3d = new TransformGroup(skal);
       Shape3D sph = new Shape3D(text,app);
       stext3d.addChild(sph);
       TG5.addChild(stext3d);
      // objTransform.addChild(TG5);
        return TG5;
        }
       TransformGroup xText()
     { TransformGroup TG5 = new TransformGroup();
       Font3D f3d = new Font3D(new Font("Helvetica", Font.PLAIN, 1), new FontExtrusion());
       Text3D text = new Text3D(f3d, "x"/*+10*xyEinheit*/, new Point3f(0f, 1.0f, 21.0f)) ;
       text.setCapability(Geometry.ALLOW_INTERSECT);
       text.setCapability(Text3D.ALLOW_STRING_READ);
       Appearance app=new Appearance();
       app.setColoringAttributes(new ColoringAttributes(new Color3f(Color.RED), ColoringAttributes.NICEST));  
       Transform3D skal = new Transform3D();
       skal.setScale(0.05);
       TransformGroup stext3d = new TransformGroup(skal);
       Shape3D sph = new Shape3D(text,app);
       stext3d.addChild(sph);
       TG5.addChild(stext3d);
       //objTransform.addChild(TG5);
        return TG5;
        }
    TransformGroup xyGitternetz() 
   {    TransformGroup objTransform=new TransformGroup();
       
        Appearance Gitter1Appearance = new Appearance();	 
	    //ColoringAttributes color1ca = new ColoringAttributes (new Color3f(Color.RED), ColoringAttributes.NICEST); 
	    ColoringAttributes color1ca = new ColoringAttributes (new Color3f(Color.GRAY), ColoringAttributes.NICEST); 
	    Gitter1Appearance.setColoringAttributes(color1ca);
        //TransparencyAttributes
        TransparencyAttributes ta = new TransparencyAttributes( );
        ta.setTransparency( 0.5f );
        ta.setTransparencyMode( TransparencyAttributes.BLENDED );
        Gitter1Appearance.setTransparencyAttributes( ta );
       for (int i=-10;i<11;i++)
       {
         TransformGroup TGxy = new TransformGroup();
         LineArray la=new LineArray(2, LineArray.COORDINATES);
         la.setCoordinate(0, new Point3f(i*0.1f,-1,0));
         la.setCoordinate(1, new Point3f(i*0.1f,1f,0f));
         TGxy.addChild(new Shape3D(la, Gitter1Appearance));
         objTransform.addChild(TGxy);
        }
       for (int i=-10;i<11;i++)
       {
         TransformGroup TGxy = new TransformGroup();
         LineArray la=new LineArray(2, LineArray.COORDINATES);
         la.setCoordinate(0, new Point3f(-1f,i*0.1f,0f));
         la.setCoordinate(1, new Point3f(1f,i*0.1f,0f));
        
         TGxy.addChild(new Shape3D(la,Gitter1Appearance));
        objTransform.addChild(TGxy);
        }
        return objTransform;
    }
    TransformGroup xzGitternetz() 
   {    TransformGroup objTransform=new TransformGroup();
       
        Appearance Gitter1Appearance = new Appearance();	 
	    //ColoringAttributes color1ca = new ColoringAttributes (new Color3f(Color.BLUE), ColoringAttributes.NICEST); 
	    ColoringAttributes color1ca = new ColoringAttributes (new Color3f(Color.GRAY), ColoringAttributes.NICEST); 
	    Gitter1Appearance.setColoringAttributes(color1ca);
        //TransparencyAttributes
        TransparencyAttributes ta = new TransparencyAttributes( );
        ta.setTransparency( 0.5f );
        ta.setTransparencyMode( TransparencyAttributes.BLENDED );
        Gitter1Appearance.setTransparencyAttributes( ta );
       for (int i=-10;i<11;i++)
       {
         TransformGroup TGxy = new TransformGroup();
         LineArray la=new LineArray(2, LineArray.COORDINATES);
         la.setCoordinate(0, new Point3f(i*0.1f,0,-1f));
         la.setCoordinate(1, new Point3f(i*0.1f,0f,1f));
         TGxy.addChild(new Shape3D(la, Gitter1Appearance));
         objTransform.addChild(TGxy);
        }
       for (int i=-10;i<11;i++)
       {
         TransformGroup TGxy = new TransformGroup();
         LineArray la=new LineArray(2, LineArray.COORDINATES);
         la.setCoordinate(0, new Point3f(-1f,0f,i*0.1f));
         la.setCoordinate(1, new Point3f(1f,0f,i*0.1f));
        
         TGxy.addChild(new Shape3D(la,Gitter1Appearance));
        objTransform.addChild(TGxy);
        }
      return objTransform;
    }
    TransformGroup yzGitternetz() 
   {    TransformGroup objTransform=new TransformGroup();
       
        Appearance Gitter1Appearance = new Appearance();	 
	    //ColoringAttributes color1ca = new ColoringAttributes (new Color3f(Color.GREEN), ColoringAttributes.NICEST); 
	    ColoringAttributes color1ca = new ColoringAttributes (new Color3f(Color.GRAY), ColoringAttributes.NICEST); 
	    Gitter1Appearance.setColoringAttributes(color1ca);
        //TransparencyAttributes
        TransparencyAttributes ta = new TransparencyAttributes( );
        ta.setTransparency( 0.5f );
        ta.setTransparencyMode( TransparencyAttributes.BLENDED );
        Gitter1Appearance.setTransparencyAttributes( ta );
       for (int i=-10;i<11;i++)
       {
         TransformGroup TGxy = new TransformGroup();
         LineArray la=new LineArray(2, LineArray.COORDINATES);
         la.setCoordinate(0, new Point3f(0f,i*0.1f,-1f));
         la.setCoordinate(1, new Point3f(0f,i*0.1f,1f));
         TGxy.addChild(new Shape3D(la, Gitter1Appearance));
         objTransform.addChild(TGxy);
        }
       for (int i=-10;i<11;i++)
       {
         TransformGroup TGxy = new TransformGroup();
         LineArray la=new LineArray(2, LineArray.COORDINATES);
         la.setCoordinate(0, new Point3f(0f,-1f,i*0.1f));
         la.setCoordinate(1, new Point3f(0f,1f,i*0.1f));
        
         TGxy.addChild(new Shape3D(la,Gitter1Appearance));
         objTransform.addChild(TGxy);
        }
       return objTransform;
    }
    
     TransformGroup xAchse() 
     { TransformGroup objTransform=new TransformGroup();
         
         Appearance app=new Appearance();
         app.setColoringAttributes(new ColoringAttributes(new Color3f(Color.BLACK), ColoringAttributes.NICEST));
         Transform3D rot = new Transform3D();
          rot.rotX(Math.PI/2.0d);
          TransformGroup objTran = new TransformGroup();
          objTransform.addChild(objTran);
          objTran.setTransform(rot);
          objTran.addChild(new Cylinder(0.005f,2.2f,1,32,32,app)); 
          
          //3d-Pfeilspitze
          Transform3D rotx = new Transform3D();
          rotx.rotY(-Math.PI/2.0d);
          TransformGroup rotationGrpx = new TransformGroup(rotx);
          objTran.addChild(rotationGrpx);
          
          Transform3D transformx = new Transform3D();
          transformx.setTranslation (new Vector3f (0.0f,1.1f, 0f));
          TransformGroup translationGrpx = new TransformGroup(transformx);
          translationGrpx.addChild(new Cone(0.02f,0.05f,1,32,32,app));
          rotationGrpx.addChild(translationGrpx);
          return objTransform;
        
        }
        
      
        
     TransformGroup yAchse() 
     { TransformGroup objTransform=new TransformGroup();
        Appearance app=new Appearance();
         app.setColoringAttributes(new ColoringAttributes(new Color3f(Color.BLACK), ColoringAttributes.NICEST));
         Transform3D rot = new Transform3D();
          rot.rotZ(Math.PI/2.0d);
          TransformGroup objTran = new TransformGroup();
          objTransform.addChild(objTran);
          objTran.setTransform(rot);
          objTran.addChild(new Cylinder(0.005f,2.2f,1,32,32,app));
          
          //3d-Pfeilspitze
          
          Transform3D rotz = new Transform3D();
          rotz.rotZ(-Math.PI);
          TransformGroup rotationGrpz = new TransformGroup(rotz);
          objTran.addChild(rotationGrpz);
          
          Transform3D transformz = new Transform3D();
          transformz.setTranslation (new Vector3f (0.0f,1.1f, 0f));
          TransformGroup translationGrpz = new TransformGroup(transformz);
          translationGrpz.addChild(new Cone(0.02f,0.05f,1,32,32,app));
          rotationGrpz.addChild(translationGrpz);
          
         
           return objTransform; 
        }
       
        TransformGroup zAchse() 
     { TransformGroup objTransform=new TransformGroup();
        Appearance app=new Appearance();
         app.setColoringAttributes(new ColoringAttributes(new Color3f(Color.BLACK), ColoringAttributes.NICEST));
         objTransform.addChild(new Cylinder(0.005f,2.2f,1,64,32,app));
         
          TransformGroup objTran = new TransformGroup();
          objTransform.addChild(objTran);
          
         //3d-Pfeilspitze
          Transform3D rotz = new Transform3D();
          Transform3D transformz = new Transform3D();
          transformz.setTranslation (new Vector3f (0.0f,1.1f, 0f));
          TransformGroup translationGrpz = new TransformGroup(transformz);
          translationGrpz.addChild(new Cone(0.02f,0.05f,1,32,32,app));
          //rotationGrpz.addChild(translationGrpz);
          objTran.addChild(translationGrpz);
           return objTransform; 
         
        }
    
    
}
