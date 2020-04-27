import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;

/**
 * Write a description of class RotRight here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
public class RotRight extends Rot
{ static J3dFrame myJ3dFrame;
	Button rotAchseRight;
   static boolean f;
   static Set<Integer> setR=new HashSet<Integer>();
 
    Button getrotAchseRight()
    { return rotAchseRight;
      }
  
     
    static public void RightAction()
   {        if(myJ3dFrame.showCubi2) setR.add(2);
            if(myJ3dFrame.showCubi3) setR.add(3);
            if(myJ3dFrame.showCubi4) setR.add(4);
            if(myJ3dFrame.showCubi10) setR.add(10);
            if(myJ3dFrame.showCubi11) setR.add(11);
            if(myJ3dFrame.showCubi12) setR.add(12);
            if(myJ3dFrame.showCubi18) setR.add(18);
            if(myJ3dFrame.showCubi19) setR.add(19);
            if(myJ3dFrame.showCubi20) setR.add(20);
            ActionFrame.textArea.append("R");
            
           int[] nrArray=new int[26];
           int[] placeArray=new int[26];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {  placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                   //System.out.println("Right -->");                  
                   //zustandsAusgabe(nrArray,placeArray,setR);
                    //myJ3dFrame.showCubisVisible();
                    
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setR.contains(i))
                                      {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setR.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi5BranchGroup);
                                      };break; 
                         case 6: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi6BranchGroup);
                                      };break;
                         case 7: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi7BranchGroup);
                                      };break;
                         case 8: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi8BranchGroup);
                                      };break;
                         case 9: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi9BranchGroup);
                                      };break;
                         case 10: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi10BranchGroup);
                                       };break;
                         case 11: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi11BranchGroup);
                                      };break;                                                    
                         case 12: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi12BranchGroup);
                                      };break;
                         case 13: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi13BranchGroup);
                                      };break;
                         case 14: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi14BranchGroup);
                                      };break;
                         case 15: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi15BranchGroup);
                                      };break;
                         case 16: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi16BranchGroup);
                                      };break;
                         case 17: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi17BranchGroup);
                                      };break;
                         case 18: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi18BranchGroup);
                                      };break;
                         case 19: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi19BranchGroup);
                                      };break;
                         case 20: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi20BranchGroup);
                                      };break;
                         case 21: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi21BranchGroup);
                                      };break;
                         case 22: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi22BranchGroup);
                                      };break;
                         case 23: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi23BranchGroup);
                                      };break;
                         case 24: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi24BranchGroup);
                                      };break;
                         case 25: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi25BranchGroup);
                                      };break;
                        }
                //Vorbereitung -->
                               
                f=finish();
                while(!f){ f=finish();}
                 if(finish())
                {
                    
               myJ3dFrame.RRotationInterpolator.setMinimumAngle(myJ3dFrame.Rwinkel+0f);
               myJ3dFrame.RRotationInterpolator.setMaximumAngle(myJ3dFrame.Rwinkel-(float)Math.PI/2);
               myJ3dFrame.Ralpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Rwinkel=myJ3dFrame.Rwinkel-((float) Math.PI/2);               
                               // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();}
                    
                } 
                               
                //Nachbereitung
                
                for (int i=0;i<26;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       {   
                         case 0://cubi0
                                 if(setR.contains(i))
                                 {                                                                            
                                        int id=myJ3dFrame.cubi0.getId();
                                        int place =myJ3dFrame.cubi0.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                        case 2:
                                          switch(id)
                                         {case 2:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,10,myJ3dFrame.cubi0.colors);
                                           //System.out.println(">c0p2i2->c2p18i10"); 
                                            break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,26,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i18->c0p18i26"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,42,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i34->c0p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p2i"+id); 
                                            }
                                          ;break;
                                          
                                           case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,44,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p18i10->c0p20i44<"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,12,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i26->c0p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,28,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i42>c0p20i28"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p18i"+id);   
                                            }
                                          ;break;
                                          
                                           case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,20,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p20i44->c0p4i20<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,36,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i12->c0p4i36"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,4,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i28->c0p4i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p20i"+id);   
                                            }
                                          ;break;
                                       
                                        case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,2,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p4i20->c2p2i2<"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,18,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i36->c0p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,34,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i4->c0p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p4i"+id);   
                                            }
                                          ;break;
                                        
                                          }
                                          
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi0BranchGroup);
                                         myJ3dFrame.cubi0BranchGroup=branchGroup;
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                     
                                         if(myJ3dFrame.showCubi0) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi0BranchGroup); 
                                         id=myJ3dFrame.cubi0.getId();
                                         place =myJ3dFrame.cubi0.getPlace();
                                         
                                         
                                    };break;
                                      
                         case 1: //cubi1
                         if(setR.contains(i))
                                 {                                  
                                        int id=myJ3dFrame.cubi1.getId();
                                        int place =myJ3dFrame.cubi1.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                                                                  
                                         case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,10,10,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p3i3->c1p10i10"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,10,18,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p3i37->c1p10i18"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c1p3i"+id);  
                                            }
                                          ;break;

                                         case 10:
                                          switch(id)
                                         {
                                         	                                           
                                          case 10:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,45,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p10i10->c1p19i45"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,27,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p10i18->c1p19i27<"); 
                                          break;
                                                                                                             
                                           default:
                                           	  //System.out.println("default:c1p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                          {
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,12,20,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i45->c1p12i20"); 
                                          break;
                                                                                    
                                          case 27:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,12,12,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i27->c1p12i12"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c1p19i"+id);   
                                            }
                                          ;break;
                                                                                                                                                                     
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,3,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p12i21->c1p3i3<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,37,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p12i12->c1p3i37"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c3p12i"+id);   
                                            }
                                          ;break;
                                                                                   
                                          }
                                           
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                      
                                       };break;
                            case 2: 
                                       if(setR.contains(i))
                                 {                                                                            
                                        int id=myJ3dFrame.cubi2.getId();
                                        int place =myJ3dFrame.cubi2.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {case 2:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,10,myJ3dFrame.cubi2.colors);
                                            //System.out.println(">c2p2i2->c2p18i10"); 
                                             break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,26,myJ3dFrame.cubi2.colors);//42?
                                         //System.out.println("c2p2i18->c2p18i26"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,42,myJ3dFrame.cubi2.colors);//26?
                                         //System.out.println("c2p0i16->c2p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p2i"+id); 
                                            }
                                          ;break;
                                          
                                        case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,44,myJ3dFrame.cubi2.colors);
                                         //System.out.println(">c2p18i10->c2p20i44<"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,12,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i26->c2p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,28,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i42->c2p20i28"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p18i"+id);   
                                            }
                                          ;break;
                                          
                                        case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,20,myJ3dFrame.cubi2.colors);
                                         //System.out.println(">c2p20i44->c2p4i44<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,36,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p5i13->c2p2i12"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,4,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p5i21->c2p2i28"); 
                                          break;
                                           default:System.out.println("default:c2p20i"+id);   
                                            }
                                            
                                          ;break;
                                          
                                         

                                          case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,2,myJ3dFrame.cubi2.colors);
                                         //System.out.println(">c2p4i20->c2p2i2"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,18,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i36->c2p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,34,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i4->c2p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p4i"+id);   
                                            }
                                          ;break;
                                          
                                          }
                                           
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi2BranchGroup);
                                         myJ3dFrame.cubi2BranchGroup=branchGroup;
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi2) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3://cubi3 
                                 if(setR.contains(i))
                                 { 
                                  
                                        int id=myJ3dFrame.cubi3.getId();
                                        int place =myJ3dFrame.cubi3.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                                                                  
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,10,10,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i3->c3p10i18"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,10,18,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i37->c3p10i10"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c3p3i"+id);  
                                            }
                                          ;break;

                                          case 10:
                                          switch(id)
                                         {
                                                                                 
                                          case 10:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,45,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p10i10->c3p19i45"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,27,myJ3dFrame.cubi3.colors);
                                         //System.out.println(">c3p10i18->c3p19i27<"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c3p10i"+id);   
                                            }
                                          ;break;
                                                                                                              
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,12,20,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i45->c3p12i20"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,12,12,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i27->c3p12i12"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c3p19i"+id);   
                                            }
                                          ;break;
                                          
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,3,myJ3dFrame.cubi3.colors);
                                         //System.out.println(">c3p12i21->c3p3i3<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,37,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p12i12->c3p3i37"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c3p12i"+id);   
                                            }
                                          ;break;                                         
                                          
                                          }
                                           
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4: //cubi4
                                 if(setR.contains(i))
                                 {                                                                           
                                        int id=myJ3dFrame.cubi4.getId();
                                        int place =myJ3dFrame.cubi4.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,10,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i2->c4p18i10"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,26,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i18->c4p18i26"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,42,myJ3dFrame.cubi4.colors);
                                            //System.out.println("c4p2i34->c4p18i42"); 
                                             break;
                                            default:
                                            	System.out.println("default:c4p2i"+id); 
                                            }
                                          ;break;
                                          
                                          case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,44,myJ3dFrame.cubi4.colors);
                                         //System.out.println(">c4p18i10->c4p20i44<"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,12,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i26->c4p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,28,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i42->c42p20i28"); 
                                          break;
                                           default:System.out.println("default:c4p18i"+id);   
                                            }
                                            
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,20,myJ3dFrame.cubi4.colors);
                                         //System.out.println(">c4p20i44->c4p4i20<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,36,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i12->c4p4i36"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,4,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i28->c4p4i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p20i"+id);   
                                            }
                                          ;break;
                                                                                 

                                          case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,2,myJ3dFrame.cubi4.colors);
                                         //System.out.println(">c4p4i20->c4p2i34"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,18,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i36->c4p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,34,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i4->c4p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p4i"+id);   
                                            }
                                          ;break;
                                                                                                                          
                                          }
                                           
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi4BranchGroup);
                                         myJ3dFrame.cubi4BranchGroup=branchGroup;
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi4) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                         case 5: 
                           if(setR.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi5.getId();
                                        int place =myJ3dFrame.cubi5.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         
                                          
                                         case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,10,10,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p3i3->c5p10i10"); 
                                          break;
                                                                                   	 
                                          case 37:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,10,18,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p3i37->c5p10i18"); 
                                          break;
                                                                                  
                                            default:
                                            	System.out.println("default:c5p3i"+id);  
                                            }
                                          ;break;

                                          case 10:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,45,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p10i10->c5p19i45"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,27,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p10i18->c5p19i27<"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c5p10i"+id);   
                                            }
                                          ;break;
                                          
                                          case 19:
                                          switch(id)
                                          {
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,12,20,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i45->c5p12i20"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,12,12,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i27->c5p12i12"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p19i"+id);   
                                            }
                                          ;break;
                                                                                    
                                          
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,3,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p12i21->c5p3i3<"); 
                                          break;
                                                                                   
                                          case 12:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,37,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p12i12->c5p3i37"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p12i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi5BranchGroup);
                                         myJ3dFrame.cubi5BranchGroup=branchGroup;
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi5) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                                    if(setR.contains(i))
                                 {                                                                           
                                        int id=myJ3dFrame.cubi6.getId();
                                        int place =myJ3dFrame.cubi6.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {case 2:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,10,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i2->c6p18i10"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,26,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i18->c6p18i26"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,42,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i34->c6p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p2i"+id); 
                                            }
                                          ;break;
                                          
                                         case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,44,myJ3dFrame.cubi6.colors);
                                         //System.out.println(">c6p18i10->c6p20i44<"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,12,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i26->c6p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,28,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i42->c6p20i28"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p18i"+id);   
                                            }
                                          ;break; 
                                         
                                         case 20:
                                         switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,20,myJ3dFrame.cubi6.colors);
                                         //System.out.println(">c6p20i44->c6p4i20<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,36,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i12->c6p4i36"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,4,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i28->c6p4i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p20i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,2,myJ3dFrame.cubi6.colors);
                                         //System.out.println(">c6p4i20->c6p2i2"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,18,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i36->c6p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,34,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i4->c6p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p4i"+id);   
                                            }
                                          ;break;
                                  }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi6BranchGroup);
                                         myJ3dFrame.cubi6BranchGroup=branchGroup;
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi6) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                                 if(setR.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi7.getId();
                                        int place =myJ3dFrame.cubi7.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                                                                    
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,10,10,myJ3dFrame.cubi7.colors);
                                         //System.out.println(">c7p3i3->c7p10i10"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,10,18,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p3i37->c7p10i18"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c7p3i"+id);  
                                            }
                                          ;break;

                                          case 10:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,45,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p10i10->c7p19i45"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,27,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p10i18->c7p19i27"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c7p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,12,20,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i45->c7p12i20"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,12,12,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i27->c7p12i12"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c7p19i"+id);   
                                            }
                                          ;break; 
                                          
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,3,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p12i20->c7p3i3"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,37,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p12i12->c7p3i37"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c7p12i"+id);   
                                            }
                                          ;break;
                                                                                 
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                         case 8: //cubi8
                                 if(setR.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi8.getId();
                                        int place =myJ3dFrame.cubi8.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         
                                          
                                          case 3:
                                          switch(id)
                                         {
                                          case 21:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,10,2,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p3i20->c8p10i2<"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,10,42,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p3i34->c8p10i42"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c8p3i"+id);  
                                            }
                                          ;break;

                                          
                                         case 10:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,11,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p10i2->c8p19i11<"); 
                                          break;
                                         
                                          case 42:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,29,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p10i42->c8p19i29"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c8p8i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,12,44,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p19i11->c8p12i44"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,12,4,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p19i29->c8p12i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c8p19i"+id);   
                                            }
                                          ;break;
                                                                                                                             
                                          case 12:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,21,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p12i44->c8p3i21"); 
                                          break;
                                          
                                          case 4:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,35,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p12i4->c8p3i35"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c8p12i"+id);   
                                            }
                                          ;break;
                                                    
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                       ;break;
                                     
                            
                                 
                           case 10: //cubi10
                                 if(setR.contains(i))
                                 { 
                                   
                                        
                                        int id=myJ3dFrame.cubi10.getId();
                                        int place =myJ3dFrame.cubi10.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                                                                    
                                          case 3:
                                          switch(id)
                                         {
                                          case 21:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,10,2,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p3i21->c10p10i2<"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,10,42,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p3i35->c10p10i42"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c10p3i"+id);  
                                            }
                                          ;break;

                                          case 10:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,11,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p10i2->c10p19i11<"); 
                                          break;
                                                                                                                             
                                          case 42:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,29,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p10i42->c10p19i29"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c19p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,12,44,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i11->c10p12i44"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,12,4,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i29->c10p12i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c10p19i"+id);   
                                            }
                                          ;break;                                         
                                                                                                                              
                                         case 12:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,21,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p12i44->c10p3i21"); 
                                          break;                                          
                                          
                                          case 4:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,35,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p12i4->c10p3i35"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c10p12i"+id);   
                                            }
                                          ;break;
                                          
                                     }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi10BranchGroup);
                                         myJ3dFrame.cubi10BranchGroup=branchGroup;
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi10) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi10BranchGroup); 
                                          
                                      }
                                       ;break;
                      
                               
                                      
                       case 12: //cubi12
                                 if(setR.contains(i))
                                 {                                                                           
                                        int id=myJ3dFrame.cubi12.getId();
                                        int place =myJ3dFrame.cubi12.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {                                       
                                          
                                          case 3:
                                          switch(id)
                                         {
                                          case 21:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,10,2,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p3i21->c12p10i2"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,10,42,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p3i35->c12p10i42"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c12p3i"+id);  
                                            }
                                          ;break;

 
                                         case 10:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,11,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p10i2->c12p19i11<"); 
                                          break;
                                                                                                                              
                                          case 42:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,29,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p10i42->c12p19i29"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c12p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,12,44,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p19i11->c12p12i44<"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,12,4,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i29->c12p12i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c12p19i"+id);   
                                            }
                                          ;break;
                                                                                    
                                          
                                          case 12:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,21,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p12i44->c12p3i21<"); 
                                          break;
                                          
                                          case 4:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,35,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p12i4->c12p3i35"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c12p12i"+id);   
                                            }
                                          ;break;
                                                                                                                   
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                       ;break;
                                      
                        
                              
                        case 14: //cubi14
                                 if(setR.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi14.getId();
                                        int place =myJ3dFrame.cubi14.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                                                                  
                                         case 3:
                                          switch(id)
                                         {
                                          case 21:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,10,2,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p3i21->c14p10i2"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,10,42,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p3i35->c14p10i42"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c14p3i"+id);  
                                            }
                                          ;break;

                                          
                                         case 10:
                                          switch(id)
                                         {
                                          case 2:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,11,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p10i2->c14p19i11"); 
                                          break;                                         
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,29,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p10i42->c14p19i29"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c14p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,12,44,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i11->c14p12i44<"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,12,4,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i29->c14p12i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c14p19i"+id);   
                                            }
                                          ;break;
                                                                                    
                                          
                                          case 12:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,21,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p12i44->c14p3i21"); 
                                          break;
                                          
                                          case 4:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,35,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p12i4->c14p3i35"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c14p14i"+id);   
                                            }
                                          ;break;
                                                                               
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                       

                 
               
                          
               
                        case 16: //cubi16
                                 if(setR.contains(i))
                                 { 
                                   
                                        int id=myJ3dFrame.cubi16.getId();
                                        int place =myJ3dFrame.cubi16.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {case 2:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,10,myJ3dFrame.cubi16.colors);
                                           //System.out.println(">c16p2i2->c16p18i10"); 
                                            break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,26,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i18->c16p18i26"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,42,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i34->c16p18i34"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p2i"+id); 
                                            }
                                          ;break;
                                          
                                       case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,44,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p18i10->c16p20i44<"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,12,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i26->c16p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,28,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i42->c16p20i28"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p18i"+id);   
                                            }
                                          ;break; 
                                          
                                         case 20:
                                         switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,20,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p20i44->c16p4i20<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,36,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i12->c16p4i36"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,4,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i28->c16p4i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p20i"+id);   
                                            }
                                          ;break;
                                          
                                          case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,2,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i20->c16p2i2"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,18,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i36->c16p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,34,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i4->c16p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p4i"+id);   
                                            }
                                          ;break;
                              
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi16BranchGroup);
                                         myJ3dFrame.cubi16BranchGroup=branchGroup;
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi16) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi16BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                             case 17: //cubi17
                                 if(setR.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi17.getId();
                                        int place =myJ3dFrame.cubi17.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,10,10,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p3i3->c17p10i10"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,10,18,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p3i37->c17p10i18"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c17p3i"+id);  
                                            }
                                          ;break;                                        

                                          case 10:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,45,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p10i10->c17p19i45"); 
                                          break;
                                                                                    
                                          case 18:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,27,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p10i18->c17p19i27");
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,12,20,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i45->c17p12i20"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,12,12,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i27->c17p12i12"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p19i"+id);   
                                            }
                                          ;break;
                                                                                   
                                          case 12:
                                          switch(id)
                                          {
                                          case 20:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,3,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p12i20->c17p3i3"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,37,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p12i12->c17p3i37"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p12i"+id);   
                                            }
                                          ;break;
                                                                                                                                                                                                           
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 18: //cubi18
                                   if(setR.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi18.getId();
                                        int place =myJ3dFrame.cubi18.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {case 2:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,10,myJ3dFrame.cubi18.colors);
                                          //System.out.println(">c18p2i2->c18p18i10"); 
                                           break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,26,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i18->c18p18i26"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,42,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i34->c18p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p2i"+id); 
                                            }
                                          ;break;
                                          
                                         case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,44,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i10->c18p20i44"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,12,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i26->c18p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,28,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i42->c18p20i28"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p18i"+id);   
                                            }
                                          ;break;
                                                                                    
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,20,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p20i44->c18p4i20<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,36,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i12->c18p4i36"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,4,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i28->c18p4i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p20i"+id);   
                                            }
                                          ;break;
                                                                                    
                                          case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,2,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i20->c18p2i2"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,18,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i36->c18p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,34,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i4->c18p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p4i"+id);   
                                            }
                                          ;break;
                                 
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi18BranchGroup);
                                         myJ3dFrame.cubi18BranchGroup=branchGroup;
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi18) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi18BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 19: //cubi19
                                   if(setR.contains(i))
                                 {                                      
                                        int id=myJ3dFrame.cubi19.getId();
                                        int place =myJ3dFrame.cubi19.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                         
                                          
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,10,10,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p3i3->c19p10i10"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,10,18,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p3i37->c19p10i18"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c19p3i"+id);  
                                            }
                                          ;break;

 
                                         case 10:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,45,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p10i10->c19p19i45<"); 
                                          break;
                                                                                   
                                          case 18:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,27,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c10p10i18->c19p19i27"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c19p10i"+id);   
                                            }
                                          ;break;
                                                                                    
                                         case 19:
                                          switch(id)
                                         {                                          
                                          case 45:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,12,20,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i45->c19p12i20"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,12,12,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i27->c19p12i12"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c19p19i"+id);   
                                            }
                                          ;break;
                                                                                  
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,3,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p12i20->c19p3i3"); 
                                          break;
                                         
                                          case 12:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,37,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p12i12->c19p3i37"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c19p12i"+id);   
                                            }
                                          ;break;
                                                       
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 20: //cubi20
                                   if(setR.contains(i))
                                 {     
                                        int id=myJ3dFrame.cubi20.getId();
                                        int place =myJ3dFrame.cubi20.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {case 2:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,10,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p2i2->c20p18i10"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,26,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i18->c20p18i26"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,42,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i34->c20p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p2i"+id); 
                                            }
                                          ;break;
                                          
                                         case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,44,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i10->c20p20i44"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,12,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i26->c20p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,28,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i42->c20p20i28"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p18i"+id);   
                                            }
                                          ;break;
                                          
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,20,myJ3dFrame.cubi20.colors);//?
                                         //System.out.println(">c20p20i44->c20p4i20"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,36,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i12->c20p4i36"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,4,myJ3dFrame.cubi20.colors);//?
                                         //System.out.println("c20p20i28->c20p4i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p20i"+id);   
                                            }
                                          ;break;
                                          

                                          case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,2,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p4i20->c20p2i2"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,18,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i36->c20p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,34,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i4->c20p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p4i"+id);   
                                            }
                                          ;break;
                            
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi20BranchGroup);
                                         myJ3dFrame.cubi20BranchGroup=branchGroup;
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi20) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi20BranchGroup); 
                                          
                                      }
                                       ;break;
                        case 21: //cubi21
                                   if(setR.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi21.getId();
                                        int place =myJ3dFrame.cubi21.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                                                                   
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,10,10,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p3i3->c21p10i10"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,10,18,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p3i37->c21p10i18"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c21p3i"+id);  
                                            }
                                          ;break;

                                          case 10:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,45,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p10i10->c21p19i45<"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,27,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p10i18->c21p19i27"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,12,20,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p19i45->c21p12i20"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,12,12,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p19i27->c21p12i12"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p19i"+id);   
                                            }
                                          ;break;                                                                                    
                                          
                                          case 12:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,3,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p12i20->c21p3i3"); 
                                          break;
                                                                                   
                                          case 12:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,37,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p12i12->c21p3i37"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p12i"+id);   
                                            }
                                          ;break;
                                     
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                       ;break;
                          case 22: //cubi22
                                   if(setR.contains(i))
                                 { 
                                      
                                        int id=myJ3dFrame.cubi22.getId();
                                        int place =myJ3dFrame.cubi22.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {case 2:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,10,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p2i2->c22p18i10"); 
                                          break;
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,42,myJ3dFrame.cubi22.colors);//26
                                         //System.out.println("c22p2i18->c22p18i42"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,26,myJ3dFrame.cubi22.colors);//42
                                         //System.out.println("c22p2i34->c22p18i26"); 
                                          break;
                                            default:
                                            	System.out.println("default:c22p2i"+id); 
                                            }
                                          ;break;
                                          
                                        case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,28,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p18i10->c22p20i28<"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,44,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i26->c22p20i12"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,12,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i42->c22p20i44"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p18i"+id);   
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,4,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p20i44->c22p4i4<"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,36,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i12->c22p4i36"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,20,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i28->c22p4i20"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p20i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 20:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,2,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p4i20->c22p2i2"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,18,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p4i36->c22p2i18"); 
                                          break;
                                                  
                                          case 4:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,34,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p4i4->c22p2i34"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p4i"+id);   
                                            }
                                          ;break;

                                    
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi22BranchGroup);
                                         myJ3dFrame.cubi22BranchGroup=branchGroup;
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi22) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi22BranchGroup); 
                                          
                                      }
                                       ;break;
                         case 23: //cubi23
                                   if(setR.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi23.getId();
                                        int place =myJ3dFrame.cubi23.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         
                                          
                                          case 3:
                                          switch(id)
                                         {
                                          case 19:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,10,42,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p3i19->c23p10i43"); 
                                          break;
                                          
                                          case 5:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,10,34,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p3i5->c23p10i34"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c23p3i"+id);  
                                            }
                                          ;break;

                                          case 10:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,13,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p10i43->c23p19i13"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,27,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p10i34->c23p19i27"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c23p10i"+id);   
                                            }
                                          ;break;
                                          
                                          case 19:
                                          switch(id)
                                         {
                                          
                                          case 13:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,12,36,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p19i13->c23p12i36");
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,12,44,myJ3dFrame.cubi23.colors);//12
                                         //System.out.println("c23p19i27->c23p12i44"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c23p19i"+id);   
                                            }
                                          ;break;
                                                                                                                             
                                          case 12:
                                          switch(id)
                                         {
                                          case 36:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,19,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p12i36->c23p3i19<"); 
                                          break;                                          
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,5,myJ3dFrame.cubi23.colors);//37
                                         //System.out.println("c23p12i44->c23p3i5"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c23p12i"+id);   
                                            }
                                          ;break;
                                                                                   
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 9: 
                                      if(setR.contains(i))
                                      { int place =myJ3dFrame.cubi9.getPlace();
                                        int id=myJ3dFrame.cubi9.getId();
                                        BranchGroup branchGroup=null; 
                                        
                                         switch(place)
                                       { 
                                       	 case 9:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,9,1,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p9i1->c9p9i1");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p9"+id);  
                                            }
                                         break;
                                         
                                         case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p11i3->c9p11i3");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p11"+id);  
                                            }
                                         break;
                                         
                                         case 13:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,13,5,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p13i5->c9p13i5");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p13"+id);  
                                            }
                                         break;
                                         
                                         case 15:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p15i7->c9p15i7");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p15"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p24i32->c9p24i32"+id);
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p25i25->c9p25i25");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p25"+id);  
                                            }
                                         break;
                                        }
                                                                          
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.cubi9BranchGroup=branchGroup;
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup);
                                        } 
                                       
                                 break;
                                 
                           case 11: //cubi11
                                 if(setR.contains(i))
                                 { 
                                   
                                        
                                        int id=myJ3dFrame.cubi11.getId();
                                        int place =myJ3dFrame.cubi11.getPlace();
                                                                               
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
                                            	System.out.println("default:c11p24"+id);  
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
                                   
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi11BranchGroup);
                                         myJ3dFrame.cubi11BranchGroup=branchGroup;
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi11) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi11BranchGroup); 
                                          
                                      }
                                      break;
                                      
                            case 13: //cubi13 
                                 if(setR.contains(i))
                                 { 
                                   
                                        
                                        int id=myJ3dFrame.cubi13.getId();
                                        int place =myJ3dFrame.cubi13.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                         switch(place)
                                       {  case 9://Drehachse
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
                                         
                                          case 13://Drehachse
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
                                                                               
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi13BranchGroup);
                                         myJ3dFrame.cubi13BranchGroup=branchGroup;
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi13) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi13BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 15: //cubi15
                                 if(setR.contains(i))
                                 {                                                                            
                                        int id=myJ3dFrame.cubi15.getId();
                                        int place =myJ3dFrame.cubi15.getPlace();
                                                                               
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
                                      
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi15BranchGroup);
                                         myJ3dFrame.cubi15BranchGroup=branchGroup;
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi15) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi15BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 24: //  cubi 24                                    	  
                                      if(setR.contains(i))
                                      { int place =myJ3dFrame.cubi24.getPlace();
                                        int id=myJ3dFrame.cubi24.getId();
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      { 
                                      case 9://Drehachse
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
                                         
                                         case 13://Drehachse
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
                                                                                                                       
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);
                                      }
                                     ;break;
                                     
                            case 25: //  cubi25                                  	  
                                      if(setR.contains(i))
                                      { int place =myJ3dFrame.cubi25.getPlace();
                                        int id=myJ3dFrame.cubi25.getId();
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      { 
                                       case 9://Drehachse
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
                                                                                
                                       case 13://Drehachse
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
                                                                                                                       
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.cubi25BranchGroup=branchGroup;
                                       myJ3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi25BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi25BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi25) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi25BranchGroup);
                                      }
                                     ;break;
                                                                                    
                                    } 
                
                f=finish();
                while(!f){ f=finish();}
                                  
                placeArray=fillPlaceArray();
                nrArray=fillNrArray(placeArray);
                //arrayAusgabe(nrArray,placeArray);
                 //Drehung rückgängig machen

               myJ3dFrame.RRotationInterpolator.setMinimumAngle(myJ3dFrame.Rwinkel+0f);
               myJ3dFrame.RRotationInterpolator.setMaximumAngle(myJ3dFrame.Rwinkel+(float)Math.PI/2);
               myJ3dFrame.Ralpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Rwinkel=myJ3dFrame.Rwinkel+((float) Math.PI/2);
                f=finish();
                while(!f){ f=finish();}
               //System.out.println("Right <--");
                
              }
    }
    /**
     * Constructor for objects of class RotRight
     */
    public RotRight(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
    	rotAchseRight=new Button("R"); 
            rotAchseRight.setBounds(xa,ya,b,h);            
            
            rotAchseRight.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          { 
           RightAction();
            }
             }); 
               
            } 
            
       
    }

    
    

