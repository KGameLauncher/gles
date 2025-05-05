package de.dasbabypixel.gamelauncher.gles.es31

interface glDispatchCompute {
    /**
    * Name
    * ----
    * 
    * glDispatchCompute — launch one or more compute work groups
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDispatchCompute**(` | GLuint num\_groups\_x, |
    * | --- | --- |
    * |   | GLuint num\_groups\_y, |
    * |   | GLuint num\_groups\_z`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`num_groups_x`_
    * 
    * The number of work groups to be launched in the X dimension.
    * 
    * _`num_groups_y`_
    * 
    * The number of work groups to be launched in the Y dimension.
    * 
    * _`num_groups_z`_
    * 
    * The number of work groups to be launched in the Z dimension.
    * 
    * Description
    * -----------
    * 
    * `glDispatchCompute` launches one or more compute work groups. Each work group is processed by the active program object for the compute shader stage. While the individual shader invocations within a work group are executed as a unit, work groups are executed completely independently and in unspecified order. _`num_groups_x`_, _`num_groups_y`_ and _`num_groups_z`_ specify the number of local work groups that will be dispatched in the X, Y and Z dimensions, respectively.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if there is no active program for the compute shader stage.
    * 
    * `GL_INVALID_VALUE` is generated if any of _`num_groups_x`_, _`num_groups_y`_, or _`num_groups_z`_ is greater than or equal to the maximum work-group count for the corresponding dimension.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_COMPUTE_WORK_GROUP_COUNT`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glDispatchCompute` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDispatchComputeIndirect][de.dasbabypixel.gamelauncher.gles.es31.glDispatchComputeIndirect.glDispatchComputeIndirect].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glDispatchCompute.glDispatchCompute
    */
    fun glDispatchCompute(num_groups_x: UInt, num_groups_y: UInt, num_groups_z: UInt)
}