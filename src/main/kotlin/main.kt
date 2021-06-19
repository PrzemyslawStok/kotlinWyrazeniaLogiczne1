import java.util.*

enum class zmienna {
    ZERO, JEDEN, DWA
}

fun main() {
    val p: Set<zmienna> = setOf(zmienna.ZERO, zmienna.JEDEN)
    val q: Set<zmienna> = setOf(zmienna.ZERO, zmienna.JEDEN)
    val r: Set<zmienna> = setOf(zmienna.ZERO, zmienna.JEDEN,zmienna.DWA)

    println("p=$p")
    println("q=$q")

    wyswietlTablice(p, q, r)
}

fun wyswietlTablice(p: Set<zmienna>, q: Set<zmienna>, r: Set<zmienna>) {
    val iloscWierszy = p.size * q.size * r.size

    //proszę wypisać nagłówek i poprawną ilość wierszy wypełnionych zerami

    println("   p   |    q    |    r")

    for(i in 1..iloscWierszy)
        println("   0   |    0    |    0")

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
