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
 * Write a description of class DownCorners here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
public class DownCorners
{ J3dFrame myJ3dFrame=null;
    
    /**
     * Constructor for objects of class DownCorners
     */
    public DownCorners(J3dFrame myJ3dFrame,String s)
    { this.myJ3dFrame=myJ3dFrame;
       System.out.println("DownCorners:"+s);
       System.out.println("cornersReady()="+cornersReady());
       cornerPositions();
    }
    public DownCorners(J3dFrame myJ3dFrame)
    { this.myJ3dFrame=myJ3dFrame;
      System.out.println("DownCorners");
      solveDownCorners();
      // der letzte Schliff
      //noch einmal YellowCross
      if (!plainReady())
      {
      YellowCross yellowCross=new YellowCross(myJ3dFrame);
      yellowCross.solveDownEdges();
      solveDownCorners();
      }
      
    }
  public void solveDownCorners()
   { 
   	 int cubi;
     int place;
     int id;
     int[] places=new int[8];//
     
  if (!plainReady()) //Zu Testzecken herausnehmen
  { 
  	  if(!cornersReady())
  	  { 	   	  
  	  places[0]=myJ3dFrame.cubi0.getPlace();  	  
  	  places[2]=myJ3dFrame.cubi2.getPlace();  	  
  	  places[4]=myJ3dFrame.cubi4.getPlace();  	  
  	  places[6]=myJ3dFrame.cubi6.getPlace(); 	  
  	  System.out.println(places[0]+","+places[2]+","+places[4]+","+places[6]);  	    	  
  	  downCorners(places);  	    	 
  	 rotateDownCorners();
    }     
   }
  } 
  
  public void rotateDownCorners()
  {int[] ids=new int[8];
  	  
  	 ids[0]=myJ3dFrame.cubi0.getId();  	  

  	 {while(ids[0]!=0) {rotate0and2();ids[0]=myJ3dFrame.cubi0.getId();
  	 	                 System.out.println("rotateDownCorners():loop1"); 
  	 	               }
  	  	  }
  	 ids[2]=myJ3dFrame.cubi2.getId(); 
  	 {while(ids[2]!=2) {rotate2and4();ids[2]=myJ3dFrame.cubi2.getId();
  	 	                System.out.println("rotateDownCorners():loop2"); 
  	 	               }
  	  	  }
  	 ids[4]=myJ3dFrame.cubi4.getId();
  	 {while(ids[4]!=4) {rotate4and6();ids[4]=myJ3dFrame.cubi4.getId();
  	 	                System.out.println("rotateDownCorners():loop3");
  	 	               }
  	      }
  	 ids[6]=myJ3dFrame.cubi6.getId();
  	 if(ids[6]!=6) System.out.println("cubi6???????");
  	 
  	    	  
  }
  
  
  public void  cornerPositions()
   { int place0 =myJ3dFrame.cubi0.getPlace();
     int id0=myJ3dFrame.cubi0.getId();
     int place2 =myJ3dFrame.cubi2.getPlace();
     int id2=myJ3dFrame.cubi2.getId();
     int place4 =myJ3dFrame.cubi4.getPlace();
     int id4=myJ3dFrame.cubi4.getId();
     int place6 =myJ3dFrame.cubi6.getPlace();
     int id6=myJ3dFrame.cubi6.getId(); 
     System.out.println("c0p"+place0+"i"+id0+" c2p"+place2+"i"+id2+" c4p"+place4+"i"+id4+" c6p"+place6+"i"+id6);
   }
  
