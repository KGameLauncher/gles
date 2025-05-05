package de.dasbabypixel.gamelauncher.gles.es20

interface glLinkProgram {
    /**
    * Name
    * ----
    * 
    * glLinkProgram — Links a program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glLinkProgram**(` | GLuint program`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the handle of the program object to be linked.
    * 
    * Description
    * -----------
    * 
    * `glLinkProgram` links the program object specified by _`program`_. Shader objects of type `GL_VERTEX_SHADER` attached to _`program`_ are used to create an executable that will run on the programmable vertex processor. Shader objects of type `GL_FRAGMENT_SHADER` attached to _`program`_ are used to create an executable that will run on the programmable fragment processor.
    * 
    * The status of the link operation will be stored as part of the program object's state. This value will be set to `GL_TRUE` if the program object was linked without errors and is ready for use, and `GL_FALSE` otherwise. It can be queried by calling [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with arguments _`program`_ and `GL_LINK_STATUS`.
    * 
    * As a result of a successful link operation, all active user-defined uniform variables belonging to _`program`_ will be initialized to 0, and each of the program object's active uniform variables will be assigned a location that can be queried by calling [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation]. All active uniforms belonging to the program’s named uniform blocks are assigned offsets (and strides for array and matrix type uniforms) within the uniform block. Also, any active user-defined attribute variables that have not been bound to a generic vertex attribute index will be bound to one at this time.
    * 
    * Linking of a program object can fail for a number of reasons as specified in the _OpenGL ES Shading Language Specification_. The following lists some of the conditions that will cause a link error.
    * 
    * *   The program object contains objects to form either a vertex shader or a fragment shader, is not separable, and does not contain objects to form both a vertex shader and a fragment shader.
    * 
    * *   The vertex and fragment shader do not use the same shader language version.
    * 
    * *   The program object contains objects to form a geometry shader, is not separable, but does not contain objects to form a vertex shader.
    * 
    * *   The program object contains objects to form a geometry shader and the input primitive type, output primitive type, or maximum output vertex count is not specified in the compiled geometry shader object.
    * 
    * *   The number of active attribute variables supported by the implementation has been exceeded.
    * 
    * *   The storage limit for uniform variables has been exceeded.
    * 
    * *   The number of active uniform variables supported by the implementation has been exceeded.
    * 
    * *   The `main` function is missing for the vertex or fragment shader.
    * 
    * *   A varying variable actually used in the fragment shader is not declared in the same way (or is not declared at all) in the vertex shader.
    * 
    * *   A reference to a function or variable name is unresolved.
    * 
    * *   A shared global is declared with two different types or two different initial values.
    * 
    * *   One or more of the attached shader objects has not been successfully compiled (via [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader]) or loaded with a pre-compiled shader binary (via [glShaderBinary][de.dasbabypixel.gamelauncher.gles.es20.glShaderBinary.glShaderBinary]).
    * 
    * *   Binding a generic attribute matrix caused some rows of the matrix to fall outside the allowed maximum of `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * *   Not enough contiguous vertex attribute slots could be found to bind attribute matrices.
    * 
    * *   Any variable name specified to [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings] in the _`varyings`_ array is not declared as an output in the vertex shader.
    * 
    * *   Any two entries in the _`varyings`_ array given [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings] specify the same varying variable.
    * 
    * *   The total number of components to capture in any transform feedback varying variable is greater than the constant `GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS` and the buffer mode is `GL_SEPARATE_ATTRIBS`.
    * 
    * *   The total number of components to capture in any transform feedback varying variable is greater than the constant `GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS` and the buffer mode is `GL_INTERLEAVED_ATTRIBS`.
    * 
    * 
    * When a program object has been successfully linked, the program object can be made part of current state by calling [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]. Whether or not the link operation was successful, the program object's information log will be overwritten. The information log can be retrieved by calling [glGetProgramInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramInfoLog.glGetProgramInfoLog].
    * 
    * `glLinkProgram` will also install the generated executables as part of the current rendering state if the link operation was successful and the specified program object is already currently in use as a result of a previous call to [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]. If the program object currently in use is relinked unsuccessfully, its link status will be set to `GL_FALSE` , but the executables and associated state will remain part of the current state until a subsequent call to `glUseProgram` removes it from use. After it is removed from use, it cannot be made part of current state until it has been successfully relinked.
    * 
    * The program object's information log is updated and the program is generated at the time of the link operation. After the link operation, applications are free to modify attached shader objects, compile attached shader objects, detach shader objects, delete shader objects, and attach additional shader objects. None of these operations affects the information log or the program that is part of the program object.
    * 
    * Notes
    * -----
    * 
    * If the link operation is unsuccessful, any information about a previous link operation on _`program`_ is lost (i.e., a failed link does not restore the old state of _`program`_ ). Certain information can still be retrieved from _`program`_ even after an unsuccessful link operation. See for instance [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib] and [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not a value generated by OpenGL.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not a program object.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is the currently active program object and transform feedback mode is active.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with the argument `GL_CURRENT_PROGRAM`
    * 
    * [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib] with argument _`program`_ and the index of an active attribute variable
    * 
    * [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform] with argument _`program`_ and the index of an active uniform variable
    * 
    * [glGetActiveUniformBlockiv][de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformBlockiv.glGetActiveUniformBlockiv] with argument _`program`_ and the index of an active uniform block
    * 
    * [glGetAttachedShaders][de.dasbabypixel.gamelauncher.gles.es20.glGetAttachedShaders.glGetAttachedShaders] with argument _`program`_
    * 
    * [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation] with argument _`program`_ and an attribute variable name
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with arguments _`program`_ and `GL_LINK_STATUS`
    * 
    * [glGetProgramInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramInfoLog.glGetProgramInfoLog] with argument _`program`_
    * 
    * [glGetUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformfv.glGetUniformfv] with argument _`program`_ and a uniform variable location
    * 
    * [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation] with argument _`program`_ and a uniform variable name
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
    * | glLinkProgram | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glAttachShader][de.dasbabypixel.gamelauncher.gles.es20.glAttachShader.glAttachShader], [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation], [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader], [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram], [glDeleteProgram][de.dasbabypixel.gamelauncher.gles.es20.glDeleteProgram.glDeleteProgram], [glDetachShader][de.dasbabypixel.gamelauncher.gles.es20.glDetachShader.glDetachShader], [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], [glValidateProgram][de.dasbabypixel.gamelauncher.gles.es20.glValidateProgram.glValidateProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram
    */
    fun glLinkProgram(program: UInt)
}