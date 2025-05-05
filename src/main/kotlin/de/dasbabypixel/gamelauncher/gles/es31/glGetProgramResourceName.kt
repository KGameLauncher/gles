package de.dasbabypixel.gamelauncher.gles.es31

interface glGetProgramResourceName {
    /**
    * Name
    * ----
    * 
    * glGetProgramResourceName — query the name of an indexed resource within a program
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetProgramResourceName**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum programInterface, |
    * |   | GLuint index, |
    * |   | GLsizei bufSize, |
    * |   | GLsizei \* length, |
    * |   | char \* name`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * The name of a program object whose resources to query.
    * 
    * _`programInterface`_
    * 
    * A token identifying the interface within _`program`_ containing the indexed resource.
    * 
    * _`index`_
    * 
    * The index of the resource within _`programInterface`_ of _`program`_.
    * 
    * _`bufSize`_
    * 
    * The size of the character array whose address is given by _`name`_.
    * 
    * _`length`_
    * 
    * The address of a variable which will receive the length of the resource name.
    * 
    * _`name`_
    * 
    * The address of a character array into which will be written the name of the resource.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramResourceName` retrieves the name string assigned to the single active resource with an index of _`index`_ in the interface _`programInterface`_ of program object _`program`_. _`index`_ must be less than the number of entries in the active resource list for _`programInterface`_.
    * 
    * _`program`_ must be the name of an existing program object. _`programInterface`_ is the name of the interface within _`program`_ which contains the resource and must be one of the following values:
    * 
    * `GL_UNIFORM`
    * 
    * The query is targeted at the set of active uniforms within _`program`_.
    * 
    * `GL_UNIFORM_BLOCK`
    * 
    * The query is targeted at the set of active uniform blocks within _`program`_.
    * 
    * `GL_PROGRAM_INPUT`
    * 
    * The query is targeted at the set of active input variables used by the first shader stage of _`program`_. If _`program`_ contains multiple shader stages then input variables from any stage other than the first will not be enumerated.
    * 
    * `GL_PROGRAM_OUTPUT`
    * 
    * The query is targeted at the set of active output variables produced by the last shader stage of _`program`_. If _`program`_ contains multiple shader stages then output variables from any stage other than the last will not be enumerated.
    * 
    * `GL_TRANSFORM_FEEDBACK_VARYING`
    * 
    * The query is targeted at the set of output variables from vertex stage of _`program`_ that would be captured if transform feedback were active.
    * 
    * `GL_BUFFER_VARIABLE`
    * 
    * The query is targeted at the set of active buffer variables used by _`program`_.
    * 
    * `GL_SHADER_STORAGE_BLOCK`
    * 
    * The query is targeted at the set of active shader storage blocks used by _`program`_.
    * 
    * The name string assigned to the active resource identified by _`index`_ is returned as a null-terminated string in the character array whose address is given in _`name`_. The actual number of characters written into _`name`_, excluding the null terminator, is returned in _`length`_. If _`length`_ is NULL, no length is returned. The maximum number of characters that may be written into _`name`_, including the null terminator, is specified by _`bufSize`_. If the length of the name string _including the null terminator_ is greater than _`bufSize`_, the first _`bufSize`_\-1 characters of the name string will be written to _`name`_, followed by a null terminator. If _`bufSize`_ is zero, no error will be generated but no characters will be written to _`name`_. The length of the longest name string for _`programInterface`_\>, including a null terminator, can be queried by calling [glGetProgramInterface][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramInterfaceiv.glGetProgramInterfaceiv] with a _`pname`_ of `GL_MAX_NAME_LENGTH`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`programInterface`_ is not one of the accepted interface types.
    * 
    * `GL_INVALID_VALUE` is generated if _`progam`_ is not the name of an existing program.
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to the number of entries in the active resource list for _`programInterface`_.
    * 
    * `GL_INVALID_ENUM` is generated if _`programInterface`_ is `GL_ATOMIC_COUNTER_BUFFER` or `GL_TRANSFORM_FEEDBACK_BUFFER`, since active atomic counter and transform feedback buffer resources are not assigned name strings.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetProgramResourceName` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramResourceIndex][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceIndex.glGetProgramResourceIndex], [glGetGetProgramResource](glGetGetProgramResource.xhtml), [glGetProgramResourceLocation][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceLocation.glGetProgramResourceLocation], [glGetProgramResourceLocationIndex](glGetProgramResourceLocationIndex.xhtml).
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceName.glGetProgramResourceName
    */
    fun glGetProgramResourceName(program: UInt, programInterface: Int, index: UInt, bufSize: UInt, length: java.nio.IntBuffer, name: String)
}