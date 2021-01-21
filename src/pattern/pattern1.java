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
public class pattern1 implements patterninterface {
    public pattern1(){
    }
    @Override
    public void showpattren(int n) {
        System.out.print("problem no:01 = ");
        for(int i=0;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                 
                System.out.print(j);
            }
            System.out.println();
        }
        }
    
}
