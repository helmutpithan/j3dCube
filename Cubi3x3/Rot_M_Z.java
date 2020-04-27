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

public class Rot_M_Z extends Rot
{  static J3dFrame myJ3dFrame;
	Button rotAchse_M_Z;
  static boolean f;
  static Set<Integer> setD=new HashSet<Integer>();
     
  Button getrotAchse_M_Z()
    { return rotAchse_M_Z;
      }
  static public void M_Z_Action()
  {         
            
            if(myJ3dFrame.showCubi8)  setD.add(8);
            if(myJ3dFrame.showCubi9)  setD.add(9);
            if(myJ3dFrame.showCubi10) setD.add(10);
            if(myJ3dFrame.showCubi11) setD.add(11);
            if(myJ3dFrame.showCubi12) setD.add(12);
            if(myJ3dFrame.showCubi13) setD.add(13);
            if(myJ3dFrame.showCubi14) setD.add(14);
            if(myJ3dFrame.showCubi15) setD.add(15);                       
            
             ActionFrame.textArea.append("O");
            
            int[] placeArray=new int[26];
            int[] nrArray=new int[26];
            
            
            f=finish();            
            while(!f){ f=finish();}
             if(finish())
                { 
                    placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                    //myJ3dFrame.showCubisVisible();
                    //System.out.println("M_Z -->");
                    //zustandsAusgabe(nrArray,placeArray,setD);
                    
                  //Vorbereitung
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr später bis <24
                    switch(nrArray[i])
                       { case 0:
                                 if(setD.contains(i))
                                      {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi0BranchGroup);
                                    } break;
                         case 1: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi1BranchGroup);
                                    } break;
                         case 2: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi2BranchGroup);
                                    } break;
                         case 3: if(setD.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi3BranchGroup);
                                       } break;
                         case 4: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi4BranchGroup);
                                      } break;
                         case 5: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi5BranchGroup);
                                       }
                                        break;
                         case 6: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi6BranchGroup);
                                       }
                                        break;
                         case 7: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi7BranchGroup);
                                       } break;
                         case 8: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi8BranchGroup);
                                      } break;
                         case 9: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi9BranchGroup);
                                      } break;
                         case 10: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi10BranchGroup);
                                       } break;
                         case 11: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi11BranchGroup);
                                      } break;                                                    
                         case 12: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi12BranchGroup);
                                      } break;
                         case 13: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi13BranchGroup);
                                      } break;
                         case 14: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi14BranchGroup);
                                      } break;
                         case 15: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi15BranchGroup);
                                      } break;
                         case 16: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi16BranchGroup);
                                      } break;
                         case 17: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi17BranchGroup);
                                      } break;
                         case 18: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi18BranchGroup);
                                      } break;
                         case 19: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi19BranchGroup);
                                      } break;
                         case 20: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi20BranchGroup);
                                      } break;
                         case 21: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi21BranchGroup);
                                      } break;
                         case 22: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi22BranchGroup);
                                      } break;
                         case 23: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainD.addChild(myJ3dFrame.cubi23BranchGroup);
                                      } break;
                         case 24: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24){ myJ3dFrame.plainD.addChild(myJ3dFrame.cubi24BranchGroup);}
                                       } break;
                          case 25: if(setD.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25){ myJ3dFrame.plainD.addChild(myJ3dFrame.cubi25BranchGroup);}
                                       } break;              
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
               
                // Warten auf Ende der Bewegung
                f=finish();              
                while(!f){ f=finish();}
                
                } 
                
                //Nachbereitung
                for (int i=0;i<26;i++)
                {
                	
                	
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                   
                       { case 1: //cubi1
                         if(setD.contains(i))
                                    { 
                                        int place =myJ3dFrame.cubi1.getPlace();
                                        int id=myJ3dFrame.cubi1.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                      switch(place) {                                                                                  
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
                                           break;
                                                                                                                            
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
                                           break;
                                          
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
                                           break;
                                          
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
                                           break;                               
                                          
                                          }
                                           
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                      
                                       } break;
                                       
                           case 3://cubi3 
                                 if(setD.contains(i))
                                  { 
                                        int place =myJ3dFrame.cubi3.getPlace();
                                        int id=myJ3dFrame.cubi3.getId();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) { 
                                      	  
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
                                           break;
                                         
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
                                           break;
                                          
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
                                           	  //System.out.println("default:c3p12i"+id);   
                                            }
                                           break; 
                                          
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
                                           	  //System.out.println("default:c3p14i"+id);   
                                            }
                                           break;  
                                          
                                          }
                                           
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                         break;
                           case 5: 
                           if(setD.contains(i)) // 
                                     {
                                      int place =myJ3dFrame.cubi5.getPlace();
                                      int id=myJ3dFrame.cubi5.getId();
                                      
                                      
                                     BranchGroup branchGroup=null;
                                    switch(place) {
                                      	  
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
                                           	  //System.out.println("default:c5p8i"+id);   
                                            }
                                           break;
                                        
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
                                           	  //System.out.println("default:c5p10i"+id);   
                                            }
                                           break;
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
                                           	  //System.out.println("default:c5p12i"+id);   
                                            }
                                           break;
                                          
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
                                           break;
                                          
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
                       	   
                       	  case 7: //cubi7
                                 if(setD.contains(i))
                                 {                                    
                                        int id=myJ3dFrame.cubi7.getId();
                                        int place =myJ3dFrame.cubi7.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      	                                       	  
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
                                           	  //System.out.println("default:c7p8i"+id);   
                                            }
                                           break;
                                          
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
                                           	  //System.out.println("default:c7p10i"+id);   
                                            }
                                           break;
                                          
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
                                           	  //System.out.println("default:c7p12i"+id);   
                                            }
                                           break;
                                                                                   
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
                                           	  //System.out.println("default:c7p14i"+id);   
                                            }
                                           break;
                                                                                
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                        break;   
                                                                                    
                        case 8: //cubi8 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi8.getPlace();
                                        int id=myJ3dFrame.cubi8.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          
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
                                          	 //System.out.println("default:c8p8i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c8p10i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c8p10i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c8p10i"+id);  
                                            }
                                           break;
                                        
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                        break;
                                       
                                       
                                
                                                                                                        
                                 
                              case 10: //cubi10
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi10.getPlace();
                                        int id=myJ3dFrame.cubi10.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                      switch(place) {                                    	  
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
                                          	 //System.out.println("default:c10p8i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c10p10i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c10p12i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c10p14i"+id);  
                                            }
                                           break;
                                        
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
                                      switch(place) {
                                     	 
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
                                          	 //System.out.println("default:c12p8i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c12p10i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c12p12i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c14p14i"+id);  
                                            }
                                           break;
                                         
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                        break;
                        
                         
                        case 14: //cubi14
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi14.getPlace();
                                        int id=myJ3dFrame.cubi14.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                        
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
                                          	 //System.out.println("default:c14p8i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c14p10i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c14p12i"+id);  
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c14p14i"+id);  
                                            }
                                           break;
                                         
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                        break;
                                       
                       
                                       
                                 case 17: //cubi17
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi17.getPlace();
                                        int id=myJ3dFrame.cubi17.getId();
                                      
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      	  
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
                                           break;
                                          
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
                                           break;
                                          
                                          
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
                                           break;
                                                                                 
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
                                           	  //System.out.println("default:c17p14i"+id);   
                                            }
                                           break;
                                   
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                       }
                                        break;
                                       
                                case 19: //cubi19
                                   if(setD.contains(i))
                                 { 
                                   
                                        int id=myJ3dFrame.cubi19.getId();
                                        int place =myJ3dFrame.cubi19.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      	  
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
                                           	  //System.out.println("default:c19p8i"+id);   
                                            }
                                           break;
                                      
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
                                           	  //System.out.println("default:c19p10i"+id);   
                                            }
                                           break;
                                                                                    
                                                                    
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
                                           	  //System.out.println("default:c19p12i"+id);   
                                            }
                                           break;
                                          
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
                                           	  //System.out.println("default:c19p14i"+id);   
                                            }
                                           break;
                                                       
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                        break;
                                       
                                 case 21: //cubi21
                                   if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi21.getPlace();
                                        int id=myJ3dFrame.cubi21.getId();                                      
                                        
                                        BranchGroup branchGroup=null;
                                    switch(place) {
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
                                           	  //System.out.println("default:c21p8i"+id);   
                                            }
                                           break;
                                          
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
                                           	  //System.out.println("default:c21p10i"+id);   
                                            }
                                           break;
                                          
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
                                          	 //System.out.println("default:c21p12i"+id);   
                                            }
                                           break;
                                                                                 
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
                                           break;

                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                        break;
                 
                               case 23: //cubi23
                                   if(setD.contains(i))
                                 {                                        
                                        int id=myJ3dFrame.cubi23.getId();
                                        int place =myJ3dFrame.cubi23.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
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
                                           	  //System.out.println("default:c23p8i"+id);   
                                            }
                                           break; 
                                          
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
                                           	  //System.out.println("default:c23p10i"+id);   
                                            }
                                           break;
                                          
                                          
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
                                           	  //System.out.println("default:c23p12i"+id);   
                                            }
                                           break;
                                       
                                          
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
                                           	  //System.out.println("default:c23p14i"+id);   
                                            }
                                           break;
                                                                                                                       
                                          }
                                         myJ3dFrame.plainD.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                        break;
                                       
                                    case 9: //cubi9 
                                 if(setD.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi9.getPlace();
                                        int id=myJ3dFrame.cubi9.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,11,3,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p9i1->c9p11i3<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c9p9i"+id);
                                            }
                                           break;
                                          
                                         case 11:
                                         switch(id)
                                          {case 3:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,13,5,myJ3dFrame.cubi9.colors); 
                                           //System.out.println(">c9p11i3->c9p13i5"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c9p11i"+id);  
                                            }
                                           break;
                                         
                                          case 13:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,15,7,myJ3dFrame.cubi9.colors);
                                         //System.out.println("c9p13i5->c9p15i7"); 
                                          break;                                                                                                                             
                                          default:
                                          	 //System.out.println("default:c9p13i"+id);   
                                            }
                                           break;

                                          case 15:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,9,1,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p15i7->c9p9i1"); 
                                          break;
                                                                                   
                                          default:
                                          	 //System.out.println("default:c9p15i"+id);  
                                            }
                                           break;
                                          
                                          case 24:
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,24,32,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p24i32->c9p24i32"); 
                                          break;
                                                                                   
                                          default:
                                          	 //System.out.println("default:c9p24i"+id);  
                                            }
                                           break;
                                          
                                          case 25:
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p25i25->c9p25i25"); 
                                          break;
                                                                                   
                                          default:
                                          	 //System.out.println("default:c9p25i"+id);  
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
                                      switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi11.colors);
                                         //System.out.println(">c9p9i1->c9p11i3<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c11p9i"+id);
                                            }
                                           break;
                                          
                                         case 11:
                                         switch(id)
                                          {case 3:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,13,5,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p11i3->c11p13i5"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p11i"+id);  
                                            }
                                           break;
                                          
                                         case 13:
                                         switch(id)
                                          {case 5:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p13i5->c11p15i7"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p13i"+id);  
                                            }
                                           break;
                                          
                                        case 15:
                                         switch(id)
                                          {case 7:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,9,1,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p15i7->c11p9i1"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p15i"+id);  
                                            }
                                           break;
                                          
                                          case 24:
                                         switch(id)
                                          {case 32:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p24i32->c11p24i32"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p24i"+id);  
                                            }
                                           break;
                                          
                                          case 25:
                                         switch(id)
                                          {case 25:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p25i25->c11p25i25"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p25i"+id);  
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
                                     switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,11,3,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p9i1->c13p11i3<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p9i"+id);
                                            }
                                           break;   
                                         case 11:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,13,5,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p11i3->c13p13i5<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p11i"+id);
                                            }
                                           break;
                                          
                                        case 13:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,15,7,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p13i5->c13p15i7<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p13i"+id);
                                            }
                                           break;
                                          
                                        case 15:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,9,1,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p15i7->c13p9i1<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p15i"+id);
                                            }
                                           break;
                                          
                                      	case 24:
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,24,32,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p24i32->c13p24i32<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p24i"+id);
                                            }
                                           break;
                                          
                                        case 25:
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,25,25,myJ3dFrame.cubi13.colors);
                                         //System.out.println(">c13p25i25->c13p25i25<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p25i"+id);
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
                                        break;
                                       
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
                                          	 //System.out.println("default:c15p9i"+id);
                                            }
                                           break;
                                          
                                          case 11:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,13,5,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p11i3->c15p13i5<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c15p11i"+id);
                                            }
                                           break;
                                          
                                         case 13:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,15,7,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p13i5->c15p15i7<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c15p13i"+id);
                                            }
                                           break;
                                          
                                        case 15:
                                          switch(id)
                                          {
                                          case 7:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,9,1,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p15i7->c15p9i1<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c15p15i"+id);
                                            }
                                           break;
                                          
                                         case 24:
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,24,32,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p24i32->c15p24i32<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c15p24i"+id);
                                            }
                                           break;
                                          
                                          case 25:
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,25,25,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p25i25->c15p25i25<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c15p25i"+id);
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
                                        break;
                                      
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
                                       
                                         case 24://Drehachse
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,24,0,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p24i0->c24p11i13");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25://Drehachse
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
                                      break;
                                        
                                   case 25: //cubi24 
                                      if(setD.contains(i))
                                      { int place =myJ3dFrame.cubi25.getPlace();
                                        int id=myJ3dFrame.cubi25.getId();
                                        BranchGroup branchGroup=null;
                                        
                                          switch(place)
                                      {
                                      	 case 9: // Drehachse
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
                                         
                                       
                                        case 24: // hier Rotationsachse
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,24,32,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p25i25->c25p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p24i"+id);  
                                            }
                                         break;                      
                                      	                                        
                                       case 25: // hier Rotationsachse
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
               //System.out.println("M_Z <--");
                }
            }
    
    public Rot_M_Z(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    {  this.myJ3dFrame=myJ3dFrame;
    	rotAchse_M_Z=new Button("O"); 
            rotAchse_M_Z.setBounds(xa,ya,b,h);
            
         rotAchse_M_Z.addActionListener(new ActionListener()
            { 
            public void actionPerformed(ActionEvent e)
            {
              M_Z_Action();
            }
             });   
    }   
}
