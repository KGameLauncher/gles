package de.dasbabypixel.gamelauncher.gles.es20

interface glDeleteShader {
    /**
    * Name
    * ----
    * 
    * glDeleteShader — Deletes a shader object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteShader**(` | GLuint shader`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`shader`_
    * 
    * Specifies the shader object to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteShader` frees the memory and invalidates the name associated with the shader object specified by _`shader`_. This command effectively undoes the effects of a call to [glCreateShader][de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader].
    * 
    * If a shader object to be deleted is attached to a program object, it will be flagged for deletion, but it will not be deleted until it is no longer attached to any program object, for any rendering context (i.e., it must be detached from wherever it was attached before it will be deleted). A value of 0 for _`shader`_ will be silently ignored.
    * 
    * To determine whether an object has been flagged for deletion, call [glGetShaderiv][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderiv.glGetShaderiv] with arguments _`shader`_ and `GL_DELETE_STATUS`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`shader`_ is not a value generated by OpenGL.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetAttachedShaders][de.dasbabypixel.gamelauncher.gles.es20.glGetAttachedShaders.glGetAttachedShaders] with the program object to be queried
    * 
    * [glGetShaderiv][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderiv.glGetShaderiv] with arguments _`shader`_ and `GL_DELETE_STATUS`
    * 
    * [glIsShader][de.dasbabypixel.gamelauncher.gles.es20.glIsShader.glIsShader]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDeleteShader | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram], [glCreateShader][de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader], [glDetachShader][de.dasbabypixel.gamelauncher.gles.es20.glDetachShader.glDetachShader], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDeleteShader.glDeleteShader
    */
    fun glDeleteShader(shader: UInt)
}