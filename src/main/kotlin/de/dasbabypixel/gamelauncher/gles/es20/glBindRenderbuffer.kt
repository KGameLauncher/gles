package de.dasbabypixel.gamelauncher.gles.es20

interface glBindRenderbuffer {
    /**
    * Name
    * ----
    * 
    * glBindRenderbuffer — bind a renderbuffer to a renderbuffer target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindRenderbuffer**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint renderbuffer`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the renderbuffer target of the binding operation. _`target`_ must be `GL_RENDERBUFFER`.
    * 
    * _`renderbuffer`_
    * 
    * Specifies the name of the renderbuffer object to bind.
    * 
    * Description
    * -----------
    * 
    * `glBindRenderbuffer` binds the renderbuffer object with name _`renderbuffer`_ to the renderbuffer target specified by _`target`_. _`target`_ must be `GL_RENDERBUFFER`. Calling `glBindRenderbuffer` with _`renderbuffer`_ set to a value of zero breaks the existing binding of a renderbuffer object to _`target`_.
    * 
    * [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers] may be used to generate a set of unused renderbuffer object names.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_RENDERBUFFER`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindRenderbuffer | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glDeleteRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteRenderbuffers.glDeleteRenderbuffers], [glRenderbufferStorage][de.dasbabypixel.gamelauncher.gles.es20.glRenderbufferStorage.glRenderbufferStorage], [glRenderbufferStorageMultisample][de.dasbabypixel.gamelauncher.gles.es30.glRenderbufferStorageMultisample.glRenderbufferStorageMultisample], [glIsRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glIsRenderbuffer.glIsRenderbuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer
    */
    fun glBindRenderbuffer(target: Int, renderbuffer: UInt)
}