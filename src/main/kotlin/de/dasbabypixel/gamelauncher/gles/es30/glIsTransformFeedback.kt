package de.dasbabypixel.gamelauncher.gles.es30

interface glIsTransformFeedback {
    /**
    * Name
    * ----
    * 
    * glIsTransformFeedback — determine if a name corresponds to a transform feedback object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsTransformFeedback**(` | GLuint id`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`id`_
    * 
    * Specifies a value that may be the name of a transform feedback object.
    * 
    * Description
    * -----------
    * 
    * `glIsTransformFeedback` returns `GL_TRUE` if _`id`_ is currently the name of a transform feedback object. If _`id`_ is zero, or if `id` is not the name of a transform feedback object, or if an error occurs, `glIsTransformFeedback` returns `GL_FALSE`. If _`id`_ is a name returned by [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks], but that has not yet been bound through a call to [glBindTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBindTransformFeedback.glBindTransformFeedback], then the name is not a transform feedback object and `glIsTransformFeedback` returns `GL_FALSE`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glIsTransformFeedback | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks], [glBindTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBindTransformFeedback.glBindTransformFeedback], [glDeleteTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glDeleteTransformFeedbacks.glDeleteTransformFeedbacks]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glIsTransformFeedback.glIsTransformFeedback
    */
    fun glIsTransformFeedback(id: UInt): Boolean
}