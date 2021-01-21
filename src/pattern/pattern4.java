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
public class pattern4 implements patterninterface{

    @Override
    public void showpattren(int n) {
        
        System.out.println("problem no:04 = ");
        int j,i;
        for ( i = 1; i <= n; i++){
                for(j=n-i;j>0;j--){
                System.out.print(" ");
                }
                for(j = 1;j <= i;j++){
                System.out.print("" + j);
                }
                for(j =i - 1;j > 0;j--){
                System.out.print("" + j);

                }
                System.out.println();
        }
         for ( i = n-1; i >= 1; i--){
                for(j=n-i;j>0;j--){
                System.out.print(" ");
                }
                for(j = 1;j <= i;j++){
                System.out.print("" + j);
                }
                for(j =i - 1;j > 0;j--){
                System.out.print("" + j);

                }
                System.out.println();
        }
    }
    }
    

