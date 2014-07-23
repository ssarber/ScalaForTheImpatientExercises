import scala.io.Source
import scala.collection.mutable.Stack


object chap4 extends App { 
//  1: Set up a map of prices for a number of gizmos that you covet. Then produce
// a second map with the same keys and the prices at a 10 percent discount.

	val gismos = Map("iphone"-> 200.0, "ipad" -> 400.0, "zho" -> 300.0)
	val discounted = for ((k, v) <- gismos) yield (k, v * 0.9)
	
	println(discounted)
	
	
//	2: [Write a program that reads words from a �le. Use a mutable map to count
//	how often each word appears. To read the words, simply use a java.util.Scanner:
//	val in = new java.util.Scanner(new java.io.File("myfile.txt"))
//	while (in.hasNext()) process in.next()
//	Or look at Chapter 9 for a Scalaesque way.
//	At the end, print out all words and their counts.]
	val words = new scala.collection.mutable.HashMap[String, Int]
	val in = new java.util.Scanner(new java.io.File("/Users/lm-ssarber/Developer/ScalaForTheImpatientExercises/exer/src/abraham_lincoln_1st.txt"))
	
	while (in.hasNext()) {
	  val word = in.next()
	  if (words.contains(word))
	    words(word) = words(word) + 1
	    
	  else 
	    words(word) = 1
	}
	
	println(words)
	
	
//	3: [Repeat the preceding exercise with an immutable map.]
	import scala.io.Source
	
	val source = Source.fromFile("/Users/lm-ssarber/Developer/ScalaForTheImpatientExercises/exer/src/abraham_lincoln_1st.txt")
	
	val words2 = for (word <- source.getLines.toArray) yield word
	val wordCounts = for (word <- words2.distinct) yield {
	  (word, words.count(_== word))
	}
	val wordCountMap = wordCounts.toMap
	println(wordCountMap)
	
	  
	  
	
//	4: [Repeat the preceding exercise with a sorted map, so that the words are
//	printed in sorted order.]
}

