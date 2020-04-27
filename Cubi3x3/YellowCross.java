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
 * Write a description of class DownPlain here.
 *
 * @author (your name)
 * @version (Helmut Pithan h.pithan(at)t-online.de)
 */
public class YellowCross
{int[] places=new int[8];//
 J3dFrame myJ3dFrame=null;
 int firstEdge=-1;
     /**
     * Constructor for objects of class DownPlain
     */
   public YellowCross(J3dFrame myJ3dFrame)
    {this.myJ3dFrame=myJ3dFrame;
     System.out.println("\r\nYellowCross\r\n");
     solveDownEdges();    
    } 
        
     public YellowCross(J3dFrame myJ3dFrame,String s)
    {this.myJ3dFrame=myJ3dFrame;
     System.out.println("YellowCross:Test");
     System.out.println("yellowCrossReady()="+yellowCrossReady());
     edgePositions();  
    }  
   public void solveDownEdges()
   { 
   	 int cubi;
     int place;
     int id;
    // int[] places=new int[8];//
    places=getPlaces();
     
  if (!plainReady()) //Zu Testzecken herausnehmen
  { 
  	  while(!edgesReady())// Testzwecken herausnehmen
  	  { 	   	    	   
  	   places=getPlaces();
  	   downCross(places);
  	   places=getPlaces();//Test
 	   //showPlaces(places);//Test
  	   downEdgesFlips();  //zu TestZwecken herausgenommen  	   	 
    }    
   }
  }
  public void downEdgesFlips()
  {int[] ids=new int[8];
  	  
  	  ids[1]=myJ3dFrame.cubi1.getId();  	  
  	  ids[3]=myJ3dFrame.cubi3.getId(); 	  
  	  ids[5]=myJ3dFrame.cubi5.getId();  	  
  	  ids[7]=myJ3dFrame.cubi7.getId(); 
 	  
  	  if(ids[1]!=1){flip1and3();}
  	  
  	  ids[1]=myJ3dFrame.cubi1.getId();  	  
  	  ids[3]=myJ3dFrame.cubi3.getId();  	  
  	  ids[5]=myJ3dFrame.cubi5.getId();  	 
  	  ids[7]=myJ3dFrame.cubi7.getId();
  	  
  	  if(ids[3]!=3){flip3and5();}
  	  
  	  ids[1]=myJ3dFrame.cubi1.getId();  	  
  	  ids[3]=myJ3dFrame.cubi3.getId();  	  
  	  ids[5]=myJ3dFrame.cubi5.getId();  	 
  	  ids[7]=myJ3dFrame.cubi7.getId();
  	  
  	   if(ids[5]!=5){flip5and7();}
  	    	  
  }
  
