import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
/**
 * Write a description of class RotBack here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
public class Rot_M_Y extends Rot
{ static J3dFrame myJ3dFrame;
  Button rotAchse_M_Y;
  static boolean f; 
  static Set<Integer> setB=new HashSet<Integer>();
  
    Button getrotAchse_M_Y()
    { return rotAchse_M_Y;
      }
      
    static public void M_Y_Action()
    {        if(myJ3dFrame.showCubi3)  setB.add(3);
             if(myJ3dFrame.showCubi19)  setB.add(19);
             if(myJ3dFrame.showCubi23)  setB.add(23);
             if(myJ3dFrame.showCubi7) setB.add(7);
             
             if(myJ3dFrame.showCubi11) setB.add(11);
             if(myJ3dFrame.showCubi25) setB.add(25);
             if(myJ3dFrame.showCubi15) setB.add(15);
             if(myJ3dFrame.showCubi24) setB.add(24);
             ActionFrame.textArea.append("N");
        int[] nrArray=new int[26];
           int[] placeArray=new int[26];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {  placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                    //System.out.println("M_Y-->");
                    //zustandsAusgabe(nrArray,placeArray,setB);
                   
                    //myJ3dFrame.showCubisVisible();
                    
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                if( setB.contains(i))
                                      {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if( setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if( setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setB.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi5BranchGroup);
                                      };break; 
                         case 6: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi6BranchGroup);
                                      };break;
                         case 7: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi7BranchGroup);
                                      };break;
                         case 8: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi8BranchGroup);
                                      };break;
                         case 9: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi9BranchGroup);
                                      };break;
                         case 10: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi10BranchGroup);
                                       };break;
                         case 11: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi11BranchGroup);
                                      };break;                                                    
                         case 12: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi12BranchGroup);
                                      };break;
                         case 13: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi13BranchGroup);
                                      };break;
                         case 14: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi14BranchGroup);
                                      };break;
                         case 15: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi15BranchGroup);
                                      };break;
                         case 16: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi16BranchGroup);
                                      };break;
                         case 17: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi17BranchGroup);
                                      };break;
                         case 18: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi18BranchGroup);
                                      };break;
                         case 19: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi19BranchGroup);
                                      };break;
                         case 20: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi20BranchGroup);
                                      };break;
                         case 21: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi21BranchGroup);
                                      };break;
                         case 22: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi22BranchGroup);
                                      };break;
                         case 23: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi23BranchGroup);
                                      };break;
                         case 24: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi24BranchGroup);
                                      };break;
                         case 25: if(setB.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.plainB.addChild(myJ3dFrame.cubi25BranchGroup);
                                      };break;
                         
                        }
                //Vorbereitung -->
                
                f=finish();
                while(!f){ f=finish();}
                if(finish())
                {
                    
               myJ3dFrame.BRotationInterpolator.setMinimumAngle(myJ3dFrame.Bwinkel+0f);
               myJ3dFrame.BRotationInterpolator.setMaximumAngle(myJ3dFrame.Bwinkel+(float)Math.PI/2);
               myJ3dFrame.Balpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Bwinkel=myJ3dFrame.Bwinkel+((float) Math.PI/2);
               
                              
                f=finish();
                while(!f){ f=finish();}
                
                } 
                
                //Nachbereitung
                for (int i=0;i<26;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       { 
                       
                                      
                         case 1: //cubi1
                         if(setB.contains(i))
                                    { 
                                        int place =myJ3dFrame.cubi1.getPlace();
                                        int id=myJ3dFrame.cubi1.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 3:
                                         switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,27,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p3i3->c1p19i27"); 
                                          break;
                                                                                    
                                          case 37:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,45,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p3i37->c1p19i45"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c1p3i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                         switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,41,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i27->c1p23i41"); 
                                          break;                                          
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,31,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i45->c1p23i31"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p19i"+id);  
                                            }
                                          ;break;
                                          
                                          
                                          case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,33,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i41->c1p7i33"); 
                                          break;
                                         
                                          case 31:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,7,7,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i31->c1p7i3"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p23i"+id);  
                                            }
                                          ;break;

                                          
                                           case 7:
                                          switch(id)
                                         {
                                          case 33:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,3,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p7i33->c1p3i3"); 
                                          break;
                                         
                                          case 7:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,3,37,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p7i7->c1p3i37"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p7i"+id);  
                                            }
                                          ;break;                              }
                                           
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                      
                                       };break;
                            
                         case 3://cubi3 
                                 if(setB.contains(i))
                                  { 
                                        int place =myJ3dFrame.cubi3.getPlace();
                                        int id=myJ3dFrame.cubi3.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 3:
                                         switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,27,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i3->c3p19i27"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,45,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p3i37->c3p19i45"); 
                                          break;
                                            default:
                                            	System.out.println("default:c3p3i"+id);  
                                            }
                                          ;break;

                                         case 19:
                                         switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,41,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i27->c3p23i41"); 
                                          break;
                                         
                                          case 45:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,31,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i45->c3p23i31"); 
                                          break;
                                            default:
                                            	System.out.println("default:c3p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,33,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i41->c3p7i33"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,7,7,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i31->c3p7i7"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c3p23i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 33:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,3,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p7i33->c3p3i3"); 
                                          break;
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,3,37,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p7i7->c3p3i37"); 
                                          break;//
                                            default:
                                            	System.out.println("default:c3p7i"+id); 
                                            }
                                          ;break;

                                          }
                                           
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //myJ3dFrame.plainD.addChild(myJ3dFrame.cubi3BranchGroup);
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         
                         case 5: 
                           if(setB.contains(i)) // 
                                     {
                                      int place =myJ3dFrame.cubi5.getPlace();
                                      int id=myJ3dFrame.cubi5.getId();
                                      
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 3:
                                         switch(id)
                                         {case 3:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,27,myJ3dFrame.cubi5.colors);
                                            //System.out.println("c5p3i3->c5p19i27"); 
                                             break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,45,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p3i37->c5p19i45"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p3i"+id);   
                                            }
                                          ;break;
                                        
                                          case 19:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,41,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i27->c5p23i41"); 
                                          break;
                                         
                                          case 45:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,31,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i45->c5p23i31"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p19i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                         switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,33,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i41->c5p7i33"); 
                                          break;
                                         
                                          case 31:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,7,7,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i31->c5p7i7"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p23i"+id);   
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 33:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,3,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p7i33->c5p3i3"); 
                                          break;
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,3,37,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p7i7->c5p3i37"); 
                                          break;
                                            default:
                                            	System.out.println("default:c5p7i"+id);  
                                            }
                                          ;break;
                                          
                                         }
                                         
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi5BranchGroup);
                                         myJ3dFrame.cubi5BranchGroup=branchGroup;
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi5) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         
                                       
                                    
                         case 7: //cubi7
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi7.getPlace();
                                        int id=myJ3dFrame.cubi7.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 3:
                                         switch(id)
                                          {case 3:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,27,myJ3dFrame.cubi7.colors); 
                                          //System.out.println("c7p3i3->c7p19i27"); 
                                           break;
                                         
                                           case 37:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,45,myJ3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i37->c7p19i45"); 
                                           break;
                                            default:
                                            	System.out.println("default:c7p3i"+id);  
                                            }
                                          ;break;

                                         
                                          case 19:
                                          switch(id)
                                          {
                                          case 27:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,41,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i27->c7p23i41");
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,31,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i45->c7p23i31"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c7p19i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                         switch(id)
                                          {
                                          case 41:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,33,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i41->c7p7i33"); 
                                          break;// 
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,7,7,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i31->c7p7i7"); 
                                          break;
                                            default:
                                            	System.out.println("default:c7p23i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,3,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p7i33->c7p3i3"); 
                                          break;
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,3,37,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p7i7->c7p3i37"); 
                                          break;
                                            default:
                                            	System.out.println("default:c7p7i"+id);  
                                            }
                                          ;break;
                                          
                                         }
                                         
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                         case 8: //cubi8
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi8.getPlace();
                                        int id=myJ3dFrame.cubi8.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          case 3:
                                          switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,29,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p3i21->c8p19i29"); 
                                          break;// 
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,11,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p3i35->c8p19i11"); 
                                          break;
                                            default:
                                            	System.out.println("default:c8p3i"+id);  
                                            }
                                          ;break;
                                          
                                         case 19:
                                         switch(id)
                                          {
                                          case 29:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,15,myJ3dFrame.cubi8.colors); 
                                          //System.out.println("c8p19i29->c8p23i15"); 
                                           break;
                                          
                                           case 11:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,25,myJ3dFrame.cubi8.colors);
                                          //System.out.println("c8p19i11->c8p23i25"); 
                                           break;
                                            default:
                                            	System.out.println("default:c8p19i"+id);  
                                            }
                                          ;break;
                                          
                                          case 23:
                                          switch(id)
                                          {
                                          case 15:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,39,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p23i15->c8p7i39"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,7,17,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c7p23i25->c7p7i17"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c7p23i"+id);   
                                            }
                                          ;break;
                                          
                                          case 7:
                                          switch(id)
                                          {
                                          case 39:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,21,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p7i39->c8p3i21"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,3,35,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p7i17->c8p3i35"); 
                                          break;
                                            default:
                                            	System.out.println("default:c8p7i"+id);  
                                            }
                                          ;break;
                               
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                    
                             
                                
                                 
                           case 10: //cubi10
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi10.getPlace();
                                        int id=myJ3dFrame.cubi10.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      
                                      switch(place) {
                                        case 3:
                                          switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,29,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p3i21->c10p19i29"); 
                                          break;
                                         
                                          case 35:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,11,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p3i35->c10p19i11"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c10p3i"+id);   
                                            }
                                          ;break;


                                        case 19:
                                          switch(id)
                                          {
                                          case 29:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,15,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i29->c10p23i15"); 
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,25,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i11->c10p23i25"); 
                                          break;
                                            default:
                                            	System.out.println("default:c10p19i"+id);  
                                            }
                                          ;break;
                                          
                                          
                                         case 23:
                                          switch(id)
                                          {
                                          case 15:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,39,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i15->c10p7i39"); 
                                          break;// 
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,7,17,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i25->c10p7i17"); 
                                          break;
                                            default:
                                            	System.out.println("default:c10p23i"+id);  
                                            }
                                          ;break;
                                          
                                        
                                        case 7:
                                         switch(id)
                                          {case 39:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,21,myJ3dFrame.cubi10.colors); 
                                         //System.out.println(">c10p7i39->c10p3i21"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,3,35,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p7i17->c10p3i35"); 
                                          break;
                                            default:
                                            	System.out.println("default:c10p7i"+id);  
                                            }
                                          ;break;                                        
                                         
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi10BranchGroup);
                                         myJ3dFrame.cubi10BranchGroup=branchGroup;
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi10) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi10BranchGroup); 
                                          
                                      }
                                       ;break;
                                     
                        
                                    
                                      
                       case 12: //cubi12
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi12.getPlace();
                                        int id=myJ3dFrame.cubi12.getId();
                                      
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
  
                                        case 3:
                                          switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,29,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p3i21->c12p19i29"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,11,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p3i35->c12p19i11"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c12p3i"+id);   
                                            }
                                          ;break;


                                        case 19:
                                          switch(id)
                                          {
                                          case 29:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,15,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i29->c12p23i15"); 
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,25,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i11->c12p23i25"); 
                                          break;
                                            default:
                                            	System.out.println("default:c12p19i"+id);  
                                            }
                                          ;break;
                                          
                                           case 23:
                                          switch(id)
                                          {
                                          case 15:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,39,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p23i15->c12p7i39"); 
                                          break;// 
                                                                                  
                                          case 25:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,7,17,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p23i25->c12p7i17"); 
                                          break;
                                            default:
                                            	System.out.println("default:c12p23i"+id);  
                                            }
                                          ;break;
                                          
                                         case 7:
                                         switch(id)
                                          {case 39:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,21,myJ3dFrame.cubi12.colors); 
                                         //System.out.println("c12p7i39->c12p3i21"); 
                                          break;
                                         
                                          case 17:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,3,35,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p7i17->c12p3i35"); 
                                          break;
                                            default:
                                            	System.out.println("default:c12p7i"+id);  
                                            }
                                          ;break;
                                        
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                  
                        
                                   
                         
                        case 14: //cubi14
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi14.getPlace();
                                        int id=myJ3dFrame.cubi14.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                        
                                        case 3:
                                          switch(id)
                                          {
                                          case 21:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,29,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p3i21->c14p19i29"); 
                                         break;
                                          
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,11,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p3i35->c14p19i11"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c14p3i"+id);   
                                            }
                                          ;break;


                                        case 19:
                                          switch(id)
                                          {                                           
                                          case 29:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,15,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i29->c14p23i15"); 
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,25,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i11->c14p23i25"); 
                                          break;                                         
                                            default:
                                            	System.out.println("default:c14p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                          {                                          
                                          case 15:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,39,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p23i15->c14p7i39"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,7,17,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p23i25->c14p7i17"); 
                                          break;
                                            default:
                                            	System.out.println("default:c14p23i"+id);  
                                            }
                                          ;break;
                                          
                                         case 7:
                                         switch(id)
                                          {                                          
                                          case 39:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,21,myJ3dFrame.cubi14.colors); 
                                         //System.out.println("c14p7i39->c14p3i21"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,3,35,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p7i17->c14p3i35"); 
                                          break;
                                                                                  
                                            default:
                                            	System.out.println("default:c14p7i"+id);  
                                            }
                                          ;break;
                                        
                                         
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                       ;break;
                                                                                                   
                             case 17: //cubi17
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi17.getPlace();
                                        int id=myJ3dFrame.cubi17.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,27,myJ3dFrame.cubi17.colors);
                                         //System.out.println("17p3i3->c17p19i27"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,45,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p3i37->c17p19i45"); 
                                          break;
                                            default:
                                            	System.out.println("default:c17p3i"+id);  
                                            }
                                          ;break;
                                          
                                          
                                         case 19:
                                          switch(id)
                                          {
                                          case 27:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,41,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i27->c17p23i41"); 
                                          break;// 
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,31,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i45->c7p23i31"); 
                                          break;
                                            default:
                                            	System.out.println("default:c17p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 23:
                                         switch(id)
                                          {case 41:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,33,myJ3dFrame.cubi17.colors); 
                                         //System.out.println("c17p23i41->c17p7i33"); 
                                          break;
                                          
                                           case 31:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,7,7,myJ3dFrame.cubi17.colors);
                                          //System.out.println("c17p23i31->c17p7i7"); 
                                           break;
                                            default:
                                            	System.out.println("default:c17p23i"+id);  
                                            }
                                          ;break;

                                          
                                         case 7:
                                          switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,3,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p7i33->c17p3i3"); 
                                          break;
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,3,37,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p7i7->c17p3i37"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p7i"+id);   
                                            }
                                          ;break;
                                   
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            
                           case 19: //cubi19
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi19.getPlace();
                                        int id=myJ3dFrame.cubi19.getId();                                                                               
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          
                                        case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,27,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p3i3->c19p19i27"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,45,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p3i37->c19p19i45"); 
                                          break;
                                            default:
                                            	System.out.println("default:c19p3i"+id);  
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                          {
                                          case 27:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,41,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i27->c19p23i41"); 
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,31,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i45->c19p23i31"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c19p19i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                         switch(id)
                                          {
                                          case 41:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,33,myJ3dFrame.cubi19.colors); 
                                         //System.out.println("c19p23i41->c19p7i33"); 
                                          break;
                                         
                                          case 31:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,7,7,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p23i31->c19p7i7"); 
                                          break;
                                            default:
                                            	System.out.println("default:c19p23i"+id);  
                                            }
                                          ;break;
                                          
                                        case 7:
                                          switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,3,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p7i33->c19p3i3"); 
                                          break;// 
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,3,37,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p7i7->c19p3i37"); 
                                          break;
                                            default:
                                            	System.out.println("default:c19p7i"+id);  
                                            }
                                          ;break;
                                          
                                                                       
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                       ;break;
                           
                        case 21: //cubi21
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi21.getPlace();
                                        int id=myJ3dFrame.cubi21.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                        case 3:
                                         switch(id)
                                          {
                                           case 3:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,27,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p3i3->c21p19i27"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,45,myJ3dFrame.cubi21.colors); 
                                         //System.out.println(">c21p3i37->c21p19i45"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c21p3i"+id);  
                                            }
                                          ;break;

                                        case 19:
                                          switch(id)
                                          {
                                          case 27:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,41,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p19i27->c21p23i41"); 
                                          break;
                                        
                                          case 45:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,31,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p19i45->c21p23i31"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p19i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                          {
                                          case 41:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,33,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p23i41->c21p7i33<"); 
                                          break;// 
                                                                                   
                                          case 31:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,7,7,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p23i31->c21p7i7"); 
                                          break;
                                            default:
                                            	System.out.println("default:c21p23i"+id);  
                                            }
                                          ;break;


                                        case 7:
                                          switch(id)
                                          {
                                          case 33:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,3,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p7i33->c21p3i3"); 
                                          break;                                                                                   
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,3,37,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p7i7->c21p3i37"); 
                                          break;
                                            default:
                                            	System.out.println("default:c21p7i"+id);  
                                            }
                                          ;break;

                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                       ;break;
                          
                         case 23: //cubi23
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi23.getPlace();
                                        int id=myJ3dFrame.cubi23.getId();
                                                                                                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                        case 3:
                                         switch(id)
                                          {case 5:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,13,myJ3dFrame.cubi23.colors); 
                                         //System.out.println("c23p3i5->c23p19i13");
                                          break;                                          
                                          
                                          case 19:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,27,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p3i19->c23p19i27");
                                          break;
                                            default:System.out.println("default:c23p3i"+id);  
                                            }
                                          ;break;

                                        case 19:
                                          switch(id)
                                          {
                                          case 13:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,31,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p19i13->c23p23i31");
                                          break;
                                         
                                          case 27:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,9,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p19i27->c23p23i9");
                                          break;
                                           default:
                                           	  //System.out.println("default:c23p19i"+id);   
                                            }
                                          ;break;
                                          
                                          case 23:
                                          switch(id)
                                          {
                                          case 31:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,23,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i31->c23p7i23");
                                          break; 
                                                                                                                             
                                          case 9:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,7,1,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i9->c23p7i1");
                                          break;
                                            default:
                                            	System.out.println("default:c23p23i"+id);  
                                            }
                                          ;break;


                                        case 7:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,5,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p7i23->c23p3i5");
                                          break;
                                          
                                          case 1:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,3,19,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p7i1->c23p3i19");
                                          break;
                                            default:
                                            	System.out.println("default:c23p7i"+id);  
                                            }
                                          ;break;
                                                                             
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 9: //cubi9 
                                      if(setB.contains(i))
                                      { int place =myJ3dFrame.cubi9.getPlace();
                                        int id=myJ3dFrame.cubi9.getId();
                                        BranchGroup branchGroup=null;
                                        
                                        switch(place)
                                       {  
                                        case 9://Drehachse
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
                                          case 3:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p11i3->c9p25i25");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p11"+id);  
                                            }
                                         break;
                                         
                                         case 13://Drehachse
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
                                          case 7:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p15i7->c9p24i32");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p15"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p24i32->c9p11i3"+id);
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p25i25->c9p15i7");
                                          break;                                                                                                                                                                                                                
                                            default:
                                            	System.out.println("default:c9p25"+id);  
                                            }
                                         break;
                                        }            
                                       
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.cubi9BranchGroup=branchGroup;
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup);
                                       }                                          
                                       break;
                                       
                                case 11: //cubi11 ist Drehachse auf Platz 9 oder 13
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi11.getPlace();
                                        int id=myJ3dFrame.cubi11.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        switch(place)
                                       {  
                                        case 9://"Drehachse"
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
                                          case 3:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p11i3->c11p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p11"+id);  
                                            }
                                         break;
                                         
                                         case 13://"Drehachse"
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
                                          case 7:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p15i7->c11p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p15"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p24i32->c11p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p25i25->c11p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c11p25"+id);  
                                            }
                                         break;
                                        }                                       
                                         
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi11BranchGroup);
                                         myJ3dFrame.cubi11BranchGroup=branchGroup;
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi11) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi11BranchGroup); 
                                          
                                       }
                                      break;
                                      
                               case 13: //cubi13
                                 if(setB.contains(i))
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
                                          case 3:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,25,25,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p11i3->c13p25i25");
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
                                          case 7:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,24,32,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p15i7->c13p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p15"+id);  
                                            }
                                         break;
                                         
                                          case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,11,3,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p24id32->c13p11i");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p24"+id);  
                                            }
                                         break;
                                         
                                          case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,15,7,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p25i25->c13p15i7"+id);
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p25"+id);  
                                            }
                                         break;
                                        }        
                                       
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi13BranchGroup);
                                         myJ3dFrame.cubi13BranchGroup=branchGroup;
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi13) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi13BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 15: //cubi15
                                 if(setB.contains(i))
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
                                                                                                                            
                                            default:System.out.println("default:c15p9"+id);  
                                            }
                                         break;
                                         
                                         case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,25,25,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p11i3->c15p25i25");
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
                                          case 7:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,24,32,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p15i7->c15p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p15"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,11,3,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p24i32->c15p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p24"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,15,7,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p25i25->c15p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p25"+id);  
                                            }
                                         break;
                                        }        
                                        
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi15BranchGroup);
                                         myJ3dFrame.cubi15BranchGroup=branchGroup;
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi15) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi15BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 24: //  cubi24                                    	  
                                      if(setB.contains(i))
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
                                          case 13:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,25,41,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p11i13->c24p25i41");
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
                                          case 9:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,24,0,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p15i9->c24p24i0");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 0:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,11,13,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p24i0->c24p11i13");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,15,9,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p25i41->c24p15i9");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p25i"+id);  
                                            }
                                         break;
                                                                                                                                                                                                                                                 
                                       }
                                                                                                                       
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);
                                      }
                                     ;break;
                                     
                                   case 25: //  cubi25   hier Rotationsachse                                 	  
                                      if(setB.contains(i))
                                      { int place =myJ3dFrame.cubi25.getPlace();
                                        int id=myJ3dFrame.cubi25.getId();
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      { case 9://Drehachse
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
                                          case 3:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,25,25,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p11i3->c25p25i25");
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
                                          case 7:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,24,32,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p15i7->c25p24i32");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p15i"+id);  
                                            }
                                         break;
                                         
                                         case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,11,3,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p24i32->c25p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p24i"+id);  
                                            }
                                         break;
                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,15,7,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p25i25->c25p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p25i"+id);  
                                            }
                                         break;
                                                                                                                                                                                                                                                                                           
                                       }
                                                                                                                       
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi25BranchGroup);
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
               myJ3dFrame.BRotationInterpolator.setMinimumAngle(myJ3dFrame.Bwinkel+0f);
               myJ3dFrame.BRotationInterpolator.setMaximumAngle(myJ3dFrame.Bwinkel-(float)Math.PI/2);
               myJ3dFrame.Balpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Bwinkel=myJ3dFrame.Bwinkel-((float) Math.PI/2);
               
                f=finish();
                while(!f){ f=finish();}
               //System.out.println("M_Y<--");
              }
    }
    /**
     * Constructor for objects of class RotBack
     */
    public Rot_M_Y(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
        rotAchse_M_Y=new Button("N"); // rotAchseUp-->
            rotAchse_M_Y.setBounds(xa,ya,b,h);
            
         rotAchse_M_Y.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          {
           M_Y_Action();
            }
             }); 
               
            }  
          
    }