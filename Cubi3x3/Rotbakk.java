import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
/**
 * Write a description of class Rotbakk here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */

public class Rotbakk extends Rot
{ static J3dFrame myJ3dFrame;
	Button rotAchseback;
  static boolean f; 
  static Set<Integer> setB=new HashSet<Integer>();
  
    Button getrotAchseback()
    { return rotAchseback;
      } 
    static public void backAction()
    {       if(myJ3dFrame.showCubi4) setB.add(4);
             if(myJ3dFrame.showCubi5) setB.add(5);
             if(myJ3dFrame.showCubi6) setB.add(6);
             if(myJ3dFrame.showCubi12) setB.add(12);
             if(myJ3dFrame.showCubi13) setB.add(13);
             if(myJ3dFrame.showCubi14) setB.add(14);
             if(myJ3dFrame.showCubi20) setB.add(20);
             if(myJ3dFrame.showCubi21) setB.add(21);
             if(myJ3dFrame.showCubi22) setB.add(22);
             ActionFrame.textArea.append("b");
        int[] nrArray=new int[26];
            int[] placeArray=new int[26];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {  placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                  //System.out.println("back-->");
                   //zustandsAusgabe(nrArray,placeArray,setB);
                    //myJ3dFrame.showCubisVisible();
                    
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       {case 0:
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
                                       if(myJ3dFrame.showCubi24){ myJ3dFrame.plainB.addChild(myJ3dFrame.cubi24BranchGroup);}
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
               myJ3dFrame.BRotationInterpolator.setMaximumAngle(myJ3dFrame.Bwinkel-(float)Math.PI/2);
               myJ3dFrame.Balpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Bwinkel=myJ3dFrame.Bwinkel-((float) Math.PI/2);
              
                               // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();}
               
                } 
                
                //Nachbereitung
                for (int i=0;i<26;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       { case 0://cubi0
                                 if(setB.contains(i))
                                 {                                     
                                        int id=myJ3dFrame.cubi0.getId();
                                        int place =myJ3dFrame.cubi0.getPlace();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                          case 4:
                                          switch(id)//4,20,36
                                         {case 4:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,22,myJ3dFrame.cubi0.colors);
                                            //System.out.println(">c0p4i4->c0p6i22"); 
                                             break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,38,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i20->c0p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,6,6,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p4i36->c0p6i6"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p4i"+id); 
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)//22,38,6
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,46,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i22->c0p22i46"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,14,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i38->c0p22i14"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,30,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p6i6->c0p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p6i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,12,myJ3dFrame.cubi0.colors);
                                         //System.out.println(">c0p22i46->c0p20i12"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,28,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i14->c0p20i28"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,44,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i30->c0p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)//12,28,44
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,4,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i12->c0p4i4"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,20,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i28->c0p4i20"); 
                                          break;
                                                  
                                          case 44:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,4,36,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i44->c0p4i36"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p20i"+id);   
                                            }
                                          ;break;
                                                                                  
                                          }
                                          
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi0BranchGroup);
                                         myJ3dFrame.cubi0BranchGroup=branchGroup;
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                     
                                         if(myJ3dFrame.showCubi0) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi0BranchGroup);                                        
                                                                                 
                                    };break;
                                      
                         case 1: //cubi1
                         if(setB.contains(i))
                                    { 
                                        int place =myJ3dFrame.cubi1.getPlace();
                                        int id=myJ3dFrame.cubi1.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 5:
                                         switch(id)//5,39
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,14,22,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p5i5->c1p14i22"); 
                                          break;
                                                                                    
                                          case 39:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,14,14,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p5i16->c1p14i14"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c1p5i"+id);   
                                            }
                                          ;break;
                                          
                                           
                                         case 14:
                                          switch(id)
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,47,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p14i22->c1p21i47"); 
                                          break;
                                         
                                          case 14:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,29,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p14i14->c1p21i29"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p5i"+id);  
                                            }
                                          ;break; 
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,12,12,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i47->c1p12i12"); 
                                          break;
                                         
                                          case 29:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,12,20,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i29->c1p12i20"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p21i"+id);  
                                            }
                                          ;break;
                                          
                                         case 12:
                                         switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,5,myJ3dFrame.cubi1.colors);
                                         //System.out.println(">c1p12i12->c1p5i5"); 
                                          break;                                          
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,39,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p12i20->c1p5i39"); 
                                          break;
                                            default:
                                            	System.out.println("default:c1p12i"+id);  
                                            }
                                          ;break;
                                      }
                                                                                    
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //myJ3dFrame.plainD.addChild(myJ3dFrame.cubi1BranchGroup);
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                      
                                       };break;
                                       
                            case 2://cubi2 
                                       if(setB.contains(i))
                                      {  
                                        int place =myJ3dFrame.cubi2.getPlace();
                                        int id=myJ3dFrame.cubi2.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {                                      
                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,22,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i4->c2p6i22"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,38,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i20->c2p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,6,6,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p4i36->c2p6i6"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p4i"+id);  
                                            }
                                          ;break;
                                          
                                         case 6:
                                         switch(id)
                                         {case 22:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,46,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i22->c2p22i46"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,14,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i38->c2p22i14"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,30,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p6i6->c2p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p6i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,12,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i46->c2p20i12<"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,28,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i14->c2p20i28"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,44,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i30->c2p20i44"); 
                                          break;
                                          default:
                                          	 //System.out.println("default:c2p22i"+id);   
                                        }
                                          ;break;
                                                                                   
                                          case 20:
                                          switch(id)
                                         { 
                                          case 12:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,4,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i20->c2p4i4"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,20,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i28->c2p4i20"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,4,36,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i44->c2p4i36"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p20i"+id);  
                                            }
                                          ;break;

                                          }
                                           
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi2BranchGroup);
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
                                 if(setB.contains(i))
                                  { 
                                        int place =myJ3dFrame.cubi3.getPlace();
                                        int id=myJ3dFrame.cubi3.getId();                                      
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 5:
                                         switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,14,22,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i5->c3p14i42"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,14,14,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i39->c3p14i14"); 
                                          break;
                                            default:
                                            	System.out.println("default:c3p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,47,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p14i22->c3p21i47"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,29,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p14i14->c3p21i29"); 
                                          break;//
                                            default:
                                            	System.out.println("default:c3p14i"+id); 
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,12,12,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i47->c3p12i12"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,12,20,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i29->c3p12i20"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c3p21i"+id);  
                                            }
                                          ;break;


                                         case 12:
                                         switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,5,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p12i12->c3p5i5"); 
                                          break;
                                         
                                          case 20:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,39,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p12i20->c3p5i39"); 
                                          break;
                                            default:
                                            	System.out.println("default:c3p12i"+id);  
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
                         case 4: //cubi4
                                 if(setB.contains(i)) 
                                      {
                                        int place =myJ3dFrame.cubi4.getPlace();
                                        int id=myJ3dFrame.cubi4.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 4:
                                         switch(id)
                                         {case 4:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,22,myJ3dFrame.cubi4.colors);
                                            //System.out.println("c4p4i4->c4p6i22"); 
                                             break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,38,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i20->c4p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,6,6,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p4i36->c4p6i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p4i"+id);   
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,46,myJ3dFrame.cubi4.colors); 
                                         //System.out.println("c4p6i22->c4p22i46");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,14,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p6i38->c4p22i14"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,30,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p6i6->c4p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p6i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                         switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,12,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i46->c4p20i12"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,28,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i14->c4p20i28"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,44,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i30->c4p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c4p22i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                         switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,4,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i12->c4p4i4"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,20,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i28->c4p4i20"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,4,36,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i44->c4p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c4p20i"+id);  
                                            }
                                          ;break;
                                         
                                          }
                                           
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi4BranchGroup);
                                         myJ3dFrame.cubi4BranchGroup=branchGroup;
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //myJ3dFrame.plainD.addChild(myJ3dFrame.cubi4BranchGroup);
                                         if(myJ3dFrame.showCubi4) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                         case 5://cubi5 
                           if(setB.contains(i)) // 
                                     {
                                      int place =myJ3dFrame.cubi5.getPlace();
                                      int id=myJ3dFrame.cubi5.getId();
                                      
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                         case 5:
                                         switch(id)
                                         {case 5:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,14,22,myJ3dFrame.cubi5.colors);
                                            //System.out.println("c5p5i5->c5p14i22"); 
                                             break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,14,14,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p5i39->c5p14i14"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p5i"+id);   
                                            }
                                          ;break;
                                          
                                        case 14:
                                          switch(id)
                                         {
                                          case 22:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,47,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p14i22->c5p21i47"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,29,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p14i14->c5p21i29"); 
                                          break;
                                            default:
                                            	System.out.println("default:c5p14i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                         switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,12,12,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p21i47->c5p12i12"); 
                                          break;
                                         
                                          case 29:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,12,20,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p21i29->c5p12i20"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p21i"+id);   
                                            }
                                          ;break;

                                          case 12:
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,5,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p12i12->c5p5i5"); 
                                          break;
                                         
                                          case 20:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,39,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p12i20->c5p5i39"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p12i"+id);   
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
                                      
                         case 6: //cubi6
                                    if(setB.contains(i))
                                   {
                                        int place =myJ3dFrame.cubi6.getPlace();
                                        int id=myJ3dFrame.cubi6.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,22,myJ3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i4->c6p6i22"); 
                                           break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,38,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i20->c6p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,6,6,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p4i36->c6p6i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p4i"+id);   
                                            }
                                          ;break;
                                          
                                        case 6:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,46,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i22->c6p22i46");
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,14,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i38->c6p22i14"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,30,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p6i6->c6p22i30"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                          {
                                          case 46:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,12,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i46->c6p20i12"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,28,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i14->c6p20i28"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,44,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i30->c6p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p22i"+id);
                                            }
                                          ;break;
                                          
                                        case 20:
                                          switch(id)
                                          {
                                          case 12:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,4,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i12->c6p4i4"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,20,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i28->c6p4i20"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,4,36,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i44->c6p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p20i"+id);  
                                            }
                                          ;break;
                                       
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi6BranchGroup);
                                         myJ3dFrame.cubi6BranchGroup=branchGroup;
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi6) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi7.getPlace();
                                        int id=myJ3dFrame.cubi7.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                         case 5:
                                         switch(id)
                                          {case 5:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,14,22,myJ3dFrame.cubi7.colors); 
                                          //System.out.println("c7p5i5->c7p14i22"); 
                                           break;
                                         
                                           case 39:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,14,14,myJ3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i39->c7p14i14"); 
                                           break;
                                            default:
                                            	System.out.println("default:c7p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,47,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p14i22->c7p21i47"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,29,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p14i14->c7p21i29"); 
                                          break;
                                            default:
                                            	System.out.println("default:c7p14i"+id);  
                                            }
                                          ;break;
                                          
                                          case 21:
                                         switch(id)
                                          {
                                          case 47:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,12,12,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i47->c7p12i12"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,12,20,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i29->c7p12i20"); 
                                          break;
                                            default:
                                            	System.out.println("default:c7p21i"+id);  
                                            }
                                          ;break;
                                         
                                          case 12:
                                          switch(id)
                                          {
                                          case 12:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,5,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p12i12->c7p5i5"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,39,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p12i20->c7p5i39"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c7p12i"+id);   
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
                                        
                                      switch(place) 
                                      {
                                          case 5:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,14,46,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i23->c8p14i46"); 
                                          break;// 
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,14,6,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i37->c8p14i6"); 
                                          break;
                                            default:
                                            	System.out.println("default:c8p5i"+id);  
                                            }
                                          ;break;
                                          
                                        case 14:
                                          switch(id)
                                          {
                                          case 46:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,13,myJ3dFrame.cubi8.colors);
                                         //System.out.println(">c8p14i46->c8p21i13"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,31,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p14i6->c8p21i31"); 
                                          break;
                                            default:
                                            	System.out.println("default:c8p14i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                          {
                                          case 13:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,12,4,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p21i13->c8p12i4"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,12,44,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c7p21i31->c7p12i44"); 
                                          break;
                                           default:                                          	   
                                           	  //System.out.println("default:c7p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 12:
                                         switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,23,myJ3dFrame.cubi8.colors); 
                                          //System.out.println(">c8p12i4->c8p5i23"); 
                                           break;
                                          
                                           case 44:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,37,myJ3dFrame.cubi8.colors);
                                          //System.out.println("c8p12i44->c8p5i37"); 
                                           break;
                                            default:
                                            	System.out.println("default:c8p12i"+id);  
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
                                      
                                      switch(place) 
                                      {
                                        case 5:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,14,46,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p5i23->c10p14i46"); 
                                          break;
                                         
                                          case 37:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,14,6,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p5i37->c10p14i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c10p5i"+id);   
                                            }
                                          ;break;
                                          
                                        case 14:
                                         switch(id)
                                          {case 46:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,13,myJ3dFrame.cubi10.colors); 
                                         //System.out.println(">c10p14i46->c10p21i13"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,31,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p14i6->c10p21i31"); 
                                          break;
                                            default:
                                            	System.out.println("default:c10p14i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                          {
                                          case 13:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,12,4,myJ3dFrame.cubi10.colors);
                                         //System.out.println(">c10p21i13->c10p12i4"); 
                                          break;// 
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,12,44,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p21i21->c10p12i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c10p21i"+id);  
                                            }
                                          ;break;


                                        case 12:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,23,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p12i4->c10p5i23"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,37,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p12i44->c10p5i37"); 
                                          break;
                                            default:                                           	
                                            	System.out.println("default:c10p12i"+id);  
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
                                        
                                      switch(place) 
                                      {
  
                                        case 5:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,14,46,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p5i23->c12p14i46"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,14,6,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p5i37->c12p14i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c12p5i"+id);   
                                            }
                                          ;break;
                                          
                                         case 14:
                                         switch(id)
                                          {case 46:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,13,myJ3dFrame.cubi12.colors); 
                                         //System.out.println("c12p14i46->c12p21i13"); 
                                          break;
                                         
                                          case 6:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,31,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p14i6->c12p21i31"); 
                                          break;
                                            default:
                                            	System.out.println("default:c12p14i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                          {
                                          case 13:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,12,4,myJ3dFrame.cubi12.colors);
                                         //System.out.println(">c12p21i13->c12p12i4"); 
                                          break;// 
                                                                                  
                                          case 31:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,12,44,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p21i31->c12p12i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c12p21i"+id);  
                                            }
                                          ;break;


                                        case 12:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,23,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p12i4->c12p5i23"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,37,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p12i44->c12p5i37"); 
                                          break;
                                            default:
                                            	System.out.println("default:c12p12i"+id);  
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
                                        
                                      switch(place) 
                                      {                                       
                                        case 5:
                                          switch(id)
                                          {
                                          case 23:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,14,46,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p5i23->c14p14i46"); 
                                          break;
                                          
                                          case 37:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,14,6,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p5i37->c14p14i6"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c14p5i"+id);   
                                            }
                                          ;break;
                                          
                                          case 14:
                                         switch(id)
                                          {                                          
                                          case 46:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,13,myJ3dFrame.cubi14.colors); 
                                         //System.out.println("c14p14i46->c14p21i13"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,31,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p14i6->c14p21i31"); 
                                          break;
                                                                                  
                                            default:
                                            	System.out.println("default:c14p14i"+id);  
                                            }
                                          ;break;
                                           case 21:
                                          switch(id)
                                          {                                          
                                          case 13:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,12,4,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i13->c14p12i4"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,12,44,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i31->c14p12i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c14p21i"+id);  
                                            }
                                          ;break;


                                        case 12:
                                          switch(id)
                                          {                                           
                                          case 4:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,23,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p12i4->c14p5i23"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,37,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p12i44->c14p5i37"); 
                                          break;                                         
                                            default:
                                            	System.out.println("default:c14p12i"+id);  
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
                                       
                      
                 
                      
                        case 16: //cubi16
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi16.getPlace();
                                        int id=myJ3dFrame.cubi16.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,22,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i4->c16p6i22"); 
                                          break;// 
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,38,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i20->c16p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,6,6,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p4i36->c16p6i4"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p4i"+id);  
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,46,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i22->c16p22i46"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,14,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i38->c16p22i14"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,30,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p6i6->c16p22i30"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p6i"+id);  
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                          {
                                          case 46:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,12,myJ3dFrame.cubi16.colors);
                                         //System.out.println(">c16p22i10->c16p20i12"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,28,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i14->c16p20i28"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,44,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i30->c16p20i44"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p22i"+id);   
                                            }
                                          ;break;
                                                                                  
                                          
                                         case 20:
                                         switch(id)
                                          {case 12:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,4,myJ3dFrame.cubi16.colors); //30
                                         //System.out.println(">c16p20i12->c16p4i4"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,20,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i28->c16p4i20"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,4,36,myJ3dFrame.cubi16.colors);//14
                                         //System.out.println("c16p20i44->c16p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p20i"+id);  
                                            }
                                          ;break;
                                          
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi16BranchGroup);
                                         myJ3dFrame.cubi16BranchGroup=branchGroup;
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi16) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi16BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                             case 17: //cubi17
                                 if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi17.getPlace();
                                        int id=myJ3dFrame.cubi17.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,14,22,myJ3dFrame.cubi17.colors);
                                         //System.out.println("17p5i5->c17p14i22"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,14,14,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p5i39->c17p14i14"); 
                                          break;
                                            default:
                                            	System.out.println("default:c17p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,47,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p14i22->c17p21i47"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,29,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p14i14->c17p21i29"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p14i"+id);   
                                            }
                                          ;break;
                                          
                                         case 21:
                                         switch(id)
                                          {case 47:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,12,12,myJ3dFrame.cubi17.colors); 
                                         //System.out.println("c17p21i47->c17p12i12"); 
                                          break;
                                          
                                           case 29:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,12,20,myJ3dFrame.cubi17.colors);
                                          //System.out.println("c17p21i29->c17p12i20"); 
                                           break;
                                            default:
                                            	System.out.println("default:c17p21i"+id);  
                                            }
                                          ;break;                                        
                                          
                                         case 12:
                                          switch(id)
                                          {
                                          case 12:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,5,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p12i12->c17p5i5"); 
                                          break;// 
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,39,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p12i20->c7p5i39"); 
                                          break;
                                            default:
                                            	System.out.println("default:c17p12i"+id);  
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
                                       
                            case 18: //cubi18
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi18.getPlace();
                                        int id=myJ3dFrame.cubi18.getId();                                      
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {                                          
                                         case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,22,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i4->c18p6i22"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,38,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i20->c18p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,6,6,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p4i38->c18p6i6"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p4i"+id);  
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,46,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i22->c18p22i46"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,14,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i38->c18p22i14"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,30,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p6i6->c18p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p6i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                         switch(id)
                                          {case 46:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,12,myJ3dFrame.cubi18.colors); 
                                         //System.out.println(">c18p22i46->c18p20i12"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,28,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i14->c18p20i28"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,44,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i30->c18p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p22i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                          {
                                          case 12:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,4,myJ3dFrame.cubi18.colors);
                                         //System.out.println(">c18p20i12->c18p4i4<"); 
                                          break;// 
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,20,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i28->c18p4i20"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,4,36,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i44->c18p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p20i"+id);  
                                            }
                                          ;break;
                                          
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi18BranchGroup);
                                         myJ3dFrame.cubi18BranchGroup=branchGroup;
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi18) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi18BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 19: //cubi19
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi19.getPlace();
                                        int id=myJ3dFrame.cubi19.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                          
                                        case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,14,22,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p5i5->c19p14i22"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,14,14,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p5i39->c19p14i14"); 
                                          break;
                                            default:
                                            	System.out.println("default:c19p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,47,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p14i22->c19p21i47");
                                          break;// 
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,29,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p14i14->c19p21i29"); 
                                          break;
                                            default:
                                            	System.out.println("default:c19p14i"+id);  
                                            }
                                          ;break;
                                          
                                          case 21:
                                         switch(id)
                                          {
                                          case 47:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,12,12,myJ3dFrame.cubi19.colors); 
                                         //System.out.println("c19p21i47->c19p12i12"); 
                                          break;
                                         
                                          case 29:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,12,20,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p21i29->c19p12i20"); 
                                          break;
                                            default:
                                            	System.out.println("default:c19p21i"+id);  
                                            }
                                          ;break;
                                          
                                        case 12:
                                          switch(id)
                                          {
                                          case 12:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,5,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p12i12->c19p5i5"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,39,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p12i20->c19p5i39"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c19p12i"+id);   
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
                           case 20: //cubi20
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi20.getPlace();
                                        int id=myJ3dFrame.cubi20.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                        case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,22,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i4->c20p6i22"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,38,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i20->c20p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,6,6,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p4i36->c20p6i6"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p4i"+id);  
                                            }
                                          ;break;
                                          
                                        case 6:
                                          switch(id)
                                          {                                           
                                          case 22:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,46,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i22->c20p22i46"); 
                                          break;
                                                                                
                                          case 38:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,14,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i38->c20p22i14"); 
                                          break;
                                         
                                          case 6:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,30,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p6i6->c20p22i30"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p6i"+id);   
                                            }
                                          ;break;
                                          
                                        case 22:
                                         switch(id)
                                          {                                          
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,12,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i46->c20p20i12"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,28,myJ3dFrame.cubi20.colors); 
                                         //System.out.println("c20p22i14->c20p20i28"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,44,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i30->c20p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p22i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                          {                                 
                                          case 12:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,4,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i12->c20p4i4"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,20,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i28->c20p4i20"); 
                                          break;//
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,4,36,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i44->c20p4i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p20i"+id);  
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi20BranchGroup);
                                         myJ3dFrame.cubi20BranchGroup=branchGroup;
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi20) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi20BranchGroup); 
                                          
                                      }
                                       ;break;
                        case 21: //cubi21
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi21.getPlace();
                                        int id=myJ3dFrame.cubi21.getId();
                                                                              
                                        BranchGroup branchGroup=null;
                                      switch(place) 
                                      {
                                        case 5:
                                         switch(id)
                                          {
                                           case 5:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,14,22,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p5i5->c21p14i22"); 
                                          break;
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,14,14,myJ3dFrame.cubi21.colors); 
                                         //System.out.println("c21p5i39->c21p14i14"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c21p5i"+id);  
                                            }
                                          ;break;
                                          
                                        case 14:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,47,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p14i22->c21p21i47"); 
                                          break;                                                                                   
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,29,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p14i14->c21p21i29"); 
                                          break;
                                            default:
                                            	System.out.println("default:c21p14i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                          {
                                          case 47:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,12,12,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i47->c21p12i12<"); 
                                          break;// 
                                                                                   
                                          case 29:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,12,20,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i29->c21p12i20"); 
                                          break;
                                            default:
                                            	System.out.println("default:c21p21i"+id);  
                                            }
                                          ;break;

                                        case 12:
                                          switch(id)
                                          {
                                          case 12:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,5,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p12i12->c21p5i5"); 
                                          break;
                                        
                                          case 20:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,39,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p12i20->c21p5i39"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p12i"+id);   
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
                          case 22: //cubi22
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi22.getPlace();
                                        int id=myJ3dFrame.cubi22.getId();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 4:
                                         switch(id)
                                          {case 4:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,22,myJ3dFrame.cubi22.colors); 
                                         //System.out.println("c22p4i4->c22p6i22"); 
                                          break;
                                          
                                          case 20:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,38,myJ3dFrame.cubi22.colors);//28
                                         //System.out.println("c22p4i20->c22p6i38"); 
                                          break;
                                          
                                          case 36:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,6,6,myJ3dFrame.cubi22.colors);//14
                                         //System.out.println("c22p4i36->c22p6i6"); 
                                          break;
                                            default:
                                            	System.out.println("default:c22p4i"+id);  
                                            }
                                          ;break;
                                          
                                         case 6:
                                          switch(id)
                                          {
                                          case 22:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,30,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i22->c22p22i30"); 
                                          break;
                                          
                                          case 38:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,14,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i38->c22p22i14"); 
                                          break;
                                          
                                          case 6:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,46,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p6i6->c22p22i46"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p6i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                          {
                                          	  
                                          case 30:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,12,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i30->c22p20i12"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,44,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i14->c22p20i28"); 
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,28,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i46->c22p20i44"); 
                                          break;// 
                                         
                                            default:
                                            	System.out.println("default:c22p22i"+id);  
                                            }
                                          ;break;
                                          
                                        case 20:
                                          switch(id)
                                          {
                                          case 12:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,4,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c20p20i12->c22p4i4"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,36,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c20p20i28->c22p4i36"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,4,20,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c20p20i44->c22p4i20"); 
                                          break;
                                            default:
                                            	System.out.println("default:c22p20i"+id);  
                                            }
                                          ;break;
                                          
                                            }
                                         myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi22BranchGroup);
                                         myJ3dFrame.cubi22BranchGroup=branchGroup;
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi22) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi22BranchGroup); 
                                          
                                      }
                                       ;break;
                         case 23: //cubi23
                                   if(setB.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi23.getPlace();
                                        int id=myJ3dFrame.cubi23.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {
                                        case 5:
                                         switch(id)
                                          {case 21:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,14,38,myJ3dFrame.cubi23.colors); 
                                         //System.out.println("c23p5i21->c23p14i38"); 
                                          break;                                          
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,14,46,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p5i7->c23p14i46"); 
                                          break;
                                            default:
                                            	System.out.println("default:c23p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 14:
                                          switch(id)
                                          {
                                          case 38:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,21,15,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p14i38->c23p21i15"); 
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,21,29,myJ3dFrame.cubi23.colors);//39
                                         //System.out.println("c23p14i46->c23p21i29"); 
                                          break;
                                            default:
                                            	System.out.println("default:c23p14i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                          {
                                          case 15:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,12,44,myJ3dFrame.cubi23.colors);//22
                                         //System.out.println("c23p21i15->c23p12i44"); 
                                          break;// 
                                                                                                                             
                                          case 29:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,12,36,myJ3dFrame.cubi23.colors);//14
                                         //System.out.println("c23p21i29->c23p12i36"); 
                                          break;
                                            default:
                                            	System.out.println("default:c23p21i"+id);  
                                            }
                                          ;break;


                                        case 12:
                                          switch(id)
                                          {
                                          case 44:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,21,myJ3dFrame.cubi23.colors);
                                         //System.out.println(">c23p12i44->c23p5i21"); 
                                          break;
                                         
                                          case 36:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,7,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p12i36->c23p5i7"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c23p12i"+id);   
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
                                       
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.cubi9BranchGroup=branchGroup;
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup);
                                       }                                          
                                       break;
                                       
                                 case 11: 
                                 if(setB.contains(i))
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
                                         
                                          case 11://Drehachse
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
                                          //System.out.println("c13p25i25->c13p25i32"+id);
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
                                          //System.out.println("c15p15i7->c15p25i7");
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
                                                                                                                       
                                       myJ3dFrame.plainB.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);
                                      }
                                     ;break;
                                     
                                   case 25:                               	  
                                      if(setB.contains(i))
                                      { int place =myJ3dFrame.cubi25.getPlace();
                                        int id=myJ3dFrame.cubi25.getId();
                                       //System.out.println("c25p"+place+"i"+id);
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
                   
               
                placeArray=fillPlaceArray();
                nrArray=fillNrArray(placeArray);
                //arrayAusgabe(nrArray,placeArray);
               //System.out.println("back<--");
                 //Drehung rückgängig machen
               myJ3dFrame.BRotationInterpolator.setMinimumAngle(myJ3dFrame.Bwinkel+0f);
               myJ3dFrame.BRotationInterpolator.setMaximumAngle(myJ3dFrame.Bwinkel+(float)Math.PI/2);
               myJ3dFrame.Balpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Bwinkel=myJ3dFrame.Bwinkel+((float) Math.PI/2);
              
                f=finish();
                while(!f){ f=finish();}
                
              }
    }
    /**
     * Constructor for objects of class Rotbakk
     */
    public Rotbakk(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
         rotAchseback=new Button("b"); 
            rotAchseback.setBounds(xa,ya,b,h);
            
         rotAchseback.addActionListener(new ActionListener()
         {public void actionPerformed(ActionEvent e)
          { 
            backAction();
            }
             }); 
               
            } 
    }

    

