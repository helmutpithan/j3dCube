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

public class Rotlefft extends Rot
{ static J3dFrame myJ3dFrame;
  Button rotAchseleft;
  static boolean f; 
  static Set<Integer> setL=new HashSet<Integer>();

    Button getrotAchseleft()
    { return rotAchseleft;
      } 
      
    static public void leftAction()
    {       if(myJ3dFrame.showCubi0) setL.add(0);
            if(myJ3dFrame.showCubi6) setL.add(6);
            if(myJ3dFrame.showCubi7) setL.add(7);
            if(myJ3dFrame.showCubi8) setL.add(8);
            if(myJ3dFrame.showCubi14) setL.add(14);
            if(myJ3dFrame.showCubi15) setL.add(15);
            if(myJ3dFrame.showCubi16) setL.add(16);
            if(myJ3dFrame.showCubi22) setL.add(22);
            if(myJ3dFrame.showCubi23) setL.add(23);
            ActionFrame.textArea.append("l");
           int[] nrArray=new int[26];
           int[] placeArray=new int[26];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {   placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                   
                   //System.out.println("left--->");
                     //zustandsAusgabe(nrArray,placeArray,setL);
                    //myJ3dFrame.showCubisVisible();
                    
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { 
                          case 0:
                                 if(setL.contains(i))
                                      {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setL.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi5BranchGroup);
                                      };break; 
                         case 6: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi6BranchGroup);
                                      };break;
                         case 7: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi7BranchGroup);
                                      };break;
                         case 8: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi8BranchGroup);
                                      };break;
                         case 9: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi9BranchGroup);
                                      };break;
                         case 10: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi10BranchGroup);
                                       };break;
                         case 11: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi11BranchGroup);
                                      };break;                                                    
                         case 12: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi12BranchGroup);
                                      };break;
                         case 13: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi13BranchGroup);
                                      };break;
                         case 14: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi14BranchGroup);
                                      };break;
                         case 15: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi15BranchGroup);
                                      };break;
                         case 16: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi16BranchGroup);
                                      };break;
                         case 17: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi17BranchGroup);
                                      };break;
                         case 18: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi18BranchGroup);
                                      };break;
                         case 19: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi19BranchGroup);
                                      };break;
                         case 20: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi20BranchGroup);
                                      };break;
                         case 21: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi21BranchGroup);
                                      };break;
                         case 22: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi22BranchGroup);
                                      };break;
                         case 23: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi23BranchGroup);
                                      };break;
                         case 24: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi24BranchGroup);
                                      };break; 
                         case 25: if(setL.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.plainL.addChild(myJ3dFrame.cubi25BranchGroup);
                                      };break;             
                        }
                //Vorbereitung -->
                f=finish();
                while(!f){ f=finish();}
                 if(finish())
                {
                    
               myJ3dFrame.LRotationInterpolator.setMinimumAngle(myJ3dFrame.Lwinkel+0f);
               myJ3dFrame.LRotationInterpolator.setMaximumAngle(myJ3dFrame.Lwinkel+(float)Math.PI/2);
               myJ3dFrame.Lalpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Lwinkel=myJ3dFrame.Lwinkel+((float) Math.PI/2);
               
                               // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();}
                } 
                
                //Nachbereitung
                
                for (int i=0;i<26;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       { 
                       	   case 0://cubi0
                                 if(setL.contains(i))
                                 { 
                                   
                                        
                                        int id=myJ3dFrame.cubi0.getId();
                                        int place =myJ3dFrame.cubi0.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,24,myJ3dFrame.cubi0.colors);
                                            //System.out.println(">c0p0i0->c0p16i24"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,40,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i16->c0p16i40"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,8,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p0i32->c0p16i8"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c0p0i"+id); 
                                            }
                                          ;break;
                                          
                                         case 16:
                                          switch(id)
                                         {
                                          case 24:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,46,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p16i24->c0p22i46<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,14,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i40->c0p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,30,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i8->c0p22i30"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c0p16i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,38,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p22i46->c0p6i38<"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,6,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i14->c0p6i6"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,22,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i30->c0p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p22i"+id);   
                                            }
                                          ;break;

                                         case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,0,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p6i38->c0p0i0"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,16,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i6->c0p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,0,32,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i22->c0p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p6i"+id);   
                                            }
                                          ;break;
                                     
                                          }
                                          
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi0BranchGroup);
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
                         if(setL.contains(i))
                                 {     
                                        int id=myJ3dFrame.cubi1.getId();
                                        int place =myJ3dFrame.cubi1.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                     switch(place) 
                                     {
                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,8,16,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p7i7->c1p8i16"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,8,8,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p7i33->c1p8i8"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c1p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,41,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p8i16->c1p23i41<"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,31,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p8i8->c1p23i31"); 
                                          break;
                                                                                  
                                           default:
                                           	  //System.out.println("default:c1p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,14,14,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i41->c1p14i14"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,14,22,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i31->c1p14i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c1p23i"+id);   
                                            }
                                          ;break;
                                          
                                          case 14:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,7,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p14i14->c1p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,33,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p14i22->c1p7i33"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c1p14i"+id);   
                                            }
                                          ;break;
                                                                              
                                          }
                                           
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //myJ3dFrame.plainD.addChild(myJ3dFrame.cubi1BranchGroup);
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                      
                                       };break;
                            case 2://cubi2 
                                       if(setL.contains(i))
                                 {     
                                        int id=myJ3dFrame.cubi2.getId();
                                        int place =myJ3dFrame.cubi2.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,24,myJ3dFrame.cubi2.colors);
                                            //System.out.println("c2p0i0->c2p16i24"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,40,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p0i16->c2p16i40"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,8,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p0i32->c2p16i8"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p0i"+id); 
                                            }
                                          ;break;
                                          
                                         case 16:
                                          switch(id)
                                         {
                                          case 24:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,46,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i18->c2p22i46"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,14,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i13->c2p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,30,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i21->c2p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p16i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,38,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i46->c2p6i38"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,6,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i14->c2p6i6"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,22,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i30->c2p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p22i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,0,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i38->c2p0i0"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,16,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i6->c2p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,0,32,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i22->c2p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p6i"+id);   
                                            }
                                          ;break;
                                          
                                     
                                          }
                                           
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi2BranchGroup);
                                         myJ3dFrame.cubi2BranchGroup=branchGroup;
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //myJ3dFrame.plainD.addChild(myJ3dFrame.cubi2BranchGroup);
                                         if(myJ3dFrame.showCubi2) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3://cubi3 
                                 if(setL.contains(i))
                                 {     
                                        int id=myJ3dFrame.cubi3.getId();
                                        int place =myJ3dFrame.cubi3.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {                                         
                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,8,16,myJ3dFrame.cubi3.colors);
                                         //System.out.println(">c3p7i7->c3p8i16"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,8,8,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p7i33->c3p8i8"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c3p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,41,myJ3dFrame.cubi3.colors);
                                         //System.out.println(">c3p8i16->c3p23i41<"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,31,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p8i8->c3p23i31"); 
                                          break;

                                          default:
                                          	 //System.out.println("default:c3p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,14,14,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i41->c3p14i14"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,14,22,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i31->c3p14i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c3p23i"+id);   
                                            }
                                          ;break;
                                         
                                          case 14:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,7,myJ3dFrame.cubi3.colors);
                                         //System.out.println(">c3p14i14->c3p7i7<"); 
                                          break;
                                                                                   
                                          case 22:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,33,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p14i22->c3p7i23"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c3p14i"+id);   
                                            }
                                          ;break;
                                                                                
                                        }                                        
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4: //cubi4
                                 if(setL.contains(i))
                                 { 
                                        int id=myJ3dFrame.cubi4.getId();
                                        int place =myJ3dFrame.cubi4.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,24,myJ3dFrame.cubi4.colors);
                                            //System.out.println(">c4p0i0->c4p16i24"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,40,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p0i16->c4p16i40"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,8,myJ3dFrame.cubi4.colors);//22
                                         //System.out.println("c4p0i32->c0p16i8"); 
                                          break;
                                            default:
                                            	System.out.println("default:c4p0i"+id); 
                                            }
                                          ;break;
                                          
                                         case 16:
                                          switch(id)
                                         {
                                          case 24:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,46,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i24->c4p22i46"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,14,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p40i40->c4p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,30,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p8i8->c4p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p16i"+id);   
                                            }
                                          ;break;
                                          
                                        case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,38,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i48->c4p6i38"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,6,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i14->c4p6i6"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,22,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i30->c4p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p22i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,0,myJ3dFrame.cubi4.colors);
                                         //System.out.println(">c4p6i38->c4p0i0"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,16,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p6i6->c4p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,0,32,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p6i22->c4p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p6i"+id);   
                                            }
                                          ;break;                                         
                                    
                                          }
                                           
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi4BranchGroup);
                                         myJ3dFrame.cubi4BranchGroup=branchGroup;
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //myJ3dFrame.plainD.addChild(myJ3dFrame.cubi4BranchGroup);
                                         if(myJ3dFrame.showCubi4) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                         case 5: 
                           if(setL.contains(i))
                                 {     
                                        int id=myJ3dFrame.cubi5.getId();
                                        int place =myJ3dFrame.cubi5.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                         

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,8,16,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p7i7->c5p8i16"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,8,8,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p7i33->c5p8i8"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c5p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,41,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p8i16->c5p23i41<"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,31,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p8i8->c5p23i31"); 
                                          break;                                          
                                           default:
                                           	  //System.out.println("default:c5p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,14,14,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i13->c5p14i14"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,14,22,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i21->c5p14i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p23i"+id);   
                                            }
                                          ;break;
                                          
                                          case 14:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,7,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p14i14->c5p7i7<"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,33,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p14i22->c5p7i33"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c5p14i"+id);   
                                            }
                                          ;break;
     
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi5BranchGroup);
                                         myJ3dFrame.cubi5BranchGroup=branchGroup;
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi5) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                                    if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi6.getId();
                                        int place =myJ3dFrame.cubi6.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,24,myJ3dFrame.cubi6.colors);
                                            //System.out.println(">c6p0i0->c6p16i24"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,40,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i16->c6p16i40"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,8,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p0i32->c6p16i8"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p0i"+id); 
                                            }
                                          ;break;
                                          
                                        case 16:
                                          switch(id)
                                         {
                                          case 24:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,46,myJ3dFrame.cubi6.colors);
                                         //System.out.println(">c6p16i24->c6p22i46<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,14,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p16i40->c6p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,30,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p16i8->c6p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p16i"+id);   
                                            }
                                          ;break;
                                          
                                        case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,38,myJ3dFrame.cubi6.colors);
                                         //System.out.println(">c6p22i46->c6p6i38<"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,6,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i14->c6p6i6"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,22,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i21->c6p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p22i"+id);   
                                            }
                                          ;break;

                                        case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,0,myJ3dFrame.cubi6.colors);
                                         //System.out.println(">c6p6i38->c6p0i0"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,16,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i6->c6p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,0,32,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i22->c6p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p6i"+id);   
                                            }
                                          ;break;
                                   
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi6BranchGroup);
                                         myJ3dFrame.cubi6BranchGroup=branchGroup;
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi6) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                                 if(setL.contains(i))
                                 {     
                                        int id=myJ3dFrame.cubi7.getId();
                                        int place =myJ3dFrame.cubi7.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          
                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,8,16,myJ3dFrame.cubi7.colors);
                                         //System.out.println(">c7p7i7->c7p8i16"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,8,8,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p7i33->c7p8i8"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c7p7i"+id);  
                                            }
                                          ;break;
                                          
                                          case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,41,myJ3dFrame.cubi7.colors);
                                         //System.out.println(">c7p8i16->c7p23i41<"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,31,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p8i8->c7p23i31"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c7p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,14,14,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i41->c7p14i14"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,14,22,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i31->c7p14i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c7p23i"+id);   
                                            }
                                          ;break;
                                                                              
                                          
                                           case 14:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,7,myJ3dFrame.cubi7.colors);
                                         //System.out.println(">c7p14i14->c7p7i7<"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,33,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p14i22->c7p7i23"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c7p14i"+id);   
                                            }
                                          ;break;
                                   
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                         case 8: //cubi8
                                 if(setL.contains(i))
                                 { 
                                        
                                        int id=myJ3dFrame.cubi8.getId();
                                        int place =myJ3dFrame.cubi8.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          
                                        
                                          case 8:
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,25,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p8i0->c8p23i25<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,15,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p8i40->c8p23i15"); 
                                          break;
                                          default:
                                          	 //System.out.println("default:c8p8i"+id);
                                         
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,14,46,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p23i25->c8p14i46"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,14,6,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p23i15->c8p14i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c8p23i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,39,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p14i46->c8p7i39<"); 
                                          break;
                                                                                   
                                          case 6:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,17,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p14i6->c8p7i17"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c8p14i"+id);   
                                            }
                                          ;break;
                                          
                                          
                                          case 7:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,8,0,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p7i38->c8p8i0<"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,8,40,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p7i12->c8p8i40");
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c8p7i"+id);  
                                            }
                                          ;break;
                                 
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                       ;break;
                             
                               
                           case 10: //cubi10
                                 if(setL.contains(i))
                                 {                                        
                                        int id=myJ3dFrame.cubi10.getId();
                                        int place =myJ3dFrame.cubi10.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                      	  
                                      	 case 8:
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,25,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p8i0->c10p23i25<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,15,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p8i40->c10p23i15"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c10p8i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,14,46,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i13->c10p14i46"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,14,6,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i21->c10p14i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c10p23i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,39,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p14i46->c10p7i39"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,17,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p14i6->c10p7i17"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c10p14i"+id);   
                                            }
                                          ;break;
                                          

                                          case 7:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,8,0,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p7i38->c10p8i0"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,8,40,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p7i16->c10p8i40"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c10p7i"+id);  
                                            }
                                          ;break;
                                     
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi10BranchGroup);
                                         myJ3dFrame.cubi10BranchGroup=branchGroup;
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi10) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi10BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                        
                                    
                       case 12: //cubi12
                                 if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi12.getId();
                                        int place =myJ3dFrame.cubi12.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                       	  
                                      	  case 8:
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,25,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p8i0->c12p23i25<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,15,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p8i40->c12p23i15"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c12p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,14,46,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p23i25->c12p14i46"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,14,6,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p23i21->c12p14i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c12p23i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,39,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p14i18->c12p7i39<"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,17,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p14i13->c12p7i17"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c12p14i"+id);   
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,8,0,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p7i39->c12p8i0"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,8,40,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p7i17->c12p8i40"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c12p7i"+id);  
                                            }
                                          ;break;

                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                          
                                       
                        case 14: //cubi14
                                 if(setL.contains(i))
                                 {   
                                        int id=myJ3dFrame.cubi14.getId();
                                        int place =myJ3dFrame.cubi14.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                      	  case 8:
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,25,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p8i0->c14p23i25<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,15,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c0p14i40->c14p23i15"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c14p8i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,14,46,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p23i25->c14p14i46<"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,14,6,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p5i15->c14p14i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c14p23i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,39,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p14i46->c14p7i39<"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,17,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p14i6->c14p7i17"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c14p14i"+id);   
                                            }
                                          ;break;
                                                                                   

                                          case 7:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,8,0,myJ3dFrame.cubi14.colors);
                                         //System.out.println(">c14p7i39->c14p8i0"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,8,40,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p7i17->c14p8i40"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c14p7i"+id);  
                                            }
                                          ;break;
                                        
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                       ;break;
                        
               
                          
               
                        case 16: //cubi16
                                 if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi16.getId();
                                        int place =myJ3dFrame.cubi16.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,24,myJ3dFrame.cubi16.colors);
                                            //System.out.println(">c16p0i0->c16p16i24"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,40,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i16->c16p16i40"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,8,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p0i16->c16p16i8"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p0i"+id); 
                                            }
                                          ;break;
                                          
                                         case 16:
                                          switch(id)
                                         {
                                          case 24:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,46,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p16i24->c16p22i46<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,14,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p5i13->c16p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,30,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p5i21->c16p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p16i"+id);   
                                            }
                                          ;break;
                                          
                                        case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,38,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p22i46->c16p6i38<"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,6,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i14->c16p6i6"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,22,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i30->c16p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p22i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,0,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p6i38->c16p0i0"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,16,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i6->c16p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,0,32,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i22->c16p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p6i"+id);   
                                            }
                                          ;break;
                                
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi16BranchGroup);
                                         myJ3dFrame.cubi16BranchGroup=branchGroup;
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi16) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi16BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                             case 17: //cubi17
                                 if(setL.contains(i))
                                 {   
                                        int id=myJ3dFrame.cubi17.getId();
                                        int place =myJ3dFrame.cubi17.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         
                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,8,16,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p7i7->c17p8i16"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,8,8,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p7i33->c17p8i8"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c17p7i"+id);  
                                            }
                                          ;break;
                                          
                                         case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,41,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p8i16->c17p23i41<"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,31,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p8i8->c17p23i31"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c17p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,14,14,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p23i41->c17p14i14"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,14,22,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p23i31->c17p14i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p23i"+id);   
                                            }
                                          ;break;
                                          
                                        case 14:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,7,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p14i14->c17p7i7<"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,33,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p14i22->c17p7i33"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c17p14i"+id);   
                                            }
                                          ;break;
                                          
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 18: //cubi18
                                   if(setL.contains(i))
                                 {     
                                        int id=myJ3dFrame.cubi18.getId();
                                        int place =myJ3dFrame.cubi18.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,24,myJ3dFrame.cubi18.colors);
                                          //System.out.println("c18p0i0->c18p16i24"); 
                                           break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,40,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i16->c18p16i40"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,8,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p0i32->c18p16i8"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p0i"+id); 
                                            }
                                          ;break;
                                          
                                        case 16:
                                          switch(id)
                                         {
                                          case 24:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,46,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i24->c18p22i46"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,14,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i40->c18p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,30,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i8->c18p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p16i"+id);   
                                            }
                                          ;break;
                                          
                                        case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,38,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i18->c18p6i38<"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,6,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i13->c18p6i6"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,22,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i21->c18p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p22i"+id);   
                                            }
                                          ;break;

                                        case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,0,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i38->c18p0i0"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,16,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i6->c18p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,0,32,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i22->c18p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p6i"+id);   
                                            }
                                          ;break;
                                          
                                    
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi18BranchGroup);
                                         myJ3dFrame.cubi18BranchGroup=branchGroup;
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi18) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi18BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 19: //cubi19
                                   if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi19.getId();
                                        int place =myJ3dFrame.cubi19.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        
                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,8,16,myJ3dFrame.cubi19.colors);//17
                                         //System.out.println(">c19p7i7->c19p8i16"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,8,8,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p7i33->c19p8i8"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c19p7i"+id);  
                                            }
                                          ;break;
                                          
                                        case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,41,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p8i16->c19p23i41"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,31,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p8i8->c19p23i31"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c19p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,14,14,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p23i41->c19p14i14"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,14,22,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p23i31->c19p14i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c19p23i"+id);   
                                            }
                                          ;break;
                                          
                                        case 14:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,7,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p14i14->c19p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,33,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p14i22->c19p7i33"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c19p14i"+id);   
                                            }
                                          ;break;
                                        
                                      }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 20: //cubi20
                                   if(setL.contains(i))
                                 {                                    
                                        
                                        int id=myJ3dFrame.cubi20.getId();
                                        int place =myJ3dFrame.cubi20.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,24,myJ3dFrame.cubi20.colors);
                                            //System.out.println(">c20p0i0->c20p16i24"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,40,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i16->c20p16i40"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,8,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p0i32->c20p16i8"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p0i"+id); 
                                            }
                                          ;break;
                                          
                                         case 16:
                                          switch(id)
                                         {
                                          case 24:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,46,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p16i24->c20p22i46<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,14,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i40->c20p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,30,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i8->c20p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p16i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,38,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p22i46->c20p6i38<"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,6,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i14->c20p6i6"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,22,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i30->c20p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p22i"+id);   
                                            }
                                          ;break;
                                          
                                        case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,0,myJ3dFrame.cubi20.colors);
                                         //System.out.println(">c20p6i38->c20p0i0");
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,16,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i6->c20p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,0,32,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i22->c20p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p6i"+id);   
                                            }
                                          ;break; 
  
                                     }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi20BranchGroup);
                                         myJ3dFrame.cubi20BranchGroup=branchGroup;
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi20) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi20BranchGroup); 
                                          
                                      }
                                       ;break;
                        case 21: //cubi21
                                   if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi21.getId();
                                        int place =myJ3dFrame.cubi21.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,8,16,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p7i7->c21p8i16"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,8,8,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c33p7i33->c21p8i8"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c21p7i"+id);  
                                            }
                                          ;break;
                                          
                                        case 8:
                                          switch(id)
                                         {
                                          case 16:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,41,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p8i16->c21p23i41<"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,31,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p8i8->c21p23i31"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c21p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,14,14,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p23i41->c21p14i14"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,14,22,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p23i31->c21p14i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p23i"+id);   
                                            }
                                          ;break;
                                          
                                        case 14:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,7,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p14i14->c21p7i7<"); 
                                          break;
                                          
                                          case 22:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,33,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p14i22->c21p7i33"); 
                                          break;
                                          
                                          
                                           default:
                                           	  //System.out.println("default:c21p14i"+id);   
                                            }
                                          ;break;
                                
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                       ;break;
                          case 22: //cubi22
                                   if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi22.getId();
                                        int place =myJ3dFrame.cubi22.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,40,myJ3dFrame.cubi22.colors);
                                            //System.out.println(">c22p0i0->c22p16i40"); 
                                             break;
                                          
                                          case 16:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,24,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p0i16->c22p16i24"); 
                                          break;
                                          
                                          case 32:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,8,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p0i32->c22p16i8"); 
                                          break;
                                            default:
                                            	System.out.println("default:c22p0i"+id); 
                                            }
                                          ;break;
                                          
                                         case 16:
                                          switch(id)
                                         {
                                          case 40:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,30,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p16i40->c22p22i30<"); 
                                          break;
                                                                                    
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,14,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i24->c22p22i14"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,46,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i8->c22p22i46"); 
                                          break;
                                          
                                          
                                           default:
                                           	  //System.out.println("default:c22p16i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 30:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,38,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p22i30->c22p6i38<"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,6,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i14->c22p6i6"); 
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,22,myJ3dFrame.cubi22.colors);//< 40,8 vertauscht
                                         //System.out.println("c22p22i46->c22p6i22"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p22i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 38:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,0,myJ3dFrame.cubi22.colors);
                                         //System.out.println(">c22p6i38->c22p0i0"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,16,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i6->c22p0i16"); 
                                          break;
                                                  
                                          case 22:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,0,32,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i22->c22p0i32"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p6i"+id);   
                                            }
                                          ;break;
                                          
                                       
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi22BranchGroup);
                                         myJ3dFrame.cubi22BranchGroup=branchGroup;
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi22) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi22BranchGroup); 
                                          
                                      }
                                       ;break;
                         case 23: //cubi23
                                   if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi23.getId();
                                        int place =myJ3dFrame.cubi23.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                         
                                          case 7:
                                          switch(id)
                                         {
                                          case 23:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,8,32,myJ3dFrame.cubi23.colors);//14
                                         //System.out.println(">c23p7i7->c23p8i32"); 
                                          break;
                                          
                                          case 1:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,8,40,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p7i1->c23p8i40"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c23p7i"+id);  
                                            }
                                          ;break;
                                          
                                        case 8:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,9,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p8i16->c23p23i9<"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,31,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p8i40->c23p23i31"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c23p8i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,14,46,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i41->c23p14i46"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,14,38,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i31->c23p14i38"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c23p23i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,23,myJ3dFrame.cubi23.colors);//14 Blöd
                                         //System.out.println("c23p14i46->c23p7i23"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,1,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p14i38->c23p7i1"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c23p14i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                  case 9: //cubi9 
                                      if(setL.contains(i))
                                      { int place =myJ3dFrame.cubi9.getPlace();
                                        int id=myJ3dFrame.cubi9.getId();
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                       { 
                                         case 9: 
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,9,1,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p1i1->c9p9i1");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p9i"+id);  
                                            }
                                         break;
                                         
                                        case 11: 
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,11,3,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p11i3->c9p11i3");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p11i"+id);  
                                            }
                                         break; 
                                         
                                        case 13: 
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,13,5,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p13i5->c9p13i5");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p13i"+id);  
                                            }
                                         break;
                                         
                                       case 15: 
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,15,7,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p15i7->c9p15i7"+id);
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p15i"+id);  
                                            }
                                         break;
                                         
                                       case 24: 
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,24,32,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p24i32->c9p24i32");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p24i"+id);  
                                            }
                                         break;
                                         
                                       case 25: 
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p25i25->c9p25i25");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p25i"+id);  
                                            }
                                         break;    
                                                                               
                                       }
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.cubi9BranchGroup=branchGroup;
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup);
                                        } 
                                       
                                 break;
                                       
                                   case 11: //cubi11
                                 if(setL.contains(i))
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
                                           	  //System.out.println("default:c11p9i"+id);  
                                            }
                                         break;
                                         
                                       	case 11: 
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p11i3->c11p11i3");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p11i"+id);  
                                            }
                                         break;   
                                       	   
                                         case 13: 
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,13,5,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p13i5->c11p13i5");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15: 
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p15i7->c11p15i7");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24: 
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p24i32->c11p24i32");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25: 
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p2525i->c11p25i25");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p25i"+id);  
                                            }
                                         break;
                                        
                                        }
                                        
                                      
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi11BranchGroup);
                                         myJ3dFrame.cubi11BranchGroup=branchGroup;
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi11) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi11BranchGroup); 
                                          
                                      }
                                    break;
                                       
                                   case 13: //cubi13
                                 if(setL.contains(i))
                                 {                                         
                                        int id=myJ3dFrame.cubi13.getId();
                                        int place =myJ3dFrame.cubi13.getPlace();
                                                                               
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
                                            	System.out.println("default:c13p9i");  
                                            }
                                         break; 
                                       
                                       case 11: 
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,11,3,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p11i3->c13p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p11i"+id);  
                                            }
                                         break;  
                                       	   
                                       	 case 13: 
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,13,5,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p13i5->c13p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p13i"+id);  
                                            }
                                         break;  
                                       	   
                                         case 15: 
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,15,7,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p15i7->c13p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24: 
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,24,32,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p24i32->c13p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25: 
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,25,25,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p25i25->c13p2525i"+id);
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p25i"+id);  
                                            }
                                         break;
                                        } 
                                        
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi13BranchGroup);
                                         myJ3dFrame.cubi13BranchGroup=branchGroup;
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi13) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi13BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                  case 15: //cubi15
                                 if(setL.contains(i))
                                 {    
                                        int id=myJ3dFrame.cubi15.getId();
                                        int place =myJ3dFrame.cubi15.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place)
                                       {
                                       	case 9:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,9,1,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p9i1->c15p9i1");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p9i"+id);  
                                            }
                                         break;   
                                       	   
                                       	case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,11,3,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p11i3->c15p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p11i"+id);  
                                            }
                                         break;
                                       
                                       case 13:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,13,5,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p13i5->c15p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p13i"+id);  
                                            }
                                         break;   
                                       	   
                                         case 15:
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,15,7,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p15i7->c15p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,24,32,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p24i32->c15p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,25,25,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p25i25->c15p25i25"+id);
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p25i"+id);  
                                            }
                                         break;
                                        } 
                                      
                                         myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi15BranchGroup);
                                         myJ3dFrame.cubi15BranchGroup=branchGroup;
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi15) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi15BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                   case 24: //    cubi24                                  	  
                                      if(setL.contains(i))
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
                                          //System.out.println("c24p24i0->c24p0i");
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
                                      myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);}
                                     ;break; 

                                    case 25: //  cubi25                                 	  
                                      if(setL.contains(i))
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
                                      	                                        
                                       case 15: // hier Rotationsachse
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
                                          //System.out.println("c25p24i32->c25p32i");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p24i"+id);  
                                            }
                                         break;   
                                         
                                         case 25: 
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,25,25,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p25i25->c25p25i25"+id);
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p25i"+id);  
                                            }
                                         break;   
                                       }
                                                                                                                       
                                       myJ3dFrame.plainL.removeChild(myJ3dFrame.cubi25BranchGroup);
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
                    //System.out.println(f);
               
                placeArray=fillPlaceArray();
                nrArray=fillNrArray(placeArray);
                //arrayAusgabe(nrArray,placeArray);
                 //Drehung rückgängig machen
               myJ3dFrame.LRotationInterpolator.setMinimumAngle(myJ3dFrame.Lwinkel+0f);
               myJ3dFrame.LRotationInterpolator.setMaximumAngle(myJ3dFrame.Lwinkel-(float)Math.PI/2);
               myJ3dFrame.Lalpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Lwinkel=myJ3dFrame.Lwinkel-((float) Math.PI/2);
               
                f=finish();
                while(!f){ f=finish();}
               //System.out.println("left<--");
              }
    }
    /**
     * Constructor for objects of class RotFront
     */
    public Rotlefft(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    {this.myJ3dFrame=myJ3dFrame;
    	rotAchseleft=new Button("l"); // rotAchseleft-->
            rotAchseleft.setBounds(xa,ya,b,h);
            
            // --->von Rotlefft uebernommen
        rotAchseleft.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          {
           leftAction();
            }
             }); 
               
            } // rotAchseleft <-- 
            // <---- von RotLeft uebernommen

    
    
}
    

