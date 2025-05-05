package de.dasbabypixel.gamelauncher.gles.es20

interface glGetActiveUniform {
    /**
    * Name
    * ----
    * 
    * glGetActiveUniform — Returns information about an active uniform variable for the specified program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetActiveUniform**(` | GLuint program, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | GLsizei bufSize, |
    * |   | GLsizei \*length, |
    * |   | GLint \*size, |
    * |   | GLenum \*type, |
    * |   | GLchar \*name`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the program object to be queried.
    * 
    * _`index`_
    * 
    * Specifies the index of the uniform variable to be queried.
    * 
    * _`bufSize`_
    * 
    * Specifies the maximum number of characters OpenGL is allowed to write in the character buffer indicated by _`name`_.
    * 
    * _`length`_
    * 
    * Returns the number of characters actually written by OpenGL in the string indicated by _`name`_ (excluding the null terminator) if a value other than `NULL` is passed.
    * 
    * _`size`_
    * 
    * Returns the size of the uniform variable.
    * 
    * _`type`_
    * 
    * Returns the data type of the uniform variable.
    * 
    * _`name`_
    * 
    * Returns a null terminated string containing the name of the uniform variable.
    * 
    * Description
    * -----------
    * 
    * `glGetActiveUniform` returns information about an active uniform variable in the program object specified by _`program`_. The number of active uniform variables can be obtained by calling [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with the value `GL_ACTIVE_UNIFORMS`. A value of zero for _`index`_ selects the first active uniform variable. Permissible values for _`index`_ range from zero to the number of active uniform variables minus one.
    * 
    * Shaders may use either built-in uniform variables, user-defined uniform variables, or both. Built-in uniform variables have a prefix of "gl\_" and reference existing OpenGL state or values derived from such state (e.g., _`gl_DepthRange`_, see the OpenGL Shading Language specification for a complete list.) User-defined uniform variables have arbitrary names and obtain their values from the application through calls to [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f]. A uniform variable (either built-in or user-defined) is considered active if it is determined during the link operation that it may be accessed during program execution. Therefore, _`program`_ should have previously been the target of a call to [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], but it is not necessary for it to have been linked successfully.
    * 
    * The size of the character buffer required to store the longest uniform variable name in _`program`_ can be obtained by calling [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with the value `GL_ACTIVE_UNIFORM_MAX_LENGTH`. This value should be used to allocate a buffer of sufficient size to store the returned uniform variable name. The size of this character buffer is passed in _`bufSize`_, and a pointer to this character buffer is passed in _`name.`_
    * 
    * `glGetActiveUniform` returns the name of the uniform variable indicated by _`index`_, storing it in the character buffer specified by _`name`_. The string returned will be null terminated. The actual number of characters written into this buffer is returned in _`length`_, and this count does not include the null termination character. If the length of the returned string is not required, a value of `NULL` can be passed in the _`length`_ argument.
    * 
    * The _`type`_ argument will return a pointer to the uniform variable's data type. The symbolic constants returned for uniform types are shown in the table below.
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
    * If one or more elements of an array are active, the name of the array is returned in _`name`_, the type is returned in _`type`_, and the _`size`_ parameter returns the highest array element index used, plus one, as determined by the compiler and/or linker. Only one active uniform variable will be reported for a uniform array. If the active uniform is an array, the uniform name returned in _`name`_ will always be the name of the uniform array appended with "\[0\]".
    * 
    * Uniform variables that are declared as structures or arrays of structures will not be returned directly by this function. Instead, each of these uniform variables will be reduced to its fundamental components containing the "." and "\[\]" operators such that each of the names is valid as an argument to [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation]. Each of these reduced uniform variables is counted as one active uniform variable and is assigned an index. A valid name cannot be a structure, an array of structures, or a subcomponent of a vector or matrix.
    * 
    * The size of the uniform variable will be returned in _`size`_. Uniform variables other than arrays will have a size of 1. Structures and arrays of structures will be reduced as described earlier, such that each of the names returned will be a data type in the earlier list. If this reduction results in an array, the size returned will be as described for uniform arrays; otherwise, the size returned will be 1.
    * 
    * The list of active uniform variables may include both built-in uniform variables (which begin with the prefix "gl\_") as well as user-defined uniform variable names.
    * 
    * This function will return as much information as it can about the specified active uniform variable. If no information is available, _`length`_ will be 0, and _`name`_ will be an empty string. This situation could occur if this function is called after a link operation that failed. If an error occurs, the return values _`length`_, _`size`_, _`type`_, and _`name`_ will be unmodified.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not a value generated by OpenGL.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not a program object.
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to the number of active uniform variables in _`program`_.
    * 
    * `GL_INVALID_VALUE` is generated if _`bufSize`_ is less than 0.
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
    * | glGetActiveUniform | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformfv.glGetUniformfv], [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform
    */
    fun glGetActiveUniform(program: UInt, index: UInt, bufSize: UInt, length: java.nio.IntBuffer, size: java.nio.IntBuffer, type: java.nio.IntBuffer, name: String)
}