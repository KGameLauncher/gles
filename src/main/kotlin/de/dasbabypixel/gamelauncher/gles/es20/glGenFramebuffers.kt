package de.dasbabypixel.gamelauncher.gles.es20

interface glGenFramebuffers {
    /**
    * Name
    * ----
    * 
    * glGenFramebuffers — generate framebuffer object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenFramebuffers**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*framebuffers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of framebuffer object names to generate.
    * 
    * _`framebuffers`_
    * 
    * Specifies an array in which the generated framebuffer object names are stored.
    * 
    * Description
    * -----------
    * 
    * `glGenFramebuffers` returns _`n`_ framebuffer object names in _`framebuffers`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenFramebuffers`.
    * 
    * Framebuffer object names returned by a call to `glGenFramebuffers` are not returned by subsequent calls, unless they are first deleted with [glDeleteFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteFramebuffers.glDeleteFramebuffers].
    * 
    * The names returned in _`framebuffers`_ are marked as used, for the purposes of `glGenFramebuffers` only, but they acquire state and type only when they are first bound.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glIsFramebuffer.glIsFramebuffer], [glGetFramebufferAttachmentParameteriv][de.dasbabypixel.gamelauncher.gles.es20.glGetFramebufferAttachmentParameteriv.glGetFramebufferAttachmentParameteriv]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenFramebuffers | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glDeleteFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteFramebuffers.glDeleteFramebuffers], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers
    */
    fun glGenFramebuffers(n: UInt, framebuffers: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}