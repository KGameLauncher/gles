package de.dasbabypixel.gamelauncher.gles.es20

interface glDeleteBuffers {
    /**
    * Name
    * ----
    * 
    * glDeleteBuffers — delete named buffer objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteBuffers**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLuint \* buffers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of buffer objects to be deleted.
    * 
    * _`buffers`_
    * 
    * Specifies an array of buffer objects to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteBuffers` deletes _`n`_ buffer objects named by the elements of the array _`buffers`_. After a buffer object is deleted it has no contents, and its name is again unused. Unused names in _`buffers`_ that have been marked as used for the purposes of [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers] are marked as unused again. Unused names in buffers are silently ignored, as is the value zero. If a buffer object is deleted while it is bound, all bindings to that object in the current context are reset to zero. Bindings to that buffer in other contexts are not affected.
    * 
    * `glDeleteBuffers` silently ignores 0's and names that do not correspond to existing buffer objects.
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
    * | glDeleteBuffers | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers
    */
    fun glDeleteBuffers(n: UInt, buffers: java.nio.IntBuffer)
}