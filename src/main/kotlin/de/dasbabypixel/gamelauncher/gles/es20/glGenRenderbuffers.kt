package de.dasbabypixel.gamelauncher.gles.es20

interface glGenRenderbuffers {
    /**
    * Name
    * ----
    * 
    * glGenRenderbuffers — generate renderbuffer object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenRenderbuffers**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*renderbuffers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of renderbuffer object names to generate.
    * 
    * _`renderbuffers`_
    * 
    * Specifies an array in which the generated renderbuffer object names are stored.
    * 
    * Description
    * -----------
    * 
    * `glGenRenderbuffers` returns _`n`_ renderbuffer object names in _`renderbuffers`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenRenderbuffers`.
    * 
    * Renderbuffer object names returned by a call to `glGenRenderbuffers` are not returned by subsequent calls, unless they are first deleted with [glDeleteRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteRenderbuffers.glDeleteRenderbuffers].
    * 
    * The names returned in _`renderbuffers`_ are marked as used, for the purposes of `glGenRenderbuffers` only, but they acquire state and type only when they are first bound.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glIsRenderbuffer.glIsRenderbuffer], [glGetRenderbufferParameteriv][de.dasbabypixel.gamelauncher.gles.es20.glGetRenderbufferParameteriv.glGetRenderbufferParameteriv]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenRenderbuffers | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glDeleteRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteRenderbuffers.glDeleteRenderbuffers]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers
    */
    fun glGenRenderbuffers(n: UInt, renderbuffers: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}