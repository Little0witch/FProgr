object Main234 {
  def main(args: Array[String]): Unit = {
    print("Enter the number: ")

    var numberString =""
    var a =0
    var b=0
    var c=0
    var rez: Double =0.0
    var z=0
    numberString = scala.io.StdIn.readLine()
    if ( numberString.length() != 10) {
      println("Incorrect number");
      sys.exit(0)  }

    for (i <- 1 to 5) {
      a = substringFromSymbolsAtEvenPositions(numberString).toInt

      b= substringFromSymbolsAtOddPositions(numberString).toInt
      c= a*b
      rez=c.toString.substring(0,3).toFloat / 1000
      z+=c
      if(z < 0){
        z = z.abs
        numberString = "011" + z.toString
      } 
      if (z.toString.length() < 10){
        numberString = "0" + z 
        println("numberString= " + numberString)
        for (j <- 1 to (10 - numberString.length()) + 1){
        numberString = "1" + z.toString
        }
      }
      else {
        numberString = z.toString
      }
      println("a= " + a)
      println("b= " + b)
      println("c= " + c)
      println("rez= " + rez)
      println("z="+ z)
  
      numberString= numberString.substring(1,numberString.length()-1)
      //println("num= "+ numberString)
      //numberString="01"+z
      println("numberString= " + numberString)
      println()

    }
  }

  def substringFromSymbolsAtEvenPositions(str: String): String = {
    val result = new StringBuilder
    for (i <- str.indices if i % 2 == 1) {
      result.append(str(i))
    }
    result.toString()
  }

  def substringFromSymbolsAtOddPositions(str: String): String = {
    val result = new StringBuilder
    for (i <- str.indices if i % 2 != 1) {
      result.append(str(i))
    }
    result.toString()
  }
}
