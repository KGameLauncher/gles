package de.dasbabypixel.gamelauncher.gles.es30

interface glCompressedTexSubImage3D {
    /**
    * Name
    * ----
    * 
    * glCompressedTexSubImage3D — specify a three-dimensional texture subimage in a compressed format
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glCompressedTexSubImage3D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLint xoffset, |
    * |   | GLint yoffset, |
    * |   | GLint zoffset, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLsizei depth, |
    * |   | GLenum format, |
    * |   | GLsizei imageSize, |
    * |   | const void \* data`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target texture. Must be `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, or `GL_TEXTURE_CUBE_MAP_ARRAY`.
    * 
    * _`level`_
    * 
    * Specifies the level-of-detail number. Level 0 is the base image level. Level _n_ is the _n_th mipmap reduction image.
    * 
    * _`xoffset`_
    * 
    * Specifies a texel offset in the x direction within the texture array.
    * 
    * _`yoffset`_
    * 
    * Specifies a texel offset in the y direction within the texture array.
    * 
    * _`zoffset`_
    * 
    * Specifies a texel offset in the z direction within the texture array.
    * 
    * _`width`_
    * 
    * Specifies the width of the texture subimage.
    * 
    * _`height`_
    * 
    * Specifies the height of the texture subimage.
    * 
    * _`depth`_
    * 
    * Specifies the depth of the texture subimage.
    * 
    * _`format`_
    * 
    * Specifies the format of the compressed image data stored at address _`data`_.
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
    * `glCompressedTexSubImage3D` redefines a contiguous subregion of an existing three-dimensional, two-dimensional array, or cube map array texture image. The texels referenced by _`data`_ replace the portion of the existing texture array with x indices _`xoffset`_ and xoffset + width \- 1 , and the y indices _`yoffset`_ and yoffset + height \- 1 , and the z indices _`zoffset`_ and zoffset + depth \- 1 , inclusive. For cube map array textures, _`zoffset`_ is the first layer-face to update, and _`depth`_ is the number of layer-faces to update. This region may not include any texels outside the range of the texture array as it was originally specified. It is not an error to specify a subtexture with width of 0, but such a specification has no effect.
    * 
    * _`format`_ must be a known compressed image format from Table 1 below, or an extension-specified compressed-texture format.
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
    * `GL_INVALID_ENUM` is generated if _`format`_ is not one of the specific compressed internal formats listed in Table 1 above.
    * 
    * `GL_INVALID_VALUE` is generated if _`imageSize`_ is not consistent with the format, dimensions, and contents of the specified compressed image data.
    * 
    * `GL_INVALID_OPERATION` is generated if parameter combinations are not supported by the specific compressed internal format as specified in the specific texture compression extension. For ETC2/EAC images `GL_INVALID_OPERATION` is generated if _`width`_ is not a multiple of four, and _`width`_ + _`xoffset`_ is not equal to the width of the texture level; if _`height`_ is not a multiple of four, and _`height`_ + _`yoffset`_ is not equal to the height of the texture level; or if _`xoffset`_ or _`yoffset`_ is not a multiple of four. The ETC2/EAC texture compression algorithm supports only two-dimensional images. If format is an ETC2/EAC format, `glCompressedTexSubImage3D` will generate an `GL_INVALID_OPERATION` error if target is not `GL_TEXTURE_2D_ARRAY` or `GL_TEXTURE_CUBE_MAP_ARRAY`.
    * 
    * For ASTC images `GL_INVALID_OPERATION` is generated if _`width`_ is not a multiple of the block width, and _`width`_ + _`xoffset`_ is not equal to the width of the texture level; if _`height`_ is not a multiple of the block height, and _`height`_ + _`yoffset`_ is not equal to the height of the texture level; or if _`xoffset`_ or _`yoffset`_ is not a multiple of the corresponding block dimension. If format is an ASTC format, `glCompressedTexSubImage3D` will generate an `GL_INVALID_OPERATION` error if target is not `GL_TEXTURE_2D_ARRAY` or `GL_TEXTURE_CUBE_MAP_ARRAY`, unless `GL_OES_texture_compression_astc` is supported.
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
    * | glCompressedTexSubImage3D | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture], [glCompressedTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexImage2D.glCompressedTexImage2D], [glCompressedTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexImage3D.glCompressedTexImage3D], [glCompressedTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexSubImage2D.glCompressedTexSubImage2D], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexSubImage3D.glCompressedTexSubImage3D
    */
    fun glCompressedTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: UInt, height: UInt, depth: UInt, format: Int, imageSize: UInt, data: de.dasbabypixel.gamelauncher.buffers.BufferRO)
}