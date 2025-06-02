package de.dasbabypixel.gamelauncher.gles.es30

interface glMapBufferRange {
    /**
    * Name
    * ----
    * 
    * glMapBufferRange — map a section of a buffer object's data store
    * 
    * C Specification
    * ---------------
    * 
    * | `void ***glMapBufferRange**(` | GLenum target, |
    * | --- | --- |
    * |   | GLintptr offset, |
    * |   | GLsizeiptr length, |
    * |   | GLbitfield access`)`; |
    * 
    * | `GLboolean **glUnmapBuffer**(` | GLenum target`)`; |
    * | --- | --- |
    * 
    * Parameters for `glMapBufferRange`
    * ---------------------------------
    * 
    * _`target`_
    * 
    * Specifies the target to which the buffer object is bound for `glMapBufferRange`, which must be one of the buffer binding targets in the following table:
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
    * Specifies the starting offset within the buffer of the range to be mapped.
    * 
    * _`length`_
    * 
    * Specifies the length of the range to be mapped.
    * 
    * _`access`_
    * 
    * Specifies a combination of access flags indicating the desired access to the range.
    * 
    * Parameters for `glUnmapBuffer`
    * ------------------------------
    * 
    * _`target`_
    * 
    * Specifies a binding to which the target buffer is bound.
    * 
    * Description
    * -----------
    * 
    * `glMapBufferRange` maps all or part of the data store of a buffer object into the client's address space. _`target`_ specifies the target to which the buffer is bound and must be one of `GL_ARRAY_BUFFER`, `GL_ATOMIC_COUNTER_BUFFER`, `GL_COPY_READ_BUFFER`, `GL_COPY_WRITE_BUFFER`, `GL_DISPATCH_INDIRECT_BUFFER`, `GL_DRAW_INDIRECT_BUFFER`, `GL_ELEMENT_ARRAY_BUFFER`, `GL_PIXEL_PACK_BUFFER`, `GL_PIXEL_UNPACK_BUFFER`, `GL_SHADER_STORAGE_BUFFER`, `GL_TRANSFORM_FEEDBACK_BUFFER` or `GL_UNIFORM_BUFFER`. _`offset`_ and _`length`_ indicate the range of data in the buffer object that is to be mapped, in terms of basic machine units. _`access`_ is a bitfield containing flags which describe the requested mapping. These flags are described below.
    * 
    * If no error occurs, a pointer to the beginning of the mapped range is returned once all pending operations on that buffer have completed, and may be used to modify and/or query the corresponding range of the buffer, according to the following flag bits set in _`access`_:
    * 
    * *   `GL_MAP_READ_BIT` indicates that the returned pointer may be used to read buffer object data. No GL error is generated if the pointer is used to query a mapping which excludes this flag, but the result is undefined and system errors (possibly including program termination) may occur.
    * 
    * *   `GL_MAP_WRITE_BIT` indicates that the returned pointer may be used to modify buffer object data. No GL error is generated if the pointer is used to modify a mapping which excludes this flag, but the result is undefined and system errors (possibly including program termination) may occur.
    * 
    * 
    * Furthermore, the following _optional_ flag bits in _`access`_ may be used to modify the mapping:
    * 
    * *   `GL_MAP_INVALIDATE_RANGE_BIT` indicates that the previous contents of the specified range may be discarded. Data within this range are undefined with the exception of subsequently written data. No GL error is generated if subsequent GL operations access unwritten data, but the result is undefined and system errors (possibly including program termination) may occur. This flag may not be used in combination with `GL_MAP_READ_BIT`.
    * 
    * *   `GL_MAP_INVALIDATE_BUFFER_BIT` indicates that the previous contents of the entire buffer may be discarded. Data within the entire buffer are undefined with the exception of subsequently written data. No GL error is generated if subsequent GL operations access unwritten data, but the result is undefined and system errors (possibly including program termination) may occur. This flag may not be used in combination with `GL_MAP_READ_BIT`.
    * 
    * *   `GL_MAP_FLUSH_EXPLICIT_BIT` indicates that one or more discrete subranges of the mapping may be modified. When this flag is set, modifications to each subrange must be explicitly flushed by calling [glFlushMappedBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glFlushMappedBufferRange.glFlushMappedBufferRange]. No GL error is set if a subrange of the mapping is modified and not flushed, but data within the corresponding subrange of the buffer are undefined. This flag may only be used in conjunction with `GL_MAP_WRITE_BIT`. When this option is selected, flushing is strictly limited to regions that are explicitly indicated with calls to [glFlushMappedBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glFlushMappedBufferRange.glFlushMappedBufferRange] prior to unmap; if this option is not selected [glUnmapBuffer][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange] will automatically flush the entire mapped range when called.
    * 
    * *   `GL_MAP_UNSYNCHRONIZED_BIT` indicates that the GL should not attempt to synchronize pending operations on the buffer prior to returning from `glMapBufferRange`. No GL error is generated if pending operations which source or modify the buffer overlap the mapped region, but the result of such previous and any subsequent operations is undefined.
    * 
    * 
    * If an error occurs, `glMapBufferRange` returns a `NULL` pointer.
    * 
    * A mapped data store must be unmapped with `glUnmapBuffer` before its buffer object is used. Otherwise an error will be generated by any GL command that attempts to dereference the buffer object's data store. When a data store is unmapped, the pointer to its data store becomes invalid. `glUnmapBuffer` returns `GL_TRUE` unless the data store contents have become corrupt during the time the data store was mapped. This can occur for system-specific reasons that affect the availability of graphics memory, such as screen mode changes. In such situations, `GL_FALSE` is returned and the data store contents are undefined. An application must detect this rare condition and reinitialize the data store.
    * 
    * A buffer object's mapped data store is automatically unmapped when the buffer object is deleted or its data store is recreated with `glBufferData`.
    * 
    * Notes
    * -----
    * 
    * Mappings to the data stores of buffer objects may have nonstandard performance characteristics. For example, such mappings may be marked as uncacheable regions of memory, and in such cases reading from them may be very slow. To ensure optimal performance, the client should use the mapping in a fashion consistent with the values of `GL_BUFFER_USAGE` and _`access`_. Using a mapping in a fashion inconsistent with these values is liable to be multiple orders of magnitude slower than using normal memory.
    * 
    * The `GL_ATOMIC_COUNTER_BUFFER`, `GL_DISPATCH_INDIRECT_BUFFER`, `GL_DRAW_INDIRECT_BUFFER` and `GL_SHADER_STORAGE_BUFFER` targets are available only if the GL ES version is 3.1 or greater.
    * 
    * The `GL_TEXTURE_BUFFER` target is available only if the GL ES version is 3.2 or greater.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if either of _`offset`_ or _`length`_ is negative, or if _`offset`_ + _`length`_ is greater than the value of `GL_BUFFER_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`access`_ has any bits set other than those defined above.
    * 
    * `GL_INVALID_OPERATION` is generated for any of the following conditions:
    * 
    * *   The buffer is already in a mapped state.
    * 
    * *   Neither `GL_MAP_READ_BIT` or `GL_MAP_WRITE_BIT` is set.
    * 
    * *   `GL_MAP_READ_BIT` is set and any of `GL_MAP_INVALIDATE_RANGE_BIT`, `GL_MAP_INVALIDATE_BUFFER_BIT`, or `GL_MAP_UNSYNCHRONIZED_BIT` is set.
    * 
    * *   `GL_MAP_FLUSH_EXPLICIT_BIT` is set and `GL_MAP_WRITE_BIT` is not set.
    * 
    * 
    * `GL_OUT_OF_MEMORY` is generated if `glMapBufferRange` fails because memory for the mapping could not be obtained.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glMapBufferRange` | \- | ✔ | ✔ | ✔ |
    * | `glUnmapBuffer` | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer] [glFlushMappedBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glFlushMappedBufferRange.glFlushMappedBufferRange], [glUnmapBuffer][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange
    * @see de.dasbabypixel.gamelauncher.gles.es30.glUnmapBuffer.glUnmapBuffer
    */
    fun glMapBufferRange(target: Int, offset: Long, length: ULong, access: Int): de.dasbabypixel.gamelauncher.buffers.Buffer
}