import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
import javax.media.j3d.GeometryStripArray.*;
import javax.vecmath.*;
/**
 * Write a description of class TestFrame here.
 *
 * @author Helmut Pithan h.pithan(at)t-online.de
 * @version (a version number or a date)
 */
public class TestFrame extends Frame implements ItemListener,AdjustmentListener
{ int cubi=0;int place=0;int id=0;
  boolean cubigerade=false;
  boolean idgerade=false;
    Choice cubiChoice;
    Choice placeChoice;
    Choice idChoice;
    TextField cubiText,placeText,idText;
    
   J3dFrame demoj3d=null;
   
   Button rotAchseUp;
   Button rotAchseLeft;
   Button rotAchseFront;
   Button rotAchseRight;
   Button rotAchseBack;
   Button rotAchseDown; 
   
   Button rotAchseup;
   Button rotAchseleft;
   Button rotAchsefront;
   Button rotAchseright;
   Button rotAchseback;
   Button rotAchsedown;
   
   Button resetButton;
   
   Scrollbar HSelectora;
  public void reset()
   {             J3dFrame.cubi0.reset();
                 J3dFrame.cubi1.reset();
                 J3dFrame.cubi2.reset();
                 J3dFrame.cubi3.reset();
                 J3dFrame.cubi4.reset();
                 J3dFrame.cubi5.reset();
                 J3dFrame.cubi6.reset();
                 J3dFrame.cubi7.reset();
                 
                 
                 
                 
                
                 J3dFrame.showCubi0=true;
                 J3dFrame.showCubi1=true;
                 J3dFrame.showCubi2=true;
                 J3dFrame.showCubi3=true;
                 J3dFrame.showCubi4=true;
                 J3dFrame.showCubi5=true;
                 J3dFrame.showCubi6=true;
                 J3dFrame.showCubi7=true;
                 
                
                 
                  
                    J3dFrame.plainU.removeChild(J3dFrame.cubi0BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi0BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi0BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi0BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi0BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi0BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                   
                    J3dFrame.cubi0BranchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,0,J3dFrame.cubi0.colors);
                    J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi0) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup);
                     
                    
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi1BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi1BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi1BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi1BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi1BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi1BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                    
                    J3dFrame.cubi1BranchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,1,J3dFrame.cubi1.colors);
                    J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi1) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup);
                    
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi2BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi2BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi2BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi2BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi2BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi2BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                   
                    J3dFrame.cubi2BranchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,2,J3dFrame.cubi2.colors);
                    J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi2) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup);

                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi3BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi3BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi3BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi3BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi3BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi3BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                    
                    J3dFrame.cubi3BranchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,3,J3dFrame.cubi3.colors);
                    J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi3) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup);                   
 
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi4BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi4BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi4BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi4BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi4BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi4BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                    
                    J3dFrame.cubi4BranchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,12,J3dFrame.cubi4.colors);
                    J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi4) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi4BranchGroup);

                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi5BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi5BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi5BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi5BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi5BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi5BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                    
                    J3dFrame.cubi5BranchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,13,J3dFrame.cubi5.colors);
                    J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi5) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup);
 
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi6BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi6BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi6BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi6BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi6BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi6BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                    
                    J3dFrame.cubi6BranchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,14,J3dFrame.cubi6.colors);
                    J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi6) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup);
                                        
                    J3dFrame.plainU.removeChild(J3dFrame.cubi7BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi7BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi7BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi7BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi7BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi7BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                    
                    J3dFrame.cubi7BranchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,15,J3dFrame.cubi7.colors);
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi7) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi7BranchGroup);
                    
                   
    } 
    
    public void getIdandPlace(int cubi)
   { switch(cubi)
       { case 0: 
                 place=J3dFrame.cubi0.getPlace();id=J3dFrame.cubi0.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
           break;
         case 1:
                 place=J3dFrame.cubi1.getPlace();id=J3dFrame.cubi1.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
         break;
         case 2:
                 place=J3dFrame.cubi2.getPlace();id=J3dFrame.cubi2.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
         break;
         case 3:
                 place=J3dFrame.cubi3.getPlace();id=J3dFrame.cubi3.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
         break;
         case 4:place=J3dFrame.cubi4.getPlace();id=J3dFrame.cubi4.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
         break;
         case 5:
                place=J3dFrame.cubi5.getPlace();id=J3dFrame.cubi5.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
         break;
         case 6:
                 place=J3dFrame.cubi6.getPlace();id=J3dFrame.cubi6.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
         break;
         case 7:
                 place=J3dFrame.cubi7.getPlace();id=J3dFrame.cubi7.getId();
                 cubiText.setText(""+cubi);placeText.setText(""+place);idText.setText(""+id);
                 cubiChoice.select(cubi);placeChoice.select(place);idChoice.select(id);
         break;
         
         
         default:System.out.println("cubi= "+cubi+" place="+place +" id="+id );break;
         
        }   
    }
   
    public void idandPlaces(int a,int b)
  { 	int placeA;int placeB;
	int idA;int idB;
	Cubi cubiA=null;
	Cubi cubiB=null;
	
	switch(a)
    { case 0:cubiA=J3dFrame.cubi0; break;
      case 1:cubiA=J3dFrame.cubi1; break;
      case 2:cubiA=J3dFrame.cubi2; break;
      case 3:cubiA=J3dFrame.cubi3; break;
      case 4:cubiA=J3dFrame.cubi4; break;
      case 5:cubiA=J3dFrame.cubi5; break;
      case 6:cubiA=J3dFrame.cubi6; break;
      case 7:cubiA=J3dFrame.cubi7; break;
      default:System.out.println("Achsencubi");	  
	 }
	 
	 switch(b)
    { case 0:cubiB=J3dFrame.cubi0; break;
      case 1:cubiB=J3dFrame.cubi1; break;
      case 2:cubiB=J3dFrame.cubi2; break;
      case 3:cubiB=J3dFrame.cubi3; break;
      case 4:cubiB=J3dFrame.cubi4; break;
      case 5:cubiB=J3dFrame.cubi5; break;
      case 6:cubiB=J3dFrame.cubi6; break;
      case 7:cubiB=J3dFrame.cubi7; break;
      default:System.out.println("Achsencubi");	  
	 }
	
	
  
     placeA =cubiA.getPlace();
     //aplaceText.setText(""+placeA);
     idA=cubiA.getId();
     //aidText.setText(""+idA);
     
     placeB =cubiB.getPlace();
     //bplaceText.setText(""+placeB);
     idB=cubiB.getId();     
     //bidText.setText(""+idB);
     

 }
  
    public void selectcubi(int cubi)
    {            J3dFrame.showCubi0=false;
                 J3dFrame.showCubi0=false;
                 J3dFrame.showCubi1=false;
                 J3dFrame.showCubi2=false;
                 J3dFrame.showCubi3=false;
                 J3dFrame.showCubi4=false;
                 J3dFrame.showCubi5=false;
                 J3dFrame.showCubi6=false;
                 J3dFrame.showCubi7=false;
                 
                 
        switch(cubi)
       {   case 0:J3dFrame.showCubi0=true;break;
           case 1:J3dFrame.showCubi1=true;break;
           case 2:J3dFrame.showCubi2=true;break;
           case 3:J3dFrame.showCubi3=true;break;
           case 4:J3dFrame.showCubi4=true;break;
           case 5:J3dFrame.showCubi5=true;break;
           case 6:J3dFrame.showCubi6=true;break;
           case 7:J3dFrame.showCubi7=true;break;
           
           
           default:System.out.println("0<="+cubi+"<=8");
        }
    }
    
   public void setplace(int cubi,int place,int id)
   {                J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                    J3dFrame.cubi0BranchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,place,id,J3dFrame.cubi0.colors);
                    J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                    J3dFrame.cubi1BranchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,place,id,J3dFrame.cubi1.colors);
                    J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                    J3dFrame.cubi2BranchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,place,id,J3dFrame.cubi2.colors);
                    J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                    J3dFrame.cubi3BranchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,place,id,J3dFrame.cubi3.colors);
                    J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                    J3dFrame.cubi4BranchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,place,id,J3dFrame.cubi4.colors);
                    J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                    J3dFrame.cubi5BranchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,place,id,J3dFrame.cubi5.colors);
                    J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                    J3dFrame.cubi6BranchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,place,id,J3dFrame.cubi6.colors);
                    J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                    J3dFrame.cubi7BranchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,place,id,J3dFrame.cubi7.colors);
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    
                   
                    
 
       switch(cubi)
       { case 0:                                                           
                    if(J3dFrame.showCubi0)J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup);           
           ;break;
           case 1:                                    
                    if(J3dFrame.showCubi1)J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup);           
           ;break;
           case 2:                                      
                    if(J3dFrame.showCubi2)J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup);
           break;
           
           case 3:                                     
                    if(J3dFrame.showCubi3)J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup);           
           break;
           
            case 4:                    
                    if(J3dFrame.showCubi4);J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi4BranchGroup);                                  
           break;           
            case 5:                    
                    if(J3dFrame.showCubi5)J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup);                               
           break;
           
            case 6:                                       
                    if(J3dFrame.showCubi6)J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup);
           break;
           
          case 7:                                      
                    if(J3dFrame.showCubi7)J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi7BranchGroup); 
           break; 
          
           
         default:System.out.println("default");break;
        }
                    
    }


    /**
     * Constructor for objects of class TestFrame
     */
    public TestFrame()
    {  {addWindowListener(new WindowAdapter()
            {  
                public void windowClosing(WindowEvent e) {  
                   if((demoj3d!=null)) demoj3d.dispose();
                    dispose();  
                }  
            });
        }
    /*    
      RotDown rotDown=new RotDown(demoj3d,20,60,70,30);   
         rotAchseDown= rotDown.getrotAchseDown();
         add(rotAchseDown);      
      Rotdoun rotdoun=new Rotdoun(demoj3d,100,60,70,30);   
         rotAchsedown= rotdoun.getrotAchsedown();
         add(rotAchsedown);
      RotUp rotUp=new RotUp(demoj3d,20,30,70,30);   
         rotAchseUp= rotUp.getrotAchseUp();
         add(rotAchseUp);
      Rotupp rotup=new Rotupp(demoj3d,100,30,70,30);   
         rotAchseup= rotup.getrotAchseup();
         add(rotAchseup); 
      RotLeft rotLeft =new RotLeft(demoj3d,20,90,70,30);   
      rotAchseLeft= rotLeft.getrotAchseLeft();
         add(rotAchseLeft);
         Rotlefft rotleft =new Rotlefft(demoj3d,100,90,70,30);   
      rotAchseleft= rotleft.getrotAchseleft();
         add(rotAchseleft);
       RotRight rotRight =new RotRight(demoj3d,20,120,70,30);
         rotAchseRight= rotRight.getrotAchseRight();
         add(rotAchseRight); 
       Rotrigt rotright =new Rotrigt(demoj3d,100,120,70,30);
         rotAchseright= rotright.getrotAchseright();
         add(rotAchseright); 
      RotFront rotFront =new RotFront(demoj3d,20,150,70,30);
         rotAchseFront= rotFront.getrotAchseFront();
         add(rotAchseFront);
      Rotfrontt rotfront=new Rotfrontt(demoj3d,100,150,70,30);
         rotAchsefront= rotfront.getrotAchsefront();
         add(rotAchsefront);
       RotBack rotBack=new RotBack(demoj3d,20,180,70,30);
         rotAchseBack= rotBack.getrotAchseBack();
         add(rotAchseBack);
       Rotbakk rotback=new Rotbakk(demoj3d,100,180,70,30);
         rotAchseback= rotback.getrotAchseback();
         add(rotAchseback);
         */
       {resetButton= new Button("reset");
        resetButton.setBounds(430,180,120,30);
        add(resetButton);
        resetButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {   
                reset();    
                } 
             });
            } // resetButton  <-- 
            /*
         Button okButton; 
            {okButton=new Button("Test");  
            okButton.setBounds(300,180,120,30);
            add(okButton);
            okButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {   BranchGroup cubi0BranchGroup = null;
                Cubi0 cubi0 = new Cubi0(cubi0BranchGroup,0,0,0,0.194); 
                cubi0BranchGroup = cubi0BranchGroup=cubi0.getCubi0BranchGroup(cubi0BranchGroup,0,0,cubi0.colors);
                cubi0.Ausgabe();
                cubi0BranchGroup = cubi0BranchGroup=cubi0.getCubi0BranchGroup(cubi0BranchGroup,2,2,cubi0.colors);
                cubi0.Ausgabe();
                
                BranchGroup cubi1BranchGroup = null;
                Cubi1 cubi1 = new Cubi1(cubi1BranchGroup,0,0,0,0.194); 
                cubi1BranchGroup = cubi1BranchGroup=cubi1.getCubi1BranchGroup(cubi1BranchGroup,0,0,cubi1.colors);
                cubi1.Ausgabe();
                cubi1BranchGroup = cubi1BranchGroup=cubi1.getCubi1BranchGroup(cubi1BranchGroup,2,2,cubi1.colors);
                cubi1.Ausgabe();
                
                BranchGroup cubi2BranchGroup = null;
                Cubi2 cubi2 = new Cubi2(cubi2BranchGroup,0,0,0,0.194); 
                cubi2BranchGroup = cubi2BranchGroup=cubi2.getCubi2BranchGroup(cubi2BranchGroup,0,0,cubi2.colors);
                cubi2.Ausgabe();
                cubi2BranchGroup = cubi2BranchGroup=cubi2.getCubi2BranchGroup(cubi2BranchGroup,2,2,cubi2.colors);
                cubi2.Ausgabe();
                
                BranchGroup cubi3BranchGroup = null;
                Cubi3 cubi3 = new Cubi3(cubi3BranchGroup,0,0,0,0.194); 
                cubi3BranchGroup = cubi3BranchGroup=cubi3.getCubi3BranchGroup(cubi3BranchGroup,0,0,cubi3.colors);
                cubi3.Ausgabe();
                cubi3BranchGroup = cubi3BranchGroup=cubi3.getCubi3BranchGroup(cubi3BranchGroup,2,2,cubi3.colors);
                cubi3.Ausgabe();
                 
                
                
                
              }  
             });
            } 
            */
        cubiText=new TextField("");
        cubiText.setBounds(200,30,30,30);
        cubiText.disable();
        add(cubiText);
        
       Label cubiLabel =new java.awt.Label("Cubi");
       cubiLabel.setBounds(200,60,40,30);
       add(cubiLabel);
       
       cubiChoice = new java.awt.Choice();
       cubiChoice.addItem("0");
       cubiChoice.addItem("1");
       cubiChoice.addItem("2");
       cubiChoice.addItem("3");
       cubiChoice.addItem("4");
       cubiChoice.addItem("5");
       cubiChoice.addItem("6");
       cubiChoice.addItem("7");
       
       
        
       try {
            cubiChoice.select(0);
        }
        catch (IllegalArgumentException e) { }
        cubiChoice.addItemListener(this);
        cubiChoice.setBounds(250,50,40,20);
        add( cubiChoice);
       
       placeText=new TextField("");
       placeText.disable();
       placeText.setBounds(300,30,30,30);
       add(placeText);
       Label placeLabel =new java.awt.Label("Place");
       placeLabel.setBounds(300,60,40,30);
       add(placeLabel);
       
       placeChoice = new java.awt.Choice();
       placeChoice.addItem("0");
       placeChoice.addItem("1");
       placeChoice.addItem("2");
       placeChoice.addItem("3");
       placeChoice.addItem("4");
       placeChoice.addItem("5");
       placeChoice.addItem("6");
       placeChoice.addItem("7");
       
       
        try {
            placeChoice.select(0);
        }
         catch (IllegalArgumentException e) { }
        placeChoice.addItemListener(this);
        placeChoice.setBounds(350,60,40,20);
        add( placeChoice);
       
        idText=new TextField("");
        idText.disable();
       idText.setBounds(430,30,30,30);
       add(idText);
       
      Label idLabel =new java.awt.Label("Id");
       idLabel.setBounds(430,60,40,30);
       add(idLabel);
       
       idChoice = new java.awt.Choice();
       idChoice.addItem("0");
       idChoice.addItem("1");
       idChoice.addItem("2");
       idChoice.addItem("3");
       idChoice.addItem("4");
       idChoice.addItem("5");
       idChoice.addItem("6");
       idChoice.addItem("7");
       idChoice.addItem("8");
       idChoice.addItem("9");
       idChoice.addItem("10");
       idChoice.addItem("11");
       idChoice.addItem("12");
       idChoice.addItem("13");
       idChoice.addItem("14");
       idChoice.addItem("15");
       idChoice.addItem("16");
       idChoice.addItem("17");
       idChoice.addItem("18");
       idChoice.addItem("19");
       idChoice.addItem("20");
       idChoice.addItem("21");
       idChoice.addItem("22");
       idChoice.addItem("23");
       
     
      
       
        try {
            idChoice.select(0);
        }
         catch (IllegalArgumentException e) { }
        idChoice.addItemListener(this);
        idChoice.setBounds(480,60,40,20);
        add( idChoice);
       
      HSelectora = new Scrollbar ();
		HSelectora.setMaximum (33);
		HSelectora.setValue (0);
                HSelectora.setOrientation (Scrollbar.HORIZONTAL);
		HSelectora.setBounds(200,100,400,30);
		HSelectora.addAdjustmentListener (this);
		add(HSelectora); 
       
        
       
      setTitle("TestFrame -- Rubik's 3x3 Cube");
         setBounds(10,10,620,240);
         setResizable(false);
         setLayout(null);
         setVisible(true);
         demoj3d=new J3dFrame("J3dFrame");
         //demoj3d.setBounds(820,10,480,480);
         demoj3d.setBounds(640,10,480,480);
         demoj3d.setVisible(true);
         setVisible(true);
    }
   public void itemStateChanged(java.awt.event.ItemEvent event)
    {
       Object object = event.getSource();
       if (object == cubiChoice)
       {  
          cubi  = cubiChoice.getSelectedIndex();          
          reset();
          getIdandPlace(cubi);          
          selectcubi(cubi);
          cubiChoice.select(cubi);
          setplace(cubi,place,id);
          
        }
      if (object == placeChoice)
       {  place  = placeChoice.getSelectedIndex();
          placeText.setText(""+place);
         // System.out.println("placeChoice place="+place);
        }
      if (object == idChoice)
       {  id  = idChoice.getSelectedIndex();
          HSelectora.setValue (id);
          idText.setText(" "+id);
          setplace(cubi,place,id);
         // System.out.println("idChoice id="+id);
          
        }
    }
    
  public void adjustmentValueChanged(AdjustmentEvent e) {
          id  = HSelectora.getValue();
          cubiText.setText(""+cubi);
          placeText.setText(""+place);
          HSelectora.setValue (id);
         // System.out.println("adjustmentValueChanged id="+id);
          
         selectcubi(cubi);
         cubiChoice.select(cubi);
         setplace(cubi,place,id);
         idText.setText(" "+(id));
         idChoice.select(id);
    
  }

    public static void main(String[] args) 
    {  
         TestFrame testFrame= new TestFrame();  
    } 
    
}
