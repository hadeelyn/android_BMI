package com.hadeelNQ.myapplication.ui;

import java.util.ArrayList;

public class BMIRecord {
    private ArrayList<BMIRecord> records=new ArrayList<BMIRecord>();

        final static String Underweight="Underweight";
        final static String Healthy="Healthy";
        final static String Overweight="Overweight";
        final static String Obesity="Obesity";
        final static String LC="Little Changes";
        final static String SG="Still Good";
        final static String GA="Go Ahead";
        final static String BC="Be Careful";
        final static String SB="So Bad";


    private String date;
    private double weight;
    private int length;
    private String id;

    public BMIRecord(String date,double weight,int length){
        this.date=date;
        this.weight=weight;
        this.length=length;
    }
    public String getDate(){return  date;}
    public void setDate(String date){this.date=date;}
    public double getWeight(){return weight;}
    public void setWeight(double weight){this.weight=weight;}
    public int getLength(){return length;}
    public void setLength(int length){this.length=length;}
    public String getId(){return id;}
    public void setId(String id){this.id=id;}
    public double getBmi(){return (weight/Math.pow((length/100.0),2))*this.getAgePercent();}
    public void setBmi(double x){

    }
    public double getAgePercent(){return 1;}
    public void setAgePercent(double x){

    }
    public String getLastBMIMessage(){
        return records.get(0).getBMIMessage();
    }
    public String getBMIMessage(){
        double bmi=this.getBmi();
        if(bmi<18.5){
            return Underweight;
        }else if (18.5<=bmi && bmi<25){
            return Healthy;
        }else if(25<=bmi &&bmi<30){
            return Overweight;
        }else if (bmi>30){
            return Obesity;
        }
   return " "; }
    public String getBMIDiffMessage(){
        return records.get(0).getBMIDifferenceMessage(records.get(records.size()==1?0:1));
    }
    public double getBmiDifference(BMIRecord record){
return getBmi();
    }
    public String getBMIDifferenceMessage(BMIRecord record){
        double diff=this.getBmiDifference(record);
        if (diff>=-0.0001 && diff<=0.0001)
            return "No changes";
            String currentMsg=this.getBMIMessage();
        switch (currentMsg){
            case Underweight:
                if (diff<-0.3)
                    return SB;
                else if (-0.3<=diff &&diff<0.3)
                    return LC;
                else if (0.3<=diff &&diff<0.6)
                    return SG;
                else if (0.6<=diff)
                    return GA;
                break;
            case Healthy:
                if (diff<-1)
                    return SB;
                else if (-1<=diff &&diff<-0.3)
                    return BC;
                else if (-0.3<=diff &&diff<0.3)
                    return LC;
                else if (0.3<=diff)
                    return BC;
                break;
            case Overweight:
                if (diff<-1&&0.3<=diff &&diff<0.6)
                    return BC;
                else if (-1<=diff &&diff<-0.6)
                    return GA;
                else if (-0.6<=diff &&diff<-0.3)
                    return SG;
                else if (-0.3<=diff &&diff<0.3)
                    return LC;

                else if (0.6<=diff)
                    return SB;
                break;
            case Obesity:
                if (diff<-0.6)
                    return GA;
                else if (-0.6<=diff &&diff<0)
                    return LC;
                else if (0<=diff &&diff<0.3)
                    return BC;
                else if (0.3<=diff &&diff<1)
                    return SB;

                break;
        }


    return "";}
    public String getHomeMessage(){
        return this.getLastBMIMessage()+"("+this.getBMIDiffMessage()+")";
    }
}
