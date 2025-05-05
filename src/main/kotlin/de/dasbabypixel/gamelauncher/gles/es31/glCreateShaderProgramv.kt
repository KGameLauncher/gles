package de.dasbabypixel.gamelauncher.gles.es31

interface glCreateShaderProgramv {
    /**
    * Name
    * ----
    * 
    * glCreateShaderProgramv — create a stand-alone program from an array of null-terminated source code strings
    * 
    * C Specification
    * ---------------
    * 
    * | `GLuint **glCreateShaderProgramv**(` | GLenum type, |
    * | --- | --- |
    * |   | GLsizei count, |
    * |   | const char \*\*strings`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`type`_
    * 
    * Specifies the type of shader to create.
    * 
    * _`count`_
    * 
    * Specifies the number of source code strings in the array _`strings`_.
    * 
    * _`strings`_
    * 
    * Specifies the address of an array of pointers to source code strings from which to create the program object.
    * 
    * Description
    * -----------
    * 
    * `glCreateShaderProgramv` creates a program object containing compiled and linked shaders for a single stage specified by _`type`_. _`strings`_ refers to an array of _`count`_ strings from which to create the shader executables.
    * 
    * `glCreateShaderProgramv` is equivalent (assuming no errors are generated) to:
    * 
    *     const GLuint shader = glCreateShader(type);
    *     if (shader) {
    *         glShaderSource(shader, count, strings, NULL);
    *         glCompileShader(shader);
    *         const GLuint program = glCreateProgram();
    *         if (program) {
    *             GLint compiled = GL\_FALSE;
    *             glGetShaderiv(shader, GL\_COMPILE\_STATUS, &compiled);
    *             glProgramParameteri(program, GL\_PROGRAM\_SEPARABLE, GL\_TRUE);
    *             if (compiled) {
    *                 glAttachShader(program, shader);
    *                 glLinkProgram(program);
    *                 glDetachShader(program, shader);
    *             }
    *             /\* append-shader-info-log-to-program-info-log \*\/
    *         }
    *         glDeleteShader(shader);
    *         return program;
    *     } else {
    *         return 0;
    *     }
    * 
    * The program object created by `glCreateShaderProgramv` has its `GL_PROGRAM_SEPARABLE` status set to `GL_TRUE`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`type`_ is not an accepted shader type.
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ is negative.
    * 
    * Other errors are generated if the supplied shader code fails to compile and link, as described for the commands in the pseudocode sequence above, but all such errors are generated without any side effects of executing those commands.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glCreateShaderProgramv` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCreateShader][de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader], [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram], [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glCreateShaderProgramv.glCreateShaderProgramv
    */
    fun glCreateShaderProgramv(type: Int, count: UInt, strings: Array<String>): UInt
}