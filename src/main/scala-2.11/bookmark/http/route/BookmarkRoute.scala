package bookmark.http.route

import akka.http.scaladsl.server.Directives._
import bookmark.service.BookmarkService

/**
  * Created by yw on 16. 11. 28.
  */
trait BookmarkRoute extends BookmarkService {
  val bookmarkRoute =
    path("") {
      pathEndOrSingleSlash {
        get {
          complete {
            "Hello world"
          }
        }
      }
    }
}
