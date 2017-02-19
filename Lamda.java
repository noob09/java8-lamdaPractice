/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praveen_sangalad
 */
public class Lamda {
    public static void main(String[] args) {
        display d=(a,b)-> a+b;
        d.abc();
        display1 d1=(a1,b1)->  (a1-b1);
        System.out.println(d.show(1,2));
         System.out.println(d1.show2(24,17));
    } 
}
 interface display{
        public int show(int a,int b);
        //default method
        default void abc(){
            System.out.println("inside default method");
        }
    }
    @functional interface
 interface display1{
        
            public float show2(float a,float b);
    }
