package de.dasbabypixel.gamelauncher.gles.es30

interface glGetActiveUniformBlockName {
    /**
    * Name
    * ----
    * 
    * glGetActiveUniformBlockName — retrieve the name of an active uniform block
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetActiveUniformBlockName**(` | GLuint program, |
    * | --- | --- |
    * |   | GLuint uniformBlockIndex, |
    * |   | GLsizei bufSize, |
    * |   | GLsizei \*length, |
    * |   | GLchar \*uniformBlockName`)`; |
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
    * _`bufSize`_
    * 
    * Specifies the size of the buffer addressed by _`uniformBlockName`_.
    * 
    * _`length`_
    * 
    * Specifies the address of a variable to receive the number of characters that were written to _`uniformBlockName`_.
    * 
    * _`uniformBlockName`_
    * 
    * Specifies the address an array of characters to receive the name of the uniform block at _`uniformBlockIndex`_.
    * 
    * Description
    * -----------
    * 
    * `glGetActiveUniformBlockName` retrieves the name of the active uniform block at _`uniformBlockIndex`_ within _`program`_.
    * 
    * _`program`_ must be the name of a program object for which the command [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have been called in the past, although it is not required that [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have succeeded. The link could have failed because the number of active uniforms exceeded the limit.
    * 
    * _`uniformBlockIndex`_ is an active uniform block index of _`program`_, and must be less than the value of `GL_ACTIVE_UNIFORM_BLOCKS`.
    * 
    * Upon success, the name of the uniform block identified by _`unifomBlockIndex`_ is returned into _`uniformBlockName`_. The name is nul-terminated. The actual number of characters written into _`uniformBlockName`_, excluding the nul terminator, is returned in _`length`_. If _`length`_ is `NULL`, no length is returned.
    * 
    * _`bufSize`_ contains the maximum number of characters (including the nul terminator) that will be written into _`uniformBlockName`_.
    * 
    * If an error occurs, nothing will be written to _`uniformBlockName`_ or _`length`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not the name of a program object for which [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] has been called in the past.
    * 
    * `GL_INVALID_VALUE` is generated if _`uniformBlockIndex`_ is greater than or equal to the value of `GL_ACTIVE_UNIFORM_BLOCKS` or is not the index of an active uniform block in _`program`_.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetActiveUniformBlockName | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetActiveUniformBlockiv][de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformBlockiv.glGetActiveUniformBlockiv], [glGetUniformBlockIndex][de.dasbabypixel.gamelauncher.gles.es30.glGetUniformBlockIndex.glGetUniformBlockIndex]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformBlockName.glGetActiveUniformBlockName
    */
    fun glGetActiveUniformBlockName(program: UInt, uniformBlockIndex: UInt, bufSize: UInt, length: java.nio.IntBuffer, uniformBlockName: String)
}