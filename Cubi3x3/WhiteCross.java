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
 * Write a description of class WhiteCross here.
 *
 * @author (your name)
 * @version (Helmut Pithan h.pithan(at)t-online.de)
 */
public class WhiteCross
{J3dFrame myJ3dFrame=null;
	int cubi25place; //weißes Achsencubi
	int cubi25id;
	int cubi9place; //rotes Achsencubi
	int cubi9id;
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class WhiteCross
     */
    public WhiteCross(J3dFrame myJ3dFrame,int id)
    {this.myJ3dFrame=myJ3dFrame;   
    //System.out.println("c25p"+cubi25place+"i"+cubi25id);
    if (id==0)
    	{achsenAusrichten();}
    if (id==1)
    	{System.out.println("axesReady="+axesReady());
    	 
    	} 
    
    }
    
    public WhiteCross(J3dFrame myJ3dFrame,String Test)
    {this.myJ3dFrame=myJ3dFrame; 
     System.out.println("whiteCrossReady()="+whiteCrossReady());   
     edgePositions();
    }
    
    public WhiteCross(J3dFrame myJ3dFrame)
    {this.myJ3dFrame=myJ3dFrame;
    System.out.println("WhiteCross");
    positions();
    cubi17Ausrichten();
    edgePositions();
    cubi19Ausrichten();
    edgePositions();
    cubi21Ausrichten();
    edgePositions();
    cubi23Ausrichten();
    edgePositions();
    }
   public void positions()
   { int place0 =myJ3dFrame.cubi0.getPlace();   	
     int id0=myJ3dFrame.cubi0.getId();
     //System.out.println("c0p"+place0+"i"+id0);
     
     int place1 =myJ3dFrame.cubi1.getPlace();   	
     int id1=myJ3dFrame.cubi1.getId();
     //System.out.println("c1p"+place1+"i"+id1);
     
     int place2 =myJ3dFrame.cubi2.getPlace();   	
     int id2=myJ3dFrame.cubi2.getId();
    //System.out.println("c2p"+place2+"i"+id2);
     
     int place3 =myJ3dFrame.cubi3.getPlace();
     int id3=myJ3dFrame.cubi3.getId();
     //System.out.println("c3p"+place3+"i"+id3);
     
     int place4 =myJ3dFrame.cubi4.getPlace();
     int id4=myJ3dFrame.cubi4.getId();
     //System.out.println("c4p"+place4+"i"+id4);
     
     int place5 =myJ3dFrame.cubi5.getPlace();
     int id5=myJ3dFrame.cubi5.getId();
     //System.out.println("c5p"+place5+"i"+id5);
     
     int place6 =myJ3dFrame.cubi6.getPlace();
     int id6=myJ3dFrame.cubi6.getId();
     //System.out.println("c6p"+place6+"i"+id6);
     
     int place7 =myJ3dFrame.cubi7.getPlace();
     int id7=myJ3dFrame.cubi7.getId(); 
     //System.out.println("c7p"+place7+"i"+id7);
     
     int place8 =myJ3dFrame.cubi8.getPlace();
     int id8=myJ3dFrame.cubi8.getId(); 
     //System.out.println("c8p"+place8+"i"+id8);
     
     int place9 =myJ3dFrame.cubi9.getPlace();
     int id9=myJ3dFrame.cubi9.getId(); 
     //System.out.println("c9p"+place9+"i"+id9);
     
     int place10 =myJ3dFrame.cubi10.getPlace();
     int id10=myJ3dFrame.cubi10.getId(); 
     //System.out.println("c10p"+place10+"i"+id10);
    
     int place11 =myJ3dFrame.cubi11.getPlace();
     int id11=myJ3dFrame.cubi11.getId(); 
     //System.out.println("c11p"+place11+"i"+id11);
     
     int place12 =myJ3dFrame.cubi12.getPlace();
     int id12=myJ3dFrame.cubi12.getId(); 
     //System.out.println("c12p"+place12+"i"+id12);
     
     int place13 =myJ3dFrame.cubi13.getPlace();
     int id13=myJ3dFrame.cubi13.getId(); 
     //System.out.println("c10p"+place13+"i"+id13);
          
     int place14 =myJ3dFrame.cubi14.getPlace();
     int id14=myJ3dFrame.cubi14.getId(); 
     //System.out.println("c14p"+place14+"i"+id14);
     
     int place15 =myJ3dFrame.cubi15.getPlace();
     int id15=myJ3dFrame.cubi15.getId(); 
     //System.out.println("c15p"+place15+"i"+id15);
     
     int place16 =myJ3dFrame.cubi16.getPlace();
     int id16=myJ3dFrame.cubi16.getId(); 
     //System.out.println("c16p"+place16+"i"+id16);
     
      int place17 =myJ3dFrame.cubi17.getPlace();
     int id17=myJ3dFrame.cubi17.getId(); 
     //System.out.println("c17p"+place17+"i"+id17);
     
      int place18 =myJ3dFrame.cubi18.getPlace();
     int id18=myJ3dFrame.cubi18.getId(); 
     //System.out.println("c18"+place18+"i"+id18);
     
      int place19 =myJ3dFrame.cubi19.getPlace();
     int id19=myJ3dFrame.cubi19.getId(); 
    // System.out.println("c19p"+place19+"i"+id19);
     
      int place20 =myJ3dFrame.cubi20.getPlace();
     int id20=myJ3dFrame.cubi20.getId(); 
     //System.out.println("c20p"+place20+"i"+id20);
     
     int place21 =myJ3dFrame.cubi21.getPlace();
     int id21=myJ3dFrame.cubi21.getId(); 
     //System.out.println("c21p"+place21+"i"+id21);
     
     int place22 =myJ3dFrame.cubi22.getPlace();
     int id22=myJ3dFrame.cubi22.getId(); 
     //System.out.println("c22p"+place22+"i"+id22);
     
     int place23 =myJ3dFrame.cubi23.getPlace();
     int id23=myJ3dFrame.cubi23.getId(); 
     //System.out.println("c23p"+place23+"i"+id23);
     
     int place24 =myJ3dFrame.cubi24.getPlace();
     int id24=myJ3dFrame.cubi24.getId(); 
    //System.out.println("c24p"+place24+"i"+id24);
     
     int place25 =myJ3dFrame.cubi25.getPlace();
     int id25=myJ3dFrame.cubi25.getId(); 
     //System.out.println("c25p"+place25+"i"+id25);
        
     System.out.println("c0p"+place0+"i"+id0+" c1p"+place1+"i"+id1+" c2p"+place2+"i"+id2+" c3p"+place3+"i"+id3+" c4p"+place4+"i"+id4+" c5p"+place5+"i"+id5+" c6p"+place6+"i"+id6+" c7p"+place7+"i"+id7);
     System.out.println("c8p"+place8+"i"+id8+" c9p"+place9+"i"+id9+" c10p"+place10+"i"+id10+" c11p"+place11+"i"+id11+" c12p"+place12+"i"+id12+" c13p"+place13+"i"+id13+" c14p"+place14+"i"+id14+" c15p"+place15+"i"+id15);
     System.out.println("c16p"+place16+"i"+id16+" c17p"+place17+"i"+id17+" c18p"+place18+"i"+id18+" c19p"+place19+"i"+id19+" c20p"+place20+"i"+id20+" c21p"+place21+"i"+id21+" c22p"+place22+"i"+id22+" c23p"+place23+"i"+id23+" c24p"+place24+"i"+id24+" c25p"+place25+"i"+id25);

   } 
   public void cubi17Ausrichten()
   { //cubi17 kann sich auf den Plätzen 1,3,5,7,8,10,12,14,17,19,21,23 befinden
   	 System.out.println("cubi17Ausrichten()"); 
   	   int place =myJ3dFrame.cubi17.getPlace();
       int id=myJ3dFrame.cubi17.getId();
        switch(place)
        {
        case  1:
        	{switch(id)
                    { case 1: System.out.println("#c17p1i1->c17p17i25");
                    		 RotDown.DownAction();
                    		 RotRight.RightAction();
                    		 Rotfrontt.frontAction();
                    		break;
                      case 35:System.out.println("#c17p1i35->c17p17i25");
                                  RotFront.FrontAction();
                                  RotFront.FrontAction();
                      	     break;
                             default:
                                    System.out.println("default:c17p1i"+id); 
                    }          
                  } 
                  break;
        case  3:
        	{switch(id)
                    { case 3: System.out.println("#c17p3i3->c17p17i25");
                    		 RotRight.RightAction();
                    		 Rotfrontt.frontAction();                    		
                    		break;
                      case 37:System.out.println("#c17p3i37->c17p17i25");
                      	       Rotdoun.downAction();
                      	       RotFront.FrontAction();
                               RotFront.FrontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p3i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 5: System.out.println("#c17p5i5->c17p17i25");
                    		Rotdoun.downAction();
                    		RotRight.RightAction();
                    		 Rotfrontt.frontAction();  
                    		break;
                      case 39:System.out.println("#c17p5i39->c17p17i25");
                      	       Rotdoun.downAction();
                      	       Rotdoun.downAction();
                      	       RotFront.FrontAction();
                               RotFront.FrontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p5i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 7: System.out.println("#c17p7i7->c17p17i25");                    		 
                    		  Rotlefft.leftAction();
                    		  RotFront.FrontAction();  
                    		break;
                      case 33:System.out.println("#c17p7i33->c17p17i25");                      	     
                    		  RotDown.DownAction();
                    		  RotFront.FrontAction();
                    		  RotFront.FrontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p7i"+id); 
                    }
                   }
                   break;
        case  8:
        	{switch(id)
                    { case 8: System.out.println("#c17p8i8->c17p17i25");
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                    		  RotFront.FrontAction();
                    		  RotFront.FrontAction();
                    		break;
                      case 16:System.out.println("#c17p8i16->c17p17i25");
                      	          RotFront.FrontAction();
                               break;                      	     
                    		 
                             default:
                                    System.out.println("default:c17p8i"+id); 
                    }
                   }
                   break;
        case  10:
        	{switch(id)
                    { case 18: System.out.println("#c17p10i18->c17p17i25");
                    		 Rotrigt.rightAction();
                    		 Rotdoun.downAction();                      	     
                      	     Rotfrontt.frontAction();
                      	     Rotfrontt.frontAction();
                      	      
                    		 
                    		break;
                      case 10:System.out.println("#c17p10i10->c17p17i25");
                      	     Rotfrontt.frontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p10i"+id);
                    }
                   }
                   break;
        case  12:
        	{switch(id)
                    { case 20:System.out.println("#c17p12i20->c17p17i25");
                    		 RotRight.RightAction();
                    		 Rotdoun.downAction();                      	     
                      	     Rotfrontt.frontAction();
                      	     Rotrigt.rightAction();
                      	     Rotdoun.downAction();
                      	     Rotfrontt.frontAction();
                      	     Rotfrontt.frontAction();
                      	     Rotrigt.rightAction();//wiederherstellen
                      	     break;
                      case 12: System.out.println("#c17p12i12->c17p17i25");
                      	      RotRight.RightAction();
                    		  Rotdoun.downAction();
                    		  Rotfrontt.frontAction();
                      	      Rotfrontt.frontAction();
                      	      Rotrigt.rightAction();//wiederherstellen
                    		break;
                             default:
                                    System.out.println("default:c17p12i"+id); 
                    } 
                   }
                   break;
        case  14:
        	{switch(id)
                    { case 22: System.out.println("#c17p14i22->c17p17i25");
                    		Rotlefft.leftAction();
                    		RotDown.DownAction();
                    		RotFront.FrontAction();
                    		RotFront.FrontAction();
                    		RotLeft.LeftAction();//wiederherstellen
                    		break;
                      case 14:System.out.println("#c17p14i14->c17p17i25");
                      	    Rotlefft.leftAction();
                      	    RotDown.DownAction();
                      	    RotFront.FrontAction();
                      	    RotLeft.LeftAction();
                      	    RotDown.DownAction();
                      	    RotFront.FrontAction();
                    		RotFront.FrontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p14i"+id); 
                    } 
                   }
                   break;
        case  17:
        	{switch(id)
                    { case 43: System.out.println("#c17p17i43->c17p17i25");
                    		Rotfrontt.frontAction();
                    		RotLeft.LeftAction();
                    		RotDown.DownAction();
                    		Rotlefft.leftAction();//wiederherstellen
                    		RotFront.FrontAction();
                    		RotFront.FrontAction();
                    		
                    		break;
                      case 25:System.out.println("#c17p17i25->c17p17i25");
                      	     //fertig
                      	    break;
                             default:
                                    System.out.println("default:c17p17i"+id);
                    }
                   }
                   break; 
        case  19:
        	{switch(id)
                    { case 45: System.out.println("#c17p19i45->c17p17i25");
                    		 Rotrigt.rightAction();
                    		 Rotfrontt.frontAction();
                    		break;
                      case 27:System.out.println("#c17p19i27->c17p17i25");
                      	     Rotrigt.rightAction();
                      	     Rotrigt.rightAction();
                      	     Rotdoun.downAction();
                    		 Rotfrontt.frontAction();
                    		 Rotfrontt.frontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p19i"+id);
                    }
                   }
                   break;
        case  21:
        	{switch(id)
                    { case 47: System.out.println("#c17p21i47->c17p17i25");
                    		Rotbakk.backAction();
                    		RotRight.RightAction();
                    		RotBack.BackAction();
                    		Rotdoun.downAction();
                    		Rotrigt.rightAction();
                    		RotFront.FrontAction();
                    		RotFront.FrontAction();                    		 
                    		break;
                      case 29:System.out.println("#c17p21i29->c17p17i25");
                      	     RotBack.BackAction();
                    		 RotBack.BackAction();
                    		 RotDown.DownAction();
                    		 Rotbakk.backAction();//wiederherstellen
                    		 Rotbakk.backAction();//wiederherstellen
                    		 RotDown.DownAction();
                    		 RotFront.FrontAction();
                    		 RotFront.FrontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p21i"+id);
                    }
                   }
                   break;
        case  23:
        	{switch(id)
                    { case 41: System.out.println("#c17p23i41->c17p17i25");
                    		   RotLeft.LeftAction();
                    		   RotFront.FrontAction();
                    		break;
                      case 31:System.out.println("#c17p23i31->c17p17i25");
                      	       RotLeft.LeftAction();
                      	       RotLeft.LeftAction();
                      	       RotDown.DownAction();
                      	       RotFront.FrontAction();
                    		   RotFront.FrontAction();
                      	    break;
                             default:
                                    System.out.println("default:c17p23i"+id);
                    }
                   }
                   break;           
                   
        default:{System.out.println("kann nicht sein");}
        }
   }
   
