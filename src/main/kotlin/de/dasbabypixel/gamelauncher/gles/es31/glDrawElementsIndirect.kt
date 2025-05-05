package de.dasbabypixel.gamelauncher.gles.es31

interface glDrawElementsIndirect {
    /**
    * Name
    * ----
    * 
    * glDrawElementsIndirect — render indexed primitives from array data, taking parameters from memory
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawElementsIndirect**(` | GLenum mode, |
    * | --- | --- |
    * |   | GLenum type, |
    * |   | const void \*indirect`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`mode`_
    * 
    * Specifies what kind of primitives to render. Symbolic constants `GL_POINTS`, `GL_LINE_STRIP`, `GL_LINE_LOOP`, `GL_LINES`, `GL_LINE_STRIP_ADJACENCY`, `GL_LINES_ADJACENCY`, `GL_TRIANGLE_STRIP`, `GL_TRIANGLE_FAN`, `GL_TRIANGLES`, `GL_TRIANGLE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY`, and `GL_PATCHES` are accepted.
    * 
    * _`type`_
    * 
    * Specifies the type of data in the buffer bound to the `GL_ELEMENT_ARRAY_BUFFER` binding.
    * 
    * _`indirect`_
    * 
    * Specifies the address of a structure containing the draw parameters.
    * 
    * Description
    * -----------
    * 
    * `glDrawElementsIndirect` specifies multiple indexed geometric primitives with very few subroutine calls. `glDrawElementsIndirect` behaves similarly to [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], except that the parameters to [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced] are stored in memory at the address given by _`indirect`_ and the _i_th element transferred by the corresponding draw call will be taken from element _`indices`_\[i\] + _`baseVertex`_ of each enabled array. If the resulting value is larger than the maximum value representable by _`type`_, it is as if the calculation were upconverted to 32-bit unsigned integers (with wrapping on overflow conditions). The operation is undefined if the sum would be negative.It also supports the addition of a value baseVertex to each index.
    * 
    * The parameters addressed by _`indirect`_ are packed into a structure that takes the form (in C):
    * 
    *     typedef  struct {
    *         uint  count;
    *         uint  instanceCount;
    *         uint  firstIndex;
    *         int   baseVertex;
    *         uint  reservedMustBeZero;
    *     } DrawElementsIndirectCommand;
    * 
    * `glDrawElementsIndirect` is equivalent to:
    * 
    *     void glDrawElementsIndirect(GLenum mode, GLenum type, const void \* indirect)
    *     {
    *         const DrawElementsIndirectCommand \*cmd  = (const DrawElementsIndirectCommand \*)indirect;
    *         glDrawElementsInstancedBaseVertex(mode,
    *                                           cmd->count,
    *                                           type,
    *                                           cmd->firstIndex \* size-of-type,
    *                                           cmd->instanceCount,
    *                                           cmd->baseVertex);
    *     }
    * 
    * If a buffer is bound to the `GL_DRAW_INDIRECT_BUFFER` binding at the time of a call to `glDrawElementsIndirect`, _`indirect`_ is interpreted as an offset, in basic machine units, into that buffer and the parameter data is read from the buffer rather than from client memory.
    * 
    * Note that indices stored in client memory are not supported. If no buffer is bound to the `GL_ELEMENT_ARRAY_BUFFER` binding, an error will be generated.
    * 
    * The results of the operation are undefined if the `reservedMustBeZero` member of the parameter structure is non-zero. However, no error is generated in this case.
    * 
    * Vertex attributes that are modified by `glDrawElementsIndirect` have an unspecified value after `glDrawElementsIndirect` returns. Attributes that aren't modified remain well defined.
    * 
    * Notes
    * -----
    * 
    * `glDrawElementsInstancedBaseVertex` isn't actually present in OpenGL ES, but is used to describe this functionality.
    * 
    * `GL_LINE_STRIP_ADJACENCY`, `GL_LINES_ADJACENCY`, `GL_TRIANGLE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY` and `GL_PATCHES` are available only if the GL ES version is 3.2 or greater.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not an accepted value.
    * 
    * `GL_INVALID_OPERATION` is generated if zero is bound to the `GL_VERTEX_ARRAY_BINDING`, `GL_DRAW_INDIRECT_BUFFER`, or `GL_ELEMENT_ARRAY_BUFFER` binding, or to any enabled vertex array.
    * 
    * `GL_INVALID_OPERATION` is generated if the command would source data beyond the end of any bound buffer object.
    * 
    * `GL_INVALID_VALUE` is generated if _`indirect`_ is not a multiple of the size, in basic machine units, of `GLuint`.
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
    * | `glDrawElementsIndirect` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawArraysIndirect][de.dasbabypixel.gamelauncher.gles.es31.glDrawArraysIndirect.glDrawArraysIndirect], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2019 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glDrawElementsIndirect.glDrawElementsIndirect
    */
    fun glDrawElementsIndirect(mode: Int, type: Int, indirect: Long)
}