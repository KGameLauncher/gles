package de.dasbabypixel.gamelauncher.gles.es20

interface glDeleteTextures {
    /**
    * Name
    * ----
    * 
    * glDeleteTextures — delete named textures
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteTextures**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLuint \* textures`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of textures to be deleted.
    * 
    * _`textures`_
    * 
    * Specifies an array of textures to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteTextures` deletes _`n`_ textures named by the elements of the array _`textures`_. After a texture is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is currently bound is deleted, the binding reverts to 0 (the default texture).
    * 
    * Unused names in _`textures`_ that have been marked as used for the purposes of [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures] are marked as unused again. `glDeleteTextures` silently ignores 0's and names that do not correspond to existing textures.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsTexture][de.dasbabypixel.gamelauncher.gles.es20.glIsTexture.glIsTexture]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDeleteTextures | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures
    */
    fun glDeleteTextures(n: UInt, textures: de.dasbabypixel.gamelauncher.buffers.IntBufferRO)
}