package de.dasbabypixel.gamelauncher.gles.es31

interface glVertexAttribBinding {
    /**
    * Name
    * ----
    * 
    * glVertexAttribBinding — associate a vertex attribute and a vertex buffer binding
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glVertexAttribBinding**(` | GLuint attribindex, |
    * | --- | --- |
    * |   | GLuint bindingindex`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`attribindex`_
    * 
    * The index of the attribute to associate with a vertex buffer binding.
    * 
    * _`bindingindex`_
    * 
    * The index of the vertex buffer binding with which to associate the generic vertex attribute.
    * 
    * Description
    * -----------
    * 
    * `glVertexAttribBinding`, establishes an association between the generic vertex attribute whose index is given by _`attribindex`_ and a vertex buffer binding whose index is given by _`bindingindex`_. _`attribindex`_ must be less than the value of `GL_MAX_VERTEX_ATTRIBS` and _`bindingindex`_ must be less than the value of `GL_MAX_VERTEX_ATTRIB_BINDINGS`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`attribindex`_ is greater than or equal to the value of `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * `GL_INVALID_VALUE` is generated if _`bindingindex`_ is greater than or equal to the value of `GL_MAX_VERTEX_ATTRIB_BINDINGS`.
    * 
    * `GL_INVALID_OPERATION` is generated if no vertex array object is bound.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with arguments `GL_MAX_VERTEX_ATTRIB_BINDINGS`, `GL_VERTEX_BINDING_DIVISOR`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glVertexAttribBinding` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindVertexBuffer][de.dasbabypixel.gamelauncher.gles.es31.glBindVertexBuffer.glBindVertexBuffer], [glVertexAttribFormat][de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribFormat.glVertexAttribFormat], [glVertexBindingDivisor][de.dasbabypixel.gamelauncher.gles.es31.glVertexBindingDivisor.glVertexBindingDivisor], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribBinding.glVertexAttribBinding
    */
    fun glVertexAttribBinding(attribindex: UInt, bindingindex: UInt)
}