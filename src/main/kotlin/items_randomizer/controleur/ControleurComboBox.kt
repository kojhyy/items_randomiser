package items_randomizer.controleur

import items_randomizer.modele.modele
import items_randomizer.vue.Vue
import javafx.event.EventHandler
import javafx.scene.input.MouseEvent


class ControleurGenerate(val vue: Vue,val modele : modele): EventHandler<MouseEvent> {


    override fun handle(p0: MouseEvent?) {
        this.modele.randomise()
        println(modele)
        this.vue.update_images(this.modele.get_items())
    }
}
