package chap6

object PlayingCardSuits extends Enumeration {
  type PlayingCardSuits = Value
  
  val clubs = Value("\u2663")
  val diamonds = Value("\u2666")
  val hearts = Value("u\2665")
  val spades = Value("\2660")
  
}

import PlayingCardSuits._
object Bla extends App {
//	println(Suits.hearts)
	def isRed(suit: PlayingCardSuits) = {
	  if (suit == clubs || suit == spades) false
	  else true
	}
	
	println (isRed(PlayingCardSuits.hearts))
}
