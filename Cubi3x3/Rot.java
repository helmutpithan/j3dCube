import java.util.*;
/**
 * Write a description of class Rot here.
 *
 * @author (Helmut Pithan h.pithan(at)t-online.de)
 * @version (a version number or a date)
 */
abstract class Rot 
{static Set<Integer> set=new HashSet<Integer>();
	static public boolean finish()
          { boolean f= J3dFrame.Ualpha.finished() 
                                     & J3dFrame.ualpha.finished()
                                     & J3dFrame.Lalpha.finished()
                                     & J3dFrame.lalpha.finished()
                                     & J3dFrame.Ralpha.finished()
                                     & J3dFrame.ralpha.finished()
                                     & J3dFrame.Falpha.finished()
                                     & J3dFrame.falpha.finished()
                                     & J3dFrame.Balpha.finished()
                                     & J3dFrame.balpha.finished()
                                     & J3dFrame.Dalpha.finished()
                                     & J3dFrame.dalpha.finished();
               return f;
             } 
    
 static  public  int[] fillPlaceArray()
       { 
           int[] placeArray=new int[26];
                    placeArray[0]=J3dFrame.cubi0.getPlace(); //im place steht,an welchem Platz sich das Cubi mit der Nummer befindet.   
                    placeArray[1]=J3dFrame.cubi1.getPlace();
                    placeArray[2]=J3dFrame.cubi2.getPlace();
                    placeArray[3]=J3dFrame.cubi3.getPlace();
                    placeArray[4]=J3dFrame.cubi4.getPlace();
                    placeArray[5]=J3dFrame.cubi5.getPlace();
                    placeArray[6]=J3dFrame.cubi6.getPlace();
                    placeArray[7]=J3dFrame.cubi7.getPlace();
                    placeArray[8]=J3dFrame.cubi8.getPlace();
                    placeArray[9]=J3dFrame.cubi9.getPlace();
                    placeArray[10]=J3dFrame.cubi10.getPlace();
                    placeArray[11]=J3dFrame.cubi11.getPlace();
                    placeArray[12]=J3dFrame.cubi12.getPlace();
                    placeArray[13]=J3dFrame.cubi13.getPlace();
                    placeArray[14]=J3dFrame.cubi14.getPlace();
                    placeArray[15]=J3dFrame.cubi15.getPlace();
                    placeArray[16]=J3dFrame.cubi16.getPlace();
                    placeArray[17]=J3dFrame.cubi17.getPlace();
                    placeArray[18]=J3dFrame.cubi18.getPlace();
                    placeArray[19]=J3dFrame.cubi19.getPlace();
                    placeArray[20]=J3dFrame.cubi20.getPlace();
                    placeArray[21]=J3dFrame.cubi21.getPlace();
                    placeArray[22]=J3dFrame.cubi22.getPlace();
                    placeArray[23]=J3dFrame.cubi23.getPlace();
                    placeArray[24]=J3dFrame.cubi24.getPlace();
                    placeArray[25]=J3dFrame.cubi25.getPlace();
                    return placeArray;
        }
     static public  int[] fillNrArray(int[] placeArray)
       { int[] nrArray=new int[26];
           for (int i=0;i<26;i++)    
           nrArray[placeArray[i]]=i;
           return nrArray;          
        }
       
      static public void zustandsAusgabe(int[] nrArray,int[] placeArray,Set<Integer> set)
      { int id=-1;
      	int place=-1;
      	String[] stringArray= new String[26];
          for (int i=0;i<26;i++)
          {     switch(nrArray[i])
                        { case 0: id=J3dFrame.cubi0.getId();place=J3dFrame.cubi0.getPlace();break;
                          case 1: id=J3dFrame.cubi1.getId();place=J3dFrame.cubi1.getPlace();break;
                          case 2: id=J3dFrame.cubi2.getId();place=J3dFrame.cubi2.getPlace();break;
                          case 3: id=J3dFrame.cubi3.getId();place=J3dFrame.cubi3.getPlace();break;
                          case 4: id=J3dFrame.cubi4.getId();place=J3dFrame.cubi4.getPlace();break;
                          case 5: id=J3dFrame.cubi5.getId();place=J3dFrame.cubi5.getPlace();break;
                          case 6: id=J3dFrame.cubi6.getId();place=J3dFrame.cubi6.getPlace();break;
                          case 7: id=J3dFrame.cubi7.getId();place=J3dFrame.cubi7.getPlace();break;
                          case 8: id=J3dFrame.cubi8.getId();place=J3dFrame.cubi8.getPlace();break;
                          case 9: id=J3dFrame.cubi9.getId();place=J3dFrame.cubi9.getPlace();break;
                          case 10: id=J3dFrame.cubi10.getId();place=J3dFrame.cubi10.getPlace();break;
                          case 11: id=J3dFrame.cubi11.getId();place=J3dFrame.cubi11.getPlace();break;
                          case 12: id=J3dFrame.cubi12.getId();place=J3dFrame.cubi12.getPlace();break;
                          case 13: id=J3dFrame.cubi13.getId();place=J3dFrame.cubi13.getPlace();break;
                          case 14: id=J3dFrame.cubi14.getId();place=J3dFrame.cubi14.getPlace();break;
                          case 15: id=J3dFrame.cubi15.getId();place=J3dFrame.cubi15.getPlace();break;
                          case 16: id=J3dFrame.cubi16.getId();place=J3dFrame.cubi16.getPlace();break;
                          case 17: id=J3dFrame.cubi17.getId();place=J3dFrame.cubi17.getPlace();break;
                          case 18: id=J3dFrame.cubi18.getId();place=J3dFrame.cubi18.getPlace();break;
                          case 19: id=J3dFrame.cubi19.getId();place=J3dFrame.cubi19.getPlace();break;
                          case 20: id=J3dFrame.cubi20.getId();place=J3dFrame.cubi20.getPlace();break;
                          case 21: id=J3dFrame.cubi21.getId();place=J3dFrame.cubi21.getPlace();break;
                          case 22: id=J3dFrame.cubi22.getId();place=J3dFrame.cubi22.getPlace();break;
                          case 23: id=J3dFrame.cubi23.getId();place=J3dFrame.cubi23.getPlace();break;
                          case 24: id=J3dFrame.cubi24.getId();place=J3dFrame.cubi24.getPlace();break;
                          case 25: id=J3dFrame.cubi25.getId();place=J3dFrame.cubi25.getPlace();break;
                          default:id=-1;
                        }              
              //System.out.println("c"+i+"p"+placeArray[i]+"i"+id);
              stringArray[i]=new String("c"+nrArray[i]+"p"+place+"i"+id);
            }
            for (int i=0;i<26;i++)
            if(set.contains(i)) System.out.println(stringArray[i]);	
        }
      
     static public void arrayAusgabe(int[] nrArray,int[] placeArray)
      {              for (int i=0;i<26;i++)
                       switch(nrArray[i])
                        { case 0: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi0.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 1: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi1.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 2: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi2.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 3: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi3.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 4: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi4.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 5: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi5.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 6: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi6.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 7: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi7.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 8: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi8.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 9: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi9.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 10: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi10.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 11: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi11.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 12: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi12.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 13: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi13.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 14: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi14.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 15: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi15.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 16: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi16.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 17: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi17.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 18: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi18.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 19: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi19.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 20: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi20.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 21: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi21.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 22: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi22.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 23: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi23.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 24: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi24.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 25: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi25.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                        }
                      System.out.println();
        }   
    
    
 
    
}
