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
 * @author Helmut Pithan h.pithan(at)t-online.de
 * @version (a version number or a date)
 */
public class Rotdoun extends Rot
{ static J3dFrame myJ3dFrame;
	Button rotAchsedown;
  static boolean f;
  static Set<Integer> setD=new HashSet<Integer>();
    
        Button getrotAchsedown()
    { return rotAchsedown;
      }
      
    static public void downAction()
    {       setD.add(0);
            setD.add(1);
            setD.add(2);
            setD.add(3);
             ActionFrame.textArea.append("d");
           int[] nrArray=new int[8];
                int[] placeArray=new int[8];
                f=finish();
                while(!f){ f=finish();}
             if(finish())
                { 
                    placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                    //System.out.println("down -->");
                 //J3dFrame.showCubisVisible();
                    
                  //Vorbereitung
                    for (int i=0;i<8;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setD.contains(i))
                                      {
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi0BranchGroup);
                                       if(J3dFrame.showCubi0) J3dFrame.plainD.addChild(J3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setD.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi1BranchGroup);
                                       if(J3dFrame.showCubi1) J3dFrame.plainD.addChild(J3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setD.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi2BranchGroup);
                                       if(J3dFrame.showCubi2) J3dFrame.plainD.addChild(J3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setD.contains(i))
                                      { 
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi3BranchGroup);
                                       if(J3dFrame.showCubi3) J3dFrame.plainD.addChild(J3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setD.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi4BranchGroup);
                                       if(J3dFrame.showCubi4) J3dFrame.plainD.addChild(J3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setD.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi5BranchGroup);
                                       if(J3dFrame.showCubi5) J3dFrame.plainD.addChild(J3dFrame.cubi5BranchGroup);
                                    };break;
                         case 6: if(setD.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi6BranchGroup);
                                       if(J3dFrame.showCubi6) J3dFrame.plainD.addChild(J3dFrame.cubi6BranchGroup);
                                    };break;
                         case 7: if(setD.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                                       J3dFrame.plainD.removeChild(J3dFrame.cubi7BranchGroup);
                                       if(J3dFrame.showCubi7) J3dFrame.plainD.addChild(J3dFrame.cubi7BranchGroup);
                                    };break;
                        }
                //Vorbereitung -->
                
                 if(finish())
                {
               
                J3dFrame.DRotationInterpolator.setMinimumAngle(J3dFrame.Dwinkel+0f);
                J3dFrame.DRotationInterpolator.setMaximumAngle(J3dFrame.Dwinkel-(float)Math.PI/2);
                J3dFrame.Dalpha.setStartTime(System.currentTimeMillis()+100); //WarteZeit
                J3dFrame.Dwinkel=J3dFrame.Dwinkel-((float) Math.PI/2);
                
                // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();
                }
                
                } 
                
                //Nachbereitung
                for (int i=0;i<8;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                   
                       { case 0://cubi0
                                 if(setD.contains(i))
                                 { 
                                       
                                        int id=J3dFrame.cubi0.getId();
                                        int place =J3dFrame.cubi0.getPlace();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,3,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p0i0->c0p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,11,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p0i8->c0p3i11");
                                          break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,3,19,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p0i16->c0p3i19");
                                          break;
                                           default://System.out.println("default:c0p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,0,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i1->c0p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,8,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i1->c0p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,16,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i1->c0p0i16");
                                          break;         
                                           default://System.out.println("default:c0p1i"+id);   
                                            }
                                          ;break;


                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,1,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i2->c0p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,9,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i10->c0p1i9");
                                          break;
                                                   
                                          case 18:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,17,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p2i18->c0p1i17");
                                          break;
                                            default://System.out.println("default:c0p2i"+id);  
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,2,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i3->c0p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,10,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i11->c0p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,2,18,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p3i19->c0p2i18");
                                          break;
                                           default://System.out.println("default:c0p3i"+id);   
                                            }
                                          ;break;

                                          }
                                          
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi0BranchGroup);
                                         J3dFrame.cubi0BranchGroup=branchGroup;
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi0) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup); 
                                         id=J3dFrame.cubi0.getId();
                                         place =J3dFrame.cubi0.getPlace();
                                         
                                        
                                    };break;
                                      
                         case 1: if(setD.contains(i))
                                    { 
                                    
                                        int place =J3dFrame.cubi1.getPlace();
                                        int id=J3dFrame.cubi1.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,3,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i0->c1p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,11,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i8->c1p3i11");
                                          break;//
                                          
                                          case 16:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,3,19,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i16->c1p3i19");
                                          break;
                                            default://System.out.println("default:c1p0i"+id);  
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,0,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i1->c1p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,8,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i9->c1p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,16,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i17->c1p0i16");
                                          break;
                                            default://System.out.println("default:c1p1i"+id);  
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,1,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i2->c1p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,9,J3dFrame.cubi1.colors); 
                                          //System.out.println("c1p2i10->c1p1i9");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,17,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p2i18->c1p1i17");
                                          break;
                                           default://System.out.println("default:c2p0i"+id);  
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,2,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i3->c1p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,10,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i11->c1p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,2,18,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p3i19->c1p2i18");
                                          break;
                                           default://System.out.println("default:c1p3i"+id);   
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi1BranchGroup);
                                         J3dFrame.cubi1BranchGroup=branchGroup;
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi1) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup); 
                                      
                                    };break;
                         case 2: if(setD.contains(i))
                                      {  
                                        
                                        int place =J3dFrame.cubi2.getPlace();
                                        int id=J3dFrame.cubi2.getId();
                                        
                                         
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,3,J3dFrame.cubi2.colors); 
                                          //System.out.println("c2p0i0->c2p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,11,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i8->c2p3i11");
                                          break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,3,19,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i16->c2p3i19");
                                          break;
                                           default://System.out.println("default:c2p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,0,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i1->c2p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,8,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i9->c2p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,16,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i17->c2p0i16");
                                          break;
                                            default://System.out.println("default:c2p1i"+id);  
                                            }
                                          ;break;

                                          case 2:switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,1,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i2->c2p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,9,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i10->c2p1i9");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,17,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p2i18->c2p1i17");
                                          break;
                                           default://System.out.println("default:c2p2i"+id);   
                                            }
                                          ;break;
 
                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,2,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i3->c2p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,10,J3dFrame.cubi2.colors); 
                                          //System.out.println("c2p3i11->c2p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,2,18,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p3i19->c2p2i18");
                                          break;
                                           default://System.out.println("default:c2p3i"+id);   
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi2BranchGroup);
                                         J3dFrame.cubi2BranchGroup=branchGroup;
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(J3dFrame.showCubi2) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3: //cubi3
                                if(setD.contains(i))
                                  { 
                                        int place =J3dFrame.cubi3.getPlace();
                                        int id=J3dFrame.cubi3.getId();
                                        
                                         
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,3,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i0->c3p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,11,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i8->c3p3i11");
                                          break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,3,19,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i16->c3p3i19");
                                          break;
                                           default://System.out.println("default:c3p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,0,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i1->c3p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,8,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i9->c3p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,16,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i17->c3p0i16");
                                          break;
                                           default://System.out.println("default:c3p1i"+id);   
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,1,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i2->c3p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,9,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i10->c3p1i9");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,17,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p2i18->c3p1i17");
                                          break;
                                           default://System.out.println("default:c3p2i"+id);   
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,2,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i3->c3p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,10,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i11->c3p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,2,18,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p3i19->c3p2i18");
                                          break;
                                           default://System.out.println("default:c3p2i"+id);   
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi3BranchGroup);
                                         J3dFrame.cubi3BranchGroup=branchGroup;
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi3) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4://cubi4 
                                if(setD.contains(i)) // kann nur 0,1,2,3 sein wenn das nur kein Irrtum ist???
                                      {
                                        int place =J3dFrame.cubi4.getPlace();
                                        int id=J3dFrame.cubi4.getId();
                                        
                                         
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {
                                          case 0:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,3,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i0->c4p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,11,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i8->c4p3i11");
                                          break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,3,19,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i16->c4p3i19");
                                          break;
                                           default://System.out.println("default:c4p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,0,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i1->c4p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,8,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i9->c4p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,16,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i17->c4p0i16");
                                          break;
                                           default://System.out.println("default:c4p1i"+id);   
                                            }
                                          ;break;

                                          case 2: 
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,1,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i2->c4p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,9,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i10->c4p1i9");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,17,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p2i18->c4p3i17");
                                          break;
                                           default://System.out.println("default:c4p2i"+id);   
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                         {
                                          case 3:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,2,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i3->c4p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,10,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i11->c4p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,2,18,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p3i19->c4p2i18");
                                          break;
                                            default://System.out.println("default:c4p3i"+id);  
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi4BranchGroup);
                                         J3dFrame.cubi4BranchGroup=branchGroup;
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi4BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi4BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi4) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi4BranchGroup); 
                                        }
                                         ;break;
                         case 5: //cubi5
                                   if(setD.contains(i)) // kann nur 0,1,2,3 sein
                                     {
                                      int place =J3dFrame.cubi5.getPlace();
                                      int id=J3dFrame.cubi5.getId();
                                      
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0: 
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,3,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p0i0->c5p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,11,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p0i8->c5p3i11");
                                          break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,3,19,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p0i16->c5p3i19");
                                          break;
                                           default://System.out.println("default:c5p0i"+id);   
                                            }
                                          ;break;

                                          case 1: 
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,0,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i1->c5p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,8,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i9->c5p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,16,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i17->c5p0i16");
                                          break;
                                           default://System.out.println("default:c5p1i"+id);   
                                            }
                                          ;break;

                                          case 2: 
                                          switch(id)
                                         {
                                          case 2:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,1,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p2i2->c5p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,9,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p2i10->c5p1i9");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,17,J3dFrame.cubi5.colors); 
                                          //System.out.println("c5p2i18->c5p1i17");
                                          break;
                                            default://System.out.println("default:c5p2i"+id);  
                                            }
                                          ;break;

                                          case 3:  
                                          switch(id)
                                        {
                                          case 3:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,2,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p3i3->c5p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,10,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p3i11->c5p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,2,18,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p3i19->c5p2i18");
                                          break;
                                           default://System.out.println("default:c5p3i"+id);   
                                            }
                                          ;break;

                                          
                                          }
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi5BranchGroup);
                                         J3dFrame.cubi5BranchGroup=branchGroup;
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi5) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                                if(setD.contains(i))
                                   {
                                        int place =J3dFrame.cubi6.getPlace();
                                        int id=J3dFrame.cubi6.getId();
                                        
                                         
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,3,J3dFrame.cubi6.colors);
                                           //System.out.println("c6p0i0->c6p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,11,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p0i8->c6p3i11");
                                          break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,3,19,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p0i16->c6p3i19");
                                          break;
                                           default://System.out.println("default:c6p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                          {
                                          case 1:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,0,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i1->c6p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,8,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i9->c6p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,16,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i17->c6p0i16");
                                          break;
                                           default://System.out.println("default:c6p1i"+id);   
                                            }
                                          ;break;

                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,1,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i2->c6p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,9,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i10->c6p1i9");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,17,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p2i18->c6p1i17");
                                          break;
                                           default://System.out.println("default:c6p2i"+id);   
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,2,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i3->c6p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,10,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i11->c6p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,2,18,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p3i19->c6p2i18");
                                          break;
                                           default://System.out.println("default:c6p3i"+id);   
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi6BranchGroup);
                                         J3dFrame.cubi6BranchGroup=branchGroup;
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(J3dFrame.showCubi6) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: if(setD.contains(i))
                                     { 
                                        int place =J3dFrame.cubi7.getPlace();
                                        int id=J3dFrame.cubi7.getId();
                                        
                                       
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,3,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p0i0->c7p3i3");
                                          break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,11,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p0i8->c7p3i11");
                                          break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,3,19,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p0i16->c7p3i19");
                                          break;
                                           default://System.out.println("default:c7p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                          {
                                          case 1:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,0,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i1->c7p0i0");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,8,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i9->c7p0i8");
                                          break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,16,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i17->c7p0i16");
                                          break;
                                            default://System.out.println("default:c7p1i"+id);  
                                            }
                                          ;break;


                                          case 2:
                                          switch(id)
                                          {
                                          case 2:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,1,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i2->c7p1i1");
                                          break;
                                          
                                          case 10:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,9,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i10->c7p1i9");
                                          break;
                                          
                                          case 18:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,17,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p2i18->c7p1i17");
                                          break;
                                           default://System.out.println("default:c7p2i"+id);   
                                            }
                                          ;break;

                                          case 3:
                                          switch(id)
                                          {
                                          case 3:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,2,J3dFrame.cubi7.colors); 
                                          //System.out.println("c7p3i3->c7p2i2");
                                          break;
                                          
                                          case 11:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,10,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i11->c7p2i10");
                                          break;
                                          
                                          case 19:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,2,18,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p3i19->c7p2i18");
                                          break;
                                            default://System.out.println("default:c7p3i"+id);  
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainD.removeChild(J3dFrame.cubi7BranchGroup);
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
                while(!f){ f=finish();
                    ////System.out.println(f);
                }
                    placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                 //Drehung rückgängig machen
                J3dFrame.DRotationInterpolator.setMinimumAngle(J3dFrame.Dwinkel+0f);
                J3dFrame.DRotationInterpolator.setMaximumAngle(J3dFrame.Dwinkel+(float)Math.PI/2);
                J3dFrame.Dalpha.setStartTime(System.currentTimeMillis()+100); //WarteZeit
                J3dFrame.Dwinkel=J3dFrame.Dwinkel+((float) Math.PI/2);
                f=finish();
                while(!f){ f=finish();} 
                //System.out.println("down <--");
                }
            }
    
    public Rotdoun(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    {   this.myJ3dFrame=myJ3dFrame;   
    	rotAchsedown=new Button("d"); // rotAchseDown-->
            rotAchsedown.setBounds(xa,ya,b,h);
            
         rotAchsedown.addActionListener(new ActionListener()
            { 
            public void actionPerformed(ActionEvent e)
            {
            downAction();
            }
          });   
    }   
}
