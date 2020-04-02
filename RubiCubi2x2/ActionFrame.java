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
 * Write a description of class MainFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 //https://ruwix.com/the-rubiks-cube/algorithm/
public class ActionFrame extends Frame implements ItemListener //,AdjustmentListener
{  int cubi=0;int place=0;int id=0; 
   //J3dFrame myJ3dFrame=null;
   J3dFrame myJ3dFrame=null;
    Choice cubiChoice;
   
    Choice idChoice;
    TextField cubiText,placeText,idText; 
    TextField generatorsText; 
    TextField aidText,aidText1;
    TextField aplaceText,aplaceText1;
    TextField bplaceText,bplaceText1;
    TextField bidText,bidText1;
    
    

    Scrollbar HSelectora;
    
    static TextArea textArea;
    
    String[][] sArray={ {"Examples",""},   					  					
    					
    					
    					{"rechte obere Ecke kippen","RfrFRfrF"}, 
    					{"1","rdRD"},
    					{"2","RUrURUUr"},
    					{"3","RuRFFrURFFRR"},
    					{"4","UUrLLDDbrubrubrU"}    					
    						                  };
 String[][] gArray={ {"Generators",""},
 	                    {"Group","UDLRFBudlrfbMNOXYZmnoxyz"}, 	                    
    					{"Classic","UuDdFfBbLlRr"},
    					{"Sub1","UuFf"},
    					{"Sub2","UuFfLl"},
    					{"Sub3","UuLlDd"},
    					{"Sub4","MmDdUu"},
    					{"Sub5","FfLlRrBb"}
    					   						                  };   
    						                  
	String[][] macroArray={ {"Macros"," "," "},
 	                        {"rdRD","rdRD"," vorn rechts oben einsetzen "}, 	                        
 	                        {"RUrURUUr","RUrURUUr","ein gelber ist vorn links oben"},
 	                        {"RuRFFrURFFRR","RuRFFrURFFRR","4 gelbe oben 2 passende nach hinten"},
 	                        {"*three Corners","fUBuFUbu","A commutator that cycles three corners and leaves the rest of the cubies intact"},
    					    {"two UpCornwes","LdlfdFUfDFLDlu","Rotates two corner cubies in place and does not move any of the other cubies"},
    					    {"two DoBCornwes","LulbuBDbUBLUld","Rotates two corner cubies in place and does not move any of the other cubies"},
    					    {"two DoLCornwes","FufluLDlULFUfd","Rotates two corner cubies in place and does not move any of the other cubies"},
    					    {"two DoFCornwes","RurfuFDfUFRUrd","Rotates two corner cubies in place and does not move any of the other cubies"},
    					    {"two DoRCornwes","BubruRDrURBUbd","Rotates two corner cubies in place and does not move any of the other cubies"},    					       					    			   
    		
    					    {"cycle4-5-7","fUBuFUbu","Cycles three corner cubies."},
    					    {"Three Horners","rURurUFRbRBRfRR","Swaps two corners and two edges."},
    					    {"Mist","rURurUFRbRBRfRR","Swaps two corners and two edges."},    					    
    					    {"Flip5&7d","BRFLDlDfrbldLd","Flips two adjacent edge cubies."},
    					    {"Flip3&5d","RFLBDbDlfrbdBd","Flips two adjacent edge cubies."},
    					    {"Flip1&3","FLBRDrDblfrdRd","Flips two adjacent edge cubies."},
    					    {"Flip1&7","LBRFDfDrblfdFd","Flips two adjacent edge cubies."},    					   
    					    {"FrontthreeCorners_1","LDRdlDrd","A commutator that cycles three corners 4-6-0 and leaves the rest of the cubies intact"},
    					    {"20-Top-DownthreeCorners","fUBuFUbu","A commutator that cycles three corners 22-16-18 and leaves the rest of the cubies intact"},
    					    {"0*-DownthreeCorners","dfDBdFDb","A commutator that cycles three corners 2-4-6-2 and leaves the rest of the cubies intact"},
    					    {"2*-DownthreeCorners","bDFdBDfd","A commutator that cycles three corners 0-4-6-0 and leaves the rest of the cubies intact"},   					   
    					    {"4*-DownthreeCorners","lDRdLDrd","A commutator that cycles three corners 0-2-6-0 and leaves the rest of the cubies intact"},
    					    {"6*-DownthreeCorners","fDBdFDbd","A commutator that cycles three corners  0-2-4-0 and leaves the rest of the cubies intact"},    					
    						                  }; 
    						                  
