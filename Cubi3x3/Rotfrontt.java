import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
/**
 * Write a description of class RotFront here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */

public class Rotfrontt extends Rot
{ static J3dFrame myJ3dFrame;
  Button rotAchsefront;
  static boolean f; 
  static Set<Integer> setF=new HashSet<Integer>();

    Button getrotAchsefront()
    { return rotAchsefront;
      } 
      
    static public void frontAction()
    {       if(myJ3dFrame.showCubi0) setF.add(0);
            if(myJ3dFrame.showCubi1) setF.add(1);
            if(myJ3dFrame.showCubi2) setF.add(2);
            if(myJ3dFrame.showCubi8) setF.add(8);
            if(myJ3dFrame.showCubi9) setF.add(9);
            if(myJ3dFrame.showCubi10) setF.add(10);
            if(myJ3dFrame.showCubi16) setF.add(16);
            if(myJ3dFrame.showCubi17) setF.add(17);
            if(myJ3dFrame.showCubi18) setF.add(18);
            ActionFrame.textArea.append("f");
           int[] nrArray=new int[26];
           int[] placeArray=new int[26];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {   placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                   //System.out.println("front--->");
                    //zustandsAusgabe(nrArray,placeArray,setF);
                    //myJ3dFrame.showCubisVisible();
                    
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setF.contains(i))
                                      {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setF.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi5BranchGroup);
                                      };break; 
                         case 6: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi6BranchGroup);
                                      };break;
                         case 7: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi7BranchGroup);
                                      };break;
                         case 8: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi8BranchGroup);
                                      };break;
                         case 9: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi9BranchGroup);
                                      };break;
                         case 10: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi10BranchGroup);
                                       };break;
                         case 11: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi11BranchGroup);
                                      };break;                                                    
                         case 12: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi12BranchGroup);
                                      };break;
                         case 13: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi13BranchGroup);
                                      };break;
                         case 14: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi14BranchGroup);
                                      };break;
                         case 15: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi15BranchGroup);
                                      };break;
                         case 16: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi16BranchGroup);
                                      };break;
                         case 17: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi17BranchGroup);
                                      };break;
                         case 18: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi18BranchGroup);
                                      };break;
                         case 19: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi19BranchGroup);
                                      };break;
                         case 20: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi20BranchGroup);
                                      };break;
                         case 21: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi21BranchGroup);
                                      };break;
                         case 22: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi22BranchGroup);
                                      };break;
                         case 23: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi23BranchGroup);
                                      };break;
                        case 24: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24){ myJ3dFrame.plainF.addChild(myJ3dFrame.cubi24BranchGroup);}
                                       };break;
                         case 25: if(setF.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.plainF.addChild(myJ3dFrame.cubi25BranchGroup);
                                      };break;
                        }
                //Vorbereitung -->
                
                 if(finish())
                {
                    
               myJ3dFrame.FRotationInterpolator.setMinimumAngle(myJ3dFrame.Fwinkel+0f);
               myJ3dFrame.FRotationInterpolator.setMaximumAngle(myJ3dFrame.Fwinkel+(float)Math.PI/2);
               myJ3dFrame.Falpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Fwinkel=myJ3dFrame.Fwinkel+((float) Math.PI/2);
               
                               // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();}
                } 
                
                //Nachbereitung
                for (int i=0;i<26;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       { case 0://cubi0
                                 if(setF.contains(i))
                                 {                                                                          
                                        int id=myJ3dFrame.cubi0.getId();
                                        int place =myJ3dFrame.cubi0.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,18,myJ3dFrame.cubi0.colors);
                                            //System.out.println("c0p0i0->c0p2i18"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,34,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i16->c0p2i34"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,2,2,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i32->c0p2i2"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p0i"+id); 
                                            }
                                          ;break;
                                          
                                         case 2:
                                          switch(id)
                                         {
                                                                                   
                                          case 18:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,42,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i18->c0p18i42"); 
                                          break;
                                                                                  
                                          case 34:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,10,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i34->c0p18i10"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,26,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p2i2->c0p18i26");
                                          break;
                                          
                                          default:
                                          	 //System.out.println("default:c0p2i"+id);   
                                            }
                                          ;break;
                                                                                                                           
                                          
                                           case 18:
                                          switch(id)
                                         {
                                         
                                          case 42:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,8,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p18i42->c0p16i8"); 
                                          break;
                                                                                    
                                          case 10:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,24,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i10->c0p16i24"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,40,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i26->c0p16i40"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c0p18i"+id);  
                                            }
                                          ;break;
                                          
                                                                              
                                         case 16:
                                          switch(id)
                                         {
                                          case 8:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,0,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p16i8->c0p0i0"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,16,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i24->c0p0i16"); 
                                          break;
                                                  
                                          case 40:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,32,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i40->c0p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p16i"+id);   
                                            }
                                          ;break;
                                      
                                          }
                                          
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi0BranchGroup);
                                         myJ3dFrame.cubi0BranchGroup=branchGroup;
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                     
                                         if(myJ3dFrame.showCubi0) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi0BranchGroup); 
                                                                                 
                                    };break;
                                      
                         case 1: //cubi1
                         if(setF.contains(i))
                                    { 
                                        int place =myJ3dFrame.cubi1.getPlace();
                                        int id=myJ3dFrame.cubi1.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,10,18,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p1i1->c1p10i18"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,10,10,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p1i35->c1p10i10"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c1p1i"+id);   
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                         {
                                          case 18:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,43,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p10i18->c1p17i43"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,25,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p10i10->c1p17i25"); 
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c1p10i"+id);  
                                            }
                                          ;break;
                                          
                                         case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,8,8,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p17i43->c1p8i8"); 
                                          break;                                                                                   
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,8,16,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p17i25->c1p8i16"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p17i"+id);  
                                            }
                                          ;break;

                                          
                                          case 8:
                                          switch(id)
                                         {
                                          case 8:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,1,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p8i8->c1p1i1"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,35,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p8i16->c1p1i35"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p8i"+id);  
                                            }
                                          ;break;
                                          
                                          }
                                           
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                      
                                       };break;
                            case 2: //cubi2
                                       if(setF.contains(i))
                                      {  
                                        int place =myJ3dFrame.cubi2.getPlace();
                                        int id=myJ3dFrame.cubi2.getId();
                                                                                 
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 0:
                                          switch(id)
                                         {
                                                                                   
                                          case 0:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,18,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p0i0->c2p2i18"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,34,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p0i16->c2p2i34"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,2,2,myJ3dFrame.cubi2.colors);
                                         //System.out.println(">c2p0i32->c2p2i2"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p0i"+id);  
                                            }
                                          ;break;
                                          
                                        case 2:
                                         switch(id)
                                         {
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,42,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i8->c2p18i42"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,10,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p34i16->c2p18i10"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,26,myJ3dFrame.cubi2.colors);
                                         //System.out.println(">c2p2i2->c2p18i26"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c2p2i"+id);   
                                            }
                                          ;break;
                                          
                                          case 18:
                                          switch(id)
                                         {
                                           
                                          case 42:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,8,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i42->c2p16i8"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,24,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i10->c2p16i24"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,40,myJ3dFrame.cubi2.colors);
                                         //System.out.println(">c2p18i26->c2p16i40<"); 
                                          break;                                          
                                          default:
                                          	 //System.out.println("default:c2p18i"+id);   
                                        }
                                          ;break;
                                          
                                          case 16:
                                          switch(id)
                                         { 
                                          case 8:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,0,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i8->c2p0i0"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,16,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i24->c2p0i16"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,32,myJ3dFrame.cubi2.colors);
                                         //System.out.println(">c2p16i40->c2p0i32"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c2p16i"+id);  
                                            }
                                          ;break;
                                       
                                          }
                                           
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi2BranchGroup);
                                         myJ3dFrame.cubi2BranchGroup=branchGroup;
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi2) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                                         
                         case 3://cubi3 
                                 if(setF.contains(i))
                                  { 
                                        int place =myJ3dFrame.cubi3.getPlace();
                                        int id=myJ3dFrame.cubi3.getId();
                                                                              
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,10,18,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i1->c3p10i18"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,10,10,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i35->c3p10i10"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c3p1i"+id);  
                                            }
                                          ;break;
                                          
                                        case 10:
                                          switch(id)
                                         {
                                          case 18:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,43,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p10i4->c3p17i43"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,25,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p10i12->c3p17i25"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c3p10i"+id); 
                                            }
                                          ;break;
                                          
                                        case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,8,8,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i43->c3p8i8"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,8,16,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i25->c3p8i16"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c3p17i"+id);  
                                            }
                                          ;break;

                                         
                                          case 8:
                                          switch(id)
                                         {

                                          case 8:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,1,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p8i8->c3p1i1"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,35,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p8i16->c3p1i35"); 
                                          break;
                                            default:
                                            	System.out.println("default:c3p8i"+id);  
                                            }
                                          ;break;
 
                                          
                                          }
                                           
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4: //cubi4
                                 if(setF.contains(i)) 
                                      {
                                        int place =myJ3dFrame.cubi4.getPlace();
                                        int id=myJ3dFrame.cubi4.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,18,myJ3dFrame.cubi4.colors);
                                            //System.out.println("c4p0i0->c4p2i18"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,34,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i16->c4p2i34"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,2,2,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i32->c4p2i2"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p0i"+id);   
                                            }
                                          ;break;
                                          
                                          case 2:
                                          switch(id)
                                         {
                                          case 18:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,42,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i18->c4p18i42"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,10,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p2i34->c4p18i10"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,26,myJ3dFrame.cubi4.colors); 
                                         //System.out.println("c4p2i2->c4p18i26"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p2i"+id);   
                                            }
                                          ;break;
                                          
                                        case 18:
                                          switch(id)
                                         {
                                         case 42:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,8,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i42->c4p16i8"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,24,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i10->c4p16i24"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,40,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i26->c4p16i40"); 
                                          break;
                                          
                                          
                                            default:
                                            	System.out.println("default:c4p18i"+id);  
                                            }
                                          ;break;
                                          //default:System.out.println("default:c4p"+place+"i"+id);  

                                          case 16:
                                          switch(id)
                                         {
                                          case 8:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,0,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i8->c4p0i0"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,16,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i24->c4p0i16"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,32,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i40->c4p0i32"); 
                                          break;
                                            default:
                                            	System.out.println("default:c4p16i"+id);  
                                            }
                                          ;break;
                              
                                          }
                                           
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi4BranchGroup);
                                         myJ3dFrame.cubi4BranchGroup=branchGroup;
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi4) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                                         
                         case 5: //cubi5
                           if(setF.contains(i)) // 
                                     {
                                      int place =myJ3dFrame.cubi5.getPlace();
                                      int id=myJ3dFrame.cubi5.getId();
                                                                           
                                     BranchGroup branchGroup=null;
                                     
                                      switch(place) 
                                      {
                                         case 1:
                                         switch(id)
                                         {case 1:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,10,18,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p1i1->c5p10i18"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,10,10,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p1i35->c5p10i10"); 
                                          break;                                                                                  
                                           default:
                                           	  //System.out.println("default:c5p1i"+id);   
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                         {
                                          case 18:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,43,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p10i18->c5p17i43"); 
                                          break;                                          
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,25,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p10i10->c5p17i25"); 
                                          break;
                                            default:
                                            	System.out.println("default:c5p10i"+id);  
                                            }
                                          ;break;
                                          
                                         case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,8,8,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p17i43->c5p8i8"); 
                                          break;                                                                                   
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,8,16,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p17i25->c5p8i16"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p17i"+id);   
                                            }
                                          ;break;

                                          case 8:
                                          switch(id)
                                         {
                                          case 8:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,1,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p8i8->c5p1i1"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,35,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p8i16->c5p1i35"); 
                                          break;
                                         
                                          default:
                                          	 //System.out.println("default:c5p8i"+id);   
                                            }
                                          ;break;
                                         
                                      }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi5BranchGroup);
                                         myJ3dFrame.cubi5BranchGroup=branchGroup;
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi5) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                                    if(setF.contains(i))
                                   {
                                        int place =myJ3dFrame.cubi6.getPlace();
                                        int id=myJ3dFrame.cubi6.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,18,myJ3dFrame.cubi6.colors);
                                             //System.out.println("c6p0i0->c6p2i18"); 
                                              break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,34,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i16->c6p2i34"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,2,2,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i32->c6p2i2"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p0i"+id);   
                                            }
                                          ;break;
                                          
                                         case 2:
                                          switch(id)
                                          {
                                                                                  
                                          case 18:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,42,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i18->c6p18i42");
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,10,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i34->c6p18i10"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,26,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p2i2->c6p18i26");
                                          break;
                                            default:
                                            	System.out.println("default:c6p26i"+id);  
                                            }
                                          ;break; 
                                          
                                        case 18:
                                          switch(id)
                                          {
                                          case 42:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,8,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i42->c6p16i8"); 
                                          break;	  
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,24,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i10->c6p16i24"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,40,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i26->c6p16i40"); 
                                          break;
                                                                                  
                                          default:
                                          	 //System.out.println("default:c6p18i"+id);
                                            }
                                          ;break;
                                          
                                          case 16:
                                          switch(id)
                                          {
                                          case 8:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,0,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p16i8->c6p0i0"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,16,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p16i24->c6p0i16");
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,32,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p16i40->c6p0i32");
                                          break;
                                            default:
                                            	System.out.println("default:c6p16i"+id);  
                                            }
                                          ;break;
                                                                                
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi6BranchGroup);
                                         myJ3dFrame.cubi6BranchGroup=branchGroup;
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi6) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi7.getPlace();
                                        int id=myJ3dFrame.cubi7.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 1:
                                         switch(id)
                                          {case 1:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,10,18,myJ3dFrame.cubi7.colors); 
                                             //System.out.println("c7p1i1->c7p10i18"); 
                                              break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,10,10,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p1i35->c7p10i10"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c7p1i"+id);  
                                            }
                                          ;break;
                                          
                                        case 10:
                                          switch(id)
                                          {
                                          case 18:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,43,myJ3dFrame.cubi7.colors);
                                         //System.out.println(">c7p10i18->c7p17i43");
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,25,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p10i10->c7p17i25"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c7p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 17:
                                         switch(id)
                                          {case 43:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,8,8,myJ3dFrame.cubi7.colors); 
                                         //System.out.println(">c7p17i43->c7p8i8"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,8,16,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p17i25->c7p8i16"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c7p17i"+id);  
                                            }
                                          ;break;

                                         
                                          case 8:
                                          switch(id)
                                          {
                                          case 8:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,1,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p8i8->c7p1i1"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,35,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p8i16->c7p1i35"); 
                                          break;
                                                                                    
                                          default:
                                          	 //System.out.println("default:c7p8i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                         case 8: //cubi8
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi8.getPlace();
                                        int id=myJ3dFrame.cubi8.getId();
                                         
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 1:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,10,42,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p1i19->c8p10i42<"); 
                                          break;// 
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,10,2,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p1i33->c8p10i2"); 
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c8p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                          {
                                          case 42:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,9,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p10i42->c8p17i9"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,27,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p10i3->c8p17i27"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c8p10i"+id);  
                                            }
                                          ;break;
                                          
                                        case 17:
                                          switch(id)
                                          {
                                          case 9:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,8,0,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i9->c8p8i0"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,8,40,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i27->c8p8i40"); 
                                          break;
                                                                                  
                                           default:
                                           	  //System.out.println("default:c7p17i"+id);   
                                            }
                                          ;break;
                                          
                                         case 8:
                                         switch(id)
                                          {case 0:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,19,myJ3dFrame.cubi8.colors); 
                                             //System.out.println(">c8p8i0->c8p1i19"); 
                                              break;
                                         
                                          case 40:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,33,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p8i40->c8p1i33"); 
                                          break;
                                            default:
                                            	System.out.println("default:c8p8i"+id);  
                                            }
                                          ;break;
                                          
                                         
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                  
                                 
                           case 10: //cubi10
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi10.getPlace();
                                        int id=myJ3dFrame.cubi10.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                      
                                      switch(place) 
                                      {
                                        case 1:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,10,42,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i32->c10p10i42"); 
                                          break;
                                                                                     	  
                                          case 33:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,10,2,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i33->c10p10i2"); 
                                          break;
                                          
                                          default:
                                          	 //System.out.println("default:c10p1i"+id);
                                            
                                            }
                                          ;break;
                                          
                                         case 10:
                                         switch(id)
                                          {
                                          case 42:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,9,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p10i42->c10p17i9"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,27,myJ3dFrame.cubi10.colors); 
                                         //System.out.println("c10p10i2->c10p17i27"); 
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c10p10i"+id);  
                                            }
                                          ;break;
                                          
                                         case 17:
                                          switch(id)
                                          {
                                          case 9:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,8,0,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p17i9->c10p8i0"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,8,40,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p17i27->c10p8i40"); 
                                          break;// 
                                                                                  
                                            default:
                                            	System.out.println("default:c10p17i"+id);  
                                            }
                                          ;break;

                                        case 8:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,19,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p8i12->c10p1i19"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,33,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p8i40->c10p1i33"); 
                                          break;
                                                                              
                                            default:
                                            	System.out.println("default:c10p8i"+id);  
                                            }
                                          ;break;                                         
                                         
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi10BranchGroup);
                                         myJ3dFrame.cubi10BranchGroup=branchGroup;
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi10) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi10BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                         
                                      
                       case 12: //cubi12
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi12.getPlace();
                                        int id=myJ3dFrame.cubi12.getId();
                                      
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                        
                                        case 1:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,10,42,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i19->c12p10i42"); 
                                          break;  
                                          case 33:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,10,2,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i33->c12p10i2"); 
                                          break;
                                        
                                           default:
                                           	  //System.out.println("default:c12p1i"+id);   
                                            }
                                          ;break;
                                   
                                          
                                        case 10:
                                         switch(id)
                                          {
                                           case 42:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,9,myJ3dFrame.cubi12.colors);
                                          //System.out.println("c12p10i42->c12p17i9"); 
                                           break;	  
                                          
                                           case 2:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,27,myJ3dFrame.cubi12.colors); 
                                          //System.out.println(">c12p10i2->c10p17i27"); 
                                           break;
                                          
                                            default:
                                            	System.out.println("default:c10p10i"+id);  
                                            }
                                          ;break;
                                       
                                         case 17:
                                          switch(id)
                                          {
                                          case 9:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,8,0,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p17i9->c12p8i0"); 
                                          break;
                                          	  
                                          case 27:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,8,40,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p17i27->c12p8i40"); 
                                          break;// 
                                         
                                                                                  
                                            default:
                                            	System.out.println("default:c12p17i"+id);  
                                            }
                                          ;break;
                                          
                                         case 8:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,19,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p8i0->c12p1i19"); 
                                          break;
                                          	  
                                          case 40:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,33,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p8i40->c12p1i33"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c12p8i"+id);  
                                            }
                                          ;break;
                                                                                                                              
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                        
                         
                        case 14: //cubi14
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi14.getPlace();
                                        int id=myJ3dFrame.cubi14.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                        
                                        case 1:
                                          switch(id)
                                          {
                                          case 19:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,10,42,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p1i19->c14p10i42"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,10,2,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p1i33->c14p10i2"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c14p1i"+id);   
                                            }
                                          ;break;                                          
                                          
                                         case 10:
                                         switch(id)
                                          {case 42:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,9,myJ3dFrame.cubi14.colors); 
                                         //System.out.println(">c14p10i42->c14p17i9"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,27,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p0i8->c14p17i27"); 
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c14p10i"+id);  
                                            }
                                          ;break;

                                          
                                         case 17:
                                          switch(id)
                                          {
                                          case 9:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,8,0,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p17i9->c14p8i0"); 
                                          break;// 
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,8,40,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p17i27->c14p8i40"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c14p17i"+id);  
                                            }
                                          ;break;

                                        case 8:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,19,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p8i0->c14p1i19"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,33,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p8i40->c14p1i33"); 
                                          break;
                                          
                                          default:
                                          	 //System.out.println("default:c14p8i"+id);  
                                            }
                                          ;break;
                                       
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                       ;break;
                       
               
                        case 16: //cubi16
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi16.getPlace();
                                        int id=myJ3dFrame.cubi16.getId();                                      
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,18,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i0->c16p2i18"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,34,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p0i16->c16p2i34>"); 
                                          break;//                                      
                                      
                                          case 32:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,2,2,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i32->c16p2i2"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p0i"+id);  
                                            }
                                          ;break;
                                          
                                        case 2:
                                          switch(id)
                                          {
                                                                                   
                                          case 18:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,42,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i18->c16p18i42"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,10,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p2i34->c16p18i10"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,26,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p2i2->c16p18i26"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c16p2i"+id);  
                                            }
                                          ;break;
                                          
                                          case 18:
                                          switch(id)
                                          {
                                          	  
                                          case 42:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,8,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i42->c16p16i8"); 
                                          break;	
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,24,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p18i10->c16p16i24"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,40,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i26->c16p16i40"); 
                                          break;
                                          
                                         
                                           default:
                                           	  //System.out.println("default:c16p18i"+id);   
                                            }
                                          ;break;
                                        
                                        case 16:
                                         switch(id)
                                          {
                                           case 8:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,0,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i8->c16p0i0"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,16,myJ3dFrame.cubi16.colors); 
                                         //System.out.println(">c16p16i24->c16p0i16"); 
                                          break;
                                       
                                          case 40:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,32,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i40->c16p0i32"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p16i"+id);  
                                            }
                                          ;break;
                                        
                                         
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi16BranchGroup);
                                         myJ3dFrame.cubi16BranchGroup=branchGroup;
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi16) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi16BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                             case 17: //cubi17
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi17.getPlace();
                                        int id=myJ3dFrame.cubi17.getId();
                                                                             
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          case 1:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,10,18,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p1i1->c17p10i18"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,10,10,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">17p1i35->c17p10i10"); 
                                          break;
                
                                            default:
                                            	System.out.println("default:c17p1i"+id);  
                                            }
                                          ;break;
                                          
                                        case 10:
                                          switch(id)
                                          {
                                          case 18:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,43,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p10i18->c17p17i43"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,25,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p10i10->c17p17i25"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c17p10i"+id);   
                                            }
                                          ;break;
                                          
                                         case 17:
                                         switch(id)
                                          {case 43:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,8,8,myJ3dFrame.cubi17.colors); 
                                         //System.out.println(">c17p17i43->c17p8i8"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,8,16,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p17i25->c17p8i16"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c17p17i"+id);  
                                            }
                                          ;break;
                                          
                                          
                                         case 8:
                                          switch(id)
                                          {
                                          case 8:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,1,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p8i8->c17p1i1<"); 
                                          break;// 
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,35,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p8i16->c17p1i35"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c17p8i"+id);  
                                            }
                                          ;break;
                                     
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 18: //cubi18
                                   if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi18.getPlace();
                                        int id=myJ3dFrame.cubi18.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {                                          
                                         case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,18,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i0->c18p2i18"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,34,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i16->c18p2i34"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,2,2,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p0i32->c18p2i2"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c18p0i"+id);  
                                            }
                                          ;break;
                                          
                                          case 2:
                                          switch(id)
                                          {                                          	  
                                       
                                          case 18:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,42,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i18->c18p18i42"); 
                                          break;
                                          
                                           case 34:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,10,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p2i34->c18p18i10"); 
                                          break;
                                          
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,26,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p2i2->c18p18i26"); 
                                          break;                                         
                                         
                                           default:
                                           	  //System.out.println("default:c18p2i"+id);   
                                            }
                                          ;break;
                                          
                                         case 18:
                                         switch(id)
                                          {
                                                                                     
                                          case 42:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,8,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i42->c18p16i8"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,24,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i10->c18p16i24"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,40,myJ3dFrame.cubi18.colors); 
                                         //System.out.println(">c18p18i26->c18p16i40"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c18p18i"+id);  
                                            }
                                          ;break;
                                          
                                          case 16:
                                          switch(id)
                                          {
                                          case 8:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,0,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i8->c18p0i0"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,16,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i24->c18p0i16"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,32,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p16i40->c18p0i32<"); 
                                          break;// 
                                                                                    
                                            default:
                                            	System.out.println("default:c18p16i"+id);  
                                            }
                                          ;break;                                       
                                                                         
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi18BranchGroup);
                                         myJ3dFrame.cubi18BranchGroup=branchGroup;
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi18) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi18BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                       
                           case 19: //cubi19
                                   if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi19.getPlace();
                                        int id=myJ3dFrame.cubi19.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {                                          
                                        case 1:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,10,18,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p1i1->c19p10i18"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,10,10,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p1i35->c19p10i10"); 
                                          break;
                                                                      
                                          default:
                                          	 //System.out.println("default:c19p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                          {
                                          case 18:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,43,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p10i18->c19p17i43"); 
                                          break; 
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,25,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p10i10->c19p17i25");
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c19p10i"+id);  
                                            }
                                          ;break;
                                          
                                         case 17:
                                         switch(id)
                                          {case 43:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,8,8,myJ3dFrame.cubi19.colors); 
                                         //System.out.println(">c19p17i43->c19p8i8"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,8,16,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p17i25->c19p8i16"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c19p17i"+id);  
                                            }
                                          ;break;
                                          
                                        case 8:
                                          switch(id)
                                          {
                                          case 8:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,1,myJ3dFrame.cubi19.colors);
                                         //System.out.println(">c19p8i8->c19p1i1"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,35,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p8i16->c19p1i35"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c19p8i"+id);   
                                            }
                                          ;break;
                                 
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                           case 20: //cubi20
                                   if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi20.getPlace();
                                        int id=myJ3dFrame.cubi20.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 0:
                                          switch(id)
                                          {
                                          case 0:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,18,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i0->c20p2i18"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,34,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i16->c20p2i34"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,2,2,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p0i32->c20p2i2"); 
                                          break;                                          
                                          
                                           default:
                                           	  //System.out.println("default:c20p0i"+id);  
                                            }
                                          ;break;
                                          
                                        case 2:
                                          switch(id)
                                          {
                                          
                                          case 18:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,42,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i18->c20p18i42"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,10,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p2i34->c20p18i10"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,26,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p2i2->c20p18i26"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c20p2i"+id);   
                                            }
                                          ;break;
                                          
                                        case 18:
                                          switch(id)
                                          {
                                          	  
                                          case 42:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,8,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i42->c20p16i8"); 
                                          break;	
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,24,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i10->c20p16i24"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,40,myJ3dFrame.cubi20.colors); 
                                         //System.out.println("c20p18i26->c20p16i40"); 
                                          break;                                         
                                            default:System.out.println("default:c20p18i"+id);  
                                            }
                                            
                                          ;break;
                                          
                                           case 16:
                                          switch(id)
                                          {
                                          	  
                                          case 8:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,0,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i8->c20p0i0"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,16,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i24->c20p0i16"); 
                                          break;
                                                                                       
                                          case 40:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,32,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i40->c20p0i32"); 
                                          break;// 
                                           default:
                                           	  //System.out.println("default:c20p16i"+id);
                                          
                                            }
                                          ;break;
                                 
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi20BranchGroup);
                                         myJ3dFrame.cubi20BranchGroup=branchGroup;
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi20) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi20BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                       
                        case 21: //cubi21
                                   if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi21.getPlace();
                                        int id=myJ3dFrame.cubi21.getId();
                                                                                 
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 1:
                                         switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,10,18,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p1i1->c21p10i18"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,10,10,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p1i35->c21p10i10"); 
                                          break;
                                            default:
                                            	System.out.println("default:c21p1i"+id);  
                                            }
                                          ;break;
                                          
                                        case 10:
                                          switch(id)
                                          {
                                          case 18:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,43,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p10i18->c21p17i43"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,25,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p10i10->c21p17i25"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c21p10i"+id);  
                                            }
                                          ;break;
                                          
                                         case 17:
                                          switch(id)
                                          {
                                          case 43:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,8,8,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p17i43->c21p8i8<");
                                          break;// 
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,8,16,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p17i25->c21p8i16"); 
                                          break;                                          
                                          
                                            default:
                                            	System.out.println("default:c21p17i"+id);  
                                            }
                                          ;break;

                                        case 8:
                                          switch(id)
                                          {
                                          case 8:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,1,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p8i8->c21p1i"); 
                                          break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,35,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p8i16->c21p1i35"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c21p8i"+id);   
                                            }
                                          ;break;
                                                                             
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                          case 22: //cubi22
                                   if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi22.getPlace();
                                        int id=myJ3dFrame.cubi22.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 0:
                                         switch(id) //Reihenfolge anders???
                                          {
                                           case 0:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,18,myJ3dFrame.cubi22.colors);
                                          //System.out.println("c22p0i0->c22p2i18"); 
                                           break;
                                           
                                           case 16:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,34,myJ3dFrame.cubi22.colors); 
                                          //System.out.println(">c22p0i16->c22p2i34"); 
                                           break;
                                          
                                           case 32:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,2,2,myJ3dFrame.cubi22.colors);
                                          //System.out.println("c22p0i32->c22p2i2"); 
                                           break;
                                                                                   
                                            default:
                                            	System.out.println("default:c22p0i"+id);  
                                            }
                                          ;break;
                                          
                                          case 2:
                                          switch(id)
                                          {
                                         
                                          case 18:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,26,myJ3dFrame.cubi22.colors);//42
                                         //System.out.println("c22p2i18->c22p18i42"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,10,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p2i34->c22p18i10"); 
                                          break;
                                          
                                          case 2:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,42,myJ3dFrame.cubi22.colors);//26
                                         //System.out.println(">c22p2i2->c22p18i26");
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c22p2i"+id);   
                                            }
                                          ;break;
                                          
                                        case 18:
                                          switch(id)
                                          {
                                                                                   
                                          case 42:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,24,myJ3dFrame.cubi22.colors);//8
                                         //System.out.println("c22p18i42->c22p16i8"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,40,myJ3dFrame.cubi22.colors);//24
                                         //System.out.println(">c22p18i10->c22p16i24<"); 
                                          break;//
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,8,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i26->c22p16i40"); 
                                          break;
                                                                                                                                                                     
                                          default:
                                          	 //System.out.println("default:c22p18i"+id);  
                                            }
                                          ;break;
                                                                                   
                                        case 16:
                                          switch(id)
                                          {
                                          case 8:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,0,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p16i8->c22p0i0"); 
                                          break;
                                          
                                           case 40:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,16,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i40->c22p0i16"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,32,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i24->c22p0i32"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c22p16i"+id);  
                                            }
                                          ;break;
                                                                                 
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi22BranchGroup);
                                         myJ3dFrame.cubi22BranchGroup=branchGroup;
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi22) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi22BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                       
                         case 23: //cubi23
                                   if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi23.getPlace();
                                        int id=myJ3dFrame.cubi23.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 1:
                                         switch(id)
                                          {case 3:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,10,42,myJ3dFrame.cubi23.colors); 
                                         //System.out.println(">c23p1i3->c23p10i42"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,10,34,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p1i17->c23p10i34"); 
                                          break;
                                                                                    
                                            default:
                                            	System.out.println("default:c23p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 10:
                                          switch(id)
                                          {
                                          case 42:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,25,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p10i42->c23p17i25"); 
                                          break;
                                          
                                          case 34:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,11,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p10i34->c23p17i11"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c23p10i"+id);  
                                            }
                                          ;break;
                                          
                                          case 17:
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,8,32,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i25->c23p8i32"); 
                                          break; 
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,8,40,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i11->c23p8i40"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c23p17i"+id);  
                                            }
                                          ;break;

                                        case 8:
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,3,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p8i32->c23p1i3"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,17,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p8i40->c23p1i17"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c23p8i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 9: //cubi9 
                                      if(setF.contains(i))
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
                                          //System.out.println("c9p24i32->c9p11i32"+id);
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p25i25->c9p25i7");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p25"+id);  
                                            }
                                         break;
                                        }
                                        
                                     
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.cubi9BranchGroup=branchGroup;
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup);
                                        } 
                                       
                                     break;
                                     
                                    case 11: //cubi11
                                    if(setF.contains(i))
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
                                                                               
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi11BranchGroup);
                                         myJ3dFrame.cubi11BranchGroup=branchGroup;
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi11) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi11BranchGroup); 
                                          
                                      }
                                    break;
                                    
                                   case 13: //cubi13
                                 if(setF.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi13.getPlace();
                                        int id=myJ3dFrame.cubi13.getId();
                                         
                                         BranchGroup branchGroup=null;
                                         
                                       switch(place)
                                       { 
                                         case 9://Drehachse
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
                                          //System.out.println("c13p25i25->c13p25i25"+id);
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p25"+id);  
                                            }
                                         break;
                                        }
                                                                                                                         
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi13BranchGroup);
                                         myJ3dFrame.cubi13BranchGroup=branchGroup;
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi13) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi13BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                    case 15: //cubi15
                                 if(setF.contains(i))
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
                                          //System.out.println("c15p24i32->c15p24i33");
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
                                                                                                                                                              
                                         myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi15BranchGroup);
                                         myJ3dFrame.cubi15BranchGroup=branchGroup;
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi15) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi15BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                    case 24: //   cubi24                                   	  
                                      if(setF.contains(i))
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
                                                                                                                       
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);}
                                     ;break;
                                     
                                    case 25: //  cubi25                                 	  
                                      if(setF.contains(i))
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
                                                                                                                       
                                       myJ3dFrame.plainF.removeChild(myJ3dFrame.cubi25BranchGroup);
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
               myJ3dFrame.FRotationInterpolator.setMinimumAngle(myJ3dFrame.Fwinkel+0f);
               myJ3dFrame.FRotationInterpolator.setMaximumAngle(myJ3dFrame.Fwinkel-(float)Math.PI/2);
               myJ3dFrame.Falpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Fwinkel=myJ3dFrame.Fwinkel-((float) Math.PI/2);
               
                f=finish();
                while(!f){ f=finish();}
               //System.out.println("front<--");
              }
    }
    /**
     * Constructor for objects of class RotFront
     */
    public Rotfrontt(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
    	rotAchsefront=new Button("f"); 
            rotAchsefront.setBounds(xa,ya,b,h);            
            
        rotAchsefront.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          {
           frontAction();
            }
             }); 
               
            } // rotAchsefront <-- 
           

    
    
}
