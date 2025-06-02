package de.dasbabypixel.gamelauncher.gles.es31

interface glGetProgramResourceIndex {
    /**
    * Name
    * ----
    * 
    * glGetProgramResourceIndex — query the index of a named resource within a program
    * 
    * C Specification
    * ---------------
    * 
    * | `GLuint **glGetProgramResourceIndex**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum programInterface, |
    * |   | const char \* name`)`; |
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
    * A token identifying the interface within _`program`_ containing the resource named _`name`_.
    * 
    * _`name`_
    * 
    * The name of the resource to query the index of.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramResourceIndex` returns the unsigned integer index assigned to a resource named _`name`_ in the interface type _`programInterface`_ of program object _`program`_.
    * 
    * _`program`_ must be the name of an existing program object. _`programInterface`_ is the name of the interface within _`program`_ which contains the resource named _`name`_ and must be one of the following values:
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
    * The query is targeted at the set of output variables from the vertex stage of _`program`_ that would be captured if transform feedback were active.
    * 
    * `GL_BUFFER_VARIABLE`
    * 
    * The query is targeted at the set of active buffer variables used by _`program`_.
    * 
    * `GL_SHADER_STORAGE_BLOCK`
    * 
    * The query is targeted at the set of active shader storage blocks used by _`program`_.
    * 
    * If _`name`_ exactly matches the name string of one of the active resources for _`programInterface`_, the index of the matched resource is returned. Additionally, if _`name`_ would exactly match the name string of an active resource if "\[0\]" were appended to _`name`_, the index of the matched resource is returned. Otherwise, _`name`_ is considered not to be the name of an active resource, and `GL_INVALID_INDEX` is returned.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`programInterface`_ is not one of the accepted interface types.
    * 
    * `GL_INVALID_ENUM` is generated if _`programInterface`_ is `GL_ATOMIC_COUNTER_BUFFER` or `GL_TRANSFORM_FEEDBACK_BUFFER`, since active atomic counter and transform feedback buffer resources are not assigned name strings.
    * 
    * Although not an error, `GL_INVALID_INDEX` is returned if _`name`_ is not the name of a resource within the interface identified by _`programInterface`_.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetProgramResourceIndex` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramResourceName][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceName.glGetProgramResourceName], [glGetGetProgramResource](glGetGetProgramResource.xhtml), [glGetProgramResourceLocation][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceLocation.glGetProgramResourceLocation],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceIndex.glGetProgramResourceIndex
    */
    fun glGetProgramResourceIndex(program: UInt, programInterface: Int, name: String?): UInt
}