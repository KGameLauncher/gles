package de.dasbabypixel.gamelauncher.gles.es31

interface glGetTexLevelParameterfv {
    /**
    * Name
    * ----
    * 
    * glGetTexLevelParameter — return texture parameter values for a specific level of detail
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetTexLevelParameterfv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLenum pname, |
    * |   | GLfloat \* params`)`; |
    * 
    * | `void **glGetTexLevelParameteriv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the symbolic name of the target texture, one of `GL_TEXTURE_2D`, `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`, `GL_TEXTURE_CUBE_MAP_ARRAY`, or `GL_TEXTURE_BUFFER`.
    * 
    * _`level`_
    * 
    * Specifies the level-of-detail number of the desired image. Level 0 is the base image level. Level n is the nth mipmap reduction image.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of a texture parameter. `GL_TEXTURE_WIDTH`, `GL_TEXTURE_HEIGHT`, `GL_TEXTURE_DEPTH`, `GL_TEXTURE_INTERNAL_FORMAT`, `GL_TEXTURE_SAMPLES`, `GL_TEXTURE_FIXED_SAMPLE_LOCATIONS`, `GL_TEXTURE_RED_SIZE`, `GL_TEXTURE_GREEN_SIZE`, `GL_TEXTURE_BLUE_SIZE`, `GL_TEXTURE_ALPHA_SIZE`, `GL_TEXTURE_DEPTH_SIZE`, `GL_TEXTURE_STENCIL_SIZE`, `GL_TEXTURE_SHARED_SIZE`, `GL_TEXTURE_RED_TYPE`, `GL_TEXTURE_GREEN_TYPE`, `GL_TEXTURE_BLUE_TYPE`, `GL_TEXTURE_ALPHA_TYPE`, `GL_TEXTURE_DEPTH_TYPE`, `GL_TEXTURE_COMPRESSED`, `GL_TEXTURE_BUFFER_DATA_STORE_BINDING`, `GL_TEXTURE_BUFFER_OFFSET`, and `GL_TEXTURE_BUFFER_SIZE` are accepted.
    * 
    * _`params`_
    * 
    * Returns the requested data.
    * 
    * Description
    * -----------
    * 
    * `glGetTexLevelParameter` returns in _`params`_ texture parameter values for a specific level-of-detail value, specified as _`level`_. _`target`_ defines the target texture, either `GL_TEXTURE_2D`, `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`, `GL_TEXTURE_CUBE_MAP_ARRAY`, or `GL_TEXTURE_BUFFER`.
    * 
    * _`pname`_ specifies the texture parameter whose value or values will be returned.
    * 
    * The accepted parameter names are as follows:
    * 
    * `GL_TEXTURE_WIDTH`
    * 
    * _`params`_ returns a single value, the width of the texture image. The initial value is 0.
    * 
    * `GL_TEXTURE_HEIGHT`
    * 
    * _`params`_ returns a single value, the height of the texture image. The initial value is 0.
    * 
    * `GL_TEXTURE_DEPTH`
    * 
    * _`params`_ returns a single value, the depth of the texture image. The initial value is 0.
    * 
    * `GL_TEXTURE_INTERNAL_FORMAT`
    * 
    * _`params`_ returns a single value, the internal format of the texture image.
    * 
    * `GL_TEXTURE_SAMPLES`
    * 
    * _`params`_ returns a single value, the number of samples of the texture image.
    * 
    * `GL_FIXED_SAMPLE_LOCATIONS`
    * 
    * _`params`_ returns a single boolean value indicating if texture sample fixed locations are enabled.
    * 
    * `GL_TEXTURE_RED_TYPE`, `GL_TEXTURE_GREEN_TYPE`, `GL_TEXTURE_BLUE_TYPE`, `GL_TEXTURE_ALPHA_TYPE`, `GL_TEXTURE_DEPTH_TYPE`
    * 
    * The data type used to store the component. The types `GL_NONE`, `GL_SIGNED_NORMALIZED`, `GL_UNSIGNED_NORMALIZED`, `GL_FLOAT`, `GL_INT`, and `GL_UNSIGNED_INT` may be returned to indicate missing, signed normalized fixed-point, unsigned normalized fixed-point, floating-point, signed unnormalized integer, and unsigned unnormalized integer components, respectively.
    * 
    * `GL_TEXTURE_RED_SIZE`, `GL_TEXTURE_GREEN_SIZE`, `GL_TEXTURE_BLUE_SIZE`, `GL_TEXTURE_ALPHA_SIZE`, `GL_TEXTURE_DEPTH_SIZE`, `GL_TEXTURE_SHARED_SIZE`
    * 
    * The actual internal storage resolution of an individual component.
    * 
    * `GL_TEXTURE_COMPRESSED`
    * 
    * _`params`_ returns a single boolean value indicating if the texture image is stored in a compressed internal format.
    * 
    * `GL_TEXTURE_BUFFER_DATA_STORE_BINDING`
    * 
    * _`params`_ returns the name of the buffer object bound to the data store for a buffer texture. See [glTexBufferRange][de.dasbabypixel.gamelauncher.gles.es32.glTexBufferRange.glTexBufferRange]
    * 
    * `GL_TEXTURE_BUFFER_OFFSET`
    * 
    * _`params`_ returns a single integer value, the offset into the data store of the buffer bound to a buffer texture. See [glTexBufferRange][de.dasbabypixel.gamelauncher.gles.es32.glTexBufferRange.glTexBufferRange]
    * 
    * `GL_TEXTURE_BUFFER_SIZE`
    * 
    * _`params`_ returns a single integer value, the size of the range of a data store of the buffer bound to a buffer texture. See [glTexBufferRange][de.dasbabypixel.gamelauncher.gles.es32.glTexBufferRange.glTexBufferRange]
    * 
    * Notes
    * -----
    * 
    * If an error is generated, no change is made to the contents of _`params`_.
    * 
    * `glGetTexLevelParameter` returns the texture level parameters for the active texture unit.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ or _`pname`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if _`level`_ is less than 0.
    * 
    * `GL_INVALID_VALUE` may be generated if _`level`_ is greater than log 2 _max_, where _max_ is the returned value of the relevant one of `GL_MAX_TEXTURE_SIZE`, `GL_MAX_3D_TEXTURE_SIZE` or `GL_MAX_CUBEMAP_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`target`_ is `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, or `GL_TEXTURE_BUFFER`, and _`level`_ is not zero.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetTexLevelParameterfv` | \- | \- | ✔ | ✔ |
    * | `glGetTexLevelParameteriv` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture], [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf] [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexStorage2DMultisample][de.dasbabypixel.gamelauncher.gles.es31.glTexStorage2DMultisample.glTexStorage2DMultisample], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D], [glTexBuffer][de.dasbabypixel.gamelauncher.gles.es32.glTexBuffer.glTexBuffer], [glTexBufferRange][de.dasbabypixel.gamelauncher.gles.es32.glTexBufferRange.glTexBufferRange]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetTexLevelParameterfv.glGetTexLevelParameterfv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetTexLevelParameteriv.glGetTexLevelParameteriv
    */
    fun glGetTexLevelParameterfv(target: Int, level: Int, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.FloatBuffer)
}