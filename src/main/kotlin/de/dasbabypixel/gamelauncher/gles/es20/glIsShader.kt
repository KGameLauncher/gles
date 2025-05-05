package de.dasbabypixel.gamelauncher.gles.es20

interface glIsShader {
    /**
    * Name
    * ----
    * 
    * glIsShader — Determines if a name corresponds to a shader object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsShader**(` | GLuint shader`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`shader`_
    * 
    * Specifies a potential shader object.
    * 
    * Description
    * -----------
    * 
    * `glIsShader` returns `GL_TRUE` if _`shader`_ is the name of a shader object previously created with [glCreateShader][de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader] and not yet deleted with [glDeleteShader][de.dasbabypixel.gamelauncher.gles.es20.glDeleteShader.glDeleteShader]. If _`shader`_ is zero or a non-zero value that is not the name of a shader object, or if an error occurs, `glIsShader` returns `GL_FALSE`.
    * 
    * Notes
    * -----
    * 
    * No error is generated if _`shader`_ is not a valid shader object name.
    * 
    * A shader object marked for deletion with [glDeleteShader][de.dasbabypixel.gamelauncher.gles.es20.glDeleteShader.glDeleteShader] but still attached to a program object is still considered a shader object and `glIsShader` will return `GL_TRUE`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetAttachedShaders][de.dasbabypixel.gamelauncher.gles.es20.glGetAttachedShaders.glGetAttachedShaders] with a valid program object
    * 
    * [glGetShaderiv][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderiv.glGetShaderiv] with arguments _`shader`_ and a parameter to be queried
    * 
    * [glGetShaderInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderInfoLog.glGetShaderInfoLog] with argument _`object`_
    * 
    * [glGetShaderSource][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderSource.glGetShaderSource] with argument _`object`_
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsShader | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glAttachShader][de.dasbabypixel.gamelauncher.gles.es20.glAttachShader.glAttachShader], [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader], [glCreateShader][de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader], [glDeleteShader][de.dasbabypixel.gamelauncher.gles.es20.glDeleteShader.glDeleteShader], [glDetachShader][de.dasbabypixel.gamelauncher.gles.es20.glDetachShader.glDetachShader], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glShaderSource][de.dasbabypixel.gamelauncher.gles.es20.glShaderSource.glShaderSource]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glIsShader.glIsShader
    */
    fun glIsShader(shader: UInt): Boolean
}