package de.dasbabypixel.gamelauncher.gles.es30

interface glProgramParameteri {
    /**
    * Name
    * ----
    * 
    * glProgramParameteri — specify a parameter for a program object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glProgramParameteri**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint value`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the name of a program object whose parameter to modify.
    * 
    * _`pname`_
    * 
    * Specifies the name of the parameter to modify.
    * 
    * _`value`_
    * 
    * Specifies the new value of the parameter specified by _`pname`_ for _`program`_.
    * 
    * Description
    * -----------
    * 
    * `glProgramParameteri` specifies a new value for the parameter nameed by _`pname`_ for the program object _`program`_.
    * 
    * If _`pname`_ is `GL_PROGRAM_BINARY_RETRIEVABLE_HINT`, _`value`_ should be `GL_FALSE` or `GL_TRUE` to indicate to the implementation the intention of the application to retrieve the program's binary representation with [glGetProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glGetProgramBinary.glGetProgramBinary]. The implementation may use this information to store information that may be useful for a future query of the program's binary. It is recommended to set `GL_PROGRAM_BINARY_RETRIEVABLE_HINT` for the program to `GL_TRUE` before calling [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], and using the program at run-time if the binary is to be retrieved later.
    * 
    * If _`pname`_ is `GL_PROGRAM_SEPARABLE`, _`value`_ must be `GL_TRUE` or `GL_FALSE` and indicates whether _`program`_ can be bound to individual pipeline stages via [glUseProgramStages][de.dasbabypixel.gamelauncher.gles.es31.glUseProgramStages.glUseProgramStages]. A program's `GL_PROGRAM_SEPARABLE` parameter must be set to `GL_TRUE` _before_ [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] is called in order for it to be usable with a program pipeline object. The initial state of `GL_PROGRAM_SEPARABLE` is `GL_FALSE`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not the name of an existing program object.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not one of the accepted values.
    * 
    * `GL_INVALID_VALUE` is generated if _`value`_ is not a valid value for the parameter named by _`pname`_.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv].
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glProgramParameteri | \- | ✔ | ✔ | ✔ |
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
    * @see de.dasbabypixel.gamelauncher.gles.es30.glProgramParameteri.glProgramParameteri
    */
    fun glProgramParameteri(program: UInt, pname: Int, value: Int)
}