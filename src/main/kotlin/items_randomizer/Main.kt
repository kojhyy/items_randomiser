package items_randomizer


import items_randomizer.controleur.ControleurGenerate
import items_randomizer.modele.modele
import items_randomizer.vue.Vue
import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage


class Main: Application() {

   override fun start(primaryStage: Stage) {
   
        val vue = Vue()
        val modele = modele()

        val scene = Scene(vue, 1000.0, 500.0)
        var con = ControleurGenerate(vue, modele)
        con.handle(null)
        vue.controleur_generate(con)

        primaryStage.title="Items randomizer"
        primaryStage.scene=scene
        primaryStage.show()

      
   }

}

fun main(){
    Application.launch(Main::class.java)
}
