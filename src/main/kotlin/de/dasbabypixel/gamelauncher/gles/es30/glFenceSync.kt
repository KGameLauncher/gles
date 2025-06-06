package de.dasbabypixel.gamelauncher.gles.es30

interface glFenceSync {
    /**
    * Name
    * ----
    * 
    * glFenceSync — create a new sync object and insert it into the GL command stream
    * 
    * C Specification
    * ---------------
    * 
    * | `GLsync **glFenceSync**(` | GLenum condition, |
    * | --- | --- |
    * |   | GLbitfield flags`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`condition`_
    * 
    * Specifies the condition that must be met to set the sync object's state to signaled. _`condition`_ must be `GL_SYNC_GPU_COMMANDS_COMPLETE`.
    * 
    * _`flags`_
    * 
    * Specifies a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and _`flags`_ must be zero.[\[1\]](#ftn.id-1.5.2.2.2.1.2)
    * 
    * Description
    * -----------
    * 
    * `glFenceSync` creates a new fence sync object, inserts a fence command into the GL command stream and associates it with that sync object, and returns a non-zero name corresponding to the sync object.
    * 
    * When the specified _`condition`_ of the sync object is satisfied by the fence command, the sync object is signaled by the GL, causing any [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync], [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync] commands blocking in _`sync`_ to _unblock_. No other state is affected by `glFenceSync` or by the execution of the associated fence command.
    * 
    * _`condition`_ must be `GL_SYNC_GPU_COMMANDS_COMPLETE`. This condition is satisfied by completion of the fence command corresponding to the sync object and all preceding commands in the same command stream. The sync object will not be signaled until all effects from these commands on GL client and server state and the framebuffer are fully realized. Note that completion of the fence command occurs once the state of the corresponding sync object has been changed, but commands waiting on that sync object may not be unblocked until after the fence command completes.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`condition`_ is not `GL_SYNC_GPU_COMMANDS_COMPLETE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`flags`_ is not zero.
    * 
    * Additionally, if `glFenceSync` fails, it will return zero.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glFenceSync | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDeleteSync][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSync.glDeleteSync], [glGetSynciv][de.dasbabypixel.gamelauncher.gles.es30.glGetSynciv.glGetSynciv], [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync], [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync]
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
    * [\[1\]](#id-1.5.2.2.2.1.2) _`flags`_ is a placeholder for anticipated future extensions of fence sync object capabilities.
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glFenceSync.glFenceSync
    */
    fun glFenceSync(condition: Int, flags: Int): Long
}