package de.dasbabypixel.gamelauncher.gles.es32

interface glTexBufferRange {
    /**
    * Name
    * ----
    * 
    * glTexBufferRange — attach a range of a buffer object's data store to a buffer texture object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glTexBufferRange**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum internalFormat, |
    * |   | GLuint buffer, |
    * |   | GLintptr offset, |
    * |   | GLsizeiptr size`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which the texture object is bound for `glTexBufferRange`. Must be `GL_TEXTURE_BUFFER`.
    * 
    * _`internalFormat`_
    * 
    * Specifies the internal format of the data in the store belonging to _`buffer`_.
    * 
    * _`buffer`_
    * 
    * Specifies the name of the buffer object whose storage to attach to the active buffer texture.
    * 
    * _`offset`_
    * 
    * Specifies the offset of the start of the range of the buffer's data store to attach.
    * 
    * _`size`_
    * 
    * Specifies the size of the range of the buffer's data store to attach.
    * 
    * Description
    * -----------
    * 
    * `glTexBufferRange` attaches a range of the data store of a specified buffer object to a specified texture object, and specify the storage format for the texture image found in the buffer object. The texture object must be a buffer texture.
    * 
    * If _`buffer`_ is zero, any buffer object attached to the buffer texture is detached and no new buffer object is attached. If _`buffer`_ is non-zero, it must be the name of an existing buffer object.
    * 
    * The start and size of the range are specified by _`offset`_ and _`size`_ respectively, both measured in basic machine units. _`offset`_ must be greater than or equal to zero, _`size`_ must be greater than zero, and the sum of _`offset`_ and _`size`_ must not exceed the value of `GL_BUFFER_SIZE` for _`buffer`_. Furthermore, _`offset`_ must be an integer multiple of the value of `GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT`.
    * 
    * _`internalformat`_ specifies the storage format, and must be one of the following sized internal formats:
    * 
       
    * |   |   |   |   | **Component** |  |  |  |
    * | --- | --- | --- | --- | --- | --- | --- | --- |
    * | **Sized Internal Format** | **Base Type** | **Components** | **Norm** | 0 | 1 | 2 | 3 |
    * | `GL_R8` | ubyte | 1 | YES | R | 0 | 0 | 1 |
    * | `GL_R16` | ushort | 1 | YES | R | 0 | 0 | 1 |
    * | `GL_R16F` | half | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_R32F` | float | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_R8I` | byte | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_R16I` | short | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_R32I` | int | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_R8UI` | ubyte | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_R16UI` | ushort | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_R32UI` | uint | 1 | NO | R | 0 | 0 | 1 |
    * | `GL_RG8` | ubyte | 2 | YES | R | G | 0 | 1 |
    * | `GL_RG16` | ushort | 2 | YES | R | G | 0 | 1 |
    * | `GL_RG16F` | half | 2 | NO | R | G | 0 | 1 |
    * | `GL_RG32F` | float | 2 | NO | R | G | 0 | 1 |
    * | `GL_RG8I` | byte | 2 | NO | R | G | 0 | 1 |
    * | `GL_RG16I` | short | 2 | NO | R | G | 0 | 1 |
    * | `GL_RG32I` | int | 2 | NO | R | G | 0 | 1 |
    * | `GL_RG8UI` | ubyte | 2 | NO | R | G | 0 | 1 |
    * | `GL_RG16UI` | ushort | 2 | NO | R | G | 0 | 1 |
    * | `GL_RG32UI` | uint | 2 | NO | R | G | 0 | 1 |
    * | `GL_RGB32F` | float | 3 | NO | R | G | B | 1 |
    * | `GL_RGB32I` | int | 3 | NO | R | G | B | 1 |
    * | `GL_RGB32UI` | uint | 3 | NO | R | G | B | 1 |
    * | `GL_RGBA8` | uint | 4 | YES | R | G | B | A |
    * | `GL_RGBA16` | short | 4 | YES | R | G | B | A |
    * | `GL_RGBA16F` | half | 4 | NO | R | G | B | A |
    * | `GL_RGBA32F` | float | 4 | NO | R | G | B | A |
    * | `GL_RGBA8I` | byte | 4 | NO | R | G | B | A |
    * | `GL_RGBA16I` | short | 4 | NO | R | G | B | A |
    * | `GL_RGBA32I` | int | 4 | NO | R | G | B | A |
    * | `GL_RGBA8UI` | ubyte | 4 | NO | R | G | B | A |
    * | `GL_RGBA16UI` | ushort | 4 | NO | R | G | B | A |
    * | `GL_RGBA32UI` | uint | 4 | NO | R | G | B | A |
    * 
    * When a range of a buffer object is attached to a buffer texture, the specified range of the buffer object's data store is taken as the texture's texel array. The number of texels in the buffer texture's texel array is given by $$ \\left\\lfloor { size \\over { components \\times sizeof(base\\\_type) } } \\right\\rfloor $$ where $components$ and $base\\\_type$ are the element count and base data type for elements, as specified in the table above. The number of texels in the texel array is then clamped to the value of the implementation-dependent limit `GL_MAX_TEXTURE_BUFFER_SIZE`. When a buffer texture is accessed in a shader, the results of a texel fetch are undefined if the specified texel coordinate is negative, or greater than or equal to the clamped number of texels in the texel array.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated by `glTexBufferRange` if _`target`_ is not `GL_TEXTURE_BUFFER`.
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not one of the sized internal formats described above.
    * 
    * `GL_INVALID_OPERATION` is generated if _`buffer`_ is not zero and is not the name of an existing buffer object.
    * 
    * `GL_INVALID_VALUE` is generated if _`offset`_ is negative, if _`size`_ is less than or equal to zero, or if _`offset`_ + _`size`_ is greater than the value of `GL_BUFFER_SIZE` for _`buffer`_.
    * 
    * `GL_INVALID_VALUE` is generated if _`offset`_ is not an integer multiple of the value of `GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT`
    * 
    * [glGetTexLevelParameter][de.dasbabypixel.gamelauncher.gles.es31.glGetTexLevelParameterfv.glGetTexLevelParameterfv] with arguments `GL_TEXTURE_BUFFER_OFFSET` or `GL_TEXTURE_BUFFER_SIZE`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glTexBufferRange` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glTexBuffer][de.dasbabypixel.gamelauncher.gles.es32.glTexBuffer.glTexBuffer].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glTexBufferRange.glTexBufferRange
    */
    fun glTexBufferRange(target: Int, internalFormat: Int, buffer: UInt, offset: Long, size: ULong)
}