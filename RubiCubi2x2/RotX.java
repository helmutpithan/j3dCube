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
 * @author Helmut Pithan h.pithan(at)t-online.de
 * @version (a version number or a date)
 */
public class RotX extends Rot
{static J3dFrame myJ3dFrame;
	Button rotAchseX;
   static boolean f;
   static Set<Integer> setR=new HashSet<Integer>();
 
    Button getrotAchseX()
    { return rotAchseX;
      }
      
    static public void XAction()
   {       //von RotRight 
   	        setR.add(1);
            setR.add(5);
            setR.add(6);
            setR.add(2);
          //von Rotlefft übernommen
            setR.add(0);
            setR.add(3);
            setR.add(4);
            setR.add(7);
             ActionFrame.textArea.append("X");
            
           int[] nrArray=new int[8];
           int[] placeArray=new int[8];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {  placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                   //System.out.println("Right -->");
                    //J3dFrame.showCubisVisible();
                    
                    for (int i=0;i<8;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setR.contains(i))
                                      {
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi0BranchGroup);
                                       if(J3dFrame.showCubi0) J3dFrame.plainR.addChild(J3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setR.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi1BranchGroup);
                                       if(J3dFrame.showCubi1) J3dFrame.plainR.addChild(J3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setR.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi2BranchGroup);
                                       if(J3dFrame.showCubi2) J3dFrame.plainR.addChild(J3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setR.contains(i))
                                      { 
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi3BranchGroup);
                                       if(J3dFrame.showCubi3) J3dFrame.plainR.addChild(J3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setR.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi4BranchGroup);
                                       if(J3dFrame.showCubi4) J3dFrame.plainR.addChild(J3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setR.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi5BranchGroup);
                                       if(J3dFrame.showCubi5) J3dFrame.plainR.addChild(J3dFrame.cubi5BranchGroup);
                                     };break;
                         case 6: if(setR.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi6BranchGroup);
                                       if(J3dFrame.showCubi6) J3dFrame.plainR.addChild(J3dFrame.cubi6BranchGroup);
                                     };break;
                         case 7: if(setR.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                                       J3dFrame.plainR.removeChild(J3dFrame.cubi7BranchGroup);
                                       if(J3dFrame.showCubi7) J3dFrame.plainR.addChild(J3dFrame.cubi7BranchGroup);
                                     };break;
                        }
                //Vorbereitung -->
                
                //Hierhin
                 if(finish())
                {
                    
               J3dFrame.RRotationInterpolator.setMinimumAngle(J3dFrame.Rwinkel+0f);
               J3dFrame.RRotationInterpolator.setMaximumAngle(J3dFrame.Rwinkel-(float)Math.PI/2);
               J3dFrame.Ralpha.setStartTime(System.currentTimeMillis()+100);
               J3dFrame.Rwinkel=J3dFrame.Rwinkel-((float) Math.PI/2);
                               // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();}
                    
                } 
                
                //Nachbereitung
                for (int i=0;i<8;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                   
                       { case 0://cubi0
                                 if(setR.contains(i))
                                 { 
                                        int id=J3dFrame.cubi0.getId();
                                        int place =J3dFrame.cubi0.getPlace();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,5,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i1->c0p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,13,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i9->c0p5i13");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,21,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i17->c0p5i21");
                                          break;         
                                           default://System.out.println("default:c0p1i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,22,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i5->c0p6i22");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,6,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i13->c0p6i6");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,14,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i21->c0p6i14");
                                          break;
                                           default://System.out.println("default:c0p5i"+id);   
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,18,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i6->c0p2i18");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,2,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i14->c0p2i2");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,10,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i22->c0p2i10");
                                          break;
                                           default://System.out.println("default:c0p6i"+id);   
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,17,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i2->c0p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,1,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i10->c0p1i1");
                                          break;
                                                   
                                          case 18:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,9,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i18->c0p1i9");
                                          break;
                                           default://System.out.println("default:c0p2i"+id);   
                                            }
                                          ;break;

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
                                          
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi0BranchGroup);
                                         J3dFrame.cubi0BranchGroup=branchGroup;
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                     
                                         if(J3dFrame.showCubi0) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup);
                                         
                                         id=J3dFrame.cubi0.getId();
                                         place =J3dFrame.cubi0.getPlace();
                                         
                                        
                                    };break;
                                      
                         case 1: if(setR.contains(i))
                                    { 
                                        int place =J3dFrame.cubi1.getPlace();
                                        int id=J3dFrame.cubi1.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,5,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i1->c1p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,13,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i9->c1p5i13");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,21,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i17->c1p5i21");
                                          break;
                                           default://System.out.println("default:c1p1i"+id);   
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,22,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i5->c1p6i22");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,6,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i13->c1p6i6");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,14,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i21->c1p6i14");
                                          break;
                                           default://System.out.println("default:c1p5i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,18,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p6i6->c1p2i18");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,2,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p6i14->c1p2i2");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,10,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p6i22->c1p2i10");
                                          break;
                                           default://System.out.println("default:c1p6i"+id);   
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,17,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i2->c1p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,1,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i10->c1p1i1");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,9,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i18->c1p1i9");
                                          break;
                                           default://System.out.println("default:c1p2i"+id);   
                                            }
                                          ;break;

                                          
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
                                           
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi1BranchGroup);
                                         J3dFrame.cubi1BranchGroup=branchGroup;
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi1BranchGroup);
                                         if(J3dFrame.showCubi1) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup); 
                                      
                                    };break;
                         case 2: //cubi2
                                   if(setR.contains(i))
                                      {  
                                        int place =J3dFrame.cubi2.getPlace();
                                        int id=J3dFrame.cubi2.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,5,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i1->c2p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,13,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i9->c2p5i13");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,21,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i17->c2p5i21");
                                          break;
                                           default://System.out.println("default:c2p1i"+id);   
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,22,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i5->c2p6i22");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,6,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i13->c2p6i6");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,14,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i21->c2p6i14");
                                          break;
                                            default://System.out.println("default:c2p5i"+id);  
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,18,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i6->c2p2i18");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,2,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i14->c2p2i2");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,10,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i22->c2p6i10");
                                          break;
                                           default://System.out.println("default");   
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,17,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i2->c2p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,1,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i10->c2p1i1");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,9,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i18->c2p1i9");
                                          break;
                                           default://System.out.println("default:c2p2i"+id);   
                                            }
                                          ;break;

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
                                           
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi2BranchGroup);
                                         J3dFrame.cubi2BranchGroup=branchGroup;
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi2BranchGroup);
                                         if(J3dFrame.showCubi2) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3: if(setR.contains(i))
                                  { 
                                        int place =J3dFrame.cubi3.getPlace();
                                        int id=J3dFrame.cubi3.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,5,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i1->c3p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,13,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i9->c3p5i13");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,21,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i17->c3p5i21");
                                          break;
                                            default://System.out.println("default:c3p1i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,22,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i5->c3p6i22");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,6,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i13->c3p6i6");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,14,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i21->c3p6i14");
                                          break;
                                           default://System.out.println("default:c3p5i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,18,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p6i6->c3p2i18");
                                          break;
                                         
                                          case 14:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,2,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p6i14->c3p2i2");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,10,J3dFrame.cubi3.colors); 
                                          //System.out.println("c3p6i22->c3p2i10");
                                          break;
                                           default://System.out.println("default:c3p6i"+id);   
                                            }
                                          ;break;


                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,17,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i2->c3p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,1,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i10->c3p1i1");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,9,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i18->c3p1i9");
                                          break;
                                            default://System.out.println("default:c3p2i"+id);  
                                            }
                                          ;break;

                                          
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
                                           
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi3BranchGroup);
                                         J3dFrame.cubi3BranchGroup=branchGroup;
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi3BranchGroup);
                                         if(J3dFrame.showCubi3) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4: if(setR.contains(i)) // kann nur 0,1,2,3 sein wenn das nur kein Irrtum ist???
                                      {
                                        int place =J3dFrame.cubi4.getPlace();
                                        int id=J3dFrame.cubi4.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,5,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i1->c4p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,13,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i9->c4p5i13");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,21,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i17->c4p5i21");
                                          break;
                                            default://System.out.println("default:c4p1i"+id); 
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,22,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i5->c4p6i22");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,6,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i13->c4p6i6");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,14,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i21->c4p6i14");
                                          break;
                                           default://System.out.println("default:c4p5i"+id);   
                                            }
                                          ;break;

                                          case 6: switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,18,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i6->c4p2i18");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,2,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i14->c4p2i2");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,10,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i22->c4p2i10");
                                          break;
                                            default://System.out.println("default:c4p6i"+id);  
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,17,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i2->c4p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,1,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i110->c4p1i1");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,9,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i18->c4p1i9");
                                          break;
                                           default://System.out.println("default:c4p2i"+id);   
                                            }
                                          ;break;

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
                                           
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi4BranchGroup);
                                         J3dFrame.cubi4BranchGroup=branchGroup;
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi4BranchGroup);
                                         if(J3dFrame.showCubi4) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                         case 5: 
                                 if(setR.contains(i)) 
                                     {
                                      int place =J3dFrame.cubi5.getPlace();
                                      int id=J3dFrame.cubi5.getId();
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 1:
                                         switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,5,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i1->c5p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,13,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i9->c5p5i13");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,21,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i17->c5p5i21");
                                          break;
                                            default://System.out.println("default:c5p1i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,22,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i5->c5p6i22");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,6,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i5->c5p6i6");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,14,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i5->c5p6i14");
                                          break;
                                           default://System.out.println("default:c5p5i"+id);   
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,18,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p6i6->c5p2i18");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,2,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p6i14->c5p2i2");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,10,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p6i22->c5p2i10");
                                          break;
                                           default://System.out.println("default:c5p6i"+id);   
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,17,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p2i2->c5p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,1,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p2i10->c5p1i1");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,9,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p2i18->c5p1i9");
                                          break;
                                            default://System.out.println("default:c5p2i"+id);  
                                            }
                                          ;break;

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
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi5BranchGroup);
                                         J3dFrame.cubi5BranchGroup=branchGroup;
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(J3dFrame.showCubi5) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                         if(setR.contains(i))
                                   {
                                        int place =J3dFrame.cubi6.getPlace();
                                        int id=J3dFrame.cubi6.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 1:
                                         switch(id)
                                          {
                                          case 1:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,5,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i1->c6p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,13,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i9->c6p5i13");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,21,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i17->c6p5i21");
                                          break;
                                            default://System.out.println("default:c6p1i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,22,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p5i5->c6p6i22");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,6,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p5i13->c6p6i6");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,14,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p5i21->c6p6i14");
                                          break;
                                            default://System.out.println("default:c6p5i"+id);  
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,18,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i6->c6p2i18");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,2,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i14->c6p2i2");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,10,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i22->c6p2i10");
                                          break;
                                            default://System.out.println("default:c6p6i"+id);  
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,17,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i2->c6p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,1,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i10->c6p1i1");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,9,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i18->c6p1i9");
                                          break;
                                            default://System.out.println("default:c6p2i"+id);  
                                            }
                                          ;break;

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
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi6BranchGroup);
                                         J3dFrame.cubi6BranchGroup=branchGroup;
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi6) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: if(setR.contains(i))
                                     { 
                                        int place =J3dFrame.cubi7.getPlace();
                                        int id=J3dFrame.cubi7.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 1:
                                         switch(id)
                                          {
                                          case 1:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,5,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i1->c7p5i5");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,21,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i9->c7p5i21 v");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,13,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i17->c7p5i13 v");
                                          break;
                                           default://System.out.println("default:c7p1i"+id);   
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,14,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i5->c7p6i14");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,22,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i13->c7p6i22");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,6,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i21->c7p6i6");
                                          break;//Fehler 14 ersetzt durch 6
                                           default://System.out.println("default:c7p5i"+id);   
                                            }
                                          ;break;

                                          case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,18,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i6->c7p2i18");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,10,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i14->c7p2i10");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,2,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i22->c7p2i2");
                                          break;
                                            default://System.out.println("default:c7p6i"+id);  
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,17,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i2->c7p1i17");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,1,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i10->c7p1i1");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,9,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i18->c7p1i9");
                                          break;
                                           default://System.out.println("default:c7p2i"+id);   
                                            }
                                          ;break;

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
                                         J3dFrame.plainR.removeChild(J3dFrame.cubi7BranchGroup);
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

               J3dFrame.RRotationInterpolator.setMinimumAngle(J3dFrame.Rwinkel+0f);
               J3dFrame.RRotationInterpolator.setMaximumAngle(J3dFrame.Rwinkel+(float)Math.PI/2);
               J3dFrame.Ralpha.setStartTime(System.currentTimeMillis()+100);
               J3dFrame.Rwinkel=J3dFrame.Rwinkel+((float) Math.PI/2);
                f=finish();
                while(!f){ f=finish();}
                //System.out.println("Right <--");
                
              }
    }
    /**
     * Constructor for objects of class RotRight
     */
    public RotX(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
    	rotAchseX=new Button("X"); // rotAchseUp-->
            rotAchseX.setBounds(xa,ya,b,h);
            
            // --->von RotLeft uebernommen
            rotAchseX.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          { 
           XAction();
            }
             }); 
               
            } // rotAchseRight <-- 
            
       
    }