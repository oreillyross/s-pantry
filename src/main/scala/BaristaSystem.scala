import akka.actor.ActorSystem

object BaristaSystem extends App {
  val system = ActorSystem("BaristaSystem")
  system.shutdown()
}


