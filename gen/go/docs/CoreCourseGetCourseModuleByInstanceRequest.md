# CoreCourseGetCourseModuleByInstanceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Instance** | **int32** | The module instance id | [default to null]
**Module** | **string** | The module name | [default to "null"]

## Methods

### NewCoreCourseGetCourseModuleByInstanceRequest

`func NewCoreCourseGetCourseModuleByInstanceRequest(instance int32, module string, ) *CoreCourseGetCourseModuleByInstanceRequest`

NewCoreCourseGetCourseModuleByInstanceRequest instantiates a new CoreCourseGetCourseModuleByInstanceRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCourseModuleByInstanceRequestWithDefaults

`func NewCoreCourseGetCourseModuleByInstanceRequestWithDefaults() *CoreCourseGetCourseModuleByInstanceRequest`

NewCoreCourseGetCourseModuleByInstanceRequestWithDefaults instantiates a new CoreCourseGetCourseModuleByInstanceRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstance

`func (o *CoreCourseGetCourseModuleByInstanceRequest) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCourseGetCourseModuleByInstanceRequest) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCourseGetCourseModuleByInstanceRequest) SetInstance(v int32)`

SetInstance sets Instance field to given value.


### GetModule

`func (o *CoreCourseGetCourseModuleByInstanceRequest) GetModule() string`

GetModule returns the Module field if non-nil, zero value otherwise.

### GetModuleOk

`func (o *CoreCourseGetCourseModuleByInstanceRequest) GetModuleOk() (*string, bool)`

GetModuleOk returns a tuple with the Module field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModule

`func (o *CoreCourseGetCourseModuleByInstanceRequest) SetModule(v string)`

SetModule sets Module field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


