package de.dasbabypixel.gamelauncher.gles.es30

interface glBindSampler {
    /**
    * Name
    * ----
    * 
    * glBindSampler — bind a named sampler to a texturing target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindSampler**(` | GLuint unit, |
    * | --- | --- |
    * |   | GLuint sampler`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`unit`_
    * 
    * Specifies the index of the texture unit to which the sampler is bound.
    * 
    * _`sampler`_
    * 
    * Specifies the name of a sampler.
    * 
    * Description
    * -----------
    * 
    * `glBindSampler` binds _`sampler`_ to the texture unit at index _`unit`_. _`sampler`_ must be zero or the name of a sampler object previously returned from a call to [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers]. _`unit`_ must be less than the value of `GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS`.
    * 
    * When a sampler object is bound to a texture unit, its state supersedes that of the texture object bound to that texture unit. If the sampler name zero is bound to a texture unit, the currently bound texture's sampler state becomes active. A single sampler object may be bound to multiple texture units simultaneously.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`unit`_ is greater than or equal to the value of `GL_MAX_COMBIED_TEXTURE_IMAGE_UNITS`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`sampler`_ is not zero or a name previously returned from a call to [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers], or if such a name has been deleted by a call to [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers].
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_SAMPLER_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindSampler | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers], [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf], [glGetSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glGetSamplerParameterfv.glGetSamplerParameterfv], [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures], [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glDeleteTextures][de.dasbabypixel.gamelauncher.gles.es20.glDeleteTextures.glDeleteTextures]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler
    */
    fun glBindSampler(unit: UInt, sampler: UInt)
}