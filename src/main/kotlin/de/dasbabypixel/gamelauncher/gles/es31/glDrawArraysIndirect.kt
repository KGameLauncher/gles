package de.dasbabypixel.gamelauncher.gles.es31

interface glDrawArraysIndirect {
    /**
    * Name
    * ----
    * 
    * glDrawArraysIndirect — render primitives from array data, taking parameters from memory
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawArraysIndirect**(` | GLenum mode, |
    * | --- | --- |
    * |   | const void \*indirect`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`mode`_
    * 
    * Specifies what kind of primitives to render. Symbolic constants `GL_POINTS`, `GL_LINE_STRIP`, `GL_LINE_LOOP`, `GL_LINES`, `GL_LINE_STRIP_ADJACENCY`, `GL_LINES_ADJACENCY`, `GL_TRIANGLE_STRIP`, `GL_TRIANGLE_FAN`, `GL_TRIANGLES`, `GL_TRIANGLE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY` and `GL_PATCHES` are accepted.
    * 
    * _`indirect`_
    * 
    * Specifies the address of a structure containing the draw parameters.
    * 
    * Description
    * -----------
    * 
    * `glDrawArraysIndirect` specifies multiple geometric primitives with very few subroutine calls. `glDrawArraysIndirect` behaves similarly to [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], except that the parameters to [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced] are stored in memory at the address given by _`indirect`_.
    * 
    * The parameters addressed by _`indirect`_ are packed into a structure that takes the form (in C):
    * 
    *     typedef  struct {
    *         uint  count;
    *         uint  primCount;
    *         uint  first;
    *         uint  reserved;
    *     } DrawArraysIndirectCommand;
    * 
    *     const DrawArraysIndirectCommand  \*cmd  = (const DrawArraysIndirectCommand  \*)indirect;
    *     glDrawArraysInstanced(mode,  cmd->first,  cmd->count,  cmd->primCount);
    * 
    * If a buffer is bound to the `GL_DRAW_INDIRECT_BUFFER` binding at the time of a call to `glDrawArraysIndirect`, _`indirect`_ is interpreted as an offset, in basic machine units, into that buffer and the parameter data is read from the buffer rather than from client memory.
    * 
    * In contrast to [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], the `first` member of the parameter structure is unsigned, and out-of-range indices do not generate an error.
    * 
    * Vertex attributes that are modified by `glDrawArraysIndirect` have an unspecified value after `glDrawArraysIndirect` returns. Attributes that aren't modified remain well defined.
    * 
    * Notes
    * -----
    * 
    * The _`reserved`_ member of the _`DrawArraysIndirectCommand`_ structure should be set to zero. Behavior is undefined if it is non-zero.
    * 
    * `GL_LINE_STRIP_ADJACENCY`, `GL_LINES_ADJACENCY`, `GL_TRIANGLE_STRIP_ADJACENCY`, `GL_TRIANGLES_ADJACENCY` and `GL_PATCHES` are available only if the GL ES version is 3.2 or greater.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not an accepted value.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to an enabled array or to the `GL_DRAW_INDIRECT_BUFFER` binding and the buffer object's data store is currently mapped.
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
    * | `glDrawArraysIndirect` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glDrawArraysIndirect.glDrawArraysIndirect
    */
    fun glDrawArraysIndirect(mode: Int, indirect: Long)
}