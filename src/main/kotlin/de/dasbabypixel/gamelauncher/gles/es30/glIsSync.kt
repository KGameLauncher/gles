package de.dasbabypixel.gamelauncher.gles.es30

interface glIsSync {
    /**
    * Name
    * ----
    * 
    * glIsSync — determine if a name corresponds to a sync object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsSync**(` | GLsync sync`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`sync`_
    * 
    * Specifies a value that may be the name of a sync object.
    * 
    * Description
    * -----------
    * 
    * `glIsSync` returns `GL_TRUE` if _`sync`_ is currently the name of a sync object. If _`sync`_ is not the name of a sync object, or if an error occurs, `glIsSync` returns `GL_FALSE`. Note that zero is not the name of a sync object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsSync | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFenceSync][de.dasbabypixel.gamelauncher.gles.es30.glFenceSync.glFenceSync], [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync], [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync], [glDeleteSync][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSync.glDeleteSync]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glIsSync.glIsSync
    */
    fun glIsSync(sync: Long): Boolean
}