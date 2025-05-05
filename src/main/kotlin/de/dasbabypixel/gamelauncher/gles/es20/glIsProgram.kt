package de.dasbabypixel.gamelauncher.gles.es20

interface glIsProgram {
    /**
    * Name
    * ----
    * 
    * glIsProgram — Determines if a name corresponds to a program object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsProgram**(` | GLuint program`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies a potential program object.
    * 
    * Description
    * -----------
    * 
    * `glIsProgram` returns `GL_TRUE` if _`program`_ is the name of a program object previously created with [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram] and not yet deleted with [glDeleteProgram][de.dasbabypixel.gamelauncher.gles.es20.glDeleteProgram.glDeleteProgram]. If _`program`_ is zero or a non-zero value that is not the name of a program object, or if an error occurs, `glIsProgram` returns `GL_FALSE`.
    * 
    * Notes
    * -----
    * 
    * No error is generated if _`program`_ is not a valid program object name.
    * 
    * A program object marked for deletion with [glDeleteProgram][de.dasbabypixel.gamelauncher.gles.es20.glDeleteProgram.glDeleteProgram] but still in use as part of current rendering state is still considered a program object and `glIsProgram` will return `GL_TRUE`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with the argument `GL_CURRENT_PROGRAM`
    * 
    * [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib] with arguments _`program`_ and the index of an active attribute variable
    * 
    * [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform] with arguments _`program`_ and the index of an active uniform variable
    * 
    * [glGetAttachedShaders][de.dasbabypixel.gamelauncher.gles.es20.glGetAttachedShaders.glGetAttachedShaders] with argument _`program`_
    * 
    * [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation] with arguments _`program`_ and the name of an attribute variable
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with arguments _`program`_ and the parameter to be queried
    * 
    * [glGetProgramInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramInfoLog.glGetProgramInfoLog] with argument _`program`_
    * 
    * [glGetUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformfv.glGetUniformfv] with arguments _`program`_ and the location of a uniform variable
    * 
    * [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation] with arguments _`program`_ and the name of a uniform variable
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsProgram | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glAttachShader][de.dasbabypixel.gamelauncher.gles.es20.glAttachShader.glAttachShader], [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation], [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram], [glDeleteProgram][de.dasbabypixel.gamelauncher.gles.es20.glDeleteProgram.glDeleteProgram], [glDetachShader][de.dasbabypixel.gamelauncher.gles.es20.glDetachShader.glDetachShader], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], [glValidateProgram][de.dasbabypixel.gamelauncher.gles.es20.glValidateProgram.glValidateProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glIsProgram.glIsProgram
    */
    fun glIsProgram(program: UInt): Boolean
}