/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julian
 */
public class Point {
    
    protected double x;
    protected double y;
    protected int norm = 2;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    } 
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    } 
    
    public boolean equality(Point p2){
        if (x == p2.x && y == p2.y) {
            return true;
        }
        else{
            return false;
        }
    }
    public String getPoint() {
        return "("+x+"|"+y+")";
    }
    public String getPoint(String buchstabe) {
        return buchstabe+"("+x+"|"+y+")";
    }
    
    public void spiegelnX(){
        this.y = y*(-1);
    }
    public void spiegelnY(){
        this.x = x*(-1);
    }
    
    public double distance(Point p2){
        double res = 0;
        if (norm == 1) {
            res = Math.sqrt(Math.abs(x - p2.getX()) + Math.abs(y - p2.getY()));
        }
        if (norm == 2) {
            res = Math.sqrt((x - p2.getX())*(x - p2.getX()) + (y - p2.getY())*(y - p2.getY()));       
        }
        return res;
    } 

    public void setNorm(int norm) {
        this.norm = norm;
    }
    
    
    
}
