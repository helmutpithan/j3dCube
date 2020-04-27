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
 * Write a description of class UpCorners here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
public class UpCorners
{ J3dFrame myJ3dFrame=null;
    //CornerCubis können sich auf den Plätzen 0,2,4,6,16,18,20,22 befinden

    /**
     * Constructor for objects of class UpCorners
     */
    public UpCorners(J3dFrame myJ3dFrame,String test)
    {this.myJ3dFrame=myJ3dFrame;
     System.out.println("upCornersReady()="+upCornersReady());
     cornerPositions();    
    }
    public UpCorners(J3dFrame myJ3dFrame)
    {this.myJ3dFrame=myJ3dFrame;
    System.out.println("UpCorners"); 	
     cubi16Ausrichten();
     cubi18Ausrichten();
     cubi20Ausrichten();
     cubi22Ausrichten();
    }
    
    public void cubi16Ausrichten() 
   {   int place =myJ3dFrame.cubi16.getPlace();
       int id=myJ3dFrame.cubi16.getId();
      System.out.println("cubi16Ausrichten()");
      System.out.println("c16p"+place+"i"+id);
     switch(place)
  { case 0:
 		 { System.out.println("c16p0->c16p16");
 		   RotDown.DownAction();
 		   RotLeft.LeftAction();
 		   Rotdoun.downAction();
 		   Rotlefft.leftAction();//wiederherstellen
 		   
          }
          break;
    case 2:
 		 { System.out.println("c16p2->c16p16");
 		   RotLeft.LeftAction(); 
 		   Rotdoun.downAction();
 		   Rotlefft.leftAction();//wiederherstellen
     	   
          }
          break;
     case 4:
 		 { System.out.println("c16p4->c16p16");
 		    RotLeft.LeftAction();
 		    Rotdoun.downAction(); 
     	    Rotdoun.downAction();
     	    Rotlefft.leftAction();//wiederherstellen
 		 
          }
          break;
          
     case 6:
 		 { System.out.println("c16p6->c16p16");
 		  Rotdoun.downAction();
 		  RotLeft.LeftAction();
 		  Rotdoun.downAction(); 
     	  Rotdoun.downAction();
     	  Rotlefft.leftAction();//wiederherstellen 		       	         	 
          }
          break;
    
      case 16:
 		 { System.out.println("c16p16->c16p16");
 		  
     	    
          }
          break;
          
       case 18:
 		 { System.out.println("c16p18->c16p16");
 		   RotLeft.LeftAction();
 		   Rotrigt.rightAction();
 		   Rotdoun.downAction();
 		   RotRight.RightAction();//wiederherstellen
 		   Rotlefft.leftAction();//wiederherstellen		  
          }
          break;
          
        case 20:
 		 { System.out.println("c16p20->c16p16");
 		   Rotbakk.backAction();
 		   RotLeft.LeftAction();
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
 		   Rotlefft.leftAction();
 		   RotBack.BackAction();
          }
          break;
          
       case 22:
 		 { System.out.println("c16p22->c16p16");
 		   Rotlefft.leftAction();
 		   Rotdoun.downAction();
 		   RotLeft.LeftAction();
 		   RotLeft.LeftAction();
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
 		   Rotlefft.leftAction(); 		   	   
          }
          break;
   	   
   } 
       place =myJ3dFrame.cubi16.getPlace();
       id=myJ3dFrame.cubi16.getId();
       System.out.println("c16p"+place+"i"+id);
      
      while((id!=24))
     { verdrehen16();
       id=myJ3dFrame.cubi16.getId();
       System.out.println("c16p"+place+"i"+id);
      }   
   	 
 }

