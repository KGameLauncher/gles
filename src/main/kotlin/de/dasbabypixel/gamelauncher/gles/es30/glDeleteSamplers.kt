package de.dasbabypixel.gamelauncher.gles.es30

interface glDeleteSamplers {
    /**
    * Name
    * ----
    * 
    * glDeleteSamplers — delete named sampler objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteSamplers**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLuint \* samplers`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of sampler objects to be deleted.
    * 
    * _`samplers`_
    * 
    * Specifies an array of sampler objects to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteSamplers` deletes _`n`_ sampler objects named by the elements of the array _`samplers`_. After a sampler object is deleted, its name is again unused. If a sampler object that is currently bound to one or more texture units is deleted, it is as though [glBindSampler][de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler] is called once for each texture unit to which the sampler is bound, with _`unit`_ set to the texture unit and _`sampler`_ set to zero. Unused names in _`samplers`_ that have been marked as used for the purposes of [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers] are marked as unused again. Unused names in _`samplers`_ are silently ignored, as is the reserved name zero.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsSampler][de.dasbabypixel.gamelauncher.gles.es30.glIsSampler.glIsSampler]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDeleteSamplers | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers], [glBindSampler][de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler], [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers], [glIsSampler][de.dasbabypixel.gamelauncher.gles.es30.glIsSampler.glIsSampler]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers
    */
    fun glDeleteSamplers(n: UInt, samplers: java.nio.IntBuffer)
}