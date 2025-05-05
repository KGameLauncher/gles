package de.dasbabypixel.gamelauncher.gles.es31

interface glGetMultisamplefv {
    /**
    * Name
    * ----
    * 
    * glGetMultisamplefv — retrieve the location of a sample
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetMultisamplefv**(` | GLenum pname, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | GLfloat \*val`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pname`_
    * 
    * Specifies the sample parameter name. _`pname`_ must be `GL_SAMPLE_POSITION`.
    * 
    * _`index`_
    * 
    * Specifies the index of the sample whose position to query.
    * 
    * _`val`_
    * 
    * Specifies the address of an array to receive the position of the sample.
    * 
    * Description
    * -----------
    * 
    * `glGetMultisamplefv` queries the location of a given sample. _`pname`_ specifies the sample parameter to retrieve and must be `GL_SAMPLE_POSITION`. _`index`_ corresponds to the sample for which the location should be returned. The sample location is returned as two floating-point values in _`val[0]`_ and _`val[1]`_, each between 0 and 1, corresponding to the _`x`_ and _`y`_ locations respectively in the GL pixel space of that sample. (0.5, 0.5) thus corresponds to the pixel center. _`index`_ must be between zero and the value of `GL_SAMPLES` minus one.
    * 
    * If the multisample mode does not have fixed sample locations, the returned values may only reflect the locations of samples within some pixels.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not one `GL_SAMPLE_POSITION`.
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to the value of `GL_SAMPLES`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetMultisamplefv` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetMultisamplefv.glGetMultisamplefv
    */
    fun glGetMultisamplefv(pname: Int, index: UInt, `val`: java.nio.FloatBuffer)
}