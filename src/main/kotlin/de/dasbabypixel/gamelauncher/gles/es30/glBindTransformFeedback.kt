package de.dasbabypixel.gamelauncher.gles.es30

interface glBindTransformFeedback {
    /**
    * Name
    * ----
    * 
    * glBindTransformFeedback — bind a transform feedback object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindTransformFeedback**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint id`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target to which to bind the transform feedback object _`id`_. _`target`_ must be `GL_TRANSFORM_FEEDBACK`.
    * 
    * _`id`_
    * 
    * Specifies the name of a transform feedback object reserved by [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks].
    * 
    * Description
    * -----------
    * 
    * `glBindTransformFeedback` binds the transform feedback object with name _`id`_ to the current GL state. _`id`_ must be a name previously returned from a call to [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks]. If _`id`_ has not previously been bound, a new transform feedback object with name _`id`_ and initialized with the default transform state vector is created.
    * 
    * In the initial state, a default transform feedback object is bound and treated as a transform feedback object with a name of zero. If the name zero is subsequently bound, the default transform feedback object is again bound to the GL state.
    * 
    * While a transform feedback buffer object is bound, GL operations on the target to which it is bound affect the bound transform feedback object, and queries of the target to which a transform feedback object is bound return state from the bound object. When buffer objects are bound for transform feedback, they are attached to the currently bound transform feedback object. Buffer objects are used for transform feedback only if they are attached to the currently bound transform feedback object.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_TRANSFORM_FEEDBACK`.
    * 
    * `GL_INVALID_OPERATION` is generated if the transform feedback operation is active on the currently bound transform feedback object, and that operation is not paused.
    * 
    * `GL_INVALID_OPERATION` is generated if _`id`_ is not zero or the name of a transform feedback object returned from a previous call to [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks], or if such a name has been deleted by [glDeleteTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glDeleteTransformFeedbacks.glDeleteTransformFeedbacks].
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_TRANSFORM_FEEDBACK_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindTransformFeedback | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks], [glDeleteTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glDeleteTransformFeedbacks.glDeleteTransformFeedbacks], [glIsTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glIsTransformFeedback.glIsTransformFeedback], [glBeginTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback], [glPauseTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glPauseTransformFeedback.glPauseTransformFeedback], [glResumeTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glResumeTransformFeedback.glResumeTransformFeedback], [glEndTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glBindTransformFeedback.glBindTransformFeedback
    */
    fun glBindTransformFeedback(target: Int, id: UInt)
}