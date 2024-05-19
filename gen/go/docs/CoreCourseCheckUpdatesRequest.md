# CoreCourseCheckUpdatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course id to check | [default to null]
**Filter** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Tocheck** | [**[]CoreCourseCheckUpdatesRequestTocheckInner**](CoreCourseCheckUpdatesRequestTocheckInner.md) |  | 

## Methods

### NewCoreCourseCheckUpdatesRequest

`func NewCoreCourseCheckUpdatesRequest(courseid int32, tocheck []CoreCourseCheckUpdatesRequestTocheckInner, ) *CoreCourseCheckUpdatesRequest`

NewCoreCourseCheckUpdatesRequest instantiates a new CoreCourseCheckUpdatesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseCheckUpdatesRequestWithDefaults

`func NewCoreCourseCheckUpdatesRequestWithDefaults() *CoreCourseCheckUpdatesRequest`

NewCoreCourseCheckUpdatesRequestWithDefaults instantiates a new CoreCourseCheckUpdatesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreCourseCheckUpdatesRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCourseCheckUpdatesRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCourseCheckUpdatesRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetFilter

`func (o *CoreCourseCheckUpdatesRequest) GetFilter() []map[string]interface{}`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *CoreCourseCheckUpdatesRequest) GetFilterOk() (*[]map[string]interface{}, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *CoreCourseCheckUpdatesRequest) SetFilter(v []map[string]interface{})`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *CoreCourseCheckUpdatesRequest) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetTocheck

`func (o *CoreCourseCheckUpdatesRequest) GetTocheck() []CoreCourseCheckUpdatesRequestTocheckInner`

GetTocheck returns the Tocheck field if non-nil, zero value otherwise.

### GetTocheckOk

`func (o *CoreCourseCheckUpdatesRequest) GetTocheckOk() (*[]CoreCourseCheckUpdatesRequestTocheckInner, bool)`

GetTocheckOk returns a tuple with the Tocheck field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTocheck

`func (o *CoreCourseCheckUpdatesRequest) SetTocheck(v []CoreCourseCheckUpdatesRequestTocheckInner)`

SetTocheck sets Tocheck field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


