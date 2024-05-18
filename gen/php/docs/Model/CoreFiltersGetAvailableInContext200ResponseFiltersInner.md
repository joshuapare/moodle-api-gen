# # CoreFiltersGetAvailableInContext200ResponseFiltersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id. | [optional] [default to null]
**contextlevel** | **string** | The context level where the filters are:                                 (coursecat, course, module). | [optional] [default to 'null']
**filter** | **string** | Filter plugin name. | [optional] [default to 'null']
**inheritedstate** | **int** | 1 or 0 to use when localstate is set to inherit. | [optional] [default to null]
**instanceid** | **int** | The instance id of item associated with the context. | [optional]
**localstate** | **int** | Filter state: 1 for on, -1 for off, 0 if inherit. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
