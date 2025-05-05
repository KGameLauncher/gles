package de.dasbabypixel.gamelauncher.gles.es30

interface glClientWaitSync {
    /**
    * Name
    * ----
    * 
    * glClientWaitSync — block and wait for a sync object to become signaled
    * 
    * C Specification
    * ---------------
    * 
    * | `GLenum **glClientWaitSync**(` | GLsync sync, |
    * | --- | --- |
    * |   | GLbitfield flags, |
    * |   | GLuint64 timeout`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`sync`_
    * 
    * The sync object whose status to wait on.
    * 
    * _`flags`_
    * 
    * A bitfield controlling the command flushing behavior. _`flags`_ may be `GL_SYNC_FLUSH_COMMANDS_BIT`.
    * 
    * _`timeout`_
    * 
    * The timeout, specified in nanoseconds, for which the implementation should wait for _`sync`_ to become signaled.
    * 
    * Description
    * -----------
    * 
    * `glClientWaitSync` causes the client to block and wait for the sync object specified by _`sync`_ to become signaled. If _`sync`_ is signaled when `glClientWaitSync` is called, `glClientWaitSync` returns immediately, otherwise it will block and wait for up to _`timeout`_ nanoseconds for _`sync`_ to become signaled.
    * 
    * The return value is one of four status values:
    * 
    * *   `GL_ALREADY_SIGNALED` indicates that _`sync`_ was signaled at the time that `glClientWaitSync` was called.
    * 
    * *   `GL_TIMEOUT_EXPIRED` indicates that at least _`timeout`_ nanoseconds passed and _`sync`_ did not become signaled.
    * 
    * *   `GL_CONDITION_SATISFIED` indicates that _`sync`_ was signaled before the timeout expired.
    * 
    * *   `GL_WAIT_FAILED` indicates that an error occurred. Additionally, an OpenGL error will be generated.
    * 
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`sync`_ is not the name of an existing sync object.
    * 
    * `GL_INVALID_VALUE` is generated if _`flags`_ contains any unsupported flag.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glClientWaitSync | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFenceSync][de.dasbabypixel.gamelauncher.gles.es30.glFenceSync.glFenceSync], [glIsSync][de.dasbabypixel.gamelauncher.gles.es30.glIsSync.glIsSync] [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync
    */
    fun glClientWaitSync(sync: Long, flags: Int, timeout: ULong): Int
}