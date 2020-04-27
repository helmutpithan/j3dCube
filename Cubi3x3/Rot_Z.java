import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
/**
 * Write a description of class RotDown here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */

public class Rot_Z extends Rot
{ static J3dFrame myJ3dFrame;
  Button rotAchse_Z;
  static boolean f;
  static Set<Integer> setD=new HashSet<Integer>();     
  Button getrotAchse_Z()
    { return rotAchse_Z;
      }
  static public void Z_Action()
  {        //Down- Ebene
  	        if(myJ3dFrame.showCubi0) setD.add(0);
            if(myJ3dFrame.showCubi1) setD.add(1);
            if(myJ3dFrame.showCubi2) setD.add(2);
            if(myJ3dFrame.showCubi3) setD.add(3);
            if(myJ3dFrame.showCubi4) setD.add(4);
            if(myJ3dFrame.showCubi5) setD.add(5);
            if(myJ3dFrame.showCubi6) setD.add(6);
            if(myJ3dFrame.showCubi7) setD.add(7);
            //M_Z - Ebene
            if(myJ3dFrame.showCubi8) setD.add(8);
            if(myJ3dFrame.showCubi9) setD.add(9);
            if(myJ3dFrame.showCubi10) setD.add(10);
            if(myJ3dFrame.showCubi11) setD.add(11);
            if(myJ3dFrame.showCubi12) setD.add(12);
            if(myJ3dFrame.showCubi13) setD.add(13);
            if(myJ3dFrame.showCubi14) setD.add(14);
            if(myJ3dFrame.showCubi15) setD.add(15);
            
            //Up - Ebene
            if(myJ3dFrame.showCubi16) setD.add(16);
            if(myJ3dFrame.showCubi17) setD.add(17);
            if(myJ3dFrame.showCubi18) setD.add(18);
            if(myJ3dFrame.showCubi19) setD.add(19);
            if(myJ3dFrame.showCubi20) setD.add(20);
            if(myJ3dFrame.showCubi21) setD.add(21);
            if(myJ3dFrame.showCubi22) setD.add(22);
            if(myJ3dFrame.showCubi23) setD.add(23);
            
            if(myJ3dFrame.showCubi24) setD.add(24);
            if(myJ3dFrame.showCubi25) setD.add(25);
            
            ActionFrame.textArea.append("Z");
            
            int[] placeArray=new int[26];
            int[] nrArray=new int[26];
            
            
            f=finish();
            //System.out.println("f="+f);
            while(!f){ f=finish();}
             if(finish())
                { 
                    placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                    //myJ3dFrame.showCubisVisible();
                   //System.out.println("Z -->");
                    //zustandsAusgabe(nrArray,placeArray,setD);
                    
                  //Vorbereitung
                    for (int i=0;i<26;i++) 
                    switch(nrArray[i])
                       { case 0:
                                 if(setD.contains(i))
                                      {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setD.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi3BranchGroup);
                                       };break;
                         case 4: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi4BranchGroup);
                                      };break;
                         case 5: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi5BranchGroup);
                                       }
                                       ;break;
                         case 6: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi6BranchGroup);
                                       }
                                       ;break;
                         case 7: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi7BranchGroup);
                                       };break;
                         case 8: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi8BranchGroup);
                                      };break;
                         case 9: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi9BranchGroup);
                                      };break;
                         case 10: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi10BranchGroup);
                                       };break;
                         case 11: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi11BranchGroup);
                                      };break;                                                    
                         case 12: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi12BranchGroup);
                                      };break;
                         case 13: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi13BranchGroup);
                                      };break;
                         case 14: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi14BranchGroup);
                                      };break;
                         case 15: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi15BranchGroup);
                                      };break;
                         case 16: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi16BranchGroup);
                                      };break;
                         case 17: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi17BranchGroup);
                                      };break;
                         case 18: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi18BranchGroup);
                                      };break;
                         case 19: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi19BranchGroup);
                                      };break;
                         case 20: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi20BranchGroup);
                                      };break;
                         case 21: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi21BranchGroup);
                                      };break;
                         case 22: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi22BranchGroup);
                                      };break;
                         case 23: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi23BranchGroup);
                                      };break;
                         case 24: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24){ myJ3dFrame.plainD.addChild(myJ3dFrame.cubi24BranchGroup);}
                                       };break;
                         case 25: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25){ myJ3dFrame.plainD.addChild(myJ3dFrame.cubi25BranchGroup);}
                                       };break;
                          //bis case 23:             
                        }
                //Vorbereitung -->
                //Hierhin
                f=finish();
                while(!f){ f=finish();}
                 if(finish())
                {
               
                myJ3dFrame.DRotationInterpolator.setMinimumAngle(myJ3dFrame.Dwinkel+0f);
                myJ3dFrame.DRotationInterpolator.setMaximumAngle(myJ3dFrame.Dwinkel+(float)Math.PI/2);
                myJ3dFrame.Dalpha.setStartTime(System.currentTimeMillis()+100); //WarteZeit
                myJ3dFrame.Dwinkel=myJ3dFrame.Dwinkel+((float) Math.PI/2);
                //System.out.println("Down+Dwinkel"+myJ3dFrame.Dwinkel);
                
                // Warten auf Ende der Bewegung
                f=finish();              
                while(!f){ f=finish();}
                
                } 
                
                //Nachbereitung
                for (int i=0;i<26;i++)
                {
                	
                	
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                   
                       { case 0:// cubi0 
                                 if(setD.contains(i))
                                 {                                         
                                        int id=myJ3dFrame.cubi0.getId();
                                        int place =myJ3dFrame.cubi0.getPlace();                                                                              
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {// RotDown-->
                                         case 0:  
                                         switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,2,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i0->c0p2i2");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,18,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i16->c0p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,34,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i32->c0p2i34");
                                          break;
                                           default:
                                            	System.out.println("default:c0p0i"+id);   
                                            }
                                          ;break;

                                          case 2: 
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,4,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i2->c0p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,20,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i18->c0p4i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,36,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i34->c0p4i26");
                                          break;         
                                           default:
                                            	System.out.println("default:c0p2i"+id);   
                                            }
                                          ;break;
                                          
                                         case 4: 
                                          switch(id)
                                         {
                                          case 4:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,6,myJ3dFrame.cubi0.colors);  
                                         //System.out.println("c0p4i4->c0p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,22,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i20->c0p6i22");
                                          break;
                                                   
                                          case 36:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,38,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i36->c0p6i38");
                                          break;
                                           default:
                                            	System.out.println("default:c0p4i"+id);   
                                            }
                                          ;break;

                                          case 6: 
                                          switch(id)
                                         {
                                          case 6:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,0,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i6->c0p0i0");
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,16,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i22->c0p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,32,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i38->c0p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c0p6i"+id);  
                                            }
                                          ;break;
                                          // RotDown <--
                                          
                                         
                                          // Rotupp -->
                                          case 16: 
                                          switch(id)
                                         {                                          
                                          case 8:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,10,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i8->c0p18i10");
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,26,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i24->c0p18i26");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,42,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i40->c0p18i42");
                                          break;
                                            default:
                                            	System.out.println("default:c0p16i"+id); 
                                            }
                                          ;break;

                                        case 18:  
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,12,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i10->c0p20i12");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,28,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i26->c0p20i28");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,44,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i42->c0p20i44");
                                          break;
                                            default:
                                            	System.out.println("default:c0p18i"+id);  
                                            }
                                          ;break;                                 

                                       case 20: 
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,14,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i12->c0p22i14");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,30,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i28->c0p22i30");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,46,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i44->c0p22i46");
                                          break;
                                           default:
                                            	System.out.println("default:c0p20i"+id);   
                                            }
                                          ;break;
                                      
                                       case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,8,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i14->c0p16i8");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,24,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i30->c0p16i24");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,40,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i46->c0p16i4");
                                          break;
                                           default:
                                            	System.out.println("default:c0p22i"+id);   
                                            }
                                          ;break;
                                          //Rotupp

                                          }
                                         
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi0BranchGroup);
                                         myJ3dFrame.cubi0BranchGroup=branchGroup;
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi0) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi0BranchGroup);
                                                                               
                                       
                                    };break;
                                      
                         case 1: //cubi1 
                                if(setD.contains(i)) 
                                    {                                     
                                        int place =myJ3dFrame.cubi1.getPlace();
                                        int id=myJ3dFrame.cubi1.getId();
                                                                                                                      
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      { //RotDown -->
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,3,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p1i1->c1p3i3");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,37,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p1i35->c1p3i37");
                                          break;
                                        
                                            default:
                                            	System.out.println("default:c1p1i"+id);  
                                            }
                                          ;break;

                                         case 3:
                                         switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,5,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p3i3->c1p5i5");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,39,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p3i37->c1p5i39");
                                          break;
                                                                                   
                                           default:
                                            	System.out.println("default:c1p3i"+id);   
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,7,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p5i5->c1p7i7");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,33,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p2i10->c1p3i11");
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c1p5i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,1,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p7i7->c1p0i0");
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,35,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p3i11->c1p0i8");
                                          break;                                          
                                         
                                           default:
                                            	System.out.println("default:c1p7i"+id);   
                                            }
                                          ;break;
                                          
                                         // RotDown <--
                                          
                                         // Rot_M_Z-->
                                          
                                          case 8:
                                        switch(id)
                                         {                                       
                                          case 16:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,10,18,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p8i16->c1p10i18");
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,10,10,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p8i8->c1p10i10");
                                          break;
                                            default:
                                            	System.out.println("default:c1p8i"+id);  
                                            }
                                          ;break;
                                                                                                                            
                                           case 10:
                                          switch(id)
                                         {                                                                                  
                                          case 18:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,12,20,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p10i18->c1p12i20");
                                          break;
                                          
                                           case 10:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,12,12,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p10i10->c1p12i12");
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c1p10i"+id);  
                                            }
                                          ;break;
                                          
                                          case 12:
                                          switch(id)
                                         {                                                                                  
                                          case 20:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,14,22,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p12i20->c1p14i22");
                                          break;
                                          
                                           case 12:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,14,14,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p12i12->c1p14i14");
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c1p14i"+id);  
                                            }
                                          ;break;
                                          
                                          case 14:
                                          switch(id)
                                         {                                                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,8,16,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p10i20->c1p10i22");
                                          break;
                                          
                                           case 14:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,8,8,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p10i12->c1p10i14");
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c1p14i"+id);  
                                            }
                                          ;break;
                                          
                                          // Rot_M_Z<--
                                          
                                         
                                          // Rotupp-->
                                          
                                         case 17:
                                         switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,27,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p17i25->c1p19i27");
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,45,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p17i43->c1p19i45");
                                          break;                
                                          
                                           default:
                                            	System.out.println("default:c1p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,29,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i27->c1p21i29");
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,47,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i45->c1p21i47");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c1p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,31,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i29->c1p23i31");
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,41,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i47->c1p23i41");
                                          break;                                          

                                           default:
                                            	System.out.println("default:c1p211i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,25,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i31->c1p17i25");
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,43,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i41->c1p17i43");
                                          break;
                                                                                    
                                           default:
                                            	System.out.println("default:c1p23i"+id);   
                                            }
                                          ;break;

                                          // Rotupp<--
                                          }
                                           
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup);
                                         
                                      
                                    };break;
                                    
                         case 2://cubi2 
                                 if(setD.contains(i))
                                      {  
                                        
                                        int place =myJ3dFrame.cubi2.getPlace();
                                        int id=myJ3dFrame.cubi2.getId();
                                        
                                        
                                         
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	//RotDown --> 
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,2,myJ3dFrame.cubi2.colors);
                                            //System.out.println("c2p0i0->c2p2i2");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,18,myJ3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i8->c2p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,34,myJ3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i16->c2p2i34");
                                          break;
                                            default:
                                            	System.out.println("default:c2p0i"+id);  
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,4,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p2i2->c2p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,20,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p1i18->c2p2i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,36,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p1i34->c2p2i36");
                                          break;
                                            default:
                                            	System.out.println("default:c2p2i"+id);  
                                            }
                                          ;break;


                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,6,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i4->c2p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,22,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i20->c2p3i22");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,38,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i36->c2p3i38");
                                          break;
                                            default:
                                            	System.out.println("default:c2p4i"+id);  
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,0,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i6->c2p0i0");
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,16,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i22->c2p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,32,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i38->c2p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c2p6i"+id);  
                                            }
                                          ;break;
                                          //RotDown<--
                                          
                                          //Rotupp-->
                                          case 16:
                                          switch(id)
                                         {case 40:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,42,myJ3dFrame.cubi2.colors);
                                            //System.out.println("c2p16i40->c2p18i42");
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,26,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i24->c2p18i26");
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,10,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i8->c2p18i10");
                                          break;
                                            default:
                                            	System.out.println("default:c2p16i"+id); 
                                            }
                                          ;break;
                                          
                                            case 18:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,44,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i42->c2p20i44");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,28,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i26->c2p20i28");
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,12,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i10->c2p20i12");
                                          break;
                                            default:
                                            	System.out.println("default:c2p18i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,46,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i44->c2p22i46");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,30,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i28->c2p22i30");
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,14,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i12->c2p22i14");
                                          break;
                                           default:
                                            	System.out.println("default:c2p20i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,40,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i46->c2p16i40");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,24,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i30->c2p16i24");
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,8,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i14->c2p16i8");
                                          break;
                                           default:
                                            	System.out.println("default:c2p22i"+id);   
                                            }
                                          ;break;
                                          //Rotupp<--

                                          }
                                           
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi2BranchGroup);
                                         myJ3dFrame.cubi2BranchGroup=branchGroup;
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                       
                                         if(myJ3dFrame.showCubi2) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3:  //cubi3 
                                if(setD.contains(i))
                                  { 
                                        int place =myJ3dFrame.cubi3.getPlace();
                                        int id=myJ3dFrame.cubi3.getId();                                        
                                         
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      { //RotDown -->
                                         case 1:
                                         switch(id)
                                         {case 1:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,3,myJ3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i1->c3p3i3");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,37,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i35->c3p3i37");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c3p1i"+id);   
                                            }
                                          ;break;

                                           
                                         case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,5,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i3->c3p5i5");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,39,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i37->c3p5i39");
                                          break;
                                       
                                            default:
                                            	System.out.println("default:c3p3i"+id);  
                                            }
                                          ;break;

                                          
                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,7,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i5->c3p7i7");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,33,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i39->c3p7i33");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c3p5i"+id);   
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,1,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p7i7->c3p1i1");
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,35,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i33->c3p1i35");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c3p7i"+id);   
                                            }
                                          ;break;
                                          
                                          //RotDown <--
                                          //Rot_M_Z -->
                                         case 8:
                                          switch(id)
                                         {
                                         	 
                                         case 16:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,10,18,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p8i16->c3p10i18");
                                          break;	 

                                          case 8:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,10,10,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p8i8->c3p10i10");
                                          break;
                                          
                                          
                                            default:
                                            	System.out.println("default:c3p8i"+id);  
                                            }
                                          ;break;
                                         
                                          case 10:
                                          switch(id)
                                         {
                                          case 18:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,12,20,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p10i18->c3p12i20");
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,12,12,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p10i12->c3p12i12");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c3p10i"+id); 
                                            }
                                          ;break;
                                          
                                         case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,14,22,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p12i20->c3p14i22");
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,14,14,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p12i12->c3p14i14");
                                          break;
                                                                                   
                                           default:
                                            	System.out.println("default:c3p12i"+id);   
                                            }
                                          ;break; 
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,8,16,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p14i22->c3p8i16");
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,8,8,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p142i14->c3p8i8");
                                          break;
                                                                                   
                                           default:
                                            	System.out.println("default:c3p14i"+id);   
                                            }
                                          ;break; 
                                          //Rot_M_Z <--
                                          
                                          // Rotupp -->
                                          case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,45,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i43->c3p19i45");
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,27,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i25->c3p19i27");
                                          break;
                                                                                           
                                           default:
                                            	System.out.println("default:c3p17i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          case 45:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,47,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i45->c3p21i47");
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,29,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i27->c3p21i29");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c3p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,41,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i47->c3p23i41");
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,31,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i29->c3p23i31");
                                          break;
                                          default:
                                            	System.out.println("default:c3p21i"+id);   
                                            }
                                          ;break;
                                          
                                          case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,43,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i41->c3p17i43");
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,25,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i31->c3p17i25");
                                          break;
                                                                                                                             
                                          default:
                                            	System.out.println("default:c3p23i"+id);   
                                            }
                                          ;break;
                                          
                                          // Rotupp <--

                                          }
                                           
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4:   //cubi4 bei 3x3 kann cubi4 sich auf den Plätzen 0,2,4,6 befinden
                                 if(setD.contains(i)) 
                                      {
                                        int place =myJ3dFrame.cubi4.getPlace();
                                        int id=myJ3dFrame.cubi4.getId();
                                                                                                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      { //RotDown
                                         case 0: 
                                         switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,2,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i0->c4p2i2");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,18,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i16->c4p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,34,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i32->c4p2i34");
                                          break;
                                          default:
                                            	System.out.println("default:c4p0i"+id);    
                                            }
                                          ;break;

                                          
                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,4,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i2->c4p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,20,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i18->c4p2i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,36,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i34->c4p2i36");
                                          break;
                                           default:
                                            	System.out.println("default:c4p2i"+id);   
                                            }
                                          ;break;

                                          
                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,6,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i4->c4p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,22,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i20->c4p6i22");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,38,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i36->c4p6i38");
                                          break;
                                           default:
                                            	System.out.println("default:c4p4i"+id);   
                                            }
                                          ;break;

                                          
                                          
                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,0,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p6i6->c4p0i0");
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,16,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p3i22->c4p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,32,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p3i38->c4p0i32");
                                          break;
                                           default:
                                            	System.out.println("default:c4p6i"+id);   
                                            }
                                          ;break;
                                          //RotDown <--
                                          
                                          //Rotupp-->
                                          case 16:
                                          switch(id)
                                         { case 40:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,42,myJ3dFrame.cubi4.colors);
                                          //System.out.println("c4p16i40->c4p18i42");
                                          break; 
                                           
                                          case 24:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,26,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i24->c4p18i26");
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,10,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i8->c4p18i10");
                                          break;
                                            default:
                                            	System.out.println("default:c4p16i"+id); 
                                            }
                                          ;break;
                                          
                                         case 18:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,44,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i42->c4p20i44");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,28,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i26->c4p20i28");
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,12,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i10->c4p20i12");
                                          break;
                                            default:
                                            	System.out.println("default:c0p4i"+id);  
                                            }
                                          ;break;
                                          
                                        case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,46,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i44->c4p22i46");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,30,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i28->c4p22i30");
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,14,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i12->c4p22i14");
                                          break;
                                           default:
                                            	System.out.println("default:c4p20i"+id);   
                                            }
                                          ;break;
                                      
                                       case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,40,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i46->c4p16i40");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,24,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i30->c4p16i24");
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,8,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i14->c4p16i8");
                                          break;
                                           default:
                                            	System.out.println("default:c4p22i"+id);   
                                            }
                                          ;break;
                                          
                                          //Rotupp <--
                                         
                                          }
                                           
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi4BranchGroup);
                                         myJ3dFrame.cubi4BranchGroup=branchGroup;
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi4) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                                         
                         case 5: //cubi5 
                               if(setD.contains(i)) 
                                     {
                                      int place =myJ3dFrame.cubi5.getPlace();
                                      int id=myJ3dFrame.cubi5.getId();
                                      
                                     
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	  //RotDown -->
                                         case 1:                                        	 
                                         switch(id)
                                         {
                                         case 1:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,3,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p1i1->c5p3i3");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,37,myJ3dFrame.cubi5.colors); 
                                         //System.out.println("c5p1i35->c5p3i37");
                                          break;
                                           default:
                                            	System.out.println("default:c5p1i"+id);   
                                            }
                                          ;break;
 
                                           
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,5,myJ3dFrame.cubi5.colors); 
                                         //System.out.println("c5p3i3->c5p5i5");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,39,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p1i9->c5p5i39");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c5p3i"+id);   
                                            }
                                          ;break;

                                         case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,7,myJ3dFrame.cubi5.colors); 
                                         //System.out.println("c5p5i5->c5p7i7");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,33,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p5i39->c5p7i33");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c5p5i"+id);  
                                            }
                                          ;break;

                                          
                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,1,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p7i7->c5p1i1");
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,35,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p7i33->c5p1i35");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c5p7i"+id);  
                                            }
                                          ;break;
                                          // RotDown <--
                                          
                                          // Rot_M_Z-->
                                           case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,10,18,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p8i16->c5p10i18");
                                          break;
                                         
                                          case 8:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,10,10,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p8i8->c5p10i10");
                                          break;
                                           default:
                                            	System.out.println("default:c5p8i"+id);   
                                            }
                                          ;break;
                                        
                                           case 10:
                                          switch(id)
                                         {
                                          case 18:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,12,20,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p10i18->c5p12i20");
                                          break;
                                         
                                          case 10:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,12,12,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p10i10->c5p12i12");
                                          break;
                                           default:
                                            	System.out.println("default:c5p10i"+id);   
                                            }
                                          ;break;
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,14,22,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p12i20->c5p14i22");
                                          break;
                                         
                                          case 12:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,14,14,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p12i20->c5p14i14");
                                          break;
                                           default:
                                            	System.out.println("default:c5p12i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                         switch(id)
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,8,16,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p14i22->c5p8i16");
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,8,8,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p14i14->c5p8i8");
                                          break;
                                            default:
                                            	System.out.println("default:c5p14i"+id);  
                                            }
                                          ;break;
                                          // Rot_M_Z<--
                                          
                                          // Rotupp-->
                                          case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,45,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p17i43->c5p19i45");
                                          break;                                          
                                                  
                                          case 25:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,27,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p17i25->c5p19i27");
                                          break;
                                           default:
                                            	System.out.println("default:c5p17i"+id);   
                                            }
                                          ;break;
                                          
                                          case 19:
                                          switch(id)
                                         {
                                          case 45:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,47,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i45->c5p21i47");
                                          break;
                                                                                    
                                          case 27:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,29,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i27->c5p21i29");
                                          break;
                                            default:
                                            	System.out.println("default:c5p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,41,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p21i47->c5p23i41");
                                          break;                                          
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,31,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p21i29->c5p23i31");
                                          break;
                                           default:
                                            	System.out.println("default:c5p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,43,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i41->c5p17i43");
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,25,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i31->c5p17i25");
                                          break;
                                           default:
                                            	System.out.println("default:c5p23i"+id);   
                                            }
                                          ;break;
                                          
                                           // Rotupp<--
                                          
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi5BranchGroup);
                                         myJ3dFrame.cubi5BranchGroup=branchGroup;
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi5) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6 
                         
                                 if(setD.contains(i))
                                   {
                                        int place =myJ3dFrame.cubi6.getPlace();
                                        int id=myJ3dFrame.cubi6.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                      	 //RotDown --> 
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,2,myJ3dFrame.cubi6.colors);
                                           //System.out.println("c6p0i0->c6p2i2");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,18,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i8->c6p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,34,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i16->c6p2i34");
                                          break;
                                           default:
                                            	System.out.println("default:c6p0i"+id);   
                                            }
                                          ;break;

                                          
                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,4,myJ3dFrame.cubi6.colors); 
                                         //System.out.println("c6p2i2->c6p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,20,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i18->c6p4i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,36,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i34->c6p4i36");
                                          break;
                                            default:
                                            	System.out.println("default:c6p2i"+id);  
                                            }
                                          ;break;

                                          
                                          case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,6,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i4->c6p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,22,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i20->c6p3i22");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,38,myJ3dFrame.cubi6.colors); 
                                         //System.out.println("c6p4i36->c6p5i38");
                                          break;
                                           default:
                                            	System.out.println("default:c6p4i"+id);   
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,0,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i6->c6p0i0");
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,16,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i22->c6p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,32,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i38->c6p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c6p6i"+id); 
                                            }
                                          ;break;
                                          //RotDown<--
                                          
                                          //Rotupp-->
                                          case 16:
                                          switch(id)
                                         {case 40:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,42,myJ3dFrame.cubi6.colors);
                                          //System.out.println("c6p16i40->c6p18i42");
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,26,myJ3dFrame.cubi6.colors);
                                          //System.out.println("c6p16i24->c6p18i26");
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,10,myJ3dFrame.cubi6.colors);
                                          //System.out.println("c6p16i8->c6p18i10");
                                          break;
                                            default:
                                            	System.out.println("default:c6p16i"+id); 
                                            }
                                          ;break;
                                          
                                         case 18:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,44,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i42->c6p20i44");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,28,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i26->c6p20i28");
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,12,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i10->c6p20i12");
                                          break;
                                            default:
                                            	System.out.println("default:c6p18i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,46,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i44->c6p22i46");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,30,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i28->c6p22i30");
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,14,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i12->c6p22i14");
                                          break;
                                           default:
                                            	System.out.println("default:c6p20i"+id);   
                                            }
                                          ;break;
                                          
                                        case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,40,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i46->c6p16i40");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,24,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i30->c6p16i24");
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,8,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i14->c6p16i8");
                                          break;
                                           default:
                                            	System.out.println("default:c6p22i"+id);   
                                            }
                                          ;break;
                                          
                                          //Rotupp<--                                          
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi6BranchGroup);
                                         myJ3dFrame.cubi6BranchGroup=branchGroup;
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                       
                                         if(myJ3dFrame.showCubi6) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi6BranchGroup);
                                        } 
                                         ;break;
                                       
                                    
                         case 7: //cubi7 
                               
                             if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi7.getPlace();
                                        int id=myJ3dFrame.cubi7.getId();                                                                                
                                       
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	 //RotDown --> 
                                         case 1:switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,3,myJ3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i1->c7p3i3");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,37,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p1i35->c7p3i37");
                                          break;
                                       
                                           default:
                                            	System.out.println("default:c7p1i"+id);   
                                            }
                                          ;break;
                                          
                                          
                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,5,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p3i3->c7p5i5");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,39,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p3i37->c7p5i39");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c7p3i"+id);   
                                            }
                                          ;break;

                                          
                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,7,myJ3dFrame.cubi7.colors); 
                                         //System.out.println("c7p5i5->c7p7i7");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,33,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p5i39->c7p7i33");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c7p5i"+id);   
                                            }
                                          ;break;

                                          
                                          case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,1,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p7i7->c7p1i1");
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,35,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p7i11->c7p0i8");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c7p7i"+id);   
                                            }
                                          ;break;
                                          
                                          // RotDown <--
                                          
                                          // Rot_M_Z-->
                                          
                                          case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,10,18,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p8i16->c7p10i18");
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,10,10,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p8i8->c7p10i10");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c7p8i"+id);   
                                            }
                                          ;break;
                                          
                                          case 10:
                                          switch(id)
                                         {                                         
                                          case 18:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,12,20,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p10i18->c7p12i20");
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,12,12,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p10i10->c7p12i12");
                                          break;
                                           default:
                                            	System.out.println("default:c7p10i"+id);   
                                            }
                                          ;break;
                                          
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,14,22,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p12i20->c7p14i22");
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,14,14,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p12i12->c7p14i14");
                                          break;
                                           default:
                                            	System.out.println("default:c7p12i"+id);   
                                            }
                                          ;break;
                                                                                   
                                           case 14:
                                          switch(id)
                                         {
                                         case 22:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,8,16,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p14i22->c7p8i16");
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,8,8,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p14i14->c7p8i8");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c7p14i"+id);   
                                            }
                                          ;break;
                                          
                                          // Rot_M_Z<--
                                          //
                                          // Rotupp-->
                                          
                                          case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,45,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p17i43->c7p19i45");
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,27,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p17i25->c7p19i27");
                                          break;
                                                  
                                          default:
                                            	System.out.println("default:c7p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 45:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,47,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i45->c7p21i47");
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,29,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i45->c7p21i29");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c7p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,41,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i47->c7p23i41");
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,31,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i29->c7p23i31");
                                          break;
                                                                                    
                                           default:
                                            	System.out.println("default:c7p21i"+id);   
                                            }
                                          ;break;

                                        case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,43,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i41->c7p17i43");
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,25,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i31->c7p17i25");
                                          break;
                                                                                   
                                           default:
                                            	System.out.println("default:c7p23i"+id);   
                                            }
                                          ;break;

                                          // Rotupp<--
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                        case 8: //cubi8 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi8.getPlace();
                                        int id=myJ3dFrame.cubi8.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      { //RotDown -->
                                      	  case 1:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,21,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p1i19->c8p3i21<");
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,35,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p1i33->c8p3i35");
                                          break;
                                          
                                            }
                                          ;break;
                                          
                                         case 3:
                                         switch(id)
                                          {case 21:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,23,myJ3dFrame.cubi8.colors); 
                                             //System.out.println(">c8p3i21->c8p5i23");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,37,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p3i35->c8p5i37");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c8p8i"+id);  
                                            }
                                          ;break;

                                         
                                          case 5:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,17,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i8->c8p7i17");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,39,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i9->c8p7i39");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c8p5i"+id);   
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                          {
                                          case 17:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,19,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p7i17->c8p1i19");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,33,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p7i39->c8p1i33");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c8p7i"+id);  
                                            }
                                          ;break;
                                          
                                          //RotDown <--
                                          
                                          //Rot_M_Z-->                                          
                                          case 8:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,10,2,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p8i0->c8p10i2");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,10,42,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p8i40->c8p10i42");
                                          break;
                                          
                                          default:
                                            	System.out.println("default:c8p8i"+id);  
                                            }
                                          ;break;
                                          
                                          case 10:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,12,4,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p10i2->c8p12i4");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,12,44,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p10i42->c8p12i44");
                                          break;
                                          
                                          default:
                                            	System.out.println("default:c8p10i"+id);  
                                            }
                                          ;break;
                                          
                                          case 12:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,14,6,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p12i4->c8p14i6");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,14,46,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p12i44->c8p14i46");
                                          break;
                                          
                                          default:
                                            	System.out.println("default:c8p10i"+id);  
                                            }
                                          ;break;
                                          
                                          case 14:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,8,0,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p10i2->c8p12i4");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,8,40,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p10i42->c8p12i44");
                                          break;
                                          
                                          default:
                                            	System.out.println("default:c8p10i"+id);  
                                            }
                                          ;break;
                                          
                                          //Rot_M_Z <--
                                          
                                          //Rotupp -->
                                          
                                          case 17:
                                          switch(id)
                                         {
                                          case 9:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,11,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i9->c8p19i11");
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,29,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i27->c8p19i29");
                                          break;                
                                          
                                           default:
                                            	System.out.println("default:c8p17i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,13,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p19i11->c8p21i13");
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,31,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p19i29->c8p21i31");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c8p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 13:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,15,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p21i13->c8p23i15");
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,25,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p21i31->c8p23i25");
                                          break;                                          

                                           default:
                                            	System.out.println("default:c8p211i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 15:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,9,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p23i15->c8p17i9");
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,27,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p23i25->c8p17i27");
                                          break;
                                          
                                          
                                           default:
                                            	System.out.println("default:c8p23i"+id);   
                                            }
                                          ;break;
                                          
                                          //Rotupp <---
                                          
                                         
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                           
                           case 10: //cubi10
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi10.getPlace();
                                        int id=myJ3dFrame.cubi10.getId();
                                                                              
                                        BranchGroup branchGroup=null;
                                      switch(place)
                                      {// RotDown
                                      	  case 1:
                                          switch(id)
                                          {
                                          
                                          case 19:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,21,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i19->c10p3i0");
                                          break;	  
                                          	  
                                          case 33:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,35,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i33->c10p3i40");
                                          break;                                          

                                           default:
                                            	System.out.println("default:c10p1i"+id);   
                                            }
                                          ;break;
                                        case 3:
                                         switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,23,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p3i21->c10p5i23");
                                          break;
                                                                                    
                                          case 35:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,37,myJ3dFrame.cubi10.colors); 
                                         //System.out.println(">c10p3i35->c10p5i37");
                                          break;
                                          
                                          
                                            default:
                                            	System.out.println("default:c10p3i"+id);  
                                            }
                                          ;break;
                                       

                                        case 5:
                                          switch(id)
                                          {                                       
                                          case 23:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,17,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p5i23->c10p7i17");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,39,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p5i37->c10p7i39");
                                          break;
                                                                                                                             
                                           default:
                                            	System.out.println("default:c10p5i"+id);  
                                            }
                                          ;break;

                                         case 7:
                                          switch(id)
                                          {
                                          case 17:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,19,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p7i13->c10p1i9");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,33,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p7i26->c10p1i2");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c10p7i"+id);  
                                            }
                                          ;break;
                                         //RotDown <--                                          
                                        
                                          //Rot_M_Z--> 
                                          case 8:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,10,2,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p8i0->c10p10i2");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,10,42,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p7i40->c10p10i42");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c10p8i"+id);  
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,12,4,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p10i2->c10p12i4");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,12,44,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p10i42->c10p12i44");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c10p10i"+id);  
                                            }
                                          ;break;
                                          
                                        case 12:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,14,6,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p12i4->c10p14i4");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,14,46,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p12i44->c10p14i44");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c10p12i"+id);  
                                            }
                                          ;break;
                                          
                                       case 14:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,8,0,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p14i6->c10p8i0");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,8,40,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p14i46->c10p8i40");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c10p14i"+id);  
                                            }
                                          ;break;
                                          
                                          //Rot_M_Z <--
                                          
                                          //Rotupp -->
                                          
                                          case 17:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,29,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p17i27->c10p19i29");
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,11,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p17i9->c10p19i11");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c10p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,31,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i29->c10p21i31");
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,13,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i11->c10p21i13");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c10p19i"+id);  
                                            }
                                          ;break;
                                          
                                          case 21:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,25,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p21i31->c10p25i25");
                                          break;
                                          
                                          case 13:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,15,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p21i13->c10p25i15");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c10p21i"+id);   
                                            }
                                          ;break; 
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,27,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i25->c10p17i27");
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,9,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i15->c10p17i9");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c10p23i"+id);   
                                            }
                                          ;break;
                                          
                                         
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi10BranchGroup);
                                         myJ3dFrame.cubi10BranchGroup=branchGroup;
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi10) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi10BranchGroup); 
                                          
                                      }
                                       ;break;
                        
                       case 12: //cubi12
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi12.getPlace();
                                        int id=myJ3dFrame.cubi12.getId();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place)
                                      {
                                      	  //RotDown -->
                                      	  case 1:
                                          switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,35,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i33->c12p3i35");
                                          break;
                                          
                                          case 19:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,21,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i19->c12p3i21");
                                          break;
                                                                                   
                                           default:
                                            	System.out.println("default:c12p1i"+id);   
                                            }
                                          ;break;
                                      	  
                                        case 3:
                                         switch(id)
                                          {case 35:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,37,myJ3dFrame.cubi12.colors); 
                                         //System.out.println(">c12p3i35->c12p5i37");
                                          break;
                                          
                                          case 21:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,23,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p3i21->c12p5i23");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c12p3i"+id);  
                                            }
                                          ;break;

                                        case 5:
                                          switch(id)
                                          {
                                          case 37:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,39,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p5i37->c12p7i39");
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,17,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p5i23->c12p7i17");
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c10p8i"+id);  
                                            }
                                          ;break;

                                         case 7:
                                          switch(id)
                                          {
                                          case 39:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,33,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p7i39->c12p1i33");
                                          break;// 
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,19,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p7i17->c12p1i19");
                                          break;                                         
                                            default:
                                            	System.out.println("default:c12p7i"+id);  
                                            }
                                          ;break;
                                           //RotDown <--
                                           
                                           //Rot_M_Z-->
                                          case 8:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,10,2,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p8i0->c12p10i2");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,10,42,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p7i40->c12p10i42");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c12p8i"+id);  
                                            }
                                          ;break;
                                          
                                          case 10:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,12,4,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p10i2->c12p12i4");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,12,44,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p10i42->c12p12i44");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c12p10i"+id);  
                                            }
                                          ;break;
                                          
                                          case 12:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,14,6,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p12i4->c12p14i6");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,14,46,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p12i44->c12p14i46");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c12p12i"+id);  
                                            }
                                          ;break;
                                          
                                          case 14:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,8,0,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p14i6->c12p8i0");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,8,40,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p14i46->c12p8i40");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c14p14i"+id);  
                                            }
                                          ;break;
                                          
                                          //Rot_M_Z <--
                                          
                                          //Rotupp -->
                                          
                                          case 17:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,29,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p17i27->c12p19i29");
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,11,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p17i9->c12p19i11");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c12p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,31,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i29->c12p21i31");
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,13,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i11->c12p21i13");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c12p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,25,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p21i31->c12p23i25");
                                          break;
                                          
                                          case 13:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,15,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p21i13->c12p23i15");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c12p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,27,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p23i25->c12p17i27");
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,9,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p23i15->c12p17i9");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c12p23i"+id);   
                                            }
                                          ;break;
                                          
                                          //Rotupp
                                         
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                       ;break;
                        
                         
                        case 14: //cubi14
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi14.getPlace();
                                        int id=myJ3dFrame.cubi14.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place)
                                      { //RotDown -->
                                        case 1:
                                         switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,35,myJ3dFrame.cubi14.colors); 
                                         //System.out.println(">c14p1i2->c14p3i35");
                                          break;
                                          
                                          case 19:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,21,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p1i8->c14p3i21");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c14p1i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 35:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,37,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p3i32->c14p5i37");
                                          break;
                                          
                                          case 21:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,23,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p3i32->c14p5i23");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c10p1i"+id);   
                                            }
                                          ;break;


                                        case 5:
                                          switch(id)
                                          {
                                          case 37:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,39,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p5i37->c14p7i39");
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,17,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p5i23->c14p7i17");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c14p5i"+id);  
                                            }
                                          ;break;

                                         case 7:
                                          switch(id)
                                          {
                                          case 39:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,33,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p7i39->c14p1i33");
                                          break;// 
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,19,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p7i17->c14p1i19");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c14p7i"+id);  
                                            }
                                          ;break;
                                          //RotDown <--
                                          
                                          //Rot_M_Z-->  
                                           case 8:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,10,2,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p8i0->c14p10i2");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,10,42,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p8i40->c14p10i42");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c14p8i"+id);  
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,12,4,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p10i2->c14p12i4");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,12,44,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p10i40->c14p12i44");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c14p10i"+id);  
                                            }
                                          ;break;
                                          
                                          case 12:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,14,6,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p12i4->c14p14i6");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,14,46,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p12i44->c14p14i46");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c14p12i"+id);  
                                            }
                                          ;break;
                                          
                                          case 14:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,8,0,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p14i6->c14p8i0");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,8,40,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p14i46->c14p8i40");
                                          break;// 
 
                                          default:
                                            	System.out.println("default:c14p14i"+id);  
                                            }
                                          ;break;
                                          //Rot_M_Z <--
                                          
                                          //Rotupp -->
                                         case 17:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,29,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p17i27->c14p19i29");
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,11,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p17i9->c14p19i11");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c14p17i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,31,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i29->c14p21i31");
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,13,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i11->c14p21i13");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c14p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,25,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i31->c14p23i25");
                                          break;
                                          
                                          case 13:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,15,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i13->c14p23i15");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c14p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,27,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p23i25->c14p17i27");
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,9,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p23i15->c14p17i9");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c14p23i"+id);   
                                            }
                                          ;break;
  
                                          //Rotupp <---
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                      

                 
               
                          
               
                        case 16: //cubi16 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi16.getPlace();
                                        int id=myJ3dFrame.cubi16.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place)
                                      {// RotDown-->
                                      	  case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,2,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p0i0->c16p2i2>");
                                          break;// 
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,18,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i16->c16p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,34,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i32->c16p2i34");
                                          break;
                                            default:
                                            	System.out.println("default:c16p0i"+id);  
                                            }
                                          ;break;
                                          
                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,4,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p2i2->c16p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,20,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i18->c16p4i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,36,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i34->c16p4i36");
                                          break;
                                            default:
                                            	System.out.println("default:c16p2i"+id);  
                                            }
                                          ;break;

                                         
                                         
                                        case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,6,myJ3dFrame.cubi16.colors); 
                                         //System.out.println(">c16p4i4->c16p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,22,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i8->c16p6i22");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,38,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i16->c16p6i38");
                                          break;
                                            default:
                                            	System.out.println("default:c16p16i"+id);  
                                            }
                                          ;break;

                                        case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,0,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p6i6->c16p0i0");
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,16,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i22->c16p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,32,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i38->c16p0i32");
                                          break;
                                           default:
                                            	System.out.println("default:c16p6i"+id);   
                                            }
                                          ;break;
                                           // RotDown <--
                                          
                                         
                                          // Rotupp -->
                                          case 16:
                                          switch(id)
                                         {                                          
                                          case 8:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,10,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i8->c16p18i10");
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,26,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i24->c16p18i26");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,42,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i40->c16p18i42");
                                          break;
                                            default:
                                            	System.out.println("default:c0p0i"+id); 
                                            }
                                          ;break;

                                    
                                        case 18: 
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,12,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i10->c16p20i12");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,28,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i26->c16p20i28");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,44,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i42->c16p20i44");
                                          break;
                                            default:
                                            	System.out.println("default:c16p18i"+id);  
                                            }
                                          ;break;
                                         
  
                                       case 20: 
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,14,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i12->c16p22i14");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,30,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i28->c16p22i30");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,46,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i44->c16p22i46");
                                          break;
                                           default:
                                            	System.out.println("default:c16p20i"+id);   
                                            }
                                          ;break;
                                      
                                       case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,8,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i14->c16p16i8");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,24,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i30->c16p16i24");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,40,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i46->c16p16i40");
                                          break;
                                           default:
                                            	System.out.println("default:c16p22i"+id);   
                                            }
                                          ;break;

                                           //Rotupp
                                        
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi16BranchGroup);
                                         myJ3dFrame.cubi16BranchGroup=branchGroup;
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi16) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi16BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                             case 17: //cubi17
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi17.getPlace();
                                        int id=myJ3dFrame.cubi17.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {//RotDown -->
                                      	  
                                        case 1:
                                         switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,3,myJ3dFrame.cubi17.colors); 
                                         //System.out.println(">c17p1i1->c17p3i3");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,37,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p1i35->c17p3i37");
                                          break;                                          
                                           default:
                                            	System.out.println("default:c17p1i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,5,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p3i3->c17p5i5");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,39,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p3i37->c17p5i39");
                                          break;                                         
                                           default:
                                            	System.out.println("default:c17p3i"+id);   
                                            }
                                          ;break;


                                        case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,7,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">17p5i5->c17p7i7");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,33,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p5i39->c7p7i33");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c17p5i"+id);  
                                            }
                                          ;break;

                                         case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,1,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p7i7->c17p1i1<");
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,35,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p7i33->c17p1i35");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c17p7i"+id);  
                                            }
                                          ;break;
                                          // RotDown <--
                                          
                                         // Rot_M_Z-->
                                          case 8:
                                          switch(id)
                                          {
                                          case 16:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,10,18,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p8i16->c17p10i18");
                                          break;// 
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,10,10,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p8i8->c17p10i10");
                                          break;
                                            default:
                                            	System.out.println("default:c17p8i"+id);  
                                            }
                                          ;break;
                                          
                                          case 10:
                                          switch(id)
                                          {
                                          case 18:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,12,20,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p10i18->c17p12i20");
                                          break;// 
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,12,12,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p10i10->c17p21i29");
                                          break;
                                            default:
                                            	System.out.println("default:c17p10i"+id);  
                                            }
                                          ;break;
                                          
                                          
                                         case 12:
                                          switch(id)
                                          {                                       
                                          case 20:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,14,22,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p12i20->c17p14i29");
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,14,14,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p12i12->c17p14i47<");
                                          break;// 
                                            default:
                                            	System.out.println("default:c17p12i"+id);  
                                            }
                                          ;break;
                                                                                 
                                         case 14:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,8,16,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p14i22->c17p8i16");
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,8,8,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p14i14->c17p8i8");
                                          break;
                                           default:
                                            	System.out.println("default:c17p14i"+id);   
                                            }
                                          ;break;
                                             // Rot_M_Z<--
                                          
                                         
                                          // Rotupp-->
                                          case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,27,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p17i25->c17p19i27");
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,45,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p17i43->c17p19i45");
                                          break;                
                                          
                                           default:
                                            	System.out.println("default:c17p17i"+id);   
                                            }
                                          ;break;
                                          
                                          case 19:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,29,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i27->c17p21i29");
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,47,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i45->c17p21i47");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c17p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,31,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p21i29->c17p23i31");
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,41,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p21i47->c17p23i41");
                                          break;                                          

                                           default:
                                            	System.out.println("default:c17p211i"+id);   
                                            }
                                          ;break;
                                          
                                       case 23:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,25,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p23i31->c17p17i25");
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,43,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p23i41->c17p17i43");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c17p23i"+id);   
                                            }
                                          ;break;
                                         
                                          // Rotupp<--
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 18: //cubi18 
                                   if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi18.getPlace();
                                        int id=myJ3dFrame.cubi18.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	 //RotDown --> 
                                      	  case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,2,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p0i0->c18p2i2");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,18,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i16->c18p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,34,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i32->c18p2i34");
                                          break;
                                            default:
                                            	System.out.println("default:c18p0i"+id);  
                                            }
                                          ;break;
                                          
                                          case 2:
                                           switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,4,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p2i2->c18p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,20,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i18->c18p4i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,36,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i34->c18p4i36");
                                          break;
                                           default:
                                            	System.out.println("default:c18p2i"+id);   
                                            }
                                          ;break;

                                          
                                        case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,6,myJ3dFrame.cubi18.colors); 
                                         //System.out.println(">c18p4i4->c18p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,22,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i20->c18p6i22");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,38,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i36->c18p6i38");
                                          break;
                                            default:
                                            	System.out.println("default:c18p4i"+id);  
                                            }
                                          ;break;
                                      
                                         case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,0,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p6i6->c18p0i0<");
                                          break;// 
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,16,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i22->c18p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,32,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i38->c18p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c18p6i"+id);  
                                            }
                                          ;break;
                                          //RotDown<--
                                          
                                          //Rotupp-->
                                          case 16:
                                          switch(id)
                                         {case 8:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,10,myJ3dFrame.cubi18.colors);
                                            //System.out.println("c18p16i8->c18p18i10");
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,26,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i24->c18p18i26");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,42,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i40->c18p18i42");
                                          break;
                                            default:
                                            	System.out.println("default:c18p16i"+id); 
                                            }
                                          ;break;
                                          
                                        case 18: 
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,12,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i10->c18p20i12");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,28,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i26->c18p20i28");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,44,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i42->c18p20i44");
                                          break;
                                            default:
                                            	System.out.println("default:c18p18i"+id);  
                                            }
                                          ;break;
                                          
                                        case 20:
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,14,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i12->c18p22i14");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,30,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i28->c18p22i30");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,46,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i44->c18p22i46");
                                          break;
                                           default:
                                            	System.out.println("default:c18p20i"+id);   
                                            }
                                          ;break;
                                          
                                      case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,8,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i14->c18p16i8");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,24,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i30->c18p16i24");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,40,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i46->c18p16i40");
                                          break;
                                           default:
                                            	System.out.println("default:c18p22i"+id);   
                                            }
                                          ;break;
                                          
                                          //Rotupp<--
                                         
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi18BranchGroup);
                                         myJ3dFrame.cubi18BranchGroup=branchGroup;
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi18) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi18BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 19: //cubi19
                                   if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi19.getPlace();
                                        int id=myJ3dFrame.cubi19.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	 //RotDown --> 
                                        case 1:
                                         switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,3,myJ3dFrame.cubi19.colors); 
                                         //System.out.println(">c19p1i2->c19p3i3");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,37,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p1i35->c19p3i37");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c19p1i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,5,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p3i3->c19p5i5");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,39,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p3i37->c19p5i39");
                                          break;
                                                                                    
                                           default:
                                            	System.out.println("default:c19p3i"+id);   
                                            }
                                          ;break;


                                        case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,7,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p5i5->c19p7i7");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,33,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p5i39->c19p7i33");
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c19p5i"+id);  
                                            }
                                          ;break;

                                         case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,1,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p7i7->c19p1i1<");
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,35,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p7i33->c19p1i35");
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c19p7i"+id);  
                                            }
                                          ;break;
                                          
                                           //RotDown <--
                                           
                                          //Rot_M_Z -->
                                          
                                           case 8:
                                          switch(id)
                                         {
                                         case 16:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,10,18,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p8i16->c19p10i18");
                                          break;
                                          
                                         case 8:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,10,10,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p8i8->c19p10i10<");
                                          break;
                                           default:
                                            	System.out.println("default:c19p8i"+id);   
                                            }
                                          ;break;
                                      
                                         case 10:
                                          switch(id)
                                         {
                                         case 18:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,12,20,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p10i18->c19p12i20");
                                          break;
                                          
                                         case 10:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,12,12,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p10i10->c19p12i12<");
                                          break;
                                           default:
                                            	System.out.println("default:c19p10i"+id);   
                                            }
                                          ;break;
                                                                                    
                                                                    
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,14,22,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p12i20->c19p14i22");
                                          break;
                                         
                                          case 12:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,14,14,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p12i12->c19p14i14");
                                          break;
                                           default:
                                            	System.out.println("default:c19p12i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,8,16,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p14i22->c19p8i16");
                                          break;
                                         
                                          case 14:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,8,8,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p14i14->c19p8i8");
                                          break;
                                           default:
                                            	System.out.println("default:c19p14i"+id);   
                                            }
                                          ;break;
                                          
                                          //Rot_M_Z <--
                                          
                                          // Rotupp -->
                                          
                                         case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,27,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c17p17i25->c17p19i27");
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,45,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c17p17i43->c17p19i45");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c19p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,29,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i27->c19p21i29");
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,47,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i45->c19p21i47");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c19p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,31,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p21i29->c19p23i31");
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,41,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p21i47->c19p23i41");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c19p21i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,25,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p23i31->c19p17i25");
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,43,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p23i41->c19p17i43");
                                          break;
                                         
                                           default:
                                            	System.out.println("default:c19p23i"+id);   
                                            }
                                          ;break;
                                          
                                           // Rotupp <--
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 20: //cubi20 
                                   if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi20.getPlace();
                                        int id=myJ3dFrame.cubi20.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                      	 //RotDown 
                                      	 case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,2,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p0i0->c20p2i2");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,18,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i16->c20p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,34,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i32->c20p2i34");
                                          break;
                                            default:
                                            	System.out.println("default:c20p0i"+id);  
                                            }
                                          ;break;
                                          
                                           case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,4,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p2i2->c20p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,20,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i18->c20p4i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,36,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i34->c20p4i36");
                                          break;
                                           default:
                                            	System.out.println("default:c20p2i"+id);   
                                            }
                                          ;break;


                                          
                                        case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,6,myJ3dFrame.cubi20.colors); 
                                         //System.out.println(">c20p4i4->c20p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,22,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i20->c18p6i22");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,38,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i36->c18p6i38");
                                          break;
                                            default:
                                            	System.out.println("default:c20p4i"+id);  
                                            }
                                          ;break;

                                         case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,0,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p6i6->c20p0i0<");
                                          break;// 
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,16,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i22->c20p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,32,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i38->c20p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c20p6i"+id);  
                                            }
                                          ;break;
                                          
                                          //RotDown <--
                                          
                                          //Rotupp-->
                                          
                                          case 16:
                                          switch(id)
                                         {case 8:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,10,myJ3dFrame.cubi20.colors);
                                            //System.out.println("c20p16i8->c20p18i10");
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,26,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i24->c20p18i26");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,42,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i40->c20p18i42");
                                          break;
                                            default:
                                            	System.out.println("default:c20p16i"+id); 
                                            }
                                          ;break;
                                          
                                       case 18:
                                         switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,12,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i10->c20p20i12");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,28,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i26->c20p20i28");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,44,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i42->c20p20i44");
                                          break;
                                            default:
                                            	System.out.println("default:c20p18i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,14,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i12->c20p22i14");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,30,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i28->c20p22i30");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,46,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i44->c20p22i46");
                                          break;
                                           default:
                                            	System.out.println("default:c20p20i"+id);   
                                            }
                                          ;break;
                                          
                                      case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,8,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i14->c20p16i8");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,24,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i30->c20p16i24");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,40,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i46->c20p16i40");
                                          break;
                                           default:
                                            	System.out.println("default:c20p22i"+id);   
                                            }
                                          ;break;
                                          
                                          //Rotupp <--
                                         
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi20BranchGroup);
                                         myJ3dFrame.cubi20BranchGroup=branchGroup;
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi20) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi20BranchGroup); 
                                          
                                      }
                                       ;break;
                        case 21: //cubi21
                                   if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi21.getPlace();
                                        int id=myJ3dFrame.cubi21.getId();
                                                                              
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      {
                                      	//RotDown -->  
                                        case 1:
                                         switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,3,myJ3dFrame.cubi21.colors); 
                                         //System.out.println(">c21p1i1->c21p3i3");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,37,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p1i35->c21p3i37");
                                          break;
                                          
                                          
                                            default:
                                            	System.out.println("default:c21p1i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,5,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p3i3->c18p5i5");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,39,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c7p3i37->c21p5i39");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c18p2i"+id);   
                                            }
                                          ;break;


                                        case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,7,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p5i5->c21p7i7");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,33,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p5i39->c21p7i33");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c21p5i"+id);  
                                            }
                                          ;break;

                                         case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,1,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p7i7->c21p1i1<");
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,35,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p7i33->c21p1i35");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c21p76i"+id);  
                                            }
                                          ;break;
                                          
                                         // RotDown <--
                                          
                                          // Rot_M_Z-->
                                          
                                          case 8:
                                          switch(id)
                                          {
                                          case 16:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,10,18,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p8i16->c21p10i18");
                                          break;
                                        
                                          case 8:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,10,10,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p8i8->c21p10i10");
                                          break;
                                           default:
                                            	System.out.println("default:c21p8i"+id);   
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                          {
                                          case 18:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,12,20,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p10i18->c21p12i20");
                                          break;
                                        
                                          case 10:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,12,12,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p10i10->c21p12i12");
                                          break;
                                           default:
                                            	System.out.println("default:c21p10i"+id);   
                                            }
                                          ;break;
                                          
                                        case 12:
                                          switch(id)
                                          {
                                          case 20:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,14,22,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p12i20->c21p21i29");
                                          break;	  
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,14,14,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p12i12->c21p21i47");
                                          break;
                                                                                 
                                          default:
                                            	System.out.println("default:c21p12i"+id);   
                                            }
                                          ;break;
                                                                                 
                                        case 14:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,8,16,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p14i22->c21p8i16");
                                          break;                                                                                   
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,8,8,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p14i14->c21p8i8");
                                          break;
                                            default:
                                            	System.out.println("default:c21p14i"+id);  
                                            }
                                          ;break;
                                          
                                          // Rot_M_Z<--
                                          
                                          // Rotupp-->
                                          
                                         case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,27,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p17i25->c21p19i27");
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,45,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p17i43->c21p19i45");
                                          break;                                                 
                                          
                                           default:
                                            	System.out.println("default:c21p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,29,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p19i27->c21p21i29");
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,47,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p19i45->c21p21i47");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c21p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,31,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i29->c21p23i31");
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,41,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i47->c21p23i41");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c21p21i"+id);   
                                            }
                                          ;break;
                                       
                                       case 23:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,25,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p23i31->c21p17i25");
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,43,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p23i41->c21p17i43");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c21p23i"+id);   
                                            }
                                          ;break;
                                          
                                           // Rotupp<--
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                       ;break;
                          case 22: //cubi22  
                                   if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi22.getPlace();
                                        int id=myJ3dFrame.cubi22.getId();
                                                                              
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	//RotDown --> 
                                      	 case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,2,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p0i0->c22p2i2");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,18,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p0i16->c22p2i18");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,34,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p0i32->c2p2i34");
                                          break;
                                            default:
                                            	System.out.println("default:c22p0i"+id);  
                                            }
                                          ;break;
                                          
                                         case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,4,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p2i2->c22p4i4");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,20,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p1i9->c22p4i20");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,36,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p1i17->c22p4i36");
                                          break;
                                           default:
                                            	System.out.println("default:c22p2i"+id);   
                                            }
                                          ;break;
                                          
                                        case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,6,myJ3dFrame.cubi22.colors); 
                                         //System.out.println(">c22p4i4->c22p6i6");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,22,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p4i20->c22p6i20");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,38,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p4i36->c22p6i38");
                                          break;
                                            default:
                                            	System.out.println("default:c22p4i"+id);  
                                            }
                                          ;break;

                                     

                                         case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,0,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p6i6->c22p0i0<");
                                          break;// 
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,16,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i22->c22p0i16");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,32,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i38->c22p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c22p6i"+id);  
                                            }
                                          ;break;
                                          
                                          //RotDown<--
                                          
                                          //Rotupp-->
                                          
                                          case 16:
                                          switch(id)
                                         {case 8:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,10,myJ3dFrame.cubi22.colors);
                                            //System.out.println("c22p16i8->c22p18i10");
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,26,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i24->c22p18i26");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,42,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i40->c22p18i42");
                                          break;
                                          default:
                                            	System.out.println("default:c22p16i"+id); 
                                            }
                                          ;break;
                                          
                                        case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,12,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i10->c22p20i12");
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,28,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i26->c22p20i28");
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,44,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i42->c22p20i44");
                                          break;
                                            default:
                                            	System.out.println("default:c22p18i"+id);  
                                            }
                                          ;break;
                                          
                                       case 20:
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,14,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i12->c22p22i14");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,30,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i28->c22p22i30");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,46,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i24->c22p22i46");
                                          break;
                                           default:
                                            	System.out.println("default:c22p20i"+id);   
                                            }
                                          ;break;
                                          
                                      case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,8,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i14->c22p16i8");
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,24,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i30->c22p16i24");
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,40,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i46->c22p16i40");
                                          break;
                                           default:
                                            	System.out.println("default:c22p22i"+id);   
                                            }
                                          ;break;
                                          
                                         //Rotupp<--   
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi22BranchGroup);
                                         myJ3dFrame.cubi22BranchGroup=branchGroup;
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi22) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi22BranchGroup); 
                                          
                                      }
                                       ;break;
                         case 23: //cubi23
                                   if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi23.getPlace();
                                        int id=myJ3dFrame.cubi23.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	   //RotDown -->
                                        case 1:
                                         switch(id)
                                          {                                          
                                          case 17:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,19,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p1i17->c23p3i19");
                                          break;
                                          case 3:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,5,myJ3dFrame.cubi23.colors); 
                                         //System.out.println(">c23p1i3->c23p3i3");
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c23p1i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,21,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p3i19->c23p5i21");
                                          break;
                                          
                                          case 5:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,7,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p3i5->c23p5i7");
                                          break;
                                        
                                           default:
                                            	System.out.println("default:c23p3i"+id);   
                                            }
                                          ;break;


                                        case 5:
                                          switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,23,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p4i12->c23p5i21");
                                          break;	  
                                          	  
                                          case 7:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,1,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p5i7->c23p5i40");
                                          break;
                                        
                                            default:
                                            	System.out.println("default:c23p5i"+id);  
                                            }
                                          ;break;

                                         case 7:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,17,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p7i23->c23p1i17");
                                          break;
                                          
                                          case 1:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,3,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p7i1->c23p1i3<");
                                          break;// 
                                          default:
                                            	System.out.println("default:c23p7i"+id);  
                                            }
                                          ;break;
                                          
                                          // RotDown <--
                                          
                                         // Rot_M_Z-->
                                         
                                          case 8:
                                          switch(id)
                                         {
                                          case 40:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,10,42,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p8i40->c23p10i42");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,10,34,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p8i32->c23p10i34");
                                          break;
                                                                                    
                                           default:
                                            	System.out.println("default:c23p8i"+id);   
                                            }
                                          ;break; 
                                          
                                          case 10:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,12,44,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p10i42->c23p12i44");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,12,36,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p10i34->c23p12i36");
                                          break;
                                                                                    
                                           default:
                                            	System.out.println("default:c23p10i"+id);   
                                            }
                                          ;break;
                                          
                                          
                                         case 12:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,14,46,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p12i44->c23p14i46");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,14,38,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p12i36->c23p14i38");
                                          break;
                                                                                    
                                           default:
                                            	System.out.println("default:c23p12i"+id);   
                                            }
                                          ;break;
                                       
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,8,40,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p14i46->c23p23i9<");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,8,32,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p14i38->c23p23i31");
                                          break;
                                                                                    
                                           default:
                                            	System.out.println("default:c23p14i"+id);   
                                            }
                                          ;break;
                                                  
                                          // Rot_M_Z<--
                                          
                                         
                                          // Rotupp-->
                                          
                                          case 17:
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,13,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i11->c23p19i13");
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,27,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i25->c23p19i27");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c23p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 13:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,21,15,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p19i13->c23p21i15");
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,21,29,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p19i27->c23p21i29");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c23p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 15:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,9,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p21i15->c23p23i9");
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,31,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p21i29->c23p23i31");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c23p21i"+id);   
                                            }
                                          ;break;
                                        
                                       case 23:
                                          switch(id)
                                         {
                                          case 9:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,11,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i9->c23p17i11");
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,25,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i31->c23p17i25");
                                          break;
                                          
                                           default:
                                            	System.out.println("default:c23p23i"+id);   
                                            }
                                          ;break;
                                          
                                         // Rotupp<--
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                     if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup);}                                                                                
                                       ;break;
                                       
                              case 9: //cubi9 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi9.getPlace();
                                        int id=myJ3dFrame.cubi9.getId();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,11,3,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p9i1->c9p11i3<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c9p9i"+id);
                                            }
                                          ;break;
                                          
                                         case 11:
                                         switch(id)
                                          {case 3:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,13,5,myJ3dFrame.cubi9.colors); 
                                           //System.out.println(">c9p11i3->c9p13i5");
                                          break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c9p11i"+id);  
                                            }
                                          ;break;
                                         
                                          case 13:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,15,7,myJ3dFrame.cubi9.colors);
                                         //System.out.println("c9p13i5->c9p15i7");
                                          break;                                                                                                                             
                                          default:
                                            	System.out.println("default:c9p13i"+id);   
                                            }
                                          ;break;

                                          case 15:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,9,1,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p15i7->c9p9i1");
                                          break;
                                                                                   
                                          default:
                                            	System.out.println("default:c9p15i"+id);  
                                            }
                                          ;break;
                                          
                                          case 24:
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,24,32,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p24i32->c9p24i32");
                                          break;
                                                                                   
                                          default:
                                            	System.out.println("default:c9p24i"+id);  
                                            }
                                          ;break;
                                          
                                          case 25:
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p25i25->c9p25i25");
                                          break;
                                                                                   
                                          default:
                                            	System.out.println("default:c9p25i"+id);  
                                            }
                                          ;break;

                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi9BranchGroup);
                                         myJ3dFrame.cubi9BranchGroup=branchGroup;
                                         myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                              case 11: 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi11.getPlace();
                                        int id=myJ3dFrame.cubi11.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi11.colors);
                                         //System.out.println(">c9p9i1->c9p11i3<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c11p9i"+id);
                                            }
                                          ;break;
                                          
                                         case 11:
                                         switch(id)
                                          {case 3:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,13,5,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p11i3->c11p13i5");
                                          break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p11i"+id);  
                                            }
                                          ;break;
                                          
                                         case 13:
                                         switch(id)
                                          {case 5:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p13i5->c11p15i7");
                                          break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p13i"+id);  
                                            }
                                          ;break;
                                          
                                        case 15:
                                         switch(id)
                                          {case 7:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,9,1,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p11i5->c11p15i5");
                                          break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p15i"+id);  
                                            }
                                          ;break;
                                          
                                         case 24:
                                         switch(id)
                                          {case 32:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p24i32->c11p24i32");
                                          break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p24i"+id);  
                                            }
                                          ;break;
                                          
                                         case 25:
                                         switch(id)
                                          {case 25:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p25i25->c11p25i25");
                                          break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p25i"+id);  
                                            }
                                          ;break;
                                          
                                         }                                                                              
                                         
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi11BranchGroup);
                                         myJ3dFrame.cubi11BranchGroup=branchGroup;
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi11) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi11BranchGroup); 
                                          
                                      }
                                      break;
                                      
                              case 13: //cubi13 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi13.getPlace();
                                        int id=myJ3dFrame.cubi13.getId();

                                        BranchGroup branchGroup=null;
                                     switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,11,3,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p9i1->c13p11i3<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c13p9i"+id);
                                            }
                                          ;break;   
                                         case 11:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,13,5,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p11i3->c13p13i5<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c13p11i"+id);
                                            }
                                          ;break;
                                          
                                        case 13:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,15,7,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p13i5->c13p15i7<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c13p13i"+id);
                                            }
                                          ;break;
                                          
                                        case 15:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,9,1,myJ3dFrame.cubi13.colors);
                                         //System.out.println("c13p15i7->c13p9i1");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c13p15i"+id);
                                            }
                                          ;break;
                                          
                                          case 24:// Rotationsachse
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,24,32,myJ3dFrame.cubi13.colors);
                                         //System.out.println("c13p24i32->c13p24i32");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c13p24i"+id);
                                            }
                                          ;break;
                                          
                                          case 25:// Rotationsachse
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,25,25,myJ3dFrame.cubi13.colors);
                                         //System.out.println("c13p25i25->c13p25i25");
                                          break; 
                                                                                    
                                          default:
                                            	System.out.println("default:c13p24i"+id);
                                            }
                                          ;break;
                                          
                                          
                                       }                                        
                                     
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi13BranchGroup);
                                         myJ3dFrame.cubi13BranchGroup=branchGroup;
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi13) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi13BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                              case 15: //cubi15 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi15.getPlace();
                                        int id=myJ3dFrame.cubi15.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,11,3,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p9i1->c15p11i3<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c15p9i"+id);
                                            }
                                          ;break;
                                          
                                          case 11:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,13,5,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p11i3->c15p13i5<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c15p11i"+id);
                                            }
                                          ;break;
                                          
                                         case 13:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,15,7,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p13i5->c15p15i7<");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c15p13i"+id);
                                            }
                                          ;break;
                                          
                                        case 15:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,9,1,myJ3dFrame.cubi15.colors);
                                         //System.out.println("c15p15i7->c15p9i1");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c15p15i"+id);
                                            }
                                          ;break;
                                          
                                         case 24:
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,24,32,myJ3dFrame.cubi15.colors);
                                         //System.out.println("c15p24i32->c15p24i32");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c15p24i"+id);
                                            }
                                          ;break;
                                          
                                         case 25:
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,25,25,myJ3dFrame.cubi15.colors);
                                         //System.out.println("c15p25i25->c15p25i25");
                                          break;// 
                                                                                    
                                          default:
                                            	System.out.println("default:c15p25i"+id);
                                            }
                                          ;break;
                                          
                                      	}
                                      
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi15BranchGroup);
                                         myJ3dFrame.cubi15BranchGroup=branchGroup;
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi15) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi15BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                              case 24: //  cubi24                                    	  
                                      if(setD.contains(i))
                                      { int place =myJ3dFrame.cubi24.getPlace();
                                        int id=myJ3dFrame.cubi24.getId();
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      {                                      	  
                                      	                                        
                                       case 9:
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,11,13,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p9i11->c24p11i13");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p9i"+id);  
                                            }
                                         break;
                                         
                                         case 11:
                                          switch(id)
                                         {
                                          case 13:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,13,15,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p11i13->c24p13i15");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p11i"+id);  
                                            }
                                         break;
                                         
                                         case 13:
                                          switch(id)
                                         {
                                          case 15:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,15,9,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p13i15->c24p15i9");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p15i"+id);  
                                            }
                                         break;
                                         
                                         case 15:
                                          switch(id)
                                         {
                                          case 9:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,9,11,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p15i9->c24p9i11");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,24,0,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p24i0->c24p11i13");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,25,41,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p25i41->c24p15i9");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p25i"+id);  
                                            }
                                         break;
                                                                                                                                                                                                                                                 
                                       }
                                                                                                                       
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);
                                      }
                                     ;break;
                                     
                                  case 25: //cubi25 
                                      if(setD.contains(i))
                                      { int place =myJ3dFrame.cubi25.getPlace();
                                        int id=myJ3dFrame.cubi25.getId();
                                        BranchGroup branchGroup=null;
                                        
                                          switch(place)
                                      {
                                      	 case 9: 
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,11,3,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p9i1->c25p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p9i"+id);  
                                            }
                                         break;
                                         
                                        case 11: 
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,13,5,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p11i3->c25p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p11i"+id);  
                                            }
                                         break;
                                         
                                         case 13: 
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,15,7,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p13i5->c25p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p13i"+id);  
                                            }
                                         break;
                                         
                                          case 15: 
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,9,1,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p15i7->c25p9i1");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p15i"+id);  
                                            }
                                         break;
                                         
                                        
                                        case 24: 
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,24,32,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p25i25->c25p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p24i"+id);  
                                            }
                                         break;                      
                                      	                                        
                                       case 25: 
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,25,25,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p25i25->c25p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p25i"+id);  
                                            }
                                         break; 
                                        
                                       }
                                                                               
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.cubi25BranchGroup=branchGroup;
                                       myJ3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi25BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi25BranchGroup);
                                        } 
                                       break;
                                 
                                    } 
                                   }
                
                
                f=finish();
                
                while(!f){ f=finish();}
                    placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                 //Drehung rückgängig machen
                myJ3dFrame.DRotationInterpolator.setMinimumAngle(myJ3dFrame.Dwinkel+0f);
                myJ3dFrame.DRotationInterpolator.setMaximumAngle(myJ3dFrame.Dwinkel-(float)Math.PI/2);
                myJ3dFrame.Dalpha.setStartTime(System.currentTimeMillis()+100); //WarteZeit
                myJ3dFrame.Dwinkel=myJ3dFrame.Dwinkel-((float) Math.PI/2);                
                f=finish();
                
                while(!f){ f=finish();} 
               //System.out.println("Z <--");
                }
            }//wegen Ausstieg
    
    public Rot_Z(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    {  this.myJ3dFrame=myJ3dFrame;
       rotAchse_Z=new Button("Z"); // rotAchseDown-->
            rotAchse_Z.setBounds(xa,ya,b,h);
            
         rotAchse_Z.addActionListener(new ActionListener()
            { 
            public void actionPerformed(ActionEvent e)
            {
              Z_Action();
            }
             });   
    }   
}