   public void cubi18Ausrichten() 
   {   int place =myJ3dFrame.cubi18.getPlace();
       int id=myJ3dFrame.cubi18.getId();
      System.out.println("cubi18Ausrichten()");
      System.out.println("c18p"+place+"i"+id);
     switch(place)
  { case 0:
 		 { System.out.println("c18p0->c18p18");
 		   Rotrigt.rightAction();  
 		   RotDown.DownAction();      	   
     	   RotRight.RightAction();//wiederherstellen
     	 
          }
          break;
    case 2:
 		 { System.out.println("c18p2->c18p18");
 		   Rotdoun.downAction();  
     	   Rotrigt.rightAction();
     	   RotDown.DownAction();
     	   RotRight.RightAction();//wiederherstellen
          }
          break;
     case 4:
 		 { System.out.println("c18p4->c18p18");
 		   RotDown.DownAction();
           Rotrigt.rightAction();
 		   Rotdoun.downAction(); 
     	   Rotdoun.downAction();
     	   RotRight.RightAction();//wiederherstellen
          }
          break;
     case 6:
 		 { System.out.println("c18p6->c18p18");
 		   Rotrigt.rightAction(); 		 	 
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
     	   RotRight.RightAction();//wiederherstellen
     	 
          }
          break;
    
      case 16:
 		 { System.out.println("c18p16->c18p18");
 		 	RotLeft.LeftAction();
 		 	Rotrigt.rightAction();
     	    RotDown.DownAction();
     	    RotRight.RightAction();//wiederherstellen
     	    Rotlefft.leftAction();//wiederherstellen
     	    
          }
          break;
       case 18:
 		 { System.out.println("c18p18->c18p18");
 		  
          }
          break;
        case 20:
 		 { System.out.println("c18p20->c18p18");
 		   RotRight.RightAction();
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
 		   Rotrigt.rightAction();//wiederherstellen
     	    
     	   Rotrigt.rightAction();
     	   RotDown.DownAction();
     	   RotRight.RightAction();
     	   
          }
          break;
       case 22:
 		 { System.out.println("c18p22->c18p18");
 		   Rotlefft.leftAction(); 
 		   Rotrigt.rightAction();
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
 		   RotRight.RightAction();
 		   RotLeft.LeftAction();//wiederherstellen     	   
          }
          break;
   	   
   }
       place =myJ3dFrame.cubi18.getPlace();
       id=myJ3dFrame.cubi18.getId();
       System.out.println("c18p"+place+"i"+id);
     while((id!=26))
     { verdrehen18();
       id=myJ3dFrame.cubi18.getId();
       System.out.println("c18p"+place+"i"+id);
      
      }   
       
   
      
 }
 
