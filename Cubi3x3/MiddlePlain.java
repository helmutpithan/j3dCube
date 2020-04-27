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
 * Write a description of class MiddlePlain here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
public class MiddlePlain
{J3dFrame myJ3dFrame=null;
    //MiddlePlainCubis sind 8,10,12,14
    

    /**
     * Constructor for objects of class MiddlePlain
     */
     public MiddlePlain(J3dFrame myJ3dFrame,String test)
    {this.myJ3dFrame=myJ3dFrame;
      System.out.println("MiddelPlain");
      zustand();
    }
    public MiddlePlain(J3dFrame myJ3dFrame)
    {this.myJ3dFrame=myJ3dFrame;
      System.out.println("MiddelPlain");
    if (!plainReady())	
    {
     if(edgeInDownPlainTo_1() && edgeInMiddlePlainTo_8()) frontleftswap();
     if(edgeInDownPlainTo_1() && edgeInMiddlePlainTo_8()) frontleftswap();
     if(edgeInDownPlainTo_1() && edgeInMiddlePlainTo_8()) frontleftswap();
     if(edgeInDownPlainTo_1() && edgeInMiddlePlainTo_8()) frontleftswap();
     if(edgeInDownPlainTo_1() && edgeInMiddlePlainTo_8()) frontleftswap();
   
    // zustands();
     //MiddlePlane ausrichten
     {int place =myJ3dFrame.cubi15.getPlace();
     	 while(place!=15){Rot_M_invZ.M_invZ_Action();place =myJ3dFrame.cubi15.getPlace(); }
      }
       //DownPlane ausrichten
      {int place =myJ3dFrame.cubi0.getPlace();
     	 while(place!=0){Rotdoun.downAction();place =myJ3dFrame.cubi0.getPlace(); }
      }
     solveMiddlePlain();
     //DownPlane erneut ausrichten
     {int place =myJ3dFrame.cubi1.getPlace();
     	 while(place!=1){Rotdoun.downAction();place =myJ3dFrame.cubi1.getPlace(); }
      }
     
    }
    System.out.println("MiddlePlain plainReady()="+plainReady());
}
   
    public boolean edgeInDownPlainTo_1()
    { boolean swap=false;
    	int place;
    	int i;
        for( i=0;i<8;i++)
        	{ if(edgeInDownPlain_1_14(i)) {System.out.println("i="+i);break;}}
        
    		{switch(i)
    		{       case 1:{place =myJ3dFrame.cubi1.getPlace();
    			            while(place!=1)
    			            {Rotdoun.downAction();
    			             place =myJ3dFrame.cubi1.getPlace();} 
    			             swap=true;
    			           }
    				break;
    				case 3:{place =myJ3dFrame.cubi3.getPlace();
    			            while(place!=1)
    			            {Rotdoun.downAction();
    			             place =myJ3dFrame.cubi3.getPlace();} 
    			             swap=true;
    			           }
    				break;
    				case 5:{place =myJ3dFrame.cubi5.getPlace();
    			            while(place!=1)
    			            {Rotdoun.downAction();
    			             place =myJ3dFrame.cubi5.getPlace();}
    			             swap=true;
    			           }
    				break;
    				case 7:{place =myJ3dFrame.cubi7.getPlace();
    			            while(place!=1)
    			            {Rotdoun.downAction();
    			             place =myJ3dFrame.cubi7.getPlace();} 
    			             swap=true;
    			           }
    				break;	
    			}
    	  }
    	  return swap;
    }

    public boolean edgeInMiddlePlainTo_8()
    { 
     boolean swap=false;
    	int place;
    	int j;
        for(j=8;j<15;j++)
        	{ if(edgeInMiddlePlain_1_14(j)) {System.out.println("j="+j);break;}}
        
    		{switch(j)
    		{      
    				case 8:{place =myJ3dFrame.cubi8.getPlace();
    			            while(place!=8)
    			            {Rot_M_invZ.M_invZ_Action();
    			             place =myJ3dFrame.cubi8.getPlace();} 
    			             swap=true;
    			           }
    				break;
    				case 10:{place =myJ3dFrame.cubi10.getPlace();
    			            while(place!=8)
    			            {Rot_M_invZ.M_invZ_Action();
    			             place =myJ3dFrame.cubi10.getPlace();}
    			             swap=true;
    			           }
    				break;
    				case 12:{place =myJ3dFrame.cubi12.getPlace();
    			            while(place!=8)
    			            {Rot_M_invZ.M_invZ_Action();
    			             place =myJ3dFrame.cubi12.getPlace();} 
    			             swap=true;
    			           }
    				break;
    				case 14:{place =myJ3dFrame.cubi14.getPlace();
    			            while(place!=8)
    			            {Rot_M_invZ.M_invZ_Action();
    			             place =myJ3dFrame.cubi14.getPlace();} 
    			             swap=true;
    			           }
    				break;   				
    			}    		
    	}
    	return swap;
    }
    