   String[][] placemacroArray={ {"PlaceMacros"," "," "},
 	                        {"p22->p18->p16->p22","fUBuFUbu","p22->p18->p16->p22"},
 	                        {"p22->p16->p18->p22","UBufUbuF","p22->p16->p18->p22","UBufUbuF"},
 	                        {"p16->p20->p18->p16","rULuRUlu","p16->p20->p18->p16"},
 	                        {"p16->p18->p20->p16","ULurUluR","p16->p18->p20->p16"},
 	                        {"cycle_0_2_4","fDBdFDbd","p0->p2->p4->p0"},
 	                        {"cycle_0_2_6","lDRdLDrd","p0->p2->p6->p0"},
 	                        {"cycle_0_4_6","bDFdBDfd","p0->p4->p6->p0"}, 	                        
 	                        {"cycle_2_4_6","rDLdRDld","p2->p4->p6->p2"}, 	                        
 	                        {"cycle_0_2_4^-1","DBdfDbdF","p0->p4->p2->p0"},
 	                        {"cycle_0_2_6^-1","DRdlDrdL","p0->p6->p2->p0"},
 	                        {"cycle_0_4_6^-1","DFdbDfdB","p0->p6->p4->p0"}, 	                        
 	                        {"cycle_2_4_6^-1","DLdrDldR","p2->p6->p4->p2"},
 	                        {"swap_2_4","fDBdFDbdDFdbDfdB","swaps cubies on 2 and 4"},
 	                        {"rot-p1 & rot->p22","LdlfdFUfDFLDlu","Rotates two corner cubies in place and leaves the rest of the cubies intact"},
 	                        {"flips-p17 & flips->p23","FRBLUlUbrfluLu","Flips two adjacent edge cubies."},
 	                        {"flips-p17 & flips->p21","LfUlFbUrFuRfBu","flip two opposite edge cubies."},
 	                        {"flips-p19 & flips->p23","FrUfRlUbRuBrLu","flip two opposite edge cubies."}, 	                        
 	                        {"*p4<->p5","rURurUFRbRBRfRR","Swaps two corners."},
 	                        {"C10","FDfdFDf","Rotates the UFL corner cubie clockwise in place"},
 	                        {"C12","FDf"," Brings a corner cubie from the bottom to the top face directly above it and rotates it counter-clockwise or clockwise on the way up"},	                        
    					    {"C121","rDR"," Brings a corner cubie from the bottom to the top face directly above it and rotates it counter-clockwise or clockwise on the way up"},
    					    {"C14","fdFDLDl"," Moves an edge cubie from the lower face to the middle face without altering the top face at all"},
    					    {"C15","FDfdrdR"," Moves an edge cubie from the lower face to the middle face without altering the top face at all"},
    		       					
    						                  };	
    Choice exampleChoice;
	Choice generatorChoice;
	Choice macroChoice;
	Choice placemacroChoice;
	
    TextField inputText;
    TextField invText;
    TextField nText;
    TextField mText;
    
    
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
    
    Button rotAchse_X;
    Button rotAchse_Y;
    Button rotAchse_Z;
    
    Button rotAchse_M_invX;
    Button rotAchse_M_invY;
    Button rotAchse_M_invZ;
    Button rotAchse_y;
    Button rotAchse_z;
       
    Button rotAchse_M_X;
    Button rotAchse_M_Y;
    Button rotAchse_M_Z;
    
    Button rotAchse_M_x;
    Button rotAchse_M_y;
    Button rotAchse_M_z;
   
   
    Button resetButton;
public void changeId(int a, int aid)
{
	Cubi cubiA=null;
	
	
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
	 
    cubiA.setId(aid);
       
  }            
    
public void exchangePlaces(int a,int aplace, int aid,int b,int bplace,int bid)
{
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
	 
    cubiA.setPlace( aplace);
    cubiA.setId(aid);
    
    cubiB.setPlace(bplace);  
    cubiB.setId(bid);
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
     aplaceText.setText(""+placeA);
     idA=cubiA.getId();
     aidText.setText(""+idA);
     
     placeB =cubiB.getPlace();
     bplaceText.setText(""+placeB);
     idB=cubiB.getId();     
     bidText.setText(""+idB);
     

 }
 
  public void cornerPositions()
  {
  System.out.print("c4p"+myJ3dFrame.cubi4.getPlace()+"i"+myJ3dFrame.cubi4.getId());
  System.out.print(",c5p"+myJ3dFrame.cubi5.getPlace()+"i"+myJ3dFrame.cubi5.getId());
  System.out.print(",c6p"+myJ3dFrame.cubi6.getPlace()+"i"+myJ3dFrame.cubi6.getId());
  System.out.print(",c7p"+myJ3dFrame.cubi7.getPlace()+"i"+myJ3dFrame.cubi7.getId());
  System.out.println();
  System.out.print("c0p"+myJ3dFrame.cubi0.getPlace()+"i"+myJ3dFrame.cubi0.getId());
  System.out.print(" ,c1p"+myJ3dFrame.cubi1.getPlace()+"i"+myJ3dFrame.cubi1.getId());
  System.out.print(" ,c2p"+myJ3dFrame.cubi2.getPlace()+"i"+myJ3dFrame.cubi2.getId());
  System.out.print(" ,c3p"+myJ3dFrame.cubi3.getPlace()+"i"+myJ3dFrame.cubi3.getId());  
  System.out.println();
  }                
    public void paint(Graphics g)
    { Graphics2D g2d=(Graphics2D) g;
        Stroke stroke = new BasicStroke(2f);
         g2d.setStroke(stroke);
        
       g2d.drawLine (0,220,800,220); 
       
       g2d.drawLine (0,460,800,460);
    }
   