   public void cubi19Ausrichten()
   { //cubi19 kann sich auf den Plätzen 1,3,5,7,8,10,12,14,19,21,23 befinden
   	 System.out.println("cubi19Ausrichten()"); 
   	   int place =myJ3dFrame.cubi19.getPlace();
       int id=myJ3dFrame.cubi19.getId();
        switch(place)
        {
        case  1:
        	{switch(id)
                    { case 1: System.out.println("c19p1i1->c19p19i27");
                    		Rotfrontt.frontAction();                    		 
                    		 RotRight.RightAction();
                    		 RotFront.FrontAction();//wiederherstellen
                    		 
                    		break;
                      case 35:System.out.println("c19p1i35->c19p19i27");
                      	          RotDown.DownAction();
                      	          RotRight.RightAction();
                      	          RotRight.RightAction();
                                  
                      	     break;
                             default:
                                    System.out.println("default:c19p1i"+id); 
                    }          
                  } 
                  break;
        case  3:
        	{switch(id)
                    { case 3: System.out.println("c19p3i3->c19p19i27");
                    		 RotRight.RightAction();
                    		 RotFront.FrontAction();
                    		 RotDown.DownAction();
                    		 Rotfrontt.frontAction();//wiederherstellen
                    		 RotRight.RightAction();
                      	     RotRight.RightAction();
                    		 
                    		 
                    		break;
                      case 37:System.out.println("c19p3i37->c19p19i27");
                      	      RotRight.RightAction();
                      	      RotRight.RightAction();
                      	    break;
                             default:
                                    System.out.println("default:c19p3i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 5: System.out.println("c19p5i5->c19p19i27");
                    		   Rotdoun.downAction();
                      	       RotRight.RightAction();
                               RotFront.FrontAction();
                               RotDown.DownAction();
                                Rotfrontt.frontAction();//wiederherstellen
                               RotRight.RightAction();
                               RotRight.RightAction();
                    		break;
                      case 39:System.out.println("c19p5i39->c19p19i27");                      	                            	      
                              Rotdoun.downAction();
                    		  RotRight.RightAction();
                    		  RotRight.RightAction();     
                      	    break;
                             default:
                                    System.out.println("default:c19p5i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 7: System.out.println("c19p7i7->c19p19i27");                    		 
                    		   Rotdoun.downAction();
                    		   Rotdoun.downAction();
                      	       RotRight.RightAction();
                               RotFront.FrontAction();
                               RotDown.DownAction();
                               Rotfrontt.frontAction();//wiederherstellen
                               
                               RotRight.RightAction();
                               RotRight.RightAction();
                    		break;
                      case 33:System.out.println("c19p7i33->c19p19i27");                      	     
                    		  Rotdoun.downAction();
                    		  Rotdoun.downAction();
                    		  RotRight.RightAction();
                    		  RotRight.RightAction(); 
                      	    break;
                             default:
                                    System.out.println("default:c19p7i"+id); 
                    }
                   }
                   break;
        case  8:
        	{switch(id)
                    { case 8: System.out.println("c19p8i8->c19p19i27");
                              RotLeft.LeftAction();
                              RotDown.DownAction();
                              Rotlefft.leftAction();//wiederherstellen
                              RotDown.DownAction();
                              Rotfrontt.frontAction();
                    		  RotRight.RightAction();                    		  
                    		  RotRight.RightAction();
                    		  RotFront.FrontAction();//wiederherstellen
                    		break;
                      case 16:System.out.println("c19p8i16->c19p19i27");
                      	          Rotfrontt.frontAction();
                      	          RotDown.DownAction();                      	          
                      	          RotFront.FrontAction();//wiederherstellen                      	          
                      	          RotRight.RightAction();
                      	          RotRight.RightAction();
                      	         
                      	         // RotRight.RightAction();
                      	         
                               break;                      	     
                    		 
                             default:
                                    System.out.println("default:c19p8i"+id); 
                    }
                   }
                   break;
        case  10:
        	{switch(id)
                    { case 18: System.out.println("c19p10i18->c19p19i27");
                    		 RotRight.RightAction();
                    		break;
                      case 10:System.out.println("c19p10i10->c19p19i27");
                      	     Rotrigt.rightAction();
                    		 Rotdoun.downAction();                      	     
                      	     Rotfrontt.frontAction();
                      	     RotRight.RightAction();
                      	     RotFront.FrontAction();//wiederherstellen
                      	    break;
                             default:
                                    System.out.println("default:c19p10i"+id);
                    }
                   }
                   break;
        case  12:
        	{switch(id)
                    { case 20:System.out.println("c19p12i20->c19p19i27");//12.4.2020
                      	      RotRight.RightAction();
                    		  Rotdoun.downAction();
                    		  Rotfrontt.frontAction();
                      	      RotRight.RightAction();//wiederherstellen 
                      	      RotFront.FrontAction();
                      	     break;
                      case 12: System.out.println("c19p12i12->c19p17i27");
                      	        Rotrigt.rightAction();                      	      
                    		break;
                             default:
                                    System.out.println("default:c19p12i"+id); 
                    } 
                   }
                   break;
        case  14:
        	{switch(id)
                    { case 22: System.out.println("c19p14i22->c19p19i27");
                    		Rotlefft.leftAction();
                    		Rotdoun.downAction();
                    		RotLeft.LeftAction();
                    		Rotdoun.downAction();
                    		Rotrigt.rightAction();
                    		Rotrigt.rightAction();
                    		break;
                    		
                      case 14:System.out.println("c19p14i14->c19p19i27");
                      	       Rotlefft.leftAction();
                      	       Rotdoun.downAction();
                      	       RotLeft.LeftAction();
                      	       RotBack.BackAction();                     	       
                    		   Rotrigt.rightAction();                    		                       		                       		   
                    		   Rotbakk.backAction();
                    		   
                      	    break;
                             default:
                                  System.out.println("default:c19p14i"+id); 
                    } 
                   }
                   break;
        case  17://hier weiter
        	{switch(id)
                    { case 43: System.out.println("c19p17i43->c19p19i27");
                    		RotFront.FrontAction();
                    		RotRight.RightAction();                    		
                    		Rotfrontt.frontAction();//wiederherstellen                    		                    		
                    		break;
                      case 25:System.out.println("c19p17i25->c19p19i27");
                      	     RotFront.FrontAction();
                      	     RotFront.FrontAction();
                      	     RotDown.DownAction();
                      	     RotRight.RightAction();
                      	     RotRight.RightAction();
                      	    break;
                             default:
                                    System.out.println("default:c19p17i"+id);
                    }
                   }
                   break; 
        case  19:
        	{switch(id)
                    { case 45: System.out.println("c19p19i45->c19p19i27");
                    		 Rotrigt.rightAction();
                      	     Rotrigt.rightAction();
                      	     Rotdoun.downAction();
                    		 Rotfrontt.frontAction();
                    		 //am Mo.16.3 eingefügt
                    		 //RotRight.RightAction();
                    		 //RotFront.FrontAction();
                    		 RotRight.RightAction();
                    		 RotFront.FrontAction();
                    		 
                    		break;
                      case 27:System.out.println("c19p19i27->c19p19i27");
                      	    // richtiger Platz richtige id
                      	    break;
                             default:
                                    System.out.println("default:c19p19i"+id);
                    }
                   }
                   break;
        case  21:
        	{
        		switch(id)
                    { case 47: System.out.println("c19p21i47->c19p19i27");
                    		 Rotbakk.backAction();//wiederherstellen
                      	     Rotrigt.rightAction();
                    		 RotBack.BackAction();//wiederherstellen
                    		 
                    		break;
                      case 29:System.out.println("c19p21i29->c19p19i27");
                      	       Rotbakk.backAction();
                      	       Rotbakk.backAction();
                      	       Rotdoun.downAction();                     	       
                      	       RotBack.BackAction();//wiederherstellen
                      	       RotBack.BackAction();//wiederherstellen
                      	       RotRight.RightAction();
                      	       RotRight.RightAction();
                      	    break;
                             default:
                                    System.out.println("default:c19p21i"+id);
                    }
                   }
                   break;
        case  23:
        	{switch(id)
                    { case 41: System.out.println("c19p23i41->c19p19i27");
                    		   RotLeft.LeftAction();
                    		   RotLeft.LeftAction();
                    		   RotDown.DownAction();
                    		   Rotfrontt.frontAction();
                    		   RotRight.RightAction();
                    		   RotFront.FrontAction();//
                    		   
                    		break;
                      case 31:System.out.println("c19p23i31->c19p19i27");
                      	       RotLeft.LeftAction();
                      	       Rotfrontt.frontAction();
                      	       Rotfrontt.frontAction();
                      	       RotRight.RightAction();
                      	       RotFront.FrontAction();//
                    		   RotFront.FrontAction();//
                      	    break;
                             default:
                                    System.out.println("default:c19p23i"+id);
                    }
                   }
                   break;           
                   
        default:{System.out.println("kann nicht sein");}
        }
   }
   
   public void cubi21Ausrichten()
   { //cubi21 kann sich auf den Plätzen 1,3,5,7,8,10,12,14,21,23 befinden
   	 System.out.println("cubi21Ausrichten()"); 
   	
   	   int place =myJ3dFrame.cubi21.getPlace();
       int id=myJ3dFrame.cubi21.getId();
        switch(place)
        {
        case  1:
        	{switch(id)
                    { case 1: System.out.println("c21p1i17->c21p21i29");
                    		  Rotdoun.downAction();
                    		  RotLeft.LeftAction();
                    		  Rotbakk.backAction();                    		  
                    		  Rotlefft.leftAction();                    		                     		                      		                     		 
                    		break;
                      case 35: System.out.println("c21p1i3->c21p21i29");
                      	          Rotdoun.downAction();
                      	          Rotdoun.downAction();
                      	          RotBack.BackAction();
                      	          RotBack.BackAction();
                                  
                      	     break;
                             default:
                                    System.out.println("default:c21p1i"+id); 
                    }          
                  } 
                  break;
        case  3:
        	{switch(id)
                    { case 3: System.out.println("c21p3i3->c21p21i29");
                    		  Rotrigt.rightAction();
                    		  RotBack.BackAction();
                    		  RotRight.RightAction();//wiederherstellen
                    		 
                    		break;
                      case 37:System.out.println("c21p3i37->c21p21i29");
                      	      RotDown.DownAction();
                      	      RotBack.BackAction();
                      	      RotBack.BackAction();                     	      
                      	    break;
                             default:
                                    System.out.println("default:c21p3i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 5: System.out.println("c21p5i5->c21p21i29");
                    		   RotBack.BackAction();
                      	       RotRight.RightAction();
                               RotDown.DownAction();
                               Rotrigt.rightAction();//wiederherstellen
                               RotBack.BackAction();
                               RotBack.BackAction();
                              
                    		break;
                      case 39:System.out.println("c21p5i39->c21p21i29");                      	                            	      
                              RotBack.BackAction();
                              RotBack.BackAction(); 
                      	    break;
                             default:
                                    System.out.println("default:c21p5i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 7: System.out.println("c21p7i7->c21p21i29");                    		 
                    		   RotLeft.LeftAction();            		                    		   
                               Rotbakk.backAction();
                               Rotlefft.leftAction();//wiederherstellen                                                             
                    		break;
                      case 33:System.out.println("c21p7i33->c21p21i29");                      	                         		 
                    		  Rotdoun.downAction();
                    		  RotBack.BackAction();
                    		  RotBack.BackAction();
                      	    break;
                             default:
                                    System.out.println("default:c21p7i"+id); 
                    }
                   }
                   break;
        case  8:
        	{switch(id)
                    { case 16: System.out.println("c21p8i16->c21p21i29");
                               RotLeft.LeftAction();                      	          
                      	       RotLeft.LeftAction();
                               Rotbakk.backAction();
                               Rotlefft.leftAction();
                               Rotlefft.leftAction();
                             
                    		break;
                      case 8:System.out.println("c21p8i8->c21p21i29");
                      	       RotLeft.LeftAction();
                      	       Rotdoun.downAction();
                      	       Rotlefft.leftAction();//wiederherstellen
                      	       RotBack.BackAction();
                      	       RotBack.BackAction();
                               break;                      	                         		 
                             default:
                                    System.out.println("default:c21p8i"+id); 
                    }
                   }
                   break;
        case  10:
        	{switch(id)
                    { case 18: System.out.println("c21p10i18->c21p21i29");
                    		 Rotrigt.rightAction(); 
                    		 RotDown.DownAction();
                    		 RotRight.RightAction();//wiederherstellen
                    		 RotBack.BackAction();
                    		 RotBack.BackAction();                    		
                    		break;
                      case 10:System.out.println("c21p10i10->c21p21i29");
                      	     RotFront.FrontAction();
                    		 RotDown.DownAction();
                    		 Rotfrontt.frontAction();//wiederherstellen
                    		 RotDown.DownAction();                    		 
                      	     RotBack.BackAction();
                      	     RotBack.BackAction();
                      	    break;
                             default:
                                    System.out.println("default:c23p10i"+id);
                    }
                   }
                   break;
        case  12:
        	{switch(id)
                    { case 20:System.out.println("c21p12i20->c21p21i29");
                      	      RotBack.BackAction();
                    		                    	                           	     
                      	     break;
                      case 12: System.out.println("c21p12i12->c21p21i29");
                      	      RotRight.RightAction();
                      	      RotDown.DownAction();
                      	      Rotrigt.rightAction();//wiederherstellen
                      	      RotBack.BackAction();
                      	      RotBack.BackAction();
                    		break;
                             default:
                                    System.out.println("default:c23p12i"+id); 
                    } 
                   }
                   break;
        case  14:
        	{switch(id)
                    { case 22: System.out.println("c21p14i22->c21p21i29");
                    		 Rotlefft.leftAction();
                    		 Rotdoun.downAction();
                    		 RotLeft.LeftAction();//wiederherstellen
                    		 RotBack.BackAction();
                    		 RotBack.BackAction();                    		            
                    		break;
                    		
                      case 14:System.out.println("c21p14i14->c21p21i29");                      	      
                      	        Rotbakk.backAction();                      	     
                      	    break;
                             default:
                                  System.out.println("default:c21p14i"+id); 
                    } 
                   }
                   break;
        case  17://hier weiter
        	{switch(id)
                    { case 25: System.out.println("c21p17i25->c21p21i29");                   		
                    		 Rotfrontt.frontAction();
                    		 Rotfrontt.frontAction();
                    		 Rotdoun.downAction();
                    		 RotFront.FrontAction();//wiederherstellen ??
                    		 RotFront.FrontAction();//wiederherstellen ??
                    		 Rotdoun.downAction();
                    		 RotBack.BackAction();
                    		 RotBack.BackAction();                   		                   		                   		                    		
                    		 break;
                      case 43:System.out.println("c21p17i43->c21p21i29");
                      	     Rotfrontt.frontAction();
                    		 RotLeft.LeftAction();
                    		 Rotdoun.downAction();
                    		 Rotlefft.leftAction();//wiederherstellen ??
                    		 RotFront.FrontAction();//wiederherstellen ?? 
                    		 RotBack.BackAction();
                    		 RotBack.BackAction(); 
                      	    break;
                             default:
                                    System.out.println("default:c21p17i"+id);
                    }
                   }
                   break; 
        case  19:
        	{switch(id)
                    { case 27: System.out.println("c21p19i27->c21p21i29");
                    		 RotRight.RightAction();
                    		 RotRight.RightAction();
                    		 RotDown.DownAction();
                    		 Rotrigt.rightAction();//wiederherstellen
                      	     Rotrigt.rightAction();//wiederherstellen
                      	     RotBack.BackAction();
                      	     RotBack.BackAction();                    		              		 
                    		break;
                      case 45:System.out.println("c21p19i45->c21p21i29");
                      	     RotRight.RightAction();
                      	     RotBack.BackAction();
                      	     Rotrigt.rightAction();//wiederherstellen
                      	    break;
                             default:
                                    System.out.println("default:c21p19i"+id);
                    }
                   }
                   break;
        case  21:
        	{switch(id)
                    { case 47: System.out.println("c21p21i47->c21p21i29");
                    		 Rotbakk.backAction();
                    		 RotRight.RightAction();
                    		 RotDown.DownAction();
                    		 Rotrigt.rightAction();//wiederherstellen
                    		 RotBack.BackAction();//wiederherstellen                       	     
                    		 RotBack.BackAction();//wiederherstellen                   		 
                    		break;
                      case 29:System.out.println("c21p21i29->c21p21i29");
                      	      // fertig
                      	    break;
                             default:
                                    System.out.println("default:c21p21i"+id);
                    }
                   }
                   break;
        case  23:
        	{switch(id)
                    { case 31: System.out.println("c21p23i31->c21p21i29");
                    		  RotLeft.LeftAction();
                    		  RotLeft.LeftAction();
                    		  Rotdoun.downAction();
                    		  Rotlefft.leftAction();//wiederherstellen 
                    		  Rotlefft.leftAction();//wiederherstellen 
                    		  RotBack.BackAction();
                    		  RotBack.BackAction();                    		                    		   
                    		break;
                      case 41:System.out.println("c21p23i41->c21p21i29");
                      	      Rotlefft.leftAction();
                      	      Rotbakk.backAction();
                      	      RotLeft.LeftAction(); 
                      	    break;
                             default:
                                    System.out.println("default:c21p23i"+id);
                    }
                   }
                   break;           
                   
        default:{System.out.println("kann nicht sein");}
        }
       
   }
   
   public void cubi23Ausrichten()
   { //cubi23 kann sich auf den Plätzen 1,3,5,7,8,10,12,14,23 befinden
   	 System.out.println("cubi23Ausrichten()"); 
   	   int place =myJ3dFrame.cubi23.getPlace();
       int id=myJ3dFrame.cubi23.getId();
        switch(place)
        {
        case  1:
        	{switch(id)
                    { case 17: System.out.println("c23p1i17->c23p23i31");
                    		  RotFront.FrontAction();
                    		  Rotlefft.leftAction();                    		                     		  
                    		  Rotfrontt.frontAction();
                    		 
                    		break;
                      case 3:System.out.println("c23p1i3->c23p23i31");
                      	          Rotdoun.downAction();
                      	          RotLeft.LeftAction();
                      	          RotLeft.LeftAction();
                                  
                      	     break;
                             default:
                                    System.out.println("default:c23p1i"+id); 
                    }          
                  } 
                  break;
        case  3:
        	{switch(id)
                    { case 19: System.out.println("c23p3i19->c23p23i31");
                    		 RotRight.RightAction();
                    		 RotFront.FrontAction();
                    		 Rotdoun.downAction();
                    		 Rotfrontt.frontAction();//wiederherstellen
                    		 Rotrigt.rightAction();
                      	     Rotlefft.leftAction();
                      	     Rotlefft.leftAction();
                    		 
                    		 
                    		break;
                      case 5:System.out.println("c23p3i5->c23p23i31");
                      	      Rotdoun.downAction();
                      	      Rotdoun.downAction();
                      	      Rotlefft.leftAction();
                      	      Rotlefft.leftAction();
                      	    break;
                             default:
                                    System.out.println("default:c23p3i"+id); 
                    } 
                   }
                   break;
        case  5:
        	{ switch(id)
                    { case 21: System.out.println("c23p5i21->c23p23i31");
                    		   Rotbakk.backAction();                      	       
                               RotLeft.LeftAction();
                               RotBack.BackAction();//wiederherstellen
                              
                    		break;
                      case 7:System.out.println("c23p5i7->c23p23i31");                      	                            	      
                              RotDown.DownAction();
                    		  RotLeft.LeftAction();
                    		  RotLeft.LeftAction();     
                      	    break;
                             default:
                                    System.out.println("default:c23p5i"+id); 
                    } 
                   }
                   break;
        case  7:
        	{switch(id)
                    { case 23: System.out.println("c23p7i23->c23p23i31");                    		 
                    		   RotDown.DownAction();                    		   
                               RotFront.FrontAction();
                               Rotlefft.leftAction();
                               Rotfrontt.frontAction();//wiederherstellen                               
                    		break;
                      case 1:System.out.println("c23p7i1->c23p23i31");                      	                         		 
                    		  RotLeft.LeftAction();
                    		  RotLeft.LeftAction(); 
                      	    break;
                             default:
                                    System.out.println("default:c23p7i"+id); 
                    }
                   }
                   break;
        case  8:
        	{switch(id)
                    { case 40: System.out.println("c23p8i40->c23p23i31");
                              
                              Rotlefft.leftAction();
                             
                    		break;
                      case 32:System.out.println("c23p8i32->c23p23i31");
                      	          Rotfrontt.frontAction();
                      	          Rotdoun.downAction();
                      	          RotFront.FrontAction();//wiederherstellen
                      	          RotLeft.LeftAction();                      	          
                      	          RotLeft.LeftAction();
                      	         
                               break;                      	     
                    		 
                             default:
                                    System.out.println("default:c23p8i"+id); 
                    }
                   }
                   break;
        case  10:
        	{switch(id)
                    { case 42: System.out.println("c23p10i18->c23p23i31");
                    		 RotFront.FrontAction();
                    		 Rotdoun.downAction();
                    		 Rotfrontt.frontAction();//wiederherstellen
                    		 RotLeft.LeftAction();
                    		 RotLeft.LeftAction();
                    		 
                    		break;
                      case 34:System.out.println("c23p10i10->c23p23i31");
                      	     Rotrigt.rightAction();
                    		 Rotdoun.downAction();
                      	     RotRight.RightAction();//wiederherstellen
                      	     Rotdoun.downAction();
                      	     RotLeft.LeftAction();
                    		 RotLeft.LeftAction();                     	    
                      	    break;
                             default:
                                    System.out.println("default:c23p10i"+id);
                    }
                   }
                   break;
        case  12:
        	{switch(id)
                    { case 44:System.out.println("c23p12i44->c23p23i31");
                      	      RotRight.RightAction();
                    		  Rotdoun.downAction();
                    		  Rotrigt.rightAction();//wiederherstellen
                    		  Rotdoun.downAction();
                    		  RotLeft.LeftAction();
                      	      RotLeft.LeftAction();                     	                           	     
                      	     break;
                      case 36: System.out.println("c23p12i36->c23p23i31");
                      	      Rotbakk.backAction();
                      	      RotDown.DownAction();
                      	      RotBack.BackAction();//wiederherstellen
                      	      RotLeft.LeftAction();
                      	      RotLeft.LeftAction(); 
                    		break;
                             default:
                                    System.out.println("default:c23p12i"+id); 
                    } 
                   }
                   break;
        case  14:
        	{switch(id)
                    { case 46: System.out.println("c23p14i46->c23p23i31");
                    		 RotBack.BackAction();
                    		 RotDown.DownAction();
                    		 Rotbakk.backAction();//wiederherstellen
                    		 RotLeft.LeftAction();
                    		 RotLeft.LeftAction();            
                    		break;
                    		
                      case 38:System.out.println("c23p14i38->c23p23i31");                      	      
                      	       RotLeft.LeftAction();                      	     
                      	    break;
                             default:
                                  System.out.println("default:c23p14i"+id); 
                    } 
                   }
                   break;
        case  17://hier weiter
        	{switch(id)
                    { case 11: System.out.println("c23p17i11->c23p23i31");
                    		 Rotfrontt.frontAction();
                    		 Rotlefft.leftAction();
                    		 RotFront.FrontAction();//wiederherstellen ??                    		                   		                    		
                    		 break;
                      case 25:System.out.println("c23p17i25->c23p23i31");
                      	     Rotfrontt.frontAction();
                      	     Rotfrontt.frontAction();
                      	     Rotdoun.downAction();                      	  
                      	     RotFront.FrontAction();//wiederherstellen ??
                      	     RotFront.FrontAction();//wiederherstellen ??
                      	     RotLeft.LeftAction();
                      	     RotLeft.LeftAction();                      	    
                      	    break;
                             default:
                                    System.out.println("default:c23p17i"+id);
                    }
                   }
                   break; 
        case  19:
        	{switch(id)
                    { case 13: System.out.println("c23p19i13->c23p23i31");
                    		 Rotrigt.rightAction();
                      	     RotFront.FrontAction();
                      	     RotRight.RightAction();//wiederherstellen
                      	     Rotdoun.downAction();
                      	     RotLeft.LeftAction();                    		
                    		 RotLeft.LeftAction();                   		 
                    		break;
                      case 27:System.out.println("c23p19i27->c23p23i31");
                      	     Rotrigt.rightAction();
                      	     Rotrigt.rightAction();
                      	     Rotdoun.downAction();
                      	     RotRight.RightAction();//wiederherstellen
                      	     RotRight.RightAction();//wiederherstellen
                      	     Rotdoun.downAction();
                      	     RotLeft.LeftAction();                    		
                    		 RotLeft.LeftAction();
                      	    break;
                             default:
                                    System.out.println("default:c23p19i"+id);
                    }
                   }
                   break;
        
                   
       
               case  21:
        	{switch(id)
                    { case 47: System.out.println("c21p21i47->c23p23i31");
                    		 Rotbakk.backAction();//wiederherstellen
                      	     Rotrigt.rightAction();
                    		 RotBack.BackAction();//wiederherstellen
                    		 
                    		break;
                      case 29:System.out.println("c21p21i29->c23p23i31");
                      	       Rotbakk.backAction();
                      	       Rotbakk.backAction();
                      	       Rotdoun.downAction();                     	       
                      	       RotBack.BackAction();//wiederherstellen
                      	       RotBack.BackAction();//wiederherstellen
                      	       RotRight.RightAction();
                      	       RotRight.RightAction();
                      	    break;
                             default:
                                    System.out.println("default:c23p21i"+id);
                    }
                   }
                   break;
        case  23:
        	{switch(id)
                    { case 9: System.out.println("c23p23i9->c23p23i31");
                    		   RotLeft.LeftAction();
                    		   Rotfrontt.frontAction();
                    		   Rotdoun.downAction();
                    		   RotFront.FrontAction();//
                    		   RotLeft.LeftAction();
                    		   RotLeft.LeftAction();                    		   
                    		break;
                      case 31:System.out.println("c23p23i31->c23p23i31");
                      	          //alles richtig
                      	       
                      	    break;
                             default:
                                    System.out.println("default:c23p23i"+id);
                    }
                   }
                   break;           
                   
        default:{System.out.println("kann nicht sein");}
        }
        
   }
   
  
  public void zustand()
  { 
  	  
  int cubi25place =myJ3dFrame.cubi25.getPlace();
  int cubi25id=myJ3dFrame.cubi25.getId();
  System.out.println("c25p"+cubi25place+"i"+cubi25id);
  
  }
  
  public void  edgePositions()
   { int place17 =myJ3dFrame.cubi17.getPlace();
     int id17=myJ3dFrame.cubi17.getId();
     int place19 =myJ3dFrame.cubi19.getPlace();
     int id19=myJ3dFrame.cubi19.getId();
     int place21 =myJ3dFrame.cubi21.getPlace();
     int id21=myJ3dFrame.cubi21.getId();
     int place23 =myJ3dFrame.cubi23.getPlace();
     int id23=myJ3dFrame.cubi23.getId();
     System.out.println("c17p"+place17+"i"+id17+" c19p"+place19+"i"+id19+" c21p"+place21+"i"+id21+" c23p"+place23+"i"+id23);
   }
  public boolean whiteCrossReady()
    {boolean value=false;
     int place16 =myJ3dFrame.cubi16.getPlace();
     int id16=myJ3dFrame.cubi16.getId();
     int place18 =myJ3dFrame.cubi18.getPlace();
     int id18=myJ3dFrame.cubi18.getId();
     int place20 =myJ3dFrame.cubi20.getPlace();
     int id20=myJ3dFrame.cubi20.getId();
     int place22 =myJ3dFrame.cubi22.getPlace();
     int id22=myJ3dFrame.cubi22.getId();
   	
     int place17 =myJ3dFrame.cubi17.getPlace();
     int id17=myJ3dFrame.cubi17.getId();
     int place19 =myJ3dFrame.cubi19.getPlace();
     int id19=myJ3dFrame.cubi19.getId();
     int place21 =myJ3dFrame.cubi21.getPlace();
     int id21=myJ3dFrame.cubi21.getId();
     int place23 =myJ3dFrame.cubi23.getPlace();
     int id23=myJ3dFrame.cubi23.getId();    
     value= (place17==17&&id17==25) &&
            (place19==19&&id19==27) &&
            (place21==21&&id21==29) &&
            (place23==23&&id23==31) ;
         return value;
    }
    
  public boolean axesReady()
  {boolean value=false;
    int cubi9place =myJ3dFrame.cubi9.getPlace();
    int cubi9id=myJ3dFrame.cubi9.getId();
    int cubi13place =myJ3dFrame.cubi13.getPlace();
    int cubi13id=myJ3dFrame.cubi13.getId();   
  	int cubi25place =myJ3dFrame.cubi25.getPlace();
    int cubi25id=myJ3dFrame.cubi25.getId();
     System.out.println("c9p"+cubi9place+"i"+cubi9id);
     System.out.println("c13p"+cubi13place+"i"+cubi13id);
     System.out.println("c25p"+cubi25place+"i"+cubi25id);
         value=(cubi9place==9&&cubi9id==1) &&
               (cubi13place==13&&cubi13id==5) &&
               (cubi25place==25&&cubi25id==25);
               return value;
  }

  public void achsenAusrichten()
  { //cubi25 kann sich auf den Plätzen 24,9,11,13,15,25 befinden
  	int cubi9place =myJ3dFrame.cubi9.getPlace();
    int cubi9id=myJ3dFrame.cubi9.getId();
    int cubi13place =myJ3dFrame.cubi13.getPlace();
    int cubi13id=myJ3dFrame.cubi13.getId();   
  	int cubi25place =myJ3dFrame.cubi25.getPlace();
    int cubi25id=myJ3dFrame.cubi25.getId();
     System.out.println("c9p"+cubi9place+"i"+cubi9id);
     System.out.println("c13p"+cubi13place+"i"+cubi13id);
     System.out.println("c25p"+cubi25place+"i"+cubi25id);
    System.out.println("achsenAusrichten()");
   //System.out.println("c25p"+cubi25place+"i"+cubi25id);
  	switch(cubi25place)
    { 
    case  24:{
    		 //System.out.println("c25p24i"+cubi25id);
    		// Rot_M_X.M_X_Action();
    		 //Rot_M_X.M_X_Action();
    		 Rot_X.X_Action();
    		 Rot_X.X_Action();
             break;}
    case  9: {
    		 //System.out.println("c25p9i"+cubi25id);
    		  //Rot_M_X.M_X_Action();
    		   Rot_X.X_Action();
             break;}
    case  11:{
    		 //System.out.println("c25p11i"+cubi25id);
    		 //Rot_M_Y.M_Y_Action();
    		 Rot_Y.Y_Action();
             break;}
    case  13:{
    		 //System.out.println("c25p13i"+cubi25id);
    		  //Rot_M_invX.M_invX_Action();
    		  Rot_invX.invX_Action();
             break;}
    case  15:{
    		 //System.out.println("c25p15i"+cubi25id);
    		  //Rot_M_invY.M_invY_Action();
    		  Rot_invY.invY_Action();
             break;}
    case  25:{
    		 //System.out.println("c25p25i"+cubi25id);
             break;}
  default:{
    		 //System.out.println("c25p"+cubi25place+"i"+cubi25id);
           break;}
    }
     cubi25place =myJ3dFrame.cubi25.getPlace();
     cubi25id=myJ3dFrame.cubi25.getId();
     
     cubi9place =myJ3dFrame.cubi9.getPlace();
     cubi9id=myJ3dFrame.cubi9.getId();
     
     
     
   //cubi9  sich auf dann den Plätzen 9,11,13,15 befinden 
     switch(cubi9place)
    { 
                
    case  9: {
    		 System.out.println("c25p9i"+cubi25id);
    		  
             break;}
    case  11:{
    		 System.out.println("c25p11i"+cubi25id);
    		 //Rot_M_invZ.M_invZ_Action();
    		 Rot_invZ.invZ_Action();
             break;}
    case  13:{
    		 System.out.println("c25p13i"+cubi25id);
    		  //Rot_M_Z.M_Z_Action();
    		  //Rot_M_Z.M_Z_Action();
    		 Rot_Z.Z_Action();
    		 Rot_Z.Z_Action();
             break;}
    case  15:{
    		 System.out.println("c25p15i"+cubi25id);
    		  //Rot_M_Z.M_Z_Action();
    		  Rot_Z.Z_Action();
             break;}
  default:{
    		 System.out.println("c25p"+cubi25place+"i"+cubi25id);
           break;}
           
  
    }
      cubi9place =myJ3dFrame.cubi9.getPlace();
      cubi9id=myJ3dFrame.cubi9.getId();
      System.out.println("c9p"+cubi9place+"i"+cubi9id);
      cubi13place =myJ3dFrame.cubi13.getPlace();
      cubi13id=myJ3dFrame.cubi13.getId();
      System.out.println("c13p"+cubi13place+"i"+cubi13id);      
      cubi25place =myJ3dFrame.cubi25.getPlace();
      cubi25id=myJ3dFrame.cubi25.getId();
      System.out.println("c25p"+cubi25place+"i"+cubi25id);  
  }
  
  
}