  public void  edgePositions()
   { int place1 =myJ3dFrame.cubi1.getPlace();
     int id1=myJ3dFrame.cubi1.getId();
     int place3 =myJ3dFrame.cubi3.getPlace();
     int id3=myJ3dFrame.cubi3.getId();
     int place5 =myJ3dFrame.cubi5.getPlace();
     int id5=myJ3dFrame.cubi5.getId();
     int place7 =myJ3dFrame.cubi7.getPlace();
     int id7=myJ3dFrame.cubi7.getId(); 
     System.out.println("c1p"+place1+"i"+id1+" c3p"+place3+"i"+id3+" c5p"+place5+"i"+id5+" c7p"+place7+"i"+id7);
   }
  
 
 //Alle DownCross Positionen testen und mit * markieren 
  public void downCross(int[] places)
  { //showPlaces(places);//zum Testen
    switch(places[1])//1,3,5,7
    {
     case 1: 
    		{ 
    		   switch(places[3])//3,5,7
    	       { 
    		    case 3:{
    		    		 switch(places[5])//5,7
    		                {
    		                 case 5:{ 
    		                 		  if (places[7]==7){
                                                        System.out.println("1,3,5,7 fertig");
                                                        edgePositions();
                                                          } 
    		                        }
    		                        break;
    		                 case 7:{ 
    		                 		  if(places[7]==5){ 
    		                 		  	  				System.out.println("->1,3,7,5");//funktioniert
    		                 		  	  				edgePositions();//?1,3,7,5    		                 		  	  				
    		                 		  	                RotDown.DownAction();
    		                 		  	                edgePositions();
    		                 		  	                inv_cycle_1_3_5();
    		                 		  	                edgePositions();
    		                 		  	                System.out.println("1,3,7,5->");
														} 
    		                        }
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           ;}     		  
    		            break;
    		    case 5:{
    		    		switch(places[5])//3,7
    		                {
    		                 case 3:{ 
    		                 		  if (places[7]==7) {
    		                 		  	  				 System.out.println("->1,5,3,7");//funktioniert
    		                 		  	  				 edgePositions();//?1,5,3,7
    		                 		                     RotDown.DownAction();
    		                 		                     inv_cycle_1_3_7();
    		                 		                     edgePositions();//?1,5,3,7
    		                 		                     System.out.println("1,5,3,7->");
    		                 		                     }
                                     
                                      
    		                        }
    		                        break;
    		                 case 7:{ 
    		                 		  if(places[7]==3){ 
    		                 		  	                System.out.println("->1,5,7,3");//funktioniert
    		                 		  	  				edgePositions(); 
    		                 		  	                flip3and5();
                                                        inv_cycle_3_5_7();
													    edgePositions();
									                   System.out.println("1,5,7,3->");
									                   }
    		                        }
    		                        break;
    		                 default:;	
    		                 }    		          
    		           ;}     		  
    		            break;
    		    case 7:{
    		    		switch(places[5])//3,5
    		                {
    		                 case 3:{ 
    		                 		  if (places[7]==5){ 
    		                 		  	                System.out.println("->1,7,3,5");//funktioniert
    		                 		  	                edgePositions();
														cycle_3_5_7();
														 edgePositions();//?1,5,3,7
														System.out.println("1,7,3,5->");
									  							} 
    		                        }
    		                        break;
    		                 case 5:{ 
    		                 		  if(places[7]==3){ 
    		                 		  	                System.out.println("->1,7,5,3");//funktioniert
    		                 		  	  				edgePositions();
    		                 		  	  				inv_cycle_3_5_7();
    		                 		  	  				edgePositions();//?1,5,3,7
    		                 		  	  				System.out.println("1,7,5,3->");
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
     case 3: { 
     		  switch(places[3])//1,5,7
    	       { 
    		    case 1:{
    		    		 switch(places[5])//5,7
    		                {
    		                 case 5:{ 
    		                 		  if (places[7]==7){
    		                 		  	                System.out.println("3,1,5,7");//funktioniert
    		                 		  					edgePositions();
    		                 		  					Rotdoun.downAction();
    		                 		  					cycle_3_5_7();   		                 		  					
    		                 		  					} 
    		                        }
    		                        break;
    		                 case 7:{ 
    		                 		  if(places[7]==5){ 
    		                 		  	                System.out.println("3,1,7,5");//funktioniert
    		                 		  	  				edgePositions();
													   inv_cycle_1_3_5();
													   inv_cycle_3_5_7();
									                   } 
    		                         }
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           }     		  
    		            break;
    		    case 5:{
    		    		switch(places[5])//1,7
    		                {
    		                 case 1:{ 
    		                 		  if (places[7]==7){
    		                 		  	                System.out.println("3,5,1,7");//funktioniert
    		                 		  					edgePositions();
    		                 		  					inv_cycle_1_3_5();
    		                 		                    } 
    		                         }
    		                        break;
    		                 case 7:{ 
    		                 		  if(places[7]==1){
    		                 		  	                 System.out.println("3,5,7,1");//funktioniert
    		                 		  					edgePositions();
    		                 		  					Rotdoun.downAction();    		                 		  					    		                 		  					
    		                 		                  }
    		                         }
    		                        break;
    		                 default:;	
    		                 }    		          
    		           ;}     		  
    		            break;
    		    case 7:{
    		    		switch(places[5])//1,5
    		                {
    		                 case 1:{ 
    		                 		  if (places[7]==5){ 
    		                 		  	                 System.out.println("3,7,1,5");//funktioniert
    		                 		  	  				 edgePositions();
    		                 		  	  				 Rotdoun.downAction();
    		                 		  	  				 inv_cycle_3_5_7();
														} 
    		                        }
    		                        break;
    		                 case 5:{ 
    		                 		  if(places[7]==1){ 
    		                 		  	                System.out.println("3,7,5,1");//funktioniert
    		                 		  					edgePositions();
    		                 		  					inv_cycle_1_3_7();
    		                 		  					
    		                 		  } 
    		                        }
    		                        break;
    		                 default:;	
    		                 }   
    		           
    		           }     		  
    		            break; 
    		   default:;
    	        } 
    	        break;     
             }
     case 5: {
     		  switch(places[3])//1,5,7
    	       { 
    		    case 1:{
    		    		 switch(places[5])//3,7
    		                {
    		                 case 3:{ 
    		                 		  if (places[7]==7){
    		                 		  	                System.out.println("5,1,3,7");//funktioniert
    		                 		  					edgePositions();
    		                 		  					cycle_1_3_5();    		                 		  					
    		                 		  					} 
    		                        }
    		                        break;
    		                 case 7:{ 
    		                 		  if(places[7]==3){
    		                 		  	               System.out.println("5,1,7,3");//funktioniert
    		                 		  	               edgePositions();
    		                 		  	              Rotdoun.downAction();
    		                 		  	              inv_cycle_1_3_7();
    		                 		  	             }     		                 		  
    		                         }
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           ;}     		  
    		            break;
    		    case 3:{
    		    		switch(places[5])//1,7
    		                {
    		                 case 1:{ 
    		                 		  if (places[7]==7){
    		                 		  	                System.out.println("5,3,1,7");//funktioniert
    		                 		  	                edgePositions();
    		                 		  	                System.out.println("RotDown.DownAction();");
    		                 		                    RotDown.DownAction();
    		                 		  	                edgePositions();
    		                 		  	                System.out.println("inv_cycle_3_5_7();");
    		                 		  					inv_cycle_3_5_7();
    		                 		  	                edgePositions();
    		                 		  	                System.out.println("inv_cycle_1_5_7();");
    		                 		  					inv_cycle_1_5_7();
    		                 		  					 edgePositions();       		                 		  	
    		                 		                     } 
    		                        }
    		                        break;
    		                 case 7:{ 
    		                 		  if(places[7]==1){
    		                 		  	                System.out.println("5,3,7,1");//funktioniert
    		                 		  					edgePositions();
    		                 		  					inv_cycle_1_5_7();} 
    		                         }
    		                        break;
    		                 default:;	
    		                 }    		          
    		           ;}     		  
    		            break;
    		    case 7:{
    		    		switch(places[5])//1,3
    		                {
    		                 case 1:{ 
    		                 		  if (places[7]==3){
    		                 		  	                System.out.println("5,7,1,3");//funktioniert
    		                 		  					edgePositions();
    		                 		  					Rotdoun.downAction();
    		                 		  					Rotdoun.downAction();//Vielleicht reicht das    		                 		  				
    		                 		                    } 
    		                         }
    		                        break;
    		                 case 3:{ 
    		                 		  if(places[7]==1){
    		                 		  	               System.out.println("5,7,3,1");//funktioniert
    		                 		  	  			   edgePositions(); 
    		                 		  	  			   Rotdoun.downAction();
    		                 		  	  			   inv_cycle_1_3_5();
																		 } 
    		                         }
    		                        break;
    		                 default:;	
    		                 }   
    		           
    		           }     		  
    		            break; 
    		   default:;
    	        } 
    	        break;
              }
     case 7: {
     		  switch(places[3])//1,3,5
    	       { 
    		    case 1:{
    		    		 switch(places[5])//3,5
    		                {
    		                 case 3:{ 
    		                 		  if (places[7]==5){
    		                 		  	                System.out.println("7,1,3,5");//funktioniert
    		                 		  					edgePositions();
    		                 		  					RotDown.DownAction();
    		                 		                    } 
    		                        }
    		                        break;
    		                 case 5:{ 
    		                 		  if(places[7]==3){
    		                 		  	                System.out.println("7,1,5,3");//funktionoert
    		                 		  					edgePositions();
    		                 		  					 cycle_1_3_7();    		                 		  					 
    		                 		  					} 
    		                        }
    		                        break;
    		                 default:;	
    		                 }    		                  		    
    		           }     		  
    		            break;
    		    case 3:{
    		    		switch(places[5])//1,5
    		                {
    		                 case 1:{ 
    		                 		  if (places[7]==5){
    		                 		  	                System.out.println("7,3,1,5");//funktioniert
    		                 		  					edgePositions();
    		                 		  					 cycle_1_5_7();    		                 		  					
    		                 		                   } 
    		                         }
    		                        break;
    		                 case 5:{ 
    		                 		  if(places[7]==1){
    		                 		  	                System.out.println("7,3,5,1");//funktioniert
    		                 		  					edgePositions();
    		                 		  					System.out.println("cycle_1_5_7();");
    		                 		  					cycle_1_5_7();
    		                 		  					edgePositions();
    		                 		  					System.out.println("RotDown.DownAction();");
    		                 		  					RotDown.DownAction();
    		                 		  					edgePositions();
    		                 		  					System.out.println("inv_cycle_1_3_5();");
    		                 		  					inv_cycle_1_3_5(); 
    		                 		  					
    		                 		  					
    		                 		                     } 
    		                        }
    		                        break;
    		                 default:;	
    		                 }    		          
    		           }     		  
    		            break;
    		    case 5:{
    		    		switch(places[5])//1,3
    		                {
    		                 case 1:{ 
    		                 		  if (places[7]==3){
    		                 		  	                System.out.println("7,5,1,3");//funktioniert
    		                 		  					edgePositions();
    		                 		  					Rotdoun.downAction();
    		                 		  					inv_cycle_1_5_7();
    		                 		                   }     		                 		  
    		                        }
    		                        break;
    		                 case 3:{ 
    		                 		  if(places[7]==1){
    		                 		  	                System.out.println("7,5,3,1");//funktioniert
    		                 		  					edgePositions();
    		                 		  					inv_cycle_3_5_7();
    		                 		  					inv_cycle_1_5_7();
    		                 		                  } 
    		                 		  
    		                        }
    		                        break;
    		                 default:;	
    		                 }   
    		           
    		           }     		  
    		            break; 
    		   default:;
    	        } 
    	        break;
              }
     default:;    		
   }
  	  
  }	  
 /* 	  	  
  public void showPlaces(int[] places)
  { 
  	System.out.println(places[1]+","+places[3]+","+places[5]+","+places[7]); 
  }
  */
   public boolean plainReady()
    {
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
     
              
    return 	(place0==0&&id0==0) &&
       (place2==2&&id2==2) &&
       (place4==4&&id4==4) &&
       (place6==14&&id6==6) &&
       (place1==1&&id1==1) &&
       (place3==3&&id3==3) &&
       (place5==5&&id5==5) &&
       (place7==7&&id7==7) ;         	
    }
  public  int[] getPlaces()
  {int[] p=new int[8];
  	  p[1]=myJ3dFrame.cubi1.getPlace();
  	  p[3]=myJ3dFrame.cubi3.getPlace();
  	  p[5]=myJ3dFrame.cubi5.getPlace();
  	  p[7]=myJ3dFrame.cubi7.getPlace();
      return p;
   }
  
 public boolean edgesReady()
    {        	
     int place1 =myJ3dFrame.cubi1.getPlace();
     int id1=myJ3dFrame.cubi1.getId();
     int place3 =myJ3dFrame.cubi3.getPlace();
     int id3=myJ3dFrame.cubi3.getId();
     int place5 =myJ3dFrame.cubi5.getPlace();
     int id5=myJ3dFrame.cubi5.getId();
     int place7 =myJ3dFrame.cubi7.getPlace();
     int id7=myJ3dFrame.cubi7.getId();         
    return 	
       (place1==1&&id1==1) &&
       (place3==3&&id3==3) &&
       (place5==5&&id5==5) &&
       (place7==7&&id7==7) ;
          	
    }
    
  public boolean yellowCrossReady()
    {boolean value=false;
     int place1 =myJ3dFrame.cubi1.getPlace();
     int id1=myJ3dFrame.cubi1.getId();
     int place3 =myJ3dFrame.cubi3.getPlace();
     int id3=myJ3dFrame.cubi3.getId();
     int place5 =myJ3dFrame.cubi5.getPlace();
     int id5=myJ3dFrame.cubi5.getId();
     int place7 =myJ3dFrame.cubi7.getPlace();
     int id7=myJ3dFrame.cubi7.getId();       
   	
    value=  (place1==1&&id1==1) &&
       		(place3==3&&id3==3) &&
       		(place5==5&&id5==5) &&
       		(place7==7&&id7==7) ;
          return value;
    }
    
  public void flip1and3()
  { //"FLBRDrDblfrdRd"
  	   RotFront.FrontAction();
  	   RotLeft.LeftAction();
  	   RotBack.BackAction();
  	   RotRight.RightAction();
  	   RotDown.DownAction();
  	   Rotrigt.rightAction();
  	   RotDown.DownAction();
  	   Rotbakk.backAction();
  	   Rotlefft.leftAction();
  	   Rotfrontt.frontAction();
  	   Rotrigt.rightAction();
  	   Rotdoun.downAction();
  	   RotRight.RightAction();
  	   Rotdoun.downAction(); 	
  }
  
  public void flip3and5()
  { //"RFLBDbDlfrbdBd"
  	  RotRight.RightAction();
  	  RotFront.FrontAction();
  	  RotLeft.LeftAction();
  	  RotBack.BackAction();
  	  RotDown.DownAction();
  	  Rotbakk.backAction();
  	  RotDown.DownAction();
  	  Rotlefft.leftAction();
  	  Rotfrontt.frontAction();
  	  Rotrigt.rightAction();
  	  Rotbakk.backAction();
  	  Rotdoun.downAction();
  	  RotBack.BackAction();
  	  Rotdoun.downAction();
  }
  
  public void flip5and7()
  { //"BRFLDlDfrbldLd"
       RotBack.BackAction();
       RotRight.RightAction();
       RotFront.FrontAction();
       RotLeft.LeftAction();
       RotDown.DownAction();
       Rotlefft.leftAction();
       RotDown.DownAction();
       Rotfrontt.frontAction();
       Rotrigt.rightAction();
       Rotbakk.backAction();
       Rotlefft.leftAction();
       Rotdoun.downAction();
       RotLeft.LeftAction();
       Rotdoun.downAction();
  }
  
  public void cycle_1_3_5()
  {//"RDDrblfDDFLB"
  	  RotRight.RightAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  Rotrigt.rightAction();
  	  Rotbakk.backAction();
  	  Rotlefft.leftAction();
  	  Rotfrontt.frontAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  RotFront.FrontAction();
      RotLeft.LeftAction();
      RotBack.BackAction();
  }
  
  public void inv_cycle_1_3_5()
  {//"RDDrblfDDFLB"->"blfddFLBRddr "
  	  Rotbakk.backAction();
  	  Rotlefft.leftAction();
  	  Rotfrontt.frontAction();
  	  Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  RotFront.FrontAction();
      RotLeft.LeftAction();
      RotBack.BackAction();
      RotRight.RightAction();
      Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  Rotrigt.rightAction();
  }
  
  
  
  public void cycle_1_3_7()
  {//"FDDfrblDDLBR"  	  
  	  RotFront.FrontAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  Rotfrontt.frontAction();
  	  Rotrigt.rightAction();
  	  Rotbakk.backAction();
  	  Rotlefft.leftAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  RotLeft.LeftAction();
          RotBack.BackAction();
          RotRight.RightAction();  	  
  }
  
  public void inv_cycle_1_3_7()
  {//"FDDfrblDDLBR"->"rblddLBRFddf"
  	  Rotrigt.rightAction();
  	  Rotbakk.backAction();
  	  Rotlefft.leftAction();
  	  Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  RotLeft.LeftAction();
  	  RotBack.BackAction();
          RotRight.RightAction();
          RotFront.FrontAction();
          Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  Rotfrontt.frontAction();  
  }
  
  public void cycle_1_5_7()
  {//"LDDlfrbDDBRF"
  	  RotLeft.LeftAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  Rotlefft.leftAction();
  	  Rotfrontt.frontAction();
  	  Rotrigt.rightAction();
  	  Rotbakk.backAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  RotBack.BackAction();
      RotRight.RightAction();
      RotFront.FrontAction();
  }
  	  
      public void inv_cycle_1_5_7()
  {//"LDDlfrbDDBRF"->"frbddBRFLddl"
  	  Rotfrontt.frontAction();
  	  Rotrigt.rightAction();
  	  Rotbakk.backAction();
  	  Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  RotBack.BackAction();
          RotRight.RightAction();
          RotFront.FrontAction();
          RotLeft.LeftAction();
          Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  Rotlefft.leftAction();
  }
  
  public void cycle_3_5_7()
  {//"BDDblfrDDRFL"
  	  RotBack.BackAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  Rotbakk.backAction();
  	  Rotlefft.leftAction();
  	  Rotfrontt.frontAction();
  	  Rotrigt.rightAction();
  	  RotDown.DownAction();
  	  RotDown.DownAction();
  	  RotRight.RightAction();
          RotFront.FrontAction();
          RotLeft.LeftAction();  	  
  }
  public void inv_cycle_3_5_7()
  {//"BDDblfrDDRFL" "inv"-> "lfrddRFLBddb"
  	  Rotlefft.leftAction();
  	  Rotfrontt.frontAction();
  	  Rotrigt.rightAction();
  	  Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  RotRight.RightAction();
          RotFront.FrontAction();
          RotLeft.LeftAction();
          RotBack.BackAction();
          Rotdoun.downAction();
  	  Rotdoun.downAction();
  	  Rotbakk.backAction();  
  }
      
}

