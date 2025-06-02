package de.dasbabypixel.gamelauncher.gles.es30

interface glGetUniformBlockIndex {
    /**
    * Name
    * ----
    * 
    * glGetUniformBlockIndex — retrieve the index of a named uniform block
    * 
    * C Specification
    * ---------------
    * 
    * | `GLuint **glGetUniformBlockIndex**(` | GLuint program, |
    * | --- | --- |
    * |   | const GLchar \*uniformBlockName`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the name of a program containing the uniform block.
    * 
    * _`uniformBlockName`_
    * 
    * Specifies the address an array of characters containing the name of the uniform block whose index to retrieve.
    * 
    * Description
    * -----------
    * 
    * `glGetUniformBlockIndex` retrieves the index of a uniform block within _`program`_.
    * 
    * _`program`_ must be the name of a program object for which the command [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have been called in the past, although it is not required that [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have succeeded. The link could have failed because the number of active uniforms exceeded the limit.
    * 
    * _`uniformBlockName`_ must contain a nul-terminated string specifying the name of the uniform block.
    * 
    * `glGetUniformBlockIndex` returns the uniform block index for the uniform block named _`uniformBlockName`_ of _`program`_. If _`uniformBlockName`_ does not identify an active uniform block of _`program`_, `glGetUniformBlockIndex` returns the special identifier, `GL_INVALID_INDEX`. Indices of the active uniform blocks of a program are assigned in consecutive order, beginning with zero.
    * 
    * Errors
    * ------
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
    * | glGetUniformBlockIndex | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetActiveUniformBlockName][de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformBlockName.glGetActiveUniformBlockName], [glGetActiveUniformBlockiv][de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformBlockiv.glGetActiveUniformBlockiv], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetUniformBlockIndex.glGetUniformBlockIndex
    */
    fun glGetUniformBlockIndex(program: UInt, uniformBlockName: String?): UInt
}