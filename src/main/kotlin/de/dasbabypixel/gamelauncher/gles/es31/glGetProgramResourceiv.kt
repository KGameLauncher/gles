package de.dasbabypixel.gamelauncher.gles.es31

interface glGetProgramResourceiv {
    /**
    * Name
    * ----
    * 
    * glGetProgramResource — retrieve values for multiple properties of a single active resource within a program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetProgramResourceiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum programInterface, |
    * |   | GLuint index, |
    * |   | GLsizei propCount, |
    * |   | const GLenum \* props, |
    * |   | GLsizei bufSize, |
    * |   | GLsizei \* length, |
    * |   | GLint \* params`)`; |
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
    * Description
    * -----------
    * 
    * `glGetProgramResourceiv` returns values for multiple properties of a single active resource with an index of _`index`_ in the interface _`programInterface`_ of program object _`program`_. For each resource, values for _`propCount`_ properties specified by the array _`props`_ are returned. _`propCount`_ may not be zero. An error is generated if any value in _`props`_ is not one of the properties described immediately belowor if any value in _`props`_ is not allowed for _`programInterface`_. The set of allowed _`programInterface`_ values for each property can be found in the following table:
    * 
    * 
    * | Property | Supported Interfaces |
    * | --- | --- |
    * | `GL_NAME_LENGTH` | Any except `GL_ATOMIC_COUNTER_BUFFER` |
    * | `GL_TYPE` | `GL_UNIFORM`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT`, `GL_TRANSFORM_FEEDBACK_VARYING`, `GL_BUFFER_VARIABLE` |
    * | `GL_ARRAY_SIZE` | `GL_UNIFORM`, `GL_BUFFER_VARIABLE`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT`, `GL_TRANSFORM_FEEDBACK_VARYING` |
    * | `GL_OFFSET` | `GL_UNIFORM`, `GL_BUFFER_VARIABLE`, `GL_TRANSFORM_FEEDBACK_VARYING` |
    * | `GL_BLOCK_INDEX` | `GL_UNIFORM`, `GL_BUFFER_VARIABLE` |
    * | `GL_ARRAY_STRIDE` | `GL_UNIFORM`, `GL_BUFFER_VARIABLE` |
    * | `GL_MATRIX_STRIDE` | `GL_UNIFORM`, `GL_BUFFER_VARIABLE` |
    * | `GL_IS_ROW_MAJOR` | `GL_UNIFORM`, `GL_BUFFER_VARIABLE` |
    * | `GL_ATOMIC_COUNTER_BUFFER_INDEX` | `GL_UNIFORM` |
    * | `GL_BUFFER_BINDING` | `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BLOCK` |
    * | `GL_BUFFER_DATA_SIZE` | `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BLOCK` |
    * | `GL_NUM_ACTIVE_VARIABLES` | `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BLOCK` |
    * | `GL_ACTIVE_VARIABLES` | `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BLOCK` |
    * | `GL_REFERENCED_BY_VERTEX_SHADER` | `GL_UNIFORM`, `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BLOCK`, `GL_BUFFER_VARIABLE`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * | `GL_REFERENCED_BY_TESS_CONTROL_SHADER` | `GL_UNIFORM`, `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_SHADER`, `GL_SHADER_STORAGE_BLOCK`, `GL_BUFFER_VARIABLE`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * | `GL_REFERENCED_BY_TESS_EVALUATION_SHADER` | `GL_UNIFORM`, `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_SHADER`, `GL_SHADER_STORAGE_BLOCK`, `GL_BUFFER_VARIABLE`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * | `GL_REFERENCED_BY_GEOMETRY_SHADER` | `GL_UNIFORM`, `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_SHADER`, `GL_SHADER_STORAGE_BLOCK`, `GL_BUFFER_VARIABLE`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * | `GL_REFERENCED_BY_FRAGMENT_SHADER` | `GL_UNIFORM`, `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BLOCK`, `GL_BUFFER_VARIABLE`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * | `GL_REFERENCED_BY_COMPUTE_SHADER` | `GL_UNIFORM`, `GL_UNIFORM_BLOCK`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BLOCK`, `GL_BUFFER_VARIABLE`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * | `GL_TOP_LEVEL_ARRAY_SIZE` | `GL_BUFFER_VARIABLE` |
    * | `GL_TOP_LEVEL_ARRAY_STRIDE` | `GL_BUFFER_VARIABLE` |
    * | `GL_LOCATION` | `GL_UNIFORM`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * | `GL_LOCATION_INDEX` | `GL_PROGRAM_OUTPUT` |
    * | `GL_LOCATION_COMPONENT` | `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT` |
    * 
    * For the property `GL_NAME_LENGTH`, a single integer identifying the length of the name string associated with an active variable, interface block, or subroutine is written to _`params`_. The name length includes a terminating null character.
    * 
    * For the property `GL_TYPE`, a single integer identifying the type of an active variable is written to _`params`_. The integer returned is one of the values found in the table above.
    * 
    * For the property `GL_ARRAY_SIZE`, a single integer identifying the number of active array elements of an active variable is written to _`params`_. The array size returned is in units of the type associated with the property `GL_TYPE`. For active variables not corresponding to an array of basic types, the value zero is written to _`params`_.
    * 
    * For the property `GL_BLOCK_INDEX`, a single integer identifying the index of the active interface block containing an active variable is written to _`params`_. If the variable is not the member of an interface block, the value -1 is written to _`params`_.
    * 
    * For the property `GL_OFFSET`, a single integer identifying the offset of an active variable is written to _`params`_. For variables in the `GL_UNIFORM` and `GL_BUFFER_VARIABLE` interfaces that are backed by a buffer object, the value written is the offset of that variable relative to the base of the buffer range holding its value. For variables in the `GL_TRANSFORM_FEEDBACK_VARYING` interface, the value written is the offset in the transform feedback buffer storage assigned to each vertex captured in transform feedback mode where the value of the variable will be stored. Such offsets are assigned according to the variables position in the list of strings passed to [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings]. Offsets are expressed in basic machine units. For all variables not recorded in transform feedback mode, -1 is written to _`params`_.
    * 
    * For the property `GL_ARRAY_STRIDE`, a single integer identifying the stride between array elements in an active variable is written to _`params`_. For active variables declared as an array of basic types, the value written is the difference, in basic machine units, between the offsets of consecutive elements in an array. For active variables not declared as an array of basic types, zero is written to _`params`_. For active variables not backed by a buffer object, -1 is written to _`params`_, regardless of the variable type.
    * 
    * For the property `GL_MATRIX_STRIDE`, a single integer identifying the stride between columns of a column-major matrix or rows of a row-major matrix is written to _`params`_. For active variables declared a single matrix or array of matrices, the value written is the difference, in basic machine units, between the offsets of consecutive columns or rows in each matrix. For active variables not declared as a matrix or array of matrices, zero is written to _`params`_. For active variables not backed by a buffer object, -1 is written to _`params`_, regardless of the variable type.
    * 
    * For the property `GL_IS_ROW_MAJOR`, a single integer identifying whether an active variable is a row-major matrix is written to _`params`_. For active variables backed by a buffer object, declared as a single matrix or array of matrices, and stored in row-major order, one is written to _`params`_. For all other active variables, zero is written to _`params`_.
    * 
    * For the property `GL_ATOMIC_COUNTER_BUFFER_INDEX`, a single integer identifying the index of the active atomic counter buffer containing an active variable is written to _`params`_. If the variable is not an atomic counter uniform, the value -1 is written to _`params`_.
    * 
    * For the property `GL_BUFFER_BINDING`, to index of the buffer binding point associated with the active uniform block, shader storage block, atomic counter buffer or transform feedback buffer is written to _`params`_.
    * 
    * For the property `GL_BUFFER_DATA_SIZE`, then the implementation-dependent minimum total buffer object size, in basic machine units, required to hold all active variables associated with an active uniform block, shader storage block, or atomic counter buffer is written to _`params`_. If the final member of an active shader storage block is array with no declared size, the minimum buffer size is computed assuming the array was declared as an array with one element.
    * 
    * For the property `GL_NUM_ACTIVE_VARIABLES`, the number of active variables associated with an active uniform block, shader storage block, atomic counter buffer or transform feedback buffer is written to _`params`_.
    * 
    * For the property `GL_ACTIVE_VARIABLES`, an array of active variable indices associated with an active uniform block, shader storage block, atomic counter buffer or transform feedback buffer is written to _`params`_. The number of values written to _`params`_ for an active resource is given by the value of the property `GL_NUM_ACTIVE_VARIABLES` for the resource.
    * 
    * For the properties `GL_REFERENCED_BY_VERTEX_SHADER`, `GL_REFERENCED_BY_FRAGMENT_SHADER`, and `GL_REFERENCED_BY_COMPUTE_SHADER`, a single integer is written to _`params`_, identifying whether the active resource is referenced by the vertex, fragment or compute shaders, respectively, in the program object. The value one is written to _`params`_ if an active variable is referenced by the corresponding shader, or if an active uniform block, shader storage block, or atomic counter buffer contains at least one variable referenced by the corresponding shader. Otherwise, the value zero is written to _`params`_.
    * 
    * For the property `GL_TOP_LEVEL_ARRAY_SIZE`, a single integer identifying the number of active array elements of the top-level shader storage block member containing to the active variable is written to _`params`_. If the top-level block member is not declared as an array, the value one is written to _`params`_. If the top-level block member is an array with no declared size, the value zero is written to _`params`_.
    * 
    * For the property `GL_TOP_LEVEL_ARRAY_STRIDE`, a single integer identifying the stride between array elements of the top-level shader storage block member containing the active variable is written to _`params`_. For top-level block members declared as arrays, the value written is the difference, in basic machine units, between the offsets of the active variable for consecutive elements in the top-level array. For top-level block members not declared as an array, zero is written to _`params`_.
    * 
    * For the property `GL_LOCATION`, a single integer identifying the assigned location for an active uniform, input, output, or subroutine uniform variable is written to _`params`_. For input, output, or uniform variables with locations specified by a layout qualifier, the specified location is used. For vertex shader input or fragment shader output variables without a layout qualifier, the location assigned when a program is linked is written to _`params`_. For all other input and output variables, the value -1 is written to _`params`_. For uniforms in uniform blocks, the value -1 is written to _`params`_.
    * 
    * For the property `GL_LOCATION_INDEX`, a single integer identifying the fragment color index of an active fragment shader output variable is written to _`params`_. If the active variable is an output for a non-fragment shader, the value -1 will be written to _`params`_.
    * 
    * For the property `GL_LOCATION_COMPONENT`, a single integer indicating the first component of the location assigned to an active input or output variable is written to _`params`_. For input and output variables with a component specified by a `layout` qualifier, the specified component is written. For all other input and output variables, the value zero is written.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not the name of an existing program object.
    * 
    * `GL_INVALID_VALUE` is generated if _`propCount`_ is zero.
    * 
    * `GL_INVALID_ENUM` is generated if _`programInterface`_ is not one of the accepted interface types.
    * 
    * `GL_INVLALID_ENUM` is generated if any value in _`props`_ is not one of the accepted tokens for the interface _`programInterface`_
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetProgramResourceiv` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramResourceName][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceName.glGetProgramResourceName], [glGetProgramResourceIndex][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceIndex.glGetProgramResourceIndex], [glGetProgramResourceLocation][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceLocation.glGetProgramResourceLocation],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceiv.glGetProgramResourceiv
    */
    fun glGetProgramResourceiv(program: UInt, programInterface: Int, index: UInt, propCount: UInt, props: de.dasbabypixel.gamelauncher.buffers.IntBufferRO, bufSize: UInt, length: de.dasbabypixel.gamelauncher.buffers.IntBuffer, params: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}