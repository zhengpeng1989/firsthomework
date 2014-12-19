package org.nightschool.model;

/**
 * Created by lenovo on 2014/12/19.
 */
public class CountPrice {
    public double count(Cart cart){
        int numBig = 0;
        int numIndie = 0;
        int numWedding = 0;
        Disk disk = new Disk();

        for(int i = 0;i<cart.getDisks().size();i++){
           Disk disk1 = cart.getDisks().get(i);
            if(disk1.getName().equals("1TB大容量光盘")){
                numBig+=1;
            }
            if(disk1.getName().equals("小清新光盘")){
                numIndie+=1;
            }
            if(disk1.getName().equals("婚庆光盘")){
                numWedding+=1;
            }

        }
        disk.setPrice(30.0);
       double countBig= this.countBigDisk(disk,numBig);
        disk.setPrice(40.0);
        double countIndie= this.countIndieDisk(disk,numIndie);
        disk.setName("小清新光盘");
        for(int i = 0;i<numIndie /2;i++){

            cart.addDisk(disk);
        }
        disk.setPrice(50.0);
        double countWedding= this.countWeddingDisk(disk,numWedding);
        return  countBig+countIndie+countWedding;

    }

    public double countBigDisk(Disk disk,int n){

            disk.setPrice(disk.getPrice()*0.95);
            return n*disk.getPrice();

    }

    public double countIndieDisk(Disk disk,int n)
    {

        return disk.getPrice()*n;
    }
    public  double countWeddingDisk(Disk disk , int n){
        double anotherDoubleValue = Math.floor(n*disk.getPrice());//取整
        int intValue = (int)anotherDoubleValue;
       return n*disk.getPrice()-( intValue/100)*10;
    }
}
