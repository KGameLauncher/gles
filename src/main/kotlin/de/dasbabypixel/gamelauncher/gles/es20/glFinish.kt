package de.dasbabypixel.gamelauncher.gles.es20

interface glFinish {
    /**
    * Name
    * ----
    * 
    * glFinish — block until all GL execution is complete
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glFinish**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * `glFinish` does not return until the effects of all previously called GL commands are complete. Such effects include all changes to GL state, all changes to connection state, and all changes to the frame buffer contents.
    * 
    * Notes
    * -----
    * 
    * `glFinish` requires a round trip to the server.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glFinish | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFlush][de.dasbabypixel.gamelauncher.gles.es20.glFlush.glFlush]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glFinish.glFinish
    */
    fun glFinish()
}