package de.dasbabypixel.gamelauncher.gles.es30

interface glCopyTexSubImage3D {
    /**
    * Name
    * ----
    * 
    * glCopyTexSubImage3D — copy a three-dimensional texture subimage
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glCopyTexSubImage3D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLint xoffset, |
    * |   | GLint yoffset, |
    * |   | GLint zoffset, |
    * |   | GLint x, |
    * |   | GLint y, |
    * |   | GLsizei width, |
    * |   | GLsizei height`)`; |
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
    * _`x`_, _`y`_
    * 
    * Specify the window coordinates of the lower left corner of the rectangular region of pixels to be copied.
    * 
    * _`width`_
    * 
    * Specifies the width of the texture subimage.
    * 
    * _`height`_
    * 
    * Specifies the height of the texture subimage.
    * 
    * Description
    * -----------
    * 
    * `glCopyTexSubImage3D` replaces a rectangular portion of a three-dimensional, two-dimensional array, or cube map array texture image with pixels from the current `GL_READ_BUFFER` (rather than from main memory, as is the case for [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D]).
    * 
    * The screen-aligned pixel rectangle with lower left corner at (_`x`_, _`y`_) and with width _`width`_ and height _`height`_ replaces the portion of the texture array with x indices _`xoffset`_ through xoffset + width \- 1 , inclusive, and y indices _`yoffset`_ through yoffset + height \- 1 , inclusive, at z index _`zoffset`_ and at the mipmap level specified by _`level`_.
    * 
    * For cube map array textures, _`zoffset`_ is the first layer-face to update, and _`depth`_ is the number of layer-faces to update.
    * 
    * The pixels in the rectangle are processed exactly as if [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels] had been called, but the process stops after conversion to RGBA values.
    * 
    * The destination rectangle in the texture array may not include any texels outside the texture array as it was originally specified. It is not an error to specify a subtexture with zero width or height, but such a specification has no effect.
    * 
    * If any of the pixels within the specified rectangle of the current `GL_READ_BUFFER` are outside the read window associated with the current rendering context, then the values obtained for those pixels are undefined.
    * 
    * No change is made to the _internalformat_, _width_, _height_, _depth_, or _border_ parameters of the specified texture array or to texel values outside the specified subregion.
    * 
    * Notes
    * -----
    * 
    * [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei] modes affect texture images.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, or `GL_TEXTURE_CUBE_MAP_ARRAY`.
    * 
    * `GL_INVALID_OPERATION` is generated if the texture array has not been defined by a previous [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D] or [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D] operation.
    * 
    * `GL_INVALID_VALUE` is generated if _`level`_ is less than 0.
    * 
    * `GL_INVALID_VALUE` may be generated if level \> log 2 ⁡ max , where max is the returned value of `GL_MAX_3D_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if xoffset + width \> w , yoffset + height \> h , or zoffset + 1 \> d , where w is the `GL_TEXTURE_WIDTH`, h is the `GL_TEXTURE_HEIGHT`, d is the `GL_TEXTURE_DEPTH` of the texture image being modified.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glCopyTexSubImage3D | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glReadBuffer][de.dasbabypixel.gamelauncher.gles.es30.glReadBuffer.glReadBuffer], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D
    */
    fun glCopyTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: UInt, height: UInt)
}