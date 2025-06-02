package de.dasbabypixel.gamelauncher.gles.es20

interface glGetTexParameterfv {
    /**
    * Name
    * ----
    * 
    * glGetTexParameter — return texture parameter values
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetTexParameterfv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLfloat \* params`)`; |
    * 
    * | `void **glGetTexParameteriv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
    * 
    * | `void **glGetTexParameterIiv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
    * 
    * | `void **glGetTexParameterIuiv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLuint \* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the symbolic name of the target texture. `GL_TEXTURE_2D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, `GL_TEXTURE_3D`, `GL_TEXTURE_CUBE_MAP`, and `GL_TEXTURE_CUBE_MAP_ARRAY` are accepted.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of a texture parameter. `GL_DEPTH_STENCIL_TEXTURE_MODE`, `GL_IMAGE_FORMAT_COMPATIBILITY_TYPE`, `GL_TEXTURE_BASE_LEVEL`, `GL_TEXTURE_COMPARE_FUNC`, `GL_TEXTURE_COMPARE_MODE`, `GL_TEXTURE_IMMUTABLE_FORMAT`, `GL_TEXTURE_IMMUTABLE_LEVELS`, `GL_TEXTURE_MAG_FILTER`, `GL_TEXTURE_MAX_LEVEL`, `GL_TEXTURE_MAX_LOD`, `GL_TEXTURE_MIN_FILTER`, `GL_TEXTURE_MIN_LOD`, `GL_TEXTURE_SWIZZLE_R`, `GL_TEXTURE_SWIZZLE_G`, `GL_TEXTURE_SWIZZLE_B`, `GL_TEXTURE_SWIZZLE_A`, `GL_TEXTURE_WRAP_S`, `GL_TEXTURE_WRAP_T`, `GL_TEXTURE_WRAP_R`, and `GL_TEXTURE_BORDER_COLOR` are accepted.
    * 
    * _`params`_
    * 
    * Returns the texture parameters.
    * 
    * Description
    * -----------
    * 
    * `glGetTexParameter` returns in _`params`_ the value or values of the texture parameter specified as _`pname`_. _`target`_ defines the target texture. `GL_TEXTURE_2D`, `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_CUBE_MAP`, `GL_TEXTURE_CUBE_MAP_ARRAY`, `GL_TEXTURE_2D_MULTISAMPLE`, and `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, specify two- or three-dimensional, two-dimensional array, cube-mapped, cube-mapped array, two-dimensional multisample or two-dimensional multisample array texturing, respectively. _`pname`_ accepts the same symbols as [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf], with the same interpretations:
    * 
    * `GL_DEPTH_STENCIL_TEXTURE_MODE`
    * 
    * Returns the single-value depth stencil texture mode, a symbolic constant. The initial value is `GL_DEPTH_COMPONENT`.
    * 
    * `GL_IMAGE_FORMAT_COMPATIBILITY_TYPE`
    * 
    * Returns the single-valued image format compatibility matching criteria. This can be one of `GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS` or `GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE`.
    * 
    * `GL_TEXTURE_BASE_LEVEL`
    * 
    * Returns the single-valued base texture mipmap level. The initial value is 0.
    * 
    * `GL_TEXTURE_COMPARE_FUNC`
    * 
    * Returns a single-valued texture comparison function, a symbolic constant. The initial value is `GL_LEQUAL`. See [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf].
    * 
    * `GL_TEXTURE_COMPARE_MODE`
    * 
    * Returns a single-valued texture comparison mode, a symbolic constant. The initial value is `GL_NONE`. See [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf].
    * 
    * `GL_TEXTURE_IMMUTABLE_FORMAT`
    * 
    * Returns a single-value boolean representing the immutability of the texture format and size. initial value is `GL_FALSE`. See [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D].
    * 
    * `GL_TEXTURE_IMMUTABLE_LEVELS`
    * 
    * Returns a single-valued number of texture levels in an immutable texture. See [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D].
    * 
    * `GL_TEXTURE_MAG_FILTER`
    * 
    * Returns the single-valued texture magnification filter, a symbolic constant. The initial value is `GL_LINEAR`.
    * 
    * `GL_TEXTURE_MAX_LEVEL`
    * 
    * Returns the single-valued maximum texture mipmap array level. The initial value is 1000.
    * 
    * `GL_TEXTURE_MAX_LOD`
    * 
    * Returns the single-valued texture maximum level-of-detail value. The initial value is 1000.
    * 
    * `GL_TEXTURE_MIN_FILTER`
    * 
    * Returns the single-valued texture minification filter, a symbolic constant. The initial value is `GL_NEAREST_MIPMAP_LINEAR`.
    * 
    * `GL_TEXTURE_MIN_LOD`
    * 
    * Returns the single-valued texture minimum level-of-detail value. The initial value is \-1000 .
    * 
    * `GL_TEXTURE_SWIZZLE_R`
    * 
    * Returns the red component swizzle. The initial value is `GL_RED`.
    * 
    * `GL_TEXTURE_SWIZZLE_G`
    * 
    * Returns the green component swizzle. The initial value is `GL_GREEN`.
    * 
    * `GL_TEXTURE_SWIZZLE_B`
    * 
    * Returns the blue component swizzle. The initial value is `GL_BLUE`.
    * 
    * `GL_TEXTURE_SWIZZLE_A`
    * 
    * Returns the alpha component swizzle. The initial value is `GL_ALPHA`.
    * 
    * `GL_TEXTURE_WRAP_S`
    * 
    * Returns the single-valued wrapping function for texture coordinate s, a symbolic constant. The initial value is `GL_REPEAT`.
    * 
    * `GL_TEXTURE_WRAP_T`
    * 
    * Returns the single-valued wrapping function for texture coordinate t, a symbolic constant. The initial value is `GL_REPEAT`.
    * 
    * `GL_TEXTURE_WRAP_R`
    * 
    * Returns the single-valued wrapping function for texture coordinate r, a symbolic constant. The initial value is `GL_REPEAT`.
    * 
    * `GL_TEXTURE_BORDER_COLOR`
    * 
    * Returns four integer or floating-point numbers that comprise the RGBA color of the texture border. Floating-point values are returned in the range 0 1 . Integer values are returned as a linear mapping of the internal floating-point representation such that 1.0 maps to the most positive representable integer and \-1.0 maps to the most negative representable integer. The initial value is (0, 0, 0, 0).
    * 
    * Notes
    * -----
    * 
    * If an error is generated, no change is made to the contents of _`params`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ or _`pname`_ is not an accepted value.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetTexParameterfv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetTexParameteriv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetTexParameterIiv` | \- | \- | \- | ✔ |
    * | `glGetTexParameterIuiv` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameteriv.glGetTexParameteriv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetTexParameterIiv.glGetTexParameterIiv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetTexParameterIuiv.glGetTexParameterIuiv
    */
    fun glGetTexParameterfv(target: Int, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.FloatBuffer)
}