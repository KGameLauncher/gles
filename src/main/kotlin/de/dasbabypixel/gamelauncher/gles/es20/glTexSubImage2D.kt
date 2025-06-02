package de.dasbabypixel.gamelauncher.gles.es20

interface glTexSubImage2D {
    /**
    * Name
    * ----
    * 
    * glTexSubImage2D — specify a two-dimensional texture subimage
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glTexSubImage2D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLint xoffset, |
    * |   | GLint yoffset, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLenum format, |
    * |   | GLenum type, |
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
    * _`xoffset`_
    * 
    * Specifies a texel offset in the x direction within the texture array.
    * 
    * _`yoffset`_
    * 
    * Specifies a texel offset in the y direction within the texture array.
    * 
    * _`width`_
    * 
    * Specifies the width of the texture subimage.
    * 
    * _`height`_
    * 
    * Specifies the height of the texture subimage.
    * 
    * _`format`_
    * 
    * Specifies the format of the pixel data. The following symbolic values are accepted: `GL_RED`, `GL_RED_INTEGER`, `GL_RG`, `GL_RG_INTEGER`, `GL_RGB`, `GL_RGB_INTEGER`, `GL_RGBA`, `GL_RGBA_INTEGER`, `GL_DEPTH_COMPONENT`, `GL_DEPTH_STENCIL`, `GL_LUMINANCE_ALPHA`, `GL_LUMINANCE`, and `GL_ALPHA`.
    * 
    * _`type`_
    * 
    * Specifies the data type of the pixel data. The following symbolic values are accepted: `GL_UNSIGNED_BYTE`, `GL_BYTE`, `GL_UNSIGNED_SHORT`, `GL_SHORT`, `GL_UNSIGNED_INT`, `GL_INT`, `GL_HALF_FLOAT`, `GL_FLOAT`, `GL_UNSIGNED_SHORT_5_6_5`, `GL_UNSIGNED_SHORT_4_4_4_4`, `GL_UNSIGNED_SHORT_5_5_5_1`, `GL_UNSIGNED_INT_2_10_10_10_REV`, `GL_UNSIGNED_INT_10F_11F_11F_REV`, `GL_UNSIGNED_INT_5_9_9_9_REV`, `GL_UNSIGNED_INT_24_8`, and `GL_FLOAT_32_UNSIGNED_INT_24_8_REV`.
    * 
    * _`data`_
    * 
    * Specifies a pointer to the image data in memory.
    * 
    * Description
    * -----------
    * 
    * Texturing allows elements of an image array to be read by shaders.
    * 
    * `glTexSubImage2D` redefines a contiguous subregion of an existing two-dimensional texture image. The texels referenced by _`data`_ replace the portion of the existing texture array with x indices _`xoffset`_ and xoffset + width \- 1 , inclusive, and y indices _`yoffset`_ and yoffset + height \- 1 , inclusive. This region may not include any texels outside the range of the texture array as it was originally specified. It is not an error to specify a subtexture with zero width or height, but such a specification has no effect.
    * 
    * If a non-zero named buffer object is bound to the `GL_PIXEL_UNPACK_BUFFER` target (see [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer]) while a texture image is specified, _`data`_ is treated as a byte offset into the buffer object's data store.
    * 
    * Notes
    * -----
    * 
    * [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei] modes affect texture images.
    * 
    * `glTexSubImage2D` specifies a two-dimensional subtexture for the texture object bound to the current texture unit, specified with [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_TEXTURE_2D`, `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, or `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`.
    * 
    * `GL_INVALID_ENUM` is generated if _`format`_ is not an accepted format constant.
    * 
    * `GL_INVALID_ENUM` is generated if _`type`_ is not a type constant.
    * 
    * `GL_INVALID_VALUE` is generated if _`level`_ is less than 0.
    * 
    * `GL_INVALID_VALUE` may be generated if _`level`_ is greater than log 2 _max_, where _max_ is the returned value of `GL_MAX_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if xoffset < 0 , xoffset + width \> w , yoffset < 0 , or yoffset + height \> h , where w is the `GL_TEXTURE_WIDTH`, and h is the `GL_TEXTURE_HEIGHT` of the texture image being modified.
    * 
    * `GL_INVALID_VALUE` is generated if _`width`_ or _`height`_ is less than 0.
    * 
    * `GL_INVALID_OPERATION` is generated if the texture array has not been defined by a previous [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D] or [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D] operation.
    * 
    * `GL_INVALID_OPERATION` is generated if the combination of _`internalFormat`_ of the previously specified texture array, _`format`_ and _`type`_ is not valid. See [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D].
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and the buffer object's data store is currently mapped.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and the data would be unpacked from the buffer object such that the memory reads required would exceed the data store size.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and _`data`_ is not evenly divisible into the number of bytes needed to store in memory a datum indicated by _`type`_.
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
    * | glTexSubImage2D | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D
    */
    fun glTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: UInt, height: UInt, format: Int, type: Int, data: java.nio.Buffer)
}