# CoreCourseCheckUpdatesRequestTocheckInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextlevel** | Pointer to **string** | The context level for the file location.                                                                                 Only module supported right now. | [optional] [default to "null"]
**Id** | Pointer to **int32** | Context instance id | [optional] [default to null]
**Since** | Pointer to **int32** | Check updates since this time stamp | [optional] [default to null]

## Methods

### NewCoreCourseCheckUpdatesRequestTocheckInner

`func NewCoreCourseCheckUpdatesRequestTocheckInner() *CoreCourseCheckUpdatesRequestTocheckInner`

NewCoreCourseCheckUpdatesRequestTocheckInner instantiates a new CoreCourseCheckUpdatesRequestTocheckInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseCheckUpdatesRequestTocheckInnerWithDefaults

`func NewCoreCourseCheckUpdatesRequestTocheckInnerWithDefaults() *CoreCourseCheckUpdatesRequestTocheckInner`

NewCoreCourseCheckUpdatesRequestTocheckInnerWithDefaults instantiates a new CoreCourseCheckUpdatesRequestTocheckInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextlevel

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetId

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetSince

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) GetSince() int32`

GetSince returns the Since field if non-nil, zero value otherwise.

### GetSinceOk

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) GetSinceOk() (*int32, bool)`

GetSinceOk returns a tuple with the Since field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSince

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) SetSince(v int32)`

SetSince sets Since field to given value.

### HasSince

`func (o *CoreCourseCheckUpdatesRequestTocheckInner) HasSince() bool`

HasSince returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


