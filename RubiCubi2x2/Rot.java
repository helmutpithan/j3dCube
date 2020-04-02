
/**
 * Write a description of class Rot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Rot
{static public boolean finish()
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
       { int[] placeArray=new int[8];
                    placeArray[0]=J3dFrame.cubi0.getPlace(); //im place steht,an welchem Platz sich das Cubi mit der Nummer befindet.   
                    placeArray[1]=J3dFrame.cubi1.getPlace();
                    placeArray[2]=J3dFrame.cubi2.getPlace();
                    placeArray[3]=J3dFrame.cubi3.getPlace();
                    placeArray[4]=J3dFrame.cubi4.getPlace();
                    placeArray[5]=J3dFrame.cubi5.getPlace();
                    placeArray[6]=J3dFrame.cubi6.getPlace();
                    placeArray[7]=J3dFrame.cubi7.getPlace();
                    return placeArray;
        }
     static public  int[] fillNrArray(int[] placeArray)
       { int[] nrArray=new int[8];
           for (int i=0;i<8;i++)    
           nrArray[placeArray[i]]=i;
           return nrArray;          
        }
     static public void arrayAusgabe(int[] nrArray,int[] placeArray)
      {              for (int i=0;i<8;i++)
                       switch(nrArray[i])
                        { case 0: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi0.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 1: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi1.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 2: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi2.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 3: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi3.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 4: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi4.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 5: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi5.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 6: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi6.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                          case 7: {System.out.println("i="+i+" nrArray["+i+"]= "+nrArray[i]+" id: "+J3dFrame.cubi7.getId() +" placeArray["+i+"]="+placeArray[i] );break;}
                        }
                      System.out.println();
        }   
    
    
    

    
}
