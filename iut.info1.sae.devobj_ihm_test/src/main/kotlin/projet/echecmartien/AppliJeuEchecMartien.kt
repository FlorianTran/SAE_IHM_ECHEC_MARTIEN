package projet.echecmartien

import javafx.application.Application
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.layout.GridPane

import javafx.stage.Stage

class AppliJeuEchecMartien: Application() {
    override fun start(primaryStage: Stage) {

        val vue = GridPane()
        val scene = Scene(vue ,600.0, 200.0)
        primaryStage.title="Concateneur de chaines en javaFX"
        primaryStage.scene=scene
        primaryStage.show()


    }

}

fun main(){
    Application.launch(AppliJeuEchecMartien::class.java)
}



