package bookmark.util

import slick.driver.H2Driver.api.Database

/**
  * Created by yw on 16. 11. 28.
  */
trait DatabaseConfig {

  val db = Database.forConfig("database")

  val driver = slick.driver.H2Driver

  import driver.api._

  implicit val session: Session = db.createSession()

}
