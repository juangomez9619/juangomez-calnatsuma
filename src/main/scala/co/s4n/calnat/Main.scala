package co.s4n.calnat

import scala.io.StdIn

object Main extends App {
  
  def leerInt(prompt:String):Int = {
    val s = StdIn.readLine(prompt)
    s.toInt
  }
  
  def esCero(nat:Nat) = nat match {
    case Cero() => true
    case Suc(nat) => false
  }

  //Conversion de entero a natural
  def conIntANat(i:Int):Nat = i match {
    case 0 => Cero()
    case _ => Suc(conIntANat(i-1))

  }
  
 //Impresion 
  def imprimirNat(nat:Nat): String = ""+nat

  // Suma
  def sumaNat(nat1:Nat, nat2:Nat): Nat = {


   if (esCero(nat1)) nat2
   else if (esCero(nat2)) nat1
   else  Suc( conIntANat(imprimirNat(nat1).count(_ == 'S') + (imprimirNat(nat2).count(_ == 'S')) -1 )) 
   
  }

  //main
  //Pruebas
  //println(imprimirNat(conIntANat(3))) ok :D
  //print(sumaNat(conIntANat(2),conIntANat(1))) ok pero no me gusta la solucion
  //

  val num1 = leerInt("Leer primer entero: ")

  val num2 = leerInt("Leer segundo entero: ")

  print(sumaNat(conIntANat(num1),conIntANat(num2)))


}
