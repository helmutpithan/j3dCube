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
 * @author (Helmut Pithan h.pithan(at)t-online.de)
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
    					{"Cross","MNONOM"},
    					{"Spots","ONMnom"},
    					{"Wire","RLFBRLFBRLFBRRBBLLRRBBLL"},
    					{"Flipped","UBdFFDbuRRDFFdRRDFFdRR"},
    					{"PlusMinus","UURRLLUURRLL"},
    					{"Perpendicular","@rruurruurruuLLDDLLDDLLDDLLrr"},
    					{"CUBEinCube","FLFuRUFFLLulBdbLLU"},
    					{"CUBEinCUBEinCUBE","ulufRRbRFUBBUbLuFURf"},
    					{"ANACONDA","LUbuRlBrFbDRdf"},
    					{"Python","FFrbUrLfLfBdRBLL"},
    					{"Black MAMBA","RDLfRlDrUdBurd"},
    					{"Green MAMBA","RDRFrfBDrubUDD"},
    					{"Kilt","uRRLLFFBBuRLFbUFFDDRRLLFFUUFFuFF"},
    					{"Tetris","LRFBudlr"},
    					{"Superflip","URRFBRBBRUULBBRudRRFrLBBUUFF"},
    					{"LOGO","rlUUFFDDFFRLBBUUBBUU"},
    					{"Four Spots","FFBBUdRRLLUd"},
    					{"Six Spots","UdRlFbUd"},
    					{"CU","uuBBuLLDLLRRdbRdLrBBUUflu"},
    					{"easyCheckerBoard","MMNNOO"},
    					{"DeckerBoard","UDRlfBUdRRURRLLDDFFBBD"},
    					{"Fruit Bowl","BBLLFFRRFFRRDUBBUUbflrdu"},
    					{"Flower","RRDDRRUURRFFUUDDFFUU"},
    					{"Streifen","FUFRLLBdRDDLdBRRLFUF"},
    					{"Geschenk","UBBRRBBLLFFRRdFFLLBfLFFDuRRflr"},
    					{"CROSS","RRlDFFrdrLuDRDBBrUDD"},
    					{"4-CROSSES","UURRLLFFBBDDLLRRFFBB"},
    					{"Union Jack","UFbLLUULLfBUULLU"},
    					{"Squares","FFDFFDDLLULLuLLBDDRR"},
    					{"rechte obere Ecke kippen","RfrFRfrF"}, 
    					{"rdRD","rdRD"},
    					{"RUrURUUr","RUrURUUr"},
    					{"RuRFFrURFFRR","RuRFFrURFFRR"},
    					{"Cross&Dots","FUUDDRLuDFBRUURRUUFFLLUUFFLLBB"}
    						                  };
 String[][] gArray={ {"Generators",""},
 	                    {"Group","UDLRFBudlrfbMNOXYZmnoxyz"}, 	                    
    					{"Classic","UuDdFfBbLlRr"},
    					{"Sub1","UuFf"},
    					{"Sub2","UuFfLl"},
    					{"Sub3","UuLlDd"},
    					{"Sub4","MmDdUu"},
    					{"Sub5","FfLlRrBb"},
    					{"Sub6","MmNnOoUu"}
    						                  };   
    						                  
	String[][] macroArray={ {"Macros"," "," "},
   	   						                      
 	                        {"cycle_0_2_4","fDBdFDbd","p0->p2->p4->p0"},
 	                        {"cycle_0_2_6","lDRdLDrd","p0->p2->p6->p0"},
 	                        {"cycle_0_4_6","bDFdBDfd","p0->p4->p6->p0"}, 	                        
 	                        {"cycle_2_4_6","rDLdRDld","p2->p4->p6->p2"}, 	                        
 	                        {"cycle_0_2_4^-1","DBdfDbdF","p0->p4->p2->p0"},
 	                        {"cycle_0_2_6^-1","DRdlDrdL","p0->p6->p2->p0"},
 	                        {"cycle_0_4_6^-1","DFdbDfdB","p0->p6->p4->p0"}, 	                        
 	                        {"cycle_2_4_6^-1","DLdrDldR","p2->p6->p4->p2"},
 	                        
 	                        {"Cycle-1-3-5","RDDrblfDDFLB","Cycles three edge cubies 1-3-5"},
    					    {"Cycle-1-3-7","FDDfrblDDLBR","Cycles three edge cubies 1-3-7"},
    					    {"Cycle-1-5-7","LDDlfrbDDBRF","Cycles three edge cubies 1-5-7"},
    					    {"Cycle-3-5-7","BDDblfrDDRFL","Cycles three edge cubies 3-5-7"},
    					    
    					    {"Cycle-1-3-5^-1","blfddFLBRddr","Cycles three edge cubies 1-3-5"},
    					    {"Cycle-1-3-7^-1","rblddLBRFddf","Cycles three edge cubies 1-3-7"},
    					    {"Cycle-1-5-7^-1","frbddBRFLddl","Cycles three edge cubies 1-5-7"},
    					    {"Cycle-3-5-7^-1","lfrddRFLBddb","Cycles three edge cubies 3-5-7"},
    					                            
 	                        {"flip1&3","FLBRDrDblfrdRd","flips two adjacent edge cubies."}, 	                        
 	                        {"flip3&5","RFLBDbDlfrbdBd","flips two adjacent edge cubies."},
 	                        {"flip5&7","BRFLDlDfrbldLd","flips two adjacent edge cubies."},
 	                        {"flip7&1","LBRFDfDrblfdFd","flips two adjacent edge cubies."},
 	                        
 	                        {"flip1&5","LbDlBfDrBdRbFd","flip two opposite edge  cubies."},
 	                        {"flip3&7","FlDfLrDbLdBlRd","flip two opposite edge  cubies."},
 	                        
 	                        {"cycle_16_18_20","ULurUluR","p16->p18->p20->p16"},
   	   						{"cycle_16_18_22","UBufUbuF","p22->p16->p18->p22"},
   	   						{"cycle_16_18_20^-1","rULuRUlu","p16->p20->p18->p16"},
 	                        {"cycle_16_18_22^-1","fUBuFUbu","p22->p18->p16->p22"},
 	                        
 	                        {"flip17&19","RBLFUfUlbrfuFu","Flips two adjacent edge cubies."},
 	                        {"flip19&21","BLFRUrUflbruRu","Flips two adjacent edge cubies."},
 	                        {"flip21&23","LFRBUbUrflbuBu","Flips two adjacent edge cubies."},
 	                        {"flip23&17","FRBLUlUbrfluLu","Flips two adjacent edge cubies."},
 	                        
 	                        {"flip17&21","LfUlFbUrFuRfBu","flip two opposite edge  cubies."},
 	                        {"flip19&23","FrUfRlUbRuBrLu","flip two opposite edge  cubies."}, 	 
 	                        
 	                        {"swap_2_4","fDBdFDbdDFdbDfdB","swaps cubis on 2 and 4"}
 	                         					
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
                   	   
                   case 77  :Rot_M_X.M_X_Action(); break;
                   case 109 :Rot_M_invX.M_invX_Action(); break;  
                   case 78  :Rot_M_Y.M_Y_Action(); break;
                   case 110 :Rot_M_invY.M_invY_Action();break;
                   case 79  :Rot_M_Z.M_Z_Action(); break;
                   case 111 :Rot_M_invZ.M_invZ_Action();break;   
                   	                     	   
                   case 88  :Rot_X.X_Action(); break;
                   case 120 :Rot_invX.invX_Action(); break;  
                   case 89  :Rot_Y.Y_Action(); break;
                   case 121 :Rot_invY.invY_Action();break;
                   case 90  :Rot_Z.Z_Action(); break;
                   case 122 :Rot_invZ.invZ_Action();break;
                   	   
                   	   
                   default:System.out.println("Fehler in der Eingabe!");                 
                    }
            }
 /*
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
      case 8:cubiA=J3dFrame.cubi8; break;
      //case 9:cubiA=J3dFrame.cubi9; break;
      case 10:cubiA=J3dFrame.cubi10; break;
      //case 11:cubiA=J3dFrame.cubi11; break;
      case 12:cubiA=J3dFrame.cubi12; break;
      //case 13:cubiA=J3dFrame.cubi13; break;
      case 14:cubiA=J3dFrame.cubi14; break;
      //case 15:cubiA=J3dFrame.cubi15; break;
      case 16:cubiA=J3dFrame.cubi16; break;
      case 17:cubiA=J3dFrame.cubi17; break;
      case 18:cubiA=J3dFrame.cubi18; break;
      case 19:cubiA=J3dFrame.cubi19; break;
      case 20:cubiA=J3dFrame.cubi20; break;
      case 21:cubiA=J3dFrame.cubi21; break;
      case 22:cubiA=J3dFrame.cubi22; break;
      case 23:cubiA=J3dFrame.cubi23; break;	  
      default:System.out.println("Achsencubi");	  
	 }
	 
    cubiA.setId(aid);
       
  } 
  */
  /*
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
      case 8:cubiA=J3dFrame.cubi8; break;
      //case 9:cubiA=J3dFrame.cubi9; break;
      case 10:cubiA=J3dFrame.cubi10; break;
      //case 11:cubiA=J3dFrame.cubi11; break;
      case 12:cubiA=J3dFrame.cubi12; break;
      //case 13:cubiA=J3dFrame.cubi13; break;
      case 14:cubiA=J3dFrame.cubi14; break;
      //case 15:cubiA=J3dFrame.cubi15; break;
      case 16:cubiA=J3dFrame.cubi16; break;
      case 17:cubiA=J3dFrame.cubi17; break;
      case 18:cubiA=J3dFrame.cubi18; break;
      case 19:cubiA=J3dFrame.cubi19; break;
      case 20:cubiA=J3dFrame.cubi20; break;
      case 21:cubiA=J3dFrame.cubi21; break;
      case 22:cubiA=J3dFrame.cubi22; break;
      case 23:cubiA=J3dFrame.cubi23; break;	  
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
      case 8:cubiB=J3dFrame.cubi8; break;
      //case 9:cubiB=J3dFrame.cubi9; break;
      case 10:cubiB=J3dFrame.cubi10; break;
      //case 11:cubiB=J3dFrame.cubi11; break;
      case 12:cubiB=J3dFrame.cubi12; break;
      //case 13:cubiB=J3dFrame.cubi13; break;
      case 14:cubiB=J3dFrame.cubi14; break;
      //case 15:cubiB=J3dFrame.cubi15; break;
      case 16:cubiB=J3dFrame.cubi16; break;
      case 17:cubiB=J3dFrame.cubi17; break;
      case 18:cubiB=J3dFrame.cubi18; break;
      case 19:cubiB=J3dFrame.cubi19; break;
      case 20:cubiB=J3dFrame.cubi20; break;
      case 21:cubiB=J3dFrame.cubi21; break;
      case 22:cubiB=J3dFrame.cubi22; break;
      case 23:cubiB=J3dFrame.cubi23; break;
      default:System.out.println("Achsencubi");	  
	 }
	 //placeA =cubiA.getPlace();
     //=cubiA.getId();
     //aidText.setText(""+idA);
     //placeB =cubiB.getPlace();
     //idB=cubiB.getId();
     //bidText.setText(""+idB);
    cubiA.setPlace( aplace);
    cubiA.setId(aid);
    
    cubiB.setPlace(bplace);  
    cubiB.setId(bid);
  }
  */
            
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
      case 8:cubiA=J3dFrame.cubi8; break;
      //case 9:cubiA=J3dFrame.cubi9; break;
      case 10:cubiA=J3dFrame.cubi10; break;
      //case 11:cubiA=J3dFrame.cubi11; break;
      case 12:cubiA=J3dFrame.cubi12; break;
      //case 13:cubiA=J3dFrame.cubi13; break;
      case 14:cubiA=J3dFrame.cubi14; break;
      //case 15:cubiA=J3dFrame.cubi15; break;
      case 16:cubiA=J3dFrame.cubi16; break;
      case 17:cubiA=J3dFrame.cubi17; break;
      case 18:cubiA=J3dFrame.cubi18; break;
      case 19:cubiA=J3dFrame.cubi19; break;
      case 20:cubiA=J3dFrame.cubi20; break;
      case 21:cubiA=J3dFrame.cubi21; break;
      case 22:cubiA=J3dFrame.cubi22; break;
      case 23:cubiA=J3dFrame.cubi23; break;	  
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
      case 8:cubiB=J3dFrame.cubi8; break;
      //case 9:cubiB=J3dFrame.cubi9; break;
      case 10:cubiB=J3dFrame.cubi10; break;
      //case 11:cubiB=J3dFrame.cubi11; break;
      case 12:cubiB=J3dFrame.cubi12; break;
      //case 13:cubiB=J3dFrame.cubi13; break;
      case 14:cubiB=J3dFrame.cubi14; break;
      //case 15:cubiB=J3dFrame.cubi15; break;
      case 16:cubiB=J3dFrame.cubi16; break;
      case 17:cubiB=J3dFrame.cubi17; break;
      case 18:cubiB=J3dFrame.cubi18; break;
      case 19:cubiB=J3dFrame.cubi19; break;
      case 20:cubiB=J3dFrame.cubi20; break;
      case 21:cubiB=J3dFrame.cubi21; break;
      case 22:cubiB=J3dFrame.cubi22; break;
      case 23:cubiB=J3dFrame.cubi23; break;
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
   
     public void reset()
   {             J3dFrame.cubi0.reset();
                 J3dFrame.cubi1.reset();
                 J3dFrame.cubi2.reset();
                 J3dFrame.cubi3.reset();
                 J3dFrame.cubi4.reset();
                 J3dFrame.cubi5.reset();
                 J3dFrame.cubi6.reset();
                 J3dFrame.cubi7.reset();
                 J3dFrame.cubi8.reset();
                 J3dFrame.cubi9.reset();
                 J3dFrame.cubi10.reset();
                 J3dFrame.cubi11.reset();
                 J3dFrame.cubi12.reset();
                 J3dFrame.cubi13.reset();
                 J3dFrame.cubi14.reset();
                 J3dFrame.cubi15.reset();
                 J3dFrame.cubi16.reset();
                 J3dFrame.cubi17.reset();
                 J3dFrame.cubi18.reset();
                 J3dFrame.cubi19.reset();
                 J3dFrame.cubi20.reset();
                 J3dFrame.cubi21.reset();
                 J3dFrame.cubi22.reset();
                 J3dFrame.cubi23.reset();
                 J3dFrame.cubi24.reset();
                 J3dFrame.cubi25.reset();
                 
                 
                 
                
                 J3dFrame.showCubi0=true;
                 J3dFrame.showCubi1=true;
                 J3dFrame.showCubi2=true;
                 J3dFrame.showCubi3=true;
                 J3dFrame.showCubi4=true;
                 J3dFrame.showCubi5=true;
                 J3dFrame.showCubi6=true;
                 J3dFrame.showCubi7=true;
                 J3dFrame.showCubi8=true;
                 J3dFrame.showCubi9=true;
                 J3dFrame.showCubi10=true;
                 J3dFrame.showCubi11=true;
                 J3dFrame.showCubi12=true;
                 J3dFrame.showCubi13=true;
                 J3dFrame.showCubi14=true;                 
                 J3dFrame.showCubi15=true;
                 J3dFrame.showCubi16=true;
                 J3dFrame.showCubi17=true;
                 J3dFrame.showCubi18=true;
                 J3dFrame.showCubi19=true;
                 J3dFrame.showCubi20=true;
                 J3dFrame.showCubi21=true;
                 J3dFrame.showCubi22=true;
                 J3dFrame.showCubi23=true;
                 J3dFrame.showCubi24=true;
                 J3dFrame.showCubi25=true;
                
                 
                  
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
                    
                    J3dFrame.cubi4BranchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,4,J3dFrame.cubi4.colors);
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
                    
                    J3dFrame.cubi5BranchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,5,J3dFrame.cubi5.colors);
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
                    
                    J3dFrame.cubi6BranchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,6,J3dFrame.cubi6.colors);
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
                    
                    J3dFrame.cubi7BranchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,7,J3dFrame.cubi7.colors);
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi7) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi7BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi8BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi8BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi8BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi8BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi8BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi8BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi8BranchGroup);
                    
                    J3dFrame.cubi8BranchGroup=J3dFrame.cubi8.getCubi8BranchGroup(J3dFrame.cubi8BranchGroup,8,0,J3dFrame.cubi8.colors);
                    J3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi8) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi8BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi9BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi9BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi9BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi9BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi9BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi9BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi9BranchGroup);
                    
                    J3dFrame.cubi9BranchGroup=J3dFrame.cubi9.getCubi9BranchGroup(J3dFrame.cubi9BranchGroup,9,1,J3dFrame.cubi9.colors);
                    J3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi9) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi9BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi10BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi10BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi10BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi10BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi10BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi10BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi10BranchGroup);
                    
                    J3dFrame.cubi10BranchGroup=J3dFrame.cubi10.getCubi10BranchGroup(J3dFrame.cubi10BranchGroup,10,2,J3dFrame.cubi10.colors);
                    J3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi10) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi10BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi11BranchGroup); 
                    J3dFrame.plainD.removeChild(J3dFrame.cubi11BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi11BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi11BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi11BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi11BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi11BranchGroup);
                    
                    J3dFrame.cubi11BranchGroup=J3dFrame.cubi11.getCubi11BranchGroup(J3dFrame.cubi11BranchGroup,11,3,J3dFrame.cubi11.colors);
                    J3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi11) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi11BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi12BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi12BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi12BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi12BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi12BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi12BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi12BranchGroup);
                    
                    J3dFrame.cubi12BranchGroup=J3dFrame.cubi12.getCubi12BranchGroup(J3dFrame.cubi12BranchGroup,12,4,J3dFrame.cubi12.colors);
                    J3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                    if(J3dFrame.showCubi12) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi12BranchGroup);
                                        
                    J3dFrame.plainU.removeChild(J3dFrame.cubi13BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi13BranchGroup);
                    J3dFrame.plainL.removeChild(J3dFrame.cubi13BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi13BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi13BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi13BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi13BranchGroup);
                    
                    J3dFrame.cubi13BranchGroup=J3dFrame.cubi13.getCubi13BranchGroup(J3dFrame.cubi13BranchGroup,13,5,J3dFrame.cubi13.colors);
                    J3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi13) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi13BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi14BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi14BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi14BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi14BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi14BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi14BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi14BranchGroup);
                    
                    J3dFrame.cubi14BranchGroup=J3dFrame.cubi14.getCubi14BranchGroup(J3dFrame.cubi14BranchGroup,14,6,J3dFrame.cubi14.colors);
                    J3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi14) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi14BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi15BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi15BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi15BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi15BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi15BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi15BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi15BranchGroup);
                    
                    J3dFrame.cubi15BranchGroup=J3dFrame.cubi15.getCubi15BranchGroup(J3dFrame.cubi15BranchGroup,15,7,J3dFrame.cubi15.colors);
                    J3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi15) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi15BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi16BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi16BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi16BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi16BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi16BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi16BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi16BranchGroup);
                    
                    J3dFrame.cubi16BranchGroup=J3dFrame.cubi16.getCubi16BranchGroup(J3dFrame.cubi16BranchGroup,16,24,J3dFrame.cubi16.colors);
                    J3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi16) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi16BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi17BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi17BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi17BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi17BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi17BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi17BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi17BranchGroup);
                    
                    J3dFrame.cubi17BranchGroup=J3dFrame.cubi17.getCubi17BranchGroup(J3dFrame.cubi17BranchGroup,17,25,J3dFrame.cubi17.colors);
                    J3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi17) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi17BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi18BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi18BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi18BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi18BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi18BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi18BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi18BranchGroup);
                    
                    J3dFrame.cubi18BranchGroup=J3dFrame.cubi18.getCubi18BranchGroup(J3dFrame.cubi18BranchGroup,18,26,J3dFrame.cubi18.colors);
                    J3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi18) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi18BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi19BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi19BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi19BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi19BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi19BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi19BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi19BranchGroup);
                    
                    J3dFrame.cubi19BranchGroup=J3dFrame.cubi19.getCubi19BranchGroup(J3dFrame.cubi19BranchGroup,19,27,J3dFrame.cubi19.colors);
                    J3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi19) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi19BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi20BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi20BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi20BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi20BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi20BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi20BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi20BranchGroup);
                    
                    J3dFrame.cubi20BranchGroup=J3dFrame.cubi20.getCubi20BranchGroup(J3dFrame.cubi20BranchGroup,20,28,J3dFrame.cubi20.colors);
                    J3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi20) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi20BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi21BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi21BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi21BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi21BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi21BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi21BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi21BranchGroup);
                    
                    J3dFrame.cubi21BranchGroup=J3dFrame.cubi21.getCubi21BranchGroup(J3dFrame.cubi21BranchGroup,21,29,J3dFrame.cubi21.colors);
                    J3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi21) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi21BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi22BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi22BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi22BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi22BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi22BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi22BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi22BranchGroup);
                    
                    J3dFrame.cubi22BranchGroup=J3dFrame.cubi22.getCubi22BranchGroup(J3dFrame.cubi22BranchGroup,22,30,J3dFrame.cubi22.colors);
                    J3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi22) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi22BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi23BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi23BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi23BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi23BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi23BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi23BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi23BranchGroup);
                    
                    J3dFrame.cubi23BranchGroup=J3dFrame.cubi23.getCubi23BranchGroup(J3dFrame.cubi23BranchGroup,23,31,J3dFrame.cubi23.colors);
                    J3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi23) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi23BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi24BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi24BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi24BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi24BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi24BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi24BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi24BranchGroup);
                    
                    J3dFrame.cubi24BranchGroup=J3dFrame.cubi24.getCubi24BranchGroup(J3dFrame.cubi24BranchGroup,24,0,J3dFrame.cubi24.colors);
                    J3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi24) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi24BranchGroup);
                    
                    J3dFrame.plainU.removeChild(J3dFrame.cubi25BranchGroup);
                    J3dFrame.plainD.removeChild(J3dFrame.cubi25BranchGroup); 
                    J3dFrame.plainL.removeChild(J3dFrame.cubi25BranchGroup);
                    J3dFrame.plainR.removeChild(J3dFrame.cubi25BranchGroup);
                    J3dFrame.plainF.removeChild(J3dFrame.cubi25BranchGroup);
                    J3dFrame.plainB.removeChild(J3dFrame.cubi25BranchGroup);
                    J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi25BranchGroup);
                    
                    J3dFrame.cubi25BranchGroup=J3dFrame.cubi25.getCubi25BranchGroup(J3dFrame.cubi25BranchGroup,25,25,J3dFrame.cubi25.colors);
                    J3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                    J3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                    J3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                    J3dFrame.cubi25BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );        
                    if(J3dFrame.showCubi25) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi25BranchGroup);
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
              (J3dFrame.cubi4.getPlace()==4) && (J3dFrame.cubi4.getId()==4)
              &&
              (J3dFrame.cubi5.getPlace()==5) && (J3dFrame.cubi5.getId()==5)
              &&
              (J3dFrame.cubi6.getPlace()==6) && (J3dFrame.cubi6.getId()==6)              
              &&
              (J3dFrame.cubi7.getPlace()==7) && (J3dFrame.cubi7.getId()==7)
              &&
              (J3dFrame.cubi8.getPlace()==8) && (J3dFrame.cubi8.getId()==0)
              &&
              (J3dFrame.cubi9.getPlace()==9) && (J3dFrame.cubi9.getId()==1)
              &&
              (J3dFrame.cubi10.getPlace()==10) && (J3dFrame.cubi10.getId()==2)
              &&
              (J3dFrame.cubi11.getPlace()==11) && (J3dFrame.cubi11.getId()==3)
              &&
              (J3dFrame.cubi12.getPlace()==12) && (J3dFrame.cubi12.getId()==4)
              &&
              (J3dFrame.cubi13.getPlace()==13) && (J3dFrame.cubi13.getId()==5)
              &&
              (J3dFrame.cubi14.getPlace()==14) && (J3dFrame.cubi14.getId()==6)
              &&
              (J3dFrame.cubi15.getPlace()==15) && (J3dFrame.cubi15.getId()==7)
              &&
              (J3dFrame.cubi16.getPlace()==16) && (J3dFrame.cubi16.getId()==24)
              &&
              (J3dFrame.cubi17.getPlace()==17) && (J3dFrame.cubi17.getId()==25)
              &&
              (J3dFrame.cubi18.getPlace()==18) && (J3dFrame.cubi18.getId()==26)
              &&
              (J3dFrame.cubi19.getPlace()==19) && (J3dFrame.cubi19.getId()==27)
              &&
              (J3dFrame.cubi20.getPlace()==20) && (J3dFrame.cubi20.getId()==28)
              &&
              (J3dFrame.cubi21.getPlace()==21) && (J3dFrame.cubi21.getId()==29)
              &&
              (J3dFrame.cubi22.getPlace()==22) && (J3dFrame.cubi22.getId()==30)
              &&
              (J3dFrame.cubi23.getPlace()==23) && (J3dFrame.cubi23.getId()==31)
              &&
              (J3dFrame.cubi24.getPlace()==24) && (J3dFrame.cubi24.getId()==0)
              &&
              (J3dFrame.cubi25.getPlace()==25) && (J3dFrame.cubi25.getId()==25);
          return e;
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
         
         Rot_M_X rot_M_X=new Rot_M_X(myJ3dFrame,20,230,70,30);
         rotAchse_M_X= rot_M_X.getrotAchse_M_X();
         add(rotAchse_M_X);
         
         Rot_M_invX rot_M_invX=new Rot_M_invX(myJ3dFrame,100,230,70,30);
         rotAchse_M_invX=rot_M_invX.getrotAchse_M_invX();
         add(rotAchse_M_invX);
         
         Rot_M_Y rot_M_Y=new Rot_M_Y(myJ3dFrame,20,260,70,30);
         rotAchse_M_Y= rot_M_Y.getrotAchse_M_Y();
         add(rotAchse_M_Y);
         
         Rot_M_invY rot_M_invY=new Rot_M_invY(myJ3dFrame,100,260,70,30);
         rotAchse_M_invY=rot_M_invY.getrotAchse_M_invY();
         add(rotAchse_M_invY);
         
         Rot_M_Z rot_M_Z=new Rot_M_Z(myJ3dFrame,20,290,70,30);
         rotAchse_M_Z= rot_M_Z.getrotAchse_M_Z();
         add(rotAchse_M_Z);
         
         Rot_M_invZ rot_M_invZ=new Rot_M_invZ(myJ3dFrame,100,290,70,30);
         rotAchse_M_invZ=rot_M_invZ.getrotAchse_M_invZ();
         add(rotAchse_M_invZ);
                  
         Rot_X rot_X=new Rot_X(myJ3dFrame,20,350,70,30);
         rot_X.rotAchse_X= rot_X.getrotAchse_X();
         add(rot_X.rotAchse_X);
         
         Rot_invX rot_invX=new Rot_invX(myJ3dFrame,100,350,70,30);
         rot_invX.rotAchse_invX= rot_invX.getrotAchse_invX();
         add(rot_invX.rotAchse_invX);
         
         Rot_Y rot_Y=new Rot_Y(myJ3dFrame,20,380,70,30);
         rot_Y.rotAchse_Y= rot_Y.getrotAchse_Y();
         add(rot_Y.rotAchse_Y);
         
         Rot_invY rot_invY=new Rot_invY(myJ3dFrame,100,380,70,30);
         rot_invY.rotAchse_invY= rot_invY.getrotAchse_invY();
         add(rot_invY.rotAchse_invY);
                
         Rot_Z rot_Z=new Rot_Z(myJ3dFrame,20,410,70,30);
         rot_Z.rotAchse_Z= rot_Z.getrotAchse_Z();
         add(rot_Z.rotAchse_Z);
         
         Rot_invZ rot_invZ=new Rot_invZ(myJ3dFrame,100,410,70,30);
         rot_invZ.rotAchse_invZ= rot_invZ.getrotAchse_invZ();
         add(rot_invZ.rotAchse_invZ);
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
          clrTextAreaButton.setBounds(500,420,80,30);
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
            
         
            
       
    generatorsText=new TextField("UDLRFBudlrfbMNOXYZmnoxyz");    
          //generatorsText.setBounds(260,180,210,30);
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
               textArea.append(r+"\r\n");
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
               { System.out.println("####################Start: k="+k+"  ##############");               	                 	  
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
               System.out.println(r);
                int l=r.length();
               for (int i=0;i<l;i++)
                {int a=r.charAt(i);                           
                 action(a);}
                 
                textArea.append("\r\nAchsen ausrichten\r\n");
                WhiteCross whiteCross=new WhiteCross(myJ3dFrame,0); 
                if(!myJ3dFrame.axesReady()) {System.out.print("AxesReady="+myJ3dFrame.axesReady());break;}
              
                textArea.append("\r\nWhite_Cross\r\n");
                 whiteCross=new WhiteCross(myJ3dFrame);
                  if(!myJ3dFrame.whiteCrossReady()) {System.out.print("WhiteCrossReady="+myJ3dFrame.whiteCrossReady());break;}
              
                textArea.append("\r\nUp_Corners\r\n");
                UpCorners upCorners=new UpCorners(myJ3dFrame);
                if(!myJ3dFrame.upCornersReady()) {System.out.print("UpCornersReady="+myJ3dFrame.upCornersReady());break;}
                
                textArea.append("\r\nMiddlePlain\r\n");
                MiddlePlain middlePlain=new MiddlePlain(myJ3dFrame);
                if(!myJ3dFrame.middlePlainReady()) {System.out.print("MddlePlainReady="+myJ3dFrame.middlePlainReady());break;}
               
                textArea.append("\r\nYellowCross\r\n");
                YellowCross yellowCross=new YellowCross(myJ3dFrame);
                if(!myJ3dFrame.yellowCrossReady()) {System.out.print("YellowCrossReady="+myJ3dFrame.yellowCrossReady());break;}
                
                textArea.append("\r\nDownCorners\r\n");
                DownCorners downCorners=new DownCorners(myJ3dFrame);
                if(!myJ3dFrame.downPlainReady()) {System.out.print("DownPlainReadyy="+myJ3dFrame.downPlainReady());break;}
                 textArea.append("\r\n");                         
               
                textArea.append(k+".successful: "+erfolgreich()+"\r\n");                          
                k=k+1; 
               
              }//
              while (erfolgreich()&& k<m+1);
            
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
       
      Button achsenButton; 
         {achsenButton=new Button("Axes");              
         achsenButton.setBounds(5,480,105,30);
         add(achsenButton);
         achsenButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             {                  
                  
              textArea.append("\r\nAchsen ausrichten\r\n");
              WhiteCross whiteCross=new WhiteCross(myJ3dFrame,0);
                                 
             }           
            });
            } 
      Button achsenTestButton; 
         {achsenTestButton=new Button("AxesTest");              
         achsenTestButton.setBounds(5,540,105,30);
         add(achsenTestButton);
         achsenTestButton.addActionListener(new ActionListener()
         { public void actionPerformed(ActionEvent e)
             {                  
                  
              textArea.append("\r\nAchsen ausrichten\r\n");
              WhiteCross whiteCross=new WhiteCross(myJ3dFrame,1);
                                 
             }           
            });
            } 
      Button whiteCrossButton; 
            {whiteCrossButton=new Button("WhiteCross");              
            whiteCrossButton.setBounds(115,480,105,30);
            add(whiteCrossButton);
            whiteCrossButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  
                  textArea.append("\r\nWhite_Cross\r\n");
                  WhiteCross whiteCross=new WhiteCross(myJ3dFrame);
                  
                                 
                }           
            });
            }
            
    Button whiteCrossTestButton; 
            {whiteCrossTestButton=new Button("wCrossTest");              
            whiteCrossTestButton.setBounds(115,540,105,30);
            add(whiteCrossTestButton);
            whiteCrossTestButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                                    
                  textArea.append("\r\nWhite_Cross_Test\r\n");
                   WhiteCross whiteCross=new WhiteCross(myJ3dFrame,"Test");
                                                  
                }           
            });
            } 
            
    Button upCornersButton; 
            {upCornersButton=new Button("UpCorners");              
            upCornersButton.setBounds(225,480,105,30);
            add(upCornersButton);
            upCornersButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  
                  textArea.append("\r\nUp_Corners\r\n");
                  UpCorners upCorners=new UpCorners(myJ3dFrame);
                  
                                 
                }           
            });
            }
            
   Button upPlainTestButton; 
            {upPlainTestButton=new Button("upTest");              
            upPlainTestButton.setBounds(225,540,105,30);
            add(upPlainTestButton);
            upPlainTestButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                                    
                  textArea.append("\r\nUp_Corners_Test\r\n");
                  UpCorners upCorners=new UpCorners(myJ3dFrame,"Test");                                 
                }           
            });
            } 
            
    Button middlePlainButton; 
            {middlePlainButton=new Button("MiddlePlain");              
            middlePlainButton.setBounds(335,480,105,30);
            add(middlePlainButton);
            middlePlainButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  
                  textArea.append("\r\nMiddlePlain\r\n");
                  MiddlePlain middlePlain=new MiddlePlain(myJ3dFrame);
                 
                                 
                }           
            });
            } 
     Button middlePlainTestButton; 
            {middlePlainTestButton=new Button("middleTest");              
            middlePlainTestButton.setBounds(335,540,105,30);
            add(middlePlainTestButton);
            middlePlainTestButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                                    
                  textArea.append("\r\n middelPlain_Test\r\n");                  
                   MiddlePlain middlePlain=new MiddlePlain(myJ3dFrame,"Test");                                 
                }           
            });
            } 
            
       Button yellowCross; 
            {yellowCross=new Button("YellowCross");              
            yellowCross.setBounds(445,480,105,30);
            add(yellowCross);
            yellowCross.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  
                  textArea.append("\r\nYellowCross\r\n");
                  YellowCross yellowCross=new YellowCross(myJ3dFrame);
                                 
                }           
            });
            }
            
       Button yellowTestButton; 
            {yellowTestButton=new Button("yellowTest");              
            yellowTestButton.setBounds(445,540,105,30);
            add(yellowTestButton);
            yellowTestButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                                    
                  textArea.append("\r\nYellowPlainTest\r\n");                  
                  YellowCross yellowCross=new YellowCross(myJ3dFrame,"Test");                                 
                }           
            });
            } 
            
       Button downCornersButton; 
            {downCornersButton=new Button("DownCorners");              
            downCornersButton.setBounds(555,480,110,30);
            add(downCornersButton);
            downCornersButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  
                  textArea.append("\r\nDownCorners\r\n");
                 DownCorners downCorners=new DownCorners(myJ3dFrame);
                                 
                }           
            });
            } 
            
            
            
      Button downPlainTestButton; 
            {downPlainTestButton=new Button("down_Test");              
            downPlainTestButton.setBounds(555,540,105,30);
            add(downPlainTestButton);
            downPlainTestButton.addActionListener(new ActionListener()
            { public void actionPerformed(ActionEvent e)
                {                  
                  
                  textArea.append("\r\nDownPlain_Test\r\n");
                  DownCorners downCorners=new DownCorners(myJ3dFrame,"Test");
                 
                                 
                }           
            });
            } 
            
     
 
         setTitle("3x3-Cube Console");
         //setBounds(10,10,720,460);
         setBounds(10,10,720,720);
         setResizable(false);
         setLayout(null);
         
              
         myJ3dFrame=new J3dFrame("J3dFrame");
         myJ3dFrame.setBounds(820,10,480,400);
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