 public void cubi20Ausrichten() 
   {   int place =myJ3dFrame.cubi20.getPlace();
       int id=myJ3dFrame.cubi20.getId();
      System.out.println("cubi20Ausrichten()");
      System.out.println("c20p"+place+"i"+id);
     switch(place)
  { case 0:
 		 { System.out.println("c20p0->c20p20");		   
 		   RotRight.RightAction();
 		   RotDown.DownAction();
      	   RotDown.DownAction();
     	   Rotrigt.rightAction();//wiederherstellen
     	 
          }
          break;
    case 2:
 		 { System.out.println("c20p2->c20p20");
 		   Rotdoun.downAction();  
     	   RotRight.RightAction();
     	   RotDown.DownAction();
     	   RotDown.DownAction();
     	   Rotrigt.rightAction();//wiederherstellen
          }
          break;
     case 4:
 		 { System.out.println("c20p4->c20p20");
 		   RotDown.DownAction();
 		   RotRight.RightAction();          
 		   Rotdoun.downAction(); 
     	   Rotrigt.rightAction();//wiederherstellen     	   
          }
          break;
     case 6:
 		 { System.out.println("c20p6->c20p20");
 		   RotRight.RightAction(); 		 	 
 		   Rotdoun.downAction();
     	   Rotrigt.rightAction();//wiederherstellen
     	 
          }
          break;
    
      case 16:
 		 { System.out.println("c20p16->c20p20");
 		 	RotLeft.LeftAction();
 		 	RotRight.RightAction();
 		 	Rotdoun.downAction();
 		 	Rotdoun.downAction(); 		 	
 		 	Rotrigt.rightAction();
     	    Rotlefft.leftAction();//wiederherstellen
     	    
          }
          break;
       case 18:
 		 { System.out.println("c20p18->c20p20");
 		   Rotrigt.rightAction();
 		   Rotdoun.downAction();
 		   RotRight.RightAction();
 		   RotRight.RightAction();
 		   RotDown.DownAction();
 		   RotDown.DownAction();
 		   Rotrigt.rightAction();
 		  
          }
          break;
        case 20:
 		 { System.out.println("c20p20->c20p20");
 		   
     	   
          }
          break;
          
          case 22:
 		 { System.out.println("c20p22->c20p20");
 		   Rotlefft.leftAction();
  		   Rotdoun.downAction();
  		   RotLeft.LeftAction();//wiederherstellen
  		   RotDown.DownAction();
 		   RotRight.RightAction();
 		   Rotdoun.downAction();
 		   Rotrigt.rightAction();
 		     	   
          }
          break;
   }
   
       place =myJ3dFrame.cubi20.getPlace();
       id=myJ3dFrame.cubi20.getId();
       System.out.println("c20p"+place+"i"+id);
       while((id!=28))
     { verdrehen20();
       id=myJ3dFrame.cubi20.getId();
       System.out.println("c20p"+place+"i"+id);
      }
 }
 
 public void cubi22Ausrichten() 
   {   int place =myJ3dFrame.cubi22.getPlace();
       int id=myJ3dFrame.cubi22.getId();
      System.out.println("cubi22Ausrichten()");
      System.out.println("c22p"+place+"i"+id);
     switch(place)
  { case 0:
 		 { System.out.println("c22p0->c22p22");	
 		   RotDown.DownAction();
 		   Rotlefft.leftAction();
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
 		   RotLeft.LeftAction();;//wiederherstellen
          }
          break;
    case 2:
 		 { System.out.println("c22p2->c22p22"); 		   
 		   Rotlefft.leftAction();
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
 		   RotLeft.LeftAction();;//wiederherstellen
          }
          break;
     case 4:
 		 { System.out.println("c22p4->c22p22");
 		   Rotlefft.leftAction();
 		   RotDown.DownAction();
 		   RotLeft.LeftAction();;//wiederherstellen
 		     	   
          }
          break;
     case 6:
 		 { System.out.println("c22p6->c22p22");
 		   Rotdoun.downAction();
 		   Rotlefft.leftAction();
 		   RotDown.DownAction();
 		   RotLeft.LeftAction();
     	 
          }
          break;
    
      case 16:
 		 { System.out.println("c22p16->c22p22");
 		 	RotLeft.LeftAction();
 		 	Rotdoun.downAction();
 		 	Rotlefft.leftAction();
 		 	Rotlefft.leftAction();
 		 	RotDown.DownAction();
 		 	RotDown.DownAction();
 		 	RotLeft.LeftAction();//wiederherstellen 		 	
          }
          break;
       case 18:
 		 { System.out.println("c22p18->c22p22");
 		   Rotlefft.leftAction();
 		   Rotrigt.rightAction(); 
 		   Rotdoun.downAction();
 		   Rotdoun.downAction();
 		   RotRight.RightAction();//wiederherstellen
 		   RotLeft.LeftAction();//wiederherstellen 		  
          }
          break;
        case 20:
 		 { System.out.println("c22p20->c22p22");
 		   RotRight.RightAction();
 		   Rotlefft.leftAction();
 		   Rotdoun.downAction();
 		   RotLeft.LeftAction();//wiederherstellen 
     	   Rotrigt.rightAction();//wiederherstellen 
          }
          break;
       case 22:
 		 { System.out.println("c22p22->c22p22");
 		   
          }
          break;   	   
   }
      place =myJ3dFrame.cubi22.getPlace();
       id=myJ3dFrame.cubi22.getId();
       System.out.println("c22p"+place+"i"+id);
      while((id!=30))
     { verdrehen22();
       id=myJ3dFrame.cubi22.getId();
       System.out.println("c22p"+place+"i"+id);
      }
 }
 
 
 public void verdrehen16()
 {RotFront.FrontAction();  
  Rotlefft.leftAction();   
  Rotfrontt.frontAction(); 
  RotLeft.LeftAction();   
  RotFront.FrontAction();   
  Rotlefft.leftAction();  
  Rotfrontt.frontAction();
  RotLeft.LeftAction();   
 }
 
