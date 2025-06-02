package de.dasbabypixel.gamelauncher.gles.es20

interface glGetShaderPrecisionFormat {
    /**
    * Name
    * ----
    * 
    * glGetShaderPrecisionFormat — retrieve the range and precision for numeric formats supported by the shader compiler
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetShaderPrecisionFormat**(` | GLenum shaderType, |
    * | --- | --- |
    * |   | GLenum precisionType, |
    * |   | GLint \*range, |
    * |   | GLint \*precision`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`shaderType`_
    * 
    * Specifies the type of shader whose precision to query. _`shaderType`_ must be `GL_VERTEX_SHADER` or `GL_FRAGMENT_SHADER`.
    * 
    * _`precisionType`_
    * 
    * Specifies the numeric format whose precision and range to query.
    * 
    * _`range`_
    * 
    * Specifies the address of array of two integers into which encodings of the implementation's numeric range are returned.
    * 
    * _`precision`_
    * 
    * Specifies the address of an integer into which the numeric precision of the implementation is written.
    * 
    * Description
    * -----------
    * 
    * `glGetShaderPrecisionFormat` retrieves the numeric range and precision for the implementation's representation of quantities in different numeric formats in specified shader type. _`shaderType`_ specifies the type of shader for which the numeric precision and range is to be retrieved and must be one of `GL_VERTEX_SHADER` or `GL_FRAGMENT_SHADER`. _`precisionType`_ specifies the numeric format to query and must be one of `GL_LOW_FLOAT`, `GL_MEDIUM_FLOAT` `GL_HIGH_FLOAT`, `GL_LOW_INT`, `GL_MEDIUM_INT`, or `GL_HIGH_INT`.
    * 
    * _`range`_ points to an array of two integers into which the format's numeric range will be returned. If min and max are the smallest values representable in the format, then the values returned are defined to be: _`range`_\[0\] = floor(log2(|min|)) and _`range`_\[1\] = floor(log2(|max|)).
    * 
    * _`precision`_ specifies the address of an integer into which will be written the log2 value of the number of bits of precision of the format. If the smallest representable value greater than 1 is 1 + _eps_, then the integer addressed by _`precision`_ will contain floor(-log2(eps)).
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`shaderType`_ or _`precisionType`_ is not an accepted value.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetShaderPrecisionFormat | ✔ | ✔ | ✔ | ✔ |
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetShaderPrecisionFormat.glGetShaderPrecisionFormat
    */
    fun glGetShaderPrecisionFormat(shaderType: Int, precisionType: Int, range: de.dasbabypixel.gamelauncher.buffers.IntBuffer, precision: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}