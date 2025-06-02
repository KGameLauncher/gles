package de.dasbabypixel.gamelauncher.gles.es20

interface glDrawElements {
    /**
    * Name
    * ----
    * 
    * glDrawElements — render primitives from array data
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawElements**(` | GLenum mode, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLenum type, |
    * |   | const void \* indices`)`; |
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
    * Description
    * -----------
    * 
    * `glDrawElements` specifies multiple geometric primitives with very few subroutine calls. It is possible to prespecify separate arrays of attributes and use them to construct a sequence of primitives with a single call to `glDrawElements`.
    * 
    * When `glDrawElements` is called, it uses _`count`_ sequential elements from an enabled array, starting at _`indices`_ to construct a sequence of geometric primitives. _`mode`_ specifies what kind of primitives are constructed and how the array elements construct these primitives. If more than one array is enabled, each is used.
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
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to an enabled array or the element array and the buffer object's data store is currently mapped.
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
    * | glDrawElements | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements
    */
    fun glDrawElements(mode: Int, count: UInt, type: Int, indices: de.dasbabypixel.gamelauncher.buffers.BufferRO)
}