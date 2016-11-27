package bookmark.http

import bookmark.http.route.BookmarkRoute

/**
  * Created by yw on 16. 11. 28.
  */
trait HttpService extends BookmarkRoute {

  val routes = bookmarkRoute

}
