package de.dasbabypixel.gamelauncher.gles.es31

interface glDispatchComputeIndirect {
    /**
    * Name
    * ----
    * 
    * glDispatchComputeIndirect — launch one or more compute work groups using parameters stored in a buffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDispatchComputeIndirect**(` | GLintptr indirect`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`indirect`_
    * 
    * The offset into the buffer object currently bound to the `GL_DISPATCH_INDIRECT_BUFFER` buffer target at which the dispatch parameters are stored.
    * 
    * Description
    * -----------
    * 
    * `glDispatchComputeIndirect` launches one or more compute work groups using parameters stored in the buffer object currently bound to the `GL_DISPATCH_INDIRECT_BUFFER` target. Each work group is processed by the active program object for the compute shader stage. While the individual shader invocations within a work group are executed as a unit, work groups are executed completely independently and in unspecified order. _`indirect`_ contains the offset into the data store of the buffer object bound to the `GL_DISPATCH_INDIRECT_BUFFER` target at which the parameters are stored.
    * 
    * The parameters addressed by _`indirect`_ are packed a structure, which takes the form (in C):
    * 
    *     typedef  struct {
    *         uint  num\_groups\_x;
    *         uint  num\_groups\_y;
    *         uint  num\_groups\_z;
    *     } DispatchIndirectCommand;
    * 
    * A call to `glDispatchComputeIndirect` is equivalent, assuming no errors are generated, to:
    * 
    *     cmd = (const DispatchIndirectCommand  \*)indirect;
    *     glDispatchCompute(cmd->num\_groups\_x, cmd->num\_groups\_y, cmd->num\_groups\_z);
    *     }
    * 
    * Unlike [glDispatchCompute][de.dasbabypixel.gamelauncher.gles.es31.glDispatchCompute.glDispatchCompute], no error is generated if any of the `num_groups_x`, `num_groups_y` or `num_groups_z` members of the `DispatchIndirectCommand` is larger than the value of `GL_MAX_COMPUTE_WORK_GROUP_COUNT` for the corresponding dimension. In such circumstances, behavior is undefined and may lead to application termination.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if there is no active program for the compute shader stage.
    * 
    * `GL_INVALID_VALUE` is generated if _`indirect`_ is less than zero or not a multiple of four.
    * 
    * `GL_INVALID_OPERATION` is generated if no buffer is bound to the `GL_DISPATCH_INDIRECT_BUFFER` target or if the command would source data beyond the end of the buffer object's data store.
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
    * | `glDispatchComputeIndirect` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDispatchCompute][de.dasbabypixel.gamelauncher.gles.es31.glDispatchCompute.glDispatchCompute].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glDispatchComputeIndirect.glDispatchComputeIndirect
    */
    fun glDispatchComputeIndirect(indirect: Long)
}