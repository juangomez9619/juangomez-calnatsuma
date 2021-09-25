package co.s4n.calnat
import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite {

  test("multiplication with 0 should always give 0") {
    assert(Main.conIntANat(5) == Suc(Suc(Suc(Suc(Suc(Cero()))))))
  }
}
