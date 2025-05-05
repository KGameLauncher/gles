package de.dasbabypixel.gamelauncher.gles.es20

interface glCullFace {
    /**
    * Name
    * ----
    * 
    * glCullFace — specify whether front- or back-facing polygons can be culled
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glCullFace**(` | GLenum mode`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`mode`_
    * 
    * Specifies whether front- or back-facing polygons are candidates for culling. Symbolic constants `GL_FRONT`, `GL_BACK`, and `GL_FRONT_AND_BACK` are accepted. The initial value is `GL_BACK`.
    * 
    * Description
    * -----------
    * 
    * `glCullFace` specifies whether front- or back-facing polygons are culled (as specified by _mode_) when polygon culling is enabled. Polygon culling is initially disabled. To enable and disable polygon culling, call the [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] commands with the argument `GL_CULL_FACE`.
    * 
    * [glFrontFace][de.dasbabypixel.gamelauncher.gles.es20.glFrontFace.glFrontFace] specifies which of the clockwise and counterclockwise polygons are front-facing and back-facing. See [glFrontFace][de.dasbabypixel.gamelauncher.gles.es20.glFrontFace.glFrontFace].
    * 
    * Notes
    * -----
    * 
    * If _`mode`_ is `GL_FRONT_AND_BACK`, no polygons are drawn, but other primitives such as points and lines are drawn.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not an accepted value.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled] with argument `GL_CULL_FACE`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_CULL_FACE_MODE`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glCullFace | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable], [glFrontFace][de.dasbabypixel.gamelauncher.gles.es20.glFrontFace.glFrontFace]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glCullFace.glCullFace
    */
    fun glCullFace(mode: Int)
}