package de.dasbabypixel.gamelauncher.gles.es30

interface glReadBuffer {
    /**
    * Name
    * ----
    * 
    * glReadBuffer — select a color buffer source for pixels
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glReadBuffer**(` | GLenum src`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`src`_
    * 
    * Specifies a color buffer. Accepted values are `GL_BACK`, `GL_NONE`, and `GL_COLOR_ATTACHMENTi`.
    * 
    * Description
    * -----------
    * 
    * `glReadBuffer` specifies a color buffer as the source for subsequent [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels], , [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], and [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D] commands. _`src`_ accepts one of the following values: `GL_NONE`, `GL_BACK` names the back buffer of the default framebuffer, and `GL_COLOR_ATTACHMENTi` names a color attachment of the current framebuffer,
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`src`_ is not `GL_BACK`, `GL_NONE`, or `GL_COLOR_ATTACHMENTi`, where i is less than `GL_MAX_COLOR_ATTACHMENTS`.
    * 
    * `GL_INVALID_OPERATION` is generated if the current framebuffer is the default framebufer and _`src`_ is not `GL_NONE` or `GL_BACK`.
    * 
    * `GL_INVALID_OPERATION` is generated if the current framebuffer is a named framebufer and _`src`_ is not `GL_NONE` or `GL_COLOR_ATTACHMENTi`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_READ_BUFFER`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glReadBuffer | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glDrawBuffers][de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers], [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glReadBuffer.glReadBuffer
    */
    fun glReadBuffer(src: Int)
}