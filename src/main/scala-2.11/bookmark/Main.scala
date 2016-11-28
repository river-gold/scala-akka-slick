package bookmark

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import bookmark.http.HttpService
import bookmark.model.Bookmark
import bookmark.util.Config

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by yw on 16. 11. 28.
  */
object Main extends App with Config with HttpService {

  implicit val actorSystem = ActorSystem("system")
  implicit val actorMaterializer = ActorMaterializer()

  import driver.api._

  db.run(bookmarks.schema.create)

  db.run(DBIO.seq(
    bookmarks += Bookmark("네이버", "http://naver.com", "네이버"),
    bookmarks returning bookmarks += Bookmark("다음3", "http://naver.com", "다음3"),
    bookmarks.result.map(println)
  ))

  save(Bookmark("다음1", "http://naver.com", "다음2"))
  db.run(bookmarks returning bookmarks += Bookmark("네이버2", "http://naver.com", "네이버2"))
  db.run(bookmarks += Bookmark("네이버2", "http://naver.com", "네이버2"))

  getBookmarks().map(println)

  Http().bindAndHandle(routes, httpInterface, httpPort)
}