    public void zustand()
    {//place und id feststellen
   
   /* 	
    int place1 =myJ3dFrame.cubi1.getPlace();
    int id1=myJ3dFrame.cubi1.getId();
    int place3 =myJ3dFrame.cubi3.getPlace();
    int id3=myJ3dFrame.cubi3.getId();
    int place5 =myJ3dFrame.cubi5.getPlace();
    int id5=myJ3dFrame.cubi5.getId();
    int place7 =myJ3dFrame.cubi7.getPlace();
    int id7=myJ3dFrame.cubi7.getId();*/	
    int place8 =myJ3dFrame.cubi8.getPlace();
    int id8=myJ3dFrame.cubi8.getId();
    int place10 =myJ3dFrame.cubi10.getPlace();
    int id10=myJ3dFrame.cubi10.getId();
    int place12 =myJ3dFrame.cubi12.getPlace();
    int id12=myJ3dFrame.cubi12.getId();
    int place14 =myJ3dFrame.cubi14.getPlace();
    int id14=myJ3dFrame.cubi14.getId();
    
    
   /* System.out.println("c1p"+place1+"i"+id1);
    System.out.println("c3p"+place3+"i"+id3);
    System.out.println("c5p"+place5+"i"+id5);
    System.out.println("c7p"+place7+"i"+id7); */  
    System.out.println("c8p"+place8+"i"+id8+" c10p"+place10+"i"+id10+" c12p"+place12+"i"+id12+" c14p"+place14+"i"+id14);
    /*System.out.println("c10p"+place10+"i"+id10);
    System.out.println("c12p"+place12+"i"+id12);
    System.out.println("c14p"+place14+"i"+id14);*/
    
   System.out.println("allEdgesinPlain="+allEdgesinPlain());    
   System.out.println("MiddlePlain ready="+plainReady());
   
    }
    
 boolean edgeInDownPlain_1_14(int cubiNr)
 { int place;
 	 switch(cubiNr)
 { case 1:{place=myJ3dFrame.cubi1.getPlace();if(place>0 && place <8) return true;}
 		 break;
   case 3:{place=myJ3dFrame.cubi3.getPlace();if(place>0 && place <8) return true;}
 		 break;
   case 5:{place=myJ3dFrame.cubi5.getPlace();if(place>0 && place <8) return true;}
 		 break;
   case 7:{place=myJ3dFrame.cubi7.getPlace();if(place>0 && place <8) return true;}
 		 break;
   case 8:{place=myJ3dFrame.cubi8.getPlace();if(place>0 && place <8) return true;}
 		 break;
   case 10:{place=myJ3dFrame.cubi10.getPlace();if(place>0 && place <8) return true;}
 		 break;
   case 12:{place=myJ3dFrame.cubi12.getPlace();if(place>0 && place <8) return true;}
 		 break;
   case 14:{place=myJ3dFrame.cubi14.getPlace();if(place>0 && place <7) return true;}
 		 break;
 	default:return false;
 	 }
  return false;
 }   
 boolean edgeInMiddlePlain_1_14(int cubiNr)
 { int place;
 	 switch(cubiNr)
 { case 1:{place=myJ3dFrame.cubi1.getPlace();if(place>7 && place <15) return true;}
 		 break;
   case 3:{place=myJ3dFrame.cubi3.getPlace();if(place>7 && place <15) return true;}
 		 break;
   case 5:{place=myJ3dFrame.cubi5.getPlace();if(place>7 && place <15) return true;}
 		 break;
   case 7:{place=myJ3dFrame.cubi7.getPlace();if(place>7 && place <15) return true;}
 		 break;
   case 8:{place=myJ3dFrame.cubi8.getPlace();if(place>7 && place <15) return true;}
 		 break;
   case 10:{place=myJ3dFrame.cubi10.getPlace();if(place>7 && place <15) return true;}
 		 break;
   case 12:{place=myJ3dFrame.cubi12.getPlace();if(place>7 && place <15) return true;}
 		 break;
   case 14:{place=myJ3dFrame.cubi14.getPlace();if(place>7 && place <15) return true;}
 		 break;
 	default:return false;
 	 }
  return false;
 }
    
