package de.dasbabypixel.gamelauncher.gles.es30

interface glDrawRangeElements {
    /**
    * Name
    * ----
    * 
    * glDrawRangeElements — render primitives from array data
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawRangeElements**(` | GLenum mode, |
    * | --- | --- |
    * |   | GLuint start, |
    * |   | GLuint end, |
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
    * _`start`_
    * 
    * Specifies the minimum array index contained in _`indices`_.
    * 
    * _`end`_
    * 
    * Specifies the maximum array index contained in _`indices`_.
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
    * `glDrawRangeElements` is a restricted form of [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements]. _`mode`_, _`count`_, and _`type`_ match the corresponding arguments to [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], with the additional constraint that all values in the arrays _`count`_ must lie between _`start`_ and _`end`_, inclusive.
    * 
    * Implementations denote recommended maximum amounts of vertex and index data, which may be queried by calling [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_ELEMENTS_VERTICES` and `GL_MAX_ELEMENTS_INDICES`. If end \- start + 1 is greater than the value of `GL_MAX_ELEMENTS_VERTICES`, or if _`count`_ is greater than the value of `GL_MAX_ELEMENTS_INDICES`, then the call may operate at reduced performance. There is no requirement that all vertices in the range start end be referenced. However, the implementation may partially process unused vertices, reducing performance from what could be achieved with an optimal index set.
    * 
    * When `glDrawRangeElements` is called, it uses _`count`_ sequential elements from an enabled array, starting at _`start`_ to construct a sequence of geometric primitives. _`mode`_ specifies what kind of primitives are constructed, and how the array elements construct these primitives. If more than one array is enabled, each is used.
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
    * It is an error for indices to lie outside the range start end , but implementations may not check for this situation. Such indices cause implementation-dependent behavior.
    * 
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ is negative.
    * 
    * `GL_INVALID_VALUE` is generated if end < start .
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to an enabled array or the element array and the buffer object's data store is currently mapped.
    * 
    * `GL_INVALID_FRAMEBUFFER_OPERATION` is generated if the currently bound framebuffer is not framebuffer complete (i.e. the return value from [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus] is not `GL_FRAMEBUFFER_COMPLETE`).
    * 
    * `GL_INVALID_OPERATION` is generated if transform feedback is active and not paused.
    * 
    * `GL_INVALID_OPERATION` is generated if a geometry shader is active and _`mode`_ is incompatible with the input primitive type of the geometry shader in the currently installed program object.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_ELEMENTS_VERTICES`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_ELEMENTS_INDICES`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDrawRangeElements | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements
    */
    fun glDrawRangeElements(mode: Int, start: UInt, end: UInt, count: UInt, type: Int, indices: de.dasbabypixel.gamelauncher.buffers.BufferRO)
}