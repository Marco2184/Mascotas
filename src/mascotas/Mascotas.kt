package mascotas

// Interfaz para definir una acción
interface AccionMascota {
    fun hacerSonido()
    fun alimentarse()
}

// Clase abstracta base
abstract class Mascota {
    abstract val nombre: String
    abstract val color: String

    fun mostrarDatos() {
        println("Nombre: $nombre")
        println("Color: $color")
    }
}

// Clase Perro
class Perro : Mascota(), AccionMascota {
    override val nombre = "Perro"
    override val color = "Marrón"

    override fun hacerSonido() {
        println("El perro dice: Guau guau")
    }

    override fun alimentarse() {
        println("El perro come croquetas")
    }
}

// Clase Gato
class Gato : Mascota(), AccionMascota {
    override val nombre = "Gato"
    override val color = "Blanco"

    override fun hacerSonido() {
        println("El gato dice: Miau")
    }

    override fun alimentarse() {
        println("El gato come pescado")
    }
}

// Clase Loro
class Loro : Mascota(), AccionMascota {
    override val nombre = "Loro"
    override val color = "Verde"

    override fun hacerSonido() {
        println("El loro dice: Hola hola")
    }

    override fun alimentarse() {
        println("El loro come semillas")
    }
}

// Función para crear y mostrar mascotas
fun crearMascotas() {
    val perro = Perro()
    val gato = Gato()
    val loro = Loro()

    println("=== DATOS DE LAS MASCOTAS ===")
    perro.mostrarDatos()
    perro.hacerSonido()
    perro.alimentarse()
    println()

    gato.mostrarDatos()
    gato.hacerSonido()
    gato.alimentarse()
    println()

    loro.mostrarDatos()
    loro.hacerSonido()
    loro.alimentarse()
}