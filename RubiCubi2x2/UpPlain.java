import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
import javax.media.j3d.GeometryStripArray.*;
import javax.vecmath.*;
/**
 * Write a description of class UpPlain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UpPlain
{ J3dFrame myJ3dFrame=null;
  int[] places=new int[8];//
  int[] ids=new int[8];//
  int zuege=0;
    /**
     * Constructor for objects of class UpPlain
     */
    public UpPlain(J3dFrame myJ3dFrame)
    {this.myJ3dFrame=myJ3dFrame;
     System.out.println("UpPlain:");
     solveUpPlain();        
        
    }

 public void solveUpPlain()
   { 
     int cubi;
     int place;
     int id;
  getPlacesandIds(places,ids); 
  if (!plainReady()) 
  {//cornerPositions();
   myJ3dFrame.zuege=0;
   cubi4Ausrichten();
   cubi5Ausrichten();
   cubi6Ausrichten();
   cubi7Ausrichten(); 
   myJ3dFrame.zuege=zuege;
   System.out.println("UpPlain: Zuege="+zuege);
   }
  } 
  public void getPlacesandIds(int[] places,int[] ids)
  {   places[0]=myJ3dFrame.cubi0.getPlace();  	  
  	  places[1]=myJ3dFrame.cubi1.getPlace();  	  
  	  places[2]=myJ3dFrame.cubi2.getPlace();  	  
  	  places[3]=myJ3dFrame.cubi3.getPlace();    	  
  	  places[4]=myJ3dFrame.cubi4.getPlace();  	  
  	  places[5]=myJ3dFrame.cubi5.getPlace();  	  
  	  places[6]=myJ3dFrame.cubi6.getPlace();  	  
  	  places[7]=myJ3dFrame.cubi7.getPlace();
  	  ids[0]=myJ3dFrame.cubi0.getId();  	  
  	  ids[1]=myJ3dFrame.cubi1.getId();  	  
  	  ids[2]=myJ3dFrame.cubi2.getId();  	  
  	  ids[3]=myJ3dFrame.cubi3.getId();    	  
  	  ids[4]=myJ3dFrame.cubi4.getId();  	  
  	  ids[5]=myJ3dFrame.cubi5.getId();  	  
  	  ids[6]=myJ3dFrame.cubi6.getId();  	  
  	  ids[7]=myJ3dFrame.cubi7.getId();
  }
  public boolean plainReady()
  { getPlacesandIds(places,ids);
     return (places[4]==4 && ids[4]==12 &&
             places[5]==5 && ids[5]==13 &&
             places[6]==6 && ids[6]==14 &&
             places[7]==7 && ids[7]==15);
            
    }
  public void cornerPositions()
  {
  System.out.print("c4p"+myJ3dFrame.cubi4.getPlace()+"i"+myJ3dFrame.cubi4.getId());
  System.out.print(",c5p"+myJ3dFrame.cubi5.getPlace()+"i"+myJ3dFrame.cubi5.getId());
  System.out.print(",c6p"+myJ3dFrame.cubi6.getPlace()+"i"+myJ3dFrame.cubi6.getId());
  System.out.print(",c7p"+myJ3dFrame.cubi7.getPlace()+"i"+myJ3dFrame.cubi7.getId());
  System.out.println();
  System.out.print("c0p"+myJ3dFrame.cubi0.getPlace()+"i"+myJ3dFrame.cubi0.getId());
  System.out.print(" ,c1p"+myJ3dFrame.cubi1.getPlace()+"i"+myJ3dFrame.cubi1.getId());
  System.out.print(" ,c2p"+myJ3dFrame.cubi2.getPlace()+"i"+myJ3dFrame.cubi2.getId());
  System.out.print(" ,c3p"+myJ3dFrame.cubi3.getPlace()+"i"+myJ3dFrame.cubi3.getId());  
  System.out.println();
  } 
  
 public void cubi4Ausrichten()
   { 
   	 System.out.println("cubi4Ausrichten()"); 
   	   int place =myJ3dFrame.cubi4.getPlace();
       int id=myJ3dFrame.cubi4.getId();
       System.out.println("place"+place+"id"+id);
        switch(place)
        {
        case  0:
        	{switch(id)
                    { case 0: System.out.println("#c4p0i0->c4p4i12");
                               Rotlefft.leftAction();
                               zuege=zuege+1;
                    		
                    		break;
                      case 8:System.out.println("#c4p0i8->c4p4i12");
                                  RotFront.FrontAction();
                                  zuege=zuege+1;
                                  
                      	     break;
                      case 16:System.out.println("#c4p0i16->c4p4i12");
                                   Rotlefft.leftAction();
                                   Rotlefft.leftAction();                                  
                                   Rotupp.upAction();
                                   zuege=zuege+3;
                      	     break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c4p0i"+id); 
                    }          
                  } 
                  break;
        case  1:
        	{switch(id)
                    { 
                      case 1:System.out.println("#c4p1i1->c4p4i12");
                                  Rotfrontt.frontAction();
                                  RotUp.UpAction();
                                  zuege=zuege+2;
                      	     break;
                      case 9: System.out.println("#c4p1i9->c4p4i12");
                    		 RotRight.RightAction();
                    		 RotUp.UpAction();
                    		 zuege=zuege+2;
                    		break;
                      case 17: System.out.println("#c4p1i17->c4p4i12");
                    		 Rotfrontt.frontAction();
                    		 Rotfrontt.frontAction();
                    		 zuege=zuege+2;
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c4p1i"+id); 
                    }          
                  } 
                  break;                 
        case  2:
        	{switch(id)
                    { 
                      case 2:System.out.println("#c4p2i2->c4p4i12");
                                  Rotrigt.rightAction();
                                  RotUp.UpAction();
                                  RotUp.UpAction();
                                  zuege=zuege+3;
                      	     break;
                      case 10: System.out.println("#c4p2i10->c4p4i12");
                      	     RotBack.BackAction();
                    		 RotUp.UpAction();
                    		 RotUp.UpAction();
                    		 zuege=zuege+3;
                    		break;
                      case 18: System.out.println("#c4p2i18->c4p4i12");
                    		 RotBack.BackAction();
                    		 RotBack.BackAction();
                    		 Rotupp.upAction();
                    		 zuege=zuege+3;
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c4p2i"+id); 
                    }          
                  } 
                  break;          
                  
        case  3:
        	{switch(id)
                    { case 3: System.out.println("#c4p3i3->c4p4i12");
                    		  RotDown.DownAction();
                    		  Rotlefft.leftAction();
                    		  zuege=zuege+2;
                    		break;
                      case 11:System.out.println("#c4p3i11->c4p4i12");
                      	      RotLeft.LeftAction();  
                      	      Rotupp.upAction();
                      	      zuege=zuege+2;
                      	    break;
                      case 19:System.out.println("#c4p3i19->c4p4i12");                      	       
                      	       RotLeft.LeftAction();
                               RotLeft.LeftAction();
                               zuege=zuege+2;
                      	    break;
                             default:
                                    System.out.println("default:c4p3i"+id); 
                    } 
                   }
                   break;
         case  4:
        	{switch(id)
                    { case 4: System.out.println("#c4p4i4->c4p4i12");
                    		 Rotlefft.leftAction();
                    		 Rotupp.upAction();
                    		 zuege=zuege+2;
                    		break;
                      case 12:System.out.println("#c4p4i12->c4p4i12");
                      	       //fertig
                      	    break;
                      case 20:System.out.println("#c4p4i20->c4p4i12");                      	       
                      	       RotFront.FrontAction();
                               RotUp.UpAction();
                               zuege=zuege+2;
                      	    break;
                             default:
                                    System.out.println("default:c4p4i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 5:System.out.println("#c4p5i5->c4p4i12");                    		 
                    		 Rotfrontt.frontAction();
                    		 zuege=zuege+1;
                    		break;
                      case 13:System.out.println("#c4p5i13->c4p4i12");
                      	       RotUp.UpAction();
                      	       zuege=zuege+1;
                      	      
                      	    break;
                      case 21:System.out.println("#c4p5i21->c4p4i12");
                      	       Rotrigt.rightAction();                      	      
                      	       RotFront.FrontAction();
                               RotFront.FrontAction();
                               zuege=zuege+3;
                      	    break;
                             default:
                                    System.out.println("default:c4p5i"+id); 
                    } 
                   }
                   break;
        case  6:
        	{ switch(id)
                    { case 6: System.out.println("#c4p4i4->c4p4i12");
                    		RotBack.BackAction();
                    		RotLeft.LeftAction();
                    		zuege=zuege+2;
                    		break;
                      case 14:System.out.println("#c4p6i14->c4p4i12");
                      	       Rotupp.upAction();
                      	       Rotupp.upAction();
                      	       zuege=zuege+2;
                      	    break;
                     case 22:System.out.println("#c4p6i22->c4p4i12");                     	 
                      	       RotBack.BackAction(); 
                      	       Rotupp.upAction();
                      	       zuege=zuege+2;
                      	       
                      	    break;
                             default:
                                    System.out.println("default:c4p6i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 7: System.out.println("#c4p7i7->c4p4i12");                     		
                    		  Rotbakk.backAction();
                    		  RotDown.DownAction();
                    		  RotUp.UpAction();  
                    		  RotUp.UpAction();
                    		  zuege=zuege+4;
                    		break;
                      case 15:System.out.println("#c4p7i15->c4p4i12");                      	     
                    		  /*Rotlefft.leftAction();
                      	      RotDown.DownAction();
                      	      Rotlefft.leftAction();*/
                      	      Rotupp.upAction();
                      	      zuege=zuege+1;
                      	    break;
                     case 23:System.out.println("#c17p7i23->c4p4i12");                      	     
                    		  RotLeft.LeftAction();
                    		  zuege=zuege+1;
                      	    break;
                             default:
                                    System.out.println("default:c4p7i"+id); 
                    }
                   }
                   break;
        
                   
        default:{System.out.println("kann nicht sein");}
        }
   }
   
   
   public void cubi5Ausrichten()
   { //cubi17 kann sich auf den Plätzen 0,1,2,3,5,6,7befinden
   	 System.out.println("cubi5Ausrichten()"); 
   	   int place =myJ3dFrame.cubi5.getPlace();
       int id=myJ3dFrame.cubi5.getId();
       System.out.println("place"+place+"id"+id);
        switch(place)
        {
        case  0:
        	{switch(id)
                    { case 0: System.out.println("#c5p0i0->c5p5i13");
                               Rotdoun.downAction();
                               Rotdoun.downAction();
                               RotBack.BackAction();
                               Rotrigt.rightAction();
                               zuege=zuege+4;
                    		
                    		break;
                      case 8:System.out.println("#c5p0i8->c5p5i13");
                                  RotDown.DownAction();                                                                  
                                  RotRight.RightAction();
                                  zuege=zuege+2;
                      	     break;
                      case 16:System.out.println("#c5p0i16->c5p5i13");
                                   RotDown.DownAction();
                                   RotDown.DownAction();
                                   Rotrigt.rightAction();
                                   Rotrigt.rightAction();
                                   zuege=zuege+2;
                      	     break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c5p0i"+id); 
                    }          
                  } 
                  break;
        case  1:
        	{switch(id)
                    { 
                      case 1:System.out.println("#c5p1i1->5p5i13");
                             RotDown.DownAction();
                             RotBack.BackAction();
                             Rotrigt.rightAction();
                             zuege=zuege+3;
                      	     break;
                      case 9: System.out.println("#c5p1i9->5p5i13");
                    		  RotRight.RightAction();
                    		  zuege=zuege+1;
                    		  
                    		break;
                      case 17: System.out.println("#c5p1i17->5p5i13");
                    		    RotDown.DownAction();
                    		    RotRight.RightAction();
                    		    RotRight.RightAction();
                    		    zuege=zuege+3;
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c5p1i"+id); 
                    }          
                  } 
                  break;                 
        case  2:
        	{switch(id)
                    { 
                      case 2:System.out.println("#c5p2i2->5p5i13");
                                  RotBack.BackAction();
                                  Rotrigt.rightAction();
                                  zuege=zuege+2;
                                  //
                      	     break;
                      case 10: System.out.println("#c5p2i10->5p5i13");
                      	         RotBack.BackAction();
                      	         RotBack.BackAction();
                      	         Rotlefft.leftAction();
                      	         RotDown.DownAction();
                      	         RotLeft.LeftAction();
                      	         Rotdoun.downAction();
                      	         Rotrigt.rightAction();
                    		     Rotrigt.rightAction();//
                    		     zuege=zuege+8;
                    		break;
                      case 18: System.out.println("#c5p2i18->5p5i13");
                    		   Rotrigt.rightAction();
                    		   Rotrigt.rightAction();
                    		   zuege=zuege+2;
                    		   //
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c5p2i"+id); 
                    }          
                  } 
                  break;          
                  
        case  3:
        	{switch(id)
                    { case 3: System.out.println("#c5p3i3->5p5i13");
                    		  RotBack.BackAction();
                    		  RotRight.RightAction();
                    		  RotRight.RightAction();//
                    		  zuege=zuege+3;
                    		break;
                      case 11:System.out.println("#c5p3i11->5p5i13");
                      	      RotLeft.LeftAction();  
                      	      RotUp.UpAction();
                      	      RotUp.UpAction();
                      	      Rotlefft.leftAction();
                      	      zuege=zuege+4;
                      	    break;
                      case 19:System.out.println("#c5p3i19->5p5i13");                      	       
                      	       Rotdoun.downAction();
                      	       Rotrigt.rightAction();
                      	       Rotrigt.rightAction();//
                      	       zuege=zuege+3;
                      	    break;
                             default:
                                    System.out.println("default:c5p3i"+id); 
                    } 
                   }
                   break;
         case  4:
        	{switch(id)
                    { case 4: System.out.println("#c5p4i4->5p5i13");
                    		 System.out.println("Da steht schon c4");                		
                    		break;
                      case 12:System.out.println("#c5p3i37->5p5i13");
                      	        System.out.println("Da steht schon c4");
                      	    break;
                      case 20:System.out.println("#c5p3i37->5p5i13");                      	       
                      	        System.out.println("Da steht schon c4");
                      	    break;
                             default:
                                    System.out.println("default:c5p4i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 5:System.out.println("#c5p5i5->5p5i13");                    		 
                    		 RotFront.FrontAction();
                    		 RotDown.DownAction();
                    		 Rotfrontt.frontAction();
                    		 RotRight.RightAction();
                    		 RotRight.RightAction();//
                    		 zuege=zuege+5;
                    		break;
                      case 13:System.out.println("#c5p5i13->5p5i13");
                      	       //fertig
                      	      
                      	    break;
                      case 21:System.out.println("#c5p5i21->5p5i13");
                      	      RotRight.RightAction();
                      	      Rotbakk.backAction();
                      	      Rotdoun.downAction();
                      	      RotRight.RightAction();
                      	      zuege=zuege+4;
                      	    break;
                             default:
                                    System.out.println("default:c5p5i"+id); 
                    } 
                   }
                   break;
        case  6:
        	{ switch(id)
                    { case 6: System.out.println("#c5p6i6->5p5i13");
                    		Rotrigt.rightAction();
                    		zuege=zuege+1;
                    		//                   		
                    		break;
                      case 14:System.out.println("#c5p6i14->5p5i13");
                      	       Rotbakk.backAction();
                      	       Rotdoun.downAction(); 
                      	       RotRight.RightAction();//
                      	       zuege=zuege+3;
                      	    break;
                     case 22:System.out.println("#c5p6i22->5p5i13");
                      	       Rotbakk.backAction(); 
                     	       RotRight.RightAction();//
                     	        RotRight.RightAction();//
                     	        zuege=zuege+3;
                      	    break;
                             default:
                                    System.out.println("default:c5p6i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 7: System.out.println("#c5p7i7->5p5i13");                    		 
                    		  RotBack.BackAction();
                    		  Rotdoun.downAction();
                    		  Rotrigt.rightAction();
                    		  Rotrigt.rightAction();//
                    		  zuege=zuege+4;
                    		break;
                      case 15:System.out.println("#c5p7i15->5p5i13");                      	     
                    		  RotBack.BackAction();
                    		  RotBack.BackAction();
                    		  RotRight.RightAction();//
                    		  RotRight.RightAction();//
                    		  zuege=zuege+4;
                      	    break;
                     case 23:System.out.println("#c5p7i23->5p5i13");                      	     
                    		  Rotbakk.backAction();
                    		  Rotrigt.rightAction();//
                    		  zuege=zuege+2;
                      	    break;
                             default:
                                    System.out.println("default:c5p7i"+id); 
                    }
                   }
                   break;
        
                   
        default:{System.out.println("kann nicht sein");}
        }
   }
   
   public void cubi6Ausrichten()
   { //cubi17 kann sich auf den Plätzen 0,1,2,3,6,7befinden
   	 System.out.println("cubi6Ausrichten()"); 
   	   int place =myJ3dFrame.cubi6.getPlace();
       int id=myJ3dFrame.cubi6.getId();
       System.out.println("place"+place+"id"+id);
        switch(place)
        {
        case  0:
        	{switch(id)
                    { case 0: System.out.println("#c6p0i0->c6p6i14");
                              RotUp.UpAction();
                              RotDown.DownAction();//Auf die plätze bringen                             
                              Rotrigt.rightAction();
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();                             
                              Rotupp.upAction(); //wieder herstellen
                              //Rotdoun.downAction();// muss nicht sein
                             zuege=zuege+7;
                              
                    		
                    		break;
                      case 8:System.out.println("#c6p0i8->c6p6i14");
                              RotUp.UpAction();
                              RotDown.DownAction();//Auf die plätze bringen
                              
                              Rotrigt.rightAction();//1
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//2
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//3
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//4
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                               Rotrigt.rightAction();//5
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                                                            
                              Rotupp.upAction(); //wieder herstellen
                              //Rotdoun.downAction();// muss nicht sein
                              zuege=zuege+23;
                      	     break;
                      case 16:System.out.println("#c6p0i16->c6p6i14");
                      	      RotUp.UpAction();
                              RotDown.DownAction();//Auf die plätze bringen
                              
                              Rotrigt.rightAction();//1
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//2
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//3
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                                                             
                             Rotupp.upAction(); //wieder herstellen 
                              zuege=zuege+15;
                      	     break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c6p0i"+id); 
                    }          
                  } 
                  break;
        case  1:
        	{switch(id)
                    { 
                      case 1:System.out.println("#c6p1i1->c6p6i14");
                             RotUp.UpAction();
                             
                              Rotrigt.rightAction();//1
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotupp.upAction(); //wieder herstellen 
                               zuege=zuege+6;
                      	     break;
                      case 9: System.out.println("#c6p1i9->c6p6i14");
                    		   RotUp.UpAction();
                    		   
                    		  Rotrigt.rightAction();//1
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//2
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//3
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//4
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//5
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotupp.upAction(); //wieder herstellen 
                               zuege=zuege+22;
                    		  
                    		break;
                      case 17: System.out.println("#c6p1i17->c6p6i14");
                      	      RotUp.UpAction();
                    		   
                    		  Rotrigt.rightAction();//1
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//2
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotrigt.rightAction();//3
                              Rotdoun.downAction();
                              RotRight.RightAction();
                              RotDown.DownAction();
                              
                              Rotupp.upAction(); //wieder herstellen 
                    		 zuege=zuege+14;    
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c6p1i"+id); 
                    }          
                  } 
                  break;                 
        case  2:
        	{switch(id)
                    { 
                      case 2:System.out.println("#c6p2i2->c6p6i14");
                      	      Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                      	     break;
                      case 10: System.out.println("#c6p2i10->c6p6i14");
                      	      Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              zuege=zuege+20;
                      	         
                    		break;
                      case 18: System.out.println("#c6p2i18->c6p6i14");
                    		  Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction(); 
                    		  zuege=zuege+12;  
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c6p2i"+id); 
                    }          
                  } 
                  break;          
                  
        case  3:
        	{switch(id)
                    { case 3: System.out.println("#c6p3i3->c6p6i14");
                    		  Rotdoun.downAction();
                    		 
                    		  Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                               zuege=zuege+5;
                    		 
                    		break;
                      case 11:System.out.println("#c6p3i11->c6p6i14");
                      	  
                      	      Rotdoun.downAction();
                    		 
                    		  Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                               zuege=zuege+21;                              
                      	      
                      	    break;
                      case 19:System.out.println("#c6p3i19->c6p6i14");                      	                             	     
                    		  Rotbakk.backAction();                       
                              Rotbakk.backAction();
                               zuege=zuege+2;
                             
                      	    break;
                             default:
                                    System.out.println("default:c6p3i"+id); 
                    } 
                   }
                   break;
         case  4:
        	{switch(id)
                    { case 4: System.out.println("#c6p4i4->c6p6i14");
                    		 System.out.println("Da steht schon c4");                		
                    		break;
                      case 12:System.out.println("#c6p3i37->c6p6i14");
                      	        System.out.println("Da steht schon c4");
                      	    break;
                      case 20:System.out.println("#c6p3i37->c6p6i14");                      	       
                      	        System.out.println("Da steht schon c4");
                      	    break;
                             default:
                                    System.out.println("default:c5p4i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 5:System.out.println("#c6p5i5->c6p6i14");                    		 
                    		 System.out.println("Da steht schon c5");
                    		break;
                      case 13:System.out.println("#c6p5i13->c6p6i14");
                      	      System.out.println("Da steht schon c5");
                      	      
                      	    break;
                      case 21:System.out.println("#c6p5i21->c6p6i14");
                      	     System.out.println("Da steht schon c5"); 
                      	    break;
                             default:
                                    System.out.println("default:c5p5i"+id); 
                    } 
                   }
                   break;
        case  6:
        	{ switch(id)
                    { case 6: System.out.println("#c6p6i6->c6p6i14");
                    		  Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                               zuege=zuege+8;
                    		//                   		
                    		break;
                      case 14:System.out.println("#c6p6i14->c6p6i14");
                      	      //fertig
                      	    break;
                     case 22:System.out.println("#c6p6i22->c6p6i14");
                      	      Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              zuege=zuege+16;
                              
                      	    break;
                             default:
                                    System.out.println("default:c6p6i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 7: System.out.println("#c6p7i7->c6p6i14");                    		 
                    		  Rotlefft.leftAction();
                    		  Rotdoun.downAction();
                    		  RotLeft.LeftAction();//wiederherstellen
                    		  
                    		  Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                               zuege=zuege+8;
                    		break;
                      case 15:System.out.println("#c6p7i15->c6p6i14"); 
                      	      Rotlefft.leftAction();
                    		  Rotdoun.downAction();
                    		  RotLeft.LeftAction();//wiederherstellen
                    		  
                    		  Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                    		  
                    		   zuege=zuege+23;
                    		  
                      	    break;
                     case 23:System.out.println("#c6p7i33->c6p6i14"); 
                     	 
                     	      Rotlefft.leftAction();
                    		  Rotdoun.downAction();
                    		  RotLeft.LeftAction();//wiederherstellen
                    		  
                    		  Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                              
                              Rotbakk.backAction();
                              Rotdoun.downAction(); 
                              RotBack.BackAction();
                              RotDown.DownAction();
                               zuege=zuege+15;
                    		  
                      	    break;
                             default:
                                    System.out.println("default:c6p7i"+id); 
                    }
                   }
                   break;
        
                   
        default:{System.out.println("kann nicht sein");}
        }
   }
   
   public void cubi7Ausrichten()
   { //cubi17 kann sich auf den Plätzen 0,1,2,3,7befinden
   	 System.out.println("cubi7Ausrichten()"); 
   	   int place =myJ3dFrame.cubi7.getPlace();
       int id=myJ3dFrame.cubi7.getId();
       System.out.println("place"+place+"id"+id);
        switch(place)
        {
        case  0:
        	{switch(id)
                    { case 0: System.out.println("#c7p0i0->c7p7i15");
                              Rotdoun.downAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                    		 zuege=zuege+13;
                    		break;
                      case 8:System.out.println("#c7p0i8->c7p7i15");
                      	      Rotdoun.downAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+5;
                             
                      	     break;
                      case 16:System.out.println("#c7p0i16->c7p7i15");
                      	      Rotdoun.downAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                               Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+21;     
                             
                      	     break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c7p0i"+id); 
                    }          
                  } 
                  break;
        case  1:
        	{switch(id)
                    { 
                      case 1:System.out.println("#c7p1i1->c7p7i15");
                              Rotdoun.downAction();
                              Rotdoun.downAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+14;
                              
                      	     break;
                      case 9: System.out.println("#c7p1i9->c7p7i15");
                    		  Rotdoun.downAction();
                              Rotdoun.downAction(); 
                    		  
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+6;
                    		break;
                      case 17: System.out.println("#c7p1i17->c7p7i15");
                      	      Rotdoun.downAction();
                              Rotdoun.downAction(); 
                    		  
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+22;
                    		    
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c7p1i"+id); 
                    }          
                  } 
                  break;                 
        case  2:
        	{switch(id)
                    { 
                      case 2:System.out.println("#c7p2i2->c7p7i15");
                      	      RotDown.DownAction();
                      	      
                      	      Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+13;
                      	      
                      	     break;
                      case 10: System.out.println("#c7p2i10->c7p7i15");
                      	      RotDown.DownAction();
                      	      
                      	      Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+5;
                      	         
                    		break;
                      case 18: System.out.println("#c7p2i18->c7p7i15");
                    		  RotDown.DownAction();
                      	      
                      	      Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                    		  
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+21;
                    		break;
                      	     
                      	     
                             default:
                                    System.out.println("default:c7p2i"+id); 
                    }          
                  } 
                  break;          
                  
        case  3:
        	{switch(id)
                    { case 3: System.out.println("#c7p3i3->c7p7i15");
                    		  Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction(); 
                               zuege=zuege+12;
                    		 
                    		break;
                      case 11:System.out.println("#c7p3i11->c7p7i15");
                      	  
                      	      Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+4;
                                                            
                      	      
                      	    break;
                      case 19:System.out.println("#c7p3i19->c7p7i15");                      	       
                      	      Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction(); 
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction(); 
                               zuege=zuege+20;
                      	    break;
                             default:
                                    System.out.println("default:c7p3i"+id); 
                    } 
                   }
                   break;
         case  4:
        	{switch(id)
                    { case 4: System.out.println("#c7p4i4->c7p7i15");
                    		 System.out.println("Da steht schon c4");                		
                    		break;
                      case 12:System.out.println("#c7p3i37->c7p7i15");
                      	        System.out.println("Da steht schon c4");
                      	    break;
                      case 20:System.out.println("#c7p3i37->c7p7i15");                      	       
                      	        System.out.println("Da steht schon c4");
                      	    break;
                             default:
                                    System.out.println("default:c7p4i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 5:System.out.println("#c7p5i5->c7p7i15");                    		 
                    		 System.out.println("Da steht schon c5");
                    		break;
                      case 13:System.out.println("#c7p5i13->c7p7i15");
                      	      System.out.println("Da steht schon c5");
                      	      
                      	    break;
                      case 21:System.out.println("#c7p5i21->c7p7i15");
                      	     System.out.println("Da steht schon c5"); 
                      	    break;
                             default:
                                    System.out.println("default:c7p5i"+id); 
                    } 
                   }
                   break;
        case  6:
        	{ switch(id)
                    { case 6: System.out.println("#c7p6i6->c7p7i15");
                    		  System.out.println("Da steht schon c6"); 
                    		//                   		
                    		break;
                      case 14:System.out.println("#c7p6i14->c7p7i15");
                      	      System.out.println("Da steht schon c6"); 
                      	      //fertig
                      	    break;
                     case 22:System.out.println("#c7p6i22->c7p7i15");
                     	     System.out.println("Da steht schon c6"); 
                      	     
                      	    break;
                             default:
                                    System.out.println("default:c7p6i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 7: System.out.println("#c7p7i7->c7p7i15");
                    		
                    		  Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction(); 
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction(); 
                               zuege=zuege+20;
                    		  
                    		break;
                      case 15:System.out.println("#c7p7i15->c7p7i15"); 
                      	     //fertig 
                    		  
                    		  
                    		  
                      	    break;
                     case 23:System.out.println("#c7p7i33->c7p7i15"); 
                     	 
                     	      Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              
                              Rotlefft.leftAction();
                              Rotdoun.downAction();
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                               zuege=zuege+8;
                    		  
                      	    break;
                             default:
                                    System.out.println("default:c7p7i"+id); 
                    }
                   }
                   break;
        
                   
        default:{System.out.println("kann nicht sein");}
        }
   }
  
}
