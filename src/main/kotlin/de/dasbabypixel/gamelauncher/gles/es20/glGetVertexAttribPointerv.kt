package de.dasbabypixel.gamelauncher.gles.es20

interface glGetVertexAttribPointerv {
    /**
    * Name
    * ----
    * 
    * glGetVertexAttribPointerv — return the address of the specified generic vertex attribute pointer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetVertexAttribPointerv**(` | GLuint index, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | void \*\*pointer`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`index`_
    * 
    * Specifies the generic vertex attribute parameter to be returned.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of the generic vertex attribute parameter to be returned. Must be `GL_VERTEX_ATTRIB_ARRAY_POINTER`.
    * 
    * _`pointer`_
    * 
    * Returns the pointer value.
    * 
    * Description
    * -----------
    * 
    * `glGetVertexAttribPointerv` returns pointer information. _`index`_ is the generic vertex attribute to be queried, _`pname`_ is a symbolic constant indicating the pointer to be returned, and _`params`_ is a pointer to a location in which to place the returned data.
    * 
    * The _`pointer`_ returned is a byte offset into the data store of the buffer object that was bound to the `GL_ARRAY_BUFFER` target (see [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer]) when the desired pointer was previously specified.
    * 
    * Notes
    * -----
    * 
    * The state returned is retrieved from the currently bound vertex array object. If the zero object is bound, the value is queried from client state.
    * 
    * The initial value for each pointer is 0.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VERTEX_ATTRIBS`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetVertexAttribPointerv | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribPointerv.glGetVertexAttribPointerv
    */
    fun glGetVertexAttribPointerv(index: UInt, pname: Int, pointer: java.nio.ByteBuffer)
}