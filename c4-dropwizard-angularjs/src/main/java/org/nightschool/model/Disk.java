package org.nightschool.model;

public class Disk {
    private String name;
    private String imgUrl;
    private String desc;
    private int id;
    private double price;

    public Disk(String name, String imgUrl, String desc,int id,double price) {

        this.name = name;
        this.imgUrl = imgUrl;
        this.desc = desc;
        this.price=price;
        this.id = id;
    }

    public Disk() {

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImgUrl(String img) {
        this.imgUrl = img;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  double getPrice(){
        return  price;
    }
    public  void setPrice(double price){
        this.price = price;
    }
}
