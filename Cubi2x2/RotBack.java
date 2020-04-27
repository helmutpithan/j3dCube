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
 * @author Helmut Pithan h.pithan(at)t-online.de
 * @version (a version number or a date)
 */
public class RotBack extends Rot
{ static J3dFrame myJ3dFrame;
	Button rotAchseBack;
  static boolean f; 
  static Set<Integer> setB=new HashSet<Integer>();
  
    Button getrotAchseBack()
    { return rotAchseBack;
      }
      
    static public void BackAction()
    {       setB.add(2);
            setB.add(3);
            setB.add(6);
            setB.add(7);
             ActionFrame.textArea.append("B");
        int[] nrArray=new int[8];
           int[] placeArray=new int[8];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {  placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                    //System.out.println("Back-->");
                   
                    //J3dFrame.showCubisVisible();
                    
                    for (int i=0;i<8;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setB.contains(i))
                                      {
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi0BranchGroup);
                                       if(J3dFrame.showCubi0) J3dFrame.plainB.addChild(J3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setB.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi1BranchGroup);
                                       if(J3dFrame.showCubi1) J3dFrame.plainB.addChild(J3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setB.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi2BranchGroup);
                                       if(J3dFrame.showCubi2) J3dFrame.plainB.addChild(J3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setB.contains(i))
                                      { 
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi3BranchGroup);
                                       if(J3dFrame.showCubi3) J3dFrame.plainB.addChild(J3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setB.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi4BranchGroup);
                                       if(J3dFrame.showCubi4) J3dFrame.plainB.addChild(J3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setB.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi5BranchGroup);
                                       if(J3dFrame.showCubi5) J3dFrame.plainB.addChild(J3dFrame.cubi5BranchGroup);
                                    };break;
                         case 6: if(setB.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi6BranchGroup);
                                       if(J3dFrame.showCubi6) J3dFrame.plainB.addChild(J3dFrame.cubi6BranchGroup);
                                    };break;
                         case 7: if(setB.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                                       J3dFrame.plainB.removeChild(J3dFrame.cubi7BranchGroup);
                                       if(J3dFrame.showCubi7) J3dFrame.plainB.addChild(J3dFrame.cubi7BranchGroup);
                                    };break;
                        }
                //Vorbereitung -->
               
                 if(finish())
                {
                    
               J3dFrame.BRotationInterpolator.setMinimumAngle(J3dFrame.Bwinkel+0f);
               J3dFrame.BRotationInterpolator.setMaximumAngle(J3dFrame.Bwinkel+(float)Math.PI/2);
               J3dFrame.Balpha.setStartTime(System.currentTimeMillis()+100);
               J3dFrame.Bwinkel=J3dFrame.Bwinkel+((float) Math.PI/2);
                               // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();}
                
                } 
                
                //Nachbereitung
                for (int i=0;i<8;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       { case 0://cubi0
                                 if(setB.contains(i))
                                 { 
                                        
                                        int id=J3dFrame.cubi0.getId();
                                        int place =J3dFrame.cubi0.getPlace();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,6,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i2->c0p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,14,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i10->c0p6i14"); 
                                          break;
                                                   
                                          case 18:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,22,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i18->c0p6i22"); 
                                          break;
                                          default:  //System.out.println("c0p2i"+id);  
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,18,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i3->c0p6i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,2,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i11->c0p6i2"); 
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,10,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i19->c0p6i10"); 
                                          break;
                                           default:  //System.out.println("c0p3i"+id);  
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,23,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i6->c0p7i23"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,7,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i14->c0p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,15,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i22->c0p7i15"); 
                                          break;
                                          default:  //System.out.println("c0p6i"+id);
                                             
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,19,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i7->c0p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,3,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i15->c0p3i3"); 
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,11,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i23->c0p3i11"); 
                                          break;
                                          default://System.out.println("c0p7i"+id);
                                            }
                                          ;break;

                                          }
                                          
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi0BranchGroup);
                                         J3dFrame.cubi0BranchGroup=branchGroup;
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                     
                                         if(J3dFrame.showCubi0) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup); 
                                         
                                        
                                    };break;
                                      
                         case 1: //cubi1
                                 if(setB.contains(i))
                                    { 
                                        int place =J3dFrame.cubi1.getPlace();
                                        int id=J3dFrame.cubi1.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 2:
                                         switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,6,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i2->c1p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,14,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i10->c1p6i14"); 
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,22,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i18->c1p6i22"); 
                                          break;
                                          default:  //System.out.println("c1p2i"+id);
                                          
                                            }
                                          ;break;
 
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,18,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i3->c1p2i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,2,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i11->c1p2i2"); 
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,10,J3dFrame.cubi1.colors); 
                                          //System.out.println("c1p3i19->c1p2i10");
                                          break;
                                          default:  //System.out.println("c1p3i"+id);
                                             
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,23,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p6i6->c1p7i23"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,7,J3dFrame.cubi1.colors); 
                                          //System.out.println("c1p6i14->c1p7i7");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,15,J3dFrame.cubi1.colors); 
                                          //System.out.println("c1p6i22->c1p7i15");
                                          break;
                                          default:  //System.out.println("c1p6i"+id);
                                             
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,19,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i7->c1p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,3,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i15->c1p3i3");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,11,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i23->c1p3i11");
                                          break;
                                          default:  //System.out.println("c1p7i"+id);
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi1BranchGroup);
                                         J3dFrame.cubi1BranchGroup=branchGroup;
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi1BranchGroup);
                                         if(J3dFrame.showCubi1) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup); 
                                      
                                    };break;
                         case 2: if(setB.contains(i))
                                      {  
                                        int place =J3dFrame.cubi2.getPlace();
                                        int id=J3dFrame.cubi2.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 2:
                                         switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,6,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i2->c2p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,14,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i10->c2p6i14"); 
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,22,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i18->c2p6i22"); 
                                          break;
                                          default: //System.out.println("c2p2i"+id);
                                             
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,18,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i3->c2p2i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,2,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i11->c2p2i2"); 
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,10,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i19->c2p2i10"); 
                                          break;
                                          default: //System.out.println("c2p3i"+id);
                                            
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,23,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i6->c2p7i23"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,7,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i14->c2p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,15,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i22->c2p7i15"); 
                                          break;
                                          default: //System.out.println("c2p6i"+id);
                                             
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,19,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i7->c2p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,3,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i15->c2p3i3"); 
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,11,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i23->c2p3i11"); 
                                          break;
                                          default: //System.out.println("c2p7i"+id);
                                            }
                                          ;break;


                                          }
                                           
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi2BranchGroup);
                                         J3dFrame.cubi2BranchGroup=branchGroup;
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi2BranchGroup);
                                         if(J3dFrame.showCubi2) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3: //cubi3
                                if(setB.contains(i))
                                  { 
                                        int place =J3dFrame.cubi3.getPlace();
                                        int id=J3dFrame.cubi3.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 2:
                                         switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,6,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i2->c3p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,14,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i10->c3p6i14"); 
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,22,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i18->c3p6i22"); 
                                          break;
                                            default: //System.out.println("c3p2i"+id); 
                                            }
                                          ;break;


                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,18,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i3->c3p2i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,2,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i11->c3p2i2"); 
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,10,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i19->c3p2i10"); 
                                          break;
                                          default: //System.out.println("c3p3i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,23,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p6i6->c3p7i23"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,7,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p6i14->c3p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,15,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p6i22->c3p7i15"); 
                                          break;
                                           default: //System.out.println("c3p6i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,19,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i7->c3p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,3,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i15->c3p3i3"); 
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,11,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i23->c3p3i3"); 
                                          break;
                                          default: //System.out.println("c3p7i"+id);
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi3BranchGroup);
                                         J3dFrame.cubi3BranchGroup=branchGroup;
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi3BranchGroup);
                                         if(J3dFrame.showCubi3) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4: //cubi3
                                 if(setB.contains(i)) 
                                      {
                                        
                                        int place =J3dFrame.cubi4.getPlace();
                                        int id=J3dFrame.cubi4.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 2:
                                         switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,6,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i2->c4p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,14,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i10->c4p6i14"); 
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,22,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i18->c4p6i22"); 
                                          break;
                                           default: //System.out.println("c4p2i"+id);  
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,18,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i3->c4p2i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,2,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i11->c4p2i2"); 
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,10,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i19->c4p2i10"); 
                                          break;
                                          default: //System.out.println("c4p3i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,23,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i6->c4p7i23"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,7,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i14->c4p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,15,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i22->c4p7i15"); 
                                          break;
                                           default: //System.out.println("c4p6i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,19,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i7->c4p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,3,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i15->c4p3i3"); 
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,11,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i23->c4p3i11"); 
                                          break; 
                                          default: //System.out.println("c4p7i"+id);
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi4BranchGroup);
                                         J3dFrame.cubi4BranchGroup=branchGroup;
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi4BranchGroup);
                                         if(J3dFrame.showCubi4) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                         case 5: if(setB.contains(i)) // kann nur 0,1,2,3 sein
                                     {
                                      int place =J3dFrame.cubi5.getPlace();
                                      int id=J3dFrame.cubi5.getId();
                                      
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 2:
                                         switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,6,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p2i2->c5p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,14,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p2i10->c5p6i14"); 
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,22,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p2i18->c5p6i22"); 
                                          break;
                                           default: //System.out.println("c5p2i"+id);  
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,18,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p3i3->c5p2i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,2,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p3i11->c5p2i2");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,10,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p3i19->c5p2i10");
                                          break;
                                           default: //System.out.println("c5p3i"+id);  
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,23,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p6i6->c5p7i23"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,7,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p6i14->c5p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,15,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p6i22->c5p7i15"); 
                                          break;
                                           default: //System.out.println("c5p6i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,19,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p7i7->c5p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,3,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p7i15->c5p3i3"); 
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,11,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p7i23->c5p3i11"); 
                                          break;
                                          default: //System.out.println("c5p7i"+id);
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi5BranchGroup);
                                         J3dFrame.cubi5BranchGroup=branchGroup;
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(J3dFrame.showCubi5) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                                if(setB.contains(i))
                                   {
                                        int place =J3dFrame.cubi6.getPlace();
                                        int id=J3dFrame.cubi6.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 2:
                                         switch(id)
                                          {
                                          case 2:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,6,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i2->c6p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,14,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i10->c6p6i14"); 
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,22,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i18->c6p6i22"); 
                                          break;
                                           default: //System.out.println("c6p2i"+id);  
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,18,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i3->c6p2i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,2,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i11->c6p2i2"); 
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,10,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i19->c6p2i10"); 
                                          break;
                                           default: //System.out.println("c6p3i"+id);  
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,23,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i6->c6p7i23"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,7,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i14->c6p7i7"); 
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,15,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i22->c6p7i15"); 
                                          break;
                                            default: //System.out.println("c6p6i"+id); 
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,19,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p7i7->c6p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,3,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p7i15->c6p3i3");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,11,J3dFrame.cubi6.colors); 
                                          //System.out.println("c6p7i23->c6p3i11");
                                          break; 
                                          default: //System.out.println("c6p7i"+id);
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi6BranchGroup);
                                         J3dFrame.cubi6BranchGroup=branchGroup;
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi6) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                                 if(setB.contains(i))
                                     { 
                                        int place =J3dFrame.cubi7.getPlace();
                                        int id=J3dFrame.cubi7.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 2:
                                         switch(id)
                                          {
                                          case 2:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,6,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i2->c7p6i6"); 
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,22,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i10->c7p6i22"); 
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,14,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i18->c7p6i14"); 
                                          break;
                                          default: //System.out.println("c7p2i"+id);
                                             
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,18,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i3->c7p2i18"); 
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,2,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i11->c7p2i2"); 
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,10,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i19->c7p2i10"); 
                                          break;
                                          default: //System.out.println("c7p3i"+id);
                                             
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,15,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i6->c7p7i15"); 
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,23,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i14->c7p7i23"); 
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,7,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i22->c7p7i7"); 
                                          break;
                                          default: //System.out.println("c7p6i"+id);
                                             
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,19,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i7->c7p3i19"); 
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,11,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i15->c7p3i11"); 
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,3,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i23->c7p3i3"); 
                                          break;
                                          default: //System.out.println("c7p7i"+id);
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainB.removeChild(J3dFrame.cubi7BranchGroup);
                                         J3dFrame.cubi7BranchGroup=branchGroup;
                                         J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi7) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                        
                                    } 
                
                f=finish();
                while(!f){ f=finish();}
               
                placeArray=fillPlaceArray();
                nrArray=fillNrArray(placeArray);
                //arrayAusgabe(nrArray,placeArray);
                 //Drehung rückgängig machen
               J3dFrame.BRotationInterpolator.setMinimumAngle(J3dFrame.Bwinkel+0f);
               J3dFrame.BRotationInterpolator.setMaximumAngle(J3dFrame.Bwinkel-(float)Math.PI/2);
               J3dFrame.Balpha.setStartTime(System.currentTimeMillis()+100);
               J3dFrame.Bwinkel=J3dFrame.Bwinkel-((float) Math.PI/2);
                f=finish();
                while(!f){ f=finish();}
                //System.out.println("Back<--");
              }
    }
    /**
     * Constructor for objects of class RotBack
     */
    public RotBack(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
        rotAchseBack=new Button("B"); // rotAchseUp-->
            rotAchseBack.setBounds(xa,ya,b,h);
            
         rotAchseBack.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          {
           BackAction();
            }
             }); 
               
            }  
          
    }