 public void solveMiddlePlain()
   { int cubi;
   	 int place;
   	 int id;
   
   if (!plainReady())
   	{//if (allEdgesinPlain()) frontleftswap();// zum Tauschen muss mindestens eine edge in der Downplain sein kann nicht mehr sein
   	 
   	UseMiddlePlainEdge   useMiddlePlainEdge=useable();	
   	 System.out.println(useMiddlePlainEdge.toString());
   	 if(useMiddlePlainEdge.getCubiUseable())
   	 {cubi=useMiddlePlainEdge.getCubiNr();
   	  place=useMiddlePlainEdge.getCubiPlace();
   	  id=useMiddlePlainEdge.getCubiId();
   	  System.out.println("1. c"+cubi+"p"+place+"i"+id);
   	  placeNext(cubi,place,id);  	 
   	   }
 // hier nocheinmal  
     useMiddlePlainEdge=useable();	
   	 System.out.println(useMiddlePlainEdge.toString());
   	 if(useMiddlePlainEdge.getCubiUseable())
   	 {cubi=useMiddlePlainEdge.getCubiNr();
   	  place=useMiddlePlainEdge.getCubiPlace();
   	  id=useMiddlePlainEdge.getCubiId();
   	  System.out.println("2. c"+cubi+"p"+place+"i"+id);
   	  placeNext(cubi,place,id);  	 
   	   }   	   
   // hier nocheinmal  
     useMiddlePlainEdge=useable();	
   	 System.out.println(useMiddlePlainEdge.toString());
   	 if(useMiddlePlainEdge.getCubiUseable())
   	 {cubi=useMiddlePlainEdge.getCubiNr();
   	  place=useMiddlePlainEdge.getCubiPlace();
   	  id=useMiddlePlainEdge.getCubiId();
   	  System.out.println("3. c"+cubi+"p"+place+"i"+id);
   	  placeNext(cubi,place,id);  	 
   	   }   	
   	 // hier nocheinmal  
     useMiddlePlainEdge=useable();	
   	 System.out.println(useMiddlePlainEdge.toString());
   	 if(useMiddlePlainEdge.getCubiUseable())
   	 {cubi=useMiddlePlainEdge.getCubiNr();
   	  place=useMiddlePlainEdge.getCubiPlace();
   	  id=useMiddlePlainEdge.getCubiId();
   	  System.out.println("4. c"+cubi+"p"+place+"i"+id);
   	  placeNext(cubi,place,id);  	 
   	   }   
   	  }
   	  // 
     }
   
