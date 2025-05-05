package de.dasbabypixel.gamelauncher.gles.es31

interface glVertexBindingDivisor {
    /**
    * Name
    * ----
    * 
    * glVertexBindingDivisor — modify the rate at which generic vertex attributes advance
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glVertexBindingDivisor**(` | GLuint bindingindex, |
    * | --- | --- |
    * |   | GLuint divisor`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`bindingindex`_
    * 
    * The index of the binding whose divisor to modify.
    * 
    * _`divisor`_
    * 
    * The new value for the instance step rate to apply.
    * 
    * Description
    * -----------
    * 
    * `glVertexBindingDivisor`, modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives in a single draw command. If _`divisor`_ is zero, the attributes using the buffer bound to _`bindingindex`_ advance once per vertex. If _`divisor`_ is non-zero, the attributes advance once per _`divisor`_ instances of the set(s) of vertices being rendered. An attribute is referred to as _instanced_ if the corresponding _`divisor`_ value is non-zero.
    * 
    * Errors
    * ------
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
    * | `glVertexBindingDivisor` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindVertexBuffer][de.dasbabypixel.gamelauncher.gles.es31.glBindVertexBuffer.glBindVertexBuffer], [glVertexAttribBinding][de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribBinding.glVertexAttribBinding], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer], [glVertexBindingDivisor][de.dasbabypixel.gamelauncher.gles.es31.glVertexBindingDivisor.glVertexBindingDivisor], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glVertexBindingDivisor.glVertexBindingDivisor
    */
    fun glVertexBindingDivisor(bindingindex: UInt, divisor: UInt)
}