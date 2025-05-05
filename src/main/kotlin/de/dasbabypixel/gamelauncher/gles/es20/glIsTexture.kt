package de.dasbabypixel.gamelauncher.gles.es20

interface glIsTexture {
    /**
    * Name
    * ----
    * 
    * glIsTexture — determine if a name corresponds to a texture
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsTexture**(` | GLuint texture`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`texture`_
    * 
    * Specifies a value that may be the name of a texture.
    * 
    * Description
    * -----------
    * 
    * `glIsTexture` returns `GL_TRUE` if _`texture`_ is currently the name of a texture. If _`texture`_ is zero, or is a non-zero value that is not currently the name of a texture, or if an error occurs, `glIsTexture` returns `GL_FALSE`.
    * 
    * A name returned by [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures], but not yet associated with a texture by calling [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], is not the name of a texture.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsTexture | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glDeleteTextures][de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures], [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glIsTexture.glIsTexture
    */
    fun glIsTexture(texture: UInt): Boolean
}