package de.dasbabypixel.gamelauncher.gles.es20

interface glGenBuffers {
    /**
    * Name
    * ----
    * 
    * glGenBuffers — generate buffer object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenBuffers**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \* buffers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of buffer object names to be generated.
    * 
    * _`buffers`_
    * 
    * Specifies an array in which the generated buffer object names are stored.
    * 
    * Description
    * -----------
    * 
    * `glGenBuffers` returns _`n`_ buffer object names in _`buffers`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenBuffers`.
    * 
    * Buffer object names returned by a call to `glGenBuffers` are not returned by subsequent calls, unless they are first deleted with [glDeleteBuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers].
    * 
    * The names returned in _`buffers`_ are marked as used, for the purposes of `glGenBuffers` only, but they acquire state and type only when they are first bound by calling [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsBuffer][de.dasbabypixel.gamelauncher.gles.es20.glIsBuffer.glIsBuffer]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenBuffers | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glDeleteBuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers
    */
    fun glGenBuffers(n: UInt, buffers: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}