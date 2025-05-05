package de.dasbabypixel.gamelauncher.gles.es30

interface glBindVertexArray {
    /**
    * Name
    * ----
    * 
    * glBindVertexArray — bind a vertex array object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindVertexArray**(` | GLuint array`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`array`_
    * 
    * Specifies the name of the vertex array to bind.
    * 
    * Description
    * -----------
    * 
    * `glBindVertexArray` binds the vertex array object with name _`array`_. _`array`_ is the name of a vertex array object previously returned from a call to [glGenVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays], or zero to bind the default vertex array object binding.
    * 
    * If no vertex array object with name _`array`_ exists, one is created when _`array`_ is first bound. If the bind is successful no change is made to the state of the vertex array object, and any previous vertex array object binding is broken.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`array`_ is not zero or the name of a vertex array object previously returned from a call to [glGenVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays].
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindVertexArray | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glGenVertexArrays.glGenVertexArrays], [glDeleteVertexArrays][de.dasbabypixel.gamelauncher.gles.es30.glDeleteVertexArrays.glDeleteVertexArrays] [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer] [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glBindVertexArray.glBindVertexArray
    */
    fun glBindVertexArray(array: UInt)
}