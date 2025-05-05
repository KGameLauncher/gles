package de.dasbabypixel.gamelauncher.gles.es20

interface glActiveTexture {
    /**
    * Name
    * ----
    * 
    * glActiveTexture — select active texture unit
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glActiveTexture**(` | GLenum texture`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`texture`_
    * 
    * Specifies which texture unit to make active. The number of texture units is implementation-dependent, but must be at least 32. _`texture`_ must be one of `GL_TEXTURE`_i_, where _i_ ranges from zero to the value of `GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS` minus one. The initial value is `GL_TEXTURE0`.
    * 
    * Description
    * -----------
    * 
    * `glActiveTexture` selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation-dependent, but must be at least 32.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`texture`_ is not one of `GL_TEXTURE`_i_, where _i_ ranges from zero to the value of `GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS` minus one.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_ACTIVE_TEXTURE`, or `GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glActiveTexture | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures], [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glCompressedTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexImage2D.glCompressedTexImage2D], [glCompressedTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexImage3D.glCompressedTexImage3D], [glCompressedTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexSubImage2D.glCompressedTexSubImage2D], [glCompressedTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexSubImage3D.glCompressedTexSubImage3D], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glDeleteTextures][de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures] [glIsTexture][de.dasbabypixel.gamelauncher.gles.es20.glIsTexture.glIsTexture], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture
    */
    fun glActiveTexture(texture: Int)
}