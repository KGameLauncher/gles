package de.dasbabypixel.gamelauncher.gles.es30

interface glGetActiveUniformBlockiv {
    /**
    * Name
    * ----
    * 
    * glGetActiveUniformBlockiv — query information about an active uniform block
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetActiveUniformBlockiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLuint uniformBlockIndex, |
    * |   | GLenum pname, |
    * |   | GLint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the name of a program containing the uniform block.
    * 
    * _`uniformBlockIndex`_
    * 
    * Specifies the index of the uniform block within _`program`_.
    * 
    * _`pname`_
    * 
    * Specifies the name of the parameter to query.
    * 
    * _`params`_
    * 
    * Specifies the address of a variable to receive the result of the query.
    * 
    * Description
    * -----------
    * 
    * `glGetActiveUniformBlockiv` retrieves information about an active uniform block within _`program`_.
    * 
    * _`program`_ must be the name of a program object for which the command [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have been called in the past, although it is not required that [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have succeeded. The link could have failed because the number of active uniforms exceeded the limit.
    * 
    * _`uniformBlockIndex`_ is an active uniform block index of _`program`_, and must be less than the value of `GL_ACTIVE_UNIFORM_BLOCKS`.
    * 
    * Upon success, the uniform block parameter(s) specified by _`pname`_ are returned in _`params`_. If an error occurs, nothing will be written to _`params`_.
    * 
    * If _`pname`_ is `GL_UNIFORM_BLOCK_BINDING`, then the index of the uniform buffer binding point last selected by the uniform block specified by _`uniformBlockIndex`_ for _`program`_ is returned. If no uniform block has been previously specified, zero is returned.
    * 
    * If _`pname`_ is `GL_UNIFORM_BLOCK_DATA_SIZE`, then the implementation-dependent minimum total buffer object size, in basic machine units, required to hold all active uniforms in the uniform block identified by _`uniformBlockIndex`_ is returned. It is neither guaranteed nor expected that a given implementation will arrange uniform values as tightly packed in a buffer object. The exception to this is the _std140 uniform block layout_, which guarantees specific packing behavior and does not require the application to query for offsets and strides. In this case the minimum size may still be queried, even though it is determined in advance based only on the uniform block declaration.
    * 
    * If _`pname`_ is `GL_UNIFORM_BLOCK_NAME_LENGTH`, then the total length (including the nul terminator) of the name of the uniform block identified by _`uniformBlockIndex`_ is returned.
    * 
    * If _`pname`_ is `GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS`, then the number of active uniforms in the uniform block identified by _`uniformBlockIndex`_ is returned.
    * 
    * If _`pname`_ is `GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES`, then a list of the active uniform indices for the uniform block identified by _`uniformBlockIndex`_ is returned. The number of elements that will be written to _`params`_ is the value of `GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS` for _`uniformBlockIndex`_.
    * 
    * If _`pname`_ is `GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER`, or `GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER`, then a boolean value indicating whether the uniform block identified by _`uniformBlockIndex`_ is referenced by the vertex or fragment programming stages of program, respectively, is returned.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`uniformBlockIndex`_ is greater than or equal to the value of `GL_ACTIVE_UNIFORM_BLOCKS` or is not the index of an active uniform block in _`program`_.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not the name of a program object for which [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] has been called in the past.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetActiveUniformBlockiv | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetActiveUniformBlockName][de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformBlockName.glGetActiveUniformBlockName], [glGetUniformBlockIndex][de.dasbabypixel.gamelauncher.gles.es30.glGetUniformBlockIndex.glGetUniformBlockIndex], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformBlockiv.glGetActiveUniformBlockiv
    */
    fun glGetActiveUniformBlockiv(program: UInt, uniformBlockIndex: UInt, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}