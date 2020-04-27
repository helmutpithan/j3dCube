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
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */

public class Rotupp extends Rot
{static J3dFrame myJ3dFrame; 
	Button rotAchseup;
    static boolean f;
  static Set<Integer> setU=new HashSet<Integer>();
  
    Button getrotAchseup()
    { return rotAchseup;
      }
    static public void upAction()
    {
            if(myJ3dFrame.showCubi16) setU.add(16);
            if(myJ3dFrame.showCubi17) setU.add(17);
            if(myJ3dFrame.showCubi18) setU.add(18);
            if(myJ3dFrame.showCubi19) setU.add(19);
            if(myJ3dFrame.showCubi20) setU.add(20);
            if(myJ3dFrame.showCubi21) setU.add(21);
            if(myJ3dFrame.showCubi22) setU.add(22);
            if(myJ3dFrame.showCubi23) setU.add(23);
            if(myJ3dFrame.showCubi25) setU.add(25);
            ActionFrame.textArea.append("u");
         int[] nrArray=new int[26];
                int[] placeArray=new int[26]; 
                 f=finish();
                while(!f){ f=finish();}
                
                if(finish())
                {   placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                   //System.out.println("up--->");
                    //zustandsAusgabe(nrArray,placeArray,setU);
                   //myJ3dFrame.showCubisVisible();
                
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                        {case 0:
                                if( setU.contains(i))
                                   {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if( setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if( setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setU.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi5BranchGroup);
                                      };break; 
                         case 6: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi6BranchGroup);
                                      };break;
                         case 7: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi7BranchGroup);
                                      };break;
                         case 8: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi8BranchGroup);
                                      };break;
                         case 9: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi9BranchGroup);
                                      };break;
                         case 10: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi10BranchGroup);
                                       };break;
                         case 11: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi11BranchGroup);
                                      };break;                                                    
                         case 12: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi12BranchGroup);
                                      };break;
                         case 13: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi13BranchGroup);
                                      };break;
                         case 14: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi14BranchGroup);
                                      };break;
                         case 15: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi15BranchGroup);
                                      };break;
                         case 16: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi16BranchGroup);
                                      };break;
                         case 17: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi17BranchGroup);
                                      };break;
                         case 18: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi18BranchGroup);
                                      };break;
                         case 19: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi19BranchGroup);
                                      };break;
                         case 20: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi20BranchGroup);
                                      };break;
                         case 21: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi21BranchGroup);
                                      };break;
                         case 22: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi22BranchGroup);
                                      };break;
                         case 23: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi23BranchGroup);
                                      };break;
                         case 24: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24){ myJ3dFrame.plainU.addChild(myJ3dFrame.cubi24BranchGroup);}
                                       };break;
                         case 25: if(setU.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.plainU.addChild(myJ3dFrame.cubi25BranchGroup);
                                      };break;
                        }
                //Vorbereitung <--
                
                myJ3dFrame.URotationInterpolator.setMinimumAngle(myJ3dFrame.Uwinkel+0f);
                myJ3dFrame.URotationInterpolator.setMaximumAngle(myJ3dFrame.Uwinkel+(float)Math.PI/2);
                myJ3dFrame.Ualpha.setStartTime(System.currentTimeMillis()+100);
                myJ3dFrame.Uwinkel=myJ3dFrame.Uwinkel+((float) Math.PI/2);
               
                // Warten auf Ende der Bewegung
                //booelean f
                f=finish();
                while(!f){ 
               try{ Thread.sleep(100);}catch (InterruptedException e) { }
                
                f=finish();}
                
               
                for (int i=0;i<26;i++)
                    switch(nrArray[i])
                       { case 0: //cubi0
                                 if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi0.getPlace();
                                        int id=myJ3dFrame.cubi0.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      case 16:
                                          switch(id)
                                         {                                          
                                          case 8:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,10,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i8->c0p18i10"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,26,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i24->c0p18i26"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,18,42,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p16i40->c0p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p16i"+id); 
                                            }
                                          ;break;

                                    
                                        case 18: 
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,12,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i10->c0p20i12"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,28,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i26->c0p20i28"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,20,44,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p18i42->c0p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p18i"+id);  
                                            }
                                          ;break;
                                         
                                        


                                       case 20: 
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,14,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i12->c0p22i14");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,30,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i28->c0p22i30");
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,22,46,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p20i44->c0p22i46"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p20i"+id);   
                                            }
                                          ;break;
                                      
                                       case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,8,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i14->c0p16i8"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,24,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i30->c0p16i24"); 
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi0.getCubi0BranchGroup(myJ3dFrame.cubi0BranchGroup,16,40,myJ3dFrame.cubi0.colors);
                                         //System.out.println("c0p22i46->c0p16i4"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c0p22i"+id);   
                                            }
                                          ;break;
                                        
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi0BranchGroup);
                                         myJ3dFrame.cubi0BranchGroup=branchGroup;
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi0BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi0) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi0BranchGroup); 
                                          
                                      }
                                       ;break;
                                      
                         case 1: //cubi1
                                 if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi1.getPlace();
                                        int id=myJ3dFrame.cubi1.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      

                                        case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,27,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p17i25->c1p19i27"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,19,45,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p17i43->c1p19i45"); 
                                          break;                
                                          
                                           default:
                                           	  //System.out.println("default:c1p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,29,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i27->c1p21i29");
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,47,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p19i45->c1p21i47");
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c1p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,31,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i29->c1p23i31"); 
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,23,41,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i47->c1p23i41"); 
                                          break;                                          

                                           default:
                                           	  //System.out.println("default:c1p211i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,25,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i31->c1p17i25"); 
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,43,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p23i41->c1p17i43"); 
                                          break;
                                          
                                          
                                           default:
                                           	  //System.out.println("default:c1p23i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                          
                                      }
                                       ;break;
                            case 2: //cubi2                          
                                     if(setU.contains(i))
                                      {  
                                        int place =myJ3dFrame.cubi2.getPlace();
                                        int id=myJ3dFrame.cubi2.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      case 16:
                                          switch(id)
                                         {case 40:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,42,myJ3dFrame.cubi2.colors);
                                            //System.out.println("c2p16i40->c2p18i42"); 
                                             break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,26,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i24->c2p18i26"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,18,10,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p16i8->c2p18i10"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p16i"+id); 
                                            }
                                          ;break;
                                          
                                            case 18:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,44,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i42->c2p20i44"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,28,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i26->c2p20i28"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,20,12,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p18i10->c2p20i12"); 
                                          break;
                                            default:
                                            	System.out.println("default:c2p18i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,46,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i44->c2p22i46"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,30,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i28->c2p22i30"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,22,14,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p20i12->c2p22i14"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c2p20i"+id);   
                                            }
                                          ;break;
                                          
                                         case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,40,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i46->c2p16i40"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,24,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i30->c2p16i24"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi2.getCubi2BranchGroup(myJ3dFrame.cubi2BranchGroup,16,8,myJ3dFrame.cubi2.colors);
                                         //System.out.println("c2p22i14->c2p16i8"); 
                                          break;
                                           default:System.out.println("default:c2p22i"+id);   
                                            }
                                          ;break;
                                        
                                     
                                          }
                                           
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi2BranchGroup);
                                         myJ3dFrame.cubi2BranchGroup=branchGroup;
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi2BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi2) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi2BranchGroup); 
                                         
                                         }
                                         ;break;
                         case 3://cubi3 
                                 if(setU.contains(i))
                                  { 
                                        int place =myJ3dFrame.cubi3.getPlace();
                                        int id=myJ3dFrame.cubi3.getId();
                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      

                                        case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,45,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i43->c3p19i45"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,19,27,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i25->c3p19i27");
                                          break;
                                                                                           
                                           default:
                                           	  //System.out.println("default:c3p17i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          case 45:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,47,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i45->c3p21i47");
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,29,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p19i27->c3p21i29");                                         
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c3p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,41,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i47->c3p23i41"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,23,31,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i29->c3p23i31"); 
                                          break;
                                          default:
                                          	 //System.out.println("default:c3p21i"+id);   
                                            }
                                          ;break;
                                          
                                          case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,43,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i41->c3p17i43"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,25,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p23i31->c3p17i25"); 
                                          break;
                                                                                                                             
                                          default:
                                          	 //System.out.println("default:c3p23i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                           
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                         case 4: //cubi4
                                 if(setU.contains(i)) 
                                      {
                                        int place =myJ3dFrame.cubi4.getPlace();
                                        int id=myJ3dFrame.cubi4.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      case 16:
                                          switch(id)
                                         { case 40:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,42,myJ3dFrame.cubi4.colors);
                                          //System.out.println("c4p16i40->c4p18i42"); 
                                           break; 
                                           
                                          case 24:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,26,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i24->c4p18i26"); 
                                          break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,18,10,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p16i8->c4p18i10"); 
                                          break;
                                            default:
                                            	System.out.println("default:c4p16i"+id); 
                                            }
                                          ;break;
                                          
                                         case 18:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,44,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i42->c4p20i44"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,28,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i26->c4p20i28"); 
                                          break;
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,20,12,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p18i10->c4p20i12"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p4i"+id);  
                                            }
                                          ;break;
                                          
                                        case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,46,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i44->c4p22i46"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,30,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i28->c4p22i30"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,22,14,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p20i12->c4p22i14"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p20i"+id);   
                                            }
                                          ;break;
                                      
                                       case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,40,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i46->c4p16i40"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,24,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i30->c4p16i24"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi4.getCubi4BranchGroup(myJ3dFrame.cubi4BranchGroup,16,8,myJ3dFrame.cubi4.colors);
                                         //System.out.println("c4p22i14->c4p16i8"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c4p22i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                           
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi4BranchGroup);
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
                           if(setU.contains(i)) // 
                                     {
                                      int place =myJ3dFrame.cubi5.getPlace();
                                      int id=myJ3dFrame.cubi5.getId();
                                      
                                      
                                     BranchGroup branchGroup=null;
                                      switch(place) {
                                      

                                        case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,45,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p17i43->c5p19i45"); 
                                          break;                                          
                                                  
                                          case 25:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,19,27,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p17i25->c5p19i27"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p17i"+id);   
                                            }
                                          ;break;
                                          
                                          case 19:
                                          switch(id)
                                         {
                                          case 45:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,47,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i45->c5p21i47"); 
                                          break;
                                                                                    
                                          case 27:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,29,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p19i27->c5p21i29"); 
                                          break;
                                            default:
                                            	System.out.println("default:c5p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,41,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p21i47->c5p23i41"); 
                                          break;                                          
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,23,31,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p21i29->c5p23i31"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,43,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i41->c5p17i43"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,25,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p23i31->c5p17i25"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c5p23i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi5BranchGroup);
                                         myJ3dFrame.cubi5BranchGroup=branchGroup;
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                        
                                         if(myJ3dFrame.showCubi5) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                      
                         case 6: //cubi6
                                    if(setU.contains(i))
                                   {
                                        int place =myJ3dFrame.cubi6.getPlace();
                                        int id=myJ3dFrame.cubi6.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      case 16:
                                          switch(id)
                                         {case 40:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,42,myJ3dFrame.cubi6.colors);
                                          //System.out.println("c6p16i40->c6p18i42"); 
                                           break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,26,myJ3dFrame.cubi6.colors);
                                          //System.out.println("c6p16i24->c6p18i26"); 
                                           break;
                                          
                                          case 8:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,18,10,myJ3dFrame.cubi6.colors);
                                          //System.out.println("c6p16i8->c6p18i10"); 
                                           break;
                                            default:
                                            	System.out.println("default:c6p16i"+id); 
                                            }
                                          ;break;
                                          
                                         case 18:
                                          switch(id)
                                         {
                                          case 42:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,44,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i42->c6p20i44"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,28,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i26->c6p20i28"); 
                                          break;
                                          
                                          
                                          case 10:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,20,12,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p18i10->c6p20i12"); 
                                          break;
                                            default:
                                            	System.out.println("default:c6p18i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 44:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,46,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i44->c6p22i46");
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,30,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i28->c6p22i30"); 
                                          break;
                                          
                                          case 12:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,22,14,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p20i12->c6p22i14"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p20i"+id);   
                                            }
                                          ;break;
                                          
                                        case 22:
                                          switch(id)
                                         {
                                          case 46:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,40,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i46->c6p16i40"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,24,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i30->c6p16i24"); 
                                          break;
                                          
                                          case 14:branchGroup=myJ3dFrame.cubi6.getCubi6BranchGroup(myJ3dFrame.cubi6BranchGroup,16,8,myJ3dFrame.cubi6.colors);
                                         //System.out.println("c6p22i14->c6p16i8"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c6p22i"+id);   
                                            }
                                          ;break;

                                 }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi6BranchGroup);
                                         myJ3dFrame.cubi6BranchGroup=branchGroup;
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi6BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi6) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi6BranchGroup); 
                                        } 
                                         break;
                                       
                                    
                         case 7: //cubi7
                                 if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi7.getPlace();
                                        int id=myJ3dFrame.cubi7.getId();
                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      

                                        case 17:
                                          switch(id)
                                         {
                                          case 43:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,45,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p17i43->c7p19i45"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,19,27,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p17i25->c7p19i27"); 
                                          break;
                                                  
                                          default:
                                          	 //System.out.println("default:c7p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 45:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,47,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i45->c7p21i47"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,29,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p19i45->c7p21i29"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c7p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,41,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i47->c7p23i41"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,23,31,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i29->c7p23i31"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c7p21i"+id);   
                                            }
                                          ;break;

                                        case 23:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,43,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i41->c7p17i43"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,25,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p23i31->c7p17i25"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c7p23i"+id);   
                                            }
                                          ;break;
                                          
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                        case 8: //cubi8
                                 if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi8.getPlace();
                                        int id=myJ3dFrame.cubi8.getId();
                                       
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      

                                        case 17://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 9:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,11,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i9->c8p19i11"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,19,29,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i27->c8p19i29"); 
                                          break;                
                                          
                                           default:
                                           	  //System.out.println("default:c8p17i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,13,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p19i11->c8p21i13"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,31,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p19i29->c8p21i31"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c8p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 13:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,15,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p21i13->c8p23i15"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,23,25,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p21i31->c8p23i25"); 
                                          break;                                          

                                           default:
                                           	  //System.out.println("default:c8p211i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 15:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,9,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p23i15->c8p17i9"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,27,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p23i25->c8p17i27"); 
                                          break;
                                          
                                          
                                           default:
                                           	  //System.out.println("default:c8p23i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                             
                                 
                                 
                           case 10: //cubi10
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi10.getPlace();
                                        int id=myJ3dFrame.cubi10.getId();
                                                                              
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                       
                                        case 17:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,29,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p17i27->c10p19i29"); 
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,19,11,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p17i9->c10p19i11"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c10p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,31,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i29->c10p21i31"); 
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,13,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i11->c10p21i13"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c10p19i"+id);  
                                            }
                                          ;break;
                                          
                                          case 21:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,25,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p21i31->c10p25i25"); 
                                          break;
                                          
                                          case 13:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,23,15,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p21i13->c10p25i15"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c10p21i"+id);   
                                            }
                                          ;break; 
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,27,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i25->c10p17i27"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,9,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p23i15->c10p17i9"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c10p23i"+id);   
                                            }
                                          ;break;

                                         }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi10BranchGroup);
                                         myJ3dFrame.cubi10BranchGroup=branchGroup;
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi10) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi10BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                         
                                       
                       case 12: //cubi12
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi12.getPlace();
                                        int id=myJ3dFrame.cubi12.getId();
                                      
                                        BranchGroup branchGroup=null;
                                      switch(place) {

                                        case 17:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,29,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p17i27->c12p19i29"); 
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,19,11,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p17i9->c12p19i11"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c12p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,31,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i29->c12p21i31"); 
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,13,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i11->c12p21i13"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c12p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,25,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p21i31->c12p23i25"); 
                                          break;
                                          
                                          case 13:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,23,15,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p21i13->c12p23i15"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c12p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,27,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p23i25->c12p17i27"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,9,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p23i15->c12p17i9"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c12p23i"+id);   
                                            }
                                          ;break;

                                     }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                        
                         
                        case 14: //cubi14
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi14.getPlace();
                                        int id=myJ3dFrame.cubi14.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                        
                                        case 17:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,29,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p17i27->c14p19i29"); 
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,19,11,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p17i9->c14p19i11"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c14p17i"+id);   
                                            }
                                          ;break;
                                          
                                         case 19:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,31,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i29->c14p21i31"); 
                                          break;
                                          
                                          case 11:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,13,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i11->c14p21i13"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c14p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,25,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i31->c14p23i25"); 
                                          break;
                                          
                                          case 13:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,23,15,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i13->c14p23i15"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c14p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 23:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,27,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p23i25->c14p17i27"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,9,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p23i15->c14p17i9"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c14p23i"+id);   
                                            }
                                          ;break;
  
                                       
                                  }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                        
                         
                        case 16: //cubi16
                                 if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi16.getPlace();
                                        int id=myJ3dFrame.cubi16.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      case 16:
                                          switch(id)
                                         {                                          
                                          case 8:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,10,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i8->c16p18i10"); 
                                          break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,26,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i24->c16p18i26"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,18,42,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p16i40->c16p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c0p0i"+id); 
                                            }
                                          ;break;

                                    
                                        case 18: // Möglichkeiten:10:rwg,26:grw;42:wgr  -> 22 id-4
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,12,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i10->c16p20i12"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,28,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i26->c16p20i28"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,20,44,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p18i42->c16p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c16p18i"+id);  
                                            }
                                          ;break;
                                         
  
                                       case 20: //// Möglichkeiten:12:rwg,28:grw;44:wgr  -> 22 id+6
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,14,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i12->c16p22i14"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,30,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i28->c16p22i30"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,22,46,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p20i44->c16p22i46"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p20i"+id);   
                                            }
                                          ;break;
                                      
                                       case 22:// Möglichkeiten:14:rwg,30:grw;446:wgr  -> 22 id+6
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,8,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i14->c16p16i8"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,24,myJ3dFrame.cubi16.colors);
                                        //System.out.println("c16p22i30->c16p16i24"); 
                                         break;
                                          
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi16.getCubi16BranchGroup(myJ3dFrame.cubi16BranchGroup,16,40,myJ3dFrame.cubi16.colors);
                                         //System.out.println("c16p22i46->c16p16i40"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c16p22i"+id);   
                                            }
                                          ;break;
                                        
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi16BranchGroup);
                                         myJ3dFrame.cubi16BranchGroup=branchGroup;
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi16BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi16) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi16BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                             case 17: //cubi17
                                 if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi17.getPlace();
                                        int id=myJ3dFrame.cubi17.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                      

                                        case 17://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,27,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p17i25->c17p19i27"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,19,45,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p17i43->c17p19i45"); 
                                          break;                
                                          
                                           default:
                                           	  //System.out.println("default:c17p17i"+id);   
                                            }
                                          ;break;
                                          
                                          case 19://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,29,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i27->c17p21i29"); 
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,47,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p19i45->c17p21i47"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c17p19i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,31,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p21i29->c17p23i31"); 
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,23,41,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p21i47->c17p23i41"); 
                                          break;                                          

                                           default:
                                           	  //System.out.println("default:c17p211i"+id);   
                                            }
                                          ;break;
                                          
                                       case 23://Möglichkeiten:rw: p17i25,p19i27,p21i29,p23i31,  wr:   p17i43,p19i45,p21i47,p23i41,
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,25,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p23i31->c17p17i25"); 
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,43,myJ3dFrame.cubi17.colors);
                                         ////System.out.println("c17p23i41->c17p17i43"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c17p23i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                            case 18: //cubi18
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi18.getPlace();
                                        int id=myJ3dFrame.cubi18.getId();
                                       
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                                 
                                       case 16:
                                          switch(id)
                                         {case 8:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,10,myJ3dFrame.cubi18.colors);
                                            //System.out.println("c18p16i8->c18p18i10"); 
                                             break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,26,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i24->c18p18i26"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,18,42,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p16i40->c18p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p16i"+id); 
                                            }
                                          ;break;
                                          
                                        case 18: 
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,12,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i10->c18p20i12"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,28,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i26->c18p20i28"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,20,44,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p18i42->c18p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c18p18i"+id);  
                                            }
                                          ;break;
                                          
                                        case 20:
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,14,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i12->c18p22i14"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,30,myJ3dFrame.cubi18.colors);
                                        //System.out.println("c18p20i28->c18p22i30"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,22,46,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p20i44->c18p22i46"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p20i"+id);   
                                            }
                                          ;break;
                                          
                                      case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,8,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i14->c18p16i8"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,24,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i30->c18p16i24"); 
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi18.getCubi18BranchGroup(myJ3dFrame.cubi18BranchGroup,16,40,myJ3dFrame.cubi18.colors);
                                         //System.out.println("c18p22i46->c18p16i40"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c18p22i"+id);   
                                            }
                                          ;break;
                                                                     
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi18BranchGroup);
                                         myJ3dFrame.cubi18BranchGroup=branchGroup;
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi18BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi18) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi18BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 19: //cubi19
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi19.getPlace();
                                        int id=myJ3dFrame.cubi19.getId();
                                        
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                       
                                        case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,27,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c17p17i25->c17p19i27"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,19,45,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c17p17i43->c17p19i45"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c19p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,29,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i27->c19p21i29"); 
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,47,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p19i45->c19p21i47"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c19p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,31,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p21i29->c19p23i31"); 
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,23,41,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p21i47->c19p23i41"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c19p21i"+id);   
                                            }
                                          ;break;
                                          
                                        case 23:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,25,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p23i31->c19p17i25"); 
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,43,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p23i41->c19p17i43"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c19p23i"+id);   
                                            }
                                          ;break;
                                          
                                       

                                        
                                       }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                       ;break;
                           case 20: //cubi20
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi20.getPlace();
                                        int id=myJ3dFrame.cubi20.getId();
                                                                             
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                        
                                      case 16:
                                          switch(id)
                                         {case 8:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,10,myJ3dFrame.cubi20.colors);
                                            //System.out.println("c20p16i8->c20p18i10"); 
                                             break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,26,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i24->c20p18i26"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,18,42,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p16i40->c20p18i42"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p16i"+id); 
                                            }
                                          ;break;
                                          
                                       case 18:
                                         switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,12,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i10->c20p20i12"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,28,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i26->c20p20i28"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,20,44,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p18i42->c20p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c20p18i"+id);  
                                            }
                                          ;break;
                                          
                                         case 20:
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,14,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i12->c20p22i14"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,30,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i28->c20p22i30"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,22,46,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p20i44->c20p22i46"); 
                                          break;
                                           default:System.out.println("default:c20p20i"+id);   
                                            }
                                          ;break;
                                          
                                      case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,8,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i14->c20p16i8"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,24,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i30->c20p16i24"); 
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi20.getCubi20BranchGroup(myJ3dFrame.cubi20BranchGroup,16,40,myJ3dFrame.cubi20.colors);
                                         //System.out.println("c20p22i46->c20p16i40"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c20p22i"+id);   
                                            }
                                          ;break;
                                
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi20BranchGroup);
                                         myJ3dFrame.cubi20BranchGroup=branchGroup;
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi20BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi20) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi20BranchGroup); 
                                          
                                      }
                                       ;break;
                        case 21: //cubi21
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi21.getPlace();
                                        int id=myJ3dFrame.cubi21.getId();
                                       
                                        BranchGroup branchGroup=null;
                                      switch(place) {
                                       
                                        case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,27,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p17i25->c21p19i27"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,19,45,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p17i43->c21p19i45"); 
                                          break;                                                 
                                          
                                           default:
                                           	  //System.out.println("default:c21p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 27:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,29,myJ3dFrame.cubi21.colors);
                                        //System.out.println("c21p19i27->c21p21i29"); 
                                          break;
                                          
                                          case 45:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,47,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p19i45->c21p21i47"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c21p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,31,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i29->c21p23i31"); 
                                          break;
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,23,41,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i47->c21p23i41"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c21p21i"+id);   
                                            }
                                          ;break;
                                       
                                       case 23:
                                          switch(id)
                                         {
                                          case 31:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,25,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p23i31->c21p17i25"); 
                                          break;
                                          
                                          case 41:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,43,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p23i41->c21p17i43"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c21p23i"+id);   
                                            }
                                          ;break;
                                          
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                       ;break;
                          case 22: //cubi22
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi22.getPlace();
                                        int id=myJ3dFrame.cubi22.getId();
                                       
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                        
                                      case 16:
                                          switch(id)
                                         {
                                          case 8:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,10,myJ3dFrame.cubi22.colors);
                                            //System.out.println("c22p16i8->c22p18i10"); 
                                             break;
                                          
                                          case 24:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,26,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i24->c22p18i26"); 
                                          break;
                                          
                                          case 40:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,18,42,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p16i40->c22p18i42"); 
                                          break;
                                          default:
                                          	 //System.out.println("default:c22p16i"+id); 
                                            }
                                          ;break;
                                          
                                        case 18:
                                          switch(id)
                                         {
                                          case 10:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,12,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i10->c22p20i12"); 
                                          break;
                                          
                                          case 26:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,28,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i26->c22p20i28"); 
                                          break;
                                          
                                          case 42:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,20,44,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p18i42->c22p20i44"); 
                                          break;
                                            default:
                                            	System.out.println("default:c22p18i"+id);  
                                            }
                                          ;break;
                                          
                                       case 20:
                                          switch(id)
                                         {
                                          case 12:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,14,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i18->c22p22i14"); 
                                          break;
                                          
                                          case 28:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,30,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i13->c22p22i30"); 
                                          break;
                                          
                                          case 44:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,22,46,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p20i21->c22p22i46"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p20i"+id);   
                                            }
                                          ;break;
                                          
                                      case 22:
                                          switch(id)
                                         {
                                          case 14:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,8,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i14->c22p16i8"); 
                                          break;
                                          
                                          case 30:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,24,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i30->c22p16i24"); 
                                          break;
                                          
                                          case 46:branchGroup=myJ3dFrame.cubi22.getCubi22BranchGroup(myJ3dFrame.cubi22BranchGroup,16,40,myJ3dFrame.cubi22.colors);
                                         //System.out.println("c22p22i46->c22p16i40"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c22p22i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi22BranchGroup);
                                         myJ3dFrame.cubi22BranchGroup=branchGroup;
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi22BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi22) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi22BranchGroup); 
                                          
                                      }
                                       ;break;
                         case 23: //cubi23
                                   if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi23.getPlace();
                                        int id=myJ3dFrame.cubi23.getId();
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {

                                        case 17:
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,13,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i11->c23p19i13"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,19,27,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i25->c23p19i27"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c23p17i"+id);   
                                            }
                                          ;break;
                                          
                                        case 19:
                                          switch(id)
                                         {
                                          case 13:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,21,15,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p19i13->c23p21i15"); 
                                          break;
                                          
                                          case 27:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,21,29,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p19i27->c23p21i29"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c23p19i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 15:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,9,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p21i15->c23p23i9"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,23,31,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p21i29->c23p23i31"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c23p21i"+id);   
                                            }
                                          ;break;
                                        
                                       case 23:
                                          switch(id)
                                         {
                                          case 9:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,11,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i9->c23p17i11"); 
                                          break;
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,25,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p23i31->c23p17i25"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c23p23i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                      break;
                                      
                              case 9: //cubi9 ist Drehachse
                                      if(setU.contains(i))
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
                                        
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.cubi9BranchGroup=branchGroup;
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup);
                                        } 
                                       
                                 break;
                              
                                 case 11: //cubi11
                                 if(setU.contains(i))
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
                                                                              
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi11BranchGroup);
                                         myJ3dFrame.cubi11BranchGroup=branchGroup;
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi11) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi11BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                 case 13: //cubi13
                                 if(setU.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi13.getPlace();
                                        int id=myJ3dFrame.cubi13.getId();
                                                                                
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
                                            	System.out.println("default:c13p9"+id);  
                                            }
                                         break;
                                         
                                          case 11:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,11,3,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p11i3->c13p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p11"+id);  
                                            }
                                         break;
                                         
                                          case 13:
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
                                          //System.out.println("c13p25i25->c13p25i25"+id);
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p25"+id);  
                                            }
                                         break;
                                        } 
                                                                             
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi13BranchGroup);
                                         myJ3dFrame.cubi13BranchGroup=branchGroup;
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi13) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi13BranchGroup); 
                                          
                                      }
                                       ;break;
                              
                              case 15: //cubi15
                                 if(setU.contains(i))
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
                                          //System.out.println("c15p15i7->c15p15i7");
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
                                        
                                      
                                         myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi15BranchGroup);
                                         myJ3dFrame.cubi15BranchGroup=branchGroup;
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi15) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi15BranchGroup); 
                                          
                                      }
                                       ;break;
                                   
                             case 24: //cubi24 ist Drehachse
                                      if(setU.contains(i))
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
                                                                              
                                       
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                        if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);
                                        } 
                                       ;break;
                                       
                                     
                            case 25: //cubi25 ist Drehachse
                                       if(setU.contains(i))
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
                                        
                                       
                                       
                                       myJ3dFrame.plainU.removeChild(myJ3dFrame.cubi25BranchGroup);
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
                 
                myJ3dFrame.URotationInterpolator.setMinimumAngle(myJ3dFrame.Uwinkel+0f);
                myJ3dFrame.URotationInterpolator.setMaximumAngle(myJ3dFrame.Uwinkel-(float)Math.PI/2);
                myJ3dFrame.Ualpha.setStartTime(System.currentTimeMillis()+100);
                myJ3dFrame.Uwinkel=myJ3dFrame.Uwinkel-((float) Math.PI/2);
                 f=finish();
                while(!f){ f=finish();}
               //System.out.println("up <--");
               }
            
            }
    
    public Rotupp(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    {  this.myJ3dFrame=myJ3dFrame;    
    	rotAchseup=new Button("u"); 
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
