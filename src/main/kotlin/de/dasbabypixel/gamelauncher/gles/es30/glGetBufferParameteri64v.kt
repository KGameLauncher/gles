package de.dasbabypixel.gamelauncher.gles.es30

interface glGetBufferParameteri64v {
    /**
    * Name
    * ----
    * 
    * glGetBufferParameter — return parameters of a buffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetBufferParameteriv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum value, |
    * |   | GLint \* data`)`; |
    * 
    * | `void **glGetBufferParameteri64v**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum value, |
    * |   | GLint64 \* data`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which the buffer object is bound for `glGetBufferParameteriv` and `glGetBufferParameteri64v`. Must be one of the buffer binding targets in the following table:
    * 
    * 
    * | **Buffer Binding Target** | **Purpose** |
    * | --- | --- |
    * | `GL_ARRAY_BUFFER` | Vertex attributes |
    * | `GL_ATOMIC_COUNTER_BUFFER` | Atomic counter storage |
    * | `GL_COPY_READ_BUFFER` | Buffer copy source |
    * | `GL_COPY_WRITE_BUFFER` | Buffer copy destination |
    * | `GL_DISPATCH_INDIRECT_BUFFER` | Indirect compute dispatch commands |
    * | `GL_DRAW_INDIRECT_BUFFER` | Indirect command arguments |
    * | `GL_ELEMENT_ARRAY_BUFFER` | Vertex array indices |
    * | `GL_PIXEL_PACK_BUFFER` | Pixel read target |
    * | `GL_PIXEL_UNPACK_BUFFER` | Texture data source |
    * | `GL_SHADER_STORAGE_BUFFER` | Read-write storage for shaders |
    * | `GL_TEXTURE_BUFFER` | Texture data buffer |
    * | `GL_TRANSFORM_FEEDBACK_BUFFER` | Transform feedback buffer |
    * | `GL_UNIFORM_BUFFER` | Uniform block storage |
    * 
    * _`value`_
    * 
    * Specifies the symbolic name of a buffer object parameter. Accepted values are `GL_BUFFER_ACCESS_FLAGS`, `GL_BUFFER_MAPPED`, `GL_BUFFER_MAP_LENGTH`, `GL_BUFFER_MAP_OFFSET`, `GL_BUFFER_SIZE`, or `GL_BUFFER_USAGE`.
    * 
    * _`data`_
    * 
    * Returns the requested parameter.
    * 
    * Description
    * -----------
    * 
    * `glGetBufferParameteriv` and `glGetBufferParameteri64v` return in _`data`_ a selected parameter of the buffer object specified by _`target`_.
    * 
    * _`value`_ names a specific buffer object parameter, as follows:
    * 
    * `GL_BUFFER_ACCESS_FLAGS`
    * 
    * _`params`_ returns the access policy set while mapping the buffer object.
    * 
    * `GL_BUFFER_MAPPED`
    * 
    * _`params`_ returns a flag indicating whether the buffer object is currently mapped. The initial value is `GL_FALSE`.
    * 
    * `GL_BUFFER_MAP_LENGTH`
    * 
    * _`params`_ returns the length of the buffer object mapping, measured in bytes. The initial value is 0.
    * 
    * `GL_BUFFER_MAP_OFFSET`
    * 
    * _`params`_ returns the offset (start) of the buffer object mapping, measured in bytes. The initial value is 0.
    * 
    * `GL_BUFFER_SIZE`
    * 
    * _`params`_ returns the size of the buffer object, measured in bytes. The initial value is 0.
    * 
    * `GL_BUFFER_USAGE`
    * 
    * _`params`_ returns the buffer object's usage pattern.
    * 
    * Notes
    * -----
    * 
    * If an error is generated, no change is made to the contents of _`data`_.
    * 
    * If `glGetBufferParameteriv` is used to query a _`value`_ of `GL_BUFFER_SIZE`, values greater than or equal to 2 31 will be clamped to 2 31 \- 1 .
    * 
    * The `GL_COPY_READ_BUFFER`, `GL_COPY_WRITE_BUFFER`, `GL_PIXEL_PACK_BUFFER`,`GL_PIXEL_UNPACK_READ_BUFFER`, `GL_TRANSFORM_FEEDBACK_BUFFER` and `GL_UNIFORM_BUFFER` targets are available only if the GL ES version is 3.0 or greater.
    * 
    * The `GL_ATOMIC_COUNTER_BUFFER`, `GL_DISPATCH_INDIRECT_BUFFER`, `GL_DRAW_INDIRECT_BUFFER` and `GL_SHADER_STORAGE_BUFFER` targets are available only if the GL ES version is 3.1 or greater.
    * 
    * The `GL_TEXTURE_BUFFER` target is available only if the GL ES version is 3.2 or greater.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ or _`value`_ is not an accepted value.
    * 
    * `GL_INVALID_OPERATION` is generated if the reserved buffer object name 0 is bound to _`target`_.
    * 
    * `GL_INVALID_ENUM` is generated if `glGetBufferParameteri64v` is used to query a _`value`_ of `GL_BUFFER_ACCESS_FLAGS`, `GL_BUFFER_MAPPED` or `GL_BUFFER_USAGE`.
    * 
    * `GL_INVALID_ENUM` is generated if `glGetBufferParameteriv` is used to query a _`value`_ of `GL_BUFFER_MAP_LENGTH` or `GL_BUFFER_MAP_OFFSET`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetBufferParameteriv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetBufferParameteri64v` | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBufferData][de.dasbabypixel.gamelauncher.gles.es20.glBufferData.glBufferData], [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange], [glUnmapBuffer][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetBufferParameteriv.glGetBufferParameteriv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetBufferParameteri64v.glGetBufferParameteri64v
    */
    fun glGetBufferParameteri64v(target: Int, value: Int, data: java.nio.LongBuffer)
}