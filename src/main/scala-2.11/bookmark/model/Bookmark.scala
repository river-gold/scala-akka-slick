package bookmark.model

/**
  * Created by yw on 16. 11. 28.
  */
case class Bookmark(title: String, url: String, content: String, id: Option[Long]=None)
