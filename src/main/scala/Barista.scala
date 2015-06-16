sealed trait CoffeeRequest

case object CappuccinoRequest extends CoffeeRequest
case object EspressoRequest extends CoffeeRequest


import akka.actor.Actor

class Barista extends Actor {

  def receive = {
  
    case CappuccinoRequest => println("Preparing a Cappuccino")
    case EspressoRequest => println("Preparing a Espresso")
  }
}
