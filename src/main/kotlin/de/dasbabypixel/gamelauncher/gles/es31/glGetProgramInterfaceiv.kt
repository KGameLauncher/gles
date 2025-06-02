package de.dasbabypixel.gamelauncher.gles.es31

interface glGetProgramInterfaceiv {
    /**
    * Name
    * ----
    * 
    * glGetProgramInterface — query a property of an interface in a program
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetProgramInterfaceiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum programInterface, |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * The name of a program object whose interface to query.
    * 
    * _`programInterface`_
    * 
    * A token identifying the interface within _`program`_ to query.
    * 
    * _`pname`_
    * 
    * The name of the parameter within _`programInterface`_ to query.
    * 
    * _`params`_
    * 
    * The address of a variable to retrieve the value of _`pname`_ for the program interface.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramInterfaceiv` queries the property of the interface identifed by _`programInterface`_ in _`program`_, the property name of which is given by _`pname`_.
    * 
    * _`program`_ must be the name of an existing program object. _`programInterface`_ is the name of the interface within _`program`_ to query and must be one of the following values:
    * 
    * `GL_UNIFORM`
    * 
    * The query is targeted at the set of active uniforms within _`program`_.
    * 
    * `GL_UNIFORM_BLOCK`
    * 
    * The query is targeted at the set of active uniform blocks within _`program`_.
    * 
    * `GL_ATOMIC_COUNTER_BUFFER`
    * 
    * The query is targeted at the set of active atomic counter buffer binding points within _`program`_.
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
    * The query is targeted at the set of output variables from the last non-fragment stage of _`program`_ that would be captured if transform feedback were active.
    * 
    * `GL_BUFFER_VARIABLE`
    * 
    * The query is targeted at the set of active buffer variables used by _`program`_.
    * 
    * `GL_SHADER_STORAGE_BLOCK`
    * 
    * The query is targeted at the set of active shader storage blocks used by _`program`_.
    * 
    * `GL_TRANSFORM_FEEDBACK_BUFFER`
    * 
    * The query is targeted at the set of active buffer binding points to which output variables in the `GL_TRANSFORM_FEEDBACK_VARYING` interface are written.
    * 
    * _`pname`_ identifies the property of _`programInterface`_ to return in _`params`_.
    * 
    * If _`pname`_ is `GL_ACTIVE_RESOURCES`, the value returned is the number of resources in the active resource list for _`programInterface`_. If the list of active resources for _`programInterface`_ is empty, zero is returned.
    * 
    * If _`pname`_ is `GL_MAX_NAME_LENGTH`, the value returned is the length of the longest active name string for an active resource in _`programInterface`_. This length includes an extra character for the null terminator. If the list of active resources for _`programInterface`_ is empty, zero is returned. It is an error to specify `GL_MAX_NAME_LENGTH` when _`programInterface`_ is `GL_ATOMIC_COUNTER_BUFFER`, as active atomic counter buffer resources are not assigned name strings.
    * 
    * If _`pname`_ is `GL_MAX_NUM_ACTIVE_VARIABLES`, the value returned is the number of active variables belonging to the interface block or atomic counter buffer resource in _`programInterface`_ with the most active variables. If the list of active resources for _`programInterface`_ is empty, zero is returned. When _`pname`_ is `GL_MAX_NUM_ACTIVE_VARIABLES`, _`programInterface`_ must be `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, or `GL_SHADER_STORAGE_BLOCK`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`identifier`_ is not one of the accepted object types.
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not the name of an existing program object.
    * 
    * `GL_INVALID_OPERATION` is generated if _`pname`_ is `GL_MAX_NAME_LENGTH` and _`programInterface`_ is `GL_ATOMIC_COUNTER_BUFFER` or `GL_TRANSFORM_FEEDBACK_BUFFER`, since active atomic counter and transform feedback buffer resources are not assigned name strings.
    * 
    * `GL_INVALID_OPERATION` error is generated if _`pname`_ is `GL_MAX_NUM_ACTIVE_VARIABLES` and _`programInterface`_ is not `GL_UNIFORM_BLOCK`, `GL_SHADER_STORAGE_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, or `GL_TRANSFORM_FEEDBACK_BUFFER`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_LABEL_LENGTH`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetProgramInterfaceiv` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramResourceName][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceName.glGetProgramResourceName], [glGetProgramResourceIndex][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceIndex.glGetProgramResourceIndex], [glGetProgramResourceLocation][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceLocation.glGetProgramResourceLocation], [glGetProgramResourceiv][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceiv.glGetProgramResourceiv].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetProgramInterfaceiv.glGetProgramInterfaceiv
    */
    fun glGetProgramInterfaceiv(program: UInt, programInterface: Int, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}