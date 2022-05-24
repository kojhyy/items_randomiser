package items_randomizer.modele

import kotlin.random.Random

class modele {

    var item1: String = ""
    var item2: String = ""
    var item3: String = ""
    var item4: String = ""
    var item_mythic: String = ""
    var item_boots: String = ""
    var champ: String = ""

    var interdit1 = arrayListOf<Int>(21, 24)           //"Guinsoo's Rageblade","Infinity Edge")
    var interdit2 = arrayListOf<Int>(41, 55)           //"Titanic Hydra","Ravenous Hydra")
    var interdit3 = arrayListOf<Int>(46, 28)           //"Serylda's Grudge","Lord Dominik's Regards")
    var interdit4 = arrayListOf<Int>(29, 51)           //"Maw of Malmortius","Sterak's Gage")
    var interdit5 = arrayListOf<Int>(48, 31)           //"Silvermere Dawn","Mercurial Scimitar")
    var interdit6 = arrayListOf<Int>(2, 29, 58)         //"Archangel's Staff","Manamune","Fimbulwinter")

    private val liste_items = mutableListOf<String>(
        "Abyssal_Mask", "Anathemas_Chains", "Archangels_Staff",  "Ardent_Censer", "Axiom_Arc", "Banshees_Veil", "Black_Cleaver", "Blade_of_the_Ruined_King", "Bloodthirster", "Chempunk_Chainsword", "Chemtech_Putrifier", "Cosmic_Drive", "Dead_Mans_Plate", "Deaths_Dance", "Demonic_Embrace", "Essence_Reaver", "Force_of_Nature", "Frozen_Heart", "Gargoyle_Stoneplate", "Guardian_Angel", "Guinsoos_Rageblade", "Horizon_Focus", "Hullbreaker", "Infinity_Edge", "Knights_Vow", "Lich_Bane", "Lord_Dominiks_Regards", "Manamune",  "Maw_of_Malmortius",  "Mejais_Soulstealer", "Mercurial_Scimitar", "Mikaels_Blessing", "Morellonomicon", "Mortal_Reminder", "Nashors_Tooth", "Navori_Quickblades", "Phantom_Dancer", "Rabadons_Deathcap", "Randuins_Omen", "Rapid_Firecannon", "Ravenous_Hydra", "Redemption", "Runaans_Hurricane", "Rylais_Crystal_Scepter", "Serpents_Fang", "Seryldas_Grudge", "Shadowflame", "Silvermere_Dawn", "Spirit_Visage", "Staff_of_Flowing_Water", "Steraks_Gage",  "Stormrazor", "The_Collector", "Thornmail", "Titanic_Hydra", "Umbral_Glaive", "Void_Staff", "Warmogs_Armor", "Winters_approach", "Wits_End", "Youmuus_Ghostblade", "Zekes_Convergence", "Zhonyas_Hourglass"
    )

    private val liste_mythic_items = mutableListOf<String>(
        "Crown_of_the_Shattered_Queen", "Divine_Sunderer", "Duskblade_of_Draktharr", "Eclipse", "Evenshroud", "Everfrost", "Frostfire_Gauntlet", "Galeforce", "Goredrinker", "Hextech_Rocketbelt", "Immortal_Shieldbow", "Imperial_Mandate", "Kraken_Slayer", "Liandrys_Anguish", "Locket_of_the_Iron_Solari", "Ludens_Tempest", "Moonstone_Renewer", "Night_Harvester", "Prowlers_Claw", "Shurelyas_Battlesong", "Riftmaker", "Stridebreaker", "Sunfire_Aegis", "Trinity_Force", "Turbo_Chemtank"
    )

    private val liste_boots = mutableListOf<String>(
        "Berserkers_Greaves", "Boots_of_Swiftness", "Ionian_Boots_of_Lucidity", "Mercurys_Treads", "Mobility_Boots", "Plated_Steelcaps", "Sorcerers_Shoes"
    )

    private val liste_champs = mutableListOf<String>(
        "Aatrox", "Ahri", "Akali", "Akshan", "Alistar", "Amumu", "Anivia", "Annie", "Aphelios", "Ashe", "AurelionSol", "Azir", "Bard", "Blitzcrank", "Brand", "Braum", "Caitlyn", "Camille", "Cassiopeia", "ChoGath", "Corki", "Darius", "Diana", "DrMundo", "Draven", "Ekko", "Elise", "Evelynn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz", "Galio", "Gangplank", "Garen", "Gnar", "Gragas", "Graves", "Gwen", "Hecarim", "Heimerdinger", "Illaoi", "Irelia", "Ivern", "Janna", "JarvanIV", "Jax", "Jayce", "Jhin", "Jinx", "KaiSa", "Kalista", "Karma", "Karthus", "Kassadin", "Katarina", "Kayle", "Kayn", "Kennen", "KhaZix", "Kindred", "Kled", "KogMaw", "LeBlanc", "LeeSin", "Leona", "Lillia", "Lissandra", "Lucian", "Lulu", "Lux", "Malphite", "Malzahar", "Maokai", "MasterYi", "MissFortune", "Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus", "Neeko", "Nidalee", "Nocturne", "Nunu", "Olaf", "Orianna", "Ornn", "Pantheon", "Poppy", "Pyke", "Qiyana", "Quinn", "Rakan", "Rammus", "RekSai", "Rell", "Renata", "Renekton", "Rengar", "Riven", "Rumble", "Ryze", "Samira", "Sejuani", "Senna", "Seraphine", "Sett", "Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", "Soraka", "Swain", "Sylas", "Syndra", "TahmKench", "Taliyah", "Talon", "Taric", "Teemo", "Thresh", "Tristana", "Trundle", "Tryndamere", "TwistedFate", "Twitch", "Udyr", "Urgot", "Varus", "Vayne", "Veigar", "Velkoz", "Vex", "Vi", "Viego", "Viktor", "Vladimir", "Volibear", "Warwick", "Wukong", "Xayah", "Xerath", "XinZhao", "Yasuo", "Yorick", "Yone", "Yuumi", "Zac", "Zed", "Zeri", "Ziggs", "Zilean", "Zoe", "Zyra"
    )

