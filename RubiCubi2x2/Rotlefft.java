import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
/**
 * Write a description of class Rotlefft here.
 *
 * @author Helmut Pithan h.pithan(at)t-online.de
 * @version (a version number or a date)
 */
public class Rotlefft extends Rot
{  static J3dFrame myJ3dFrame;
	Button rotAchseleft;
   static boolean f;
   static Set<Integer> setL=new HashSet<Integer>();
   
      Button getrotAchseleft()
    { return rotAchseleft;
      }
    static public void leftAction()
  {         setL.add(0);
            setL.add(3);
            setL.add(4);
            setL.add(7);
       ActionFrame.textArea.append("l");
      int[] nrArray=new int[8];
           int[] placeArray=new int[8];                    
               f=finish();
                while(!f){ f=finish();}
                if(finish())
                {  placeArray=fillPlaceArray();
                   nrArray=fillNrArray(placeArray);
                   //arrayAusgabe(nrArray,placeArray);
                  //System.out.println("left -->");   
                 //J3dFrame.showCubisVisible();       
                 
                    
                   
                    for (int i=0;i<8;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setL.contains(i))
                                      {
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi0BranchGroup);
                                       if(J3dFrame.showCubi0) J3dFrame.plainL.addChild(J3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setL.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi1BranchGroup);
                                       if(J3dFrame.showCubi1) J3dFrame.plainL.addChild(J3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setL.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi2BranchGroup);
                                       if(J3dFrame.showCubi2) J3dFrame.plainL.addChild(J3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setL.contains(i))
                                      { 
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi3BranchGroup);
                                       if(J3dFrame.showCubi3) J3dFrame.plainL.addChild(J3dFrame.cubi3BranchGroup);
                                      };break;
                         case 4: if(setL.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi4BranchGroup);
                                       if(J3dFrame.showCubi4) J3dFrame.plainL.addChild(J3dFrame.cubi4BranchGroup);
                                    };break;
                         case 5: if(setL.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi5BranchGroup);
                                       if(J3dFrame.showCubi5) J3dFrame.plainL.addChild(J3dFrame.cubi5BranchGroup);
                                    };break;
                         case 6: if(setL.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi6BranchGroup);
                                       if(J3dFrame.showCubi6) J3dFrame.plainL.addChild(J3dFrame.cubi6BranchGroup);
                                        };break;
                         case 7: if(setL.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                                       J3dFrame.plainL.removeChild(J3dFrame.cubi7BranchGroup);
                                       if(J3dFrame.showCubi7) J3dFrame.plainL.addChild(J3dFrame.cubi7BranchGroup);
                                    };break;
                        }
                //Vorbereitung -->
            
                 if(finish())
                {
                    
               J3dFrame.lRotationInterpolator.setMinimumAngle(J3dFrame.Lwinkel+0f);
               J3dFrame.lRotationInterpolator.setMaximumAngle(J3dFrame.Lwinkel+(float)Math.PI/2);
               J3dFrame.lalpha.setStartTime(System.currentTimeMillis()+0);
               J3dFrame.Lwinkel=J3dFrame.Lwinkel+((float) Math.PI/2);
                               // Warten auf Ende der Bewegung
                boolean f=finish();
                while(!f){ f=finish();}
                
                } 
                
                //Nachbereitung
                for (int i=0;i<8;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                   
                       { case 0:  //cubi0
                                 if(setL.contains(i))
                                 { 


                                        int id=J3dFrame.cubi0.getId();
                                        int place =J3dFrame.cubi0.getPlace();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,12,J3dFrame.cubi0.colors);
                                             //System.out.println("c0p0i0->c0p4i12");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,20,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p0i8->c0p4i20");
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,4,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p0i16->c0p4i4");
                                             break;
                                           default://System.out.println("default:c0p0i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,15,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i4->c0p7i15");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,23,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i12->c0p7i23");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,7,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i20->c0p7i7");
                                             break;
                                           default://System.out.println("default:c0p4i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,3,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i7->c0p3i3");
                                             break;//3
                                          
                                          case 15:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,11,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i15->c0p3i11");
                                             break;//19
                                          
                                          case 23:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,19,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i23->c0p3i19");
                                             break;//11   
                                          default://System.out.println("default:c0p7i"+id);   
                                        }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,8,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i3->c0p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,16,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i11->c0p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,0,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i19->c0p0i0");
                                             break;
                                            default://System.out.println("default:c0p3i"+id);  
                                            }
                                          ;break;

                                          }
                                          
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi0BranchGroup);
                                         J3dFrame.cubi0BranchGroup=branchGroup;
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi0BranchGroup);
                                         if(J3dFrame.showCubi0) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup); 
                                         id=J3dFrame.cubi0.getId();
                                         place =J3dFrame.cubi0.getPlace();
                                         
                                        
                                        
                                    };break;
                                      
                         case 1: if(setL.contains(i))
                                    { 
                                     
                                        int place =J3dFrame.cubi1.getPlace();
                                        int id=J3dFrame.cubi1.getId();
                                        

                                         
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,12,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i0->c1p4i12");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,20,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i8->c1p4i20");
                                             break;//
                                          
                                          case 16:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,4,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i16->c1p4i4");
                                             break;
                                           default://System.out.println("default:c1p0i"+id);  
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,15,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i4->c1p7i15");
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,23,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i12->c1p7i23");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,7,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i20->c1p7i7");
                                             break;
                                            default://System.out.println("default:c1p4i"+id);  
                                            }
                                          ;break;

                                          case 7: 
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,3,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i7->c1p3i3");
                                             break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,11,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i15->c1p3i11");
                                             break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,19,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i23->c1p3i19");
                                             break; 
                                           default://System.out.println("default:c1p7i"+id);
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,8,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i3->c1p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,16,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i11->c1p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,0,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i19->c1p0i0");
                                             break;
                                           default://System.out.println("default:c1p3i"+id);   
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi1BranchGroup);
                                         J3dFrame.cubi1BranchGroup=branchGroup;
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi1) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup);
                                      
                                    };break;
                         case 2: if(setL.contains(i))
                                      {  
                                        int place =J3dFrame.cubi2.getPlace();
                                        int id=J3dFrame.cubi2.getId();
                                        


                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0: 
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,12,J3dFrame.cubi2.colors);
                                             //System.out.println("c2p0i0->c2p4i12");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,20,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i0->c2p4i20");
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,4,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i0->c2p4i4");
                                             break;
                                            default://System.out.println("default:c2p0i"+id);  
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,15,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i4->c2p7i15");
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,23,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i12->c2p7i23");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,7,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i20->c2p7i7");
                                             break; 
                                          default://System.out.println("default:c2p4i"+id);
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,3,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i7->c2p3i3");
                                             break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,11,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i15->c2p3i11");
                                             break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,19,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i23->c2p3i19");
                                             break;
                                           default://System.out.println("default:c2p7i"+id);
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,8,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i3->c2p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,16,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i11->c2p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,0,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i19->c2p0i0");
                                             break;
                                            default://System.out.println("default:c2p3i"+id);  
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi2BranchGroup);
                                         J3dFrame.cubi2BranchGroup=branchGroup;
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi2) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup);
                                         
                                         }
                                         ;break;
                         case 3: if(setL.contains(i))
                                  { 
                                        int place =J3dFrame.cubi3.getPlace();
                                        int id=J3dFrame.cubi3.getId();
                                        

                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,12,J3dFrame.cubi3.colors);
                                             //System.out.println("c3p0i0->c3p4i12");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,20,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i8->c3p4i20");
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,4,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i16->c3p4i4");
                                             break;
                                           default://System.out.println("default:c3p0i"+id);
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,15,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i4->c3p7i15");
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,23,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i12->c3p7i23");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,7,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i20->c3p7i7");
                                             break;//
                                            default://System.out.println("default:c3p4i"+id); 
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,3,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i7->c3p3i3");
                                             break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,11,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i15->c3p3i11");
                                             break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,19,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i23->c3p3i19");
                                             break;
                                           default://System.out.println("default:c3p7i"+id);
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,8,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i3->c3p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,16,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i11->c3p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,0,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i19->c3p0i0");
                                             break;
                                           default://System.out.println("default:c3p3i"+id);  
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi3BranchGroup);
                                         J3dFrame.cubi3BranchGroup=branchGroup;
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi3) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup);
                                      
                                    }
                                        ;break;
                         case 4: //cubi4
                                if(setL.contains(i)) 
                                      {
                                        int place =J3dFrame.cubi4.getPlace();
                                        int id=J3dFrame.cubi4.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,12,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i0->c4p4i12");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,20,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i8->c4p4i20");
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,4,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i16->c4p4i4");
                                             break;
                                           default://System.out.println("default:c4p0i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,15,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i4->c4p7i15");
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,23,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i4->c4p7i23");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,7,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i4->c4p7i7");
                                             break;
                                            default://System.out.println("default:c4p4i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,3,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i7->c4p3i3");
                                             break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,11,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i15->c4p3i11");
                                             break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,19,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i23->c4p3i19");
                                             break;
                                           default://System.out.println("default:c4p7i"+id);
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,8,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i3->c4p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,16,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i11->c4p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,0,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i19->c4p0i0");
                                             break;
                                           default://System.out.println("default:c4p3i"+id);   
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi4BranchGroup);
                                         J3dFrame.cubi4BranchGroup=branchGroup;
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi4) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi4BranchGroup);
                                        }
                                         ;break;
                         case 5: //cubi5
                         if(setL.contains(i)) // kann nur 0,1,2,3 sein
                                     {
                                      int place =J3dFrame.cubi5.getPlace();
                                      int id=J3dFrame.cubi5.getId();
                                      

                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,12,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p0i0->c5p4i12");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,20,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p8i8->c5p4i20");
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,4,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p16i16->c5p4i4");
                                             break;
                                           default://System.out.println("default:c5p0i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,15,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i4->c5p7i15");
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,23,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i12->c5p7i23");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,7,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i20->c5p7i7");
                                             break;
                                            default://System.out.println("default:c5p4i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,3,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p7i7->c5p3i3");
                                             break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,11,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p7i15->c5p3i11");
                                             break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,19,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p7i23->c5p3i19");
                                             break;
                                           default://System.out.println("default:c5p7i"+id);
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,8,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p3i3->c5p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,16,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p3i11->c5p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,0,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p3i19->c5p0i0");
                                             break;
                                           default://System.out.println("default:c5p3i"+id);   
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi5BranchGroup);
                                         J3dFrame.cubi5BranchGroup=branchGroup;
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi5) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                         if(setL.contains(i))
                                   {
                                       //System.out.println("Nachbereitung case 6");
                                        int place =J3dFrame.cubi6.getPlace();
                                        int id=J3dFrame.cubi6.getId();
                                        
                                        

                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,12,J3dFrame.cubi6.colors);
                                           //System.out.println("c6p0i0->c6p4i12");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,20,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p0i8->c6p4i20");
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,4,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p0i16->c6p4i4");
                                             break;
                                           default://System.out.println("default:c6p0i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,15,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i4->c6p7i15");
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,23,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i12->c6p7i23");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,7,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i20->c6p7i7");
                                             break;
                                           default://System.out.println("default:c6p4i"+id);   
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,3,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p7i7->c6p3i3");
                                             break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,11,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p7i15->c6p3i11");
                                             break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,19,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p7i23->c6p3i19");
                                             break; 
                                           default://System.out.println("default:c6p7i"+id);
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,8,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i3->c6p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,16,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i11->c6p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,0,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i19->c6p0i0");
                                             break;
                                           default://System.out.println("default:c6p3i"+id);   
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi6BranchGroup);
                                         J3dFrame.cubi6BranchGroup=branchGroup;
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi6) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup);
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                               if(setL.contains(i))
                                     { 
                                        int place =J3dFrame.cubi7.getPlace();
                                        int id=J3dFrame.cubi7.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                        switch(place) {
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,20,J3dFrame.cubi7.colors);
                                           //System.out.println("c7p0i0->c7p4i20");
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,12,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p0i8->c7p4i12");
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,4,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p0i16->c7p4i4");
                                             break;
                                           default://System.out.println("default:c7p0i"+id);   
                                            }
                                          ;break;


                                          case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,23,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i4->c7p7i23");
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,7,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i12->c7p7i7");
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,15,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i20->c7p7i15");
                                             break;
                                            default://System.out.println("default:c7p4i"+id);  
                                            }
                                          ;break;

                                          case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,3,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i7->c7p3i3");
                                             break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,19,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i15->c7p3i19");
                                             break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,11,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i23->c7p3i11");
                                             break;
                                           default://System.out.println("default:c7p7i"+id);
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,8,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i3->c7p0i8");
                                             break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,16,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i11->c7p0i16");
                                             break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,0,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i19->c7p0i0");
                                             break;
                                            default://System.out.println("default:c7p3i"+id); 
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainL.removeChild(J3dFrame.cubi7BranchGroup);
                                         J3dFrame.cubi7BranchGroup=branchGroup;
                                         J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi7) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi7BranchGroup);
                                          
                                      }
                                       ;break;
                        
                                    } 
                
                    
                }
                f=finish();
                while(!f){ f=finish();
                    ////System.out.println(f);
                }
                   placeArray=fillPlaceArray();
                   nrArray=fillNrArray(placeArray);
                   //arrayAusgabe(nrArray,placeArray);
                 //Drehung rückgängig machen
                 
               J3dFrame.LRotationInterpolator.setMinimumAngle(J3dFrame.Lwinkel+0f);
               J3dFrame.LRotationInterpolator.setMaximumAngle(J3dFrame.Lwinkel-(float)Math.PI/2);
               J3dFrame.Lalpha.setStartTime(System.currentTimeMillis()+100);
               J3dFrame.Lwinkel=J3dFrame.Lwinkel-((float) Math.PI/2);
                f=finish();
                while(!f){ f=finish();}
               //System.out.println("left <--");
    
    }
    /**
     * Constructor for objects of class Rotlefft
     */
    public Rotlefft(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
    	rotAchseleft=new Button("l");
      rotAchseleft.setBounds(xa,ya,b,h);
      
      rotAchseleft.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          { 
           leftAction();
                }
             }); 
               
            } // rotAchseleft <-- 
      
    }

    

