package de.dasbabypixel.gamelauncher.gles.es32

interface glPopDebugGroup {
    /**
    * Name
    * ----
    * 
    * glPopDebugGroup — pop the active debug group
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glPopDebugGroup**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * `glPopDebugGroup` pops the active debug group. After popping a debug group, the GL will also generate a debug output message describing its cause based on the _`message`_ string, the source _`source`_, and an ID _`id`_ submitted to the corresponding [glPushDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPushDebugGroup.glPushDebugGroup] command. `GL_DEBUG_TYPE_PUSH_GROUP` and `GL_DEBUG_TYPE_POP_GROUP` share a single namespace for message _`id`_. _`severity`_ has the value `GL_DEBUG_SEVERITY_NOTIFICATION`. The _`type`_ has the value `GL_DEBUG_TYPE_POP_GROUP`. Popping a debug group restores the debug output volume control of the parent debug group.
    * 
    * Errors
    * ------
    * 
    * `GL_STACK_UNDERFLOW` is generated if an attempt is made to pop the default debug group from the stack.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_DEBUG_MESSAGE_LENGTH`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glPopDebugGroup` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glPushDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPushDebugGroup.glPushDebugGroup], [glObjectLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectLabel.glObjectLabel], [glObjectPtrLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectPtrLabel.glObjectPtrLabel].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glPopDebugGroup.glPopDebugGroup
    */
    fun glPopDebugGroup()
}