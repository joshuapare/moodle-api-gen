# CoreCalendarGetCalendarUpcomingViewRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | Category being viewed | [optional] 
**Courseid** | Pointer to **int32** | Course being viewed | [optional] [default to 1]

## Methods

### NewCoreCalendarGetCalendarUpcomingViewRequest

`func NewCoreCalendarGetCalendarUpcomingViewRequest() *CoreCalendarGetCalendarUpcomingViewRequest`

NewCoreCalendarGetCalendarUpcomingViewRequest instantiates a new CoreCalendarGetCalendarUpcomingViewRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarUpcomingViewRequestWithDefaults

`func NewCoreCalendarGetCalendarUpcomingViewRequestWithDefaults() *CoreCalendarGetCalendarUpcomingViewRequest`

NewCoreCalendarGetCalendarUpcomingViewRequestWithDefaults instantiates a new CoreCalendarGetCalendarUpcomingViewRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreCalendarGetCalendarUpcomingViewRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


