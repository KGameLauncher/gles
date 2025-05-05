package de.dasbabypixel.gamelauncher.gles.es30

interface glIsSampler {
    /**
    * Name
    * ----
    * 
    * glIsSampler — determine if a name corresponds to a sampler object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsSampler**(` | GLuint id`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`id`_
    * 
    * Specifies a value that may be the name of a sampler object.
    * 
    * Description
    * -----------
    * 
    * `glIsSampler` returns `GL_TRUE` if _`id`_ is currently the name of a sampler object. If _`id`_ is zero, or is a non-zero value that is not currently the name of a sampler object, or if an error occurs, `glIsSampler` returns `GL_FALSE`.
    * 
    * A name returned by [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers], is the name of a sampler object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsSampler | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers], [glBindSampler][de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler], [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glIsSampler.glIsSampler
    */
    fun glIsSampler(id: UInt): Boolean
}