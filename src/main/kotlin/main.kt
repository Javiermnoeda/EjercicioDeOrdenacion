import kotlin.random.Random

class AlumnoComparable(var Nombre : String, var Nota : Int) : Comparable<AlumnoComparable>{
    override fun compareTo(other: AlumnoComparable): Int {
        return Nota - other.Nota
    }

    override fun toString(): String {
        return "$Nombre y ha sacado un $Nota de nota"
    }
}

val listaAlumnos = mutableListOf<AlumnoComparable>()

fun main() {

    //PARTE 1

    val listaNumerosAleatorios = mutableListOf<Int>()

    var numero = 0

    repeat(100){
        numero = (0..50).random()
        listaNumerosAleatorios.add(numero)
    }

    println("La lista ordenada de menor a mayor es: ${listaNumerosAleatorios.sorted()}")
    println("La lista ordenada de mayor a menor es: ${listaNumerosAleatorios.sortedDescending()}")

    val listaNumerosMenorMayor: MutableList<Int> = listaNumerosAleatorios.sorted() as MutableList<Int>
    val listaNumerosMayorMenor: MutableList<Int> = listaNumerosAleatorios.sortedDescending() as MutableList<Int>

    println("La lista de los numeros ordenados de menor a mayor es: $listaNumerosMenorMayor")
    println("La lista de los numeros ordenados de menor a mayor es: $listaNumerosMayorMenor")


    //PARTE 2

    repeat(100){
        val alumno = AlumnoComparable("Alumno $it", Nota = Random.nextInt(0,10))
        listaAlumnos.add(alumno)
    }

    listaAlumnos.sort()
    println("Los alumnos ordenados por nota son: $listaAlumnos")

    listaAlumnos.sortByDescending { it.Nombre.length }
    println("Los alumnos ordenados por longitud de nombre son: $listaAlumnos")

}