package test

import java.util.ArrayList

public class BadClass {
    fun foo() {
        val x: () -> Int = {
            bar(ArrayList<Int>())
            baz<Double, ArrayList<ArrayList>>(ArrayList())
        }
    }

    private fun <D> bar(f: List<D>) {}

    private fun <E : Number, F : MutableList<E>> baz(m: List<F>) {}
}