  public void action(int a)
            {
               switch (a)
                 { case 64  :reset();break;
                   case 85  :RotUp.UpAction(); break;
                   case 117 :Rotupp.upAction();  break;
                   case 68  :RotDown.DownAction();break;
                   case 100 :Rotdoun.downAction();break;
                   case 76  :RotLeft.LeftAction();break;
                   case 108 :Rotlefft.leftAction();break;
                   case 82  :RotRight.RightAction();break;
                   case 114 :Rotrigt.rightAction();break;
                   case 70  :RotFront.FrontAction();break;
                   case 102 :Rotfrontt.frontAction();break;
                   case 66  :RotBack.BackAction(); break;
                   case 98  :Rotbakk.backAction(); break;
                                     	   
                   case 88  :RotX.XAction(); break;
                   case 120 :Rot_x.x_Action(); break;  
                   case 89  :RotY.YAction(); break;
                   case 121 :Rot_y.y_Action();break;
                   case 90  :RotZ.ZAction(); break;
                   case 122 :Rot_z.z_Action();break;
                   	   
                   	   
                   default:System.out.println("Fehler in der Eingabe!");                 
                    }
            }
  

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
    
    
        
  public String invertieren(String s)
    { int l=s.length();
     char[] cin=s.toCharArray();
    char[] cout=new char[l];
    char c;
     for (int i=0;i<l;i++)
     {  int j=cin[i];
       int k;
       if (j>90)
      {k=j-32;} else  {k=j+32;}
       c=(char)k;
      cout[l-i-1]=c;
      
      }  
      String out =new String(cout);
      return out;
      }
      
        
   public boolean erfolgreich()
     { boolean e;
            e=(J3dFrame.cubi0.getPlace()==0) && (J3dFrame.cubi0.getId()==0)
              &&
              (J3dFrame.cubi1.getPlace()==1) && (J3dFrame.cubi1.getId()==1)
              &&
              (J3dFrame.cubi2.getPlace()==2) && (J3dFrame.cubi2.getId()==2)
              &&
              (J3dFrame.cubi3.getPlace()==3) && (J3dFrame.cubi3.getId()==3)
              &&
              (J3dFrame.cubi4.getPlace()==4) && (J3dFrame.cubi4.getId()==12)
              &&
              (J3dFrame.cubi5.getPlace()==5) && (J3dFrame.cubi5.getId()==13)
              &&
              (J3dFrame.cubi6.getPlace()==6) && (J3dFrame.cubi6.getId()==14)              
              &&
              (J3dFrame.cubi7.getPlace()==7) && (J3dFrame.cubi7.getId()==15);
              
          return e;//e
        }
    /**
     * Constructor for objects of class MainFrame
     */
     
