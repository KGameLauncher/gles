package de.dasbabypixel.gamelauncher.gles.es20

interface glBindTexture {
    /**
    * Name
    * ----
    * 
    * glBindTexture — bind a named texture to a texturing target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindTexture**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint texture`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which the texture is bound. Must be either `GL_TEXTURE_2D`, `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_CUBE_MAP`, `GL_TEXTURE_CUBE_MAP_ARRAY`, or `GL_TEXTURE_BUFFER`.
    * 
    * _`texture`_
    * 
    * Specifies the name of a texture.
    * 
    * Description
    * -----------
    * 
    * `glBindTexture` binds the texture object with name _`texture`_ to the texture target specified by _`target`_. Calling `glBindTexture` with _`target`_ set to `GL_TEXTURE_2D`, `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_CUBE_MAP`, `GL_TEXTURE_CUBE_MAP_ARRAY`, or `GL_TEXTURE_BUFFER` and _`texture`_ set to the name of the new texture binds the texture name to that target. When a texture is bound to a target, the previous binding for that target is automatically broken.
    * 
    * Texture names are unsigned integers. The value zero is reserved to represent the default texture for each texture target. Texture names and the corresponding texture contents are local to the shared object space of the current GL rendering context; two rendering contexts share texture names only if they explicitly enable sharing between contexts through the appropriate GL windows interfaces functions.
    * 
    * You must use [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures] to generate a set of new texture names.
    * 
    * When a texture is first bound, it assumes the specified target: A texture first bound to `GL_TEXTURE_2D` becomes a two-dimensional texture, a texture first bound to `GL_TEXTURE_2D_MULTISAMPLE` becomes a two-dimensional multisampled texture, a texture first bound to `GL_TEXTURE_2D_MULTISAMPLE_ARRAY` becomes a two-dimensional multisampled array texture, a texture first bound to `GL_TEXTURE_3D` becomes a three-dimensional texture, a texture first bound to `GL_TEXTURE_2D_ARRAY` becomes a two-dimensional array texture, a texture first bound to `GL_TEXTURE_CUBE_MAP` becomes a cube-mapped texture, a texture first bound to `GL_TEXTURE_CUBE_MAP_ARRAY` becomes a cube-mapped array texture, and a texture first bound to `GL_TEXTURE_BUFFER` becomes a buffer texture. The state of a two-dimensional texture immediately after it is first bound is equivalent to the state of the default `GL_TEXTURE_2D` at GL initialization, and similarly for the other texture types.
    * 
    * While a texture is bound, GL operations on the target to which it is bound affect the bound texture, and queries of the target to which it is bound return state from the bound texture. In effect, the texture targets become aliases for the textures currently bound to them, and the texture name zero refers to the default textures that were bound to them at initialization.
    * 
    * A texture binding created with `glBindTexture` remains active until a different texture is bound to the same target, or until the bound texture is deleted with [glDeleteTextures][de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures].
    * 
    * Once created, a named texture may be re-bound to its same original target as often as needed. It is usually much faster to use `glBindTexture` to bind an existing named texture to one of the texture targets than it is to reload the texture image using [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D] or another similar function.
    * 
    * Texture binding is affected by the setting of the state `GL_ACTIVE_TEXTURE` (see [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture]). A texture object may be bound to more than one texture unit simultaneously.
    * 
    * Notes
    * -----
    * 
    * The `GL_TEXTURE_2D_MULTISAMPLE` and `GL_TEXTURE_2D_MULTISAMPLE_ARRAY` targets are available only if the GL ES version is 3.1 or higher.
    * 
    * The `GL_TEXTURE_CUBE_MAP_ARRAY` and `GL_TEXTURE_BUFFER` targets are available only if the GL ES version is 3.2 or higher.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the allowable values.
    * 
    * `GL_INVALID_OPERATION` is generated if _`texture`_ was previously created with a target that doesn't match that of _`target`_.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_TEXTURE_BINDING_2D`, `GL_TEXTURE_BINDING_2D_MULTISAMPLE`, `GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY`, `GL_TEXTURE_BINDING_3D`, `GL_TEXTURE_BINDING_2D_ARRAY`, `GL_TEXTURE_BINDING_CUBE_MAP`, `GL_TEXTURE_BINDING_CUBE_MAP_ARRAY`, or `GL_TEXTURE_BINDING_BUFFER`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindTexture | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDeleteTextures][de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures], [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv], [glIsTexture][de.dasbabypixel.gamelauncher.gles.es20.glIsTexture.glIsTexture], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexStorage2DMultisample][de.dasbabypixel.gamelauncher.gles.es31.glTexStorage2DMultisample.glTexStorage2DMultisample], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D] [glTexStorage3DMultisample][de.dasbabypixel.gamelauncher.gles.es32.glTexStorage3DMultisample.glTexStorage3DMultisample]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture
    */
    fun glBindTexture(target: Int, texture: UInt)
}