package de.dasbabypixel.gamelauncher.gles.es20

interface glDeleteRenderbuffers {
    /**
    * Name
    * ----
    * 
    * glDeleteRenderbuffers — delete renderbuffer objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteRenderbuffers**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*renderbuffers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of renderbuffer objects to be deleted.
    * 
    * _`renderbuffers`_
    * 
    * A pointer to an array containing _`n`_ renderbuffer objects to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteRenderbuffers` deletes the _`n`_ renderbuffer objects whose names are stored in the array addressed by _`renderbuffers`_. Unused names in _`renderbuffers`_ that have been marked as used for the purposes of [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers] are marked as unused again. The name zero is reserved by the GL and is silently ignored, should it occur in _`renderbuffers`_, as are other unused names. Once a renderbuffer object is deleted, its name is again unused and it has no contents. If a renderbuffer that is currently bound to the target `GL_RENDERBUFFER` is deleted, it is as though [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer] had been executed with a _`target`_ of `GL_RENDERBUFFER` and a _`name`_ of zero.
    * 
    * If a renderbuffer object is attached to one or more attachment points in the currently bound framebuffer, then it as if [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer] had been called, with a _`renderbuffer`_ of zero for each attachment point to which this image was attached in the currently bound framebuffer. In other words, this renderbuffer object is first detached from all attachment ponits in the currently bound framebuffer. Note that the renderbuffer image is specifically _not_ detached from any non-bound framebuffers.
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
    * | glDeleteRenderbuffers | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glRenderbufferStorage][de.dasbabypixel.gamelauncher.gles.es20.glRenderbufferStorage.glRenderbufferStorage], [glRenderbufferStorageMultisample][de.dasbabypixel.gamelauncher.gles.es30.glRenderbufferStorageMultisample.glRenderbufferStorageMultisample]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDeleteRenderbuffers.glDeleteRenderbuffers
    */
    fun glDeleteRenderbuffers(n: UInt, renderbuffers: java.nio.IntBuffer)
}