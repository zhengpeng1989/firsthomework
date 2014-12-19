package org.nightschool.model;

/**
 * Created by Administrator on 2014/12/6 0006.
 */
public class Disk {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String img;
    private String desc;
    private double price;

    public  void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return  this.price;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
