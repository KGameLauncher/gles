package de.dasbabypixel.gamelauncher.gles.es20

interface glCreateProgram {
    /**
    * Name
    * ----
    * 
    * glCreateProgram — Creates a program object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLuint **glCreateProgram**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * `glCreateProgram` creates an empty program object and returns a non-zero value by which it can be referenced. A program object is an object to which shader objects can be attached. This provides a mechanism to specify the shader objects that will be linked to create a program. It also provides a means for checking the compatibility of the shaders that will be used to create a program (for instance, checking the compatibility between a vertex shader and a fragment shader). When no longer needed as part of a program object, shader objects can be detached.
    * 
    * One or more executables are created in a program object by successfully attaching shader objects to it with [glAttachShader][de.dasbabypixel.gamelauncher.gles.es20.glAttachShader.glAttachShader], successfully compiling the shader objects with [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader], and successfully linking the program object with [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram]. These executables are made part of current state when [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram] is called. Program objects can be deleted by calling [glDeleteProgram][de.dasbabypixel.gamelauncher.gles.es20.glDeleteProgram.glDeleteProgram]. The memory associated with the program object will be deleted when it is no longer part of current rendering state for any context.
    * 
    * Notes
    * -----
    * 
    * Like buffer and texture objects, the name space for program objects may be shared across a set of contexts, as long as the server sides of the contexts share the same address space. If the name space is shared across contexts, any attached objects and the data associated with those attached objects are shared as well.
    * 
    * Applications are responsible for providing the synchronization across API calls when objects are accessed from different execution threads.
    * 
    * Errors
    * ------
    * 
    * This function returns 0 if an error occurs creating the program object.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with the argument `GL_CURRENT_PROGRAM`
    * 
    * [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib] with a valid program object and the index of an active attribute variable
    * 
    * [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform] with a valid program object and the index of an active uniform variable
    * 
    * [glGetAttachedShaders][de.dasbabypixel.gamelauncher.gles.es20.glGetAttachedShaders.glGetAttachedShaders] with a valid program object
    * 
    * [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation] with a valid program object and the name of an attribute variable
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with a valid program object and the parameter to be queried
    * 
    * [glGetProgramInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramInfoLog.glGetProgramInfoLog] with a valid program object
    * 
    * [glGetUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformfv.glGetUniformfv] with a valid program object and the location of a uniform variable
    * 
    * [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation] with a valid program object and the name of a uniform variable
    * 
    * [glIsProgram][de.dasbabypixel.gamelauncher.gles.es20.glIsProgram.glIsProgram]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glCreateProgram | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glAttachShader][de.dasbabypixel.gamelauncher.gles.es20.glAttachShader.glAttachShader], [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation], [glCreateShader][de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader], [glDeleteProgram][de.dasbabypixel.gamelauncher.gles.es20.glDeleteProgram.glDeleteProgram], [glDetachShader][de.dasbabypixel.gamelauncher.gles.es20.glDetachShader.glDetachShader], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], [glValidateProgram][de.dasbabypixel.gamelauncher.gles.es20.glValidateProgram.glValidateProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram
    */
    fun glCreateProgram(): UInt
}