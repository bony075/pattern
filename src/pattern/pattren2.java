/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author bony
 */
public class pattren2 implements patterninterface{

    @Override
    public void showpattren(int n) {
        System.out.println("problem no:02 = ");
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
            System.out.print(j);
        }
            System.out.println();
    }
    }
    
}
