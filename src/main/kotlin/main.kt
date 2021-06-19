import java.util.*

enum class zmienna {
    ZERO, JEDEN
}

fun main() {
    val p: Set<zmienna> = setOf(zmienna.ZERO, zmienna.JEDEN)
    val q: Set<zmienna> = setOf(zmienna.ZERO, zmienna.JEDEN)
    val r: Set<zmienna> = setOf(zmienna.ZERO, zmienna.JEDEN)

    println("p=$p")
    println("q=$q")
}

fun wyswietlTablice(p: Set<zmienna>, q: Set<zmienna>, r: Set<zmienna>) {
    val iloscWierszy = p.size * q.size * r.size

    //proszę wypisać nagłówek i poprawną ilość wierszy wypełnionych zerami

}

fun petlePrzyklady() {
    for (i in 1..10) {
        println(i)
    }

    val array = Array(10) { i -> 1 + 2 * i }
    val strArray = Array(10) { i -> "pierwszy: ${i}" }

    array.forEach { println(it) }
    println(strArray.asList())
}
