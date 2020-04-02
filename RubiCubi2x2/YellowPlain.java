import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
import javax.media.j3d.GeometryStripArray.*;
import javax.vecmath.*;
import java.util.Scanner;
/**
 * Write a description of class YellowPlain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class YellowPlain
{ J3dFrame myJ3dFrame=null;
  int zuege=0;	
  
	
  //int[] places=new int[8];//
  //int[] ids=new int[8];//
  int t=0; // Timer
  //int yellowTwinsNumber=0;
  Scanner sc = new Scanner(System.in);
  String eingabe;
    /**
     * Constructor for objects of class YellowPlain
     */
    public YellowPlain(J3dFrame myJ3dFrame)
    { this.myJ3dFrame=myJ3dFrame;
      solveYellowPlain();
      
       System.out.println("YellowPlain: Zuege="+zuege);
       myJ3dFrame.zuege=zuege;
       //System.out.println("insgesamt: Zuege="+ myJ3dFrame.zuege);
    }
 public YellowPlain(J3dFrame myJ3dFrame,String s)
    { this.myJ3dFrame=myJ3dFrame;
     testYellowPlain();    
    }
 public void testYellowPlain()
 { System.out.println("yellowsOnTop="+yellowsOnTop());
   System.out.println("lonelyYellowOnTop()="+lonelyYellowOnTop());
   System.out.println("yellowsDiagonalOnTop="+yellowDiagonalOnTop());
   System.out.println("yellowTwinsOnTop="+yellowTwinsOnTop());
   System.out.println("yellowCoupleOnTop="+yellowCoupleOnTop());
 }
 
 public void solveYellowPlain()
 { zuege=0;
   int yellows=yellowsOnTop();
 System.out.println("Start: yellowsOnTop()="+yellows);
 	 while (yellows <4)
 	 { 
 	 	 switch (yellows)
 	  { case 0: 
 	 		 {System.out.println("case 0:"); 	 		 	 
 	 		 try{	 
 	 		 Thread.sleep(t);
 	 		 } catch(InterruptedException e) {e.getMessage();}
 	 		 	 		 
 	 		 RUrURUUr();zuege=zuege+8;}
 	 		 break;
 	   case 1: 
 	 		 {System.out.println("case 1:");placeTheLonelyYellow();
 	 		 try{	 
 	 		 Thread.sleep(t);
 	 		 } catch(InterruptedException e) {e.getMessage();}
 	 		 
 	 		 RUrURUUr();zuege=zuege+8;}
 	 		 break;
 	   case 2: 
 	 		 {System.out.println("case 2:"); 
 	 		 if(yellowDiagonalOnTop()) 
 	 		 { 
 	 		   try{	 
 	 		   Thread.sleep(t);
 	 		    } catch(InterruptedException e) {e.getMessage();}
 	 		    RUrURUUr();zuege=zuege+8; 
 	 		   } 
 	 		   else 
 	 		  {  placeYellowTwins();	 		   	   
 	 		    try{	 
 	 		    Thread.sleep(t);yellowTwinsOnTop();
 	 		     } catch(InterruptedException e) {e.getMessage();}
 	 		    RUrURUUr();zuege=zuege+8;  
 	 		  }
 	 		 }
 	 		 break;
 	   case 3: 
 	 		 {System.out.println("case 3:");  
 	 		 // placeYellowTwins(); //?
 	 		  try{	 
 	 		  Thread.sleep(t);
 	 		 } catch(InterruptedException e) {e.getMessage();}
 	 		  RUrURUUr();zuege=zuege+8;
 	 		 }
 	 		 break;
 	 	default: System.out.println("default:");
 	 	 }
 	   yellows=yellowsOnTop(); 
 	   System.out.println("yellowsOnTop()="+yellows);
 	   try{	 
 	 		  Thread.sleep(t);
 	 		 } catch(InterruptedException e) {e.getMessage();}
 	  }
 	
 	while(!plainReady())
 	{
 	 cornerPositions( );
 	if(yellowCoupleOnTop()) {System.out.println(yellowCoupleOnTop());  placeYellowCouple();}	 
 	 try{	 
 	 		 Thread.sleep(t);
 	 		 } catch(InterruptedException e) {e.getMessage();}
 	 
 	if(plainReady()) {System.out.println("plainReady()");} 
 	else {System.out.println("!plainready()");RuRFFrURFFRR();zuege=zuege+12;}
 	}
   
   RotY.YAction(); //  RotX.XAction();
   RotY.YAction(); //  RotX.XAction();
   turnDownPlain(); //YellowPlain
   turnUpPlain(); //YellowPlain
   zuege=zuege+8;
  
 }
 
 public boolean plainReady()
  { int[] places=new int[8];//
    int[] ids=new int[8];//
   boolean ready0=false;
   boolean ready1=false;
   boolean ready2=false;
   boolean ready3=false;
  	  getPlacesandIds(places,ids);
    ready0= (places[0]==7 && ids[0]==23 &&
             places[1]==6 && ids[1]==22 &&
             places[2]==5 && ids[2]==21 &&
             places[3]==4 && ids[3]==20);
    System.out.println("ready0 "+ready0);
    
    ready1= (places[0]==6 && ids[0]==22 &&
             places[1]==5 && ids[1]==21 &&
             places[2]==4 && ids[2]==20 &&
             places[3]==7 && ids[3]==23); 
    System.out.println("ready1 "+ready1);
    ready2= (places[0]==5 && ids[0]==21 &&
             places[1]==6 && ids[1]==20 &&
             places[2]==7 && ids[2]==23 &&
             places[3]==6 && ids[3]==22);
    System.out.println("ready2 "+ready2);
    ready3= (places[0]==4 && ids[0]==20 &&
             places[1]==7 && ids[1]==23 &&
             places[2]==6 && ids[2]==22 &&
             places[3]==5 && ids[3]==21);
    System.out.println("ready3 "+ready3);
    if (ready0) {return true;}
    if (ready1) {Rotupp.upAction();return true;}
    if (ready2) {Rotupp.upAction();Rotupp.upAction();return true;}
    if (ready3) {Rotupp.upAction();Rotupp.upAction();Rotupp.upAction();return true;}
     
    return false;
    }
    
 public int  yellowsOnTop()
  { int[] places=new int[8];//
    int[] ids=new int[8];//
  	  int yellows=0;
  	  getPlacesandIds(places,ids);
  	  if(places[0]>3 && ids[0]>19) {yellows++;System.out.println("cubi0 place="+places[0]);}
  	  if(places[1]>3 && ids[1]>19) {yellows++;System.out.println("cubi1 place="+places[1]);}
  	  if(places[2]>3 && ids[2]>19) {yellows++;System.out.println("cubi2 place="+places[2]);}
  	  if(places[3]>3 && ids[3]>19) {yellows++;System.out.println("cubi3 place="+places[3]);}
     return yellows ;       
    }

 public boolean yellowDiagonalOnTop()
  { int[] places=new int[8];//
     int[] ids=new int[8];//
     boolean diag=false;
     boolean[] b=new boolean[8];
     getPlacesandIds(places,ids);
     //cornerPositions(places,ids);
     b[0]=false;b[1]=false;b[2]=false;b[3]=false;b[4]=false;b[5]=false;b[6]=false;b[7]=false;
         
     b[places[0]]=ids[0]>19;
     b[places[1]]=ids[1]>19;
     b[places[2]]=ids[2]>19;
     b[places[3]]=ids[3]>19;

     diag=((b[4]&&b[6])&&((!b[5]&&!b[7])))||((!b[4]&&!b[6])&&((b[5]&&b[7])));
     return diag ;       
    }
 
 public void turnDownPlain() // ist schon wieder umgedreht,darum RotDown
 {  int[] places=new int[8];//
    int[] ids=new int[8];//
 	 int cubi=0;
 	 getPlacesandIds(places,ids);
 	 while (!(places[cubi]==0))
 	 {  RotDown.DownAction();
 	 	getPlacesandIds(places,ids);
 	 }
 }
 
 public void turnUpPlain() // ist schon wieder umgedreht,darum RotUp
 {  int[] places=new int[8];//
    int[] ids=new int[8];//
 	 int cubi=7;
 	 getPlacesandIds(places,ids);
 	 while (!(places[cubi]==7))
 	 {  RotUp.UpAction();
 	 	getPlacesandIds(places,ids);
 	 }
 }
 
 public boolean lonelyYellowOnTop()  
  {  int[] places=new int[8];//
     int[] ids=new int[8];// 
  	  int cubi=0; 
  	  if(!(yellowsOnTop()==1)) return false;
      getPlacesandIds(places,ids);
       for ( cubi=0;cubi<4;cubi++)
 	 	 { if(places[cubi]>3 && ids[cubi]>19) {return true;}}           
   	   return false;
    }
 
 public void placeTheLonelyYellow() //es gibt genau einen gelben Up
 {  int[] places=new int[8];//
    int[] ids=new int[8];//
 	 int cubi=getTheLonelyYellow();
 	 getPlacesandIds(places,ids);
 	 if(!(places[cubi]==4))
 	 {
 	 getPlacesandIds(places,ids);
 	 for ( cubi=0;cubi<4;cubi++)
 	 	 { if(places[cubi]>3 && ids[cubi]>19) { break;}} 
 	     while (!(places[cubi]==4))
 	 	 { 
 	 	   RotUp.UpAction();
 	 	   getPlacesandIds(places,ids); 	 	   
 	 	 }	
 	 }
   } 
   
 public int getTheLonelyYellow()
 {  int[] places=new int[8];//
    int[] ids=new int[8];//
 	 int cubi;
 	 getPlacesandIds(places,ids);
 	 for ( cubi=0;cubi<4;cubi++)
 	 	 { if(places[cubi]>3 && ids[cubi]>19) { break;}}
 	 return cubi;
 }
   
 public boolean yellowTwinsOnTop()  
  {   int cubia=0;int cubib=0;
      boolean gefunden=false;     
      for (cubia=0;cubia<4;cubia++)
      {
      for (cubib=0;cubib<4;cubib++)
   	   {if (!(cubia==cubib)) {gefunden=yellowTwins(cubia,cubib);}
   	   	   if(gefunden) {return true;}
   	   	   }   	   	  
   	   } 
   	   return false;
    }
    
  public void placeYellowTwins()
  { int[] places=new int[8];//
    int[] ids=new int[8];//
  	  int cubia=0;int cubib=0;
      boolean gefunden=false;   
      for (cubia=0;cubia<4;cubia++)
      {
      for (cubib=0;cubib<4;cubib++)
   	   {if (!(cubia==cubib)) {gefunden=yellowTwins(cubia,cubib);}
   	   	   if(gefunden) 
   	   	   	   { break;}  	   	  
   	   }
 	 if(gefunden) break;
    }
    //for loops  end // move cubia to place 7 //könnte noch falsche Reihefolge sein 
    if(gefunden) 
    { getPlacesandIds(places,ids);
     while (!(places[cubia]==7))
 	 	 { 
 	 	   RotUp.UpAction();
 	 	   getPlacesandIds(places,ids);
 	 	   System.out.println("YellowTwins on:"+places[cubia]+","+places[cubib]);
 	      } 
 	    //nachjustieren
 	    getPlacesandIds(places,ids);	    	
 	 if(places[cubib]==4)  RotUp.UpAction();//Dann war es die falsche Reihenfolge 
 	 getPlacesandIds(places,ids);
 	 System.out.println("YellowTwins on:"+places[cubia]+","+places[cubib]);
 	 }
  }
  
  
    
  
  
   
  public boolean yellowTwins(int cubi_a,int cubi_b) // gelbe Ups die neben einander liegen  ####davon gibt es mehr
 {  int[] places=new int[8];//
    int[] ids=new int[8];//
  int place_a; 
  int place_b;
  int id_a;
  int id_b;
  getPlacesandIds(places,ids);
  place_a=places[cubi_a];place_b=places[cubi_b];
  id_a=ids[cubi_a]; id_b=ids[cubi_b]; 
  if(place_a>3 && id_a>19 && place_b>3 &&id_b>19)
  {
  switch(cubi_a)
  { case 0:{
  	        switch(cubi_b)
  	        {   
  	            case 1:{
  	                    switch(place_a)
  	                         { case 4:{if(place_b==5 || place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4 || place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5 || place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4 || place_b==6) return true;else return false;}//;break;
  	                          }
  	                   } 
  	    		   //break;
  	    		   case 2:{
  	                  switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break; 	              
  	                          }
  	                }
  	    		//break; 
  	    		  case 3:{
  	                    switch(place_a)
  	                         { case 4:{if(place_b==5 || place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4 || place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5 || place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4 || place_b==6) return true;else return false;}//;break;
  	                          }
  	                   } 
  	    		   //break;
  	          	           
  	          default: return false;//kein Paar 	        
  	        }  	  
  	        }
  	        //break;
     case 1:{
  		switch(cubi_b)
  	        {  case 0:{
  	                   switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                    }
  	                 }
  	    		//break;
  	        
  	          case 2:{
  	                  switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break; 	              
  	                          }
  	                }
  	    		//break;
  	    	   case 3:{
  	                    switch(place_a)
  	                         { case 4:{if(place_b==5 || place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4 || place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5 || place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4 || place_b==6) return true;else return false;}//;break;
  	                          }
  	                   } 
  	    		   //break;
  	          default: return false;//kein Paar 	        
  	        } 	
  	       }
  	        //break;
      case 2: {
    		switch(cubi_b)
  	        {  case 0:{
  	                   switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                    }
  	                 }
  	    		//break;
  	          	        
  	          case 1:{  
  	                    switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                         }  	            
  	                   } 
  	    		//break;
  	        
  	          case 3:{
  	                  switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break; 
  	                         }
  	                 } 
  	    		//break; 
  	          default: return false;//kein Paar 	        
  	        }    		
  	        }
  	       // break;
  	case 3:{
  		switch(cubi_b)
  	        {  case 0:{
  	                   switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break; 
  	                         }
  	                  } 
  	    		//break;
  	    	  case 1:{  
  	                    switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                         }  	            
  	                   } 
  	    		//break;
  	        
  	          case 2:{
  	                   switch(place_a)
  	                         { case 4:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4||place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5||place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4||place_b==6) return true;else return false;}//;break; 
  	                         }
  	                  } 
  	    		//break; 
  	          default: return false;//kein Paar 	        
  	        }
  	        }
  	        //break;
  	default: // kann nicht sein
   } 
  }
  
 	 return false;
 }
 
 public void placeYellowCouple()
  { int[] places=new int[8];//
    int[] ids=new int[8];// 
  	  int cubia=0;int cubib=0;
      boolean gefunden=false;
    
      for (cubia=0;cubia<4;cubia++)
      {
      for (cubib=0;cubib<4;cubib++)
   	   {if (!(cubia==cubib)) {gefunden=yellowCouple(cubia,cubib);}
   	   	if(gefunden)  { break;}	 //inner for loop     	   	  
   	   }
 	 if(gefunden) break; }//outer for loop
       
     // move cubia to place 7 //könnte noch falsche Reihefolge sein       }
    if(gefunden) 
    { getPlacesandIds(places,ids);
     while (!(places[cubia]==7))
 	 	 { 
 	 	   Rotupp.upAction();
 	 	   getPlacesandIds(places,ids);
 	      } 
 	    //nachjustieren
 	    getPlacesandIds(places,ids);
 	  System.out.println("cubi"+cubia+"place"+places[cubia]+"id"+ids[cubia]+"  cubi"+cubib+"place"+places[cubib]+"id"+ids[cubib]); 	
 	 if(places[cubib]==4)  RotUp.UpAction();//War die falsche Reihenfolge
 	 System.out.println("cubi"+cubia+"place"+places[cubia]+"id"+ids[cubia]+"  cubi"+cubib+"place"+places[cubib]+"id"+ids[cubib]);
 	  } 
 	
  
}
 public boolean yellowCoupleOnTop() 
 {   int cubia=0;int cubib=0;
      boolean gefunden=false;
      for (cubia=0;cubia<4;cubia++)
      {
      for (cubib=0;cubib<4;cubib++)
   	   {if (!(cubia==cubib)) {gefunden=yellowCouple(cubia,cubib);}
   	   	if(gefunden) { return true;}
   	   	   }   	   	  
   	  
   }
   return false;
 }
 
  public boolean yellowCouple(int cubi_a,int cubi_b) //es gibt genau zwei  gelbe Ups die zusammen passen (oder alle 4 dann sind wir fertig)
 {  int[] places=new int[8];//
    int[] ids=new int[8];//
  int place_a; //4,5,6,7
  int place_b;
  int id_a;
  int id_b;
  getPlacesandIds(places,ids);
  place_a=places[cubi_a];place_b=places[cubi_b];
  id_a=ids[cubi_a];id_b=ids[cubi_b];  
  if(place_a>3 && id_a>19 && place_b>3 &&id_b>19)
  {
  
  switch(cubi_a)
  { case 0:{
  	        switch(cubi_b)
  	        {  case 1:{
  	                    switch(place_a)
  	                         { case 4:{if(place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5) return true;else return false;}//;break;
  	                           case 7:{if(place_b==6) return true;else return false;}//;break;
  	                          }
  	                   } 
  	    		   //break;
  	        
  	          case 3: {
  	                    switch(place_a)
  	                         { case 4:{if(place_b==5) return true;else return false;}//;break;
  	                           case 5:{if(place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4) return true;else return false;}//;break;
  	                   } 
  	                 }
  	    		//break; 
  	          default: return false;//kein Paar 	        
  	        }  	  
  	        }
  	        //break;
     case 1:{
  		switch(cubi_b)
  	        {  case 0:{
  	                   switch(place_a)
  	                         { case 4:{if(place_b==5) return true;else return false;}//;break;
  	                           case 5:{if(place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4) return true;else return false;}//;break;
  	                    }
  	                 }
  	    		//break;
  	        
  	          case 2:{
  	                  switch(place_a)
  	                         { case 4:{if(place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5) return true;else return false;}//;break;
  	                           case 7:{if(place_b==6) return true;else return false;}//;break; 	              
  	                          }
  	                }
  	    		//break; 
  	          default: return false;//kein Paar 	        
  	        } 	
  	       }
  	        //break;
      case 2: {
    		switch(cubi_b)
  	        {  case 1:{  
  	                    switch(place_a)
  	                         { case 4:{if(place_b==5) return true;else return false;}//;break;
  	                           case 5:{if(place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4) return true;else return false;}//;break;
  	                         }  	            
  	                   } 
  	    		//break;
  	        
  	          case 3:{
  	                  switch(place_a)
  	                         { case 4:{if(place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5) return true;else return false;}//;break;
  	                           case 7:{if(place_b==6) return true;else return false;}//;break; 
  	                         }
  	                 } 
  	    		//break; 
  	          default: return false;//kein Paar 	        
  	        }    		
  	        }
  	       // break;
  	case 3:{
  		switch(cubi_b)
  	        {  case 2:{
  	                   switch(place_a)
  	                         { case 4:{if(place_b==5) return true;else return false;}//;break;
  	                           case 5:{if(place_b==6) return true;else return false;}//;break;
  	                           case 6:{if(place_b==7) return true;else return false;}//;break;
  	                           case 7:{if(place_b==4) return true;else return false;}//;break; 
  	                         }
  	                  } 
  	    		//break;
  	        
  	          case 0:{
  	                   switch(place_a)
  	                         { case 4:{if(place_b==7) return true;else return false;}//;break;
  	                           case 5:{if(place_b==4) return true;else return false;}//;break;
  	                           case 6:{if(place_b==5) return true;else return false;}//;break;
  	                           case 7:{if(place_b==5) return true;else return false;}//;break; 
  	                         }
  	                  } 
  	    		//break; 
  	          default: return false;//kein Paar 	        
  	        }
  	        }
  	        //break;
  	default: // kann nicht sein
   }
  }
  
 	 return false;
 }
 
 
 public void RUrURUUr()
 {   System.out.println("RUrURUUr()");
 	 RotRight.RightAction();
 	 RotUp.UpAction();
 	 Rotrigt.rightAction();
 	 RotUp.UpAction();
 	 RotRight.RightAction();
 	 RotUp.UpAction();
 	 RotUp.UpAction();
 	 Rotrigt.rightAction();
 	 
   }
 public void RuRFFrURFFRR()
 {  System.out.println("RuRFFrURFFRR()");
 	 RotRight.RightAction();
 	 Rotupp.upAction();
 	 RotRight.RightAction();
 	 RotFront.FrontAction();
 	 RotFront.FrontAction();
 	 Rotrigt.rightAction();
 	 RotUp.UpAction();
 	 RotRight.RightAction();
 	 RotFront.FrontAction();
 	 RotFront.FrontAction();
 	 RotRight.RightAction();
 	 RotRight.RightAction();
   }
 
  public void getPlacesandIds(int[] places,int[] ids)
  {   
  places[0]=myJ3dFrame.cubi0.getPlace(); //in places[0] steht der Platz auf dem sich das Cubi0 befindet  	 
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
    
  
  public void cornerPositions()
  { int[] places=new int[8];//
    int[] ids=new int[8];//
   getPlacesandIds(places,ids); 
  System.out.print("c0p"+places[0]+"i"+ids[0]);
  System.out.print(" ,c1p"+places[1]+"i"+ids[1]);
  System.out.print(" ,c2p"+places[2]+"i"+ids[2]);
  System.out.print(" ,c3p"+places[3]+"i"+ids[3]); 
  System.out.println();
  System.out.print("c4p"+places[4]+"i"+ids[4]);
  System.out.print(",c5p"+places[5]+"i"+ids[5]);
  System.out.print(",c6p"+places[6]+"i"+ids[6]);
  System.out.print(",c7p"+places[7]+"i"+ids[7]);
  System.out.println(); 
  } 
 

}
