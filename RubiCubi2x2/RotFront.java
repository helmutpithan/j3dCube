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
 * @author (your name)
 * @version (a version number or a date)
 */
public class RotFront extends Rot
{ static J3dFrame myJ3dFrame;
	Button rotAchseFront;
  static boolean f; 
  static Set<Integer> setF=new HashSet<Integer>();

    Button getrotAchseFront()
    { return rotAchseFront;
      } 
      
    static public void FrontAction()
    {        setF.add(0);
            setF.add(1);
            setF.add(4);
            setF.add(5);
             ActionFrame.textArea.append("F");
        int[] nrArray=new int[8];
           int[] placeArray=new int[8];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {  placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                    //System.out.println("Front--->");
                    //J3dFrame.showCubisVisible();
                    
                    for (int i=0;i<8;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setF.contains(i))
                                      {
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi0BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi0BranchGroup);
                                       if(J3dFrame.showCubi0) J3dFrame.plainF.addChild(J3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setF.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi1BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi1BranchGroup);
                                       if(J3dFrame.showCubi1) J3dFrame.plainF.addChild(J3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setF.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi2BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi2BranchGroup);
                                       if(J3dFrame.showCubi2) J3dFrame.plainF.addChild(J3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setF.contains(i))
                                      { 
                                       J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi3BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi3BranchGroup);
                                       if(J3dFrame.showCubi3) J3dFrame.plainF.addChild(J3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setF.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi4BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi4BranchGroup);
                                       if(J3dFrame.showCubi4) J3dFrame.plainF.addChild(J3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setF.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi5BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi5BranchGroup);
                                       if(J3dFrame.showCubi5) J3dFrame.plainF.addChild(J3dFrame.cubi5BranchGroup);
                                      };break; 
                         case 6: if(setF.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi6BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi6BranchGroup);
                                       if(J3dFrame.showCubi6) J3dFrame.plainF.addChild(J3dFrame.cubi6BranchGroup);
                                      };break;
                         case 7: if(setF.contains(i))
                                      {J3dFrame.sceneBranchGroup.removeChild(J3dFrame.cubi7BranchGroup);
                                       J3dFrame.plainF.removeChild(J3dFrame.cubi7BranchGroup);
                                       if(J3dFrame.showCubi7) J3dFrame.plainF.addChild(J3dFrame.cubi7BranchGroup);
                                      };break;
                        }
                //Vorbereitung -->
                
                 if(finish())
                {
                    
               J3dFrame.FRotationInterpolator.setMinimumAngle(J3dFrame.Fwinkel+0f);
               J3dFrame.FRotationInterpolator.setMaximumAngle(J3dFrame.Fwinkel-(float)Math.PI/2);
               J3dFrame.Falpha.setStartTime(System.currentTimeMillis()+100);
               J3dFrame.Fwinkel=J3dFrame.Fwinkel-((float) Math.PI/2);
              
                               // Warten auf Ende der Bewegung
                f=finish();
                while(!f){ f=finish();}
                } 
                
                //Nachbereitung
                for (int i=0;i<8;i++)
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       { case 0://cubi0
                                 if(setF.contains(i))
                                 { 
                                        
                                        int id=J3dFrame.cubi0.getId();
                                        int place =J3dFrame.cubi0.getPlace();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                          case 0:
                                          switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,4,J3dFrame.cubi0.colors);
                                             //System.out.println("c0p0i0->c0p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,12,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p0i0->c0p4i12"); 
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,4,20,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p0i16->c0p4i20"); 
                                             break;
                                            default://System.out.println("default:c0p0i"+id); 
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,16,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i1->c0p0i16"); 
                                             break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,0,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i9->c0p0i0"); 
                                             break;
                                                  
                                          case 17:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,0,8,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p1i17->c0p0i8"); 
                                             break;
                                           default://System.out.println("default:c0p1i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,21,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i4->c0p5i21"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,5,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i12->c0p5i5"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,5,13,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p4i20->c0p5i13"); 
                                             break;
                                            default://System.out.println("default:c0p4i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,17,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i5->c0p1i17"); 
                                             break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,1,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i13->c0p1i1"); 
                                             break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi0.getCubi0BranchGroup(J3dFrame.cubi0BranchGroup,1,9,J3dFrame.cubi0.colors);
                                          //System.out.println("c0p5i21->c0p1i9"); 
                                             break;
                                           default://System.out.println("default:c0p5i"+id);   
                                            }
                                          ;break;

                                          }
                                          
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi0BranchGroup);
                                         J3dFrame.cubi0BranchGroup=branchGroup;
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                     
                                         if(J3dFrame.showCubi0) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi0BranchGroup); 
                                         id=J3dFrame.cubi0.getId();
                                         place =J3dFrame.cubi0.getPlace();
                                         
                                         
                                    };break;
                                      
                         case 1: //cubi1
                         if(setF.contains(i))
                                    { 
                                        int place =J3dFrame.cubi1.getPlace();
                                        int id=J3dFrame.cubi1.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {
                                          case 0:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,4,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i0->c1p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,12,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i8->c1p4i12"); 
                                             break;
                                          
                                          
                                          case 16:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,4,20,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p0i16->c1p4i20"); 
                                             break;
                                           default://System.out.println("default:c1p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,16,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i1->c1p0i16"); 
                                             break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,0,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i9->c1p0i0"); 
                                             break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,0,8,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p1i17->c1p0i8"); 
                                             break;
                                            default://System.out.println("default:c1p1i"+id);  
                                            }
                                          ;break;



                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,21,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i4->c1p5i21"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,5,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i12->c1p5i5"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,5,13,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p4i20->c1p5i13"); 
                                             break;
                                            default://System.out.println("default:c1p4i"+id);  
                                            }
                                          ;break;


                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,17,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i5->c1p1i17"); 
                                             break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,1,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i13->c1p1i1"); 
                                             break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi1.getCubi1BranchGroup(J3dFrame.cubi1BranchGroup,1,9,J3dFrame.cubi1.colors);
                                          //System.out.println("c1p5i21->c1p1i9"); 
                                             break;
                                            default://System.out.println("default:c1p5i"+id);  
                                            }
                                          ;break;

                                         

                                          }
                                           
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi1BranchGroup);
                                         J3dFrame.cubi1BranchGroup=branchGroup;
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi1BranchGroup);
                                         if(J3dFrame.showCubi1) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi1BranchGroup); 
                                      
                                    };break;
                         case 2: if(setF.contains(i))
                                      {  
                                        int place =J3dFrame.cubi2.getPlace();
                                        int id=J3dFrame.cubi2.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,4,J3dFrame.cubi2.colors);
                                             //System.out.println("c2p0i0->c2p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,12,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i8->c2p4i12"); 
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,4,20,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p0i16->c2p4i20"); 
                                             break;
                                           default://System.out.println("default:c2p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,16,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i1->c2p0i16"); 
                                             break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,0,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i9->c2p0i0"); 
                                             break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,0,8,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p1i17->c2p0i8"); 
                                             break;
                                            default://System.out.println("default:c2p1i"+id);  
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         { 
                                          case 4:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,21,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i4->c2p5i21"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,5,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i12->c2p5i5"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,5,13,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p4i20->c2p5i13"); 
                                             break;
                                           default://System.out.println("default:c2p4i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,17,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i5->c2p1i17"); 
                                             break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,1,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i13->c2p1i1"); 
                                             break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi2.getCubi2BranchGroup(J3dFrame.cubi2BranchGroup,1,9,J3dFrame.cubi2.colors);
                                          //System.out.println("c2p5i21->c2p1i9"); 
                                             break;
                                          default://System.out.println("default:c2p5i"+id);   
                                        }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi2BranchGroup);
                                         J3dFrame.cubi2BranchGroup=branchGroup;
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi2BranchGroup);
                                         if(J3dFrame.showCubi2) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3://cubi3 
                                 if(setF.contains(i))
                                  { 
                                        int place =J3dFrame.cubi3.getPlace();
                                        int id=J3dFrame.cubi3.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {
                                          case 0:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,4,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i0->c3p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,12,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i8->c3p4i12"); 
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,4,20,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p0i16->c3p4i20"); 
                                             break;
                                            default://System.out.println("default:c3p0i"+id);  
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,16,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i1->c3p0i16"); 
                                             break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,0,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i19->c3p0i0"); 
                                             break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,0,8,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p1i17->c3p0i8"); 
                                             break;
                                            default://System.out.println("default:c3p1i"+id);  
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,21,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i4->c3p5i21"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,5,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i12->c3p5i5"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,5,13,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p4i20->c3p5i13"); 
                                             break;//
                                            default://System.out.println("default:c3p4i"+id); 
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,17,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i5->c3p1i17"); 
                                             break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,1,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i13->c3p1i1"); 
                                             break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi3.getCubi3BranchGroup(J3dFrame.cubi3BranchGroup,1,9,J3dFrame.cubi3.colors);
                                          //System.out.println("c3p5i21->c3p1i9"); 
                                             break;
                                           default://System.out.println("default:c3p5i"+id);  
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi3BranchGroup);
                                         J3dFrame.cubi3BranchGroup=branchGroup;
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //J3dFrame.plainD.addChild(J3dFrame.cubi3BranchGroup);
                                         if(J3dFrame.showCubi3) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4: //cubi4
                                 if(setF.contains(i)) 
                                      {
                                        int place =J3dFrame.cubi4.getPlace();
                                        int id=J3dFrame.cubi4.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,4,J3dFrame.cubi4.colors);
                                             //System.out.println("c4p0i0->c4p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,12,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i8->c4p4i12"); 
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,4,20,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p0i16->c4p4i20"); 
                                             break;
                                           default://System.out.println("default:c4p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,16,J3dFrame.cubi4.colors); 
                                          //System.out.println("c4p1i1->c4p0i16");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,0,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i9->c4p0i0"); 
                                             break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,0,8,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p1i17->c4p0i8"); 
                                             break;
                                           default://System.out.println("default:c4p1i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,21,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i4->c4p5i21"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,5,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i12->c4p5i5"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,5,13,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p4i20->c4p5i13"); 
                                             break;
                                            default://System.out.println("default:c4p4i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,17,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i5->c4p1i17"); 
                                             break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,1,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i13->c4p1i1"); 
                                             break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi4.getCubi4BranchGroup(J3dFrame.cubi4BranchGroup,1,9,J3dFrame.cubi4.colors);
                                          //System.out.println("c4p5i21->c4p1i9"); 
                                             break;
                                            default://System.out.println("default:c4p5i"+id);  
                                            }
                                          ;break;

                                          }
                                           
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi4BranchGroup);
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
                           if(setF.contains(i)) // 
                                     {
                                      int place =J3dFrame.cubi5.getPlace();
                                      int id=J3dFrame.cubi5.getId();
                                      
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                         {case 0:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,4,J3dFrame.cubi5.colors);
                                             //System.out.println("c5p0i0->c5p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,12,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p0i8->c5p4i12"); 
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,4,20,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p0i16->c5p4i20"); 
                                             break;
                                           default://System.out.println("default:c5p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,16,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i1->c5p0i16"); 
                                             break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,0,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i9->c5p0i0"); 
                                             break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,0,8,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p1i17->c5p0i8"); 
                                             break;
                                           default://System.out.println("default:c5p1i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                         {
                                          case 4:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,21,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i4->c5p5i21"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,5,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i12->c5p5i5"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,5,13,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p4i20->c5p5i13"); 
                                             break;
                                            default://System.out.println("default:c5p4i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                         {
                                          case 5:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,17,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i5->c5p1i17"); 
                                             break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,1,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i13->c5p1i1"); 
                                             break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi5.getCubi5BranchGroup(J3dFrame.cubi5BranchGroup,1,9,J3dFrame.cubi5.colors);
                                          //System.out.println("c5p5i21->c5p1i9"); 
                                             break;
                                           default://System.out.println("default:c5p5i"+id);   
                                            }
                                          ;break;

                                         
                                          }
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi5BranchGroup);
                                         J3dFrame.cubi5BranchGroup=branchGroup;
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(J3dFrame.showCubi5) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                                    if(setF.contains(i))
                                   {
                                        int place =J3dFrame.cubi6.getPlace();
                                        int id=J3dFrame.cubi6.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,4,J3dFrame.cubi6.colors);
                                              //System.out.println("c6p0i0->c6p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,12,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p0i8->c6p4i12"); 
                                             break;
                                          
                                          case 16:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,4,20,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p0i16->c6p4i20"); 
                                             break;
                                           default://System.out.println("default:c6p0i"+id);   
                                            }
                                          ;break;

                                          case 1:
                                          switch(id)
                                          {
                                          case 1:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,16,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i1->c6p0i16");
                                          break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,0,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i9->c6p0i0"); 
                                             break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,0,8,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p1i17->c6p0i8"); 
                                             break;
                                            default://System.out.println("default:c6p1i"+id);  
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,21,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i4->c6p5i21"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,5,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i12->c6p5i5"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,5,13,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p4i20->c6p5i13"); 
                                             break;
                                            default://System.out.println("default:c6p4i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,17,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p5i5->c6p1i17"); 
                                             break;
                                          
                                          case 13:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,1,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p5i13->c6p1i1"); 
                                             break;
                                          
                                          case 21:branchGroup=J3dFrame.cubi6.getCubi6BranchGroup(J3dFrame.cubi6BranchGroup,1,9,J3dFrame.cubi6.colors);
                                          //System.out.println("c6p5i21->c6p1i9"); 
                                             break;
                                            default://System.out.println("default:c6p5i"+id);
                                            }
                                          ;break;

                                          
                                          }
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi6BranchGroup);
                                         J3dFrame.cubi6BranchGroup=branchGroup;
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         J3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         J3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(J3dFrame.showCubi6) J3dFrame.sceneBranchGroup.addChild(J3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                                 if(setF.contains(i))
                                     { 
                                        int place =J3dFrame.cubi7.getPlace();
                                        int id=J3dFrame.cubi7.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                         case 0:
                                         switch(id)
                                          {case 0:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,4,J3dFrame.cubi7.colors); 
                                              //System.out.println("c7p0i0->c7p4i4"); 
                                             break;
                                          
                                          case 8:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,20,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p0i8->c7p4i20"); 
                                             break;//Fehler: 12 ersetzt durch 20
                                          
                                          case 16:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,4,12,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p0i16->c7p4i12"); 
                                             break;//Fehler: 20 ersetzt durch 12
                                            default://System.out.println("default:c7p0i"+id);  
                                            }
                                          ;break;

                                         
                                          case 1:
                                          switch(id)
                                          {
                                          case 1:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,16,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i1->c7p0i16"); 
                                             break;
                                          
                                          case 9:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,0,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i9->c7p0i0"); 
                                             break;
                                          
                                          case 17:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,0,8,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p1i17->c7p0i8"); 
                                             break;
                                           default://System.out.println("default:c7p1i"+id);   
                                            }
                                          ;break;

                                          case 4:
                                          switch(id)
                                          {
                                          case 4:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,13,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i4->c7p5i13"); 
                                             break;
                                          
                                          case 12:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,21,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i12->c7p5i21"); 
                                             break;
                                          
                                          case 20:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,5,5,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p4i20->c7p5i5"); 
                                             break;
                                            default://System.out.println("default:c7p4i"+id);  
                                            }
                                          ;break;

                                          case 5:
                                          switch(id)
                                          {
                                          case 5:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,17,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i5->c7p1i17"); 
                                             break;// 17 mit 1 vertauschen??
                                          
                                          case 13:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,9,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i13->c7p1i9"); 
                                             break;//Fehler: 1 esetzt durch 9
                                          
                                          case 21:branchGroup=J3dFrame.cubi7.getCubi7BranchGroup(J3dFrame.cubi7BranchGroup,1,1,J3dFrame.cubi7.colors);
                                          //System.out.println("c7p5i21->c7p1i1"); 
                                             break;//Fehler: 9 ersetzt durch 1
                                            default://System.out.println("default:c7p5i"+id);  
                                            }
                                          ;break;

                                          }
                                         J3dFrame.plainF.removeChild(J3dFrame.cubi7BranchGroup);
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
                    ////System.out.println(f);
               
                placeArray=fillPlaceArray();
                nrArray=fillNrArray(placeArray);
                //arrayAusgabe(nrArray,placeArray);
                 //Drehung rückgängig machen
               J3dFrame.FRotationInterpolator.setMinimumAngle(J3dFrame.Fwinkel+0f);
               J3dFrame.FRotationInterpolator.setMaximumAngle(J3dFrame.Fwinkel+(float)Math.PI/2);
               J3dFrame.Falpha.setStartTime(System.currentTimeMillis()+100);
               J3dFrame.Fwinkel=J3dFrame.Fwinkel+((float) Math.PI/2);
                f=finish();
                while(!f){ f=finish();}
                //System.out.println("Front<--");
              }
    }
    /**
     * Constructor for objects of class RotFront
     */
    public RotFront(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
    	rotAchseFront=new Button("F"); // rotAchseUp-->
            rotAchseFront.setBounds(xa,ya,b,h);
            
            // --->von RotLeft uebernommen
        rotAchseFront.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          {
           FrontAction();
            }
             }); 
               
            } // rotAchseFront <-- 
            // <---- von RotLeft uebernommen

    
    
}
