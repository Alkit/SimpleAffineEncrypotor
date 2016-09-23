import java.io.IOException
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafxml.core.{NoDependencyResolver, FXMLView}

/**
  * Created by Alkit on 9/15/2016.
  */
object Main extends JFXApp {
  val resource = getClass.getResource("/Forms/Main.fxml")
  if (resource == null) {
    throw new IOException("Cannot load resource: Main.fxml")
  }
  val root = FXMLView(resource, NoDependencyResolver)

  stage = new PrimaryStage() {
    title = "Application"
    scene = new Scene(root)
  }
}