   public void placeNext(int cubi,int place,int id)
   {
   	   switch(cubi)
      {     case 8:
      		  { 
      		  
      		  switch(place)
      		   { case 1:
      		  	  {  if (id==19) {frontleftswap();}//ist auf Platz 1
      		  	     if (id==33) {Rotdoun.downAction();leftrightswap();} //ist auf Platz 7
      		  	  }
      		  	  break;
      		  	  
      		  	  case 3:
      		  	  {  if (id==21) {Rotdoun.downAction();frontleftswap();}//ist auf Platz 1
      		  	     if (id==35) {Rotdoun.downAction();Rotdoun.downAction();leftrightswap();//ist auf Platz 7
      		  	     }// 
      		  	  	  
      		  	  	  
      		  	  }
      		  	  break;
      		  	  case 5:
      		  	  { if (id==23) {Rotdoun.downAction();Rotdoun.downAction();frontleftswap();}//ist auf Platz 1
      		  	    if (id==37) {Rotdoun.downAction();Rotdoun.downAction();Rotdoun.downAction();leftrightswap();}//ist auf Platz 7      		  	  	  
      		  	  	  
      		  	  }
      		  	  break;
      		  	  case 7:
      		  	  {  if (id==17) { RotDown.DownAction();frontleftswap();}////ist auf Platz 1
      		  	     if (id==39) {leftrightswap();}////ist auf Platz 7         		  	  	       		  	  	 
      		  	  }
      		  	  break;     		  	  
      		  	}     		  	
      		  }
      		  break;      		  
      		case 10:
      		  { 
      		  
      		  	  switch(place)
      		   { case 1:
      		  	  {  if (id==19) { RotDown.DownAction();rightleftswap();}//ist auf Platz 3
      		  	     if (id==33) {frontrightswap();}//ist auf Platz 1       		  	  	        		  	  	 
      		  	  }
      		  	  break;
      		  	  case 3:
      		  	  {  if (id==21) {rightleftswap();}//ist auf Platz 3
      		  	     if (id==35) {Rotdoun.downAction();frontrightswap();}// ist auf Platz 1
      		  	  	  
      		  	  }
      		  	  break;
      		  	  case 5:
      		  	  { if (id==23) {Rotdoun.downAction();rightleftswap();}//ist auf Platz 3
      		  	    if (id==37) {Rotdoun.downAction();Rotdoun.downAction();frontrightswap();}//ist auf Platz 1
      		  	  	        		  	  	  
      		  	  }
      		  	  break;
      		  	  case 7:
      		  	  {  if (id==17) {Rotdoun.downAction();Rotdoun.downAction();rightleftswap();}//ist auf Platz 3
      		  	     if (id==39) {RotDown.DownAction();frontrightswap();}// ist auf Platz 1
      		  	  	        		  	  	 
      		  	  }
      		  	  break;     		  	  
      		  	} 
      		  }
      		  break;
      		case 12:
      		  {
      		  	
      		  	  switch(place)
      		   { case 1:
      		  	  { if (id==19) {RotDown.DownAction();RotDown.DownAction();backleftswap();}//ist auf 5
      		  	    if (id==33) {RotDown.DownAction();rightrightswap();}// ist auf Platz 3     		  	  	         		  	  	  
      		  	  }
      		  	  break;
      		  	  case 3:
      		  	  { if (id==21) {RotDown.DownAction();backleftswap();}//ist auf 5
      		  	    if (id==35) {rightrightswap();}// ist auf Platz 3 
      		  	  	       		  	  	 
      		  	  }
      		  	  break;
      		  	  case 5:
      		  	  { if (id==23) {backleftswap();}//ist auf 5
      		  	    if (id==37) {Rotdoun.downAction();rightrightswap();}//ist auf Platz 3
      		  	  }
      		  	  break;
      		  	  case 7:
      		  	  { if (id==17) { Rotdoun.downAction();backleftswap();}//ist auf 5
      		  	    if (id==39) {Rotdoun.downAction();Rotdoun.downAction();rightrightswap();}// ist auf Platz 3
      		  	  	        		  	  	 
      		  	  }
      		  	  break;     		  	  
      		  	} 
      		  }
      		  break;
      		case 14:
      		  { 
      		   
      		  switch(place)
      		   { case 1:
      		  	  {if (id==19) {Rotdoun.downAction();leftleftswap();}//ist auf 7
      		  	   if (id==33) {Rotdoun.downAction();Rotdoun.downAction();backrightswap();}// ist auf 5 
      		  	  	        		  	  	  
      		  	  	  
      		  	  }
      		  	  break;
      		  	  case 3:
      		  	  { if (id==21) {Rotdoun.downAction();Rotdoun.downAction();leftleftswap();}//ist auf 7
      		  	    if (id==35) {RotDown.DownAction();backrightswap();}//ist auf 5   
      		  	  	  
      		  	  	 
      		  	  }
      		  	  break;
      		  	  case 5:
      		  	  { if (id==23) { RotDown.DownAction();leftleftswap();}//ist auf 7
      		  	    if (id==37) {backrightswap();}//ist auf 5  
      		  	  	  
      		  	  	 
      		  	  }
      		  	  break;
      		  	  case 7:
      		  	  { if (id==17) {leftleftswap();}//ist auf 7
      		  	    if (id==39) {Rotdoun.downAction();backrightswap();}//ist auf 5  
      		  	  }
      		  	  break;     		  	  
      		  	} 
      		  }
      		  break;
      		 
   	    }
   	   
   }
   
   
   
