package de.dasbabypixel.gamelauncher.gles.es30

interface glDeleteSync {
    /**
    * Name
    * ----
    * 
    * glDeleteSync — delete a sync object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteSync**(` | GLsync sync`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`sync`_
    * 
    * The sync object to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteSync` deletes the sync object specified by _`sync`_. If the fence command corresponding to the specified sync object has completed, or if no [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync] or [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync] commands are blocking on _`sync`_, the object is deleted immediately. Otherwise, _`sync`_ is flagged for deletion and will be deleted when it is no longer associated with any fence command and is no longer blocking any [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync] or [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync] command. In either case, after `glDeleteSync` returns, the name _`sync`_ is invalid and can no longer be used to refer to the sync object.
    * 
    * `glDeleteSync` will silently ignore a _`sync`_ value of zero.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`sync`_ is neither zero or the name of a sync object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDeleteSync | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFenceSync][de.dasbabypixel.gamelauncher.gles.es30.glFenceSync.glFenceSync], [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync], [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDeleteSync.glDeleteSync
    */
    fun glDeleteSync(sync: Long)
}