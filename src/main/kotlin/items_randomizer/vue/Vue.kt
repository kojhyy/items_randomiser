package items_randomizer.vue

import items_randomizer.controleur.ControleurGenerate
import javafx.scene.control.*
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.GridPane

import java.io.FileInputStream


class Vue: GridPane() {

    // création des éléments
    private var path_images = System.getProperty("user.dir") + "/src/main/kotlin/items_randomizer/vue"

    private var image_item1 = ImageView(Image(FileInputStream("$path_images/Item/Other/Abyssal_Mask_item.png")))
    private var image_item2 = ImageView(Image(FileInputStream("$path_images/Item/Other/Abyssal_Mask_item.png")))
    private var image_item3 = ImageView(Image(FileInputStream("$path_images/Item/Other/Abyssal_Mask_item.png")))
    private var image_item4 = ImageView(Image(FileInputStream("$path_images/Item/Other/Abyssal_Mask_item.png")))
    private var image_item_mythic = ImageView(Image(FileInputStream("$path_images/Item/Mythique/Crown_of_the_Shattered_Queen_item.png")))
    private var image_item_boots = ImageView(Image(FileInputStream("$path_images/Item/Boots/Berserkers_Greaves_item.png")))
    private var image_champ = ImageView(Image(FileInputStream("$path_images/Champion/Aatrox.png")))
    private var image_rune = ImageView(Image(FileInputStream("$path_images/Runes/Update_Runes/Aftershock_rune.png")))


    private val generate = Button("Build")


    init {

        this.setHgap(10.0) //horizontal gap in pixels => that's what you are asking for

        this.setVgap(10.0) //vertical gap in pixels

        //this.setPadding(Insets(10.0, 10.0, 10.0, 10)) //margins around the whole grid

        //(top/right/bottom/left)
        // placement des éléments
        this.add(this.image_champ, 0 , 0)
        this.add(this.image_item_boots, 1 , 0)
        this.add(this.image_item_mythic, 2 , 0)
        this.add(this.image_item1, 3, 0)
        this.add(this.image_item2, 4 , 0)
        this.add(this.image_item3, 5 , 0)
        this.add(this.image_item4, 6 , 0)


        this.add(this.image_rune, 0, 2)
        image_rune.setFitWidth(100.0);
        image_rune.setFitHeight(100.0);

        this.add(this.generate, 0, 1)


    }

    fun update_images(array: Array<String>) {
        this.image_item1.image = Image(FileInputStream("$path_images/Item/Other/${array[0]}_item.png"))
        this.image_item2.image = Image(FileInputStream("$path_images/Item/Other/${array[1]}_item.png"))
        this.image_item3.image = Image(FileInputStream("$path_images/Item/Other/${array[2]}_item.png"))
        this.image_item4.image = Image(FileInputStream("$path_images/Item/Other/${array[3]}_item.png"))
        this.image_item_mythic.image = Image(FileInputStream("$path_images/Item/Mythique/${array[4]}_item.png"))
        this.image_item_boots.image = Image(FileInputStream("$path_images/Item/Boots/${array[5]}_item.png"))
        this.image_champ.image  = Image(FileInputStream("$path_images/Champion/${array[6]}.png"))
        this.image_rune.image  = Image(FileInputStream("$path_images/Runes/Update_Runes/${array[7]}.png"))
    }

    /*
    * met un controleur sur le bouton generate
    * args:
    *   - controleur à mettre sur le bouton
     */
    fun controleur_generate(controleur: ControleurGenerate) {
        this.generate.onMouseClicked = controleur
    }
}
