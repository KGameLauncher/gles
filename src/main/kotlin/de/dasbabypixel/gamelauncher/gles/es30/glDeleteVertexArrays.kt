package de.dasbabypixel.gamelauncher.gles.es30

interface glDeleteVertexArrays {
    /**
    * Name
    * ----
    * 
    * glDeleteVertexArrays — delete vertex array objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteVertexArrays**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLuint \*arrays`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of vertex array objects to be deleted.
    * 
    * _`arrays`_
    * 
    * Specifies the address of an array containing the _`n`_ names of the objects to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteVertexArrays` deletes _`n`_ vertex array objects whose names are stored in the array addressed by _`arrays`_. Once a vertex array object is deleted it has no contents and its name is again unused. If a vertex array object that is currently bound is deleted, the binding for that object reverts to zero and the default vertex array becomes current.
    * 
    * Unused names in _`arrays`_ that have been marked as used for the purposes of [glGenVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays], are marked as unused again. Unused names in _`arrays`_ are silently ignored, as is the value zero.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDeleteVertexArrays | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays], [glIsVertexArray][de.dasbabypixel.gamelauncher.gles.es30.glIsVertexArray.glIsVertexArray], [glBindVertexArray][de.dasbabypixel.gamelauncher.gles.es30.glBindVertexArray.glBindVertexArray]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDeleteVertexArrays.glDeleteVertexArrays
    */
    fun glDeleteVertexArrays(n: UInt, arrays: de.dasbabypixel.gamelauncher.buffers.IntBufferRO)
}