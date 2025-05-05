package de.dasbabypixel.gamelauncher.gles.es20

interface glCompressedTexImage2D {
    /**
    * Name
    * ----
    * 
    * glCompressedTexImage2D — specify a two-dimensional texture image in a compressed format
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glCompressedTexImage2D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLenum internalformat, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLint border, |
    * |   | GLsizei imageSize, |
    * |   | const void \* data`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target texture. Must be `GL_TEXTURE_2D`, `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, or `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`.
    * 
    * _`level`_
    * 
    * Specifies the level-of-detail number. Level 0 is the base image level. Level _n_ is the _n_th mipmap reduction image.
    * 
    * _`internalformat`_
    * 
    * Specifies the format of the compressed image data stored at address _`data`_.
    * 
    * _`width`_
    * 
    * Specifies the width of the texture image. All implementations support 2D and cube-mapped texture images that are at least 2048 texels wide.
    * 
    * _`height`_
    * 
    * Specifies the height of the texture image. All implementations support 2D and cube-mapped texture images that are at least 2048 texels high.
    * 
    * _`border`_
    * 
    * This value must be 0.
    * 
    * _`imageSize`_
    * 
    * Specifies the number of unsigned bytes of image data starting at the address specified by _`data`_.
    * 
    * _`data`_
    * 
    * Specifies a pointer to the compressed image data in memory.
    * 
    * Description
    * -----------
    * 
    * Texturing allows elements of an image array to be read by shaders.
    * 
    * `glCompressedTexImage2D` loads a previously defined, and retrieved, compressed two-dimensional texture image if _`target`_ is `GL_TEXTURE_2D`, or one of the cube map faces such as `GL_TEXTURE_CUBE_MAP_POSITIVE_X`. (see [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D]).
    * 
    * _`internalformat`_ must be a compressed image format from Table 1 below, or an extension-specified compressed-texture format.
    * 
    * _`imageSize`_ must be appropriate for the _`width`_, _`height`_ and _`depth`_ of the _`internalformat`_ specified. The size for an ETC/EAC/ASTC image is given in Table 1 below.
    * 
    * If a non-zero named buffer object is bound to the `GL_PIXEL_UNPACK_BUFFER` target (see [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer]) while a texture image is specified, _`data`_ is treated as a byte offset into the buffer object's data store.
    * 
    * Table 1. Compressed Internal Formats
    * 
    * 
    * | **Compressed Internal Format** | **Base Internal Format** | **Image Size** |
    * | --- | --- | --- |
    * | `GL_COMPRESSED_R11_EAC` | `GL_RED` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_SIGNED_R11_EAC` | `GL_RED` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_RG11_EAC` | `GL_RG` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SIGNED_RG11_EAC` | `GL_RG` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGB8_ETC2` | `GL_RGB` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_SRGB8_ETC2` | `GL_RGB` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_RGBA8_ETC2_EAC` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_4x4` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_5x4` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_5x5` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_6x5` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_6x6` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_8x5` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_8x6` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_8x8` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x5` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x6` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x8` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x10` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_12x10` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_12x12` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/12) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/12) \* 16 |
    * 
    * 
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not one of the specific compressed internal formats listed in Table 1 above.
    * 
    * `GL_INVALID_VALUE` is generated if _`imageSize`_ is not consistent with the format, dimensions, and contents of the specified compressed image data.
    * 
    * `GL_INVALID_VALUE` is generated if _`border`_ is not 0.
    * 
    * `GL_INVALID_OPERATION` is generated if parameter combinations are not supported by the specific compressed internal format as specified in the specific texture compression extension.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and the buffer object's data store is currently mapped.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and the data would be unpacked from the buffer object such that the memory reads required would exceed the data store size.
    * 
    * Undefined results, including abnormal program termination, are generated if _`data`_ is not encoded in a manner consistent with the extension specification defining the internal compression format.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PIXEL_UNPACK_BUFFER_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glCompressedTexImage2D` | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture], [glCompressedTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexImage3D.glCompressedTexImage3D], [glCompressedTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexSubImage2D.glCompressedTexSubImage2D], [glCompressedTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexSubImage3D.glCompressedTexSubImage3D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexImage2D.glCompressedTexImage2D
    */
    fun glCompressedTexImage2D(target: Int, level: Int, internalformat: Int, width: UInt, height: UInt, border: Int, imageSize: UInt, data: Long)
}