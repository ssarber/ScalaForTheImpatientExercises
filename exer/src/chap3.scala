

import scala.collection.mutable.ArrayBuffer
import util.Random._
import java.awt.datatransfer._
import scala.Array.canBuildFrom

object Hello extends App {
  println("Hello, World!")
  val a = ArrayBuffer[Int]()
 
  a += (1,2,3,4)
  
//  for (i <- 0 until a.length)
//    println(i + ":" + a(i))
    
// 1) Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).  
  def setRandArray(n: Int, max: Int) = {
      val r = new util.Random; 
      val c = for (i <- 0 to n) yield r.nextInt(max)
      c  
  } 
  print(setRandArray(3, 20)(3))
  
//  2) Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
  def swapAdjacent(a:Array[Int]) = {
		 val end = if(a.length % 2 == 0) a.length else a.length - 1
		 val z =  for(i <- 0 until end by 2) {
			val f = a(i)
			a(i) = a(i+1)
		    a(i+1) = f
		    println(i  + " :kapaw " + f)
		  }
  }
  
  // 3) Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield.
      val m = Array(1,2,3,4,5,6,7,9)
      print("\nLength: " + m.length + "\n")
      
//	  val end = if(m.length % 2 == 0) m.length else m.length - 1
	  val arr = for (i <- 0 until m.length -1) yield {
		  if (i % 2 == 0 && i < m.length - 1)
		    m(i + 1)
		  else if(i % 2 != 0 && i > 0)
		    m(i - 1)
		  else m(i)
	  }
//    print(arr)

// 4. Given an array of integers, produce a new array that contains all positive values of the original array, in their
// original order, followed by all values that are zero or negative, in their original order.
    val k = Array(1, -2, 3, -4, 5, 6, -7, 9, 0)
    var el = ArrayBuffer[Int]()
    for (elem <- k if elem > 0) {
      el += elem
    }
    for (elem <- k if elem < 0) {
      el += elem
    }
    for (elem <- k if elem == 0) {
      el += elem
    }
    
    print(el)
    
// 5. How do you computr the average on an Array[Double]?
    val c = Array[Double](1, -2, 3, -4, 5, 6, -7, 19, 0)
    
    var mean = c.sum / c.length
    print("\n" + mean)
    
  // 6.  How do you rearrange the elements of an Array[Int] so that they appear in reverse sorting order? 
  // How do you do the same with ArrayBuffer[Int]?
    val r = Array(1,2,3,4,5,6,7,9)
    val arrayBuffer = Array(1,2,3,4,5,6,7,9)
    
    val rReversed = scala.util.Sorting.quickSort(r)
//    val rReversed = r.reverse
    print("\nReversed array: " +  rReversed)
    
    val rBuffRev = arrayBuffer.sortWith(_ > _)
    
    print("\nReversed array buffer: " +  rBuffRev(1))
    
  // 7. Write a code snippet that produces all values from an array with all duplicates removed.
    
    val arrDupes = Array(1,2,3,4,5,6,7,9, 1, 2, 3)
    val noDupes = arrDupes.distinct
    print("\nDistinct: " +  noDupes)
    print("\nNo dupes: " + noDupes(5))
    
//    8: Rewrite the example at the end of Section 3.4, �Transforming Arrays,� on
//	page 32. Collect indexes of the negative elements, reverse the sequence, drop
//	the last index, and call a.remove(i) for each index. Compare the efficiency of
//	this approach with the two approaches in Section 3.4.
    
    
    var arrNeg = ArrayBuffer(1,2,3,4,5,6,7,9, 1, -2, -3)
    
    var negIndexes = for (i <- 0 until arrNeg.length if arrNeg(i) < 0) yield {

      i
//      print(i)
 
    }
    print("\nIndexes: " + negIndexes)
    
    val indexes = negIndexes.reverse.dropRight(1)
    
    for (elem <- indexes) 
      arrNeg.remove(elem)
    print("\nIndexes: " + arrNeg)
    
// 9. Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
//    that are in America. Strip off the "America/" pre�x and sort the result.
    
    var time = for (elem <- java.util.TimeZone.getAvailableIDs() if elem.contains("America")) yield {
      elem.stripPrefix("America");     
    }
    print("\nTime: " + time.sorted)
    
//    10. Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with
// the call
//    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
// Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
// and get the return value as a Scala buffer. (Why this obscure class? It�s hard
// to find uses of java.util.List in the standard Java library.)
    
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    val natives = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    
   println(natives)
}