    private val liste_runes = mutableListOf<String>(
        "Absolute_Focus_rune.png", "Aftershock_rune.png", "Approach_Velocity_rune.png", "Arcane_Comet_rune.png", "Biscuit_Delivery_rune.png", "Bone_Plating_rune.png", "Celerity_rune.png", "Cheap_Shot_rune.png", "Conditioning_rune.png", "Conqueror_rune.png", "Cosmic_Insight_rune.png", "Coup_de_Grace_rune.png", "Cut_Down_rune.png", "Dark_Harvest_rune.png", "Demolish_rune.png", "Electrocute_rune.png", "Eyeball_Collection_rune.png", "First_Strike_rune.png", "Fleet_Footwork_rune.png", "Font_of_Life_rune.png", "Futures_Market_rune.png", "Gathering_Storm_rune.png", "Ghost_Poro_rune.png", "Glacial_Augment_rune.png", "Grasp_of_the_Undying_rune.png", "Guardian_rune.png", "Hail_of_Blades_rune.png", "Hextech_Flashtraption_rune.png", "Ingenious_Hunter_rune.png", "Last_Stand_rune.png", "Legend-_Alacrity_rune.png", "Legend-_Bloodline_rune.png", "Legend-_Tenacity_rune.png", "Lethal_Tempo_rune.png", "Magical_Footwear_rune.png", "Manaflow_Band_rune.png", "Minion_Dematerializer_rune.png", "Nimbus_Cloak_rune.png", "Nullifying_Orb_rune.png", "Overgrowth_rune.png", "Overheal_rune.png", "Perfect_Timing_rune.png", "Phase_Rush_rune.png", "Predator_rune.png", "Presence_of_Mind_rune.png", "Press_the_Attack_rune.png", "Relentless_Hunter_rune.png", "Revitalize_rune.png", "Scorch_rune.png", "Second_Wind_rune.png", "Shield_Bash_rune.png", "Sudden_Impact_rune.png", "Summon_Aery_rune.png", "Taste_of_Blood_rune.png", "Time_Warp_Tonic_rune.png", "Transcendence_rune.png", "Treasure_Hunter_rune.png", "Triumph_rune.png", "Ultimate_Hunter_rune.png", "Unflinching_rune.png", "Unsealed_Spellbook_rune.png", "Waterwalking_rune.png", "Zombie_Ward_rune.png",
    )

    init {
        this.randomise()
    }

    fun randomise() {
        // création de la liste
        val liste_nombres_random: MutableList<Int> = mutableListOf()

        // boucle pour remplir la liste
        while (liste_nombres_random.size != 4) {

            // nombre aléatoire
            val nombre = Random.nextInt(this.liste_items.size)

            // future liste si le nombre est valide
            val future_liste: MutableList<Int> = (liste_nombres_random + mutableListOf<Int>(nombre)) as MutableList<Int>

            // vérification de si le nombre est déjà dans la liste, si il ne contient pas 2 objets non compatibles
            if (nombre !in liste_nombres_random && this.verification_items_non_compatibles(future_liste))
                liste_nombres_random.add(nombre)
        }

        // attribution des valeurs aux items
        this.item1 = this.liste_items[liste_nombres_random[0]]
        this.item2 = this.liste_items[liste_nombres_random[1]]
        this.item3 = this.liste_items[liste_nombres_random[2]]
        this.item4 = this.liste_items[liste_nombres_random[3]]

        this.item_mythic = this.liste_mythic_items[Random.nextInt(this.liste_mythic_items.size)]
        this.item_boots = this.liste_boots[Random.nextInt(this.liste_boots.size)]
        this.champ = this.liste_champs[Random.nextInt(this.liste_champs.size)]

    }
    /*
    * vérifie si la future liste contient 2 objets qui ne peuvent pas etre ensemble
     */
    fun verification_items_non_compatibles(future_liste: MutableList<Int>): Boolean {
        for (items_non_compatible in mutableListOf<MutableList<Int>>(this.interdit1, this.interdit2, this.interdit3, this.interdit4, this.interdit5, this.interdit6)) {

            val fusion = future_liste + items_non_compatible
            if (fusion.toSet().size - fusion.size <= -2)
                return false
        }
        return true
    }

    override fun toString(): String = "$item1, $item2, $item3, $item4, $item_mythic, $item_boots, $champ"

    fun get_items(): Array<String> = arrayOf(this.item1, this.item2, this.item3, this.item4, this.item_mythic, this.item_boots, this.champ)
}