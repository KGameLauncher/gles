package de.dasbabypixel.gamelauncher.gles.es30

interface glGetActiveUniformsiv {
    /**
    * Name
    * ----
    * 
    * glGetActiveUniformsiv — Returns information about several active uniform variables for the specified program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetActiveUniformsiv**(` | GLuint program, |
    * | --- | --- |
    * |   | GLsizei uniformCount, |
    * |   | const GLuint \*uniformIndices, |
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
    * _`uniformCount`_
    * 
    * Specifies both the number of elements in the array of indices _`uniformIndices`_ and the number of parameters written to _`params`_ upon successful return.
    * 
    * _`uniformIndices`_
    * 
    * Specifies the address of an array of _`uniformCount`_ integers containing the indices of uniforms within _`program`_ whose parameter _`pname`_ should be queried.
    * 
    * _`pname`_
    * 
    * Specifies the property of each uniform in _`uniformIndices`_ that should be written into the corresponding element of _`params`_.
    * 
    * _`params`_
    * 
    * Specifies the address of an array of _`uniformCount`_ integers which are to receive the value of _`pname`_ for each uniform in _`uniformIndices`_.
    * 
    * Description
    * -----------
    * 
    * `glGetActiveUniformsiv` queries the value of the parameter named _`pname`_ for each of the uniforms within _`program`_ whose indices are specified in the array of _`uniformCount`_ unsigned integers _`uniformIndices`_. Upon success, the value of the parameter for each uniform is written into the corresponding entry in the array whose address is given in _`params`_. If an error is generated, nothing is written into _`params`_.
    * 
    * If _`pname`_ is `GL_UNIFORM_TYPE`, then an array identifying the types of uniforms specified by the corresponding array of _`uniformIndices`_ is returned. The returned types can be any of the values from the following table:
    * 
    * 
    * | **Returned Symbolic Contant** | **Shader Uniform Type** |
    * | --- | --- |
    * | `GL_FLOAT` | `float` |
    * | `GL_FLOAT_VEC2` | `vec2` |
    * | `GL_FLOAT_VEC3` | `vec3` |
    * | `GL_FLOAT_VEC4` | `vec4` |
    * | `GL_INT` | `int` |
    * | `GL_INT_VEC2` | `ivec2` |
    * | `GL_INT_VEC3` | `ivec3` |
    * | `GL_INT_VEC4` | `ivec4` |
    * | `GL_UNSIGNED_INT` | `unsigned int` |
    * | `GL_UNSIGNED_INT_VEC2` | `uvec2` |
    * | `GL_UNSIGNED_INT_VEC3` | `uvec3` |
    * | `GL_UNSIGNED_INT_VEC4` | `uvec4` |
    * | `GL_BOOL` | `bool` |
    * | `GL_BOOL_VEC2` | `bvec2` |
    * | `GL_BOOL_VEC3` | `bvec3` |
    * | `GL_BOOL_VEC4` | `bvec4` |
    * | `GL_FLOAT_MAT2` | `mat2` |
    * | `GL_FLOAT_MAT3` | `mat3` |
    * | `GL_FLOAT_MAT4` | `mat4` |
    * | `GL_FLOAT_MAT2x3` | `mat2x3` |
    * | `GL_FLOAT_MAT2x4` | `mat2x4` |
    * | `GL_FLOAT_MAT3x2` | `mat3x2` |
    * | `GL_FLOAT_MAT3x4` | `mat3x4` |
    * | `GL_FLOAT_MAT4x2` | `mat4x2` |
    * | `GL_FLOAT_MAT4x3` | `mat4x3` |
    * | `GL_SAMPLER_2D` | `sampler2D` |
    * | `GL_SAMPLER_3D` | `sampler3D` |
    * | `GL_SAMPLER_CUBE` | `samplerCube` |
    * | `GL_SAMPLER_2D_SHADOW` | `sampler2DShadow` |
    * | `GL_SAMPLER_2D_ARRAY` | `sampler2DArray` |
    * | `GL_SAMPLER_2D_ARRAY_SHADOW` | `sampler2DArrayShadow` |
    * | `GL_SAMPLER_2D_MULTISAMPLE` | `sampler2DMS` |
    * | `GL_SAMPLER_2D_MULTISAMPLE_ARRAY` | `sampler2DMSArray` |
    * | `GL_SAMPLER_CUBE_SHADOW` | `samplerCubeShadow` |
    * | `GL_SAMPLER_CUBE_MAP_ARRAY` | `samplerCubeArray` |
    * | `GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW` | `samplerCubeArrayShadow` |
    * | `GL_SAMPLER_BUFFER` | `samplerBuffer` |
    * | `GL_INT_SAMPLER_2D` | `isampler2D` |
    * | `GL_INT_SAMPLER_3D` | `isampler3D` |
    * | `GL_INT_SAMPLER_CUBE` | `isamplerCube` |
    * | `GL_INT_SAMPLER_2D_ARRAY` | `isampler2DArray` |
    * | `GL_INT_SAMPLER_2D_MULTISAMPLE` | `isampler2DMS` |
    * | `GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY` | `isampler2DMSArray` |
    * | `GL_INT_SAMPLER_CUBE_MAP_ARRAY` | `isamplerCubeArray` |
    * | `GL_INT_SAMPLER_BUFFER` | `isamplerBuffer` |
    * | `GL_UNSIGNED_INT_SAMPLER_2D` | `usampler2D` |
    * | `GL_UNSIGNED_INT_SAMPLER_3D` | `usampler3D` |
    * | `GL_UNSIGNED_INT_SAMPLER_CUBE` | `usamplerCube` |
    * | `GL_UNSIGNED_INT_SAMPLER_2D_ARRAY` | `usampler2DArray` |
    * | `GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE` | `usampler2DMS` |
    * | `GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY` | `usampler2DMSArray` |
    * | `GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY` | `usamplerCubeArray` |
    * | `GL_UNSIGNED_INT_SAMPLER_BUFFER` | `usamplerBuffer` |
    * | `GL_IMAGE_2D` | `image2D` |
    * | `GL_IMAGE_3D` | `image3D` |
    * | `GL_IMAGE_CUBE` | `imageCube` |
    * | `GL_IMAGE_2D_ARRAY` | `image2DArray` |
    * | `GL_IMAGE_CUBE_MAP_ARRAY` | `imageCubeArray` |
    * | `GL_IMAGE_BUFFER` | `imageBuffer` |
    * | `GL_INT_IMAGE_2D` | `iimage2D` |
    * | `GL_INT_IMAGE_3D` | `iimage3D` |
    * | `GL_INT_IMAGE_CUBE` | `iimageCube` |
    * | `GL_INT_IMAGE_2D_ARRAY` | `iimage2DArray` |
    * | `GL_INT_IMAGE_CUBE_MAP_ARRAY` | `iimageCubeArray` |
    * | `GL_INT_IMAGE_BUFFER` | `iimageBuffer` |
    * | `GL_UNSIGNED_INT_IMAGE_2D` | `uimage2D` |
    * | `GL_UNSIGNED_INT_IMAGE_3D` | `uimage3D` |
    * | `GL_UNSIGNED_INT_IMAGE_CUBE` | `uimageCube` |
    * | `GL_UNSIGNED_INT_IMAGE_2D_ARRAY` | `uimage2DArray` |
    * | `GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY` | `uimageCubeArray` |
    * | `GL_UNSIGNED_INT_IMAGE_BUFFER` | `uimageBuffer` |
    * | `GL_UNSIGNED_INT_ATOMIC_COUNTER` | `atomic_uint` |
    * 
    * If _`pname`_ is `GL_UNIFORM_SIZE`, then an array identifying the size of the uniforms specified by the corresponding array of _`uniformIndices`_ is returned. The sizes returned are in units of the type returned by a query of `GL_UNIFORM_TYPE`. For active uniforms that are arrays, the size is the number of active elements in the array; for all other uniforms, the size is one.
    * 
    * If _`pname`_ is `GL_UNIFORM_NAME_LENGTH`, then an array identifying the length, including the terminating null character, of the uniform name strings specified by the corresponding array of _`uniformIndices`_ is returned.
    * 
    * If _`pname`_ is `GL_UNIFORM_BLOCK_INDEX`, then an array identifying the uniform block index of each of the uniforms specified by the corresponding array of _`uniformIndices`_ is returned. The uniform block index of a uniform associated with the default uniform block is -1.
    * 
    * If _`pname`_ is `GL_UNIFORM_OFFSET`, then an array of uniform buffer offsets is returned. For uniforms in a named uniform block, the returned value will be its offset, in basic machine units, relative to the beginning of the uniform block in the buffer object data store. For uniforms in the default uniform block, -1 will be returned.
    * 
    * If _`pname`_ is `GL_UNIFORM_ARRAY_STRIDE`, then an array identifying the stride between elements, in basic machine units, of each of the uniforms specified by the corresponding array of _`uniformIndices`_ is returned. The stride of a uniform associated with the default uniform block is -1. Note that this information only makes sense for uniforms that are arrays. For uniforms that are not arrays, but are declared in a named uniform block, an array stride of zero is returned.
    * 
    * If _`pname`_ is `GL_UNIFORM_MATRIX_STRIDE`, then an array identifying the stride between columns of a column-major matrix or rows of a row-major matrix, in basic machine units, of each of the uniforms specified by the corresponding array of _`uniformIndices`_ is returned. The matrix stride of a uniform associated with the default uniform block is -1. Note that this information only makes sense for uniforms that are matrices. For uniforms that are not matrices, but are declared in a named uniform block, a matrix stride of zero is returned.
    * 
    * If _`pname`_ is `GL_UNIFORM_IS_ROW_MAJOR`, then an array identifying whether each of the uniforms specified by the corresponding array of _`uniformIndices`_ is a row-major matrix or not is returned. A value of one indicates a row-major matrix, and a value of zero indicates a column-major matrix, a matrix in the default uniform block, or a non-matrix.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not a value generated by OpenGL.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not a program object.
    * 
    * `GL_INVALID_VALUE` is generated if _`uniformCount`_ is greater than or equal to the value of `GL_ACTIVE_UNIFORMS` for _`program`_.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted token.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VERTEX_UNIFORM_COMPONENTS`, `GL_MAX_FRAGMENT_UNIFORM_COMPONENTS`, `GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS`, or `GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS`.
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with argument `GL_ACTIVE_UNIFORMS` or `GL_ACTIVE_UNIFORM_MAX_LENGTH`.
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
    * | glGetActiveUniformsiv | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformfv.glGetUniformfv], [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform], [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetActiveUniformsiv.glGetActiveUniformsiv
    */
    fun glGetActiveUniformsiv(program: UInt, uniformCount: UInt, uniformIndices: de.dasbabypixel.gamelauncher.buffers.IntBufferRO, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}