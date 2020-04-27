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
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
public class Rot_M_invX extends Rot
{ static J3dFrame myJ3dFrame;
	Button rotAchse_M_invX;
   static boolean f;
   static Set<Integer> setR=new HashSet<Integer>();
 
    Button getrotAchse_M_invX()
    { return rotAchse_M_invX;
      }
 
    
    static public void M_invX_Action()
   {        if(myJ3dFrame.showCubi1) setR.add(1);
            if(myJ3dFrame.showCubi5) setR.add(5);
            if(myJ3dFrame.showCubi9) setR.add(9);
            if(myJ3dFrame.showCubi13) setR.add(13);
            if(myJ3dFrame.showCubi17) setR.add(17);
            if(myJ3dFrame.showCubi21) setR.add(21);
            if(myJ3dFrame.showCubi24) setR.add(24);
            if(myJ3dFrame.showCubi25) setR.add(25);
            ActionFrame.textArea.append("m");
            
            
           int[] nrArray=new int[26];
           int[] placeArray=new int[26];                    
               f=finish();
                while(!f){ f=finish();}
          if(finish())
                {  placeArray=fillPlaceArray();
                    nrArray=fillNrArray(placeArray);
                    //arrayAusgabe(nrArray,placeArray);
                  //System.out.println("M_x -->");
                   //zustandsAusgabe(nrArray,placeArray,setR);
                    //myJ3dFrame.showCubisVisible();
                    
                    for (int i=0;i<26;i++) //ist der place ich brauche die nr 
                    switch(nrArray[i])
                       { case 0:
                                 if(setR.contains(i))
                                      {
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi0BranchGroup);
                                       if(myJ3dFrame.showCubi0) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi0BranchGroup);
                                    };break;
                         case 1: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi1BranchGroup);
                                       if(myJ3dFrame.showCubi1) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi1BranchGroup);
                                    };break;
                         case 2: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi2BranchGroup);
                                       if(myJ3dFrame.showCubi2) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi2BranchGroup);
                                    };break;
                         case 3: if(setR.contains(i))
                                      { 
                                       myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi3BranchGroup);
                                       if(myJ3dFrame.showCubi3) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi3BranchGroup);
                                       
                                    };break;
                         case 4: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi4BranchGroup);
                                       if(myJ3dFrame.showCubi4) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi4BranchGroup);
                                      
                                    };break;
                         case 5: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi5BranchGroup);
                                       if(myJ3dFrame.showCubi5) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi5BranchGroup);
                                      };break; 
                         case 6: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi6BranchGroup);
                                       if(myJ3dFrame.showCubi6) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi6BranchGroup);
                                      };break;
                         case 7: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi7BranchGroup);
                                       if(myJ3dFrame.showCubi7) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi7BranchGroup);
                                      };break;
                         case 8: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi8BranchGroup);
                                       if(myJ3dFrame.showCubi8) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi8BranchGroup);
                                      };break;
                         case 9: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi9BranchGroup);
                                       if(myJ3dFrame.showCubi9) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi9BranchGroup);
                                      };break;
                         case 10: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi10BranchGroup);
                                       if(myJ3dFrame.showCubi10) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi10BranchGroup);
                                       };break;
                         case 11: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi11BranchGroup);
                                       if(myJ3dFrame.showCubi11) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi11BranchGroup);
                                      };break;                                                    
                         case 12: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi12BranchGroup);
                                       if(myJ3dFrame.showCubi12) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi12BranchGroup);
                                      };break;
                         case 13: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi13BranchGroup);
                                       if(myJ3dFrame.showCubi13) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi13BranchGroup);
                                      };break;
                         case 14: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi14BranchGroup);
                                       if(myJ3dFrame.showCubi14) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi14BranchGroup);
                                      };break;
                         case 15: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi15BranchGroup);
                                       if(myJ3dFrame.showCubi15) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi15BranchGroup);
                                      };break;
                         case 16: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi16BranchGroup);
                                       if(myJ3dFrame.showCubi16) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi16BranchGroup);
                                      };break;
                         case 17: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi17BranchGroup);
                                       if(myJ3dFrame.showCubi17) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi17BranchGroup);
                                      };break;
                         case 18: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi18BranchGroup);
                                       if(myJ3dFrame.showCubi18) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi18BranchGroup);
                                      };break;
                         case 19: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi19BranchGroup);
                                       if(myJ3dFrame.showCubi19) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi19BranchGroup);
                                      };break;
                         case 20: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi20BranchGroup);
                                       if(myJ3dFrame.showCubi20) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi20BranchGroup);
                                      };break;
                         case 21: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi21BranchGroup);
                                       if(myJ3dFrame.showCubi21) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi21BranchGroup);
                                      };break;
                         case 22: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi22BranchGroup);
                                       if(myJ3dFrame.showCubi22) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi22BranchGroup);
                                      };break;
                         case 23: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi23BranchGroup);
                                       if(myJ3dFrame.showCubi23) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi23BranchGroup);
                                      };break;
                         case 24: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       if(myJ3dFrame.showCubi24) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi24BranchGroup);
                                      };break;
                         case 25: if(setR.contains(i))
                                      {myJ3dFrame.sceneBranchGroup.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi25BranchGroup);
                                       if(myJ3dFrame.showCubi25) myJ3dFrame.plainR.addChild(myJ3dFrame.cubi25BranchGroup);
                                      };break;
                        }
                //Vorbereitung -->
                               
                f=finish();
                while(!f){ f=finish();}
                 if(finish())
                {
                    
               myJ3dFrame.RRotationInterpolator.setMinimumAngle(myJ3dFrame.Rwinkel+0f);
               myJ3dFrame.RRotationInterpolator.setMaximumAngle(myJ3dFrame.Rwinkel+(float)Math.PI/2);//-
               myJ3dFrame.Ralpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Rwinkel=myJ3dFrame.Rwinkel+((float) Math.PI/2);//-
              
                f=finish();
                while(!f){ f=finish();}
                    
                } 
                               
                //Nachbereitung
                
                for (int i=0;i<26;i++)                                                                                                                                                                                                                                                                     
                     switch(nrArray[i])// nrArray[i] gibt das Cubi auf Platz i a
                       { case 1: 
                         if(setR.contains(i))
                                 {                                  
                                        int id=myJ3dFrame.cubi1.getId();
                                        int place =myJ3dFrame.cubi1.getPlace();
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      {                                      	  
                                      	 case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,39,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p1i1->c1p5i39"); 
                                          break;                                          
                                          case 35:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,5,5,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p1i35->c1p5i5"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c1p1i"+id);  
                                            }
                                          ;break;
                                      	  
                                         case 5:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,47,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p5i39->c1p21i47<"); 
                                          break;                                          
                                          case 5:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,21,29,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p5i5->c1p21i29"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c3p5i"+id);   
                                            }
                                          ;break;
                                          
                                          case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,25,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i47->c1p17i25"); 
                                          break;                                          
                                          case 29:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,17,43,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p21i29->c1p17i43"); 
                                          break;
                                                                                                            
                                           default:
                                           	  //System.out.println("default:c1p21i"+id);   
                                            }
                                          ;break;  
                                                                                  
                                         case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,1,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p17i25->c1p1i1"); 
                                          break;                                          
                                          case 43:branchGroup=myJ3dFrame.cubi1.getCubi1BranchGroup(myJ3dFrame.cubi1BranchGroup,1,35,myJ3dFrame.cubi1.colors);
                                         //System.out.println("c1p17i43->c1p1i35"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c1p17i"+id);  
                                            }
                                          ;break;
                                                                                 
                                          }                                          
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi1BranchGroup);
                                         myJ3dFrame.cubi1BranchGroup=branchGroup;
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi1BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi1) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi1BranchGroup); 
                                      
                                       };break;
                                       
                         case 3://cubi3  
                                 if(setR.contains(i))
                                  { 
                                        int place =myJ3dFrame.cubi3.getPlace();
                                        int id=myJ3dFrame.cubi3.getId();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                     
                                        case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,39,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i1->c3p5i39"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,5,5,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p1i35->c3p5i5"); 
                                          break;
                                                                                           
                                           default:
                                           	  //System.out.println("default:c3p1i"+id);   
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,47,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i39->c3p21i47"); 
                                          break;
                                          
                                          case 5:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,21,29,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p5i5->c3p21i29"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c3p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,25,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i47->c3p17i25"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,17,43,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p21i29->c3p17i43"); 
                                          break;
                                          default:
                                          	 //System.out.println("default:c3p21i"+id);   
                                            }
                                          ;break;
                                          
                                          case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,1,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i25->c3p1i1"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi3.getCubi3BranchGroup(myJ3dFrame.cubi3BranchGroup,1,35,myJ3dFrame.cubi3.colors);
                                         //System.out.println("c3p17i43->c3p1i35"); 
                                          break;
                                                                                                                             
                                          default:
                                          	 //System.out.println("default:c3p17i"+id);   
                                            }
                                          ;break;
                                        
                                          }
                                           
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi3BranchGroup);
                                         myJ3dFrame.cubi3BranchGroup=branchGroup;
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi3BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         //myJ3dFrame.plainD.addChild(myJ3dFrame.cubi3BranchGroup);
                                         if(myJ3dFrame.showCubi3) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi3BranchGroup); 
                                      
                                    }
                                        ;break;
                                                                                                                                                                                                                                                                                                                                                
                         
                         case 5: //cubi5
                           if(setR.contains(i))
                                 { 
                                       int id=myJ3dFrame.cubi5.getId();
                                       int place =myJ3dFrame.cubi5.getPlace();
                                       
                                       BranchGroup branchGroup=null;
                                       
                                      switch(place)                                                                                                                                                                                                                                                                       	 
                                        {                                                                                   
                                         case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,39,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p1i1->c5p5i39"); 
                                          break;                                                                                   	 
                                          case 35:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,5,5,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p1i35->c5p5i5"); 
                                          break;
                                                                                  
                                            default:
                                            	System.out.println("default:c5p1i"+id);  
                                            }
                                          ;break;                                                                                                                                                                                                                                                                           	 
                                          
                                          case 5:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,47,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p5i39->c5p21i47"); 
                                          break;                                                                                   	 
                                          case 5:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,21,29,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p5i5->c5p21i29"); 
                                          break;
                                                                                  
                                            default:
                                            	System.out.println("default:c5p5i"+id);  
                                            }
                                          ;break;                                                                                                                                                                                                                                                                            	 
                                          
                                          case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,25,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p21i47->c5p17i25"); 
                                          break;                                                                                   	 
                                          case 29:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,17,43,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p21i29->c5p17i43"); 
                                          break;
                                                                                  
                                            default:
                                            	System.out.println("default:c5p21i"+id);  
                                            }
                                          ;break;                                                                                                                                                                                                                                                                          	 
                                          
                                        case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,1,myJ3dFrame.cubi5.colors);
                                         //System.out.println("c5p17i25->c5p1i1"); 
                                          break;                                                                                   	 
                                          case 43:branchGroup=myJ3dFrame.cubi5.getCubi5BranchGroup(myJ3dFrame.cubi5BranchGroup,1,35,myJ3dFrame.cubi5.colors);
                                         //System.out.println(">c5p17i43->c5p1i35"); 
                                          break;
                                                                                  
                                            default:
                                            	System.out.println("default:c5p17i"+id);  
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi5BranchGroup);
                                         myJ3dFrame.cubi5BranchGroup=branchGroup;
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi5BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                        
                                         if(myJ3dFrame.showCubi5) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi5BranchGroup); 
                                        } 
                                         break;
                                         
                          case 7: //cubi7
                                 if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi7.getPlace();
                                        int id=myJ3dFrame.cubi7.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                      	  
                                      	 case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,39,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p1i1->c7p5i39"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,5,5,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p1i35->c7p5i5"); 
                                          break;
                                                                                   
                                           default:
                                           	  //System.out.println("default:c7p1i"+id);   
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,47,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p5i39->c7p21i47");
                                          break;
                                          
                                          case 5:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,21,29,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p5i5->c7p21i29"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c7p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,25,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i47->c7p17i25"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,17,43,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p21i29->c7p17i43"); 
                                          break;
                                                                                    
                                           default:
                                           	  //System.out.println("default:c7p21i"+id);   
                                            }
                                          ;break;
                                      

                                        case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,1,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p17i25->c7p1i1"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi7.getCubi7BranchGroup(myJ3dFrame.cubi7BranchGroup,1,35,myJ3dFrame.cubi7.colors);
                                         //System.out.println("c7p17i43->c7p1i35"); 
                                          break;
                                                  
                                          default:
                                          	 //System.out.println("default:c7p17i"+id);   
                                            }
                                          ;break;

                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi7BranchGroup);
                                         myJ3dFrame.cubi7BranchGroup=branchGroup;
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi7BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi7) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi7BranchGroup); 
                                          
                                      }
                                       ;break;
                          case 8: //cubi8
                                 if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi8.getPlace();
                                        int id=myJ3dFrame.cubi8.getId();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)
                                      {
                                         case 1:
                                         switch(id)
                                         {
                                          case 19:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,37,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p1i19->c8p5i37"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,5,23,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p1i33->c8p5i23"); 
                                          break;
                                          
                                          
                                           default:
                                           	  //System.out.println("default:c8p1i"+id);   
                                            }
                                          ;break;
                                          
                                            case 5:
                                          switch(id)
                                         {
                                          case 37:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,13,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i37->c8p21i13"); 
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,21,31,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p5i23->c8p21i31"); 
                                          break;
                                        
                                          
                                            default:
                                            	System.out.println("default:c8p5i"+id);  
                                            }
                                          ;break;
                                          
                                          case 21:
                                          switch(id)
                                         {
                                          case 13:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,27,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p21i13->c8p17i27"); 
                                          break; 
                                         	 
                                          case 31:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,17,9,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p21i31->c8p17i9"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c8p21i"+id);   
                                            }
                                          ;break;

                                        case 17:
                                          switch(id)
                                         { 
                                         	 
                                         case 27:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,19,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i27->c8p1i19"); 
                                          break; 
                                          
                                         case 9:branchGroup=myJ3dFrame.cubi8.getCubi8BranchGroup(myJ3dFrame.cubi8BranchGroup,1,33,myJ3dFrame.cubi8.colors);
                                         //System.out.println("c8p17i9->c8p1i33"); 
                                          break;
                                         	                                         	                                         
                                           default:
                                           	  //System.out.println("default:c8p17i"+id);   
                                            }
                                          ;break;
                                         
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi8BranchGroup);
                                         myJ3dFrame.cubi8BranchGroup=branchGroup;
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi8BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi8) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi8BranchGroup); 
                                          
                                      }
                                       ;break;
                                      
                                      
                                       
                           case 10: //cubi10
                                   if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi10.getPlace();
                                        int id=myJ3dFrame.cubi10.getId();
                                                                              
                                        BranchGroup branchGroup=null;
                                        
                                  switch(place) 
                                  {                                        
                                        case 1:
                                          switch(id)
                                         {
                                          case 19:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,37,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i18->c10p5i37"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,5,23,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p1i32->c10p5i23"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c10p1i"+id);   
                                            }
                                          ;break;
                                          
                                           case 5:
                                          switch(id)
                                         {                                         	 
                                          case 37:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,13,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i11->c10p21i13"); 
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,21,31,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p19i29->c10p21i31"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c10p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                         	 
                                          case 13:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,27,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p21i13->c10p17i27"); 
                                          break;	
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,17,9,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c10p21i31->c10p17i9"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c10p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 17:
                                          switch(id)
                                         {
                                        
                                          case 27:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,19,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c17p17i27->c10p1i19"); 
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi10.getCubi10BranchGroup(myJ3dFrame.cubi10BranchGroup,1,33,myJ3dFrame.cubi10.colors);
                                         //System.out.println("c17p17i9->c10p1i33"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c10p17i"+id);   
                                            }
                                          ;break;

                                      }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi10BranchGroup);
                                         myJ3dFrame.cubi10BranchGroup=branchGroup;
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi10BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi10) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi10BranchGroup); 
                                          
                                      }
                                       ;break;
                                  
                        case 12: //cubi12
                                   if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi12.getPlace();
                                        int id=myJ3dFrame.cubi12.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                switch(place) 
                                {                                                                                                                  
                                         case 1:
                                          switch(id)
                                         {
                                          case 19:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,37,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i18->c12p5i37"); 
                                          break;
                                          
                                          case 33:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,5,23,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p1i32->c12p5i23"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c12p1i"+id);   
                                            }
                                          ;break;
                                          
                                           case 5:
                                          switch(id)
                                         {                                         	 
                                          case 37:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,13,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i11->c12p21i13"); 
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,21,31,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p19i29->c12p21i31"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c12p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                         	 
                                          case 13:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,27,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p21i13->c12p17i27"); 
                                          break;	
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,17,9,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p21i31->c12p17i9"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c12p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 17:
                                          switch(id)
                                         {
                                        
                                          case 27:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,19,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p17i27->c12p1i19"); 
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi12.getCubi12BranchGroup(myJ3dFrame.cubi12BranchGroup,1,33,myJ3dFrame.cubi12.colors);
                                         //System.out.println("c12p17i9->c12p1i33"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c12p17i"+id);   
                                            }
                                          ;break;

                                     }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi12BranchGroup);
                                         myJ3dFrame.cubi12BranchGroup=branchGroup;
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi12BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi12) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi12BranchGroup); 
                                          
                                      }
                                       ;break;
                                      
                         
                        case 14: //cubi14
                                   if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi14.getPlace();
                                        int id=myJ3dFrame.cubi14.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                                                                                                   
                                        case 1:
                                          switch(id)
                                         {
                                          case 19:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,37,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p1i18->c14p5i37"); 
                                          break;
                                                                                    
                                          case 33:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,5,23,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p1i32->c14p5i23"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c14p1i"+id);   
                                            }
                                          ;break;
                                          
                                           case 5:
                                          switch(id)
                                         {                                         	 
                                          case 37:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,13,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i11->c14p21i13"); 
                                          break;
                                          
                                          case 23:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,21,31,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p19i29->c14p21i31"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c14p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                         	 
                                          case 13:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,27,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i13->c14p17i27"); 
                                          break;	
                                          
                                          case 31:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,17,9,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p21i31->c14p17i9"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c14p21i"+id);   
                                            }
                                          ;break;
                                          
                                         case 17:
                                          switch(id)
                                         {
                                        
                                          case 27:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,19,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p17i27->c14p1i19"); 
                                          break;
                                          
                                          case 9:branchGroup=myJ3dFrame.cubi14.getCubi14BranchGroup(myJ3dFrame.cubi14BranchGroup,1,33,myJ3dFrame.cubi14.colors);
                                         //System.out.println("c14p17i9->c14p1i33"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c14p17i"+id);   
                                            }
                                          ;break;
                                          
                                         }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi14BranchGroup);
                                         myJ3dFrame.cubi14BranchGroup=branchGroup;
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi14BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi14) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi14BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                               
                                       
                             case 17: //cubi17
                                 if(setR.contains(i))
                                 {                                         
                                        int id=myJ3dFrame.cubi17.getId();
                                        int place =myJ3dFrame.cubi17.getPlace();
                                                                               
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                      	  
                                      	  case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,39,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p1i1->c17p5i39"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,5,5,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p1i35->c17p5i5"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c17p1i"+id);  
                                            }
                                          ;break;
                                          
                                         case 5:
                                          switch(id)
                                         {
                                          
                                          case 39:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,47,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p5i39->c17p21i47"); 
                                          break;
                                          
                                          case 5:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,21,29,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p5i5->c17p21i29"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p5i"+id);   
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,25,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p21i47->c17p17i25"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,17,43,myJ3dFrame.cubi17.colors);
                                         //System.out.println("c17p21i29->c17p17i43"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c17p21i"+id);   
                                            }
                                          ;break;
                                         
                                          case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,1,myJ3dFrame.cubi17.colors);
                                         //System.out.println(">c17p17i25->c17p1i1"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi17.getCubi17BranchGroup(myJ3dFrame.cubi17BranchGroup,1,35,myJ3dFrame.cubi17.colors);                                                                                                                                                                                                                           
                                         //System.out.println("c17p17i43->c17p1i35"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c17p17i"+id);  
                                            }
                                          ;break;
                                                                                                                                                                                                                                   
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi17BranchGroup);
                                         myJ3dFrame.cubi17BranchGroup=branchGroup;
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi17BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi17) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi17BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                        case 19: //cubi19
                                   if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi19.getPlace();
                                        int id=myJ3dFrame.cubi19.getId();
                                        
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) 
                                      {                                       
                                        case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,39,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p1i1->c19p5i39"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,5,5,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p1i35->c19p5i5"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c19p1i"+id);   
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,47,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p5i39->c19p21i47");
                                          break;
                                          
                                          case 5:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,21,29,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p5i5->c19p21i29"); 
                                          break;
                                         
                                            default:
                                            	System.out.println("default:c19p5i"+id);  
                                            }
                                          ;break;
                                          
                                        case 21:
                                          switch(id)
                                         {
                                          case 47:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,25,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p21i47->c19p17i25"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,17,43,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p21i29->c19p17i43"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c19p21i"+id);   
                                            }
                                          ;break;
                                          
                                        case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,1,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p17i25->c19p1i1"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi19.getCubi19BranchGroup(myJ3dFrame.cubi19BranchGroup,1,35,myJ3dFrame.cubi19.colors);
                                         //System.out.println("c19p17i43->c19p1i35"); 
                                          break;
                                         
                                           default:
                                           	  //System.out.println("default:c19p17i"+id);   
                                            }
                                          ;break;
                                         
                                       }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi19BranchGroup);
                                         myJ3dFrame.cubi19BranchGroup=branchGroup;
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi19BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi19) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi19BranchGroup); 
                                          
                                      }
                                       ;break;
                          
                           
                        case 21: //cubi21
                                   if(setR.contains(i))
                                 {                                                                            
                                        int id=myJ3dFrame.cubi21.getId();
                                        int place =myJ3dFrame.cubi21.getPlace();
                                                                               
                                      BranchGroup branchGroup=null;
                                      
                                      switch(place) 
                                      {                                        
                                          case 1:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,39,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p1i1->c21p5i39"); 
                                          break;
                                          
                                          case 35:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,5,5,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p1i35->c21p5i5"); 
                                          break;
                                                                                   
                                            default:
                                            	System.out.println("default:c21p1i"+id);  
                                            }
                                          ;break;
                                          
                                           case 5:
                                          switch(id)
                                         {
                                          case 39:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,47,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p5i39->c21p21i47"); 
                                          break;
                                                                                   
                                          case 5:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,21,29,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p5i5->c21p21i29"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p5i"+id);   
                                            }
                                          ;break;
                                          
                                          case 21:
                                          switch(id)
                                         {
                                          
                                          case 47:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,25,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i47->c21p17i25"); 
                                          break;
                                          
                                          case 29:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,17,43,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p21i29->c21p17i43"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p21i"+id);   
                                            }
                                          ;break;


                                          case 17:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,1,myJ3dFrame.cubi21.colors);
                                         //System.out.println(">c21p17i25->c21p1i1<"); 
                                          break;
                                          
                                          case 43:branchGroup=myJ3dFrame.cubi21.getCubi21BranchGroup(myJ3dFrame.cubi21BranchGroup,1,35,myJ3dFrame.cubi21.colors);
                                         //System.out.println("c21p17i25->c21p1i35"); 
                                          break;
                                           default:
                                           	  //System.out.println("default:c21p17i"+id);   
                                            }
                                          ;break;
                                          
                                                                           
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi21BranchGroup);
                                         myJ3dFrame.cubi21BranchGroup=branchGroup;
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi21BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi21) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi21BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 23: //cubi23
                                   if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi23.getPlace();
                                        int id=myJ3dFrame.cubi23.getId();
                                       
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {

                                        case 1:
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,21,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p1i1->c23p5i21"); 
                                          break;
                                          
                                          case 17:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,5,7,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i17->c23p5i7"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c23p1i"+id);   
                                            }
                                          ;break;
                                          
                                        case 5:
                                          switch(id)
                                         {
                                          case 21:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,21,29,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p5i21->c23p21i29"); 
                                          break;
                                          
                                          case 7:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup, 21,15,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p5i7->c23p21i15"); 
                                          break;
                                          
                                            default:
                                            	System.out.println("default:c23p5i"+id);  
                                            }
                                          ;break;
                                          
                                         case 21:
                                          switch(id)
                                         {
                                          case 29:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,11,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p21i29->c23p17i11"); 
                                          break;
                                          
                                          case 15:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,17,25,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p21i15->c23p17i25"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c23p21i"+id);   
                                            }
                                          ;break;
                                        
                                        case 17:
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,3,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i11->c23p1i3"); 
                                          break;
                                          
                                          case 25:branchGroup=myJ3dFrame.cubi23.getCubi23BranchGroup(myJ3dFrame.cubi23BranchGroup,1,17,myJ3dFrame.cubi23.colors);
                                         //System.out.println("c23p17i25->c23p1i17"); 
                                          break;
                                          
                                           default:
                                           	  //System.out.println("default:c23p17i"+id);   
                                            }
                                          ;break;
                                          
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi23BranchGroup);
                                         myJ3dFrame.cubi23BranchGroup=branchGroup;
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi23BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi23) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi23BranchGroup); 
                                          
                                      }
                                      ;break;
                                      
                                case 9: //cubi9 
                                 if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi9.getPlace();
                                        int id=myJ3dFrame.cubi9.getId();
                                                                                
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,24,32,myJ3dFrame.cubi9.colors);
                                         //System.out.println(">c9p9i1->c9p24i32<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c9p9i"+id);
                                            }
                                          ;break;
                                          
                                         case 11: //Drehachse
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,11,3,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p11i3->c9p11i3");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p11i"+id);  
                                            }
                                         break;
                                         
                                         case 13: 
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,25,25,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p13i5->c9p25i25");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15: //Drehachse
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,15,7,myJ3dFrame.cubi9.colors);
                                          //System.out.println("c9p15i7->c9p15i7");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c9p15i"+id);  
                                            }
                                         break; 
                                          
                                          
                                          case 24:
                                         switch(id)
                                          {case 32:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,13,5,myJ3dFrame.cubi9.colors); 
                                           //System.out.println(">c9p24i32->c9p9i1");
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c9p24i"+id);  
                                            }
                                          ;break;
                                          
                                          case 25:
                                         switch(id)
                                          {case 25:branchGroup=myJ3dFrame.cubi9.getCubi9BranchGroup(myJ3dFrame.cubi9BranchGroup,9,1,myJ3dFrame.cubi9.colors); 
                                           //System.out.println(">c9p25i25->c9p9i1"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c9p25i"+id);  
                                            }
                                          ;break;                                                                                                                                                                                                                                                                                                                      
                                          
                                         
                                          }
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi9BranchGroup);
                                         myJ3dFrame.cubi9BranchGroup=branchGroup;
                                         myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi9BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi9BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi9) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi9BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 11: //cubi11
                                 if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi11.getPlace();
                                        int id=myJ3dFrame.cubi11.getId();                                       
                                        
                                        BranchGroup branchGroup=null;
                                        
                                         switch(place)
                                       { 
                                       	 case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,24,32,myJ3dFrame.cubi11.colors);
                                         //System.out.println(">c11p9i1->c11p24i32<"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c11p9i"+id);
                                            }
                                          ;break;
                                          
                                          case 11: //Drehachse
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,11,3,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p11i3->c11p11i3");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p11i"+id);  
                                            }
                                         break;
                                         
                                         case 13: 
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,25,25,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p13i5->c11p25i25");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15: //Drehachse
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,15,7,myJ3dFrame.cubi11.colors);
                                          //System.out.println("c11p15i7->c11p15i7");
                                          break;                                                                                    
                                                                                                                            
                                           default:
                                           	  //System.out.println("default:c11p15i"+id);  
                                            }
                                         break;
                                          
                                          
                                         case 24:
                                         switch(id)
                                          {case 32:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,13,5,myJ3dFrame.cubi11.colors); 
                                           //System.out.println(">c11p24i32->c11p13i5"); 
                                            break;
                                                                                                                             
                                            default:
                                            	System.out.println("default:c11p24i"+id);  
                                            }
                                          ;break;
                                                                                                                        	   
                                         case 25: 
                                         switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi11.getCubi11BranchGroup(myJ3dFrame.cubi11BranchGroup,9,1,myJ3dFrame.cubi11.colors);
                                          	//System.out.println("c11p25i25->c11p9i1");
                                          	break;
                                                                                                                   
                                           default:
                                           	  //System.out.println("default:c11p25i"+id);  
                                            }
                                         break;                                                                                                                                                                                                                                                                                                                         
                                        
                                        }
                                                                              
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi11BranchGroup);
                                         myJ3dFrame.cubi11BranchGroup=branchGroup;
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi11BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi11) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi11BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 13: // ids nicht eindeutig: auf andere übertragen
                                 if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi13.getPlace();
                                        int id=myJ3dFrame.cubi13.getId();

                                        BranchGroup branchGroup=null;
                                        
                                     switch(place) {
                                      	  case 9:
                                          switch(id)
                                          {
                                          case 1:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,24,32,myJ3dFrame.cubi13.colors);
                                         //System.out.println("c13p9i1->c13p24i32"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p9i"+id);
                                            }
                                          ;break;
                                          
                                          case 11: //Drehachse
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,11,3,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p11i3->c13p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p11i"+id);  
                                            }
                                         break;
                                         
                                         case 13: 
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,25,25,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p13i5->c13p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15: //Drehachse
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,15,7,myJ3dFrame.cubi13.colors);
                                          //System.out.println("c13p15i7->c13p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c13p15i"+id);  
                                            }
                                         break;
                                          
                                          
                                          case 24:
                                          switch(id)
                                          {
                                          case 32:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,13,5,myJ3dFrame.cubi13.colors);
                                         //System.out.println("c13p24i32->c13p13i5"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p24i"+id);
                                            }
                                          ;break;
                                          
                                        
                                         case 25:
                                          switch(id)
                                          {
                                          case 25:branchGroup=myJ3dFrame.cubi13.getCubi13BranchGroup(myJ3dFrame.cubi13BranchGroup,9,1,myJ3dFrame.cubi13.colors);
                                         //System.out.println("c13p25i25->c13p9i1"); 
                                          break;// 
                                                                                    
                                          default:
                                          	 //System.out.println("default:c13p25i"+id);
                                            }
                                          ;break;
                                         
                                       }                                        
                                     
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi13BranchGroup);
                                         myJ3dFrame.cubi13BranchGroup=branchGroup;
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi13BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                         if(myJ3dFrame.showCubi13) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi13BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                 case 15: //cubi15
                                 if(setR.contains(i))
                                     { 
                                        int place =myJ3dFrame.cubi15.getPlace();
                                        int id=myJ3dFrame.cubi15.getId();                                        
                                        
                                        BranchGroup branchGroup=null;
                                        
                                         switch(place)
                                       {                                                                                                                                                                                                                                                                                                                                                                      
                                       	 case 9:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,24,32,myJ3dFrame.cubi15.colors);
                                         //System.out.println(">c15p9i1->c15p24i32<");
                                          break;                                                                                                                                                                                                              
                                          default:
                                          	 //System.out.println("default:c15p25i"+id);  
                                            }
                                         break;
                                         
                                          case 11://Drehachse
                                          switch(id)
                                         {
                                          case 3:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,11,3,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p11i3->c15p11i3");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p11i"+id);  
                                            }
                                         break;
                                         
                                         case 13:
                                          switch(id)
                                         {
                                          case 5:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,25,25,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p13i5->c15p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15://Drehachse
                                          switch(id)
                                         {
                                          case 7:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,15,7,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p15i7->c15p15i7");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p15i"+id);  
                                            }
                                         break;
                                         
                                         
                                          case 24:
                                          switch(id)
                                         {
                                          case 32:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,13,5,myJ3dFrame.cubi15.colors);
                                          //System.out.println("c15p24i32->c15p13i5");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c15p24i"+id);  
                                            }
                                         break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                                         case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi15.getCubi15BranchGroup(myJ3dFrame.cubi15BranchGroup,9,1,myJ3dFrame.cubi15.colors);
                                         //System.out.println("c15p25i25->c15p9i1");
                                          break;                                                                                                                                                                                                                                                         
                                            default:
                                            	System.out.println("default:c15p25i"+id);  
                                            }
                                         break;
                                        
                                        } 
                                                                             
                                         myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi15BranchGroup);
                                         myJ3dFrame.cubi15BranchGroup=branchGroup;
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                         myJ3dFrame.cubi15BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );
                                         
                                         if(myJ3dFrame.showCubi15) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi15BranchGroup); 
                                          
                                      }
                                       ;break;
                                       
                                case 24: //  cubi24                                    	  
                                      if(setR.contains(i))
                                      { int place =myJ3dFrame.cubi24.getPlace();
                                        int id=myJ3dFrame.cubi24.getId();
                                        BranchGroup branchGroup=null;
                                        
                                      switch(place)                                                                                                                                                                                                                                                                            
                                      {                                      	                                           
                                       case 9:
                                          switch(id)
                                         {
                                          case 11:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,24,0,myJ3dFrame.cubi24.colors);
                                         //System.out.println("c24p9i11->c24p24i0"); 
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p9i"+id);  
                                            }
                                         break;
                                         
                                         case 11://Drehachse
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
                                          case 15:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,25,41,myJ3dFrame.cubi24.colors);
                                          //System.out.println("c24p13i15->c24p25i41");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15://Drehachse
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
                                          case 0:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,13,15,myJ3dFrame.cubi24.colors);
                                         //System.out.println("c24p24i0->c24p13i15"); 
                                          break;                                                                                    
                                                                                                                             
                                            default:
                                            	System.out.println("default:c24p24i"+id);  
                                            }
                                         break;   
                                         
                                        case 25:
                                          switch(id)
                                         {
                                          case 41:branchGroup=myJ3dFrame.cubi24.getCubi24BranchGroup(myJ3dFrame.cubi24BranchGroup,9,11,myJ3dFrame.cubi24.colors);
                                         //System.out.println("c24p25i41->c24p9i11"); 
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c24p25i"+id);  
                                            }
                                         break;                                                                                                                                                                                                                                                                                 
                                                                                                                         
                                       }
                                                                                                                       
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi24BranchGroup);
                                       myJ3dFrame.cubi24BranchGroup=branchGroup;
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_EXTEND );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_READ );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( Group.ALLOW_CHILDREN_WRITE );
                                       myJ3dFrame.cubi24BranchGroup.setCapability( BranchGroup.ALLOW_DETACH );                                         
                                      if(myJ3dFrame.showCubi24) myJ3dFrame.sceneBranchGroup.addChild(myJ3dFrame.cubi24BranchGroup);}
                                     ;break;
                                     
                                     case 25: //cubi25
                                       if(setR.contains(i))
                                      { int place =myJ3dFrame.cubi25.getPlace();
                                        int id=myJ3dFrame.cubi25.getId();
                                        BranchGroup branchGroup=null;
                                        
                                        switch(place) 
                                        { 
                                       case 9:
                                          switch(id)
                                         {
                                          case 1:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,24,32,myJ3dFrame.cubi25.colors);
                                         //System.out.println("c25p9i9->c25p24i32"); 
                                          break;                                          
                                            default:
                                            	System.out.println("default:c25p9i"+id);  
                                            }
                                          ;break;
                                        	
                                         case 11://Drehachse 
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
                                          case 5:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,25,25,myJ3dFrame.cubi25.colors);
                                          //System.out.println("c25p13i5->c25p25i25");
                                          break;                                                                                    
                                                                                                                            
                                            default:
                                            	System.out.println("default:c25p13i"+id);  
                                            }
                                         break;
                                         
                                         case 15: //Drehachse
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
                                          case 32:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,13,5,myJ3dFrame.cubi25.colors);
                                         //System.out.println("c25p24i32->c25p13i5"); 
                                          break;                                          
                                            default:
                                            	System.out.println("default:c25p13i"+id);  
                                            }
                                          ;break;
                                          
                                          case 25:
                                          switch(id)
                                         {
                                          case 25:branchGroup=myJ3dFrame.cubi25.getCubi25BranchGroup(myJ3dFrame.cubi25BranchGroup,9,1,myJ3dFrame.cubi25.colors);
                                         //System.out.println("c25p25i25->c25p9i1"); 
                                          break;                                          
                                            default:
                                            	System.out.println("default:c25p25i"+id);  
                                            }
                                          ;break;
                                          
                                        }
                                                                               
                                       myJ3dFrame.plainR.removeChild(myJ3dFrame.cubi25BranchGroup);
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
                 //Drehung rückgängig machen

               myJ3dFrame.RRotationInterpolator.setMinimumAngle(myJ3dFrame.Rwinkel+0f);
               myJ3dFrame.RRotationInterpolator.setMaximumAngle(myJ3dFrame.Rwinkel-(float)Math.PI/2);//+
               myJ3dFrame.Ralpha.setStartTime(System.currentTimeMillis()+100);
               myJ3dFrame.Rwinkel=myJ3dFrame.Rwinkel-((float) Math.PI/2);//+
                f=finish();
                while(!f){ f=finish();}
               //System.out.println("M_x <--");
                
              }
    }
    /**
     * Constructor for objects of class Rot_M_X
     */
    public Rot_M_invX(J3dFrame myJ3dFrame,int xa,int ya, int b,int h)
    { this.myJ3dFrame=myJ3dFrame;
    	rotAchse_M_invX=new Button("m"); 
            rotAchse_M_invX.setBounds(xa,ya,b,h);
                        
            rotAchse_M_invX.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
          { 
          M_invX_Action();
            }
             }); 
               
            }                   
    }