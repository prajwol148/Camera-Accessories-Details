/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad_is;

/**
 *
 * @author prajw
 */
public class SelectionSorter {

    public static void sort(int[] a)
        {  
      for (int i = 0; i < a.length - 1; i++)
      {  
         int minPos = minimumPosition(a, i);
         ArrayUtil.swap(a, minPos, i);
      }
   }

    private static int minimumPosition(int[] a, int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i] < a[minPos]) { 
             minPos = i; 
         }
      }
      return minPos;
   }
}