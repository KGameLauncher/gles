package de.dasbabypixel.gamelauncher.gles.es20

interface glIsRenderbuffer {
    /**
    * Name
    * ----
    * 
    * glIsRenderbuffer — determine if a name corresponds to a renderbuffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsRenderbuffer**(` | GLuint renderbuffer`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`renderbuffer`_
    * 
    * Specifies a value that may be the name of a renderbuffer object.
    * 
    * Description
    * -----------
    * 
    * `glIsRenderbuffer` returns `GL_TRUE` if _`renderbuffer`_ is currently the name of a renderbuffer object. If _`renderbuffer`_ is zero, or if _`renderbuffer`_ is not the name of a renderbuffer object, or if an error occurs, `glIsRenderbuffer` returns `GL_FALSE`. If _`renderbuffer`_ is a name returned by [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], by that has not yet been bound through a call to [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer] or [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], then the name is not a renderbuffer object and `glIsRenderbuffer` returns `GL_FALSE`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsRenderbuffer | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glDeleteRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteRenderbuffers.glDeleteRenderbuffers]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glIsRenderbuffer.glIsRenderbuffer
    */
    fun glIsRenderbuffer(renderbuffer: UInt): Boolean
}