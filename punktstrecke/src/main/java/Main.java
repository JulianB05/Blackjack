/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class Main {
    
    public static void main(String[] args) {
        double gp=0.0;
        int ag=1;
        Point p;
        try{
            p= new Point(3.9,4.5);
            p.setX(2.0);
            p.setY(3.0);
            gp+=0.5;
            if(p.getX()==2.0&& p.getY()==3.0){
                gp+=0.5;
            }
            System.out.println("Nach Aufgabe 1 hast du: "+gp + " von "+ag+" Punkte");
            
        }catch(Exception ex){
            System.out.println("Nach Aufgabe 1 hast du: "+gp + " von "+ag+" Punkte");
        }
        ag++;
        try{
            Point p2= new Point(2.0, 2.0);
            boolean f= p2.equality(new Point(3.0,3.0));
            boolean t= p2.equality(new Point(2.0,2.0));
            if(t&&!f)
                gp+=0.5;
            if(p2.getPoint().equals("(2.0|2.0)"))
                gp+=0.25;
            if(p2.getPoint("A"
                    + ""
                    + "").equals("A(2.0|2.0)"))
                gp+=0.25;
            
            System.out.println("Nach Aufgabe 2 hast du: "+gp+ " von "+ ag+ " Punkte");
        }catch(Exception ex){
            System.out.println("Nach Aufgabe 2 hast du: "+gp+ " von "+ ag+ " Punkte");
        }
       
        try{
             Point p3= new Point(4.0, 3.0);
            ag++;
            p3.spiegelnX();
            if(p3.getY()==-3.0)
                gp+=0.5;
            p3.spiegelnY();
            if(p3.getX()==-4.0)
                gp+=0.5;
            System.out.println("Nach Aufgabe 3 hast du: "+gp+ " von "+ ag+ " Punkte");
        }
        
        catch(Exception ex){
            System.out.println("Nach Aufgabe 3 hast du: "+gp+ " von "+ ag+ " Punkte");
        }
        try{
        Point p4= new Point(4.0, 3.0);
        ag++;
        double distance = p4.distance(new Point(3.0,4.0));
        if(distance==Math.sqrt(2))
            gp++;
        System.out.println("Nach Aufgabe 4 hast du: "+gp+ " von "+ ag+ " Punkte");
        }
        
        catch(Exception ex){
            System.out.println("Nach Aufgabe 4 hast du: "+gp+ " von "+ ag+ " Punkte");
        }
    }
    
}
