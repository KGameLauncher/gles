package de.dasbabypixel.gamelauncher.gles.es30

interface glUniformMatrix4x2fv {
    /**
    * Name
    * ----
    * 
    * glUniform — Specify the value of a uniform variable for the current program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glUniform1f**(` | GLint location, |
    * | --- | --- |
    * |   | GLfloat v0`)`; |
    * 
    * | `void **glUniform2f**(` | GLint location, |
    * | --- | --- |
    * |   | GLfloat v0, |
    * |   | GLfloat v1`)`; |
    * 
    * | `void **glUniform3f**(` | GLint location, |
    * | --- | --- |
    * |   | GLfloat v0, |
    * |   | GLfloat v1, |
    * |   | GLfloat v2`)`; |
    * 
    * | `void **glUniform4f**(` | GLint location, |
    * | --- | --- |
    * |   | GLfloat v0, |
    * |   | GLfloat v1, |
    * |   | GLfloat v2, |
    * |   | GLfloat v3`)`; |
    * 
    * | `void **glUniform1i**(` | GLint location, |
    * | --- | --- |
    * |   | GLint v0`)`; |
    * 
    * | `void **glUniform2i**(` | GLint location, |
    * | --- | --- |
    * |   | GLint v0, |
    * |   | GLint v1`)`; |
    * 
    * | `void **glUniform3i**(` | GLint location, |
    * | --- | --- |
    * |   | GLint v0, |
    * |   | GLint v1, |
    * |   | GLint v2`)`; |
    * 
    * | `void **glUniform4i**(` | GLint location, |
    * | --- | --- |
    * |   | GLint v0, |
    * |   | GLint v1, |
    * |   | GLint v2, |
    * |   | GLint v3`)`; |
    * 
    * | `void **glUniform1ui**(` | GLint location, |
    * | --- | --- |
    * |   | GLuint v0`)`; |
    * 
    * | `void **glUniform2ui**(` | GLint location, |
    * | --- | --- |
    * |   | GLuint v0, |
    * |   | GLuint v1`)`; |
    * 
    * | `void **glUniform3ui**(` | GLint location, |
    * | --- | --- |
    * |   | GLuint v0, |
    * |   | GLuint v1, |
    * |   | GLuint v2`)`; |
    * 
    * | `void **glUniform4ui**(` | GLint location, |
    * | --- | --- |
    * |   | GLint v0, |
    * |   | GLuint v1, |
    * |   | GLuint v2, |
    * |   | GLuint v3`)`; |
    * 
    * | `void **glUniform1fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniform2fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniform3fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniform4fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniform1iv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glUniform2iv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glUniform3iv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glUniform4iv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLint \*value`)`; |
    * 
    * | `void **glUniform1uiv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glUniform2uiv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glUniform3uiv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glUniform4uiv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const GLuint \*value`)`; |
    * 
    * | `void **glUniformMatrix2fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix3fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix4fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix2x3fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix3x2fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix2x4fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix4x2fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix3x4fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * | `void **glUniformMatrix4x3fv**(` | GLint location, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | GLboolean transpose, |
    * |   | const GLfloat \*value`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`location`_
    * 
    * Specifies the location of the uniform variable to be modified.
    * 
    * _`count`_
    * 
    * For the vector (`glUniform*v`) commands, specifies the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
    * 
    * For the matrix (`glUniformMatrix*`) commands, specifies the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
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
    * `glUniform`\* modifies the value of a uniform variable or a uniform variable array in the default uniform block. The location of the uniform variable to be modified is specified by _`location`_, which should be a value returned by [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation]. `glUniform` operates on the program object that was made part of current state by calling [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram].
    * 
    * The commands `glUniform{1|2|3|4}{f|i|ui}` are used to change the value of the uniform variable specified by _`location`_ using the values passed as arguments. The number specified in the command should match the number of components in the data type of the specified uniform variable (e.g., `1` for `float`, `int`, `unsigned int`, `bool`; `2` for `vec2`, `ivec2`, `uvec2`, `bvec2`, etc.). The suffix `f` indicates that floating-point values are being passed; the suffix `i` indicates that integer values are being passed; the suffix `ui` indicates that unsigned integer values are being passed, and this type should also match the data type of the specified uniform variable. The `i` variants of this function should be used to provide values for uniform variables defined as `int`, `ivec2`, `ivec3`, `ivec4`, or arrays of these. The `ui` variants of this function should be used to provide values for uniform variables defined as `unsigned int`, `uvec2`, `uvec3`, `uvec4`, or arrays of these. The `f` variants should be used to provide values for uniform variables of type `float`, `vec2`, `vec3`, `vec4`, or arrays of these. Either the `i`, `ui` or `f` variants may be used to provide values for uniform variables of type `bool`, `bvec2`, `bvec3`, `bvec4`, or arrays of these. The uniform variable will be set to `false` if the input value is 0 or 0.0f, and it will be set to `true` otherwise.
    * 
    * All active uniform variables defined in a program object are initialized to 0 when the program object is linked successfully. They retain the values assigned to them by a call to `glUniform` until the next successful link operation occurs on the program object, when they are once again initialized to 0.
    * 
    * The commands `glUniform{1|2|3|4}{f|i|ui}v` can be used to modify a single uniform variable or a uniform variable array. These commands pass a count and a pointer to the values to be loaded into a uniform variable or a uniform variable array. A count of 1 should be used if modifying the value of a single uniform variable, and a count of 1 or greater can be used to modify an entire array or part of an array. When loading _n_ elements starting at an arbitrary position _m_ in a uniform variable array, elements _m_ + _n_ - 1 in the array will be replaced with the new values. If _`m`_ + _`n`_ - 1 is larger than the size of the uniform variable array, values for all array elements beyond the end of the array will be ignored. The number specified in the name of the command indicates the number of components for each element in _`value`_, and it should match the number of components in the data type of the specified uniform variable (e.g., `1` for float, int, bool; `2` for vec2, ivec2, bvec2, etc.). The data type specified in the name of the command must match the data type for the specified uniform variable as described previously for `glUniform{1|2|3|4}{f|i|ui}`.
    * 
    * For uniform variable arrays, each element of the array is considered to be of the type indicated in the name of the command (e.g., `glUniform3f` or `glUniform3fv` can be used to load a uniform variable array of type vec3). The number of elements of the uniform variable array to be modified is specified by _`count`_
    * 
    * The commands `glUniformMatrix{2|3|4|2x3|3x2|2x4|4x2|3x4|4x3}fv` are used to modify a matrix or an array of matrices. The numbers in the command name are interpreted as the dimensionality of the matrix. The number `2` indicates a 2 × 2 matrix (i.e., 4 values), the number `3` indicates a 3 × 3 matrix (i.e., 9 values), and the number `4` indicates a 4 × 4 matrix (i.e., 16 values). Non-square matrix dimensionality is explicit, with the first number representing the number of columns and the second number representing the number of rows. For example, `2x4` indicates a 2 × 4 matrix with 2 columns and 4 rows (i.e., 8 values). If _`transpose`_ is `GL_FALSE`, each matrix is assumed to be supplied in column major order. If _`transpose`_ is `GL_TRUE`, each matrix is assumed to be supplied in row major order. The _`count`_ argument indicates the number of matrices to be passed. A count of 1 should be used if modifying the value of a single matrix, and a count greater than 1 can be used to modify an array of matrices.
    * 
    * Notes
    * -----
    * 
    * `glUniform1i` and `glUniform1iv` are the only two functions that may be used to load uniform variables defined as sampler types. Loading samplers with any other function will result in a `GL_INVALID_OPERATION` error.
    * 
    * If _`count`_ is greater than 1 and the indicated uniform variable is not an array, a `GL_INVALID_OPERATION` error is generated and the specified uniform variable will remain unchanged.
    * 
    * Other than the preceding exceptions, if the type and size of the uniform variable as defined in the shader do not match the type and size specified in the name of the command used to load its value, a `GL_INVALID_OPERATION` error will be generated and the specified uniform variable will remain unchanged.
    * 
    * If _`location`_ is a value other than -1 and it does not represent a valid uniform variable location in the current program object, an error will be generated, and no changes will be made to the uniform variable storage of the current program object. If _`location`_ is equal to -1, the data passed in will be silently ignored and the specified uniform variable will not be changed.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if there is no current program object.
    * 
    * `GL_INVALID_OPERATION` is generated if the size of the uniform variable declared in the shader does not match the size indicated by the `glUniform` command.
    * 
    * `GL_INVALID_OPERATION` is generated if one of the signed or unsigned integer variants of this function is used to load a uniform variable of type `float`, `vec2`, `vec3`, `vec4`, or an array of these, or if one of the floating-point variants of this function is used to load a uniform variable of type `int`, `ivec2`, `ivec3`, `ivec4`, `unsigned int`, `uvec2`, `uvec3`, `uvec4`, or an array of these.
    * 
    * `GL_INVALID_OPERATION` is generated if one of the signed integer variants of this function is used to load a uniform variable of type `unsigned int`, `uvec2`, `uvec3`, `uvec4`, or an array of these.
    * 
    * `GL_INVALID_OPERATION` is generated if one of the unsigned integer variants of this function is used to load a uniform variable of type `int`, `ivec2`, `ivec3`, `ivec4`, or an array of these.
    * 
    * `GL_INVALID_OPERATION` is generated if _`location`_ is an invalid uniform location for the current program object and _`location`_ is not equal to -1.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ is less than 0.
    * 
    * `GL_INVALID_OPERATION` is generated if _`count`_ is greater than 1 and the indicated uniform variable is not an array variable.
    * 
    * `GL_INVALID_OPERATION` is generated if a sampler is loaded using a command other than `glUniform1i` and `glUniform1iv`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with the argument `GL_CURRENT_PROGRAM`
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
    * | `glUniform1f` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform2f` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform3f` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform4f` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform1i` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform2i` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform3i` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform4i` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform1ui` | \- | ✔ | ✔ | ✔ |
    * | `glUniform2ui` | \- | ✔ | ✔ | ✔ |
    * | `glUniform3ui` | \- | ✔ | ✔ | ✔ |
    * | `glUniform4ui` | \- | ✔ | ✔ | ✔ |
    * | `glUniform1fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform2fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform3fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform4fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform1iv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform2iv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform3iv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform4iv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniform1uiv` | \- | ✔ | ✔ | ✔ |
    * | `glUniform2uiv` | \- | ✔ | ✔ | ✔ |
    * | `glUniform3uiv` | \- | ✔ | ✔ | ✔ |
    * | `glUniform4uiv` | \- | ✔ | ✔ | ✔ |
    * | `glUniformMatrix2fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniformMatrix3fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniformMatrix4fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glUniformMatrix2x3fv` | \- | ✔ | ✔ | ✔ |
    * | `glUniformMatrix3x2fv` | \- | ✔ | ✔ | ✔ |
    * | `glUniformMatrix2x4fv` | \- | ✔ | ✔ | ✔ |
    * | `glUniformMatrix4x2fv` | \- | ✔ | ✔ | ✔ |
    * | `glUniformMatrix3x4fv` | \- | ✔ | ✔ | ✔ |
    * | `glUniformMatrix4x3fv` | \- | ✔ | ✔ | ✔ |
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
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform2f.glUniform2f
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform3f.glUniform3f
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform4f.glUniform4f
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform1i.glUniform1i
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform2i.glUniform2i
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform3i.glUniform3i
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform4i.glUniform4i
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform1ui.glUniform1ui
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform2ui.glUniform2ui
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform3ui.glUniform3ui
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform4ui.glUniform4ui
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform1fv.glUniform1fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform2fv.glUniform2fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform3fv.glUniform3fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform4fv.glUniform4fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform1iv.glUniform1iv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform2iv.glUniform2iv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform3iv.glUniform3iv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniform4iv.glUniform4iv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform1uiv.glUniform1uiv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform2uiv.glUniform2uiv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform3uiv.glUniform3uiv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniform4uiv.glUniform4uiv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniformMatrix2fv.glUniformMatrix2fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniformMatrix3fv.glUniformMatrix3fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glUniformMatrix4fv.glUniformMatrix4fv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniformMatrix2x3fv.glUniformMatrix2x3fv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniformMatrix3x2fv.glUniformMatrix3x2fv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniformMatrix2x4fv.glUniformMatrix2x4fv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniformMatrix4x2fv.glUniformMatrix4x2fv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniformMatrix3x4fv.glUniformMatrix3x4fv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUniformMatrix4x3fv.glUniformMatrix4x3fv
    */
    fun glUniformMatrix4x2fv(location: Int, count: UInt, transpose: Boolean, value: de.dasbabypixel.gamelauncher.buffers.FloatBufferRO)
}