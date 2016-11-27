package bookmark.service

import bookmark.model.Bookmark
import bookmark.repository.BookmarkRepository

import scala.concurrent.Future

object BookmarkService extends BookmarkService

trait BookmarkService extends BookmarkRepository {

  import driver.api._

  def save(newBookmark: Bookmark): Future[Bookmark] = db.run(bookmarks returning bookmarks += newBookmark)

  def getBookmarks() = db.run(bookmarks.result)
}
