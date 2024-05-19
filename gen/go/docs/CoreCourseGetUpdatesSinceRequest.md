# CoreCourseGetUpdatesSinceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course id to check | 
**Filter** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Since** | **int32** | Check updates since this time stamp | 

## Methods

### NewCoreCourseGetUpdatesSinceRequest

`func NewCoreCourseGetUpdatesSinceRequest(courseid int32, since int32, ) *CoreCourseGetUpdatesSinceRequest`

NewCoreCourseGetUpdatesSinceRequest instantiates a new CoreCourseGetUpdatesSinceRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetUpdatesSinceRequestWithDefaults

`func NewCoreCourseGetUpdatesSinceRequestWithDefaults() *CoreCourseGetUpdatesSinceRequest`

NewCoreCourseGetUpdatesSinceRequestWithDefaults instantiates a new CoreCourseGetUpdatesSinceRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreCourseGetUpdatesSinceRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCourseGetUpdatesSinceRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCourseGetUpdatesSinceRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetFilter

`func (o *CoreCourseGetUpdatesSinceRequest) GetFilter() []map[string]interface{}`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *CoreCourseGetUpdatesSinceRequest) GetFilterOk() (*[]map[string]interface{}, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *CoreCourseGetUpdatesSinceRequest) SetFilter(v []map[string]interface{})`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *CoreCourseGetUpdatesSinceRequest) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetSince

`func (o *CoreCourseGetUpdatesSinceRequest) GetSince() int32`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *CoreCourseGetUpdatesSinceRequest) GetSinceOk() (*int32, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *CoreCourseGetUpdatesSinceRequest) SetSince(v int32)`

SetSince sets Since field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


