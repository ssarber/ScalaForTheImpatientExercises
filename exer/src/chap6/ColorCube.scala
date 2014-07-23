package chap6

object ColorCube extends Enumeration {
	 type ColorCube = Value
	 val Red = Value(0xff0000)
	 val Green = Value(0x00ff00)
	 val Blue = Value(0x0000ff)
	 val Cyan = Value(0x00ffff)
	 val Magenta = Value(0xff00ff)
	 val Yellow = Value(0xffff00)
  	 val White = Value(0xffffff)
  	 
}


import ColorCube._
object Mainz extends App {
  
  println(ColorCube.Blue)
}

