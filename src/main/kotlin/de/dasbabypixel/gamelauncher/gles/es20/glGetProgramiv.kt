package de.dasbabypixel.gamelauncher.gles.es20

interface glGetProgramiv {
    /**
    * Name
    * ----
    * 
    * glGetProgramiv — Returns a parameter from a program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetProgramiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the program object to be queried.
    * 
    * _`pname`_
    * 
    * Specifies the object parameter. Accepted symbolic names are `GL_ACTIVE_ATOMIC_COUNTER_BUFFERS`, `GL_ACTIVE_ATTRIBUTES`, `GL_ACTIVE_ATTRIBUTE_MAX_LENGTH`, `GL_ACTIVE_UNIFORMS`, `GL_ACTIVE_UNIFORM_BLOCKS`, `GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH`, `GL_ACTIVE_UNIFORM_MAX_LENGTH`, `GL_ATTACHED_SHADERS`, `GL_COMPUTE_WORK_GROUP_SIZE`, `GL_DELETE_STATUS`, `GL_GEOMETRY_LINKED_INPUT_TYPE`, `GL_GEOMETRY_LINKED_OUTPUT_TYPE`, `GL_GEOMETRY_LINKED_VERTICES_OUT`, `GL_GEOMETRY_SHADER_INVOCATIONS`, `GL_INFO_LOG_LENGTH`, `GL_LINK_STATUS`, `GL_PROGRAM_BINARY_RETRIEVABLE_HINT`, `GL_PROGRAM_SEPARABLE`, `GL_TESS_CONTROL_OUTPUT_VERTICES`, `GL_TESS_GEN_MODE`, `GL_TESS_GEN_POINT_MODE`, `GL_TESS_GEN_SPACING`, `GL_TESS_GEN_VERTEX_ORDER`, `GL_TRANSFORM_FEEDBACK_BUFFER_MODE`, `GL_TRANSFORM_FEEDBACK_VARYINGS`, `GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH` and `GL_VALIDATE_STATUS`.
    * 
    * _`params`_
    * 
    * Returns the requested object parameter.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramiv` returns in _`params`_ the value of a parameter for a specific program object. The following parameters are defined:
    * 
    * `GL_ACTIVE_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`params`_ returns the number of active attribute atomic counter buffers used by _`program`_.
    * 
    * `GL_ACTIVE_ATTRIBUTES`
    * 
    * _`params`_ returns the number of active attribute variables for _`program`_.
    * 
    * `GL_ACTIVE_ATTRIBUTE_MAX_LENGTH`
    * 
    * _`params`_ returns the length of the longest active attribute name for _`program`_, including the null termination character (i.e., the size of the character buffer required to store the longest attribute name). If no active attributes exist, 0 is returned.
    * 
    * `GL_ACTIVE_UNIFORM_BLOCKS`
    * 
    * _`params`_ returns the number of uniform blocks for _`program`_ containing active uniforms.
    * 
    * `GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH`
    * 
    * _`params`_ returns the length of the longest active uniform block name for _`program`_, including the null termination character (i.e., the size of the character buffer required to store the longest uniform block name). If no active uniform blocks exist, 0 is returned.
    * 
    * `GL_ACTIVE_UNIFORMS`
    * 
    * _`params`_ returns the number of active uniform variables for _`program`_.
    * 
    * `GL_ACTIVE_UNIFORM_MAX_LENGTH`
    * 
    * _`params`_ returns the length of the longest active uniform variable name for _`program`_, including the null termination character (i.e., the size of the character buffer required to store the longest uniform variable name). If no active uniform variables exist, 0 is returned.
    * 
    * `GL_ATTACHED_SHADERS`
    * 
    * _`params`_ returns the number of shader objects attached to _`program`_.
    * 
    * `GL_COMPUTE_WORK_GROUP_SIZE`
    * 
    * _`params`_ returns an array of three integers containing the local work group size of the compute program as specified by its input layout qualifier(s). _`program`_ must be the name of a program object that has been previously linked successfully and contains a binary for the compute shader stage.
    * 
    * `GL_DELETE_STATUS`
    * 
    * _`params`_ returns `GL_TRUE` if _`program`_ is currently flagged for deletion, and `GL_FALSE` otherwise.
    * 
    * `GL_GEOMETRY_LINKED_INPUT_TYPE`
    * 
    * _`params`_ returns a symbolic constant indicating the primitive type accepted as input to the geometry shader contained in _`program`_.
    * 
    * `GL_GEOMETRY_LINKED_OUTPUT_TYPE`
    * 
    * _`params`_ returns a symbolic constant indicating the primitive type that will be output by the geometry shader contained in _`program`_.
    * 
    * `GL_GEOMETRY_LINKED_VERTICES_OUT`
    * 
    * _`params`_ returns the maximum number of vertices that the geometry shader in _`program`_ will output.
    * 
    * `GL_GEOMETRY_SHADER_INVOCATIONS`
    * 
    * _`params`_ returns the number of invocations per primitive that the geometry shader in _`program`_ will execute.
    * 
    * `GL_INFO_LOG_LENGTH`
    * 
    * _`params`_ returns the number of characters in the information log for _`program`_ including the null termination character (i.e., the size of the character buffer required to store the information log). If _`program`_ has no information log, a value of 0 is returned.
    * 
    * `GL_LINK_STATUS`
    * 
    * _`params`_ returns `GL_TRUE` if the last link operation on _`program`_ was successful, and `GL_FALSE` otherwise.
    * 
    * `GL_PROGRAM_BINARY_RETRIEVABLE_HINT`
    * 
    * _`params`_ returns the current value of whether the binary retrieval hint is enabled for _`program`_.
    * 
    * `GL_PROGRAM_SEPARABLE`
    * 
    * _`params`_ returns `GL_TRUE` if the program has been flagged for use as a separable program object that can be bound to individual shader stages with [glUseProgramStages][de.dasbabypixel.gamelauncher.gles.es31.glUseProgramStages.glUseProgramStages].
    * 
    * `GL_TESS_CONTROL_OUTPUT_VERTICES`
    * 
    * _`params`_ returns the number of vertices in the tesselation control shader output patch.
    * 
    * `GL_TESS_GEN_MODE`
    * 
    * _`params`_ returns the primitive mode declared by the tesselation evaluation shader for tesselation primitive generation. This is one of `GL_QUADS`, `GL_TRIANGLES`, or `GL_ISOLINES`.
    * 
    * `GL_TESS_GEN_POINT_MODE`
    * 
    * _`params`_ returns a single boolean, the point mode declared by the tesselation evaluation shader to determine if the tesselation primitive generator emits points.
    * 
    * `GL_TESS_GEN_SPACING`
    * 
    * _`params`_ returns the spacing declared by the tesselation evaluation shader for tesselation primitive generation edge subdivision. This is one of `GL_EQUAL`, `GL_FRACTIONAL_EVEN`, or `GL_FRACTIONAL_ODD`.
    * 
    * `GL_TESS_GEN_VERTEX_ORDER`
    * 
    * _`params`_ returns the vertex order declared by the tesselation evaluation shader for tesselation primitive generation. This is one of `GL_CW`, or `GL_CCW`.
    * 
    * `GL_TRANSFORM_FEEDBACK_BUFFER_MODE`
    * 
    * _`params`_ returns a symbolic constant indicating the buffer mode used when transform feedback is active. This may be `GL_SEPARATE_ATTRIBS` or `GL_INTERLEAVED_ATTRIBS`.
    * 
    * `GL_TRANSFORM_FEEDBACK_VARYINGS`
    * 
    * _`params`_ returns the number of varying variables to capture in transform feedback mode for the program.
    * 
    * `GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH`
    * 
    * _`params`_ returns the length of the longest variable name to be used for transform feedback, including the null-terminator.
    * 
    * `GL_VALIDATE_STATUS`
    * 
    * _`params`_ returns `GL_TRUE` or if the last validation operation on _`program`_ was successful, and `GL_FALSE` otherwise.
    * 
    * Notes
    * -----
    * 
    * If an error is generated, no change is made to the contents of _`params`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not a value generated by OpenGL.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ does not refer to a program object.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib] with argument _`program`_
    * 
    * [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform] with argument _`program`_
    * 
    * [glGetAttachedShaders][de.dasbabypixel.gamelauncher.gles.es20.glGetAttachedShaders.glGetAttachedShaders] with argument _`program`_
    * 
    * [glGetProgramInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramInfoLog.glGetProgramInfoLog] with argument _`program`_
    * 
    * [glIsProgram][de.dasbabypixel.gamelauncher.gles.es20.glIsProgram.glIsProgram]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetProgramiv | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glAttachShader][de.dasbabypixel.gamelauncher.gles.es20.glAttachShader.glAttachShader], [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram], [glDeleteProgram][de.dasbabypixel.gamelauncher.gles.es20.glDeleteProgram.glDeleteProgram], [glGetShaderiv][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderiv.glGetShaderiv], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glValidateProgram][de.dasbabypixel.gamelauncher.gles.es20.glValidateProgram.glValidateProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv
    */
    fun glGetProgramiv(program: UInt, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}