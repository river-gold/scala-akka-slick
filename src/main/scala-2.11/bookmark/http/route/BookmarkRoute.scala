package bookmark.http.route

import akka.http.scaladsl.server.Directives._
import bookmark.model.Bookmark
import bookmark.service.BookmarkService

/**
  * Created by yw on 16. 11. 28.
  */
trait BookmarkRoute extends BookmarkService {
  val bookmarkRoute =
    path("") {
      pathEndOrSingleSlash {
        get {
          save(Bookmark(Option(1L), "네이버", "http://naver.com", "네이버"))
          save(Bookmark(Option(1L), "네이버", "http://naver.com", "네이버"))
          println(getBookmarks())
          complete {
            "Hello world"
          }
        }
      }
    }
}
