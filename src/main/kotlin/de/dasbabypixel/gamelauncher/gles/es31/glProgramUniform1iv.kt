package de.dasbabypixel.gamelauncher.gles.es31

interface glProgramUniform1iv {
    /**
    * Name
    * ----
    * 
    * glProgramUniform — Specify the value of a uniform variable for a specified program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glProgramUniform1f**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLfloat v0`)`; |
    * 
    * | `void **glProgramUniform2f**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLfloat v0, |
    * |   | GLfloat v1`)`; |
    * 
    * | `void **glProgramUniform3f**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLfloat v0, |
    * |   | GLfloat v1, |
    * |   | GLfloat v2`)`; |
    * 
    * | `void **glProgramUniform4f**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLfloat v0, |
    * |   | GLfloat v1, |
    * |   | GLfloat v2, |
    * |   | GLfloat v3`)`; |
    * 
    * | `void **glProgramUniform1i**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLint v0`)`; |
    * 
    * | `void **glProgramUniform2i**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLint v0, |
    * |   | GLint v1`)`; |
    * 
    * | `void **glProgramUniform3i**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLint v0, |
    * |   | GLint v1, |
    * |   | GLint v2`)`; |
    * 
    * | `void **glProgramUniform4i**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLint v0, |
    * |   | GLint v1, |
    * |   | GLint v2, |
    * |   | GLint v3`)`; |
    * 
    * | `void **glProgramUniform1ui**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLuint v0`)`; |
    * 
    * | `void **glProgramUniform2ui**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLint v0, |
    * |   | GLuint v1`)`; |
    * 
    * | `void **glProgramUniform3ui**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLint v0, |
    * |   | GLint v1, |
    * |   | GLuint v2`)`; |
    * 
    * | `void **glProgramUniform4ui**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLint v0, |
    * |   | GLint v1, |
    * |   | GLint v2, |
    * |   | GLuint v3`)`; |
    * 
    * | `void **glProgramUniform1fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniform2fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniform3fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniform4fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniform1iv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glProgramUniform2iv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glProgramUniform3iv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glProgramUniform4iv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glProgramUniform1uiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glProgramUniform2uiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glProgramUniform3uiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glProgramUniform4uiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix2fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix3fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix4fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix2x3fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix3x2fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix2x4fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix4x2fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix3x4fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glProgramUniformMatrix4x3fv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLint location, |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the handle of the program containing the uniform variable to be modified.
    * 
    * _`location`_
    * 
    * Specifies the location of the uniform variable to be modified.
    * 
    * _`count`_
    * 
    * For the vector commands (`glProgramUniform*v`), specifies the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
    * 
    * For the matrix commands (`glProgramUniformMatrix*`), specifies the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
    * 
    * _`transpose`_
    * 
    * For the matrix commands, specifies whether to transpose the matrix as the values are loaded into the uniform variable.
    * 
    * _`v0`_, _`v1`_, _`v2`_, _`v3`_
    * 
    * For the scalar commands, specifies the new values to be used for the specified uniform variable.
    * 
    * _`value`_
    * 
    * For the vector and matrix commands, specifies a pointer to an array of _`count`_ values that will be used to update the specified uniform variable.
    * 
    * Description
    * -----------
    * 
    * `glProgramUniform` modifies the value of a uniform variable or a uniform variable array. The location of the uniform variable to be modified is specified by _`location`_, which should be a value returned by [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation]. `glProgramUniform` operates on the program object specified by _`program`_.
    * 
    * The commands `glProgramUniform{1|2|3|4}{f|i|ui}` are used to change the value of the uniform variable specified by _`location`_ using the values passed as arguments. The number specified in the command should match the number of components in the data type of the specified uniform variable (e.g., `1` for `float`, `int`, `unsigned int`, `bool`; `2` for `vec2`, `ivec2`, `uvec2`, `bvec2`, etc.). The suffix `f` indicates that floating-point values are being passed; the suffix `i` indicates that integer values are being passed; the suffix `ui` indicates that unsigned integer values are being passed, and this type should also match the data type of the specified uniform variable. The `i` variants of this function should be used to provide values for uniform variables defined as `int`, `ivec2`, `ivec3`, `ivec4`, or arrays of these. The `ui` variants of this function should be used to provide values for uniform variables defined as `unsigned int`, `uvec2`, `uvec3`, `uvec4`, or arrays of these. The `f` variants should be used to provide values for uniform variables of type `float`, `vec2`, `vec3`, `vec4`, or arrays of these. Either the `i`, `ui` or `f` variants may be used to provide values for uniform variables of type `bool`, `bvec2`, `bvec3`, `bvec4`, or arrays of these. The uniform variable will be set to `false` if the input value is 0 or 0.0f, and it will be set to `true` otherwise.
    * 
    * All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to `glProgramUniform` until the next successful link operation occurs on the program object, when they are once again initialized to 0.
    * 
    * The commands `glProgramUniform{1|2|3|4}{f|i|ui}v` can be used to modify a single uniform variable or a uniform variable array. These commands pass a count and a pointer to the values to be loaded into a uniform variable or a uniform variable array. A count of 1 should be used if modifying the value of a single uniform variable, and a count of 1 or greater can be used to modify an entire array or part of an array. When loading _n_ elements starting at an arbitrary position _m_ in a uniform variable array, elements _m_ + _n_ - 1 in the array will be replaced with the new values. If _`m`_ + _`n`_ - 1 is larger than the size of the uniform variable array, values for all array elements beyond the end of the array will be ignored. The number specified in the name of the command indicates the number of components for each element in _`value`_, and it should match the number of components in the data type of the specified uniform variable (e.g., `1` for `float`, `int`, `bool`; `2` for `vec2`, `ivec2`, `bvec2`, etc.). The data type specified in the name of the command must match the data type for the specified uniform variable as described previously for `glProgramUniform{1|2|3|4}{f|i|ui}`.
    * 
    * For uniform variable arrays, each element of the array is considered to be of the type indicated in the name of the command (e.g., `glProgramUniform3f` or `glProgramUniform3fv` can be used to load a uniform variable array of type vec3). The number of elements of the uniform variable array to be modified is specified by _`count`_
    * 
    * The commands `glProgramUniformMatrix{2|3|4|2x3|3x2|2x4|4x2|3x4|4x3}fv` are used to modify a matrix or an array of matrices. The numbers in the command name are interpreted as the dimensionality of the matrix. The number `2` indicates a 2 × 2 matrix (i.e., 4 values), the number `3` indicates a 3 × 3 matrix (i.e., 9 values), and the number `4` indicates a 4 × 4 matrix (i.e., 16 values). Non-square matrix dimensionality is explicit, with the first number representing the number of columns and the second number representing the number of rows. For example, `2x4` indicates a 2 × 4 matrix with 2 columns and 4 rows (i.e., 8 values). If _`transpose`_ is `GL_FALSE`, each matrix is assumed to be supplied in column major order. If _`transpose`_ is `GL_TRUE`, each matrix is assumed to be supplied in row major order. The _`count`_ argument indicates the number of matrices to be passed. A count of 1 should be used if modifying the value of a single matrix, and a count greater than 1 can be used to modify an array of matrices.
    * 
    * Notes
    * -----
    * 
    * `glProgramUniform1i` and `glProgramUniform1iv` are the only two functions that may be used to load uniform variables defined as sampler types. Loading samplers with any other function will result in a `GL_INVALID_OPERATION` error.
    * 
    * If _`count`_ is greater than 1 and the indicated uniform variable is not an array, a `GL_INVALID_OPERATION` error is generated and the specified uniform variable will remain unchanged.
    * 
    * Other than the preceding exceptions, if the type and size of the uniform variable as defined in the shader do not match the type and size specified in the name of the command used to load its value, a `GL_INVALID_OPERATION` error will be generated and the specified uniform variable will remain unchanged.
    * 
    * If _`location`_ is a value other than -1 and it does not represent a valid uniform variable location in within _`program`_, an error will be generated, and no changes will be made to the uniform variable storage of _`program`_. If _`location`_ is equal to -1, the data passed in will be silently ignored and the specified uniform variable will not be changed.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ does not refer to a program object owned by the GL.
    * 
    * `GL_INVALID_OPERATION` is generated if the size of the uniform variable declared in the shader does not match the size indicated by the `glProgramUniform` command.
    * 
    * `GL_INVALID_OPERATION` is generated if one of the signed or unsigned integer variants of this function is used to load a uniform variable of type `float`, `vec2`, `vec3`, `vec4`, or an array of these, or if one of the floating-point variants of this function is used to load a uniform variable of type `int`, `ivec2`, `ivec3`, `ivec4`, `unsigned int`, `uvec2`, `uvec3`, `uvec4`, or an array of these.
    * 
    * `GL_INVALID_OPERATION` is generated if one of the signed integer variants of this function is used to load a uniform variable of type `unsigned int`, `uvec2`, `uvec3`, `uvec4`, or an array of these.
    * 
    * `GL_INVALID_OPERATION` is generated if one of the unsigned integer variants of this function is used to load a uniform variable of type `int`, `ivec2`, `ivec3`, `ivec4`, or an array of these.
    * 
    * `GL_INVALID_OPERATION` is generated if _`location`_ is an invalid uniform location for _`program`_ and _`location`_ is not equal to -1.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ is less than 0.
    * 
    * `GL_INVALID_OPERATION` is generated if _`count`_ is greater than 1 and the indicated uniform variable is not an array variable.
    * 
    * `GL_INVALID_OPERATION` is generated if a sampler is loaded using a command other than `glProgramUniform1i` and `glProgramUniform1iv`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform] with the handle of a program object and the index of an active uniform variable
    * 
    * [glGetUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformfv.glGetUniformfv] with the handle of a program object and the location of a uniform variable
    * 
    * [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation] with the handle of a program object and the name of a uniform variable
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glProgramUniform1f | \- | \- | ✔ | ✔ |
    * | glProgramUniform2f | \- | \- | ✔ | ✔ |
    * | glProgramUniform3f | \- | \- | ✔ | ✔ |
    * | glProgramUniform4f | \- | \- | ✔ | ✔ |
    * | glProgramUniform1i | \- | \- | ✔ | ✔ |
    * | glProgramUniform2i | \- | \- | ✔ | ✔ |
    * | glProgramUniform3i | \- | \- | ✔ | ✔ |
    * | glProgramUniform4i | \- | \- | ✔ | ✔ |
    * | glProgramUniform1ui | \- | \- | ✔ | ✔ |
    * | glProgramUniform2ui | \- | \- | ✔ | ✔ |
    * | glProgramUniform3ui | \- | \- | ✔ | ✔ |
    * | glProgramUniform4ui | \- | \- | ✔ | ✔ |
    * | glProgramUniform1fv | \- | \- | ✔ | ✔ |
    * | glProgramUniform2fv | \- | \- | ✔ | ✔ |
    * | glProgramUniform3fv | \- | \- | ✔ | ✔ |
    * | glProgramUniform4fv | \- | \- | ✔ | ✔ |
    * | glProgramUniform1iv | \- | \- | ✔ | ✔ |
    * | glProgramUniform2iv | \- | \- | ✔ | ✔ |
    * | glProgramUniform3iv | \- | \- | ✔ | ✔ |
    * | glProgramUniform4iv | \- | \- | ✔ | ✔ |
    * | glProgramUniform1uiv | \- | \- | ✔ | ✔ |
    * | glProgramUniform2uiv | \- | \- | ✔ | ✔ |
    * | glProgramUniform3uiv | \- | \- | ✔ | ✔ |
    * | glProgramUniform4uiv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix2fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix3fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix4fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix2x3fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix3x2fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix2x4fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix4x2fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix3x4fv | \- | \- | ✔ | ✔ |
    * | glProgramUniformMatrix4x3fv | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform1f.glProgramUniform1f
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform2f.glProgramUniform2f
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform3f.glProgramUniform3f
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform4f.glProgramUniform4f
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform1i.glProgramUniform1i
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform2i.glProgramUniform2i
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform3i.glProgramUniform3i
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform4i.glProgramUniform4i
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform1ui.glProgramUniform1ui
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform2ui.glProgramUniform2ui
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform3ui.glProgramUniform3ui
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform4ui.glProgramUniform4ui
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform1fv.glProgramUniform1fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform2fv.glProgramUniform2fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform3fv.glProgramUniform3fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform4fv.glProgramUniform4fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform1iv.glProgramUniform1iv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform2iv.glProgramUniform2iv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform3iv.glProgramUniform3iv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform4iv.glProgramUniform4iv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform1uiv.glProgramUniform1uiv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform2uiv.glProgramUniform2uiv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform3uiv.glProgramUniform3uiv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniform4uiv.glProgramUniform4uiv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix2fv.glProgramUniformMatrix2fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix3fv.glProgramUniformMatrix3fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix4fv.glProgramUniformMatrix4fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix2x3fv.glProgramUniformMatrix2x3fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix3x2fv.glProgramUniformMatrix3x2fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix2x4fv.glProgramUniformMatrix2x4fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix4x2fv.glProgramUniformMatrix4x2fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix3x4fv.glProgramUniformMatrix3x4fv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glProgramUniformMatrix4x3fv.glProgramUniformMatrix4x3fv
    */
    fun glProgramUniform1iv(program: UInt, location: Int, count: UInt, value: java.nio.IntBuffer)
}