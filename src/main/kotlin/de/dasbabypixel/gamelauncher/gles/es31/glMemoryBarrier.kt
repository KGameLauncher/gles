package de.dasbabypixel.gamelauncher.gles.es31

interface glMemoryBarrier {
    /**
    * Name
    * ----
    * 
    * glMemoryBarrier — defines a barrier ordering memory transactions
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glMemoryBarrier**(` | GLbitfield barriers`)`; |
    * | --- | --- |
    * 
    * | `void **glMemoryBarrierByRegion**(` | GLbitfield barriers`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`barriers`_
    * 
    * Specifies the barriers to insert. Must be a bitwise combination of `GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT`, `GL_ELEMENT_ARRAY_BARRIER_BIT`, `GL_UNIFORM_BARRIER_BIT`, `GL_TEXTURE_FETCH_BARRIER_BIT`, `GL_SHADER_IMAGE_ACCESS_BARRIER_BIT`, `GL_COMMAND_BARRIER_BIT`, `GL_PIXEL_BUFFER_BARRIER_BIT`, `GL_TEXTURE_UPDATE_BARRIER_BIT`, `GL_BUFFER_UPDATE_BARRIER_BIT`, `GL_FRAMEBUFFER_BARRIER_BIT`, `GL_TRANSFORM_FEEDBACK_BARRIER_BIT`, `GL_ATOMIC_COUNTER_BARRIER_BIT`, or `GL_SHADER_STORAGE_BARRIER_BIT`. If the special value `GL_ALL_BARRIER_BITS` is specified, all supported barriers will be inserted.
    * 
    * Description
    * -----------
    * 
    * `glMemoryBarrier` defines a barrier ordering the memory transactions issued prior to the command relative to those issued after the barrier. For the purposes of this ordering, memory transactions performed by shaders are considered to be issued by the rendering command that triggered the execution of the shader. _`barriers`_ is a bitfield indicating the set of operations that are synchronized with shader stores; the bits used in _`barriers`_ are as follows:
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT`
    * 
    * If set, vertex data sourced from buffer objects after the barrier will reflect data written by shaders prior to the barrier. The set of buffer objects affected by this bit is derived from the buffer object bindings used for generic vertex attributes derived from the `GL_VERTEX_ATTRIB_ARRAY_BUFFER` bindings.
    * 
    * `GL_ELEMENT_ARRAY_BARRIER_BIT`
    * 
    * If set, vertex array indices sourced from buffer objects after the barrier will reflect data written by shaders prior to the barrier. The buffer objects affected by this bit are derived from the `GL_ELEMENT_ARRAY_BUFFER` binding.
    * 
    * `GL_UNIFORM_BARRIER_BIT`
    * 
    * Shader uniforms sourced from buffer objects after the barrier will reflect data written by shaders prior to the barrier.
    * 
    * `GL_TEXTURE_FETCH_BARRIER_BIT`
    * 
    * Texture fetches from shaders, including fetches from buffer object memory via buffer textures after the barrier will reflect data written by shaders prior to the barrier.
    * 
    * `GL_SHADER_IMAGE_ACCESS_BARRIER_BIT`
    * 
    * Memory accesses using shader image load, store, and atomic built-in functions issued after the barrier will reflect data written by shaders prior to the barrier. Additionally, image stores and atomics issued after the barrier will not execute until all memory accesses (e.g., loads, stores, texture fetches, vertex fetches) initiated prior to the barrier complete.
    * 
    * `GL_COMMAND_BARRIER_BIT`
    * 
    * Command data sourced from buffer objects by Draw\*Indirect commands after the barrier will reflect data written by shaders prior to the barrier. The buffer objects affected by this bit are derived from the `GL_DRAW_INDIRECT_BUFFER` binding.
    * 
    * `GL_PIXEL_BUFFER_BARRIER_BIT`
    * 
    * Reads and writes of buffer objects via the `GL_PIXEL_PACK_BUFFER` and `GL_PIXEL_UNPACK_BUFFER` bindings (via [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels], [glTexSubImage](glTexSubImage.xhtml), etc.) after the barrier will reflect data written by shaders prior to the barrier. Additionally, buffer object writes issued after the barrier will wait on the completion of all shader writes initiated prior to the barrier.
    * 
    * `GL_TEXTURE_UPDATE_BARRIER_BIT`
    * 
    * Writes to a texture via `glTex(Sub)Image*`, `glCopyTex(Sub)Image*`, `glCompressedTex(Sub)Image*` after the barrier will reflect data written by shaders prior to the barrier. Additionally, texture writes from these commands issued after the barrier will not execute until all shader writes initiated prior to the barrier complete.
    * 
    * `GL_BUFFER_UPDATE_BARRIER_BIT`
    * 
    * Reads or writes via [glBufferSubData][de.dasbabypixel.gamelauncher.gles.es20.glBufferSubData.glBufferSubData], [glCopyBufferSubData][de.dasbabypixel.gamelauncher.gles.es30.glCopyBufferSubData.glCopyBufferSubData], or to buffer object memory mapped by [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange] after the barrier will reflect data written by shaders prior to the barrier. Additionally, writes via these commands issued after the barrier will wait on the completion of any shader writes to the same memory initiated prior to the barrier.
    * 
    * `GL_FRAMEBUFFER_BARRIER_BIT`
    * 
    * Reads and writes via framebuffer object attachments after the barrier will reflect data written by shaders prior to the barrier. Additionally, framebuffer writes issued after the barrier will wait on the completion of all shader writes issued prior to the barrier.
    * 
    * `GL_TRANSFORM_FEEDBACK_BARRIER_BIT`
    * 
    * Writes via transform feedback bindings after the barrier will reflect data written by shaders prior to the barrier. Additionally, transform feedback writes issued after the barrier will wait on the completion of all shader writes issued prior to the barrier.
    * 
    * `GL_ATOMIC_COUNTER_BARRIER_BIT`
    * 
    * Accesses to atomic counters after the barrier will reflect writes prior to the barrier.
    * 
    * `GL_SHADER_STORAGE_BARRIER_BIT`
    * 
    * Accesses to shader storage blocks after the barrier will reflect writes prior to the barrier.
    * 
    * If _`barriers`_ is `GL_ALL_BARRIER_BITS`, shader memory accesses will be synchronized relative to all the operations described above.
    * 
    * Implementations may cache buffer object and texture image memory that could be written by shaders in multiple caches; for example, there may be separate caches for texture, vertex fetching, and one or more caches for shader memory accesses. Implementations are not required to keep these caches coherent with shader memory writes. Stores issued by one invocation may not be immediately observable by other pipeline stages or other shader invocations because the value stored may remain in a cache local to the processor executing the store, or because data overwritten by the store is still in a cache elsewhere in the system. When `glMemoryBarrier` is called, the GL flushes and/or invalidates any caches relevant to the operations specified by the _`barriers`_ parameter to ensure consistent ordering of operations across the barrier.
    * 
    * To allow for independent shader invocations to communicate by reads and writes to a common memory address, image variables in the OpenGL ES Shading Language may be declared as "coherent". Buffer object or texture image memory accessed through such variables may be cached only if caches are automatically updated due to stores issued by any other shader invocation. If the same address is accessed using both coherent and non-coherent variables, the accesses using variables declared as coherent will observe the results stored using coherent variables in other invocations. Using variables declared as "coherent" guarantees only that the results of stores will be immediately visible to shader invocations using similarly-declared variables; calling `glMemoryBarrier` is required to ensure that the stores are visible to other operations.
    * 
    * The following guidelines may be helpful in choosing when to use coherent memory accesses and when to use barriers.
    * 
    * *   Data that are read-only or constant may be accessed without using coherent variables or calling MemoryBarrier(). Updates to the read-only data via API calls such as BufferSubData will invalidate shader caches implicitly as required.
    * 
    * *   Data that are shared between shader invocations at a fine granularity (e.g., written by one invocation, consumed by another invocation) should use coherent variables to read and write the shared data.
    * 
    * *   Data written by one shader invocation and consumed by other shader invocations launched as a result of its execution ("dependent invocations") should use coherent variables in the producing shader invocation and call memoryBarrier() after the last write. The consuming shader invocation should also use coherent variables.
    * 
    * *   Data written to image variables in one rendering pass and read by the shader in a later pass need not use coherent variables or memoryBarrier(). Calling MemoryBarrier() with the SHADER\_IMAGE\_ACCESS\_BARRIER\_BIT set in _`barriers`_ between passes is necessary.
    * 
    * *   Data written by the shader in one rendering pass and read by another mechanism (e.g., vertex or index buffer pulling) in a later pass need not use coherent variables or memoryBarrier(). Calling `glMemoryBarrier` with the appropriate bits set in _`barriers`_ between passes is necessary.
    * 
    * 
    * `glMemoryBarrierByRegion` behaves as per `glMemoryBarrier` with two differences:
    * 
    * *   The region under consideration is narrowed so that only reads/writes of prior fragment shaders that are invoked for a smaller region of the framebuffer will be completed/reflected prior to subsequent reads/write of following fragment shaders. The size of the region is implementation dependent and may be as small as one framebuffer pixel.
    * 
    * *   The barrier only applies to memory transactions that may be read by or written by a fragment shader. Therefore only the barrier bits `GL_ATOMIC_COUNTER_BARRIER_BIT`, `GL_FRAMEBUFFER_BARRIER_BIT`, `GL_SHADER_IMAGE_ACCESS_BARRIER_BIT`, `GL_SHADER_STORAGE_BARRIER_BIT`, `GL_TEXTURE_FETCH_BARRIER_BIT`, or `GL_UNIFORM_BARRIER_BIT` are supported.
    * 
    * 
    * When _`barriers`_ is `GL_ALL_BARRIER_BITS`, shader memory accesses will be synchronized relative to all the operations described immediately above, but not the wider list of operations described by `glMemoryBarrier`. This implies that reads/writes for scatter/gather-like algorithms may or may not be completed/reflected after a `glMemoryBarrierByRegion` command. However, for uses such as deferred shading, where a linked list of visible surfaces with the head at a framebuffer address may be constructed, and the entirety of the list is only dependent on previous executions at that framebuffer address, `glMemoryBarrierByRegion` may be significantly more efficient than `glMemoryBarrier`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`barriers`_ contains any unsupported bits, or is not the special value `GL_ALL_BARRIER_BITS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glMemoryBarrier` | \- | \- | ✔ | ✔ |
    * | `glMemoryBarrierByRegion` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindImageTexture][de.dasbabypixel.gamelauncher.gles.es31.glBindImageTexture.glBindImageTexture], [glBufferData][de.dasbabypixel.gamelauncher.gles.es20.glBufferData.glBufferData], [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange], [glFlushMappedBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glFlushMappedBufferRange.glFlushMappedBufferRange]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2011-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glMemoryBarrier.glMemoryBarrier
    * @see de.dasbabypixel.gamelauncher.gles.es31.glMemoryBarrierByRegion.glMemoryBarrierByRegion
    */
    fun glMemoryBarrier(barriers: Int)
}