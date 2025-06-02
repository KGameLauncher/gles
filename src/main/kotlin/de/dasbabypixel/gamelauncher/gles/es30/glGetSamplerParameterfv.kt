package de.dasbabypixel.gamelauncher.gles.es30

interface glGetSamplerParameterfv {
    /**
    * Name
    * ----
    * 
    * glGetSamplerParameter — return sampler parameter values
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetSamplerParameterfv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLfloat \* params`)`; |
    * 
    * | `void **glGetSamplerParameteriv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
    * 
    * | `void **glGetSamplerParameterIiv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
    * 
    * | `void **glGetSamplerParameterIuiv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLuint \* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`sampler`_
    * 
    * Specifies name of the sampler object from which to retrieve parameters.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of a sampler parameter. `GL_TEXTURE_MAG_FILTER`, `GL_TEXTURE_MIN_FILTER`, `GL_TEXTURE_MIN_LOD`, `GL_TEXTURE_MAX_LOD`, `GL_TEXTURE_WRAP_S`, `GL_TEXTURE_WRAP_T`, `GL_TEXTURE_WRAP_R`, `GL_TEXTURE_COMPARE_MODE`, `GL_TEXTURE_COMPARE_FUNC`, and `GL_TEXTURE_BORDER_COLOR` are accepted.
    * 
    * _`params`_
    * 
    * Returns the sampler parameters.
    * 
    * Description
    * -----------
    * 
    * `glGetSamplerParameter`\* returns in _`params`_ the value or values of the sampler parameter specified as _`pname`_. _`sampler`_ defines the target sampler, and must be the name of an existing sampler object, returned from a previous call to [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers]. _`pname`_ accepts the same symbols as [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf]\*, with the same interpretations:
    * 
    * `GL_TEXTURE_MAG_FILTER`
    * 
    * Returns the single-valued texture magnification filter, a symbolic constant. The initial value is `GL_LINEAR`.
    * 
    * `GL_TEXTURE_MIN_FILTER`
    * 
    * Returns the single-valued texture minification filter, a symbolic constant. The initial value is `GL_NEAREST_MIPMAP_LINEAR`.
    * 
    * `GL_TEXTURE_MIN_LOD`
    * 
    * Returns the single-valued texture minimum level-of-detail value. The initial value is \-1000 .
    * 
    * `GL_TEXTURE_MAX_LOD`
    * 
    * Returns the single-valued texture maximum level-of-detail value. The initial value is 1000.
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
    * `GL_TEXTURE_COMPARE_MODE`
    * 
    * Returns a single-valued texture comparison mode, a symbolic constant. The initial value is `GL_NONE`. See [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf].
    * 
    * `GL_TEXTURE_COMPARE_FUNC`
    * 
    * Returns a single-valued texture comparison function, a symbolic constant. The initial value is `GL_LEQUAL`. See [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf].
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
    * `GL_INVALID_OPERATION` is generated if _`sampler`_ is not the name of a sampler object returned from a previous call to [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers].
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetSamplerParameterfv` | \- | ✔ | ✔ | ✔ |
    * | `glGetSamplerParameteriv` | \- | ✔ | ✔ | ✔ |
    * | `glGetSamplerParameterIiv` | \- | \- | \- | ✔ |
    * | `glGetSamplerParameterIuiv` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf], [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers], [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers], [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetSamplerParameterfv.glGetSamplerParameterfv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetSamplerParameteriv.glGetSamplerParameteriv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetSamplerParameterIiv.glGetSamplerParameterIiv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetSamplerParameterIuiv.glGetSamplerParameterIuiv
    */
    fun glGetSamplerParameterfv(sampler: UInt, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.FloatBuffer)
}