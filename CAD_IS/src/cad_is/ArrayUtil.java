/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad_is;

import java.util.Random;

/**
 *
 * @author prajw
 */
public class ArrayUtil {

    private static Random generator = new Random();

    public static int[] randomIntArray(int length, int n)
   {  
      int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);
      }
      
      return a;
   }

   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}