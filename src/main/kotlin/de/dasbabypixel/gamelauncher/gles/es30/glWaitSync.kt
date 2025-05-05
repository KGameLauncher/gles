package de.dasbabypixel.gamelauncher.gles.es30

interface glWaitSync {
    /**
    * Name
    * ----
    * 
    * glWaitSync — instruct the GL server to block until the specified sync object becomes signaled
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glWaitSync**(` | GLsync sync, |
    * | --- | --- |
    * |   | GLbitfield flags, |
    * |   | GLuint64 timeout`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`sync`_
    * 
    * Specifies the sync object whose status to wait on.
    * 
    * _`flags`_
    * 
    * A bitfield controlling the command flushing behavior. _`flags`_ must be zero.
    * 
    * _`timeout`_
    * 
    * Specifies the timeout that the server should wait before continuing. _`timeout`_ must be `GL_TIMEOUT_IGNORED`.
    * 
    * Description
    * -----------
    * 
    * `glWaitSync` causes the GL server to block and wait until _`sync`_ becomes signaled. _`sync`_ is the name of an existing sync object upon which to wait. _`flags`_ and _`timeout`_ are currently not used and must be set to zero and the special value `GL_TIMEOUT_IGNORED`, respectively[\[1\]](#ftn.id-1.6.2.7). `glWaitSync` will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by calling [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with the parameter `GL_MAX_SERVER_WAIT_TIMEOUT`. There is currently no way to determine whether `glWaitSync` unblocked because the timeout expired or because the sync object being waited on was signaled.
    * 
    * If an error occurs, `glWaitSync` does not cause the GL server to block.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`sync`_ is not the name of a sync object.
    * 
    * `GL_INVALID_VALUE` is generated if _`flags`_ is not zero.
    * 
    * `GL_INVALID_VALUE` is generated if _`timeout`_ is not `GL_TIMEOUT_IGNORED`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glWaitSync | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFenceSync][de.dasbabypixel.gamelauncher.gles.es30.glFenceSync.glFenceSync], [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * 
    * 
    * * * *
    * 
    * [\[1\]](#id-1.6.2.7) _`flags`_ and _`timeout`_ are placeholders for anticipated future extensions of sync object capabilities. They must have these reserved values in order that existing code calling `glWaitSync` operate properly in the presence of such extensions.
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync
    */
    fun glWaitSync(sync: Long, flags: Int, timeout: ULong)
}