package de.dasbabypixel.gamelauncher.gles.es20

interface glDeleteFramebuffers {
    /**
    * Name
    * ----
    * 
    * glDeleteFramebuffers — delete framebuffer objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteFramebuffers**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*framebuffers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of framebuffer objects to be deleted.
    * 
    * _`framebuffers`_
    * 
    * A pointer to an array containing _`n`_ framebuffer objects to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteFramebuffers` deletes the _`n`_ framebuffer objects whose names are stored in the array addressed by _`framebuffers`_. Unused names in _`framebuffers`_ that have been marked as used for the purposes of [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers] are marked as unused again. The name zero is reserved by the GL and is silently ignored, should it occur in _`framebuffers`_, as are other unused names. Once a framebuffer object is deleted, its name is again unused and it has no attachments. If a framebuffer that is currently bound to one or more of the targets `GL_DRAW_FRAMEBUFFER` or `GL_READ_FRAMEBUFFER` is deleted, it is as though [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer] had been executed with the corresponding _`target`_ and _`framebuffer`_ zero.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDeleteFramebuffers | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDeleteFramebuffers.glDeleteFramebuffers
    */
    fun glDeleteFramebuffers(n: UInt, framebuffers: java.nio.IntBuffer)
}