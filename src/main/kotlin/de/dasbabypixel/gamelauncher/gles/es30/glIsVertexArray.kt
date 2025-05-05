package de.dasbabypixel.gamelauncher.gles.es30

interface glIsVertexArray {
    /**
    * Name
    * ----
    * 
    * glIsVertexArray — determine if a name corresponds to a vertex array object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsVertexArray**(` | GLuint array`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`array`_
    * 
    * Specifies a value that may be the name of a vertex array object.
    * 
    * Description
    * -----------
    * 
    * `glIsVertexArray` returns `GL_TRUE` if _`array`_ is currently the name of a vertex array object. If _`array`_ is zero, or if _`array`_ is not the name of a vertex array object, or if an error occurs, `glIsVertexArray` returns `GL_FALSE`. If _`array`_ is a name returned by [glGenVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays], by that has not yet been bound through a call to [glBindVertexArray][de.dasbabypixel.gamelauncher.gles.es30.glBindVertexArray.glBindVertexArray], then the name is not a vertex array object and `glIsVertexArray` returns `GL_FALSE`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsVertexArray | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays], [glBindVertexArray][de.dasbabypixel.gamelauncher.gles.es30.glBindVertexArray.glBindVertexArray], [glDeleteVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glDeleteVertexArrays.glDeleteVertexArrays]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glIsVertexArray.glIsVertexArray
    */
    fun glIsVertexArray(array: UInt): Boolean
}