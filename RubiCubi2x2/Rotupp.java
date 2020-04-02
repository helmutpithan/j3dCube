import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
/**
 * Write a description of class RotUp here.
 *
 * @author Helmut Pithan h.pithan(at)t-online.de
 * @version (a version number or a date)
 */
public class Rotupp extends Rot
{ static J3dFrame myJ3dFrame;
	Button rotAchseup;
    static boolean f;
  static Set<Integer> setU=new HashSet<Integer>();
  
    Button getrotAchseup()
    { return rotAchseup;
      }
    static public void upAction()
    {   setU.add(4);
            setU.add(5);
            setU.add(6);
            setU.add(7);
             ActionFrame.textArea.append("u");
         int[] nrArray=new int[8];
                int[] placeArray=new int[8]; 
                 f=finish();
                while(!f){ f=finish();}
                
                if(finish())
                {   placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                    
                   //J3dFrame.showCubisVisible();
                //System.out.println("up -->"); 
                    for (int i=0;i<8;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setU.contains(i))//hier benötige ich die Platznummer
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi0BranchGroup);
                                       if(J3dFrame.showCubi0) J3dFrame.plainU.addChild(J3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setU.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi1BranchGroup);
                                       if(J3dFrame.showCubi1) J3dFrame.plainU.addChild(J3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setU.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi2BranchGroup);
                                       if(J3dFrame.showCubi2) J3dFrame.plainU.addChild(J3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setU.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi3BranchGroup);
                                       if(J3dFrame.showCubi3) J3dFrame.plainU.addChild(J3dFrame.cubi3BranchGroup);
                                    };break;
                         case 4: if(setU.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi4BranchGroup);
                                       if(J3dFrame.showCubi4) J3dFrame.plainU.addChild(J3dFrame.cubi4BranchGroup);
                                    };break;
                         case 5: if(setU.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi5BranchGroup);
                                       if(J3dFrame.showCubi5) J3dFrame.plainU.addChild(J3dFrame.cubi5BranchGroup);
                                    };break;
                         case 6: if(setU.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi6BranchGroup);
                                       if(J3dFrame.showCubi6) J3dFrame.plainU.addChild(J3dFrame.cubi6BranchGroup);
                                    };break;
                         case 7: if(setU.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                                       J3dFrame.plainU.removeChild(J3dFrame.cubi7BranchGroup);
                                       if(J3dFrame.showCubi7) J3dFrame.plainU.addChild(J3dFrame.cubi7BranchGroup);
                                    };break;
                        }
                //Vorbereitung <--
                
                J3dFrame.URotationInterpolator.setMinimumAngle(J3dFrame.Uwinkel+0f);
                J3dFrame.URotationInterpolator.setMaximumAngle(J3dFrame.Uwinkel+(float)Math.PI/2);
                J3dFrame.Ualpha.setStartTime(System.currentTimeMillis()+100);
                J3dFrame.Uwinkel=J3dFrame.Uwinkel+((float) Math.PI/2);
                ////System.out.println("Up+Uwinkel"+J3dFrame.Uwinkel);
                
                // Warten auf Ende der Bewegung
                //booelean f
                f=finish();
                while(!f){ f=finish();
                    ////System.out.println(f);
                }
                
               
               
                
                for (int i=0;i<8;i++)
                    switch(nrArray[i])
                       { case 0://Cubi0
                                 if(setU.contains(i))
                                 { 
                                        int place =J3dFrame.cubi0.getPlace();
                                        int id=J3dFrame.cubi0.getId();
                                        
                                       
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,5,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i4->c0p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,13,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i12->c0p5i13");
                                          break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,21,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i20->c0p5i21");
                                          break;
                                            default://System.out.println("default:c0p4i"+id);
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,6,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i5->c0p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,14,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i13->c0p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,6,22,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i21->c0p6i22");
                                          break;
                                            default://System.out.println("default:c0p5i"+id); 
                                            }
                                          ;break;

                                          

                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,7,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i6->c0p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,15,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i14->c0p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,7,23,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p6i22->c0p7i23");
                                          break;
                                           default://System.out.println("default:c0p6i"+id);   
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,4,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i7->c0p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,12,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i15->c0p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,20,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p7i23->c0p4i20");
                                          break;
                                           default://System.out.println("default:c0p7i"+id);
                                            }
                                          ;break;


                                          }
                                           
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi0BranchGroup);
                                         J3dFrame.cubi0BranchGroup=branchGroup;
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         if(J3dFrame.showCubi0) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup); 
                                      
                                    };break;
                                      
                         case 1: if(setU.contains(i))
                                    { 
                                        int place =J3dFrame.cubi1.getPlace();
                                        int id=J3dFrame.cubi1.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 4:
                                         switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,5,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i4->c1p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,13,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i12->c1p5i13");
                                          break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,21,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i20->c1p5i21");
                                          break;
                                           default://System.out.println("default:c1p4i"+id);   
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,6,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i5->c1p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,14,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i13->c1p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,6,22,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i21->c1p6i21");
                                          break;
                                          default://System.out.println("default:c1p5i"+id);   
                                            }
                                          ;break;

                                          


                                          case 6:
                                           switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,7,J3dFrame.cubi1.colors); 
                                          //System.out.println("c1p6i6->c1p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,15,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p6i14->c1p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,7,23,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p6i22->c1p7i23");
                                          break;
                                            default://System.out.println("default:c1p6i"+id);  
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,4,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i7->c1p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,12,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i15->c1p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,20,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p7i23->c1p4i20");
                                          break;   
                                          default://System.out.println("default:c1p7i"+id);  
                                        }
                                          ;break;


                                          }
                                           
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi1BranchGroup);
                                         J3dFrame.cubi1BranchGroup=branchGroup;
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         if(J3dFrame.showCubi1) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup);   
                                      
                                    };break;
                         case 2: if(setU.contains(i))
                                      {  
                                        int place =J3dFrame.cubi2.getPlace();
                                        int id=J3dFrame.cubi2.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,5,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i4->c2p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,13,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i12->c2p5i13");
                                          break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,21,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i20->c2p5i21");
                                          break;//
                                            default://System.out.println("default:c2p4i"+id);  
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,6,J3dFrame.cubi2.colors); 
                                          //System.out.println("c2p5i5->c2p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,14,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i13->c2p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,6,22,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i21->c2p6i22");
                                          break;
                                           default://System.out.println("default:c2p5i"+id);   
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,7,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i6->c2p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,15,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i14->c2p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,7,23,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p6i22->c2p7i23");
                                          break;
                                           default://System.out.println("default:c2p6i"+id);   
                                            }
                                          ;break;



                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,4,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i7->c2p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,12,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i15->c2p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,20,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p7i23->c2p4i20");
                                          break;   
                                          default://System.out.println("default:c2p7i"+id);   
                                        }
                                          ;break;


                                          }
                                           
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi2BranchGroup);
                                         J3dFrame.cubi2BranchGroup=branchGroup;
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         if(J3dFrame.showCubi2) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3: if(setU.contains(i))
                                  { 
                                        int place =J3dFrame.cubi3.getPlace();
                                        int id=J3dFrame.cubi3.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,5,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i4->c3p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,13,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i12->c3p5i13");
                                          break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,21,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i20->c3p5i21");
                                          break;
                                           default://System.out.println("default:c3p4i"+id);   
                                            }
                                          ;break;

 
                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,6,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i5->c3p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,14,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i13->c3p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,6,22,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i21->c3p6i22");
                                          break;
                                           default://System.out.println("default:c3p5i"+id);   
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,7,J3dFrame.cubi3.colors); 
                                          //System.out.println("c3p6i6->c3p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,15,J3dFrame.cubi3.colors);
                                          //System.out.println("c0p6i14->c0p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,7,23,J3dFrame.cubi3.colors); 
                                          //System.out.println("c3p6i22->c3p7i23");
                                          break;
                                           default://System.out.println("default:c3p6i"+id);   
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,4,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i7->c3p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,12,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i15->c3p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,20,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p7i23->c3p4i20");
                                          break;   
                                         default://System.out.println("default:c3p7i"+id);   
                                        }
                                          ;break;


                                          }
                                           
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi3BranchGroup);
                                         J3dFrame.cubi3BranchGroup=branchGroup;
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         if(J3dFrame.showCubi3) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup);
                                      
                                    }
                                        ;break;
                         case 4: 
                                 if(setU.contains(i)) // kann nur 4,5,6,7 
                                      {
                                        int place =J3dFrame.cubi4.getPlace();
                                        int id=J3dFrame.cubi4.getId();
                                        

                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,5,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i4->c4p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,13,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i12->c4p5i13");
                                          break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,21,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i20->c4p5i21");
                                          break;
                                           default://System.out.println("default:c4p4i"+id);   
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,6,J3dFrame.cubi4.colors); 
                                          //System.out.println("c4p5i5->c4p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,14,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i13->c4p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,6,22,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i21->c4p6i22");
                                          break;
                                           default://System.out.println("default:c4p5i"+id);   
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,7,J3dFrame.cubi4.colors); 
                                          //System.out.println("c4p6i6->c4p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,15,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i14->c4p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,7,23,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p6i22->c4p7i23");
                                          break;
                                           default://System.out.println("default:c4p6i"+id);   
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,4,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i7->c7p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,12,J3dFrame.cubi4.colors); 
                                          //System.out.println("c4p7i15->c4p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,20,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p7i23->c4p4i20");
                                          break;   
                                          default://System.out.println("default:c4p7i"+id);   
                                        }
                                          ;break;


                                          }
                                           
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi4BranchGroup);
                                         J3dFrame.cubi4BranchGroup=branchGroup;
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         if(J3dFrame.showCubi4) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi4BranchGroup);
                                        }
                                         ;break;
                             case 5: 
                                    if(setU.contains(i)) // kann nur 4,5,6,7 sein
                                     {
                                      int place =J3dFrame.cubi5.getPlace();
                                      int id=J3dFrame.cubi5.getId();
                                      
                                     
                                      BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 4:
                                         switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,5,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p4i4->c5p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,13,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i12->c5p5i13");
                                          break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,21,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i20->c5p5i21");
                                          break;
                                           default://System.out.println("default:c5p4i"+id);   
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,6,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i5->c5p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,14,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p5i13->c5p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,6,22,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i21->c5p6i22");
                                          break;
                                            default://System.out.println("default:c5p5i"+id);  
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                         {
                                          case 6:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,7,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p6i6->c5p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,15,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p6i14->c5p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,7,23,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p6i22->c5p7i23");
                                          break;
                                           default://System.out.println("default:c5p6i"+id);   
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                         {
                                          case 7:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,4,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p7i7->c5p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,12,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p7i15->c5p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,20,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p7i23->c5p4i20");
                                          break;   
                                          default://System.out.println("default:c5p7i"+id);   
                                        }
                                          ;break;


                                          }
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi5BranchGroup);
                                         J3dFrame.cubi5BranchGroup=branchGroup;
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         if(J3dFrame.showCubi5) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup);
                                        } 
                                         break;
                                      
                         case 6: if(setU.contains(i))
                                   {
                                        int place =J3dFrame.cubi6.getPlace();
                                        int id=J3dFrame.cubi6.getId();
                                        
                                       
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,5,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i4->c6p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,13,J3dFrame.cubi6.colors); 
                                          //System.out.println("c6p4i12->c6p5i13");
                                          break;
                                          
                                          
                                          case 20:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,21,J3dFrame.cubi6.colors); 
                                          //System.out.println("c6p4i20->c6p5i21");
                                          break;
                                            default://System.out.println("default:c6p4i"+id);  
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,6,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p5i5->c6p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,14,J3dFrame.cubi6.colors); 
                                          //System.out.println("c6p5i13->c6p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,6,22,J3dFrame.cubi6.colors); 
                                          //System.out.println("c6p5i21->c6p6i22");
                                          break;
                                           default://System.out.println("default:c6p5i"+id);  
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,7,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i6->c6p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,15,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i14->c6p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,7,23,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p6i22->c6p7i23");
                                          break;
                                            default://System.out.println("default:c6p6i"+id);
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,4,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p7i7->c6p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,12,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p7i15->c6p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,20,J3dFrame.cubi6.colors); 
                                          //System.out.println("c6p7i23->c6p4i20");
                                          break;   
                                          default://System.out.println("default:c6p7i"+id);   
                                        }
                                          ;break;


                                          }
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi6BranchGroup);
                                         J3dFrame.cubi6BranchGroup=branchGroup;
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         if(J3dFrame.showCubi6) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup);
                                        } 
                                         break;
                                       
                                    
                         case 7: if(setU.contains(i))
                                     { 
                                        int place =J3dFrame.cubi7.getPlace();
                                        int id=J3dFrame.cubi7.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,5,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i4->c7p5i5");
                                          break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,13,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i12->c7p5i13");
                                          break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,21,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i20->c7p5i21");
                                          break;
                                           default://System.out.println("default:c7p4i"+id);   
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,6,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i5->c7p6i6");
                                          break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,14,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i13->c7p6i14");
                                          break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,6,22,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i21->c7p6i22");
                                          break;
                                           default://System.out.println("default:c7p5i"+id);   
                                            }
                                          ;break;


                                          case 6:
                                          switch(id)
                                          {
                                          case 6:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,7,J3dFrame.cubi7.colors); 
                                          //System.out.println("c7p6i6->c7p7i7");
                                          break;
                                          
                                          case 14:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,15,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i14->c7p7i15");
                                          break;
                                          
                                          case 22:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,7,23,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p6i22->c7p7i23");
                                          break;
                                           default://System.out.println("default:c7p6i"+id);   
                                            }
                                          ;break;


                                          case 7:
                                          switch(id)
                                          {
                                          case 7:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,4,J3dFrame.cubi7.colors); 
                                          //System.out.println("c7p7i7->c7p4i4");
                                          break;
                                          
                                          case 15:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,12,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i15->c7p4i12");
                                          break;
                                          
                                          case 23:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,20,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p7i23->c7p4i20");
                                          break;   
                                         default://System.out.println("default:c7p7i"+id);    
                                        }
                                          ;break;


                                          }
                                         J3dFrame.plainU.removeChild(J3dFrame.cubi7BranchGroup);
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
                 
                J3dFrame.URotationInterpolator.setMinimumAngle(J3dFrame.Uwinkel+0f);
                J3dFrame.URotationInterpolator.setMaximumAngle(J3dFrame.Uwinkel-(float)Math.PI/2);
                J3dFrame.Ualpha.setStartTime(System.currentTimeMillis()+100);
                J3dFrame.Uwinkel=J3dFrame.Uwinkel-((float) Math.PI/2);
                 f=finish();
                while(!f){ f=finish();}
                //System.out.println("up <--");
               }
            }//WegenAusstieg  
    
    public Rotupp(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;     
    	rotAchseup=new Button("u"); // rotAchseup-->
            rotAchseup.setBounds(xa,ya,b,h);
            
            
     rotAchseup.addActionListener(new ActionListener()
            { 
            public void actionPerformed(ActionEvent e)
            { 
              upAction();  
            } 
        } );
    }
}
