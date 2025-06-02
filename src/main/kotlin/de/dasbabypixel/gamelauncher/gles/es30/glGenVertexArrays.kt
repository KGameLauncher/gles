package de.dasbabypixel.gamelauncher.gles.es30

interface glGenVertexArrays {
    /**
    * Name
    * ----
    * 
    * glGenVertexArrays — generate vertex array object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenVertexArrays**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*arrays`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of vertex array object names to generate.
    * 
    * _`arrays`_
    * 
    * Specifies an array in which the generated vertex array object names are stored.
    * 
    * Description
    * -----------
    * 
    * `glGenVertexArrays` returns _`n`_ vertex array object names in _`arrays`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenVertexArrays`.
    * 
    * Vertex array object names returned by a call to `glGenVertexArrays` are not returned by subsequent calls, unless they are first deleted with [glDeleteVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glDeleteVertexArrays.glDeleteVertexArrays].
    * 
    * The names returned in _`arrays`_ are marked as used, for the purposes of `glGenVertexArrays` only, but they acquire state and type only when they are first bound.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsVertexArray][de.dasbabypixel.gamelauncher.gles.es30.glIsVertexArray.glIsVertexArray]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenVertexArrays | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindVertexArray][de.dasbabypixel.gamelauncher.gles.es30.glBindVertexArray.glBindVertexArray], [glDeleteVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glDeleteVertexArrays.glDeleteVertexArrays]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays
    */
    fun glGenVertexArrays(n: UInt, arrays: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}