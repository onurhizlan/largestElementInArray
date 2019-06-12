/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onurhizlan;

/**
 *
 * @author onur_
 */
public class DiziEnBuyuk {
    
    public  void enBuyukDizi(int[] array){
       int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Dizideki en buyuk eleman = " + max);
    }
    
    public static void main(String[] args) {
        int array[] = {0,2,1,5,9,3,16};
        DiziEnBuyuk diziEnbuyuk = new DiziEnBuyuk();
        diziEnbuyuk.enBuyukDizi(array);
    }
}
