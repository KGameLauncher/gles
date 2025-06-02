package de.dasbabypixel.gamelauncher.gles

interface PointerBuffer {
    val size: UInt
    val position: UInt
    val remaining: UInt
    
    fun get(): Long
    fun get(index: UInt): Long
    
    fun put(p: Long): PointerBuffer
    fun put(index: UInt, p: Long): PointerBuffer
    
    fun getByteBuffer(index: UInt, capacity: UInt): java.nio.ByteBuffer
    fun getShortBuffer(index: UInt, capacity: UInt): java.nio.ShortBuffer
    fun getIntBuffer(index: UInt, capacity: UInt): java.nio.IntBuffer
    fun getLongBuffer(index: UInt, capacity: UInt): java.nio.LongBuffer
    fun getFloatBuffer(index: UInt, capacity: UInt): java.nio.FloatBuffer
    fun getDoubleBuffer(index: UInt, capacity: UInt): java.nio.DoubleBuffer
    fun getPointerBuffer(index: UInt, capacity: UInt): PointerBuffer
    
    fun getByteBuffer(capacity: UInt): java.nio.ByteBuffer
    fun getShortBuffer(capacity: UInt): java.nio.ShortBuffer
    fun getIntBuffer(capacity: UInt): java.nio.IntBuffer
    fun getLongBuffer(capacity: UInt): java.nio.LongBuffer
    fun getFloatBuffer(capacity: UInt): java.nio.FloatBuffer
    fun getDoubleBuffer(capacity: UInt): java.nio.DoubleBuffer
    fun getPointerBuffer(capacity: UInt): PointerBuffer
    
    fun put(index: UInt, buffer: java.nio.Buffer): PointerBuffer
    fun put(index: UInt, buffer: PointerBuffer): PointerBuffer
    
    fun put(buffer: java.nio.Buffer)
    fun put(buffer: PointerBuffer)
}