package de.dasbabypixel.gamelauncher.gles.es31

interface glBindVertexBuffer {
    /**
    * Name
    * ----
    * 
    * glBindVertexBuffer — bind a buffer to a vertex buffer bind point
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindVertexBuffer**(` | GLuint bindingindex, |
    * | --- | --- |
    * |   | GLuint buffer, |
    * |   | GLintptr offset, |
    * |   | GLintptr stride`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`bindingindex`_
    * 
    * The index of the vertex buffer binding point to which to bind the buffer.
    * 
    * _`buffer`_
    * 
    * The name of an existing buffer to bind to the vertex buffer binding point.
    * 
    * _`offset`_
    * 
    * The offset of the first element of the buffer.
    * 
    * _`stride`_
    * 
    * The distance between elements within the buffer.
    * 
    * Description
    * -----------
    * 
    * `glBindVertexBuffer` binds the buffer named _`buffer`_ to the vertex buffer binding point whose index is given by _`bindingindex`_. _`offset`_ and _`stride`_ specify the offset of the first element within the buffer and the distance between elements within the buffer, respectively, and are both measured in basic machine units. _`bindingindex`_ must be less than the value of `GL_MAX_VERTEX_ATTRIB_BINDINGS`. _`offset`_ and _`stride`_ must be greater than or equal to zero. If _`buffer`_ is zero, then any buffer currently bound to the specified binding point is unbound.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`bindingindex`_ is greater than or equal to the value of `GL_MAX_VERTEX_ATTRIB_BINDINGS`.
    * 
    * `GL_INVALID_VALUE` is generated if _`offset`_ or _`stride`_ is less than zero.
    * 
    * `GL_INVALID_VALUE` is generated if _`buffer`_ is not the name of an existing buffer object.
    * 
    * `GL_INVALID_OPERATION` is generated if no vertex array object is bound.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VERTEX_ATTRIB_BINDINGS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glBindVertexBuffer` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glVertexAttribBinding][de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribBinding.glVertexAttribBinding], [glVertexAttribFormat][de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribFormat.glVertexAttribFormat], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer], [glVertexBindingDivisor][de.dasbabypixel.gamelauncher.gles.es31.glVertexBindingDivisor.glVertexBindingDivisor].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glBindVertexBuffer.glBindVertexBuffer
    */
    fun glBindVertexBuffer(bindingindex: UInt, buffer: UInt, offset: Long, stride: Long)
}