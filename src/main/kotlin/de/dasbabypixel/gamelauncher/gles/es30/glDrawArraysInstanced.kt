package de.dasbabypixel.gamelauncher.gles.es30

interface glDrawArraysInstanced {
    /**
    * Name
    * ----
    * 
    * glDrawArraysInstanced — draw multiple instances of a range of elements
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawArraysInstanced**(` | GLenum mode, |
    * | --- | --- |
    * |   | GLint first, |
    * |   | GLsizei count, |
    * |   | GLsizei primcount`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`mode`_
    * 
    * Specifies what kind of primitives to render. Symbolic constants `GL_POINTS`, `GL_LINE_STRIP`, `GL_LINE_LOOP`, `GL_LINES`, `GL_LINE_STRIP_ADJACENCY`, `GL_LINES_ADJACENCY`, `GL_TRIANGLE_STRIP`, `GL_TRIANGLE_FAN`, `GL_TRIANGLES`, `GL_TRIANGLE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY` and `GL_PATCHES` are accepted.
    * 
    * _`first`_
    * 
    * Specifies the starting index in the enabled arrays.
    * 
    * _`count`_
    * 
    * Specifies the number of indices to be rendered.
    * 
    * _`primcount`_
    * 
    * Specifies the number of instances of the specified range of indices to be rendered.
    * 
    * Description
    * -----------
    * 
    * `glDrawArraysInstanced` behaves identically to [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays] except that _`primcount`_ instances of the range of elements are executed. Those attributes that have divisor N where N is other than zero (as specified by [glVertexAttribDivisor][de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribDivisor.glVertexAttribDivisor]) advance once every N instances. Thus, the element transferred from instanced vertex attributes is given by:
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
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not one of the accepted values.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ or _`primcount`_ are negative.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to an enabled array and the buffer object's data store is currently mapped.
    * 
    * `GL_INVALID_FRAMEBUFFER_OPERATION` is generated if the currently bound framebuffer is not framebuffer complete (i.e. the return value from [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus] is not `GL_FRAMEBUFFER_COMPLETE`).
    * 
    * `GL_INVALID_OPERATION` is generated if recording the vertices of a primitive to the buffer objects being used for transform feedback purposes would result in either exceeding the limits of any buffer object’s size, or in exceeding the end position _`offset`_ + _`size`_ - 1, as set by [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
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
    * | glDrawArraysInstanced | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray] , [glVertexAttribDivisor][de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribDivisor.glVertexAttribDivisor]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced
    */
    fun glDrawArraysInstanced(mode: Int, first: Int, count: UInt, primcount: UInt)
}