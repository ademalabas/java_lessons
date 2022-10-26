package BENIM_DOSYALAR.J19_StaticVariable.ClassTask.Rectangle;

public class Task01_RectangleClass {
/*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */

    int width ;
    int length ;


    public Task01_RectangleClass(int width, int length) {
        this.width = width ;
        this.length = length ;

    }

    public double perimeter(   ) {
        double perimeter= (width+length)*2;
        return perimeter;
    }

    public double area () {
        double area= (width*length)/2;
        return area;
    }



}
