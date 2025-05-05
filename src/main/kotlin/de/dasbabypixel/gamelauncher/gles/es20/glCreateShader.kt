package de.dasbabypixel.gamelauncher.gles.es20

interface glCreateShader {
    /**
    * Name
    * ----
    * 
    * glCreateShader — Creates a shader object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLuint **glCreateShader**(` | GLenum shaderType`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`shaderType`_
    * 
    * Specifies the type of shader to be created. Must be one of `GL_COMPUTE_SHADER`, `GL_VERTEX_SHADER`, `GL_TESS_CONTROL_SHADER`, `GL_TESS_EVALUATION_SHADER`, `GL_GEOMETRY_SHADER`, or `GL_FRAGMENT_SHADER`.
    * 
    * Description
    * -----------
    * 
    * `glCreateShader` creates an empty shader object and returns a non-zero value by which it can be referenced. A shader object is used to maintain the source code strings that define a shader. _`shaderType`_ indicates the type of shader to be created. Three types of shaders are supported. A shader of type `GL_VERTEX_SHADER` is a shader that is intended to run on the programmable vertex processor. A shader of type `GL_FRAGMENT_SHADER` is a shader that is intended to run on the programmable fragment processor. A shader of type `GL_COMPUTE_SHADER` is a shader that is intended to run on the programmable compute processor. A shader of type `GL_TESS_CONTROL_SHADER` is a shader that is intended to run on the programmable tessellation processor in the control stage. A shader of type `GL_TESS_EVALUATION_SHADER` is a shader that is intended to run on the programmable tessellation processor in the evaluation stage. A shader of type `GL_GEOMETRY_SHADER` is a shader that is intended to run on the programmable geometry processor.
    * 
    * When created, a shader object's `GL_SHADER_TYPE` parameter is set to `GL_COMPUTE_SHADER`, `GL_VERTEX_SHADER`, `GL_TESS_CONTROL_SHADER`, `GL_TESS_EVALUATION_SHADER`, `GL_GEOMETRY_SHADER`, or `GL_FRAGMENT_SHADER`, depending on the value of _`shaderType`_.
    * 
    * Notes
    * -----
    * 
    * Like buffer and texture objects, the name space for shader objects may be shared across a set of contexts, as long as the server sides of the contexts share the same address space. If the name space is shared across contexts, any attached objects and the data associated with those attached objects are shared as well.
    * 
    * Applications are responsible for providing the synchronization across API calls when objects are accessed from different execution threads.
    * 
    * `GL_COMPUTE_SHADER` is available only if the GL ES version is 3.1 or higher.
    * 
    * `GL_TESS_CONTROL_SHADER`, `GL_TESS_EVALUATION_SHADER`, and `GL_GEOMETRY_SHADER` are available only if the GL ES version is 3.2 or higher.
    * 
    * Errors
    * ------
    * 
    * This function returns 0 if an error occurs creating the shader object.
    * 
    * `GL_INVALID_ENUM` is generated if _`shaderType`_ is not an accepted value.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetShaderiv][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderiv.glGetShaderiv] with a valid shader object and the parameter to be queried
    * 
    * [glGetShaderInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderInfoLog.glGetShaderInfoLog] with a valid shader object
    * 
    * [glGetShaderSource][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderSource.glGetShaderSource] with a valid shader object
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
    * | `glCreateShader` | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glAttachShader][de.dasbabypixel.gamelauncher.gles.es20.glAttachShader.glAttachShader], [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader], [glDeleteShader][de.dasbabypixel.gamelauncher.gles.es20.glDeleteShader.glDeleteShader], [glDetachShader][de.dasbabypixel.gamelauncher.gles.es20.glDetachShader.glDetachShader], [glShaderSource][de.dasbabypixel.gamelauncher.gles.es20.glShaderSource.glShaderSource]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader
    */
    fun glCreateShader(shaderType: Int): UInt
}