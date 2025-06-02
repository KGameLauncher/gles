package de.dasbabypixel.gamelauncher.gles.es32

interface DebugProc {
    /**
    * 
    * 
    * 
    */
    fun DebugProc(type: Int, id: UInt, severity: Int, length: UInt, message: String?, userParam: de.dasbabypixel.gamelauncher.buffers.BufferRO)
}