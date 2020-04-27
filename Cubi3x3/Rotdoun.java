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

public class Rotdoun extends Rot
{ static J3dFrame myJ3dFrame;
  Button rotAchsedown;
  static boolean f;
  static Set<Integer> setD=new HashSet<Integer>();
    
        Button getrotAchsedown()
    { return rotAchsedown;
      }
      
    static public void downAction()
    {       if(myJ3dFrame.showCubi0) setD.add(0);
            if(myJ3dFrame.showCubi1) setD.add(1);
            if(myJ3dFrame.showCubi2) setD.add(2);
            if(myJ3dFrame.showCubi3) setD.add(3);
            if(myJ3dFrame.showCubi4) setD.add(4);
            if(myJ3dFrame.showCubi5) setD.add(5);
            if(myJ3dFrame.showCubi6) setD.add(6);
            if(myJ3dFrame.showCubi7) setD.add(7);
            if(myJ3dFrame.showCubi24) setD.add(24);
            ActionFrame.textArea.append("d");
           int[] nrArray=new int[26];
                int[] placeArray=new int[26];
                f=finish();
                while(!f){ f=finish();}
             if(finish())
                { 
                    placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                   //System.out.println("down -->");
                    //zustandsAusgabe(nrArray,placeArray,setD);
                   //myJ3dFrame.showCubisVisible();
                      
                  //Vorbereitung
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                               if(setD.contains(i))                                                                          
                                       {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
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
                                       {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
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
                                    };break;
                         case 6: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi6BranchGroup);
                                    };break;
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
                                       if(myJ3dFrame.showCubi24) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi24BranchGroup);
                                       };break;
                        case 25: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi25BranchGroup);
                                      };break;
                        }
                //Vorbereitung -->
                //Hierhin
                 if(finish())
                {
               
                myJ3dFrame.DRotationInterpolator.setMinimumAngle(myJ3dFrame.Dwinkel+0f);
                myJ3dFrame.DRotationInterpolator.setMaximumAngle(myJ3dFrame.Dwinkel-(float)Math.PI/2);
                myJ3dFrame.Dalpha.setStartTime(System.currentTimeMillis()+100); //WarteZeit
                myJ3dFrame.Dwinkel=myJ3dFrame.Dwinkel-((float) Math.PI/2);
                //System.out.println("Down+Dwinkel"+myJ3dFrame.Dwinkel);
                
                // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();
                    //System.out.println(f);
                }
                
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
                                      {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,6,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i0->c0p6i6"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,22,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i16->c0p6i22"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,38,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i32->c0p6i38"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p0i"+id);   
                                            }
                                          ;break;
                                          
                                          case 6: 
                                          switch(id)
                                         {
                                          case 6:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,4,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i6->c0p4i4"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,20,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i22->c0p4i20"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,36,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i38->c0p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 4: 
                                          switch(id)
                                         {
                                          case 4:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,2,myJ3dFrame.cubi0.colors);  
                                         //System.out.println("c0p4i4->c0p2i2");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,18,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i20->c0p2i18"); 
                                          break;
                                                   
                                          case 36:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,34,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i36->c0p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p4i"+id);   
                                            }
                                          ;break;

                                          case 2: 
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,0,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i2->c0p0i0"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,16,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i18->c0p0i16"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,32,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i34->c0p0i32"); 
                                          break;         
                                           default:
                                           	  //System.out.println("default:c0p2i"+id);   
                                            }
                                          ;break;
                       
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
                                      {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,7,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p1i1->c1p7i7"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,33,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p1i35->c1p7i33"); 
                                          break;
                                        
                                            default:
                                            	System.out.println("default:c1p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,5,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p7i7->c1p5i5"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,39,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p7i33->c1p5i39"); 
                                          break;
                                          
                                         
                                           default:System.out.println("default:c1p7i"+id);   
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,3,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p5i5->c1p3i3"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,37,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p5i39->c1p3i37"); 
                                          break;
                                          
                                         
                                            default:
                                            	System.out.println("default:c1p5i"+id);  
                                            }
                                          ;break;

                                         case 3:
                                         switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,1,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p3i3->c1p1i1"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,35,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p3i37->c1p1i35"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c1p3i"+id);   
                                            }
                                          ;break;

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
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,6,myJ3dFrame.cubi2.colors);
                                            //System.out.println("c2p0i0->c2p6i6");
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,22,myJ3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i16->c2p6i32");
                                           break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,38,myJ3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i32->c2p6i38"); 
                                           break;
                                            default:
                                            	System.out.println("default:c2p0i"+id);  
                                            }
                                          ;break;
                                          
                                        case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,4,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i6->c2p4i4"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,20,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i22->c2p4i20"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,36,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i38->c2p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,2,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i4->c2p2i2");
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,18,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i20->c2p2i18");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,34,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i36->c2p2i34"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p4i"+id);  
                                            }
                                          ;break;


                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,0,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p2i2->c2p0i0");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,16,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p1i18->c2p0i16");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,32,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p1i34->c2p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c2p2i"+id);  
                                            }
                                          ;break;

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
                                      {
                                         case 1:
                                         switch(id)
                                         {
                                         case 1:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,7,myJ3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i1->c3p7i7"); 
                                           break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,33,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i35->c3p7i33");
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c3p1i"+id);   
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,5,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p7i7->c3p5i5"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,39,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i33->c3p5i39"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c3p7i"+id);   
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,3,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i5->c3p3i3"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,37,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i39->c3p3i37"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c3p5i"+id);   
                                            }
                                          ;break;

                                           
                                         case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,1,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i3->c3p1i1"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,35,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i37->c3p1i35"); 
                                          break;
                                       
                                            default:
                                            	System.out.println("default:c3p3i"+id);  
                                            }
                                          ;break;

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
                         case 4:   //cubi4 
                                 if(setD.contains(i)) 
                                      {
                                        int place =myJ3dFrame.cubi4.getPlace();
                                        int id=myJ3dFrame.cubi4.getId();
                                         
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 0: 
                                         switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,6,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i0->c4p6i6"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,22,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i16->c4p6i22");
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,38,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i32->c4p6i38"); 
                                          break;
                                          default:
                                          	 //System.out.println("default:c4p0i"+id);    
                                            }
                                          ;break;
                                          
                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,4,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p6i6->c4p4i4"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,20,myJ3dFrame.cubi4.colors);// 0,8
                                         //System.out.println("c4p6i22->c4p4i20");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,36,myJ3dFrame.cubi4.colors);//0,16
                                         //System.out.println("c4p6i38->c4p4i36"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p6i"+id);   
                                            }
                                          ;break; 
                                          
                                         case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,2,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i4->c4p2i2"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,18,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i20->c4p2i18"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,34,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i36->c4p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p4i"+id);   
                                            }
                                          ;break;

                                          
                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,0,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i2->c4p0i0"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,16,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i18->c4p0i16"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,32,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i34->c4p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p2i"+id);   
                                            }
                                          ;break;
  
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
                                         case 1:
                                         switch(id)
                                         {
                                         case 1:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,7,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p1i1->c5p7i7");
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,33,myJ3dFrame.cubi5.colors); 
                                         //System.out.println("c5p1i35->c5p7i33");
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p1i"+id);   
                                            }
                                          ;break;
                                          
                                        case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,5,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p7i7->c5p5i5"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,39,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p7i33->c5p5i39"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c5p7i"+id);  
                                            }
                                          ;break;
                                          
                                           case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,3,myJ3dFrame.cubi5.colors); 
                                         //System.out.println("c5p5i5->c5p3i3");
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,37,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p5i39->c5p3i37"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c5p5i"+id);  
                                            }
                                          ;break;
 
                                           
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,1,myJ3dFrame.cubi5.colors); 
                                         //System.out.println("c5p3i3->c5p1i1");
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,35,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p3i37->c5p1i35"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c5p3i"+id);   
                                            }
                                          ;break;

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
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,6,myJ3dFrame.cubi6.colors);
                                           //System.out.println("c6p0i0->c6p6i6"); 
                                            break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,22,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i16->c6p6i22"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,38,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i32->c6p6i38"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p0i"+id);   
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,4,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i6->c6p4i4"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,20,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i22->c6p4i20"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,36,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i38->c6p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p6i"+id); 
                                            }
                                          ;break;
                                          
                                         case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,2,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i4->c6p2i2"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,18,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i20->c6p2i18"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,34,myJ3dFrame.cubi6.colors); 
                                         //System.out.println("c6p4i36->c6p2i34");
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p4i"+id);   
                                            }
                                          ;break;

                                          
                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,0,myJ3dFrame.cubi6.colors); 
                                         //System.out.println("c6p2i2->c6p0i0");
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,16,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i18->c6p0i16"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,32,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i34->c6p0i32"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p2i"+id);  
                                            }
                                          ;break;

                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi6BranchGroup);
                                         myJ3dFrame.cubi6BranchGroup=branchGroup;
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                       
                                         if(myJ3dFrame.showCubi6) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi6BranchGroup);
                                        } 
                                         break;
                                       
                                    
                         case 7: 
                               
                             if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi7.getPlace();
                                        int id=myJ3dFrame.cubi7.getId();
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 1:switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,7,myJ3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i1->c7p7i7");
                                           break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,33,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p1i35->c7p7i33"); 
                                          break;
                                       
                                           default:
                                           	  //System.out.println("default:c7p1i"+id);   
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,5,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p7i7->c7p5i5"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,39,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p7i33->c7p5i39"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c7p7i"+id);   
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,3,myJ3dFrame.cubi7.colors); 
                                         //System.out.println("c7p5i5->c7p3i3"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,37,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p5i39->c7p3i37"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c7p5i"+id);   
                                            }
                                          ;break;
                                          
                                          
                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,1,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p3i3->c7p1i1"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,35,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p3i37->c7p1i35"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c7p3i"+id);   
                                            }
                                          ;break;

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
                                      {
                                      	  case 1:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,17,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p1i19->c8p7i17<"); 
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,39,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p1i33->c8p7i39"); 
                                          break;
                                          
                                          default:
                                            	System.out.println("default:c8p1i"+id);  
                                          
                                            }
                                          ;break;
                                          
                                          case 7:
                                          switch(id)
                                          {
                                          case 17:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,23,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p7i17->c8p5i23"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,37,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p7i39->c8p5i37"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c8p7i"+id);  
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,21,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i23->c8p3i21"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,35,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i27->c8p3i35"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c8p5i"+id);   
                                            }
                                          ;break;
                                          
                                         case 3:
                                         switch(id)
                                          {case 21:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,19,myJ3dFrame.cubi8.colors); 
                                             //System.out.println(">c8p3i21->c8p1i19"); 
                                              break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,33,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p3i35->c8p1i33"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c8p3i"+id);  
                                            }
                                          ;break;

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
                                      {
                                      	  case 1:
                                          switch(id)
                                          {
                                          
                                          case 19:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,17,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i19->c10p7i17"); 
                                          break;	  
                                          	  
                                          case 33:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,39,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i33->c10p7i39"); 
                                          break;                                          

                                           default:
                                           	  //System.out.println("default:c10p1i"+id);   
                                            }
                                          ;break;
                                          
                                        case 7:
                                          switch(id)
                                          {
                                          case 17:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,23,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p7i17->c10p5i23"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,37,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p7i39->c10p5i37"); 
                                          break;// 
 
                                          default:
                                          	 //System.out.println("default:c10p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                          {                                       
                                          case 23:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,21,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p5i23->c10p3i21"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,35,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p5i37->c10p3i35"); 
                                          break;
                                                                                                                             
                                           default:
                                           	  //System.out.println("default:c10p5i"+id);  
                                            }
                                          ;break;
                                          
                                        case 3:
                                         switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,19,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p3i21->c10p1i19"); 
                                          break;
                                                                                    
                                          case 35:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,33,myJ3dFrame.cubi10.colors); 
                                         //System.out.println(">c10p3i35->c10p1i33"); 
                                          break;
                                          
                                          
                                            default:
                                            	System.out.println("default:c10p3i"+id);  
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
                                       break;
                                      
                                      
                       case 12: //cubi12
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi12.getPlace();
                                        int id=myJ3dFrame.cubi12.getId();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                      	  case 1:
                                          switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,39,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i33->c12p7i39"); 
                                          break;
                                          
                                          case 19:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,17,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i19->c12p7i17"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c12p1i"+id);   
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                          {
                                           case 39:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,37,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p7i39->c12p5i37"); 
                                          break;//	  
                                          	  
                                          case 17:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,23,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p7i17->c12p5i23"); 
                                          break;  	                                            	                                                                                     
                                                                                 
                                            default:
                                            	System.out.println("default:c12p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                          {
                                          case 37:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,35,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p5i37->c12p3i35"); 
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,21,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p5i23->c12p3i21"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c12p5i"+id);  
                                            }
                                          ;break;
                                      	  
                                        case 3:
                                         switch(id)
                                          {
                                           case 35:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,33,myJ3dFrame.cubi12.colors); 
                                         //System.out.println(">c12p3i35->c12p1i19"); 
                                          break;	  
                                          	  
                                          case 21:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,19,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p3i21->c12p1i33"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c12p3i"+id);  
                                            }
                                          ;break;

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
                                      {
                                        case 1:
                                         switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,39,myJ3dFrame.cubi14.colors); 
                                         //System.out.println(">c14p1i33->c14p7i39"); 
                                          break;
                                          
                                          case 19:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,17,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p1i19->c14p7i17"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c14p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                          {
                                          	  
                                          case 39:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,37,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p7i39->c14p5i37"); 
                                          break;// 
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,23,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p7i17->c14p5i23"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c14p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                          {
                                          case 37:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,35,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p5i37->c14p3i35"); 
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,21,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p5i23->c14p3i21"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c14p5i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          	  
                                          case 35:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,33,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p3i35->c14p1i33"); 
                                          break;
                                          
                                           case 21:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,19,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p3i21->c14p1i19"); 
                                          break;
                                              
                                           default:
                                           	  //System.out.println("default:c15p3i"+id);   
                                            }
                                          ;break;

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
                                      
               
                        case 16: //cubi16 // cubi0 bei 3x3 kann cubi0 sich auf den Plätzen 0,2,4,6 befinden
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi16.getPlace();
                                        int id=myJ3dFrame.cubi16.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                      	  case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,6,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p0i0->c16p6i6>"); 
                                          break;// 
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,22,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i16->c16p6i22"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,38,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i32->c16p6i38"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p0i"+id);  
                                            }
                                          ;break;
                                          
                                        case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,4,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p6i6->c16p4i4"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,20,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i22->c16p4i20"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,36,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i38->c16p4i36"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p6i"+id);   
                                            }
                                          ;break;
                                          
                                         case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,2,myJ3dFrame.cubi16.colors); 
                                         //System.out.println(">c16p4i4->c16p2i2"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,18,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i8->c16p2i18"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,34,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i16->c16p2i34"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p16i"+id);  
                                            }
                                          ;break;
                                          
                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,0,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p2i2->c16p0i0"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,16,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i18->c16p0i16"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,32,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i34->c16p0i32"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p2i"+id);  
                                            }
                                          ;break;

                                          
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
                                        
                                      switch(place) {
                                        case 1:
                                         switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,7,myJ3dFrame.cubi17.colors); 
                                         //System.out.println(">c17p1i1->c17p7i7"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,33,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p1i35->c17p7i33"); 
                                          break;                                          
                                           default:
                                           	  //System.out.println("default:c17p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,5,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p7i7->c17p5i5<"); 
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,39,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p7i33->c17p5i39"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c17p7i"+id);  
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,3,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">17p5i5->c17p3i3"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,37,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p5i39->c7p3i37"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c17p5i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,1,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p3i3->c17p1i1"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,35,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p3i37->c17p1i35"); 
                                          break;                                         
                                           default:
                                           	  //System.out.println("default:c17p3i"+id);   
                                            }
                                          ;break;

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
                                      	  case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,6,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p0i0->c18p6i6"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,22,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i16->c18p6i22"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,38,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i32->c18p6i38"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p0i"+id);  
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,4,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p6i6->c18p4i4<"); 
                                          break;// 
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,20,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i22->c18p4i20"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,36,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i38->c18p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,2,myJ3dFrame.cubi18.colors); 
                                         //System.out.println(">c18p4i4->c18p2i2"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,18,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i20->c18p2i18"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,34,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i36->c18p2i34"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p4i"+id);  
                                            }
                                          ;break;
                                          
                                          case 2:
                                           switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,0,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p2i2->c18p0i4"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,16,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i18->c18p0i16"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,32,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i34->c18p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p2i"+id);   
                                            }
                                          ;break;

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
                                        
                                      switch(place) {
                                        case 1:
                                         switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,7,myJ3dFrame.cubi19.colors); 
                                         //System.out.println(">c19p1i2->c19p7i7"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,33,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p1i35->c19p7i33"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c19p1i"+id);  
                                            }
                                          ;break;
                                          
                                        case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,5,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p7i7->c19p5i5<"); 
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,39,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p7i33->c19p5i39"); 
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c19p7i"+id);  
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,3,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p5i5->c19p3i3"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,37,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p5i39->c19p3i37"); 
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c19p5i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,1,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p3i3->c19p1i1"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,35,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p3i37->c19p1i35"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c19p3i"+id);   
                                            }
                                          ;break;

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
                                      switch(place) {
                                      	 case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,6,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p0i0->c20p6i62"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,22,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i16->c20p6i22"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,38,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i32->c20p6i38"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p0i"+id);  
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,4,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p6i6->c20p4i4<"); 
                                          break;// 
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,20,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i22->c20p4i20"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,36,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i38->c20p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,2,myJ3dFrame.cubi20.colors); 
                                         //System.out.println(">c20p4i4->c20p2i2"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,18,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i20->c18p2i18"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,34,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i36->c18p2i34"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p4i"+id);  
                                            }
                                          ;break;
                                          
                                           case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,0,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p2i2->c20p0i0"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,16,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i18->c20p0i16"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,32,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i34->c20p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p2i"+id);   
                                            }
                                          ;break;

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
                                      switch(place) {
                                        case 1:
                                         switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,7,myJ3dFrame.cubi21.colors); 
                                         //System.out.println(">c21p1i1->c21p7i7"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,33,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p1i35->c21p7i33"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c21p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,5,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p7i7->c21p5i5<"); 
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,39,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p7i33->c21p5i39"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c21p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,3,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p5i5->c21p3i3"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,37,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p5i39->c21p3i37"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c21p5i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,1,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p3i3->c18p1i1"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,35,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c7p3i37->c21p1i35"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c21p3i"+id);   
                                            }
                                          ;break;

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
                                      switch(place) {
                                      	  
                                      	 case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,6,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p0i0->c22p6i6");
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,22,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p0i16->c22p6i22"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,38,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p0i32->c2p2i38"); 
                                          break;
                                            default:
                                            	System.out.println("default:c22p0i"+id);  
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,4,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p6i6->c22p4i4<"); 
                                          break;// 
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,20,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i22->c22p4i20"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,36,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i38->c22p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c22p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,2,myJ3dFrame.cubi22.colors); 
                                         //System.out.println(">c22p4i4->c22p2i2"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,18,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p4i20->c22p2i18");
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,34,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p4i36->c22p2i34");
                                          break;
                                            default:
                                            	System.out.println("default:c22p4i"+id);  
                                            }
                                          ;break;
                                          
                                         case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,0,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p2i2->c22p0i0"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,16,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p1i9->c22p0i16"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,32,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p1i17->c22p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p2i"+id);   
                                            }
                                          ;break;
                                          
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
                                        case 1:
                                         switch(id)
                                          {                                          
                                          case 17:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,23,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p1i17->c23p7i23"); 
                                          break;
                                          case 3:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,1,myJ3dFrame.cubi23.colors); 
                                         //System.out.println(">c23p1i3->c23p7i1"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c23p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 7:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,21,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p7i23->c23p5i21"); 
                                          break;
                                          
                                          case 1:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,7,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p7i1->c23p5i7<"); 
                                          break;// 
                                          default:
                                          	 //System.out.println("default:c23p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,19,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p4i12->c23p3i19"); 
                                          break;	  
                                          	  
                                          case 7:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,5,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p5i7->c23p3i5"); 
                                          break;
                                        
                                            default:
                                            	System.out.println("default:c23p5i"+id);  
                                            }
                                          ;break;

                                        case 3:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,17,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p3i19->c23p1i17"); 
                                          break;
                                          
                                          case 5:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,3,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p3i5->c23p1i3"); 
                                          break;
                                        
                                           default:
                                           	  //System.out.println("default:c23p3i"+id);   
                                            }
                                          ;break;

                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                               case 9: //cubi9 
                                      if(setD.contains(i))
                                      { int place =myJ3dFrame.cubi9.getPlace();
                                        int id=myJ3dFrame.cubi9.getId();
                                        BranchGroup branchGroup=null;
                                        
                                       switch(place)
                                       { 
                                       	  case 9:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,9,1,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p9i1->c9p9i1");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p9"+id);  
                                            }
                                         break;
                                         
                                         case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,11,3,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p11i3->c9p11i3");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p11"+id);  
                                            }
                                         break;
                                         
                                         case 13:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,13,5,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p13i5->c9p13i5");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p13"+id);  
                                            }
                                         break;
                                         
                                         case 15:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,15,7,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p15i7->c9p15i7");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p15"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,24,32,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p24i32->c9p24i32"+id);
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p25i25->c9p25i25");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p25"+id);  
                                            }
                                         break;    
                                       }
                                                                                                                      
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.cubi9BranchGroup=branchGroup;
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup);
                                        } 
                                       
                                 break;
                                 
                               case 11: //cubi11 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi11.getPlace();
                                        int id=myJ3dFrame.cubi11.getId();
                                        
                                        BranchGroup branchGroup=null;
                                        
                                        switch(place)
                                       { 
                                         case 9:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,9,1,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p9i1->c11p9i1");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p9"+id);  
                                            }
                                         break;
                                         
                                         case 11: 
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p11i3->c11p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p11"+id);  
                                            }
                                         break;
                                         
                                         case 13:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,13,5,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p13i5->c11p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p13"+id);  
                                            }
                                         break;
                                         
                                         case 15: 
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p15i7->c11p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p15"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p24i32->c11p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                           //System.out.println("default:c11p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p25i25->c11p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p25"+id);  
                                            }
                                         break;
                                         
                                         
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
                                        
                                         switch(place)
                                       { 
                                       	case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,9,1,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p9i1->c13p9i1");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p9"+id);  
                                            }
                                         break;
                                         
                                          case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,11,3,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p11i3->c13p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p11"+id);  
                                            }
                                         break;
                                         
                                          case 13:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,13,5,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p13i5->c13p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p13"+id);  
                                            }
                                         break;
                                         
                                          case 15:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,15,7,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p15i7->c13p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p15"+id);  
                                            }
                                         break;
                                         
                                          case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,24,32,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p24id32->c13p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p24"+id);  
                                            }
                                         break;
                                         
                                          case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,25,25,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p25i25->c13p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p25"+id);  
                                            }
                                         break;
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
                                         switch(place)
                                       { 
                                       	case 9://Drehachse
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,9,1,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p9i1->c15p9i1");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p9"+id);  
                                            }
                                         break;
                                         
                                         case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,11,3,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p11i3->c15p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p11"+id);  
                                            }
                                         break;
                                         
                                         case 13://Drehachse
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,13,5,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p13i5->c15p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p13"+id);  
                                            }
                                         break;
                                         
                                         case 15:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,15,7,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p15i7->c15p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p15"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,24,32,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p24i32->c15p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,25,25,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p25i25->c15p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p25"+id);  
                                            }
                                         break;  
                                        
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
                                       
                               case 24: //cubi24 
                                      if(setD.contains(i))
                                      { int place =myJ3dFrame.cubi24.getPlace();
                                        int id=myJ3dFrame.cubi24.getId();
                                        BranchGroup branchGroup=null;
                                        
                                        switch(place)
                                        {
                                         case 9:
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,9,11,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p9i11->c24p9i11");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p9i"+id);  
                                            }
                                         break;
                                         
                                         case 11:
                                          switch(id)
                                         {
                                          case 13:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,11,13,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p11i13->c24p11i13");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p11i"+id);  
                                            }
                                         break;
                                         
                                         case 13:
                                          switch(id)
                                         {
                                          case 15:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,13,15,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p13i15->c24p13i15");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15:
                                          switch(id)
                                         {
                                          case 9:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,15,9,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p15i9->c24p15i9");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,24,0,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p24i0->c24p24i0");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,25,41,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p25i41->c24p25i41");
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
                                       break;
                                       
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
                                          case 1:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,9,1,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p9i1->c25p9i1");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p9i"+id);  
                                            }
                                         break;
                                         
                                         case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,11,3,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p11i3->c25p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p11i"+id);  
                                            }
                                         break;
                                                                                
                                       case 13:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,13,5,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p13i5->c25p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,15,7,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p15i7->c25p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,24,32,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p24i32->c25p24i32");
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
                myJ3dFrame.DRotationInterpolator.setMaximumAngle(myJ3dFrame.Dwinkel+(float)Math.PI/2);
                myJ3dFrame.Dalpha.setStartTime(System.currentTimeMillis()+100); //WarteZeit
                myJ3dFrame.Dwinkel=myJ3dFrame.Dwinkel+((float) Math.PI/2);
                
                f=finish();
                while(!f){ f=finish();} 
               //System.out.println("down <--");
                }
            }//wegen Ausstieg
    
    public Rotdoun(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    {   this.myJ3dFrame=myJ3dFrame;  
    	rotAchsedown=new Button("d"); // rotAchseDown-->
            rotAchsedown.setBounds(xa,ya,b,h);
            
         rotAchsedown.addActionListener(new ActionListener()
            { 
            public void actionPerformed(ActionEvent e)
            {
            downAction();
            }
          });   
    }   
}
