package de.dasbabypixel.gamelauncher.gles.es20

interface glCopyTexImage2D {
    /**
    * Name
    * ----
    * 
    * glCopyTexImage2D — copy pixels into a 2D texture image
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glCopyTexImage2D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLenum internalformat, |
    * |   | GLint x, |
    * |   | GLint y, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLint border`)`; |
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
    * Specifies the internal format of the texture. Must be one of the following symbolic constants: `GL_ALPHA`, `GL_LUMINANCE`, `GL_LUMINANCE_ALPHA`, `GL_RGB`, `GL_RGBA`, `GL_R8`, `GL_RG8`, `GL_RGB565`, `GL_RGB8`, `GL_RGBA4`, `GL_RGB5_A1`, `GL_RGBA8`, `GL_RGB10_A2`, `GL_SRGB8`, `GL_SRGB8_ALPHA8`, `GL_R8I`, `GL_R8UI`, `GL_R16I`, `GL_R16UI`, `GL_R32I`, `GL_R32UI`, `GL_RG8I`, `GL_RG8UI`, `GL_RG16I`, `GL_RG16UI`, `GL_RG32I`, `GL_RG32UI`, `GL_RGBA8I`, `GL_RGBA8UI`, `GL_RGB10_A2UI`, `GL_RGBA16I`, `GL_RGBA16UI`, `GL_RGBA32I`, `GL_RGBA32UI`.
    * 
    * _`x`_, _`y`_
    * 
    * Specify the window coordinates of the lower left corner of the rectangular region of pixels to be copied.
    * 
    * _`width`_
    * 
    * Specifies the width of the texture image.
    * 
    * _`height`_
    * 
    * Specifies the height of the texture image.
    * 
    * _`border`_
    * 
    * Specifies the width of the border. Must be 0.
    * 
    * Description
    * -----------
    * 
    * `glCopyTexImage2D` defines a two-dimensional texture image, or cube-map texture image with pixels from the current `GL_READ_BUFFER`.
    * 
    * The screen-aligned pixel rectangle with lower left corner at (_`x`_, _`y`_) and with a width of _`width`_ and a height of _`height`_ defines the texture array at the mipmap level specified by _`level`_. _`internalformat`_ specifies the internal format of the texture array.
    * 
    * The pixels in the rectangle are processed exactly as if [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels] had been called, but the process stops after conversion to RGBA values. The error `GL_INVALID_OPERATION` is generated if integer RGBA data is required and the format of the current color buffer is not integer; or if floating- or fixed-point RGBA data is required and the format of the current color buffer is integer.
    * 
    * Pixel ordering is such that lower x and y screen coordinates correspond to lower s and t texture coordinates.
    * 
    * If any of the pixels within the specified rectangle of the current `GL_READ_BUFFER` are outside the window associated with the current rendering context, then the values obtained for those pixels are undefined.
    * 
    * When _`internalformat`_ is one of the sRGB types, the GL does not automatically convert the source pixels to the sRGB color space.
    * 
    * Notes
    * -----
    * 
    * An image with height or width of 0 indicates a NULL texture.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_TEXTURE_2D`, `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, or `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`.
    * 
    * `GL_INVALID_VALUE` is generated if _`level`_ is less than 0.
    * 
    * `GL_INVALID_VALUE` may be generated if _`level`_ is greater than log 2 ⁢ max , where max is the returned value of `GL_MAX_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`width`_ or _`height`_ is less than 0 or greater than `GL_MAX_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`border`_ is not 0.
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not an accepted format.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glCopyTexImage2D | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D
    */
    fun glCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: UInt, height: UInt, border: Int)
}