  public void downCorners(int[] places)
  { System.out.println("Anfang: downCorners");
    switch(places[0])//0,0,0,6
    {
     case 0: 
    		{ 
    		   switch(places[2])//2,4,6
    	       { 
    		    case 2:{
    		    		 switch(places[4])//4,6
    		                {
    		                 case 4:{ 
    		                 		  if (places[6]==6){System.out.println("0,2,4,6");//funktoniert 
    		                 		  	  				cornerPositions();
                                                        System.out.println("0,2,4,6 fertig");} 
    		                        ;}
    		                        break;
    		                 case 6:{ 
    		                 		  if(places[6]==4){ System.out.println("0,2,6,4");//funktioniert
    		                 		  	  				cornerPositions();//?0,2,6,4 
    		                 		  	  				System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		  	                RotDown.DownAction();
    		                 		  	                cornerPositions();
    		                 		  	                System.out.println("inv_cycle_0_2_4();");
    		                 		  	                inv_cycle_0_2_4();
    		                 		  	                cornerPositions();
														} 
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           ;}     		  
    		            break;
    		    case 4:{
    		    		switch(places[4])//2,6
    		                {
    		                 case 2:{ 
    		                 		  if (places[6]==6) {System.out.println("0,4,2,6");//funktioniert
    		                 		  	  				 cornerPositions();//?0,4,2,6
    		                 		  	  				 System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		                     RotDown.DownAction();
    		                 		                     cornerPositions();//?0,4,2,6
    		                 		                     System.out.println("inv_cycle_0_2_6();");
    		                 		                     inv_cycle_0_2_6();
    		                 		                     cornerPositions();//?0,4,2,6
    		                 		                     }
                                     
                                      
    		                        }
    		                        break;
    		                 case 6:{ 
    		                 		  if(places[6]==2){ System.out.println("0,4,6,2"); //funktioniert
    		                 		  	  				cornerPositions();
    		                 		  	                System.out.println("inv_cycle_2_4_6();");
                                                        inv_cycle_2_4_6();
													    cornerPositions();
									                   } 
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }    		          
    		           ;}     		  
    		            break;
    		    case 6:{
    		    		switch(places[4])//2,4
    		                {
    		                 case 2:{ 
    		                 		  if (places[6]==4){System.out.println("0,6,2,4"); // funktioniert
    		                 		  	                cornerPositions();
    		                 		  	                System.out.println("cycle_2_4_6();");
														cycle_2_4_6();
														cornerPositions();
									                    } 
    		                        ;}
    		                        break;
    		                 case 4:{ 
    		                 		  if(places[6]==2){ System.out.println("0,6,4,2");// funktioniert
    		                 		  	  				cornerPositions();
    		                 		  	  				System.out.println("cycle_2-4-6();");
    		                 		                    cycle_2_4_6();
    		                 		                    System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		                    RotDown.DownAction();
    		                 		  	  				System.out.println("inv_cycle_0_2_4();");    		                 		  	  				
    		                 		  	  				inv_cycle_0_2_4();
    		                 		  	  				cornerPositions();
														} 
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }   
    		           
    		           ;}     		  
    		            break; 
    		   default:;
    	        } 
    	        break;
    	      }
     case 2: { 
     		  switch(places[2])//0,4,6
    	       { 
    		    case 0:{
    		    		 switch(places[4])//4,6
    		                {
    		                 case 4:{ 
    		                 		  if (places[6]==6){System.out.println("2,0,4,6");//funktioniert
    		                 		  	                cornerPositions();
    		                 		  	                System.out.println("Rotdoun.downAction();"); ////Müssen rückgägig gemacht werde
    		                 		  					Rotdoun.downAction();
    		                 		  					System.out.println("cycle_0_4_6();");
    		                 		  					cycle_2_4_6();
    		                 		  					} 
    		                         }
    		                        break;
    		                 case 6:{ 
    		                 		  if(places[6]==4){System.out.println("2,0,6,4");//funktioniert
    		                 		  	  			   cornerPositions();
    		                 		  	  			   System.out.println("inv_cycle_0_4_6();");
													   inv_cycle_0_4_6();
													   System.out.println("inv_cycle_0_2_6();");
													   inv_cycle_0_2_6();} 
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           ;}     		  
    		            break;
    		    case 4:{
    		    		switch(places[4])//0,6
    		                {
    		                 case 0:{ 
    		                 		  if (places[6]==6){System.out.println("2,4,0,6");//funktioniert
    		                 		  					cornerPositions();
    		                 		  					System.out.println("inv_cycle_0_2_4();");
    		                 		  					inv_cycle_0_2_4();
    		                 		  					cornerPositions();} 
    		                        ;}
    		                        break;
    		                 case 6:{ 
    		                 		  if(places[6]==0){ System.out.println("2,4,6,0");//funktioniert
    		                 		  					cornerPositions();
    		                 		  					System.out.println("Rotdoun.downAction();");
    		                 		  					Rotdoun.downAction();
    		                 		  					cornerPositions();    		                 		  					
    		                 		  }
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }    		          
    		           ;}     		  
    		            break;
    		    case 6:{
    		    		switch(places[4])//0,4
    		                {
    		                 case 0:{ 
    		                 		  if (places[6]==4){ System.out.println("2,6,0,4");//funktioniert
    		                 		  	                 cornerPositions();
    		                 		  	                 System.out.println("Rotdoun.downAction();");
    		                 		  	                 Rotdoun.downAction();
    		                 		  	                 cornerPositions();
    		                 		  	                 System.out.println("inv_cycle_2_4_6();");
    		                 		  	                 inv_cycle_2_4_6();
    		                 		  	                 cornerPositions();
															
														} 
    		                        ;}
    		                        break;
    		                 case 4:{ 
    		                 		  if(places[6]==0){ System.out.println("2,6,4,0");//funktioniert
    		                 		  	  				cornerPositions();
    		                 		  	  				 System.out.println("inv_cycle_0_2_6();");
    		                 		  	  				inv_cycle_0_2_6();
    		                 		  	  				cornerPositions();
    		                 		                   } 
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }   
    		           
    		           ;}     		  
    		            break; 
    		   default:;
    	        } 
    	        break;     
             }
     case 4: {
     		  switch(places[2])//0,4,6
    	       { 
    		    case 0:{
    		    		 switch(places[4])//2,6
    		                {
    		                 case 2:{ 
    		                 		  if (places[6]==6){
    		                 		                     System.out.println("4,0,2,6");//funktioniert
    		                 		                     cornerPositions();    		                 		                    
    		                 		                     System.out.println("cycle_0_2_4();");
    		                 		                     cycle_0_2_4();
    		                 		                     cornerPositions();
    		                 		                    } 
    		                        ;}
    		                        break;
    		                 case 6:{ 
    		                 		  if(places[6]==2){ 
    		                 		  	                System.out.println("4,0,6,2");// funktioniert 
    		                 		  	                cornerPositions();
    		                 		  	                System.out.println("cycle_0_2_4();");
    		                 		  	                cycle_0_2_4();
    		                 		  	                 cornerPositions();
    		                 		  	                System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		  	                RotDown.DownAction();
    		                 		  	                cornerPositions();
    		                 		  	                System.out.println("inv_cycle_0_2_4();");
    		                 		  	                inv_cycle_0_2_4();
    		                 		  	                cornerPositions();
    		                 		  	                
    		                 		  	               }     		                 		  
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           ;}     		  
    		            break;
    		    case 2:{
    		    		switch(places[4])//0,6
    		                {
    		                 case 0:{ 
    		                 		  if (places[6]==6){System.out.println("4,2,0,6");//funktioniert 
    		                 		  	  				cornerPositions();
    		                 		  	  				System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		                    RotDown.DownAction();
    		                 		                    cornerPositions();
    		                 		  	  				System.out.println("inv_cycle_2_4_6();");
    		                 		  					inv_cycle_2_4_6();
    		                 		  					cornerPositions();
    		                 		  					System.out.println("inv_cycle_0_4_6();");
    		                 		  					inv_cycle_0_4_6();
    		                 		  					cornerPositions();    		                 		  
    		                 		                                       } 
    		                        ;}
    		                        break;
    		                 case 6:{ 
    		                 		  if(places[6]==0){System.out.println("4,2,6,0"); // funktioniert
    		                 		  					cornerPositions();
    		                 		  					System.out.println("inv_cycle_0_4_6();");
    		                 		  					inv_cycle_0_4_6();
    		                 		 				    cornerPositions();} 
    		                         }
    		                        break;
    		                 default:;	
    		                 }    		          
    		           ;}     		  
    		            break;
    		    case 6:{
    		    		switch(places[4])//0,2
    		                {
    		                 case 0:{ 
    		                 		  if (places[6]==2){System.out.println("4,6,0,2");//funktioniert
    		                 		  					cornerPositions();
    		                 		  					System.out.println("cycle_0_2_4();");
    		                 		  					cycle_0_2_4();
    		                 		  					cornerPositions();
    		                 		  					System.out.println("cycle_0_4_6();");
    		                 		  					cycle_0_4_6();
    		                 		  					cornerPositions();
    		                 		  					System.out.println("cycle_0_2_4();");
    		                 		  					cycle_0_2_4();
    		                 		  					cornerPositions();
    		                 		                      }
    		                 		  					
    		                 		  					
    		                         }
    		                        break;
    		                 case 2:{ 
    		                 		  if(places[6]==0){System.out.println("4,6,2,0");// funktioniert    		                 		  	              
    		                 		  	                cornerPositions(); 
    		                 		  	                System.out.println("Rotdoun.downAction();");//Müssen rückgägig gemacht werde
    		                 		  					Rotdoun.downAction();
    		                 		  					cornerPositions();
    		                 		  					inv_cycle_0_2_4();
    		                 		  					cornerPositions();
    		                 		  					}      		                 		  	               
																					
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }   
    		           
    		           ;}     		  
    		            break; 
    		   default:;
    	        } 
    	        break;
              }
     case 6: {
     		  switch(places[2])//0,2,4
    	       { 
    		    case 0:{
    		    		 switch(places[4])//2,4
    		                {
    		                 case 2:{ 
    		                 		 if (places[6]==4){
    		                 		 	               System.out.println("6,0,2,4");//funktioniert 
    		                 		                   cornerPositions();
    		                 		                   System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		                   RotDown.DownAction();
    		                 		                   cornerPositions();
    		                 		                   } 
    		                        ;}
    		                        break;
    		                 case 4:{ 
    		                 		  if(places[6]==2){System.out.println("6,0,4,2");//funktioniert
    		                 		  	                cornerPositions();
    		                 		  	                System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		                    RotDown.DownAction();
    		                 		                    System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		                    RotDown.DownAction();
    		                 		                    System.out.println("inv_cycle_0_2_4();");
    		                 		                    inv_cycle_0_2_4();
    		                 		                    cornerPositions();
    		                 		  					} 
    		                          }
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           ;}     		  
    		            break;
    		    case 2:{
    		    		switch(places[4])//0,4
    		                {
    		                 case 0:{ 
    		                 		  if (places[6]==4){System.out.println("6,2,0,4");//funktioniert
    		                 		  					cornerPositions();    		                 		  					
    		                 		  					System.out.println("cycle_0_4_6();");
    		                 		  					cycle_0_4_6();
    		                 		  					cornerPositions(); 
    		                 		  					} 
    		                        }
    		                        break;
    		                 case 4:{ 
    		                 		  if(places[6]==0){System.out.println("6,2,4,0");//funktioniert
    		                 		  					cornerPositions();
    		                 		  					System.out.println("cycle_0_4_6();");
    		                 		  					cycle_0_4_6(); 
    		                 		  					System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		  					RotDown.DownAction();
    		                 		  					cornerPositions();    		                 		  					
    		                 		  					System.out.println("inv_cycle_0_2_4();");
    		                 		  					inv_cycle_0_2_4(); 
    		                 		                 } 
    		                        ;}
    		                        break;
    		                 default:;	
    		                 }    		          
    		           ;}     		  
    		            break;
    		    case 4:{
    		    		switch(places[4])//0,2
    		                {
    		                 case 0:{ 
    		                 		  if (places[6]==2){System.out.println("6,4,0,2");// funktioniert 
    		                 		  					cornerPositions();
    		                 		  					System.out.println("RotDown.DownAction();");//Müssen rückgägig gemacht werde
    		                 		  					RotDown.DownAction();
    		                 		  					System.out.println("cycle_2_4_6();");
    		                 		  					cycle_2_4_6();} 
    		                 		  
    		                        }
    		                        break;
    		                 case 2:{ 
    		                 		  if(places[6]==0){System.out.println("6,4,2,0"); //funktioniert
    		                 		  					cornerPositions();
    		                 		  					System.out.println("inv_cycle_2_4_6();");
    		                 		  					inv_cycle_2_4_6();
    		                 		  					cornerPositions();
    		                 		  					System.out.println("inv_cycle_0_4_6();");
    		                 		  					inv_cycle_0_4_6();
    		                 		  					cornerPositions();    		                 		  					
    		                 		  					} 
    		                 		  
    		                         }
    		                        break;
    		                 default:;	
    		                 }   
    		           
    		           ;}     		  
    		            break; 
    		   default:;
    	        } 
    	        break;
              }
     default:;    		
   }
  	System.out.println("Ende: downCorners");  
  }	 
  
   public boolean plainReady()
    {boolean value=false;
     int place0 =myJ3dFrame.cubi0.getPlace();
     int id0=myJ3dFrame.cubi0.getId();
     int place2 =myJ3dFrame.cubi2.getPlace();
     int id2=myJ3dFrame.cubi2.getId();
     int place4 =myJ3dFrame.cubi4.getPlace();
     int id4=myJ3dFrame.cubi4.getId();
     int place6 =myJ3dFrame.cubi6.getPlace();
     int id6=myJ3dFrame.cubi6.getId();
    	
     int place1 =myJ3dFrame.cubi1.getPlace();
     int id1=myJ3dFrame.cubi1.getId();
     int place3 =myJ3dFrame.cubi3.getPlace();
     int id3=myJ3dFrame.cubi3.getId();
     int place5 =myJ3dFrame.cubi5.getPlace();
     int id5=myJ3dFrame.cubi5.getId();
     int place7 =myJ3dFrame.cubi7.getPlace();
     int id7=myJ3dFrame.cubi7.getId();
              
     value= (place0==0&&id0==0) &&
            (place2==2&&id2==2) &&
            (place4==4&&id4==4) &&
            (place6==6&&id6==6) && // place6==14???
            (place1==1&&id1==1) &&
            (place3==3&&id3==3) &&
            (place5==5&&id5==5) &&
            (place7==7&&id7==7) ;
         System.out.println("plainReady()="+value);
         return value;
    }
      
    
 public boolean cornersReady()
    {int place0 =myJ3dFrame.cubi0.getPlace();
     int id0=myJ3dFrame.cubi0.getId();
     int place2 =myJ3dFrame.cubi2.getPlace();
     int id2=myJ3dFrame.cubi2.getId();
     int place4 =myJ3dFrame.cubi4.getPlace();
     int id4=myJ3dFrame.cubi4.getId();
     int place6 =myJ3dFrame.cubi6.getPlace();
     int id6=myJ3dFrame.cubi6.getId(); 
     boolean value=false;
   value=	(place0==0&&id0==0) &&
            (place2==2&&id2==2) &&
            (place4==4&&id4==4) &&
            (place6==6&&id6==6) ;         	
        	return value;
    }
    
 public boolean cornersInPlace()
    {int place0 =myJ3dFrame.cubi0.getPlace();    
     int place2 =myJ3dFrame.cubi2.getPlace();    
     int place4 =myJ3dFrame.cubi4.getPlace();   
     int place6 =myJ3dFrame.cubi6.getPlace();
    boolean value=false;         
    value = (place0==0) &&
            (place2==2) &&
            (place4==4) &&
            (place6==6) ; 
     System.out.println("cornersInPLace()="+value);
     return value;
    }
   
   public boolean corner0InPlace()
    {int place0 =myJ3dFrame.cubi0.getPlace();      
    return 	(place0==0) ;         	
    }
    
    public boolean corner2InPlace()
    {
     int place2 =myJ3dFrame.cubi2.getPlace();    
    return 	(place2==2);                     	
    }
    
    public boolean corner4InPlace()
    {
     int place4 =myJ3dFrame.cubi4.getPlace();
     return  (place4==4);	                  	
    }
    
    public boolean corner6InPlace()
    {
    int place6 =myJ3dFrame.cubi6.getPlace();            
    return 	(place6==6) ;                     	
    }
 public void rotate0and2()
 {//RurfuFDfUFRUrd
 	 RotRight.RightAction();
 	 Rotupp.upAction();
 	 Rotrigt.rightAction();
 	 Rotfrontt.frontAction();
 	 Rotupp.upAction();
 	 RotFront.FrontAction();
 	 RotDown.DownAction();
 	 Rotfrontt.frontAction();
 	 RotUp.UpAction();
 	 RotFront.FrontAction();
 	 RotRight.RightAction();
 	 RotUp.UpAction();
 	 Rotrigt.rightAction();
 	 Rotdoun.downAction();
 }
 
 public void rotate2and4()
 {//BubruRDrURBUbd
   RotBack.BackAction();
   Rotupp.upAction();
   Rotbakk.backAction();
   Rotrigt.rightAction();
   Rotupp.upAction();
   RotRight.RightAction();
   RotDown.DownAction();
   Rotrigt.rightAction();
   RotUp.UpAction();
   RotRight.RightAction();
   RotBack.BackAction();
   RotUp.UpAction();
   Rotbakk.backAction();
   Rotdoun.downAction();
 
 }
 
 public void rotate4and6()
 {//LulbuBDbUBLUld
 	 RotLeft.LeftAction();
 	 Rotupp.upAction();
 	 Rotlefft.leftAction();
 	 Rotbakk.backAction();
 	 Rotupp.upAction();
 	 RotBack.BackAction();
 	 RotDown.DownAction();
 	 Rotbakk.backAction();
 	 RotUp.UpAction();
 	 RotBack.BackAction();
 	 RotLeft.LeftAction();
 	 RotUp.UpAction();
 	 Rotlefft.leftAction();
 	 Rotdoun.downAction(); 
 }
 
 public void rotate6and0()
 {//BubruRDrURBUbd
 	  RotBack.BackAction();
 	  Rotupp.upAction();
 	  Rotbakk.backAction();
 	  Rotrigt.rightAction();
 	  Rotupp.upAction();
 	  RotRight.RightAction();
 	  RotDown.DownAction();
 	  Rotrigt.rightAction();
 	  RotUp.UpAction();
 	  RotRight.RightAction();
 	  RotBack.BackAction();
 	  RotUp.UpAction();
 	  Rotbakk.backAction();
 	  Rotdoun.downAction();
 }

 public void cycle_0_2_4()
 {// fDBdFDbd
 	Rotfrontt.frontAction();
 	RotDown.DownAction();
 	RotBack.BackAction();
 	Rotdoun.downAction();
 	RotFront.FrontAction();
 	RotDown.DownAction();
 	Rotbakk.backAction();
 	Rotdoun.downAction();
 }
 public void inv_cycle_0_2_4() 
 {// DBdfDbdF
 	RotDown.DownAction(); 
 	RotBack.BackAction(); 
 	Rotdoun.downAction(); 
 	Rotfrontt.frontAction(); 
 	RotDown.DownAction(); 
 	Rotbakk.backAction(); 
 	Rotdoun.downAction(); 
 	RotFront.FrontAction(); 
 }
 public void cycle_0_2_6()
 {//lDRdLDrd
 	 Rotlefft.leftAction();
 	 RotDown.DownAction();
 	 RotRight.RightAction();
 	 Rotdoun.downAction();
 	 RotLeft.LeftAction();
 	 RotDown.DownAction();
 	 Rotrigt.rightAction();
 	 Rotdoun.downAction();
 }
 public void inv_cycle_0_2_6() 
 {//DRdlDrdL
 	 RotDown.DownAction();
 	 RotRight.RightAction();
 	 Rotdoun.downAction();
 	 Rotlefft.leftAction();
 	 RotDown.DownAction();
 	 Rotrigt.rightAction();
 	 Rotdoun.downAction();
 	 RotLeft.LeftAction();
 }
 public void cycle_0_4_6()
 {//bDFdBDfd
 	 Rotbakk.backAction();
 	 RotDown.DownAction();
 	 RotFront.FrontAction();
 	 Rotdoun.downAction();
 	 RotBack.BackAction();
 	 RotDown.DownAction();
 	 Rotfrontt.frontAction();
 	 Rotdoun.downAction();
 }
 public void inv_cycle_0_4_6()
 {//DFdbDfdB
 	RotDown.DownAction(); 
 	RotFront.FrontAction(); 
 	Rotdoun.downAction(); 
 	Rotbakk.backAction(); 
 	RotDown.DownAction(); 
 	Rotfrontt.frontAction();
 	Rotdoun.downAction();
 	RotBack.BackAction();
 }
 public void cycle_2_4_6()
 {//rDLdRDld
 	  Rotrigt.rightAction();
 	  RotDown.DownAction();
 	  RotLeft.LeftAction();
 	  Rotdoun.downAction();
 	  RotRight.RightAction();
 	  RotDown.DownAction();
 	  Rotlefft.leftAction();
 	  Rotdoun.downAction();
 }
 public void inv_cycle_2_4_6()
 {//DLdrDldR
 	 RotDown.DownAction(); 
 	 RotLeft.LeftAction();
 	 Rotdoun.downAction();
 	 Rotrigt.rightAction();
 	 RotDown.DownAction();
 	 Rotlefft.leftAction();
 	 Rotdoun.downAction();
 	 RotRight.RightAction();
 	 
 }
    
}
