package de.dasbabypixel.gamelauncher.gles.es30

interface glProgramBinary {
    /**
    * Name
    * ----
    * 
    * glProgramBinary — load a program object with a program binary
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glProgramBinary**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum binaryFormat, |
    * |   | const void \*binary, |
    * |   | GLsizei length`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the name of a program object into which to load a program binary.
    * 
    * _`binaryFormat`_
    * 
    * Specifies the format of the binary data in binary.
    * 
    * _`binary`_
    * 
    * Specifies the address of an array containing the binary to be loaded into _`program`_.
    * 
    * _`length`_
    * 
    * Specifies the number of bytes contained in _`binary`_.
    * 
    * Description
    * -----------
    * 
    * `glProgramBinary` loads a program object with a program binary previously returned from [glGetProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glGetProgramBinary.glGetProgramBinary]. _`binaryFormat`_ and _`binary`_ must be those returned by a previous call to [glGetProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glGetProgramBinary.glGetProgramBinary], and _`length`_ must be the length returned by [glGetProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glGetProgramBinary.glGetProgramBinary], or by [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] when called with _`pname`_ set to `GL_PROGRAM_BINARY_LENGTH`. If these conditions are not met, loading the program binary will fail and _`program`_'s `GL_LINK_STATUS` will be set to `GL_FALSE`.
    * 
    * A program object's program binary is replaced by calls to [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] or `glProgramBinary`. When linking success or failure is concerned, `glProgramBinary` can be considered to perform an implicit linking operation. [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] and `glProgramBinary` both set the program object's `GL_LINK_STATUS` to `GL_TRUE` or `GL_FALSE`.
    * 
    * A successful call to `glProgramBinary` will reset all uniform variables to their initial values, `GL_FALSE` for booleans and zero for all others. Additionally, all vertex shader input and fragment shader output assignments that were in effect when the program was linked before saving are restored with `glProgramBinary` is called.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not the name of an existing program object.
    * 
    * `GL_INVALID_ENUM` is generated if _`binaryFormat`_ is not a value recognized by the implementation.
    * 
    * Notes
    * -----
    * 
    * A program binary may fail to load if the implementation determines that there has been a change in hardware or software configuration from when the program binary was produced such as having been compiled with an incompatible or outdated version of the compiler.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with argument `GL_PROGRAM_BINARY_LENGTH`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_NUM_PROGRAM_BINARY_FORMATS`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PROGRAM_BINARY_FORMATS`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glProgramBinary | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv], [glGetProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glGetProgramBinary.glGetProgramBinary]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glProgramBinary.glProgramBinary
    */
    fun glProgramBinary(program: UInt, binaryFormat: Int, binary: de.dasbabypixel.gamelauncher.buffers.BufferRO, length: UInt)
}