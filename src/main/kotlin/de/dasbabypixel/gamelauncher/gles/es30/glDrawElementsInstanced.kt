package de.dasbabypixel.gamelauncher.gles.es30

interface glDrawElementsInstanced {
    /**
    * Name
    * ----
    * 
    * glDrawElementsInstanced — draw multiple instances of a set of elements
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawElementsInstanced**(` | GLenum mode, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLenum type, |
    * |   | const void \* indices, |
    * |   | GLsizei primcount`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`mode`_
    * 
    * Specifies what kind of primitives to render. Symbolic constants `GL_POINTS`, `GL_LINE_STRIP`, `GL_LINE_LOOP`, `GL_LINES`, `GL_LINE_STRIP_ADJACENCY`, `GL_LINES_ADJACENCY`, `GL_TRIANGLE_STRIP`, `GL_TRIANGLE_FAN`, `GL_TRIANGLES`, `GL_TRIANGLE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY` and `GL_PATCHES` are accepted.
    * 
    * _`count`_
    * 
    * Specifies the number of elements to be rendered.
    * 
    * _`type`_
    * 
    * Specifies the type of the values in _`indices`_. Must be one of `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT`, or `GL_UNSIGNED_INT`.
    * 
    * _`indices`_
    * 
    * Specifies a byte offset (cast to a pointer type) into the buffer bound to `GL_ELEMENT_ARRAY_BUFFER` to start reading indices from. If no buffer is bound, specifies a pointer to the location where the indices are stored.
    * 
    * _`primcount`_
    * 
    * Specifies the number of instances of the specified range of indices to be rendered.
    * 
    * Description
    * -----------
    * 
    * `glDrawElementsInstanced` behaves identically to [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements] except that _`primcount`_ instances of the set of elements are executed. Those attributes that have divisor N where N is other than zero (as specified by [glVertexAttribDivisor][de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribDivisor.glVertexAttribDivisor]) advance once every N instances. Thus, the element transferred from instanced vertex attributes is given by:
    * 
    * instance divisor
    * 
    * The value of _`instance`_ may be read by a vertex shader as `gl_InstanceID`.
    * 
    * To enable and disable a generic vertex attribute array, call [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray] and [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray].
    * 
    * If an array corresponding to a generic attribute required by a vertex shader is not enabled, then the corresponding element is taken from the current generic attribute state.
    * 
    * Notes
    * -----
    * 
    * `GL_LINE_STRIP_ADJACENCY`, `GL_LINES_ADJACENCY`, `GL_TRIANGLE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY` and `GL_PATCHES` are available only if the GL ES version is 3.2 or greater.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ or _`primcount`_ are negative.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to an enabled array and the buffer object's data store is currently mapped.
    * 
    * `GL_INVALID_FRAMEBUFFER_OPERATION` is generated if the currently bound framebuffer is not framebuffer complete (i.e. the return value from [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus] is not `GL_FRAMEBUFFER_COMPLETE`).
    * 
    * `GL_INVALID_OPERATION` is generated if transform feedback is active and not paused.
    * 
    * `GL_INVALID_OPERATION` is generated if a geometry shader is active and _`mode`_ is incompatible with the input primitive type of the geometry shader in the currently installed program object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDrawElementsInstanced | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glVertexAttribDivisor][de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribDivisor.glVertexAttribDivisor]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced
    */
    fun glDrawElementsInstanced(mode: Int, count: UInt, type: Int, indices: java.nio.Buffer, primcount: UInt)
}