package bookmark

/**
  * Created by yw on 16. 11. 28.
  */
trait DatabaseConfig {

  val db = Database.forConfig("h2")

  val driver = slick.driver.H2Driver

  import driver.api.Session

  implicit val session: Session = db.createSession()

}
