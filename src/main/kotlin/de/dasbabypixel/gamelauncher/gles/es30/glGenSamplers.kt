package de.dasbabypixel.gamelauncher.gles.es30

interface glGenSamplers {
    /**
    * Name
    * ----
    * 
    * glGenSamplers — generate sampler object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenSamplers**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*samplers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of sampler object names to generate.
    * 
    * _`samplers`_
    * 
    * Specifies an array in which the generated sampler object names are stored.
    * 
    * Description
    * -----------
    * 
    * `glGenSamplers` returns _`n`_ sampler object names in _`samplers`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenSamplers`.
    * 
    * Sampler object names returned by a call to `glGenSamplers` are not returned by subsequent calls, unless they are first deleted with [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers].
    * 
    * The names returned in _`samplers`_ are marked as used, for the purposes of `glGenSamplers` only, but they acquire state and type only when they are first used as a parameter to [glBindSampler][de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler], [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf]\*, [glGetSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glGetSamplerParameterfv.glGetSamplerParameterfv]\* or [glIsSampler][de.dasbabypixel.gamelauncher.gles.es30.glIsSampler.glIsSampler].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsSampler][de.dasbabypixel.gamelauncher.gles.es30.glIsSampler.glIsSampler], [glGetSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glGetSamplerParameterfv.glGetSamplerParameterfv]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenSamplers | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindSampler][de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler], [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers], [glIsSampler][de.dasbabypixel.gamelauncher.gles.es30.glIsSampler.glIsSampler], [glGetSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glGetSamplerParameterfv.glGetSamplerParameterfv], [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers
    */
    fun glGenSamplers(n: UInt, samplers: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}