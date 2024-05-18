# CoreCourseGetUpdatesSince200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Instances** | [**[]CoreCourseGetUpdatesSince200ResponseInstancesInner**](CoreCourseGetUpdatesSince200ResponseInstancesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCourseGetUpdatesSince200Response

`func NewCoreCourseGetUpdatesSince200Response(instances []CoreCourseGetUpdatesSince200ResponseInstancesInner, ) *CoreCourseGetUpdatesSince200Response`

NewCoreCourseGetUpdatesSince200Response instantiates a new CoreCourseGetUpdatesSince200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetUpdatesSince200ResponseWithDefaults

`func NewCoreCourseGetUpdatesSince200ResponseWithDefaults() *CoreCourseGetUpdatesSince200Response`

NewCoreCourseGetUpdatesSince200ResponseWithDefaults instantiates a new CoreCourseGetUpdatesSince200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstances

`func (o *CoreCourseGetUpdatesSince200Response) GetInstances() []CoreCourseGetUpdatesSince200ResponseInstancesInner`

GetInstances returns the Instances field if non-nil, zero value otherwise.

### GetInstancesOk

`func (o *CoreCourseGetUpdatesSince200Response) GetInstancesOk() (*[]CoreCourseGetUpdatesSince200ResponseInstancesInner, bool)`

GetInstancesOk returns a tuple with the Instances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstances

`func (o *CoreCourseGetUpdatesSince200Response) SetInstances(v []CoreCourseGetUpdatesSince200ResponseInstancesInner)`

SetInstances sets Instances field to given value.


### GetWarnings

`func (o *CoreCourseGetUpdatesSince200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCourseGetUpdatesSince200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCourseGetUpdatesSince200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCourseGetUpdatesSince200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