    public UseMiddlePlainEdge useable()
    { int place=-1;int id=-1;
    	
    for ( int cubiNr=8;cubiNr<16;cubiNr=cubiNr+2)//middleplainCubis
    {
    	switch (cubiNr)
      { case 8: 
    	{ place=myJ3dFrame.cubi8.getPlace(); id=myJ3dFrame.cubi8.getId();
    		
    	  switch (place)
           { case 1: { return new UseMiddlePlainEdge(true,8,place,id);}  //break;
             case 3: { return new UseMiddlePlainEdge(true,8,place,id);}  //break;
             case 5: { return new UseMiddlePlainEdge(true,8,place,id);}  //break;
             case 7: { return new UseMiddlePlainEdge(true,8,place,id);}  //break;
            //default: return new UseMiddlePlainCubi(false,cubiNr,place,id);
    	  }     	
    	} break;
    	
        case 10: {place=myJ3dFrame.cubi10.getPlace(); id=myJ3dFrame.cubi10.getId();
          switch (place)
           { case 1: { return new UseMiddlePlainEdge(true,10,place,id); }  //break;
             case 3: { return new UseMiddlePlainEdge(true,10,place,id);}  //break;
             case 5: { return new UseMiddlePlainEdge(true,10,place,id);}  //break;
             case 7: { return new UseMiddlePlainEdge(true,10,place,id);}  //break;
            //default: return new UseMiddlePlainCubi(false,cubiNr,place,id);
    	  }     	
        
        } break;
        case 12: {place=myJ3dFrame.cubi12.getPlace(); id=myJ3dFrame.cubi12.getId();
          switch (place)
           { case 1: { return new UseMiddlePlainEdge(true,12,place,id); }  //break;
             case 3: { return new UseMiddlePlainEdge(true,12,place,id); }  //break;
             case 5: { return new UseMiddlePlainEdge(true,12,place,id); }  //break;
             case 7: { return new UseMiddlePlainEdge(true,12,place,id); }  //break;
            //default: return new UseMiddlePlainCubi(false,cubiNr,place,id);
    	  }     	
        } break;
        	
    	case 14: {place=myJ3dFrame.cubi14.getPlace(); id=myJ3dFrame.cubi14.getId();
    		switch (place)
           { case 1: { return new UseMiddlePlainEdge(true,14,place,id); }  //break;
             case 3: { return new UseMiddlePlainEdge(true,14,place,id);}  //break;
             case 5: { return new UseMiddlePlainEdge(true,14,place,id);}  //break;
             case 7: { return new UseMiddlePlainEdge(true,14,place,id);}  //break;
            //default: return new UseMiddlePlainCubi(false,cubiNr,place,id);
    	  }     		
    	} break;
    	default: ;//return new UseMiddlePlainEdge(false,1,-1,-1);
    	}   	
    }
    	return new UseMiddlePlainEdge(false,2,-1,-1); //?????
      }
   
  public boolean plainReady()
    {int place8 =myJ3dFrame.cubi8.getPlace();
     int id8=myJ3dFrame.cubi8.getId();
     int place10 =myJ3dFrame.cubi10.getPlace();
     int id10=myJ3dFrame.cubi10.getId();
     int place12 =myJ3dFrame.cubi12.getPlace();
     int id12=myJ3dFrame.cubi12.getId();
     int place14 =myJ3dFrame.cubi14.getPlace();
     int id14=myJ3dFrame.cubi14.getId();
     
     int place9 =myJ3dFrame.cubi9.getPlace();
     int id9=myJ3dFrame.cubi9.getId();
     int place11 =myJ3dFrame.cubi11.getPlace();
     int id11=myJ3dFrame.cubi11.getId();
     int place13 =myJ3dFrame.cubi13.getPlace();
     int id13=myJ3dFrame.cubi13.getId();
     int place15 =myJ3dFrame.cubi15.getPlace();
     int id15=myJ3dFrame.cubi15.getId();
          
    return 	(place8==8&&id8==0) &&
       (place10==10&&id10==2) &&
       (place12==12&&id12==4) &&
       (place14==14&&id14==6) &&
       (place9==9&&id9==1) &&
       (place11==11&&id11==3) &&
       (place13==13&&id13==5) &&
       (place15==15&&id15==7) ;
          	
    }
    
    public boolean edgesReady()
    {int place8 =myJ3dFrame.cubi8.getPlace();
     int id8=myJ3dFrame.cubi8.getId();
     int place10 =myJ3dFrame.cubi10.getPlace();
     int id10=myJ3dFrame.cubi10.getId();
     int place12 =myJ3dFrame.cubi12.getPlace();
     int id12=myJ3dFrame.cubi12.getId();
     int place14 =myJ3dFrame.cubi14.getPlace();
     int id14=myJ3dFrame.cubi14.getId();
     
     int place9 =myJ3dFrame.cubi9.getPlace();
     int id9=myJ3dFrame.cubi9.getId();
     int place11 =myJ3dFrame.cubi11.getPlace();
     int id11=myJ3dFrame.cubi11.getId();
     int place13 =myJ3dFrame.cubi13.getPlace();
     int id13=myJ3dFrame.cubi13.getId();
     int place15 =myJ3dFrame.cubi15.getPlace();
     int id15=myJ3dFrame.cubi15.getId();
          
    return 	(place8==8&&id8==0) &&
       (place10==10&&id10==2) &&
       (place12==12&&id12==4) &&
       (place14==14&&id14==6) &&
       (place9==9&&id9==1) &&
       (place11==11&&id11==3) &&
       (place13==13&&id13==5) &&
       (place15==15&&id15==7) ;
          	
    }
    
