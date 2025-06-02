package de.dasbabypixel.gamelauncher.gles.es31

interface glGetProgramResourceLocation {
    /**
    * Name
    * ----
    * 
    * glGetProgramResourceLocation — query the location of a named resource within a program
    * 
    * C Specification
    * ---------------
    * 
    * | `GLint **glGetProgramResourceLocation**(` | GLuint program, |
    * | --- | --- |
    * |   | GLenum programInterface, |
    * |   | const char \* name`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * The name of a program object whose resources to query.
    * 
    * _`programInterface`_
    * 
    * A token identifying the interface within _`program`_ containing the resource named _`name`_.
    * 
    * _`name`_
    * 
    * The name of the resource to query the location of.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramResourceLocation` returns the location assigned to the variable named _`name`_ in interface _`programInterface`_ of program object _`program`_. _`program`_ must be the name of a program that has been linked successfully. _`programInterface`_ must be one of `GL_UNIFORM`, `GL_PROGRAM_INPUT`, `GL_PROGRAM_OUTPUT`, or `GL_TRANSFORM_FEEDBACK_BUFFER`.
    * 
    * The value -1 will be returned if an error occurs, if _`name`_ does not identify an active variable on _`programInterface`_, or if _`name`_ identifies an active variable that does not have a valid location assigned, as described above. The locations returned by these commands are the same locations returned when querying the `GL_LOCATION` and `GL_LOCATION_INDEX` resource properties.
    * 
    * A string provided to `glGetProgramResourceLocation` is considered to match an active variable if:
    * 
    * *   the string exactly matches the name of the active variable
    * 
    * *   if the string identifies the base name of an active array, where the string would exactly match the name of the variable if the suffix "\[0\]" were appended to the string
    * 
    * *   if the string identifies an active element of the array, where the string ends with the concatenation of the "\[" character, an integer _with no "+" sign, extra leading zeroes, or whitespace_ identifying an array element, and the "\]" character, the integer is less than the number of active elements of the array variable, and where the string would exactly match the enumerated name of the array if the decimal integer were replaced with zero.
    * 
    * 
    * Any other string is considered not to identify an active variable. If the string specifies an element of an array variable, `glGetProgramResourceLocation` returns the location assigned to that element. If it specifies the base name of an array, it identifies the resources associated with the first element of the array.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not the name of an existing program object.
    * 
    * `GL_INVALID_ENUM` is generated if _`programInterface`_ is not one of the accepted interface types.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ has not been linked successfully.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetProgramResourceLocation` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramResourceName][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceName.glGetProgramResourceName], [glGetProgramResourceIndex][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceIndex.glGetProgramResourceIndex], [glGetGetProgramResource](glGetGetProgramResource.xhtml), [glGetProgramResourceIndex][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceIndex.glGetProgramResourceIndex].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetProgramResourceLocation.glGetProgramResourceLocation
    */
    fun glGetProgramResourceLocation(program: UInt, programInterface: Int, name: String?): Int
}