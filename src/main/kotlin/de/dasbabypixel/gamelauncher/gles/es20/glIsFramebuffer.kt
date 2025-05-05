package de.dasbabypixel.gamelauncher.gles.es20

interface glIsFramebuffer {
    /**
    * Name
    * ----
    * 
    * glIsFramebuffer — determine if a name corresponds to a framebuffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsFramebuffer**(` | GLuint framebuffer`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`framebuffer`_
    * 
    * Specifies a value that may be the name of a framebuffer object.
    * 
    * Description
    * -----------
    * 
    * `glIsFramebuffer` returns `GL_TRUE` if _`framebuffer`_ is currently the name of a framebuffer object. If _`framebuffer`_ is zero, or if `framebuffer` is not the name of a framebuffer object, or if an error occurs, `glIsFramebuffer` returns `GL_FALSE`. If _`framebuffer`_ is a name returned by [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], by that has not yet been bound through a call to [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], then the name is not a framebuffer object and `glIsFramebuffer` returns `GL_FALSE`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsFramebuffer | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glDeleteFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteFramebuffers.glDeleteFramebuffers]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glIsFramebuffer.glIsFramebuffer
    */
    fun glIsFramebuffer(framebuffer: UInt): Boolean
}