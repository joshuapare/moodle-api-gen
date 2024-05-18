# CoreCalendarGetCalendarAccessInformationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course to check, empty for site calendar events. | [optional] [default to 0]

## Methods

### NewCoreCalendarGetCalendarAccessInformationRequest

`func NewCoreCalendarGetCalendarAccessInformationRequest() *CoreCalendarGetCalendarAccessInformationRequest`

NewCoreCalendarGetCalendarAccessInformationRequest instantiates a new CoreCalendarGetCalendarAccessInformationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarAccessInformationRequestWithDefaults

`func NewCoreCalendarGetCalendarAccessInformationRequestWithDefaults() *CoreCalendarGetCalendarAccessInformationRequest`

NewCoreCalendarGetCalendarAccessInformationRequestWithDefaults instantiates a new CoreCalendarGetCalendarAccessInformationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreCalendarGetCalendarAccessInformationRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCalendarGetCalendarAccessInformationRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCalendarGetCalendarAccessInformationRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreCalendarGetCalendarAccessInformationRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