    public ActionFrame()
    {               
        {addWindowListener(new WindowAdapter()
            {  
                public void windowClosing(WindowEvent e) {  
                   if((myJ3dFrame!=null)) myJ3dFrame.dispose();
                    dispose();  
                }  
            });
        }
        
          
         RotUp rotUp=new RotUp(myJ3dFrame,20,30,70,30);   
         rotAchseUp= rotUp.getrotAchseUp();
         add(rotAchseUp);
         
         Rotupp rotup=new Rotupp(myJ3dFrame,100,30,70,30);   
         rotAchseup= rotup.getrotAchseup();
         add(rotAchseup);
         
         
         RotDown rotDown=new RotDown(myJ3dFrame,20,60,70,30);   
         rotAchseDown= rotDown.getrotAchseDown();
         add(rotAchseDown);
         
         Rotdoun rotdoun=new Rotdoun(myJ3dFrame,100,60,70,30);   
         rotAchsedown= rotdoun.getrotAchsedown();
         add(rotAchsedown);
     
         RotLeft rotLeft =new RotLeft(myJ3dFrame,20,90,70,30);
         rotAchseLeft= rotLeft.getrotAchseLeft();
         add(rotAchseLeft);
         
         Rotlefft rotleft =new Rotlefft(myJ3dFrame,100,90,70,30);
         rotAchseleft= rotleft.getrotAchseleft();
         add(rotAchseleft);
    
         RotRight rotRight =new RotRight(myJ3dFrame,20,120,70,30);
         rotAchseRight= rotRight.getrotAchseRight();
         add(rotAchseRight);  
           
         Rotrigt rotright =new Rotrigt(myJ3dFrame,100,120,70,30);
         rotAchseright= rotright.getrotAchseright();
         add(rotAchseright);  
         
         RotFront rotFront =new RotFront(myJ3dFrame,20,150,70,30);
         rotAchseFront= rotFront.getrotAchseFront();
         add(rotAchseFront); 
        
         Rotfrontt rotfront=new Rotfrontt(myJ3dFrame,100,150,70,30);
         rotAchsefront= rotfront.getrotAchsefront();
         add(rotAchsefront);
         
         RotBack rotBack=new RotBack(myJ3dFrame,20,180,70,30);
         rotAchseBack= rotBack.getrotAchseBack();
         add(rotAchseBack);
         
         Rotbakk rotback=new Rotbakk(myJ3dFrame,100,180,70,30);
         rotAchseback= rotback.getrotAchseback();
         add(rotAchseback);
         
        
         RotX rotX=new RotX(myJ3dFrame,20,230,70,30);
         rotX.rotAchseX= rotX.getrotAchseX();
         add(rotX.rotAchseX);
         
         Rot_x rot_x=new Rot_x(myJ3dFrame,100,230,70,30);
         rot_x.rotAchse_x= rot_x.getrotAchse_x();
         add(rot_x.rotAchse_x);
         
         RotY rotY=new RotY(myJ3dFrame,20,260,70,30);
         rotY.rotAchseY= rotY.getrotAchseY();
         add(rotY.rotAchseY);
         
         Rot_y rot_y=new Rot_y(myJ3dFrame,100,260,70,30);
         rot_y.rotAchse_y= rot_y.getrotAchse_y();
         add(rot_y.rotAchse_y);
                
         RotZ rotZ=new RotZ(myJ3dFrame,20,290,70,30);
         rotZ.rotAchseZ= rotZ.getrotAchseZ();
         add(rotZ.rotAchseZ);
         
         Rot_z rot_z=new Rot_z(myJ3dFrame,100,290,70,30);
         rot_z.rotAchse_z= rot_z.getrotAchse_z();
         add(rot_z.rotAchse_z);
//  exampleChoice        
       exampleChoice = new java.awt.Choice();
       for (int i=0;i<sArray.length;i++)
       exampleChoice.addItem(sArray[i][0]);
     
       try {
            exampleChoice.select(0);
        }
         catch (IllegalArgumentException e) { }
        exampleChoice.addItemListener(this);
        exampleChoice.setBounds(580,35,140,20);
        add( exampleChoice);
        
//  macroChoice        
       macroChoice = new java.awt.Choice();
       for (int i=0;i<macroArray.length;i++)
       macroChoice.addItem(macroArray[i][0]);
     
       try {
            macroChoice.select(0);
        }
         catch (IllegalArgumentException e) {System.out.println(e) ;}
        macroChoice.addItemListener(this);
        macroChoice.setBounds(580,65,140,20);
        add( macroChoice);
        
 //  placemacroChoice        
       placemacroChoice = new java.awt.Choice();
       for (int i=0;i<placemacroArray.length;i++)
       placemacroChoice.addItem(placemacroArray[i][0]);
     
       try {
            placemacroChoice.select(0);
        }
         catch (IllegalArgumentException e) {System.out.println(e) ;}
        placemacroChoice.addItemListener(this);
        placemacroChoice.setBounds(500,240,200,20);
        add( placemacroChoice);       
        
//cycleTestButton
 TextField cycleTestText=new TextField("");
          cycleTestText.setBounds(580,90, 50,30);
          add(cycleTestText);
          
        Button cycleTestButton; 
        {cycleTestButton=new Button("cycleTest");              
        cycleTestButton.setBounds(630,90,90,30);
         add(cycleTestButton);
         cycleTestButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             { //inputText.setText("UUrLLDDbrubrubrU");
             	 cycleTestText.setText("0");
             	 String t=new String(inputText.getText());
               int l=t.length();
              if (t.length()>0)
              {
               int k=0;int m=1000;
               do           
               { for (int i=0;i<l;i++)
                {int a=t.charAt(i);  
                	 
                 action(a);}                                                                           
                                             
                k=k+1;
                String kString=Integer.toString(k);
                cycleTestText.setText(kString);
                textArea.append("\r\n"+"k="+k+" successful: "+erfolgreich()+"\r\n");
                
              }//
              while (!erfolgreich()&& k<m);  
              	                	  
              	  //cycleTestText.setText(s);
               
                  }               
                }           
            });
            }  
                             
       Label inputLabel;
          inputLabel=new Label("Input:");  
          inputLabel.setBounds(210,30, 40,30);
          inputLabel.setVisible(true);
          add(inputLabel);
                  
          inputText=new TextField("");
          inputText.setBounds(260,30, 230,30);
          add(inputText);
                             
          textArea=new TextArea();
          textArea.setBounds(260,240,230,200);         
          add(textArea);
          
       Button clrTextAreaButton; 
          {clrTextAreaButton=new Button("clrArea");  
          clrTextAreaButton.setBounds(500,400,80,30);
          add(clrTextAreaButton);
          clrTextAreaButton.addActionListener(new ActionListener()
          { public void actionPerformed(ActionEvent e)
              { textArea.setText("");
                  
                }
            
            });
            } 
         
          invText=new TextField("");
          invText.setEditable(false);
          invText.setBounds(260,60, 230,30);
          add(invText);
          
       Button invertButton; 
            {invertButton=new Button("invert");              
            invertButton.setBounds(200,60,60,30);
            add(invertButton);
            invertButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                { String s=new String(inputText.getText());                 
                  if (s.length()>0)
                  {
                  invText.setText(s);
                  inputText.setText(invertieren(s));
                  }               
                }           
            });
            } 
                        
         Button clrInputButton; 
            {clrInputButton=new Button("clr");  
            clrInputButton.setBounds(500,30,60,30);
            add(clrInputButton);
            clrInputButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                { inputText.setText("");
                  invText.setText("");
                   //ntextArea=0; 
                  
                }
            
            });
            } 
                               
            Button stepButton;
            { stepButton=new Button("Step");  
             stepButton.setBounds(500,60,60,30);
             add(stepButton);
            stepButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {  //textArea.append("c"+cubi+"p"+place+"i"+id+" ");
                String s=new String(inputText.getText());
                int l=s.length();
                                
                if(l>0)
                {int a=s.charAt(0);
                 char c=s.charAt(0);                                 
                 action(a); }
                if(s.length()>0)
               { s=s.substring(1);
                inputText.setText(s);}            
              }  
             });
            } 
            
          Button executeButton; 
            {executeButton=new Button("execute");  
            executeButton.setBounds(450,90,110,30);
            add(executeButton);
            executeButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {    
                 String s=new String(inputText.getText());
                
                 s=invertieren(s);
                 invText.setText(s);
                 s=invertieren(s);
                 int l=s.length();
                
                for (int i=0;i<l;i++)
                {int a=s.charAt(i);
                  //System.out.println("i="+i);
                 //char c=s.charAt(i);
                 action(a);                
                }
               textArea.append("\r\n");
              }  
             });
            } 
                 
     generatorsText=new TextField("UDLRFBudlrfbXYZxyz");    
     generatorsText.setBounds(280,180,210,30);
     add( generatorsText);
               
      generatorChoice = new java.awt.Choice();
      for (int i=0;i<gArray.length;i++)
      generatorChoice.addItem(gArray[i][0]);    
       try {
            generatorChoice.select(0);
        }
         catch (IllegalArgumentException e) { }
        generatorChoice.addItemListener(this);
        //generatorChoice.setBounds(500,185,100,20);
        generatorChoice.setBounds(180,185,100,20);
        add( generatorChoice);
            
    Label nLabel;
          nLabel=new Label("n=");  
          nLabel.setBounds(210,90, 30,30);//115
          nLabel.setVisible(true);
          add(nLabel);
          
          nText=new TextField("20");
          nText.setBounds(260,95,40,20);//120
          add(nText);
          
 
            
          Button randomButton;
            {randomButton=new Button("randomInput(n)");             
            randomButton.setBounds(300,90,150,30);//115                
            add(randomButton);            
            randomButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {  Integer n;
                try {
                 n=Integer.valueOf(nText.getText());
            }
               catch (NumberFormatException er){n=1;nText.setText("1");}
                
                 if (n<1)  {n=1;nText.setText("1");}
                 if (n>1000){ n=100;nText.setText("100");}
                                                                   
                  String s=new String("UDLRFBudlrfbMNOXYZmnoxyz");
                  s=generatorsText.getText();
                char[] cs=s.toCharArray();
                char[] cr=new char[n];
                
                for (int i=0;i<n;i++)
                {Random random=new Random();
                    int j=random.nextInt(s.length());                
                 cr[i]=cs[j];
                }                               
               String r=new String(cr);             
               inputText.setText(r);
               textArea.append("Generators:\r\n");
               textArea.append(s+"\r\n");
               //textArea.append(r+"\r\n");
              }  
             });
                          
            } 
            
          Label mLabel;
          mLabel=new Label("m=");  
          mLabel.setBounds(210,115, 30,30);//90
          mLabel.setVisible(true);
          add(mLabel);
          
          mText=new TextField("3");
          mText.setBounds(260,120,40,20);//95
          add(mText);         
            
                         
            Button repeatButton; 
            {repeatButton=new Button("repeat(m)");  
            repeatButton.setBounds(300,115,150,30);//90
            add(repeatButton);
            repeatButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {  int m;
            	try {
                 m=Integer.valueOf(mText.getText());
                }
               catch (NumberFormatException er){m=1;mText.setText("1");} 
                if (m<1)  {m=1;mText.setText("1");}
                if (m>1000){ m=1000;mText.setText("1000");}
                
                 String s=new String(inputText.getText());
                 textArea.append(s+"\r\n");                               
                 int l=s.length();
               for (int j=0;j<m;j++) 
                for (int i=0;i<l;i++)
                {int a=s.charAt(i);                                   
                 action(a);                
                }
                textArea.append(s+"\r\n"); 
              }  
             });
            } 
            
            Button randomTestButton;
            {randomTestButton=new Button("randomTest(n,m)");              
            randomTestButton.setBounds(300,140,150,30);
            add(randomTestButton);
            randomTestButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {  Integer n;
               Integer m;
               
                try {
                 n=Integer.valueOf(nText.getText());
                }
               catch (NumberFormatException er){n=1;nText.setText("1");}
               
             try {
                 m=Integer.valueOf(mText.getText());
            }
               catch (NumberFormatException er){m=1;mText.setText("1");}
                
                 if (n<1)  {n=1;nText.setText("1");}
                 if (n>1000){ n=100;nText.setText("100");}
                 
               int k=1;
               do
               { System.out.println("Start: k="+k);               	                 	  
                String s=new String("UDLRFBudlrfbXYZxyz");
                s=generatorsText.getText();
                char[] cs=s.toCharArray();
                char[] cr=new char[n];
               // System.out.println(s.length());
                for (int i=0;i<n;i++)
                {Random random=new Random();
                 int j=random.nextInt(s.length());
                 cr[i]=cs[j];
                }    
               String r=new String(cr);
               inputText.setText(r);              
                int l=r.length();
               for (int i=0;i<l;i++)
                {int a=r.charAt(i);                           
                 action(a);} 
                 
                textArea.append("UpPlain\r\n");
                System.out.println("UpPlain");
                UpPlain upPlain=new UpPlain(myJ3dFrame);
                textArea.append("yellowUp \r\n");
                 System.out.println("yellowUp ");
                Rot_y.y_Action();
                Rot_y.y_Action();
                textArea.append(" YellowPlain \r\n");
                System.out.println("YellowPlain");
                YellowPlain yellowPlain=new YellowPlain(myJ3dFrame);
                textArea.append("yellowDown \r\n");                                
                //System.out.println("successful: "+erfolgreich());
                textArea.append(k+".successful: "+erfolgreich()+"\r\n");                          
                k=k+1; 
                //textArea.append("\r\n");
              }//
              while (erfolgreich()&& k<=m);
            
              }  
             });
            } 
                                        
        {resetButton= new Button("reset");
        resetButton.setBounds(580,180,140,30);
        add(resetButton);
        resetButton.addActionListener(new ActionListener()
            {  
            public void actionPerformed(ActionEvent e)
            {   
                reset();    
                } 
             });
            } // resetButton  <--     
 Button DemoButton; 
         {DemoButton=new Button("Demonstration");              
         DemoButton.setBounds(5,480,125,30);
         add(DemoButton);
         DemoButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             {  int n=20;                                 
               textArea.append("\r\nDemonstration\r\n");
               String s=new String("UDLRFBudlrfbXYZxyz");
                s=generatorsText.getText();
                char[] cs=s.toCharArray();
                char[] cr=new char[n];
              
                for (int i=0;i<n;i++)
                {Random random=new Random();
                 int j=random.nextInt(s.length());
                 cr[i]=cs[j];
                }
                
               String r=new String(cr);
               inputText.setText(r);              
                int l=r.length();
               for (int i=0;i<l;i++)
                {int a=r.charAt(i);                           
                 action(a);} 
              textArea.append("\r\n Push Solve-UpPlain");
                                         
             }           
            });
            }       
      Button upPlainButton; 
         {upPlainButton=new Button("Solve-UpPlain");              
         upPlainButton.setBounds(135,480,150,30);
         add(upPlainButton);
         upPlainButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             {                                   
               textArea.append("\r\nUpPlain\r\n");
               UpPlain upPlain=new UpPlain(myJ3dFrame);
               textArea.append("\r\n UpPlain Zuege="+myJ3dFrame.zuege);
               textArea.append("\r\n Push Solve-YellowPlain");
                                          
             }           
            });
            } 
            
 Button yellowUpButton; 
         {yellowUpButton=new Button("YellowUp");              
         yellowUpButton.setBounds(115,480,105,30);
         //add(yellowUpButton); //
         yellowUpButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             {                                   
                textArea.append("\r\nYellowUp \r\n");
                Rot_y.y_Action();
                Rot_y.y_Action();
                 myJ3dFrame.zuege=2;                                         
             }           
            });
            } 
            
 Button YellowPlainButton; 
         { YellowPlainButton=new Button("Solve-YellowPlain");              
          YellowPlainButton.setBounds(290,480,170,30);
          add( YellowPlainButton);
          YellowPlainButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             { textArea.append("\r\nYellowUp \r\n");
                Rot_y.y_Action();
                Rot_y.y_Action(); //zwei Zuege                                
               textArea.append("\r\nYellowPlain \r\n");
               YellowPlain yellowPlain=new YellowPlain(myJ3dFrame); 
               textArea.append("\r\nYellowPlain: Zuege="+(myJ3dFrame.zuege+2));
               myJ3dFrame.zuege=0;//für nächste Demo
             }           
            });
            } 
            
