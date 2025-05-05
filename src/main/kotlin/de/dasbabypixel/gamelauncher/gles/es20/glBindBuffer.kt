package de.dasbabypixel.gamelauncher.gles.es20

interface glBindBuffer {
    /**
    * Name
    * ----
    * 
    * glBindBuffer — bind a named buffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindBuffer**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint buffer`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which the buffer object is bound, which must be one of the buffer binding targets in the following table:
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
    * _`buffer`_
    * 
    * Specifies the name of a buffer object.
    * 
    * Description
    * -----------
    * 
    * `glBindBuffer` binds a buffer object to the specified buffer binding point. Calling `glBindBuffer` with _`target`_ set to one of the accepted symbolic constants and _`buffer`_ set to the name of a buffer object binds that buffer object name to the target. If no buffer object with name _`buffer`_ exists, one is created with that name. When a buffer object is bound to a target, the previous binding for that target is automatically broken.
    * 
    * Buffer object names are unsigned integers. The value zero is reserved, but there is no default buffer object for each buffer object target. Instead, _`buffer`_ set to zero effectively unbinds any buffer object previously bound, and restores client memory usage for that buffer object target (if supported for that target). Buffer object names and the corresponding buffer object contents are local to the shared object space of the current GL rendering context; two rendering contexts share buffer object names only if they explicitly enable sharing between contexts through the appropriate GL windows interfaces functions.
    * 
    * [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers] may be used to generate a set of unused buffer object names.
    * 
    * The state of a buffer object immediately after it is first bound is an unmapped zero-sized memory buffer with `GL_READ_WRITE` access and `GL_STATIC_DRAW` usage.
    * 
    * While a non-zero buffer object name is bound, GL operations on the target to which it is bound affect the bound buffer object, and queries of the target to which it is bound return state from the bound buffer object. While buffer object name zero is bound, as in the initial state, attempts to modify or query state on the target to which it is bound generates an `GL_INVALID_OPERATION` error.
    * 
    * When a non-zero buffer object is bound to the `GL_ARRAY_BUFFER` target, the vertex array pointer parameter is interpreted as an offset within the buffer object measured in basic machine units.
    * 
    * When a non-zero buffer object is bound to the `GL_DRAW_INDIRECT_BUFFER` target, parameters for draws issued through [glDrawArraysIndirect][de.dasbabypixel.gamelauncher.gles.es31.glDrawArraysIndirect.glDrawArraysIndirect] and [glDrawElementsIndirect][de.dasbabypixel.gamelauncher.gles.es31.glDrawElementsIndirect.glDrawElementsIndirect] are sourced from the specified offset in that buffer object's data store.
    * 
    * When a non-zero buffer object is bound to the `GL_DISPATCH_INDIRECT_BUFFER` target, the parameters for compute dispatches issued through [glDispatchComputeIndirect][de.dasbabypixel.gamelauncher.gles.es31.glDispatchComputeIndirect.glDispatchComputeIndirect] are sourced from the specified offset in that buffer object's data store.
    * 
    * While a non-zero buffer object is bound to the `GL_ELEMENT_ARRAY_BUFFER` target, the indices parameter of [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], offset within the buffer object measured in basic machine units.
    * 
    * While a non-zero buffer object is bound to the `GL_PIXEL_PACK_BUFFER` target, the following commands are affected: [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels]. The pointer parameter is interpreted as an offset within the buffer object measured in basic machine units.
    * 
    * While a non-zero buffer object is bound to the `GL_PIXEL_UNPACK_BUFFER` target, the following commands are affected: [glCompressedTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexImage2D.glCompressedTexImage2D], [glCompressedTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexImage3D.glCompressedTexImage3D], [glCompressedTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexSubImage2D.glCompressedTexSubImage2D], [glCompressedTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexSubImage3D.glCompressedTexSubImage3D], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], and [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D]. The pointer parameter is interpreted as an offset within the buffer object measured in basic machine units.
    * 
    * The buffer targets `GL_COPY_READ_BUFFER` and `GL_COPY_WRITE_BUFFER` are provided to allow [glCopyBufferSubData][de.dasbabypixel.gamelauncher.gles.es30.glCopyBufferSubData.glCopyBufferSubData] to be used without disturbing the state of other bindings. However, [glCopyBufferSubData][de.dasbabypixel.gamelauncher.gles.es30.glCopyBufferSubData.glCopyBufferSubData] may be used with any pair of buffer binding points.
    * 
    * The `GL_TRANSFORM_FEEDBACK_BUFFER` buffer binding point may be passed to `glBindBuffer`, but will not directly affect transform feedback state. Instead, the indexed `GL_TRANSFORM_FEEDBACK_BUFFER` bindings must be used through a call to [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase] or [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange]. This will affect the generic `GL_TRANSFORM_FEEDBACK_BUFFER` binding.
    * 
    * Likewise, the `GL_UNIFORM_BUFFER`, `GL_ATOMIC_COUNTER_BUFFER` and `GL_SHADER_STORAGE_BUFFER` buffer binding points may be used, but do not directly affect uniform buffer, atomic counter buffer or shader storage buffer state, respectively. [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase] or [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange] must be used to bind a buffer to an indexed uniform buffer, atomic counter buffer or shader storage buffer binding point.
    * 
    * A buffer object binding created with `glBindBuffer` remains active until a different buffer object name is bound to the same target, or until the bound buffer object is deleted with [glDeleteBuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers].
    * 
    * Once created, a named buffer object may be re-bound to any target as often as needed. However, the GL implementation may make choices about how to optimize the storage of a buffer object based on its initial binding target.
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
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the allowable values.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_ARRAY_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_ATOMIC_COUNTER_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_COPY_READ_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_COPY_WRITE_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DRAW_INDIRECT_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DISPATCH_INDIRECT_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_ELEMENT_ARRAY_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PIXEL_PACK_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PIXEL_UNPACK_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_SHADER_STORAGE_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_TEXTURE_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_TRANSFORM_FEEDBACK_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_UNIFORM_BUFFER_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindBuffer | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers], [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase], [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange], [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange], [glUnmapBuffer][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange], [glDeleteBuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glIsBuffer][de.dasbabypixel.gamelauncher.gles.es20.glIsBuffer.glIsBuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer
    */
    fun glBindBuffer(target: Int, buffer: UInt)
}