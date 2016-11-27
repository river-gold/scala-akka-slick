package bookmark

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import beliar.http.HttpService

/**
  * Created by yw on 16. 11. 28.
  */
object Main extends App with DatabaseConfig with HttpService {

  implicit val actorSystem = ActorSystem("system")
  implicit val actorMaterializer = ActorMaterializer()

  Http().bindAndHandle(routes, "localhost", 8080)
}
