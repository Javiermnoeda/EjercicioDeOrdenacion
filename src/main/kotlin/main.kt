import kotlin.random.Random

class AlumnoComparable(var Nombre : String, var Nota : Int) : Comparable<AlumnoComparable>{
    override fun compareTo(other: AlumnoComparable): Int {
        return Nota - other.Nota
    }

    override fun toString(): String {
        return "$Nombre y ha sacado un $Nota"
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

    val listaNumerosMenorMayor = listaNumerosAleatorios.sorted()
    val listaNumerosMayorMenor = listaNumerosAleatorios.sortedDescending()

    println("La lista de los numeros ordenados de menor a mayor es: $listaNumerosMenorMayor")
    println("La lista de los numeros ordenados de mayor a menor es: $listaNumerosMayorMenor")


    //PARTE 2
    repeat(100){
        val alumno = AlumnoComparable("Alumno ${it+1}", Nota = Random.nextInt(0,11))
        listaAlumnos.add(alumno)
    }

    //Ordenados por Nota
    println("\nLos alumnos ordenados por nota son")

    listaAlumnos.sort()
    listaAlumnos.forEach { println(it.toString()) }

    //Ordenados por Longitud de nombre
    println("\nLos alumnos ordenados por longitud de nombre son")

    listaAlumnos.sortByDescending { it.Nombre.length }
    listaAlumnos.forEach { println(it.toString()) }

    //Ordenados alfabéticamente
    println("\nLos alumnos ordenados alfabéticamente")

    listaAlumnos.sortBy {it.Nombre}
    listaAlumnos.forEach { println(it.toString()) }

}