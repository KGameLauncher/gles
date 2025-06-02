package de.dasbabypixel.gamelauncher.gles.es32

interface glDrawRangeElementsBaseVertex {
    /**
    * Name
    * ----
    * 
    * glDrawRangeElementsBaseVertex — render primitives from array data with a per-element offset
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawRangeElementsBaseVertex**(` | GLenum mode, |
    * | --- | --- |
    * |   | GLuint start, |
    * |   | GLuint end, |
    * |   | GLsizei count, |
    * |   | GLenum type, |
    * |   | void \*indices, |
    * |   | GLint basevertex`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`mode`_
    * 
    * Specifies what kind of primitives to render. Symbolic constants `GL_POINTS`, `GL_LINE_STRIP`, `GL_LINE_LOOP`, `GL_LINES`, `GL_TRIANGLE_STRIP`, `GL_TRIANGLE_FAN`, `GL_TRIANGLES`, `GL_LINES_ADJACENCY`, `GL_LINE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY`, `GL_TRIANGLE_STRIP_ADJACENCY` and `GL_PATCHES` are accepted.
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
    * Specifies the type of the values in indices. Must be one of `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT`, or `GL_UNSIGNED_INT`.
    * 
    * _`indices`_
    * 
    * Specifies a pointer to the location where the indices are stored.
    * 
    * _`basevertex`_
    * 
    * Specifies a constant that should be added to each element of _`indices`_ when chosing elements from the enabled vertex arrays.
    * 
    * Description
    * -----------
    * 
    * `glDrawRangeElementsBaseVertex` is a restricted form of [glDrawElementsBaseVertex][de.dasbabypixel.gamelauncher.gles.es32.glDrawElementsBaseVertex.glDrawElementsBaseVertex]. _`mode`_, _`count`_ and _`basevertex`_ match the corresponding arguments to [glDrawElementsBaseVertex][de.dasbabypixel.gamelauncher.gles.es32.glDrawElementsBaseVertex.glDrawElementsBaseVertex], with the additional constraint that all values in the array _`indices`_ must lie between _`start`_ and _`end`_, inclusive, prior to adding _`basevertex`_. Index values lying outside the range \[_`start`_, _`end`_\] are treated in the same way as [glDrawElementsBaseVertex][de.dasbabypixel.gamelauncher.gles.es32.glDrawElementsBaseVertex.glDrawElementsBaseVertex]. The _i_th element transferred by the corresponding draw call will be taken from element _`indices`_\[i\] + _`basevertex`_ of each enabled array. If the resulting value is larger than the maximum value representable by _`type`_, it is as if the calculation were upconverted to 32-bit unsigned integers (with wrapping on overflow conditions). The operation is undefined if the sum would be negative.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ is negative.
    * 
    * `GL_INVALID_VALUE` is generated if _`end`_ < _`start`_.
    * 
    * `GL_INVALID_OPERATION` is generated if a geometry shader is active and _`mode`_ is incompatible with the input primitive type of the geometry shader in the currently installed program object.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to an enabled array or the element array and the buffer object's data store is currently mapped.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glDrawRangeElementsBaseVertex` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawElementsBaseVertex][de.dasbabypixel.gamelauncher.gles.es32.glDrawElementsBaseVertex.glDrawElementsBaseVertex], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glDrawElementsInstancedBaseVertex][de.dasbabypixel.gamelauncher.gles.es32.glDrawElementsInstancedBaseVertex.glDrawElementsInstancedBaseVertex]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glDrawRangeElementsBaseVertex.glDrawRangeElementsBaseVertex
    */
    fun glDrawRangeElementsBaseVertex(mode: Int, start: UInt, end: UInt, count: UInt, type: Int, indices: java.nio.Buffer, basevertex: Int)
}