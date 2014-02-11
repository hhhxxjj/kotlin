package kotlin

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import java.util.*

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun <T> Array<out T>.partition(predicate: (T) -> Boolean) : Pair<List<T>, List<T>> {
    val first = ArrayList<T>()
    val second = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun BooleanArray.partition(predicate: (Boolean) -> Boolean) : Pair<List<Boolean>, List<Boolean>> {
    val first = ArrayList<Boolean>()
    val second = ArrayList<Boolean>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun ByteArray.partition(predicate: (Byte) -> Boolean) : Pair<List<Byte>, List<Byte>> {
    val first = ArrayList<Byte>()
    val second = ArrayList<Byte>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun CharArray.partition(predicate: (Char) -> Boolean) : Pair<List<Char>, List<Char>> {
    val first = ArrayList<Char>()
    val second = ArrayList<Char>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun DoubleArray.partition(predicate: (Double) -> Boolean) : Pair<List<Double>, List<Double>> {
    val first = ArrayList<Double>()
    val second = ArrayList<Double>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun FloatArray.partition(predicate: (Float) -> Boolean) : Pair<List<Float>, List<Float>> {
    val first = ArrayList<Float>()
    val second = ArrayList<Float>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun IntArray.partition(predicate: (Int) -> Boolean) : Pair<List<Int>, List<Int>> {
    val first = ArrayList<Int>()
    val second = ArrayList<Int>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun LongArray.partition(predicate: (Long) -> Boolean) : Pair<List<Long>, List<Long>> {
    val first = ArrayList<Long>()
    val second = ArrayList<Long>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun ShortArray.partition(predicate: (Short) -> Boolean) : Pair<List<Short>, List<Short>> {
    val first = ArrayList<Short>()
    val second = ArrayList<Short>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun <T> Iterable<T>.partition(predicate: (T) -> Boolean) : Pair<List<T>, List<T>> {
    val first = ArrayList<T>()
    val second = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public fun <T> Stream<T>.partition(predicate: (T) -> Boolean) : Pair<List<T>, List<T>> {
    val first = ArrayList<T>()
    val second = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Array<out T>.plus(array: Array<T>) : List<T> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun BooleanArray.plus(array: Array<Boolean>) : List<Boolean> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ByteArray.plus(array: Array<Byte>) : List<Byte> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun CharArray.plus(array: Array<Char>) : List<Char> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun DoubleArray.plus(array: Array<Double>) : List<Double> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun FloatArray.plus(array: Array<Float>) : List<Float> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun IntArray.plus(array: Array<Int>) : List<Int> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun LongArray.plus(array: Array<Long>) : List<Long> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ShortArray.plus(array: Array<Short>) : List<Short> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Iterable<T>.plus(array: Array<T>) : List<T> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Array<out T>.plus(collection: Iterable<T>) : List<T> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun BooleanArray.plus(collection: Iterable<Boolean>) : List<Boolean> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ByteArray.plus(collection: Iterable<Byte>) : List<Byte> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun CharArray.plus(collection: Iterable<Char>) : List<Char> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun DoubleArray.plus(collection: Iterable<Double>) : List<Double> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun FloatArray.plus(collection: Iterable<Float>) : List<Float> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun IntArray.plus(collection: Iterable<Int>) : List<Int> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun LongArray.plus(collection: Iterable<Long>) : List<Long> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ShortArray.plus(collection: Iterable<Short>) : List<Short> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Iterable<T>.plus(collection: Iterable<T>) : List<T> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun <T> Array<out T>.plus(element: T) : List<T> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun BooleanArray.plus(element: Boolean) : List<Boolean> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun ByteArray.plus(element: Byte) : List<Byte> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun CharArray.plus(element: Char) : List<Char> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun DoubleArray.plus(element: Double) : List<Double> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun FloatArray.plus(element: Float) : List<Float> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun IntArray.plus(element: Int) : List<Int> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun LongArray.plus(element: Long) : List<Long> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun ShortArray.plus(element: Short) : List<Short> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun <T> Iterable<T>.plus(element: T) : List<T> {
    val answer = toArrayList()
    answer.add(element)
    return answer
    
}

/**
 * Returns a stream containing all elements of original stream and then the given element
 */
public fun <T> Stream<T>.plus(element: T) : Stream<T> {
    val answer = toArrayList()
    answer.add(element)
    return answer.stream()
    
}

/**
 * Returns a stream containing all elements of original stream and then all elements of the given *stream*
 */
public fun <T> Stream<T>.plus(stream: Stream<T>) : Stream<T> {
    val answer = toArrayList()
    answer.addAll(stream)
    return answer.stream()
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Array<out T>.zip(array: Array<R>) : List<Pair<T,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<T,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> BooleanArray.zip(array: Array<R>) : List<Pair<Boolean,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Boolean,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ByteArray.zip(array: Array<R>) : List<Pair<Byte,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Byte,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> CharArray.zip(array: Array<R>) : List<Pair<Char,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Char,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> DoubleArray.zip(array: Array<R>) : List<Pair<Double,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Double,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> FloatArray.zip(array: Array<R>) : List<Pair<Float,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Float,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> IntArray.zip(array: Array<R>) : List<Pair<Int,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Int,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> LongArray.zip(array: Array<R>) : List<Pair<Long,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Long,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ShortArray.zip(array: Array<R>) : List<Pair<Short,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<Short,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Iterable<T>.zip(array: Array<R>) : List<Pair<T,R>> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<Pair<T,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Array<out T>.zip(collection: Iterable<R>) : List<Pair<T,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<T,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> BooleanArray.zip(collection: Iterable<R>) : List<Pair<Boolean,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Boolean,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ByteArray.zip(collection: Iterable<R>) : List<Pair<Byte,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Byte,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> CharArray.zip(collection: Iterable<R>) : List<Pair<Char,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Char,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> DoubleArray.zip(collection: Iterable<R>) : List<Pair<Double,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Double,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> FloatArray.zip(collection: Iterable<R>) : List<Pair<Float,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Float,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> IntArray.zip(collection: Iterable<R>) : List<Pair<Int,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Int,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> LongArray.zip(collection: Iterable<R>) : List<Pair<Long,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Long,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ShortArray.zip(collection: Iterable<R>) : List<Pair<Short,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<Short,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Iterable<T>.zip(collection: Iterable<R>) : List<Pair<T,R>> {
    val first = iterator()
    val second = collection.iterator()
    val list = ArrayList<Pair<T,R>>()
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
    
}

/**
 * Returns a stream of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
/*
public fun <T, R> Stream<T>.zip(stream: Stream<R>) : Stream<Pair<T,R>> {
    return ZippingStream(this, stream)
    
}
*/

