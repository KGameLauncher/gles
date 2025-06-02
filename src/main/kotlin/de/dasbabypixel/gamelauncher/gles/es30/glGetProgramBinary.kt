package de.dasbabypixel.gamelauncher.gles.es30

interface glGetProgramBinary {
    /**
    * Name
    * ----
    * 
    * glGetProgramBinary — return a binary representation of a program object's compiled and linked executable source
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetProgramBinary**(` | GLuint program, |
    * | --- | --- |
    * |   | GLsizei bufsize, |
    * |   | GLsizei \*length, |
    * |   | GLenum \*binaryFormat, |
    * |   | void \*binary`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the name of a program object whose binary representation to retrieve.
    * 
    * _`bufSize`_
    * 
    * Specifies the size of the buffer whose address is given by _`binary`_.
    * 
    * _`length`_
    * 
    * Specifies the address of a variable to receive the number of bytes written into _`binary`_.
    * 
    * _`binaryFormat`_
    * 
    * Specifies the address of a variable to receive a token indicating the format of the binary data returned by the GL.
    * 
    * _`binary`_
    * 
    * Specifies the address an array into which the GL will return _`program`_'s binary representation.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramBinary` returns a binary representation of the compiled and linked executable for _`program`_ into the array of bytes whose address is specified in _`binary`_. The maximum number of bytes that may be written into _`binary`_ is specified by _`bufSize`_. If the program binary is greater in size than _`bufSize`_ bytes, then an error is generated, otherwise the actual number of bytes written into _`binary`_ is returned in the variable whose address is given by _`length`_. If _`length`_ is `NULL`, then no length is returned.
    * 
    * The format of the program binary written into _`binary`_ is returned in the variable whose address is given by _`binaryFormat`_, and may be implementation dependent. The binary produced by the GL may subsequently be returned to the GL by calling [glProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glProgramBinary.glProgramBinary], with _`binaryFormat`_ and _`length`_ set to the values returned by `glGetProgramBinary`, and passing the returned binary data in the _`binary`_ parameter.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`bufSize`_ is less than the size of `GL_PROGRAM_BINARY_LENGTH` for _`program`_.
    * 
    * `GL_INVALID_OPERATION` is generated if `GL_LINK_STATUS` for the program object is false.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with argument `GL_PROGRAM_BINARY_LENGTH`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetProgramBinary | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv], [glProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glProgramBinary.glProgramBinary]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetProgramBinary.glGetProgramBinary
    */
    fun glGetProgramBinary(program: UInt, bufsize: UInt, length: java.nio.IntBuffer, binaryFormat: java.nio.IntBuffer, binary: java.nio.Buffer)
}