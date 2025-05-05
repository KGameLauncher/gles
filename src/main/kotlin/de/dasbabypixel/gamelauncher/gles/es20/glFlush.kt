package de.dasbabypixel.gamelauncher.gles.es20

interface glFlush {
    /**
    * Name
    * ----
    * 
    * glFlush — force execution of GL commands in finite time
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glFlush**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * Different GL implementations buffer commands in several different locations, including network buffers and the graphics accelerator itself. `glFlush` empties all of these buffers, causing all issued commands to be executed as quickly as they are accepted by the actual rendering engine. Though this execution may not be completed in any particular time period, it does complete in finite time.
    * 
    * Because any GL program might be executed over a network, or on an accelerator that buffers commands, all programs should call `glFlush` whenever they count on having all of their previously issued commands completed. For example, call `glFlush` before waiting for user input that depends on the generated image.
    * 
    * Notes
    * -----
    * 
    * `glFlush` can return at any time. It does not wait until the execution of all previously issued GL commands is complete.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glFlush | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFinish][de.dasbabypixel.gamelauncher.gles.es20.glFinish.glFinish]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glFlush.glFlush
    */
    fun glFlush()
}