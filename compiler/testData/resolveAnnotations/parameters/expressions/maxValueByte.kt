package test

annotation class Ann(
        val p1: Byte,
        val p2: Byte,
        val p3: Int,
        val p4: Int,
        val p5: Byte
)

Ann(
    p1 = java.lang.Byte.MAX_VALUE + 1,
    p2 = 1 + 1,
    p3 = java.lang.Byte.MAX_VALUE + 1,
    p4 = 1.toByte() + 1.toByte(),
    p5 = 1.toByte() + 1.toByte()
) class MyClass

// EXPECTED: Ann[p1 = 128.toInt(): jet.Int, p2 = 2.toByte(): jet.Byte, p3 = 128.toInt(): jet.Int, p4 = 2.toInt(): jet.Int, p5 = 2.toByte(): jet.Byte]