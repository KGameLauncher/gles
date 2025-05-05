package de.dasbabypixel.gamelauncher.gles.es32

interface glGetGraphicsResetStatus {
    /**
    * Name
    * ----
    * 
    * glGetGraphicsResetStatus — check if the rendering context has not been lost due to software or hardware issues
    * 
    * C Specification
    * ---------------
    * 
    * | `GLenum **glGetGraphicsResetStatus**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * Certain events can result in a reset of the GL context. Such a reset causes all context state to be lost and requires the application to recreate all objects in the affected context.
    * 
    * `glGetGraphicsResetStatus` can return one of the following constants:
    * 
    * `GL_NO_ERROR`
    * 
    * Indicates that the GL context has not been in a reset state since the last call.
    * 
    * `GL_GUILTY_CONTEXT_RESET`
    * 
    * Indicates that a reset has been detected that is attributable to the current GL context.
    * 
    * `GL_INNOCENT_CONTEXT_RESET`
    * 
    * Indicates a reset has been detected that is not attributable to the current GL context.
    * 
    * `GL_UNKNOWN_CONTEXT_RESET`
    * 
    * Indicates a detected graphics reset whose cause is unknown.
    * 
    * If a reset status other than `GL_NO_ERROR` is returned and subsequent calls return `GL_NO_ERROR`, the context reset was encountered and completed. If a reset status is repeatedly returned, the context may be in the process of resetting.
    * 
    * Reset notification behavior is determined at context creation time, and may be queried by calling `glGetIntegerv` with the symbolic constant `GL_RESET_NOTIFICATION_STRATEGY`.
    * 
    * If the reset notification behavior is `GL_NO_RESET_NOTIFICATION`, then the implementation will never deliver notification of reset events, and `glGetGraphicsResetStatus` will always return `GL_NO_ERROR`.
    * 
    * If the behavior is `GL_LOSE_CONTEXT_ON_RESET`, a graphics reset will result in the loss of all context state, requiring the recreation of all associated objects. In this case `glGetGraphicsResetStatus` may return any of the values described above.
    * 
    * If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.
    * 
    * After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a `GL_CONTEXT_LOST` error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results), and will not block indefinitely or cause termination of the application. There are two important exceptions to this behavior:
    * 
    * *   `glGetError` and `glGetGraphicsResetStatus` behave normally following a graphics reset, so that the application can determine a reset has occurred, and when it is safe to destroy and re-create the context.
    * 
    * *   Any commands which might cause a polling application to block indefinitely will generate a `GL_CONTEXT_LOST` error, but will also return a value indicating completion to the application. Such commands include:
    * 
    *     *   `glGetSynciv` with pname `GL_SYNC_STATUS` ignores the other parameters and returns `GL_SIGNALED` in _`values`_.
        
    *     *   `glGetQueryObjectuiv` with pname `GL_QUERY_RESULT_AVAILABLE` ignores the other parameters and returns `TRUE` in _`params`_.
        
    * 
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetGraphicsResetStatus` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetError][de.dasbabypixel.gamelauncher.gles.es20.glGetError.glGetError] [glGetIntegerv][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv] [glGetSynciv][de.dasbabypixel.gamelauncher.gles.es30.glGetSynciv.glGetSynciv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2014 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetGraphicsResetStatus.glGetGraphicsResetStatus
    */
    fun glGetGraphicsResetStatus(): Int
}