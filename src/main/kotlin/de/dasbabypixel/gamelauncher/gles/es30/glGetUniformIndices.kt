package de.dasbabypixel.gamelauncher.gles.es30

interface glGetUniformIndices {
    /**
    * Name
    * ----
    * 
    * glGetUniformIndices — retrieve the index of a named uniform block
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetUniformIndices**(` | GLuint program, |
    * | --- | --- |
    * |   | GLsizei uniformCount, |
    * |   | const GLchar \*\*uniformNames, |
    * |   | GLuint \*uniformIndices`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the name of a program containing uniforms whose indices to query.
    * 
    * _`uniformCount`_
    * 
    * Specifies the number of uniforms whose indices to query.
    * 
    * _`uniformNames`_
    * 
    * Specifies the address of an array of pointers to buffers containing the names of the queried uniforms.
    * 
    * _`uniformIndices`_
    * 
    * Specifies the address of an array that will receive the indices of the uniforms.
    * 
    * Description
    * -----------
    * 
    * `glGetUniformIndices` retrieves the indices of a number of uniforms within _`program`_.
    * 
    * _`program`_ must be the name of a program object for which the command [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have been called in the past, although it is not required that [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] must have succeeded. The link could have failed because the number of active uniforms exceeded the limit.
    * 
    * _`uniformCount`_ indicates both the number of elements in the array of names _`uniformNames`_ and the number of indices that may be written to _`uniformIndices`_.
    * 
    * _`uniformNames`_ contains a list of _`uniformCount`_ nul-terminated name strings identifying the uniform names to be queried for indices. For each name string in _`uniformNames`_, the index assigned to the active uniform of that name will be written to the corresponding element of _`uniformIndices`_. If a string in _`uniformNames`_ is not the name of an active uniform, the special value `GL_INVALID_INDEX` will be written to the corresponding element of _`uniformIndices`_.
    * 
    * If an error occurs, nothing is written to _`uniformIndices`_.
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
    * | glGetUniformIndices | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform], [glGetActiveUniformsiv][de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformsiv.glGetActiveUniformsiv], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetUniformIndices.glGetUniformIndices
    */
    fun glGetUniformIndices(program: UInt, uniformCount: UInt, uniformNames: Array<String>, uniformIndices: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}