 public void verdrehen18()
 {RotRight.RightAction();  
  Rotfrontt.frontAction(); 
  Rotrigt.rightAction();   
  RotFront.FrontAction();  
  RotRight.RightAction();  
  Rotfrontt.frontAction(); 
  Rotrigt.rightAction();   
  RotFront.FrontAction();  
 }
 
 public void verdrehen20()
 {RotBack.BackAction();
  Rotrigt.rightAction();
  Rotbakk.backAction();
  RotRight.RightAction();
  RotBack.BackAction();
  Rotrigt.rightAction();
  Rotbakk.backAction();
  RotRight.RightAction();
 }
 
 public void verdrehen22()
 { RotLeft.LeftAction();
   Rotbakk.backAction();
   Rotlefft.leftAction();
   RotBack.BackAction();
   RotLeft.LeftAction();
   Rotbakk.backAction();
   Rotlefft.leftAction();
   RotBack.BackAction();
 }
 
  public boolean upCornersReady()
    {boolean value=false;
     int place16 =myJ3dFrame.cubi16.getPlace();
     int id16=myJ3dFrame.cubi16.getId();
     int place18 =myJ3dFrame.cubi18.getPlace();
     int id18=myJ3dFrame.cubi18.getId();
     int place20 =myJ3dFrame.cubi20.getPlace();
     int id20=myJ3dFrame.cubi20.getId();
     int place22 =myJ3dFrame.cubi22.getPlace();
     int id22=myJ3dFrame.cubi22.getId();
    /*	
     int place17 =myJ3dFrame.cubi17.getPlace();
     int id17=myJ3dFrame.cubi17.getId();
     int place19 =myJ3dFrame.cubi19.getPlace();
     int id19=myJ3dFrame.cubi19.getId();
     int place21 =myJ3dFrame.cubi21.getPlace();
     int id21=myJ3dFrame.cubi21.getId();
     int place23 =myJ3dFrame.cubi23.getPlace();
     int id23=myJ3dFrame.cubi23.getId();
     */
              
     value= (place16==16&&id16==24) &&
            (place18==18&&id18==26) &&
            (place20==20&&id20==28) &&
            (place22==22&&id22==30) ; // place6==14???
           /* (place17==17&&id17==25) &&
            (place19==19&&id19==27) &&
            (place21==21&&id21==29) &&
            (place23==23&&id23==31) ;*/
         return value;
    }
      
 
  public void  cornerPositions()
   { int place16 =myJ3dFrame.cubi16.getPlace();
     int id16=myJ3dFrame.cubi16.getId();
     int place18 =myJ3dFrame.cubi18.getPlace();
     int id18=myJ3dFrame.cubi18.getId();
     int place20 =myJ3dFrame.cubi20.getPlace();
     int id20=myJ3dFrame.cubi20.getId();
     int place22 =myJ3dFrame.cubi22.getPlace();
     int id22=myJ3dFrame.cubi22.getId(); 
     System.out.println("c16p"+place16+"i"+id16+" c18p"+place18+"i"+id18+" c20p"+place20+"i"+id20+" c22p"+place22+"i"+id22);
   }
}
