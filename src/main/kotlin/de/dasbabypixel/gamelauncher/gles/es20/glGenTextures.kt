package de.dasbabypixel.gamelauncher.gles.es20

interface glGenTextures {
    /**
    * Name
    * ----
    * 
    * glGenTextures — generate texture names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenTextures**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \* textures`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of texture names to be generated.
    * 
    * _`textures`_
    * 
    * Specifies an array in which the generated texture names are stored.
    * 
    * Description
    * -----------
    * 
    * `glGenTextures` returns _`n`_ texture names in _`textures`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenTextures`.
    * 
    * Texture names returned by a call to `glGenTextures` are not returned by subsequent calls, unless they are first deleted with [glDeleteTextures][de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures].
    * 
    * The names returned in _`textures`_ are marked as used, for the purposes of `glGenTextures` only, but they acquire state and dimensionality only when they are first bound using [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
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
    * | glGenTextures | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glDeleteTextures][de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures
    */
    fun glGenTextures(n: UInt, textures: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}