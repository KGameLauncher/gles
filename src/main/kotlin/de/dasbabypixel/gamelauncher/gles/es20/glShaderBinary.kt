package de.dasbabypixel.gamelauncher.gles.es20

interface glShaderBinary {
    /**
    * Name
    * ----
    * 
    * glShaderBinary — load pre-compiled shader binaries
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glShaderBinary**(` | GLsizei count, |
    * | --- | --- |
    * |   | const GLuint \*shaders, |
    * |   | GLenum binaryFormat, |
    * |   | const void \*binary, |
    * |   | GLsizei length`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`count`_
    * 
    * Specifies the number of shader object handles contained in _`shaders`_.
    * 
    * _`shaders`_
    * 
    * Specifies the address of an array of shader handles into which to load pre-compiled shader binaries.
    * 
    * _`binaryFormat`_
    * 
    * Specifies the format of the shader binaries contained in _`binary`_.
    * 
    * _`binary`_
    * 
    * Specifies the address of an array of bytes containing pre-compiled binary shader code.
    * 
    * _`length`_
    * 
    * Specifies the length of the array whose address is given in _`binary`_.
    * 
    * Description
    * -----------
    * 
    * `glShaderBinary` loads pre-compiled shader binary code into the _`count`_ shader objects whose handles are given in _`shaders`_. _`binary`_ points to _`length`_ bytes of binary shader code stored in client memory. _`binaryFormat`_ specifies the format of the pre-compiled code.
    * 
    * The binary image contained in _`binary`_ will be decoded according to the extension specification defining the specified _`binaryFormat`_ token. OpenGL ES does not define any specific binary formats, but it does provide a mechanism to obtain token vaues for such formats provided by such extensions.
    * 
    * Depending on the types of the shader objects in _`shaders`_, `glShaderBinary` will individually load binary vertex or fragment shaders, or load an executable binary that contains an optimized pair of vertex and fragment shaders stored in the same binary.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if more than one of the handles in _`shaders`_ refers to the same shader object.
    * 
    * `GL_INVALID_ENUM` is generated if _`binaryFormat`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if the data pointed to by _`binary`_ does not match the format specified by _`binaryFormat`_.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with parameter `GL_NUM_SHADER_BINARY_FORMATS`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with parameter `GL_SHADER_BINARY_FORMATS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glShaderBinary | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv], [glGetProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glGetProgramBinary.glGetProgramBinary], [glProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glProgramBinary.glProgramBinary]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glShaderBinary.glShaderBinary
    */
    fun glShaderBinary(count: UInt, shaders: de.dasbabypixel.gamelauncher.buffers.IntBufferRO, binaryFormat: Int, binary: de.dasbabypixel.gamelauncher.buffers.BufferRO, length: UInt)
}