Button yellowDownButton; 
         {yellowDownButton=new Button("YellowDown");              
         yellowDownButton.setBounds(340,480,105,30);
         //add(yellowDownButton);
         yellowDownButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             {                                   
               textArea.append("\r\n yellowDown \r\n");
                RotX.XAction();
                RotX.XAction();                                          
             }           
            });
            } 
            
 Button yellowPlainTestButton; 
            {yellowPlainTestButton=new Button("YellowPlainTest");              
            yellowPlainTestButton.setBounds(555,570,105,30);
            add(yellowPlainTestButton);
            yellowPlainTestButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  textArea.append("\r\nyellowPlainTest\r\n");
                 YellowPlain yellowPlain=new YellowPlain(myJ3dFrame,"Test");                                                 
                }           
            });
            }             
     
 Button downPlainTestButton; 
            {downPlainTestButton=new Button("DownPlainTest");              
            downPlainTestButton.setBounds(555,540,105,30);
            add(downPlainTestButton);
            downPlainTestButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  textArea.append("\r\nDownPlainTest\r\n");
                 cornerPositions();                                                  
                }           
            });
            }            

            
    Label aLabel;
          aLabel=new Label("cubiA:");  
          aLabel.setBounds(20,520,40,30);
          aLabel.setVisible(true);
          add(aLabel);
          
  Label aLabel1;
          aLabel1=new Label("cubiA:");  
          aLabel1.setBounds(20,620,40,30);
          aLabel1.setVisible(true);
          add(aLabel1);
          
 TextField aText;                 
         aText=new TextField("");
          aText.setBounds(80,520, 35,30);
          add(aText);
 TextField aText1;                 
         aText1=new TextField("");
          aText1.setBounds(80,620, 35,30);
          add(aText1);
          
                   
   aplaceText=new TextField("");
         aplaceText.setBounds(120,520, 35,30);
          add(aplaceText);
          
         aplaceText1=new TextField("");
         aplaceText1.setBounds(120,620, 35,30);
          add(aplaceText1);
   
          
    aidText=new TextField("-1");
          aidText.setBounds(160,520, 35,30);
          add(aidText); 
          
   aidText1=new TextField("-1");
          aidText1.setBounds(160,620, 35,30);
          add(aidText1); 
                 
          
  Label bLabel;
          bLabel=new Label("cubiB:");  
          bLabel.setBounds(220,520,40,30);
          bLabel.setVisible(true);
          add(bLabel);
          
 TextField bText;                 
         bText=new TextField("");
          bText.setBounds(280,520, 35,30);
          add(bText);
          
  TextField bText1;                 
         bText1=new TextField("");
          bText1.setBounds(280,620, 35,30);
          add(bText1);
          
                  
         bplaceText=new TextField("");
         bplaceText.setBounds(320,520, 35,30);
          add(bplaceText);
          
      bplaceText1=new TextField("");
         bplaceText1.setBounds(320,620, 35,30);
          add(bplaceText1);
                  
          bidText=new TextField("-1");
          bidText.setBounds(360,520, 35,30);
          add(bidText); 
          
          bidText1=new TextField("-1");
          bidText1.setBounds(360,620, 35,30);
          add(bidText1);          
 
      Button testButton; 
            {testButton=new Button("TestButton");              
            testButton.setBounds(20,560,100,30);
            add(testButton);
            testButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                                
                 Integer a=-1; Integer b=-1;Integer aid=-1;
                try {
                 a=Integer.valueOf(aText.getText());
               }catch (NumberFormatException er){a=0;aText.setText("0");}
               
               try {
                 b=Integer.valueOf(bText.getText());
               }catch (NumberFormatException er){b=0;bText.setText("0");}
                              
               try { aid=Integer.valueOf(aidText.getText());
               }catch (NumberFormatException er){aid=0;aidText.setText("0");}               
                 textArea.append("TestButton\r\n");               
                 idandPlaces(a,b); 
                 //hier tauschen testen
                 
                }           
            });
            } 
      Button changeButton; 
            {changeButton=new Button("exchangeButtons");              
            changeButton.setBounds(220,680,140,30);
            add(changeButton);
            changeButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                                
                  Integer a1=-1; Integer b1=-1;Integer aid1=-1;Integer bid1=-1;
                  Integer aplace1=-1;Integer bplace1=-1;
                try {
                 a1=Integer.valueOf(aText1.getText());
               }catch (NumberFormatException er){a1=0;aText.setText("0");}
                                          
               try { aid1=Integer.valueOf(aidText1.getText());
               }catch (NumberFormatException er){aid1=0;aidText1.setText("0");} 
                              
               try { aplace1=Integer.valueOf(aplaceText1.getText());
               }catch (NumberFormatException er){aplace1=0;aplaceText.setText("0");} 
               
               try {
                 b1=Integer.valueOf(bText1.getText());
               }catch (NumberFormatException er){b1=0;bText1.setText("0");}
               
               try { bplace1=Integer.valueOf(bplaceText1.getText());
               }catch (NumberFormatException er){bplace1=0;bplaceText1.setText("0");} 
               
                try { bid1=Integer.valueOf(bidText1.getText());
               }catch (NumberFormatException er){bid1=0;bidText1.setText("0");}  
                               
                 //exchangePlaces(a,b,aid,bid);
               exchangePlaces(a1, aplace1, aid1, b1, bplace1, bid1) ;
                 RotZ.ZAction();
                 Rot_z.z_Action();                                 
                }           
            });
            }  
            Button changeId; 
            {changeId=new Button("change_A_Id");              
            changeId.setBounds(20,680,140,30);
            add(changeId);
            changeId.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                                
                  Integer a1=-1; Integer b1=-1;Integer aid1=-1;Integer bid1=-1;
                  Integer aplace1=-1;Integer bplace1=-1;
                try {
                 a1=Integer.valueOf(aText1.getText());
               }catch (NumberFormatException er){a1=0;aText.setText("0");}
                                          
               try { aid1=Integer.valueOf(aidText1.getText());
               }catch (NumberFormatException er){aid1=0;aidText1.setText("0");} 
                              
               try { aplace1=Integer.valueOf(aplaceText1.getText());
               }catch (NumberFormatException er){aplace1=0;aplaceText.setText("0");} 
                             
                 changeId(a1,aid1);
               //exchangePlaces(a1, aplace1, aid1, b1, bplace1, bid1) ;
                 RotZ.ZAction();
                 Rot_z.z_Action();                                 
                }           
            });
            } 
            
         
         setTitle("Rubik's Cube Console");
         setBounds(10,10,720,520);
         //setBounds(10,10,720,720);
         setResizable(false);
         setLayout(null);
                 
         myJ3dFrame=new J3dFrame("J3dFrame");
         myJ3dFrame.setBounds(740,10,460,460);
         myJ3dFrame.setVisible(true);
         setVisible(true);
    }
   public void itemStateChanged(java.awt.event.ItemEvent event)
    {
       Object object = event.getSource();
       if (object == exampleChoice)
       {
       	int i  = exampleChoice.getSelectedIndex();
        //String s=exampleChoice.getSelectedItem();
        inputText.setText(sArray[i][1]);
       }
       if (object == generatorChoice)
       {
       	int i  = generatorChoice.getSelectedIndex();
        //String s=exampleChoice.getSelectedItem();
        generatorsText.setText(gArray[i][1]);
       }
        if (object == macroChoice)
       {
       	int i  = macroChoice.getSelectedIndex();
       
        inputText.setText(macroArray[i][1]);
        textArea.append(macroArray[i][2]+"\r\n");
       }
       if (object == placemacroChoice)
       {
       	int i  = placemacroChoice.getSelectedIndex();
       
        inputText.setText(placemacroArray[i][1]);
        textArea.append(placemacroArray[i][2]+"\r\n");
       }
           
    }
 /*   
  public void adjustmentValueChanged(AdjustmentEvent e) {
          id  = HSelectora.getValue();
          cubiText.setText(""+cubi);
          placeText.setText(""+place);
          HSelectora.setValue (id);
          cubiChoice.select(cubi);        
          //changeId(cubi,id);
         idText.setText(" "+(id));
         idChoice.select(id);
    
  }
*/
   public static void main(String[] args) 
    {  
         ActionFrame actionFrame= new ActionFrame();  
    } 
    class PrintThread extends Thread
    {public void run() {
        
         textArea.append("Hello from a thread!"+"/r/n");
    }    
    }
}
