# MoodleClient.Model.CoreFiltersGetAvailableInContext200ResponseFiltersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | **int** | The context id. | [optional] [default to null]
**Contextlevel** | **string** | The context level where the filters are:                                 (coursecat, course, module). | [optional] [default to "null"]
**Filter** | **string** | Filter plugin name. | [optional] [default to "null"]
**Inheritedstate** | **int** | 1 or 0 to use when localstate is set to inherit. | [optional] [default to null]
**Instanceid** | **int** | The instance id of item associated with the context. | [optional] 
**Localstate** | **int** | Filter state: 1 for on, -1 for off, 0 if inherit. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

