package de.dasbabypixel.gamelauncher.gles.es30

interface glFlushMappedBufferRange {
    /**
    * Name
    * ----
    * 
    * glFlushMappedBufferRange — indicate modifications to a range of a mapped buffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glFlushMappedBufferRange**(` | GLenum target, |
    * | --- | --- |
    * |   | GLintptr offset, |
    * |   | GLsizeiptr length`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which the buffer object is bound for `glFlushMappedBufferRange`, which must be one of the buffer binding targets in the following table:
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
    * _`offset`_
    * 
    * Specifies the start of the buffer subrange, in basic machine units.
    * 
    * _`length`_
    * 
    * Specifies the length of the buffer subrange, in basic machine units.
    * 
    * Description
    * -----------
    * 
    * `glFlushMappedBufferRange` indicates that modifications have been made to a range of a mapped buffer. The buffer must previously have been mapped with the `GL_MAP_FLUSH_EXPLICIT` flag. _`offset`_ and _`length`_ indicate the modified subrange of the mapping, in basic units. The specified subrange to flush is relative to the start of the currently mapped range of the buffer. `glFlushMappedBufferRange` may be called multiple times to indicate distinct subranges of the mapping which require flushing.
    * 
    * Notes
    * -----
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
    * `GL_INVALID_VALUE` is generated if _`offset`_ or _`length`_ is negative, or if _`offset`_ + _`length`_ exceeds the size of the mapping.
    * 
    * `GL_INVALID_OPERATION` is generated if zero is bound to _`target`_.
    * 
    * `GL_INVALID_OPERATION` is generated if the buffer bound to _`target`_ is not mapped, or is mapped without the `GL_MAP_FLUSH_EXPLICIT` flag.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glFlushMappedBufferRange | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange], [glUnmapBuffer][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glFlushMappedBufferRange.glFlushMappedBufferRange
    */
    fun glFlushMappedBufferRange(target: Int, offset: Long, length: ULong)
}