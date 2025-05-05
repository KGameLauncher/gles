package de.dasbabypixel.gamelauncher.gles.es30

interface glIsQuery {
    /**
    * Name
    * ----
    * 
    * glIsQuery — determine if a name corresponds to a query object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsQuery**(` | GLuint id`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`id`_
    * 
    * Specifies a value that may be the name of a query object.
    * 
    * Description
    * -----------
    * 
    * `glIsQuery` returns `GL_TRUE` if _`id`_ is currently the name of a query object. If _`id`_ is zero, or is a non-zero value that is not currently the name of a query object, or if an error occurs, `glIsQuery` returns `GL_FALSE`.
    * 
    * A name returned by [glGenQueries][de.dasbabypixel.gamelauncher.gles.es30.glGenQueries.glGenQueries], but not yet associated with a query object by calling [glBeginQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], is not the name of a query object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsQuery | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBeginQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glDeleteQueries][de.dasbabypixel.gamelauncher.gles.es30.glDeleteQueries.glDeleteQueries], [glEndQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glGenQueries][de.dasbabypixel.gamelauncher.gles.es30.glGenQueries.glGenQueries]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glIsQuery.glIsQuery
    */
    fun glIsQuery(id: UInt): Boolean
}