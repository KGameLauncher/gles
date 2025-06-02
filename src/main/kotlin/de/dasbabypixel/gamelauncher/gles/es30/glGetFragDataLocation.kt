package de.dasbabypixel.gamelauncher.gles.es30

interface glGetFragDataLocation {
    /**
    * Name
    * ----
    * 
    * glGetFragDataLocation — query the bindings of color numbers to user-defined varying out variables
    * 
    * C Specification
    * ---------------
    * 
    * | `GLint **glGetFragDataLocation**(` | GLuint program, |
    * | --- | --- |
    * |   | const char \* name`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * The name of the program containing varying out variable whose binding to query
    * 
    * _`name`_
    * 
    * The name of the user-defined varying out variable whose binding to query
    * 
    * Description
    * -----------
    * 
    * `glGetFragDataLocation` retrieves the assigned color number binding for the user-defined varying out variable _`name`_ for program _`program`_. _`program`_ must have previously been linked. _`name`_ must be a null-terminated string. If _`name`_ is not the name of an active user-defined varying out fragment shader variable within _`program`_, -1 will be returned.
    * 
    * Notes
    * -----
    * 
    * In OpenGL ES Shading Language version 3.00, output variables must be explicitly bound to fragment colors within the shader text. This query simply returns that binding information.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not the name of a program object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetFragDataLocation | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetFragDataLocation.glGetFragDataLocation
    */
    fun glGetFragDataLocation(program: UInt, name: String?): Int
}