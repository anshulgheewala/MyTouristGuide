package com.ag.mytouristguide;

public class model {
   String name , image,visit,hotel,icon2,namev,imagev;
    model(){

    }

    public model(String namev, String imagev) {
        this.namev = namev;
        this.imagev = imagev;
    }

    public model(String name, String image, String visit, String hotel, String icon2) {
        this.name = name;
        this.image = image;
        this.visit = visit;
        this.hotel=hotel;
        this.icon2=icon2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }

    public String getHotel() {
        return hotel;
    }

    public String getIcon2() {
        return icon2;
    }

    public String getNamev() {
        return namev;
    }

    public void setNamev(String namev) {
        this.namev = namev;
    }

    public String getImagev() {
        return imagev;
    }

    public void setImagev(String imagev) {
        this.imagev = imagev;
    }

    public void setIcon2(String icon2) {
        this.icon2 = icon2;
    }


}