   public boolean allEdgesinPlain()
   { int place8 =myJ3dFrame.cubi8.getPlace();     
     int place10 =myJ3dFrame.cubi10.getPlace();     
     int place12 =myJ3dFrame.cubi12.getPlace();    
     int place14 =myJ3dFrame.cubi14.getPlace();     
     return (7<place8 && place8<15) &&
            (7<place10 && place10<15) &&
            (7<place12 && place12<15) &&
            (7<place14 && place14<15) ;    	 
   }
    
    
    
        
    public void frontrightswap()
    {
    //System.out.println("frontrightswap()");
     Rotdoun.downAction();
     Rotrigt.rightAction();
     RotDown.DownAction();
     RotRight.RightAction();
     RotDown.DownAction();
     RotFront.FrontAction();
     Rotdoun.downAction();
     Rotfrontt.frontAction();
    }
    
    public void frontleftswap()
    { 
    //System.out.println("frontleftswap()");
      RotDown.DownAction();
      RotLeft.LeftAction();
      Rotdoun.downAction();
      Rotlefft.leftAction();
      Rotdoun.downAction();
      Rotfrontt.frontAction();
      RotDown.DownAction();
      RotFront.FrontAction();      
    }
    
    public void leftrightswap()
    { 
    //System.out.println("leftrightswap()");
      Rotdoun.downAction();     
      Rotfrontt.frontAction();
      RotDown.DownAction();
      RotFront.FrontAction();
      RotDown.DownAction();
      RotLeft.LeftAction();
      Rotdoun.downAction();
      Rotlefft.leftAction();
    }
       
    public void leftleftswap()
    { 
    //System.out.println("leftleftswap()");
      RotDown.DownAction();
      RotBack.BackAction();
      Rotdoun.downAction();
      Rotbakk.backAction();
      Rotdoun.downAction();
      Rotlefft.leftAction();
      RotDown.DownAction();
      RotLeft.LeftAction();    	
    }    
    public void backrightswap()
    {
    //System.out.println("backrightswap()");
     Rotdoun.downAction();
     Rotlefft.leftAction();
     RotDown.DownAction();
     RotLeft.LeftAction();
     RotDown.DownAction();
     RotBack.BackAction();
     Rotdoun.downAction();
     Rotbakk.backAction();
    }    
    public void backleftswap()
    {
    //System.out.println("backleftswap()"); 
      RotDown.DownAction();
      RotRight.RightAction();
      Rotdoun.downAction();
      Rotrigt.rightAction();
      Rotdoun.downAction();
      Rotbakk.backAction();
      RotDown.DownAction();
      RotBack.BackAction();
    }    
    public void rightrightswap()
    {
    //System.out.println("rightrightswap()");
     Rotdoun.downAction();
     Rotbakk.backAction();
     RotDown.DownAction();
     RotBack.BackAction();
     RotDown.DownAction();
     RotRight.RightAction();
     Rotdoun.downAction();
     Rotrigt.rightAction();
    }    
    public void rightleftswap()
    {
    //System.out.println("rightleftswap()");
    RotDown.DownAction();
    RotFront.FrontAction();
    Rotdoun.downAction();
    Rotfrontt.frontAction();
    Rotdoun.downAction();
    Rotrigt.rightAction();
    RotDown.DownAction();
    RotRight.RightAction();
    }
    
 
//Subclasses    
 class UseMiddlePlainEdge
{     private boolean useable=false;
      private int cubiNr=-1;
      private int place=-1;
      private int id=-1;
    
    /**
     * Constructor for objects of class UseMiddlePlainCubi
     */
    public UseMiddlePlainEdge(boolean useable,int cubiNr,int place,int id)
    { this.useable=useable;
      this.cubiNr=cubiNr;
      this.place=place;
      this.id=id;
    }
    
    public boolean getCubiUseable()
    {return useable;
    }
    
    public int getCubiNr()
    {
    	return cubiNr;
    }
    
    int getCubiPlace()
    {
     return place;
    }
    
    public int getCubiId()
    {
    	return id;
    }
    
    public String  toString()
    {String s=new String(""+useable+","+cubiNr+","+place+","+id);
    	return s;
     };
    
    
}   
}
