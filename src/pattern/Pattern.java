/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bony
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    
    void Test()
    {
        System.out.println("Test");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("enter size= ");
        n=s.nextInt();
        ArrayList<patterninterface> p=new ArrayList<>();
        p.add(new pattern1());
        p.add(new pattren2());        
        p.add(new pattern3()); 
        p.add(new pattern4());    
    
       for(int i=0;i<p.size();i++)
        {
        p.get(i).showpattren(n);
        }
    }
    
}
