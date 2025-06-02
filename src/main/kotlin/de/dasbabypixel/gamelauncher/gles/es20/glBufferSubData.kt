package de.dasbabypixel.gamelauncher.gles.es20

interface glBufferSubData {
    /**
    * Name
    * ----
    * 
    * glBufferSubData — updates a subset of a buffer object's data store
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBufferSubData**(` | GLenum target, |
    * | --- | --- |
    * |   | GLintptr offset, |
    * |   | GLsizeiptr size, |
    * |   | const void \* data`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which the buffer object is bound for `glBufferSubData`, which must be one of the buffer binding targets in the following table:
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
    * Specifies the offset into the buffer object's data store where data replacement will begin, measured in bytes.
    * 
    * _`size`_
    * 
    * Specifies the size in bytes of the data store region being replaced.
    * 
    * _`data`_
    * 
    * Specifies a pointer to the new data that will be copied into the data store.
    * 
    * Description
    * -----------
    * 
    * `glBufferSubData` redefines some or all of the data store for the buffer object currently bound to _`target`_. Data starting at byte offset _`offset`_ and extending for _`size`_ bytes is copied to the data store from the memory pointed to by _`data`_. An error is thrown if _`offset`_ and _`size`_ together define a range beyond the bounds of the buffer object's data store.
    * 
    * Notes
    * -----
    * 
    * When replacing the entire data store, consider using `glBufferSubData` rather than completely recreating the data store with `glBufferData`. This avoids the cost of reallocating the data store.
    * 
    * Consider using multiple buffer objects to avoid stalling the rendering pipeline during data store updates. If any rendering in the pipeline makes reference to data in the buffer object being updated by `glBufferSubData`, especially from the specific region being updated, that rendering must drain from the pipeline before the data store can be updated.
    * 
    * Clients must align data elements consistently with the requirements of the client platform, with an additional base-level requirement that an offset within a buffer to a datum comprising N bytes be a multiple of N.
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
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted buffer targets.
    * 
    * `GL_INVALID_VALUE` is generated if _`offset`_ or _`size`_ is negative, or if together they define a region of memory that extends beyond the buffer object's allocated data store.
    * 
    * `GL_INVALID_OPERATION` is generated if the reserved buffer object name 0 is bound to _`target`_.
    * 
    * `GL_INVALID_OPERATION` is generated if the buffer object being updated is mapped.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBufferSubData | ✔ | ✔ | ✔ | ✔ |
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
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBufferSubData.glBufferSubData
    */
    fun glBufferSubData(target: Int, offset: Long, size: ULong, data: de.dasbabypixel.gamelauncher.buffers.BufferRO)
}