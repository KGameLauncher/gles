package de.dasbabypixel.gamelauncher.gles.es20

interface glDrawArrays {
    /**
    * Name
    * ----
    * 
    * glDrawArrays — render primitives from array data
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawArrays**(` | GLenum mode, |
    * | --- | --- |
    * |   | GLint first, |
    * |   | GLsizei count`)`; |
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
    * Description
    * -----------
    * 
    * `glDrawArrays` specifies multiple geometric primitives with very few subroutine calls. It is possible to prespecify separate arrays of attributes and use them to construct a sequence of primitives with a single call to `glDrawArrays`.
    * 
    * When `glDrawArrays` is called, it uses _`count`_ sequential elements from each enabled array to construct a sequence of geometric primitives, beginning with element _`first`_. _`mode`_ specifies what kind of primitives are constructed and how the array elements construct those primitives.
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
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ is negative.
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
    * | glDrawArrays | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays
    */
    fun glDrawArrays(mode: Int, first: Int, count: UInt)
}