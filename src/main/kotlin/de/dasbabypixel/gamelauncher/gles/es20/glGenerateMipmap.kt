package de.dasbabypixel.gamelauncher.gles.es20

interface glGenerateMipmap {
    /**
    * Name
    * ----
    * 
    * glGenerateMipmap — generate mipmaps for a specified texture target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenerateMipmap**(` | GLenum target`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which the texture whose mimaps to generate is bound. _`target`_ must be `GL_TEXTURE_2D`, `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_CUBE_MAP` or `GL_TEXTURE_CUBE_MAP_ARRAY`.
    * 
    * Description
    * -----------
    * 
    * `glGenerateMipmap` generates mipmaps for the texture attached to _`target`_ of the active texture unit. For cube map or cube map array textures, a `GL_INVALID_OPERATION` error is generated if the texture attached to _`target`_ is not cube or cube array complete.
    * 
    * Mipmap generation replaces texel array levels level base + 1 through q with arrays derived from the level base array, regardless of their previous contents. All other mimap arrays, including the level base array, are left unchanged by this computation.
    * 
    * The internal formats of the derived mipmap arrays all match those of the level base array. The contents of the derived arrays are computed by repeated, filtered reduction of the level base array. For two-dimensional array and cube map array textures, each layer is filtered independently.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted texture targets.
    * 
    * `GL_INVALID_OPERATION` is generated if _`target`_ is `GL_TEXTURE_CUBE_MAP` or `GL_TEXTURE_CUBE_MAP_ARRAY` and the texture bound to _`target`_ is not cube or cube array complete.
    * 
    * `GL_INVALID_OPERATION` is generated if the level base array is stored in a compressed internal format.
    * 
    * `GL_INVALID_OPERATION` is generated if the level base array was not specified with an unsized internal format or a sized internal format that is both color-renderable and texture-filterable.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenerateMipmap | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGenerateMipmap.glGenerateMipmap
    */
    fun glGenerateMipmap(target: Int)
}