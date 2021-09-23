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
      def iSumaNat(nat1:Nat, nat2:Nat,aux:Int):Nat = {
      
        nat1

      }
   if (esCero(nat1)) nat2
   else if (esCero(nat2)) nat1
   else {
        iSumaNat(nat1,nat2,0) 
   }
  }

  //main
  //Pruebas
  //println(imprimirNat(conIntANat(3))) ok :D



}
