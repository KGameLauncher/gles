package de.dasbabypixel.gamelauncher.gles.es20

interface glPolygonOffset {
    /**
    * Name
    * ----
    * 
    * glPolygonOffset — set the scale and units used to calculate depth values
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glPolygonOffset**(` | GLfloat factor, |
    * | --- | --- |
    * |   | GLfloat units`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`factor`_
    * 
    * Specifies a scale factor that is used to create a variable depth offset for each polygon. The initial value is 0.
    * 
    * _`units`_
    * 
    * Is multiplied by an implementation-specific value to create a constant depth offset. The initial value is 0.
    * 
    * Description
    * -----------
    * 
    * When `GL_POLYGON_OFFSET_FILL` is enabled, each fragment's _depth_ value will be offset after it is interpolated from the _depth_ values of the appropriate vertices. The value of the offset is factor × DZ + r × units , where DZ is a measurement of the change in depth relative to the screen area of the polygon, and r is the smallest value that is guaranteed to produce a resolvable offset for a given implementation. The offset is added before the depth test is performed and before the value is written into the depth buffer.
    * 
    * `glPolygonOffset` is useful for applying decals.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled] with argument `GL_POLYGON_OFFSET_FILL`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_POLYGON_OFFSET_FACTOR` or `GL_POLYGON_OFFSET_UNITS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glPolygonOffset | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc], [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset
    */
    fun glPolygonOffset(factor: Float, units: Float)
}