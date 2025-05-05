package de.dasbabypixel.gamelauncher.gles.es20

interface glIsBuffer {
    /**
    * Name
    * ----
    * 
    * glIsBuffer — determine if a name corresponds to a buffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsBuffer**(` | GLuint buffer`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`buffer`_
    * 
    * Specifies a value that may be the name of a buffer object.
    * 
    * Description
    * -----------
    * 
    * `glIsBuffer` returns `GL_TRUE` if _`buffer`_ is currently the name of a buffer object. If _`buffer`_ is zero, or is a non-zero value that is not currently the name of a buffer object, or if an error occurs, `glIsBuffer` returns `GL_FALSE`.
    * 
    * A name returned by [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers], but not yet associated with a buffer object by calling [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], is not the name of a buffer object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsBuffer | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glDeleteBuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers], [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glIsBuffer.glIsBuffer
    */
    fun glIsBuffer(buffer: UInt): Boolean
}